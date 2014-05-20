package Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

//import com.sshtools.j2ssh.FileTransferProgress;
import com.sshtools.j2ssh.SshClient;
import com.sshtools.j2ssh.authentication.AuthenticationProtocolState;
import com.sshtools.j2ssh.authentication.PasswordAuthenticationClient;
import com.sshtools.j2ssh.SftpClient;
import java.lang.management.ManagementFactory;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.management.MBeanServer;
import javax.management.ObjectName;


public class MainTest {

    ThreadPoolExecutor threadController;

    public MainTest(final String host, final String username, final String password) throws Exception {

      threadController = new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

      // Make a client connection
      SshClient ssh = new SshClient();
      SftpClient sftp = connect(ssh, host, username, password);
      // Evaluate the result
      if (sftp != null) {

            // Change directory
            sftp.cd("/misc/raid2/IASI/L1C/2007/06/29");
            System.out.println(sftp.pwd());

            //get list of files
            Vector<com.sshtools.j2ssh.sftp.SftpFile> files = (Vector<com.sshtools.j2ssh.sftp.SftpFile>) sftp.ls();

            //download all files in list
            for (final com.sshtools.j2ssh.sftp.SftpFile file : files) {

                //skip unwanted directories
                if (file.getFilename().equals(".") || file.getFilename().equals(".."))
                    continue;

                // create local file
                final File newFile = new File("/Users/bfoster/JunkDump/" + file.getFilename());
                newFile.createNewFile();

                //tell threadpool to start downloading file
                threadController.execute(new Runnable() {

                    public void run() {
                        try {
                            //connect
                            SshClient ssh = new SshClient();
                            SftpClient sftp = connect(ssh, host, username, password);

                            if (sftp == null) {
                                ssh.disconnect();
                                return;
                            }

                            //create progress tracker

                            //download file
                            sftp.get("/misc/raid2/IASI/L1C/2007/06/29/" + file.getFilename(), newFile.getAbsolutePath());

                            //disconnect
                            sftp.quit();
                            ssh.disconnect();
                        }catch(Exception e) {
                            System.out.println("Failed to download file: /misc/raid2/IASI/L1C/2007/06/29/" + file.getFilename());
                        }
                    }

                });
            }

            // Quit
            sftp.quit();
            ssh.disconnect();
        }
    }

    private SftpClient connect(SshClient ssh, String host, String username, String password) throws IOException {
        // Connect to the host
        ssh.connect(host);

         // log in
         PasswordAuthenticationClient pwd = new PasswordAuthenticationClient();
         pwd.setUsername(username);
        pwd.setPassword(password);
        int result = ssh.authenticate(pwd);

        //create sftp client
        SftpClient sftp = null;
        if (result == AuthenticationProtocolState.COMPLETE)
            sftp = ssh.openSftpClient();

        return sftp;
    }

    public static void main(String[] args) {

        try {

            MainTest mt = new MainTest(args[0], args[1], args[2]);

            try {
                //registry MainTest as MBean so it can be used with jconsole
                MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
                ObjectName name = new ObjectName("src:type=MainTest");
                mbs.registerMBean(mt, name);
            }catch (Exception e) {
                System.out.println("Burnt the beans!!!!!");
            }
        }catch (Exception e) {}

    }

}
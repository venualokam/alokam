package Util;

import com.sshtools.j2ssh.SftpClient;
import com.sshtools.j2ssh.SshClient;
import com.sshtools.j2ssh.authentication.AuthenticationProtocolState;
import com.sshtools.j2ssh.authentication.PasswordAuthenticationClient;
import com.sshtools.j2ssh.sftp.SftpFile;
import com.sshtools.j2ssh.sftp.SftpFileInputStream;
import com.sshtools.j2ssh.sftp.SftpSubsystemClient;
import com.sshtools.j2ssh.transport.IgnoreHostKeyVerification;
import org.apache.log4j.Logger;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 5/28/13
 * Time: 11:20 AM
 */
public class SecureFTPGatewayImpl {
        private String server;
        private String username;
        private String password;
        private String path;
        private String filename;
        private String rename;
        private String content;
        private String encoding = "UTF-8";
        private InputStream uploadStream;
        private boolean passiveFTPMode = false;
        private String fileType;
      //  private static Logger logger = Logger.getLogger(SecureFTPGatewayImpl.class);

        public SecureFTPGatewayImpl() {
        }

        public SecureFTPGatewayImpl( String server,String username,String password ) {
            setServer(server);
            setUsername(username);
            setPassword(password);
        }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getRename() {
            return rename;
        }

        public void setRename(String rename) {
            this.rename = rename;
        }

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getServer() {
            return server;
        }

        public void setServer(String server) {
            this.server = server;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

         public void setPassiveFTPMode(boolean passiveFTPMode){
             if(passiveFTPMode)
                 this.passiveFTPMode = true;
         }

        public void setFileType(String fileType){
                 this.fileType = fileType;
        }

        public void send() throws Exception
        {
            try
            {
                this.send_inner( new ByteArrayInputStream(this.content.getBytes(this.encoding)) );
            }
            catch( UnsupportedEncodingException uee )
            {
                uee.printStackTrace();
               System.out.println("Unsupported Encoding while trying to sftp a file: ");
            }
        }

        private void send_inner(InputStream is) throws Exception {
            String debugString = null;
            SshClient ssh = new SshClient();
            SftpClient ftp = null;
            PasswordAuthenticationClient pwd = new PasswordAuthenticationClient();

            try
            {
                debugString = "Attempting ssh connect to " + this.server;
                 System.out.println(debugString);

                if (server.contains(":"))
                {
                    String [] serverParams = this.server.split("\\:");
                    ssh.connect(serverParams[0],Integer.parseInt(serverParams[1]),new IgnoreHostKeyVerification());
                }
                else
                {
                    ssh.connect(this.server,new IgnoreHostKeyVerification());
                }

                pwd.setUsername(this.username);
                pwd.setPassword(this.password);

                debugString = "Attempting to authenticate user 11111111 " + this.username;
                 System.out.println(debugString);

                int result = ssh.authenticate(pwd);

                if (result == AuthenticationProtocolState.COMPLETE)
                {
                    ftp = ssh.openSftpClient();

                    if( ftp != null )
                    {
                        if (this.path != null)
                        {
                            try
                            {
                                ftp.cd(this.path);
                            }
                            catch(Exception e)
                            {
                                throw new Exception("Error changing directory to " + this.path,e);
                            }
                        }

                        debugString = "Attempting to write the file " + this.filename;
                        System.out.println( debugString );

                        ftp.put(is,this.filename);
                            //   ftp.transferFile()
                        if( this.rename != null && this.rename.length() > 0 )
                        {
                            debugString = "Attempting to rename " + this.filename + " to " + this.rename;
                             System.out.println( debugString );
                            ftp.rename(this.filename, this.rename);
                        }
                    }
                    else
                    {
                        throw new Exception( "Failed to establish an sftp connection [" + this.username + " on " + this.server + "]" );
                    }
                }
                else
                {
                    throw new Exception( "Failed to authenticate " + this.username + " on " + this.server + "!!!" );
                }
            }
            catch( Exception ftpe )
            {
                ftpe.printStackTrace();
                 System.out.println("Caught an FTPException while: " );
                throw ftpe;
            }

            finally
            {
                try
                {
                    if( ftp != null )
                        ftp.quit();
                    if( ssh != null )
        			    ssh.disconnect();
                }
                catch( IOException ioe2 )
                {
                    throw new Exception( "Exception while closing connection", ioe2 );
                }
            }
        }

    public void downlodFiles() throws Exception{

             String debugString = null;
            SshClient ssh = new SshClient();
            SftpClient ftp = null;
            PasswordAuthenticationClient pwd = new PasswordAuthenticationClient();

            try
            {
                debugString = "Attempting ssh connect to " + this.server;
                 System.out.println(debugString);

                if (server.contains(":"))
                {
                    String [] serverParams = this.server.split("\\:");
                    ssh.connect(serverParams[0],Integer.parseInt(serverParams[1]),new IgnoreHostKeyVerification());
                }
                else
                {
                    ssh.connect(this.server,new IgnoreHostKeyVerification());
                }

                pwd.setUsername(this.username);
                pwd.setPassword(this.password);

                debugString = "Attempting to authenticate user 11111111 " + this.username;
                System.out.println(debugString);
                int result = ssh.authenticate(pwd);

                if (result == AuthenticationProtocolState.COMPLETE){
                    ftp = ssh.openSftpClient();
                    ftp.cd(this.path);
                    System.out.println("9999999999----------"+ftp.pwd());
                    //download all files in list
                    for ( com.sshtools.j2ssh.sftp.SftpFile file : (Vector<SftpFile>) ftp.ls()) {
                                //skip unwanted directories
                        if (file.getFilename().equals(".") || file.getFilename().equals(".."))
                            continue;
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            try {
                                //download file
                                ftp.get(this.path + file.getFilename(), outputStream);
                                outputStream.flush();
                                InputStream in = new ByteArrayInputStream(outputStream.toByteArray());
                                String bb=      getStringFromInputStream(in);
                                System.out.println(bb);
                               // StringTokenizer st=new StringTokenizer(bb,"\n");
                               ftp.put( in,"/home/venu/processded/"+file.getFilename());
                                String bbb=      getStringFromInputStream(in);
                                  System.out.println(bbb);
                               /* while (st.hasMoreTokens()) {
                                                    String eticketLines=st.nextToken();
                                     StringTokenizer stb=new StringTokenizer(eticketLines,"|");
                                      while (stb.hasMoreTokens()) {
                                          String firstName= stb.nextToken();
                                          if("Applicant First Name".equalsIgnoreCase(firstName))
                                          break;
                                               System.out.println("e4eeeeeeeeee-------"+firstName);
                                      }
                                                }*/
                            //    ftp.rm(this.path + file.getFilename());
                            }catch(Exception e) {
                                e.printStackTrace();
                                System.out.println("Failed to download file: "+this.path + file.getFilename());
                            }

                      }
                }
            } catch(Exception ex){
                ex.printStackTrace();
            }

    }
        private static String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
                sb.append("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}


        public void uploadStoredFile(String sourceFile) throws Exception
        {
            try
            {
                this.send_inner( new FileInputStream( sourceFile ) );
            }
            catch( FileNotFoundException fnf )
            {
                throw new Exception( "Could not find file \"" + sourceFile + "\" for upload", fnf );
            }
        }
}

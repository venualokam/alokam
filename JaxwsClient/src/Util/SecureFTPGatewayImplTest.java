package Util;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 6/6/13
 * Time: 3:40 PM
 */
public class SecureFTPGatewayImplTest {

    public static void main(String [] args){
        try{
              SecureFTPGatewayImpl ss=new SecureFTPGatewayImpl("192.168.175.129","venu","venu");
         //   ss.setFilename("test.txt");
            ss.setPath("/home/venu/home/");
            ss.downlodFiles();
         //   ss.uploadStoredFile("D:\\test.txt");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

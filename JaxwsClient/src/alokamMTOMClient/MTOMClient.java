package alokamMTOMClient;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 28 Jul, 2011
 * Time: 5:56:34 PM

 */
import javax.xml.ws.soap.MTOMFeature;
public class MTOMClient {
  public static void main(String[] args) {
    String FOO = "7777745656";
    MtomService service = new MtomService() ;
    MtomPortType port = service.getMtomPortTypePort(new MTOMFeature());
    String result;
    result = port.echoBinaryAsString(FOO.getBytes());
    System.out.println( "Got result: " + result );
  }
}
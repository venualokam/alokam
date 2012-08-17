package asyanchronusWEBService;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 4/30/12
 * Time: 1:01 PM
 */

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.soap.Addressing;



/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 4/30/12
 * Time: 12:56 PM

 */
@WebService
@Addressing
public class HelloImpl implements Hello {

    @WebMethod()
    @Oneway()
    public void sayHello(String name) {
        System.out.println("ALOKAM --------------");
    }

    @WebMethod()
    @Oneway()
    public void callbackMessage(String msg) {
    }
}
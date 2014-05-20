package mypackage;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 4/30/12
 * Time: 1:14 PM

 */
public class AsyanchronusWEBServiceClient {
  public static void main(String[] argv) {
    HelloImplService helloImplService=  new HelloImplService();
       HelloImpl service = helloImplService.getHelloImplPort();
          System.out.println("WSDL Host: " + helloImplService.getWSDLDocumentLocation().getHost());
			System.out.println("WSDL Path: " + helloImplService.getWSDLDocumentLocation().getPath());
    String endpointURL ="http://localhost:9090/test/services/HelloService";
			BindingProvider bp = (BindingProvider)service;
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);
   //   HelloImpl service = new HelloImplService(url, new QName("http://asyanchronusWEBService/", "HelloImplService")).getHelloImplPort();

      service.sayHello("ALokam666666666666666");
  }
}
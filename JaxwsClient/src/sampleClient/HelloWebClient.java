package sampleClient;/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/6/12
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */


import com.sun.xml.ws.client.BindingProviderProperties;

import javax.xml.rpc.Stub;
import javax.xml.ws.BindingProvider;

public class HelloWebClient {
  public static void main(String[] argv) {
      HelloWorld service = new HelloWorldService().getHelloWorldSoapPort();
      System.out.println(service.getClass());
 /*     ((Stub)service)._setProperty("weblogic.wsee.transport.connection.timeout",2);
((Stub)service)._setProperty("weblogic.wsee.transport.read.timeout",2);*/

       ((BindingProvider) service).getRequestContext().put(BindingProviderProperties.REQUEST_TIMEOUT,0);
    ((BindingProvider) service).getRequestContext().put(BindingProviderProperties.CONNECT_TIMEOUT,0);
      service.hello();
  }
}
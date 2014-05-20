package sampleSession;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/5/12
 * Time: 3:36 PM
 */
public class HelloClient {
    static {
            //for localhost testing only
            javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
            new javax.net.ssl.HostnameVerifier(){

                public boolean verify(String hostname,
                        javax.net.ssl.SSLSession sslSession) {
                    if (hostname.equals("localhost")) {
                        return true;
                    }
                    return false;
                }
            });
        }



    public static void main(String[] argv) {
      Hello service = new HelloService().getHelloPort();
    ((BindingProvider)service).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);

      Map<String, Object> req_ctx = ((BindingProvider)service).getRequestContext();
    req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://localhost:8443/test/services/Hello");
    Map<String, List<String>> headers = new HashMap<String, List<String>>();
    headers.put("Username", Collections.singletonList("ALOKAM1"));
    headers.put("Password", Collections.singletonList("ISHITA1"));
    req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

    String result = service.printSessionInfo();
    System.out.println(result);
    result = service.printSessionInfo();
    System.out.println(result);

      int response= service.getCounter();
      System.out.println("3434==="+response);
  }
}
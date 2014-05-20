package sampleSession;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/5/12
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class HelloWorldClient{

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

	public static void main(String[] args) throws Exception {

	URL url = new URL("http://localhost:9090/test/services/Hello?wsdl");
        QName qname = new QName("http://server.session/", "HelloService");

        Service service = Service.create(url, qname);
        Hello hello = service.getPort(Hello.class);
        System.out.println(hello.getCounter());

    }
}
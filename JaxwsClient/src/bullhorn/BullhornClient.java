package bullhorn;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import java.net.URL;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/10/12
 * Time: 11:32 AM
 */
public class BullhornClient {
     /* private static com.bullhorn.apiservice.ApiService_Service Bservice = null;
	private static com.bullhorn.apiservice.ApiService Bport = null;
     private final static QName APISERVICE_QNAME = new QName("http://apiservice.bullhorn.com/", "ApiService");
    private  static URL APISERVICE_WSDL_LOCATION;

    public static void main (String args[]){
        try {
            APISERVICE_WSDL_LOCATION = com.bullhorn.apiservice.ApiService_Service.class.getResource("/WSDL/Bullhorn.wsdl");
            Bservice = new com.bullhorn.apiservice.ApiService_Service(APISERVICE_WSDL_LOCATION,APISERVICE_QNAME);
			if (Bservice != null)
				Bport = Bservice.getApiServicePort();
                com.bullhorn.apiservice.session.ApiSession session= Bport.startSession("pridestaff.fadv","maroon36","08487B35-CD4C-C5B3-4BA0E3E0A77C3E62");
                     Map<String, Object> req_ctx = ((BindingProvider)Bport).getRequestContext();
                req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://api.bullhornstaffing.com/webservices-1.1/");
               System.out.println((new StringBuilder()).append("Result = ").append(session.getUserId()).toString());

		}
		catch( Exception e ) {
           e.printStackTrace();
			throw new RuntimeException(e);
		}

    }*/
}

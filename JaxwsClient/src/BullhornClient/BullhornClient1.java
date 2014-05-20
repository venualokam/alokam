package BullhornClient;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/10/12
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.Calendar;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/10/12
 * Time: 4:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class BullhornClient1 {
         /* private static com.bullhorn.apiservice.ApiService_Service Bservice = null;
	        private static com.bullhorn.apiservice.ApiService Bport = null;
      private static ApiService_Service Bservice1 = null;
     private final static QName APISERVICE_QNAME = new QName("http://apiservice.bullhorn.com/", "ApiService");
    private  static URL APISERVICE_WSDL_LOCATION;
	private static ApiService Bport1 = null;
    public static void main (String args[]){
        try {
             long tomestart= Calendar.getInstance().getTimeInMillis();
            System.out.println("ALOKAM VENU========="+tomestart);
                      // APISERVICE_WSDL_LOCATION = com.bullhorn.apiservice.ApiService_Service.class.getResource("/META-INF/wsdl/api.bullhornstaffing.com/webservices-1.1/.wsdl");
		    Bservice1 = new ApiService_Service();
			if (Bservice1 != null)
				Bport1 = Bservice1.getApiServicePort();
              System.out.println("alokam venu 11"+Bport1.toString());

             long tomeEnd= Calendar.getInstance().getTimeInMillis();
                    System.out.println("ALOKAM VENU=== 333333======"+(tomeEnd-tomestart));
            Bport1.startSession("pridestaff.fadv","maroon36","08487B35-CD4C-C5B3-4BA0E3E0A77C3E62");
                System.out.println("alokam venu"+Bport1.toString());
         *//*System.out.println(APISERVICE_WSDL_LOCATION);
            long tomestart= Calendar.getInstance().getTimeInMillis();
            System.out.println("ALOKAM VENU========="+tomestart);
             Bservice = new com.bullhorn.apiservice.ApiService_Service(APISERVICE_WSDL_LOCATION,APISERVICE_QNAME);
			if (Bservice != null)
				Bport = Bservice.getApiServicePort();
                Map<String, Object> req_ctx = ((BindingProvider)Bport).getRequestContext();
               // req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://api.bullhornstaffing.com/webservices-1.1/");
                System.out.println("alokam venu"+Bport.toString());
                 long tomeEnd= Calendar.getInstance().getTimeInMillis();
                    System.out.println("ALOKAM VENU=== 333333======"+(tomeEnd-tomestart));*//*
		}
		catch( Exception e ) {
           e.printStackTrace();
			throw new RuntimeException(e);
		}

    }*/
}



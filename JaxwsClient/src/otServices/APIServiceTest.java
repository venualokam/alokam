package otServices;

import com.skillcheck.web_management.services.ApiService;
import com.skillcheck.web_management.services.ApiService_Service;
import com.skillcheck.web_management.services.Statistics;
import com.skillcheck.web_management.services.StatisticsService;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/30/13
 * Time: 3:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class APIServiceTest {
     public static void main(String[] argv) {
      ApiService service = new ApiService_Service().getApiServiceSoapPort();
     String s= service.getETicket("MARC3C","Passw0rd!");
      System.out.print(s);
  }
}

package otServices;

import com.skillcheck.web_management.services.ApiService;
import com.skillcheck.web_management.services.ApiService_Service;
import com.skillcheck.web_management.services.LicenseActivation;
import com.skillcheck.web_management.services.LicenseActivationService;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/30/13
 * Time: 3:28 PM

 */
public class LicenseTest {
     public static void main(String[] argv) {
      LicenseActivation service = new LicenseActivationService().getLicenseActivationSoapPort();
     String s= service.isLicenseAvailable("licenseActivationAdmin","lksAJFgjh348597kjMfh79Z22LuP","zxczxc");
      System.out.print(s);
  }
}

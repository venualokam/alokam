package otServices;

import com.skillcheck.web_management.services.AuthenticationService;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 7/25/12
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Alokamtest {
  public static void main(String[] argv) {
      com.skillcheck.web_management.services.Authentication service = new AuthenticationService().getAuthenticationSoapPort();
     String s= service.authenticate("Administrator","Passw0rd!","SKILLCHECK");
      System.out.print(s);
  }
}
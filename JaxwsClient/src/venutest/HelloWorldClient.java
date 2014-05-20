/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 21 Jun, 2011
 * Time: 6:31:13 PM

 */
package venutest;

import javax.xml.ws.soap.MTOMFeature;

public class HelloWorldClient {
  public static void main(String[] argv) {
      HelloWorld service = new HelloWorldService().getHelloWorldPort();
       // MtomSample proxy = service.getPort(portName, MtomSample.class);
  
     ObjectFactory fadvFactory= new ObjectFactory();
      User user=fadvFactory.createUser();
      user.setFirstName("alokam");
      user.setLastName("venu");
      user.setUserName("VenuAlokam");
      Alokamvenu say=fadvFactory.createAlokamvenu();
      say.setUserName("ALOKAM VENU");
      AlokamvenuResponse response= service.alokamvenu(say,user);
      System.out.println("3434==="+response.getUserResponse().getEmailAddress());
  }
}
/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 21 Jun, 2011
 * Time: 4:35:14 PM
 */
package example;

import example.user.User;
import example.user.UserResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.*;


@WebService()
public class HelloWorld {
  @WebMethod(operationName = "alokamvenu",action = "alokamvenu" )
  @WebResult(name = "UserResponse", targetNamespace = "http://www.hr-xml.org/3", partName = "Message")
  
  public UserResponse sayHelloWorldFrom( @WebParam(name = "user",mode = WebParam.Mode.IN,header =true) User user,
                                         @WebParam(name = "userName",mode = WebParam.Mode.IN) String userName) {
    UserResponse result=new UserResponse();  
    result.setUserName( user.getUserName());
    result.setLastName(user.getLastName());
    result.setFirstName(user.getFirstName());
    result.setEmailAddress( "Alokam@adlokdm.com");
    System.out.println(result);
    return result;
  }
 
    }
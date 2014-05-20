package Util;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 4/4/12
 * Time: 3:03 PM
 * To change this template use File | Settings | File Templates.
 */
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

/**
 * <p> This simple jaas application attempts to authenticate a user
 * and reports whether or not the authentication was successful.
 *
 * <p> To run this you need a couple of things:
 * <ul>
 *   <li> -Djava.security.auth.login.config==ack_jaas.config tells the LoginContext
 *   which class to use to perform the authentication against, it contains:
 *   <pre>
 *  Acknowledge {
 *    com.ack.security.jaas.module.SimpleLoginModule required debug=true;
 * };
 *   </pre>
 *
 *   <li> you are going to need <code>xxx</code> and
 *   <code>SimpleLoginModule</code> in your class path
 *   <li> finally, the <code>JaasLoginCallbackHandler</code> is a class that enables the
 *   programmer to specify a class that captures the username and password,
 *   that is used by the authentication implementation, e.g. <code>SimpleLoginModule</code>.
 * </ul>
 *
 */
public class JaasAuthentication {

  public static void main(String[] args) {
    // Obtain a LoginContext, needed for authentication. Tell it
    // to use the LoginModule implementation specified by the
    // entry named "xxx" in the JAAS login configuration
    // file and to also use the specified CallbackHandler.
    LoginContext lc = null;
    try {
      lc = new LoginContext("RanchLogin", new JaasLoginCallbackHandler());
    }
    catch( LoginException le ) {
      System.err.println("Cannot create LoginContext 111. " + le.getMessage());
    }
    catch( SecurityException se ) {
      System.err.println("Cannot create LoginContext. 222" + se.getMessage());
       se.printStackTrace();
    }
    finally {
      if( lc == null ) {
        System.exit(-1);
      }
    }

    // attempt authentication
    try {
      lc.login();
      System.out.println("Authentication succeeded!");
    }
    catch( LoginException le ) {
      System.err.println("Authentication failed:\n" + "  " + le.getMessage());
    }
  }
}

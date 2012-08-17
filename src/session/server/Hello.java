package session.server;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/5/12
 * Time: 3:19 PM

 */
import javax.jws.*;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.MessageContext;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@WebService
public class Hello {
    /**
     * WebServiceContext is injected by the JAX-WS Runtime
     */
    @Resource
    private WebServiceContext wsContext;
    private Set<String> clients;	// For storing our session ids from clients

    /**
     * another way to inject WebServiceContext
     * make sure this is not a WebMethod
     *
     */
    /*
     @WebMethod(exclude = true)
     @Resource public void initializeContext(WebServiceContext wsContext) {
     System.out.println("Setting WebServiceContext");
     this.wsContext = wsContext;
     }
    */
     @WebMethod
    public int getCounter() {
        MessageContext mc = wsContext.getMessageContext();
        HttpSession session = ((javax.servlet.http.HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST)).getSession();
        // Get a session property "counter" from context
        if (session == null)
            throw new WebServiceException("No session in WebServiceContext");
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = new Integer(0);
            System.out.println("Starting the Session");
        }
        counter = new Integer(counter.intValue() + 1);
        session.setAttribute("counter", counter);

        return counter;

    }
    private String getClientID() {
            HttpServletRequest req = (HttpServletRequest)
                wsContext.getMessageContext().get(MessageContext.SERVLET_REQUEST);
            HttpSession session = req.getSession();
            return session.getId();
        }

    @WebMethod
        public String printSessionInfo() {
        MessageContext mctx = wsContext.getMessageContext();

        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
              List userList = (List) http_headers.get("Username");
              List passList = (List) http_headers.get("Password");
               System.out.println("USER ANME==="+userList.get(0));
        System.out.println("Password ANME==="+passList.get(0));
        System.out.println("endpoint invoked, checking session id of client");
            String id = getClientID();
            System.out.println(" looking up session id: " + id);
        boolean idExists = clients.contains(id);

        for(String s: clients){
                 System.out.println(" Client IDs==: " + s);
        }
        if (idExists) {
                System.out.println(" found session id: " + id);
            return "Same session, id is " + id;
        }
        else {
                System.out.println("storing session id: " + id);
            clients.add(id);
            return "New session, id is " + id;
        }
        }

    /**
     * Lifecycle method called before servicing any requests
     */
    @PostConstruct
    @WebMethod(exclude = true)
    public void onBeginService() {
        System.out.println("Called onBeginService: Session test");

               clients = new HashSet<String>();


        // Initialize resources need by the Service
        // ....
    }

    /**
     * Lifecycle method called before destroying the service instance
     */
    @PreDestroy
    @WebMethod(exclude = true)
    public void onEndService() {
        System.out.println("Called onEndService: Session test");
        // Clean up resources need by the Service
        // ....
    }
}


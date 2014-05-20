
package sampleSession;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://server.session/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCounter", targetNamespace = "http://server.session/", className = "sampleSession.GetCounter")
    @ResponseWrapper(localName = "getCounterResponse", targetNamespace = "http://server.session/", className = "sampleSession.GetCounterResponse")
    @Action(input = "http://server.session/Hello/getCounterRequest", output = "http://server.session/Hello/getCounterResponse")
    public int getCounter();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "printSessionInfo", targetNamespace = "http://server.session/", className = "sampleSession.PrintSessionInfo")
    @ResponseWrapper(localName = "printSessionInfoResponse", targetNamespace = "http://server.session/", className = "sampleSession.PrintSessionInfoResponse")
    @Action(input = "http://server.session/Hello/printSessionInfoRequest", output = "http://server.session/Hello/printSessionInfoResponse")
    public String printSessionInfo();

}

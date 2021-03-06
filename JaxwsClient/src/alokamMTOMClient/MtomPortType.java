
package alokamMTOMClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
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
@WebService(name = "MtomPortType", targetNamespace = "http://example.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MtomPortType {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "echoBinaryAsString", targetNamespace = "http://example.org", className = "alokamMTOMClient.EchoBinaryAsString")
    @ResponseWrapper(localName = "echoBinaryAsStringResponse", targetNamespace = "http://example.org", className = "alokamMTOMClient.EchoBinaryAsStringResponse")
    @Action(input = "http://example.org/MtomPortType/echoBinaryAsStringRequest", output = "http://example.org/MtomPortType/echoBinaryAsStringResponse")
    public String echoBinaryAsString(
        @WebParam(name = "arg0", targetNamespace = "")
        byte[] arg0);

}

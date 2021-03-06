
package venutest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://example/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param user
     * @param parameters
     * @return
     *     returns venutest.AlokamvenuResponse
     */
    @WebMethod(action = "alokamvenu")
    @WebResult(name = "alokamvenuResponse", targetNamespace = "http://example/", partName = "result")
    @Action(input = "alokamvenu", output = "http://example/HelloWorld/alokamvenuResponse")
    public AlokamvenuResponse alokamvenu(
        @WebParam(name = "alokamvenu", targetNamespace = "http://example/", partName = "parameters")
        Alokamvenu parameters,
        @WebParam(name = "user", targetNamespace = "http://example/", header = true, partName = "user")
        User user);

}

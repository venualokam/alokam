
package sampleSession;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sampleSession package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PrintSessionInfo_QNAME = new QName("http://server.session/", "printSessionInfo");
    private final static QName _PrintSessionInfoResponse_QNAME = new QName("http://server.session/", "printSessionInfoResponse");
    private final static QName _GetCounter_QNAME = new QName("http://server.session/", "getCounter");
    private final static QName _GetCounterResponse_QNAME = new QName("http://server.session/", "getCounterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sampleSession
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintSessionInfo }
     * 
     */
    public PrintSessionInfo createPrintSessionInfo() {
        return new PrintSessionInfo();
    }

    /**
     * Create an instance of {@link GetCounterResponse }
     * 
     */
    public GetCounterResponse createGetCounterResponse() {
        return new GetCounterResponse();
    }

    /**
     * Create an instance of {@link GetCounter }
     * 
     */
    public GetCounter createGetCounter() {
        return new GetCounter();
    }

    /**
     * Create an instance of {@link PrintSessionInfoResponse }
     * 
     */
    public PrintSessionInfoResponse createPrintSessionInfoResponse() {
        return new PrintSessionInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintSessionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.session/", name = "printSessionInfo")
    public JAXBElement<PrintSessionInfo> createPrintSessionInfo(PrintSessionInfo value) {
        return new JAXBElement<PrintSessionInfo>(_PrintSessionInfo_QNAME, PrintSessionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintSessionInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.session/", name = "printSessionInfoResponse")
    public JAXBElement<PrintSessionInfoResponse> createPrintSessionInfoResponse(PrintSessionInfoResponse value) {
        return new JAXBElement<PrintSessionInfoResponse>(_PrintSessionInfoResponse_QNAME, PrintSessionInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.session/", name = "getCounter")
    public JAXBElement<GetCounter> createGetCounter(GetCounter value) {
        return new JAXBElement<GetCounter>(_GetCounter_QNAME, GetCounter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCounterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.session/", name = "getCounterResponse")
    public JAXBElement<GetCounterResponse> createGetCounterResponse(GetCounterResponse value) {
        return new JAXBElement<GetCounterResponse>(_GetCounterResponse_QNAME, GetCounterResponse.class, null, value);
    }

}

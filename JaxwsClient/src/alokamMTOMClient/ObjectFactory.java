
package alokamMTOMClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the alokamMTOMClient package. 
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

    private final static QName _EchoBinaryAsStringResponse_QNAME = new QName("http://example.org", "echoBinaryAsStringResponse");
    private final static QName _EchoBinaryAsString_QNAME = new QName("http://example.org", "echoBinaryAsString");
    private final static QName _EchoBinaryAsStringArg0_QNAME = new QName("", "arg0");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: alokamMTOMClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EchoBinaryAsStringResponse }
     * 
     */
    public EchoBinaryAsStringResponse createEchoBinaryAsStringResponse() {
        return new EchoBinaryAsStringResponse();
    }

    /**
     * Create an instance of {@link EchoBinaryAsString }
     * 
     */
    public EchoBinaryAsString createEchoBinaryAsString() {
        return new EchoBinaryAsString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoBinaryAsStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org", name = "echoBinaryAsStringResponse")
    public JAXBElement<EchoBinaryAsStringResponse> createEchoBinaryAsStringResponse(EchoBinaryAsStringResponse value) {
        return new JAXBElement<EchoBinaryAsStringResponse>(_EchoBinaryAsStringResponse_QNAME, EchoBinaryAsStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoBinaryAsString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org", name = "echoBinaryAsString")
    public JAXBElement<EchoBinaryAsString> createEchoBinaryAsString(EchoBinaryAsString value) {
        return new JAXBElement<EchoBinaryAsString>(_EchoBinaryAsString_QNAME, EchoBinaryAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg0", scope = EchoBinaryAsString.class)
    public JAXBElement<byte[]> createEchoBinaryAsStringArg0(byte[] value) {
        return new JAXBElement<byte[]>(_EchoBinaryAsStringArg0_QNAME, byte[].class, EchoBinaryAsString.class, ((byte[]) value));
    }

}

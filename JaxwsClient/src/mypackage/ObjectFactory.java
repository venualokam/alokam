
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _CallbackMessage_QNAME = new QName("http://asyanchronusWEBService/", "callbackMessage");
    private final static QName _SayHello_QNAME = new QName("http://asyanchronusWEBService/", "sayHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link CallbackMessage }
     * 
     */
    public CallbackMessage createCallbackMessage() {
        return new CallbackMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallbackMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asyanchronusWEBService/", name = "callbackMessage")
    public JAXBElement<CallbackMessage> createCallbackMessage(CallbackMessage value) {
        return new JAXBElement<CallbackMessage>(_CallbackMessage_QNAME, CallbackMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asyanchronusWEBService/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

}


package venutest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the venutest package. 
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

    private final static QName _Alokamvenu_QNAME = new QName("http://example/", "alokamvenu");
    private final static QName _AlokamvenuResponse_QNAME = new QName("http://example/", "alokamvenuResponse");
    private final static QName _UserResponse_QNAME = new QName("http://www.hr-xml.org/3", "UserResponse");
    private final static QName _User_QNAME = new QName("http://example/", "user");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: venutest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Alokamvenu }
     * 
     */
    public Alokamvenu createAlokamvenu() {
        return new Alokamvenu();
    }

    /**
     * Create an instance of {@link AlokamvenuResponse }
     * 
     */
    public AlokamvenuResponse createAlokamvenuResponse() {
        return new AlokamvenuResponse();
    }

    /**
     * Create an instance of {@link UserResponse }
     * 
     */
    public UserResponse createUserResponse() {
        return new UserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Alokamvenu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "alokamvenu")
    public JAXBElement<Alokamvenu> createAlokamvenu(Alokamvenu value) {
        return new JAXBElement<Alokamvenu>(_Alokamvenu_QNAME, Alokamvenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlokamvenuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "alokamvenuResponse")
    public JAXBElement<AlokamvenuResponse> createAlokamvenuResponse(AlokamvenuResponse value) {
        return new JAXBElement<AlokamvenuResponse>(_AlokamvenuResponse_QNAME, AlokamvenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hr-xml.org/3", name = "UserResponse")
    public JAXBElement<UserResponse> createUserResponse(UserResponse value) {
        return new JAXBElement<UserResponse>(_UserResponse_QNAME, UserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

}

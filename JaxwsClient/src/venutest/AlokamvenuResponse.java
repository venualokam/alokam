
package venutest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alokamvenuResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alokamvenuResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alokamvenuResponse", propOrder = {
    "userResponse"
})
public class AlokamvenuResponse {

    @XmlElement(name = "UserResponse", namespace = "http://www.hr-xml.org/3")
    protected UserResponse userResponse;

    /**
     * Gets the value of the userResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UserResponse }
     *     
     */
    public UserResponse getUserResponse() {
        return userResponse;
    }

    /**
     * Sets the value of the userResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserResponse }
     *     
     */
    public void setUserResponse(UserResponse value) {
        this.userResponse = value;
    }

}

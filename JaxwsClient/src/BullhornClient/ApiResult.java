
package BullhornClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://session.apiservice.bullhorn.com/}apiSession" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiResult", namespace = "http://result.apiservice.bullhorn.com/", propOrder = {
    "session"
})
@XmlSeeAlso({
    ApiSaveResult.class,
    ApiFindResult.class,
    ApiGetUserDepartmentIdsResult.class,
    ApiEventsGetLastRequestIdResult.class,
    ApiAddNoteReferenceResult.class,
    ApiFindMultipleResult.class,
    ApiGetUserTypesResult.class,
    ApiRemoveNoteReferenceResult.class,
    ApiEventsGetEventsResult.class,
    ApiAssociateResult.class,
    ApiGetDepartmentUserIdsResult.class,
    ApiUnassociateResult.class,
    ApiGetEntityMetadataResult.class,
    ApiGetNoteReferencesResult.class,
    ApiEventsUnsubscribeResult.class,
    ApiQueryResult.class,
    ApiGetEntityNotesResult.class,
    ApiGetUserPrimaryDepartmentIdResult.class,
    ApiEventsSubscribeResult.class,
    ApiGetAssociationIdsResult.class
})
public class ApiResult {

    protected ApiSession session;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSession }
     *     
     */
    public ApiSession getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSession }
     *     
     */
    public void setSession(ApiSession value) {
        this.session = value;
    }

}

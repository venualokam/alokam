
package BullhornClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldMapChangeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fieldMapChangeEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://event.dataevent.bullhorn.com/}dataEvent">
 *       &lt;sequence>
 *         &lt;element name="fieldMapIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldMapChangeEvent", namespace = "http://event.dataevent.bullhorn.com/", propOrder = {
    "fieldMapIds"
})
public class FieldMapChangeEvent
    extends DataEvent
{

    @XmlElement(nillable = true)
    protected List<Integer> fieldMapIds;

    /**
     * Gets the value of the fieldMapIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMapIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMapIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFieldMapIds() {
        if (fieldMapIds == null) {
            fieldMapIds = new ArrayList<Integer>();
        }
        return this.fieldMapIds;
    }

}

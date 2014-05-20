
package bullhorn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiSaveResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiSaveResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="dto" type="{http://entity.bullhorn.com/}abstractDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiSaveResult", namespace = "http://result.apiservice.bullhorn.com/", propOrder = {
    "dto"
})
public class ApiSaveResult
    extends ApiResult
{

    protected AbstractDto dto;

    /**
     * Gets the value of the dto property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDto }
     *     
     */
    public AbstractDto getDto() {
        return dto;
    }

    /**
     * Sets the value of the dto property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDto }
     *     
     */
    public void setDto(AbstractDto value) {
        this.dto = value;
    }

}

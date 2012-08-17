
package bullhorn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://user.entity.bullhorn.com/}personDtoBase">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personDto", namespace = "http://user.entity.bullhorn.com/")
@XmlSeeAlso({
    CandidateDtoBase.class,
    CorporateUserDtoBase.class,
    ClientContactDtoBase.class
})
public abstract class PersonDto
    extends PersonDtoBase
{


}

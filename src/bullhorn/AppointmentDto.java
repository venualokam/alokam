
package bullhorn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appointmentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appointmentDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://appointment.entity.bullhorn.com/}appointmentDtoBase">
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
@XmlType(name = "appointmentDto", namespace = "http://appointment.entity.bullhorn.com/")
public class AppointmentDto
    extends AppointmentDtoBase
{


}

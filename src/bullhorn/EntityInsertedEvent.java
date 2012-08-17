
package bullhorn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityInsertedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityInsertedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://event.dataevent.bullhorn.com/}entityEvent">
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
@XmlType(name = "entityInsertedEvent", namespace = "http://event.dataevent.bullhorn.com/")
public class EntityInsertedEvent
    extends EntityEvent
{


}

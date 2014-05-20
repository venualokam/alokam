
package bullhorn;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSectorApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="businessSectorApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="businessSectorID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="parentBusinessSectorID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "businessSectorApiProperty", namespace = "http://lists.entity.bullhorn.com/")
@XmlEnum
public enum BusinessSectorApiProperty {

    @XmlEnumValue("businessSectorID")
    BUSINESS_SECTOR_ID("businessSectorID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("parentBusinessSectorID")
    PARENT_BUSINESS_SECTOR_ID("parentBusinessSectorID");
    private final String value;

    BusinessSectorApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessSectorApiProperty fromValue(String v) {
        for (BusinessSectorApiProperty c: BusinessSectorApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

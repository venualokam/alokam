
package BullhornClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoryApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="specialties"/>
 *     &lt;enumeration value="privateLabels"/>
 *     &lt;enumeration value="skills"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoryApiAssociation", namespace = "http://lists.entity.bullhorn.com/")
@XmlEnum
public enum CategoryApiAssociation {

    @XmlEnumValue("specialties")
    SPECIALTIES("specialties"),
    @XmlEnumValue("privateLabels")
    PRIVATE_LABELS("privateLabels"),
    @XmlEnumValue("skills")
    SKILLS("skills");
    private final String value;

    CategoryApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryApiAssociation fromValue(String v) {
        for (CategoryApiAssociation c: CategoryApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

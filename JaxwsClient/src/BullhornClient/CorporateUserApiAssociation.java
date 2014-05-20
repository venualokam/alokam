
package BullhornClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for corporateUserApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="corporateUserApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jobAssignments"/>
 *     &lt;enumeration value="privateLabels"/>
 *     &lt;enumeration value="taskAssignments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "corporateUserApiAssociation", namespace = "http://user.entity.bullhorn.com/")
@XmlEnum
public enum CorporateUserApiAssociation {

    @XmlEnumValue("jobAssignments")
    JOB_ASSIGNMENTS("jobAssignments"),
    @XmlEnumValue("privateLabels")
    PRIVATE_LABELS("privateLabels"),
    @XmlEnumValue("taskAssignments")
    TASK_ASSIGNMENTS("taskAssignments");
    private final String value;

    CorporateUserApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CorporateUserApiAssociation fromValue(String v) {
        for (CorporateUserApiAssociation c: CorporateUserApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

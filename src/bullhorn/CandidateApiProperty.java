
package bullhorn;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="userID"/>
 *     &lt;enumeration value="categoryID"/>
 *     &lt;enumeration value="certifications"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="companyName"/>
 *     &lt;enumeration value="companyURL"/>
 *     &lt;enumeration value="customTextBlock1"/>
 *     &lt;enumeration value="customTextBlock2"/>
 *     &lt;enumeration value="customTextBlock3"/>
 *     &lt;enumeration value="customTextBlock4"/>
 *     &lt;enumeration value="customTextBlock5"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateAvailable"/>
 *     &lt;enumeration value="dateAvailableEnd"/>
 *     &lt;enumeration value="dateI9Expiration"/>
 *     &lt;enumeration value="dateNextCall"/>
 *     &lt;enumeration value="dateOfBirth"/>
 *     &lt;enumeration value="dayRate"/>
 *     &lt;enumeration value="dayRateLow"/>
 *     &lt;enumeration value="degreeList"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="desiredLocations"/>
 *     &lt;enumeration value="disability"/>
 *     &lt;enumeration value="educationDegree"/>
 *     &lt;enumeration value="employeeType"/>
 *     &lt;enumeration value="employmentPreference"/>
 *     &lt;enumeration value="ethnicity"/>
 *     &lt;enumeration value="experience"/>
 *     &lt;enumeration value="externalID"/>
 *     &lt;enumeration value="federalAddtionalWitholdingsAmount"/>
 *     &lt;enumeration value="federalExemptions"/>
 *     &lt;enumeration value="federalFilingStatus"/>
 *     &lt;enumeration value="gender"/>
 *     &lt;enumeration value="hourlyRate"/>
 *     &lt;enumeration value="hourlyRateLow"/>
 *     &lt;enumeration value="i9OnFile"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isEditable"/>
 *     &lt;enumeration value="linkedPersonID"/>
 *     &lt;enumeration value="localAddtionalWitholdingsAmount"/>
 *     &lt;enumeration value="localExemptions"/>
 *     &lt;enumeration value="localFilingStatus"/>
 *     &lt;enumeration value="localTaxCode"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="numCategories"/>
 *     &lt;enumeration value="numOwners"/>
 *     &lt;enumeration value="ownerCorporationID"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="paperWorkOnFile"/>
 *     &lt;enumeration value="password"/>
 *     &lt;enumeration value="preferredContact"/>
 *     &lt;enumeration value="recentClientList"/>
 *     &lt;enumeration value="referredBy"/>
 *     &lt;enumeration value="referredByPersonID"/>
 *     &lt;enumeration value="salary"/>
 *     &lt;enumeration value="salaryLow"/>
 *     &lt;enumeration value="secondaryAddress"/>
 *     &lt;enumeration value="skillSet"/>
 *     &lt;enumeration value="source"/>
 *     &lt;enumeration value="ssn"/>
 *     &lt;enumeration value="stateAddtionalWitholdingsAmount"/>
 *     &lt;enumeration value="stateExemptions"/>
 *     &lt;enumeration value="stateFilingStatus"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="taxID"/>
 *     &lt;enumeration value="taxState"/>
 *     &lt;enumeration value="travelLimit"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="veteran"/>
 *     &lt;enumeration value="willRelocate"/>
 *     &lt;enumeration value="workAuthorized"/>
 *     &lt;enumeration value="workPhone"/>
 *     &lt;enumeration value="address"/>
 *     &lt;enumeration value="applicationID"/>
 *     &lt;enumeration value="bhTimestamp"/>
 *     &lt;enumeration value="businessSectorIDList"/>
 *     &lt;enumeration value="categoryIDList"/>
 *     &lt;enumeration value="checkPayableTo"/>
 *     &lt;enumeration value="companyDescription"/>
 *     &lt;enumeration value="contactDateAdded"/>
 *     &lt;enumeration value="contactMigrateGUID"/>
 *     &lt;enumeration value="customDate1"/>
 *     &lt;enumeration value="customDate2"/>
 *     &lt;enumeration value="customDate3"/>
 *     &lt;enumeration value="customFloat1"/>
 *     &lt;enumeration value="customFloat2"/>
 *     &lt;enumeration value="customFloat3"/>
 *     &lt;enumeration value="customInt1"/>
 *     &lt;enumeration value="customInt2"/>
 *     &lt;enumeration value="customInt3"/>
 *     &lt;enumeration value="customText1"/>
 *     &lt;enumeration value="customText10"/>
 *     &lt;enumeration value="customText11"/>
 *     &lt;enumeration value="customText12"/>
 *     &lt;enumeration value="customText13"/>
 *     &lt;enumeration value="customText14"/>
 *     &lt;enumeration value="customText15"/>
 *     &lt;enumeration value="customText16"/>
 *     &lt;enumeration value="customText17"/>
 *     &lt;enumeration value="customText18"/>
 *     &lt;enumeration value="customText19"/>
 *     &lt;enumeration value="customText2"/>
 *     &lt;enumeration value="customText20"/>
 *     &lt;enumeration value="customText3"/>
 *     &lt;enumeration value="customText4"/>
 *     &lt;enumeration value="customText5"/>
 *     &lt;enumeration value="customText6"/>
 *     &lt;enumeration value="customText7"/>
 *     &lt;enumeration value="customText8"/>
 *     &lt;enumeration value="customText9"/>
 *     &lt;enumeration value="dateLastComment"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="email2"/>
 *     &lt;enumeration value="email3"/>
 *     &lt;enumeration value="emailOld"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="fax2"/>
 *     &lt;enumeration value="fax3"/>
 *     &lt;enumeration value="firstName"/>
 *     &lt;enumeration value="internationalMailingAddress"/>
 *     &lt;enumeration value="isDayLightSavings"/>
 *     &lt;enumeration value="isPublic"/>
 *     &lt;enumeration value="isValidEmail"/>
 *     &lt;enumeration value="lastName"/>
 *     &lt;enumeration value="lastNoteDenormalized"/>
 *     &lt;enumeration value="loginRestrictions"/>
 *     &lt;enumeration value="massMailOptOut"/>
 *     &lt;enumeration value="masterUserID"/>
 *     &lt;enumeration value="middleName"/>
 *     &lt;enumeration value="mobile"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="namePrefix"/>
 *     &lt;enumeration value="nameSuffix"/>
 *     &lt;enumeration value="nickName"/>
 *     &lt;enumeration value="occupation"/>
 *     &lt;enumeration value="pager"/>
 *     &lt;enumeration value="phone"/>
 *     &lt;enumeration value="phone2"/>
 *     &lt;enumeration value="phone3"/>
 *     &lt;enumeration value="privateLabelID"/>
 *     &lt;enumeration value="recordTypeBits"/>
 *     &lt;enumeration value="registrationType"/>
 *     &lt;enumeration value="skillIDList"/>
 *     &lt;enumeration value="specialtyIDList"/>
 *     &lt;enumeration value="timeZoneOffsetEST"/>
 *     &lt;enumeration value="userDateAdded"/>
 *     &lt;enumeration value="userMigrateGUID"/>
 *     &lt;enumeration value="userTypeID"/>
 *     &lt;enumeration value="userUUID"/>
 *     &lt;enumeration value="username"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateApiProperty", namespace = "http://candidate.entity.bullhorn.com/")
@XmlEnum
public enum CandidateApiProperty {

    @XmlEnumValue("userID")
    USER_ID("userID"),
    @XmlEnumValue("categoryID")
    CATEGORY_ID("categoryID"),
    @XmlEnumValue("certifications")
    CERTIFICATIONS("certifications"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("companyName")
    COMPANY_NAME("companyName"),
    @XmlEnumValue("companyURL")
    COMPANY_URL("companyURL"),
    @XmlEnumValue("customTextBlock1")
    CUSTOM_TEXT_BLOCK_1("customTextBlock1"),
    @XmlEnumValue("customTextBlock2")
    CUSTOM_TEXT_BLOCK_2("customTextBlock2"),
    @XmlEnumValue("customTextBlock3")
    CUSTOM_TEXT_BLOCK_3("customTextBlock3"),
    @XmlEnumValue("customTextBlock4")
    CUSTOM_TEXT_BLOCK_4("customTextBlock4"),
    @XmlEnumValue("customTextBlock5")
    CUSTOM_TEXT_BLOCK_5("customTextBlock5"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateAvailable")
    DATE_AVAILABLE("dateAvailable"),
    @XmlEnumValue("dateAvailableEnd")
    DATE_AVAILABLE_END("dateAvailableEnd"),
    @XmlEnumValue("dateI9Expiration")
    DATE_I_9_EXPIRATION("dateI9Expiration"),
    @XmlEnumValue("dateNextCall")
    DATE_NEXT_CALL("dateNextCall"),
    @XmlEnumValue("dateOfBirth")
    DATE_OF_BIRTH("dateOfBirth"),
    @XmlEnumValue("dayRate")
    DAY_RATE("dayRate"),
    @XmlEnumValue("dayRateLow")
    DAY_RATE_LOW("dayRateLow"),
    @XmlEnumValue("degreeList")
    DEGREE_LIST("degreeList"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("desiredLocations")
    DESIRED_LOCATIONS("desiredLocations"),
    @XmlEnumValue("disability")
    DISABILITY("disability"),
    @XmlEnumValue("educationDegree")
    EDUCATION_DEGREE("educationDegree"),
    @XmlEnumValue("employeeType")
    EMPLOYEE_TYPE("employeeType"),
    @XmlEnumValue("employmentPreference")
    EMPLOYMENT_PREFERENCE("employmentPreference"),
    @XmlEnumValue("ethnicity")
    ETHNICITY("ethnicity"),
    @XmlEnumValue("experience")
    EXPERIENCE("experience"),
    @XmlEnumValue("externalID")
    EXTERNAL_ID("externalID"),
    @XmlEnumValue("federalAddtionalWitholdingsAmount")
    FEDERAL_ADDTIONAL_WITHOLDINGS_AMOUNT("federalAddtionalWitholdingsAmount"),
    @XmlEnumValue("federalExemptions")
    FEDERAL_EXEMPTIONS("federalExemptions"),
    @XmlEnumValue("federalFilingStatus")
    FEDERAL_FILING_STATUS("federalFilingStatus"),
    @XmlEnumValue("gender")
    GENDER("gender"),
    @XmlEnumValue("hourlyRate")
    HOURLY_RATE("hourlyRate"),
    @XmlEnumValue("hourlyRateLow")
    HOURLY_RATE_LOW("hourlyRateLow"),
    @XmlEnumValue("i9OnFile")
    I_9_ON_FILE("i9OnFile"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isEditable")
    IS_EDITABLE("isEditable"),
    @XmlEnumValue("linkedPersonID")
    LINKED_PERSON_ID("linkedPersonID"),
    @XmlEnumValue("localAddtionalWitholdingsAmount")
    LOCAL_ADDTIONAL_WITHOLDINGS_AMOUNT("localAddtionalWitholdingsAmount"),
    @XmlEnumValue("localExemptions")
    LOCAL_EXEMPTIONS("localExemptions"),
    @XmlEnumValue("localFilingStatus")
    LOCAL_FILING_STATUS("localFilingStatus"),
    @XmlEnumValue("localTaxCode")
    LOCAL_TAX_CODE("localTaxCode"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("numCategories")
    NUM_CATEGORIES("numCategories"),
    @XmlEnumValue("numOwners")
    NUM_OWNERS("numOwners"),
    @XmlEnumValue("ownerCorporationID")
    OWNER_CORPORATION_ID("ownerCorporationID"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("paperWorkOnFile")
    PAPER_WORK_ON_FILE("paperWorkOnFile"),
    @XmlEnumValue("password")
    PASSWORD("password"),
    @XmlEnumValue("preferredContact")
    PREFERRED_CONTACT("preferredContact"),
    @XmlEnumValue("recentClientList")
    RECENT_CLIENT_LIST("recentClientList"),
    @XmlEnumValue("referredBy")
    REFERRED_BY("referredBy"),
    @XmlEnumValue("referredByPersonID")
    REFERRED_BY_PERSON_ID("referredByPersonID"),
    @XmlEnumValue("salary")
    SALARY("salary"),
    @XmlEnumValue("salaryLow")
    SALARY_LOW("salaryLow"),
    @XmlEnumValue("secondaryAddress")
    SECONDARY_ADDRESS("secondaryAddress"),
    @XmlEnumValue("skillSet")
    SKILL_SET("skillSet"),
    @XmlEnumValue("source")
    SOURCE("source"),
    @XmlEnumValue("ssn")
    SSN("ssn"),
    @XmlEnumValue("stateAddtionalWitholdingsAmount")
    STATE_ADDTIONAL_WITHOLDINGS_AMOUNT("stateAddtionalWitholdingsAmount"),
    @XmlEnumValue("stateExemptions")
    STATE_EXEMPTIONS("stateExemptions"),
    @XmlEnumValue("stateFilingStatus")
    STATE_FILING_STATUS("stateFilingStatus"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("taxID")
    TAX_ID("taxID"),
    @XmlEnumValue("taxState")
    TAX_STATE("taxState"),
    @XmlEnumValue("travelLimit")
    TRAVEL_LIMIT("travelLimit"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("veteran")
    VETERAN("veteran"),
    @XmlEnumValue("willRelocate")
    WILL_RELOCATE("willRelocate"),
    @XmlEnumValue("workAuthorized")
    WORK_AUTHORIZED("workAuthorized"),
    @XmlEnumValue("workPhone")
    WORK_PHONE("workPhone"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("applicationID")
    APPLICATION_ID("applicationID"),
    @XmlEnumValue("bhTimestamp")
    BH_TIMESTAMP("bhTimestamp"),
    @XmlEnumValue("businessSectorIDList")
    BUSINESS_SECTOR_ID_LIST("businessSectorIDList"),
    @XmlEnumValue("categoryIDList")
    CATEGORY_ID_LIST("categoryIDList"),
    @XmlEnumValue("checkPayableTo")
    CHECK_PAYABLE_TO("checkPayableTo"),
    @XmlEnumValue("companyDescription")
    COMPANY_DESCRIPTION("companyDescription"),
    @XmlEnumValue("contactDateAdded")
    CONTACT_DATE_ADDED("contactDateAdded"),
    @XmlEnumValue("contactMigrateGUID")
    CONTACT_MIGRATE_GUID("contactMigrateGUID"),
    @XmlEnumValue("customDate1")
    CUSTOM_DATE_1("customDate1"),
    @XmlEnumValue("customDate2")
    CUSTOM_DATE_2("customDate2"),
    @XmlEnumValue("customDate3")
    CUSTOM_DATE_3("customDate3"),
    @XmlEnumValue("customFloat1")
    CUSTOM_FLOAT_1("customFloat1"),
    @XmlEnumValue("customFloat2")
    CUSTOM_FLOAT_2("customFloat2"),
    @XmlEnumValue("customFloat3")
    CUSTOM_FLOAT_3("customFloat3"),
    @XmlEnumValue("customInt1")
    CUSTOM_INT_1("customInt1"),
    @XmlEnumValue("customInt2")
    CUSTOM_INT_2("customInt2"),
    @XmlEnumValue("customInt3")
    CUSTOM_INT_3("customInt3"),
    @XmlEnumValue("customText1")
    CUSTOM_TEXT_1("customText1"),
    @XmlEnumValue("customText10")
    CUSTOM_TEXT_10("customText10"),
    @XmlEnumValue("customText11")
    CUSTOM_TEXT_11("customText11"),
    @XmlEnumValue("customText12")
    CUSTOM_TEXT_12("customText12"),
    @XmlEnumValue("customText13")
    CUSTOM_TEXT_13("customText13"),
    @XmlEnumValue("customText14")
    CUSTOM_TEXT_14("customText14"),
    @XmlEnumValue("customText15")
    CUSTOM_TEXT_15("customText15"),
    @XmlEnumValue("customText16")
    CUSTOM_TEXT_16("customText16"),
    @XmlEnumValue("customText17")
    CUSTOM_TEXT_17("customText17"),
    @XmlEnumValue("customText18")
    CUSTOM_TEXT_18("customText18"),
    @XmlEnumValue("customText19")
    CUSTOM_TEXT_19("customText19"),
    @XmlEnumValue("customText2")
    CUSTOM_TEXT_2("customText2"),
    @XmlEnumValue("customText20")
    CUSTOM_TEXT_20("customText20"),
    @XmlEnumValue("customText3")
    CUSTOM_TEXT_3("customText3"),
    @XmlEnumValue("customText4")
    CUSTOM_TEXT_4("customText4"),
    @XmlEnumValue("customText5")
    CUSTOM_TEXT_5("customText5"),
    @XmlEnumValue("customText6")
    CUSTOM_TEXT_6("customText6"),
    @XmlEnumValue("customText7")
    CUSTOM_TEXT_7("customText7"),
    @XmlEnumValue("customText8")
    CUSTOM_TEXT_8("customText8"),
    @XmlEnumValue("customText9")
    CUSTOM_TEXT_9("customText9"),
    @XmlEnumValue("dateLastComment")
    DATE_LAST_COMMENT("dateLastComment"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("email2")
    EMAIL_2("email2"),
    @XmlEnumValue("email3")
    EMAIL_3("email3"),
    @XmlEnumValue("emailOld")
    EMAIL_OLD("emailOld"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("fax2")
    FAX_2("fax2"),
    @XmlEnumValue("fax3")
    FAX_3("fax3"),
    @XmlEnumValue("firstName")
    FIRST_NAME("firstName"),
    @XmlEnumValue("internationalMailingAddress")
    INTERNATIONAL_MAILING_ADDRESS("internationalMailingAddress"),
    @XmlEnumValue("isDayLightSavings")
    IS_DAY_LIGHT_SAVINGS("isDayLightSavings"),
    @XmlEnumValue("isPublic")
    IS_PUBLIC("isPublic"),
    @XmlEnumValue("isValidEmail")
    IS_VALID_EMAIL("isValidEmail"),
    @XmlEnumValue("lastName")
    LAST_NAME("lastName"),
    @XmlEnumValue("lastNoteDenormalized")
    LAST_NOTE_DENORMALIZED("lastNoteDenormalized"),
    @XmlEnumValue("loginRestrictions")
    LOGIN_RESTRICTIONS("loginRestrictions"),
    @XmlEnumValue("massMailOptOut")
    MASS_MAIL_OPT_OUT("massMailOptOut"),
    @XmlEnumValue("masterUserID")
    MASTER_USER_ID("masterUserID"),
    @XmlEnumValue("middleName")
    MIDDLE_NAME("middleName"),
    @XmlEnumValue("mobile")
    MOBILE("mobile"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("namePrefix")
    NAME_PREFIX("namePrefix"),
    @XmlEnumValue("nameSuffix")
    NAME_SUFFIX("nameSuffix"),
    @XmlEnumValue("nickName")
    NICK_NAME("nickName"),
    @XmlEnumValue("occupation")
    OCCUPATION("occupation"),
    @XmlEnumValue("pager")
    PAGER("pager"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("phone2")
    PHONE_2("phone2"),
    @XmlEnumValue("phone3")
    PHONE_3("phone3"),
    @XmlEnumValue("privateLabelID")
    PRIVATE_LABEL_ID("privateLabelID"),
    @XmlEnumValue("recordTypeBits")
    RECORD_TYPE_BITS("recordTypeBits"),
    @XmlEnumValue("registrationType")
    REGISTRATION_TYPE("registrationType"),
    @XmlEnumValue("skillIDList")
    SKILL_ID_LIST("skillIDList"),
    @XmlEnumValue("specialtyIDList")
    SPECIALTY_ID_LIST("specialtyIDList"),
    @XmlEnumValue("timeZoneOffsetEST")
    TIME_ZONE_OFFSET_EST("timeZoneOffsetEST"),
    @XmlEnumValue("userDateAdded")
    USER_DATE_ADDED("userDateAdded"),
    @XmlEnumValue("userMigrateGUID")
    USER_MIGRATE_GUID("userMigrateGUID"),
    @XmlEnumValue("userTypeID")
    USER_TYPE_ID("userTypeID"),
    @XmlEnumValue("userUUID")
    USER_UUID("userUUID"),
    @XmlEnumValue("username")
    USERNAME("username");
    private final String value;

    CandidateApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateApiProperty fromValue(String v) {
        for (CandidateApiProperty c: CandidateApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

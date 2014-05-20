
package bullhorn;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for housingComplexUtilityAccountDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="housingComplexUtilityAccountDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://emb.entity.bullhorn.com/}address" minOccurs="0"/>
 *         &lt;element name="billingContactID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customContactID1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customContactID2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFloat1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customFloat2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customFloat3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customInt1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customInt2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customInt3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateConnected" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateDisconnected" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deposit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="housingComplexUtilityAccountID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="migrateGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "housingComplexUtilityAccountDtoBase", namespace = "http://housing.entity.bullhorn.com/", propOrder = {
    "accountNumber",
    "address",
    "billingContactID",
    "comments",
    "customContactID1",
    "customContactID2",
    "customDate1",
    "customDate2",
    "customDate3",
    "customFloat1",
    "customFloat2",
    "customFloat3",
    "customInt1",
    "customInt2",
    "customInt3",
    "customText1",
    "customText2",
    "customText3",
    "customText4",
    "customText5",
    "customTextBlock1",
    "customTextBlock2",
    "customTextBlock3",
    "customTextBlock4",
    "customTextBlock5",
    "dateAdded",
    "dateConnected",
    "dateDisconnected",
    "deposit",
    "fax",
    "housingComplexUtilityAccountID",
    "isDeleted",
    "migrateGUID",
    "name",
    "phone",
    "type",
    "unitID"
})
@XmlSeeAlso({
    HousingComplexUtilityAccountDto.class
})
public abstract class HousingComplexUtilityAccountDtoBase
    extends AbstractDto
{

    protected String accountNumber;
    protected Address address;
    protected Integer billingContactID;
    protected String comments;
    protected Integer customContactID1;
    protected Integer customContactID2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate3;
    protected Double customFloat1;
    protected Double customFloat2;
    protected Double customFloat3;
    protected Integer customInt1;
    protected Integer customInt2;
    protected Integer customInt3;
    protected String customText1;
    protected String customText2;
    protected String customText3;
    protected String customText4;
    protected String customText5;
    protected String customTextBlock1;
    protected String customTextBlock2;
    protected String customTextBlock3;
    protected String customTextBlock4;
    protected String customTextBlock5;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateConnected;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDisconnected;
    protected BigDecimal deposit;
    protected String fax;
    protected Integer housingComplexUtilityAccountID;
    protected Boolean isDeleted;
    protected String migrateGUID;
    protected String name;
    protected String phone;
    protected String type;
    protected Integer unitID;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the billingContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingContactID() {
        return billingContactID;
    }

    /**
     * Sets the value of the billingContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingContactID(Integer value) {
        this.billingContactID = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the customContactID1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomContactID1() {
        return customContactID1;
    }

    /**
     * Sets the value of the customContactID1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomContactID1(Integer value) {
        this.customContactID1 = value;
    }

    /**
     * Gets the value of the customContactID2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomContactID2() {
        return customContactID2;
    }

    /**
     * Sets the value of the customContactID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomContactID2(Integer value) {
        this.customContactID2 = value;
    }

    /**
     * Gets the value of the customDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate1() {
        return customDate1;
    }

    /**
     * Sets the value of the customDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate1(XMLGregorianCalendar value) {
        this.customDate1 = value;
    }

    /**
     * Gets the value of the customDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate2() {
        return customDate2;
    }

    /**
     * Sets the value of the customDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate2(XMLGregorianCalendar value) {
        this.customDate2 = value;
    }

    /**
     * Gets the value of the customDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate3() {
        return customDate3;
    }

    /**
     * Sets the value of the customDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate3(XMLGregorianCalendar value) {
        this.customDate3 = value;
    }

    /**
     * Gets the value of the customFloat1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat1() {
        return customFloat1;
    }

    /**
     * Sets the value of the customFloat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat1(Double value) {
        this.customFloat1 = value;
    }

    /**
     * Gets the value of the customFloat2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat2() {
        return customFloat2;
    }

    /**
     * Sets the value of the customFloat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat2(Double value) {
        this.customFloat2 = value;
    }

    /**
     * Gets the value of the customFloat3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat3() {
        return customFloat3;
    }

    /**
     * Sets the value of the customFloat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat3(Double value) {
        this.customFloat3 = value;
    }

    /**
     * Gets the value of the customInt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt1() {
        return customInt1;
    }

    /**
     * Sets the value of the customInt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt1(Integer value) {
        this.customInt1 = value;
    }

    /**
     * Gets the value of the customInt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt2() {
        return customInt2;
    }

    /**
     * Sets the value of the customInt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt2(Integer value) {
        this.customInt2 = value;
    }

    /**
     * Gets the value of the customInt3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt3() {
        return customInt3;
    }

    /**
     * Sets the value of the customInt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt3(Integer value) {
        this.customInt3 = value;
    }

    /**
     * Gets the value of the customText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText1() {
        return customText1;
    }

    /**
     * Sets the value of the customText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText1(String value) {
        this.customText1 = value;
    }

    /**
     * Gets the value of the customText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText2() {
        return customText2;
    }

    /**
     * Sets the value of the customText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText2(String value) {
        this.customText2 = value;
    }

    /**
     * Gets the value of the customText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText3() {
        return customText3;
    }

    /**
     * Sets the value of the customText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText3(String value) {
        this.customText3 = value;
    }

    /**
     * Gets the value of the customText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText4() {
        return customText4;
    }

    /**
     * Sets the value of the customText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText4(String value) {
        this.customText4 = value;
    }

    /**
     * Gets the value of the customText5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText5() {
        return customText5;
    }

    /**
     * Sets the value of the customText5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText5(String value) {
        this.customText5 = value;
    }

    /**
     * Gets the value of the customTextBlock1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock1() {
        return customTextBlock1;
    }

    /**
     * Sets the value of the customTextBlock1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock1(String value) {
        this.customTextBlock1 = value;
    }

    /**
     * Gets the value of the customTextBlock2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock2() {
        return customTextBlock2;
    }

    /**
     * Sets the value of the customTextBlock2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock2(String value) {
        this.customTextBlock2 = value;
    }

    /**
     * Gets the value of the customTextBlock3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock3() {
        return customTextBlock3;
    }

    /**
     * Sets the value of the customTextBlock3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock3(String value) {
        this.customTextBlock3 = value;
    }

    /**
     * Gets the value of the customTextBlock4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock4() {
        return customTextBlock4;
    }

    /**
     * Sets the value of the customTextBlock4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock4(String value) {
        this.customTextBlock4 = value;
    }

    /**
     * Gets the value of the customTextBlock5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock5() {
        return customTextBlock5;
    }

    /**
     * Sets the value of the customTextBlock5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock5(String value) {
        this.customTextBlock5 = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the dateConnected property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateConnected() {
        return dateConnected;
    }

    /**
     * Sets the value of the dateConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateConnected(XMLGregorianCalendar value) {
        this.dateConnected = value;
    }

    /**
     * Gets the value of the dateDisconnected property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDisconnected() {
        return dateDisconnected;
    }

    /**
     * Sets the value of the dateDisconnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDisconnected(XMLGregorianCalendar value) {
        this.dateDisconnected = value;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeposit(BigDecimal value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the housingComplexUtilityAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousingComplexUtilityAccountID() {
        return housingComplexUtilityAccountID;
    }

    /**
     * Sets the value of the housingComplexUtilityAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousingComplexUtilityAccountID(Integer value) {
        this.housingComplexUtilityAccountID = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the migrateGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrateGUID() {
        return migrateGUID;
    }

    /**
     * Sets the value of the migrateGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrateGUID(String value) {
        this.migrateGUID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the unitID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitID() {
        return unitID;
    }

    /**
     * Sets the value of the unitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitID(Integer value) {
        this.unitID = value;
    }

}


package bullhorn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDtoBase">
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
@XmlType(name = "abstractDto", namespace = "http://entity.bullhorn.com/")
@XmlSeeAlso({
    CandidateReferenceResponseDtoBase.class,
    CandidateAssessmentDtoBase.class,
    CandidateEducationDtoBase.class,
    CandidateWorkHistoryDtoBase.class,
    CandidateReferenceDtoBase.class,
    SendoutDtoBase.class,
    CandidateReferenceQuestionDtoBase.class,
    CandidateSourceDtoBase.class,
    CandidateAssessmentSystemDtoBase.class,
    UserTypeDtoBase.class,
    PlacementDtoBase.class,
    JobSubmissionDtoBase.class,
    PlacementCommissionDtoBase.class,
    WorkersCompensationDtoBase.class,
    JobOrderDtoBase.class,
    WorkersCompensationRateDtoBase.class,
    PlacementChangeRequestDtoBase.class,
    CertificationDtoBase.class,
    DistributionListDtoBase.class,
    RateCardDtoBase.class,
    TimecardPayClassDtoBase.class,
    TimecardDtoBase.class,
    TimecardBatchDtoBase.class,
    TimecardExpenseDtoBase.class,
    TimecardTimeDtoBase.class,
    CorporationDepartmentDtoBase.class,
    CostCenterDtoBase.class,
    TestCategoryDtoBase.class,
    TestOwnerDtoBase.class,
    TestJobDtoBase.class,
    UserWorkDtoBase.class,
    NoteDtoBase.class,
    NoteEntityDtoBase.class,
    SkillDtoBase.class,
    CategoryDtoBase.class,
    SpecialtyDtoBase.class,
    TimeUnitDtoBase.class,
    BusinessSectorDtoBase.class,
    CountryDtoBase.class,
    SurveyTemplateDtoBase.class,
    SurveyQuestionDtoBase.class,
    SurveyDtoBase.class,
    EntityTemplateAttributeDto.class,
    ClientCorporationCertificationDtoBase.class,
    PersonDtoBase.class,
    ClientCorporationDtoBase.class,
    ClientCorporationInvoiceGroupDtoBase.class,
    TaskDtoBase.class,
    HousingComplexFurnitureDeliveryDtoBase.class,
    HousingComplexAmenityDtoBase.class,
    HousingComplexUnitDtoBase.class,
    HousingComplexDtoBase.class,
    HousingComplexUtilityAccountDtoBase.class,
    PrivateLabelDtoBase.class,
    RecurringAppointmentDeleteDtoBase.class,
    AppointmentAttendeeDtoBase.class,
    AppointmentDtoBase.class,
    TearsheetDtoBase.class,
    InvoiceItemDtoBase.class,
    InvoiceGroupDtoBase.class,
    InvoiceDtoBase.class
})
public abstract class AbstractDto
    extends AbstractDtoBase
{


}

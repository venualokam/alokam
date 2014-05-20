
package BullhornClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the BullhornClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Delete_QNAME = new QName("http://apiservice.bullhorn.com/", "delete");
    private final static QName _EventsRegetEvents_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsRegetEvents");
    private final static QName _Unassociate_QNAME = new QName("http://apiservice.bullhorn.com/", "unassociate");
    private final static QName _GetEntityNotesResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getEntityNotesResponse");
    private final static QName _EventsGenerateBogusJobMatchSearchEventsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "_eventsGenerateBogusJobMatchSearchEventsResponse");
    private final static QName _UnassociateMultiple_QNAME = new QName("http://apiservice.bullhorn.com/", "unassociateMultiple");
    private final static QName _EventsGetLastRequestId_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsGetLastRequestId");
    private final static QName _GetAssociationIdsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getAssociationIdsResponse");
    private final static QName _SaveResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "saveResponse");
    private final static QName _QueryResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "queryResponse");
    private final static QName _GetNoteReferencesResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getNoteReferencesResponse");
    private final static QName _ExportApiEnumsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "_exportApiEnumsResponse");
    private final static QName _EventsGenerateBogusJobMatchSearchEvents_QNAME = new QName("http://apiservice.bullhorn.com/", "_eventsGenerateBogusJobMatchSearchEvents");
    private final static QName _GetApplicationServerHost_QNAME = new QName("http://apiservice.bullhorn.com/", "getApplicationServerHost");
    private final static QName _EventsUnsubscribe_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsUnsubscribe");
    private final static QName _GetApplicationServerHostResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getApplicationServerHostResponse");
    private final static QName _Save_QNAME = new QName("http://apiservice.bullhorn.com/", "save");
    private final static QName _EventsGenerateBogusFieldMapChangeEventsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "_eventsGenerateBogusFieldMapChangeEventsResponse");
    private final static QName _Find_QNAME = new QName("http://apiservice.bullhorn.com/", "find");
    private final static QName _DeleteById_QNAME = new QName("http://apiservice.bullhorn.com/", "deleteById");
    private final static QName _EventsRegetEventsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsRegetEventsResponse");
    private final static QName _RemoveNoteReferenceResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "removeNoteReferenceResponse");
    private final static QName _FindMultiple_QNAME = new QName("http://apiservice.bullhorn.com/", "findMultiple");
    private final static QName _EventsUnsubscribeResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsUnsubscribeResponse");
    private final static QName _GetAssociationIds_QNAME = new QName("http://apiservice.bullhorn.com/", "getAssociationIds");
    private final static QName _GetUserPrimaryDepartmentIdResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getUserPrimaryDepartmentIdResponse");
    private final static QName _EventsSubscribe_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsSubscribe");
    private final static QName _GetUserPrimaryDepartmentId_QNAME = new QName("http://apiservice.bullhorn.com/", "getUserPrimaryDepartmentId");
    private final static QName _GetJobOrderMetadata_QNAME = new QName("http://apiservice.bullhorn.com/", "getJobOrderMetadata");
    private final static QName _AssociateMultiple_QNAME = new QName("http://apiservice.bullhorn.com/", "associateMultiple");
    private final static QName _StartSessionResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "startSessionResponse");
    private final static QName _FindResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "findResponse");
    private final static QName _UnassociateMultipleResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "unassociateMultipleResponse");
    private final static QName _GetDepartmentUserIds_QNAME = new QName("http://apiservice.bullhorn.com/", "getDepartmentUserIds");
    private final static QName _FindMultipleResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "findMultipleResponse");
    private final static QName _GetEntityMetadata_QNAME = new QName("http://apiservice.bullhorn.com/", "getEntityMetadata");
    private final static QName _DeleteByIdResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "deleteByIdResponse");
    private final static QName _EventsGetEvents_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsGetEvents");
    private final static QName _AssociateMultipleResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "associateMultipleResponse");
    private final static QName _AssociateResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "associateResponse");
    private final static QName _UnassociateResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "unassociateResponse");
    private final static QName _EventsGenerateBogusEvents_QNAME = new QName("http://apiservice.bullhorn.com/", "_eventsGenerateBogusEvents");
    private final static QName _ExportApiEnums_QNAME = new QName("http://apiservice.bullhorn.com/", "_exportApiEnums");
    private final static QName _EventsGenerateBogusEventsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "_eventsGenerateBogusEventsResponse");
    private final static QName _EventsGetEventsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsGetEventsResponse");
    private final static QName _EventsSubscribeResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsSubscribeResponse");
    private final static QName _GetUserTypesResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getUserTypesResponse");
    private final static QName _GetEntityNotes_QNAME = new QName("http://apiservice.bullhorn.com/", "getEntityNotes");
    private final static QName _GetUserDepartmentIdsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getUserDepartmentIdsResponse");
    private final static QName _StartSession_QNAME = new QName("http://apiservice.bullhorn.com/", "startSession");
    private final static QName _DeleteResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "deleteResponse");
    private final static QName _GetNoteReferences_QNAME = new QName("http://apiservice.bullhorn.com/", "getNoteReferences");
    private final static QName _GetEntityMetadataResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getEntityMetadataResponse");
    private final static QName _Associate_QNAME = new QName("http://apiservice.bullhorn.com/", "associate");
    private final static QName _GetUserTypes_QNAME = new QName("http://apiservice.bullhorn.com/", "getUserTypes");
    private final static QName _Query_QNAME = new QName("http://apiservice.bullhorn.com/", "query");
    private final static QName _AddNoteReferenceResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "addNoteReferenceResponse");
    private final static QName _GetEntityNotesWhere_QNAME = new QName("http://apiservice.bullhorn.com/", "getEntityNotesWhere");
    private final static QName _EventsGetLastRequestIdResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "eventsGetLastRequestIdResponse");
    private final static QName _RemoveNoteReference_QNAME = new QName("http://apiservice.bullhorn.com/", "removeNoteReference");
    private final static QName _GetUserDepartmentIds_QNAME = new QName("http://apiservice.bullhorn.com/", "getUserDepartmentIds");
    private final static QName _GetJobOrderMetadataResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getJobOrderMetadataResponse");
    private final static QName _GetEntityNotesWhereResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getEntityNotesWhereResponse");
    private final static QName _GetDepartmentUserIdsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getDepartmentUserIdsResponse");
    private final static QName _EventsGenerateBogusFieldMapChangeEvents_QNAME = new QName("http://apiservice.bullhorn.com/", "_eventsGenerateBogusFieldMapChangeEvents");
    private final static QName _AddNoteReference_QNAME = new QName("http://apiservice.bullhorn.com/", "addNoteReference");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: BullhornClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartSessionResponse }
     * 
     */
    public StartSessionResponse createStartSessionResponse() {
        return new StartSessionResponse();
    }

    /**
     * Create an instance of {@link GetAssociationIds }
     * 
     */
    public GetAssociationIds createGetAssociationIds() {
        return new GetAssociationIds();
    }

    /**
     * Create an instance of {@link JobSubmissionDto }
     * 
     */
    public JobSubmissionDto createJobSubmissionDto() {
        return new JobSubmissionDto();
    }

    /**
     * Create an instance of {@link EventsGenerateBogusFieldMapChangeEventsResponse }
     * 
     */
    public EventsGenerateBogusFieldMapChangeEventsResponse createEventsGenerateBogusFieldMapChangeEventsResponse() {
        return new EventsGenerateBogusFieldMapChangeEventsResponse();
    }

    /**
     * Create an instance of {@link GetUserDepartmentIds }
     * 
     */
    public GetUserDepartmentIds createGetUserDepartmentIds() {
        return new GetUserDepartmentIds();
    }

    /**
     * Create an instance of {@link GetNoteReferencesResponse }
     * 
     */
    public GetNoteReferencesResponse createGetNoteReferencesResponse() {
        return new GetNoteReferencesResponse();
    }

    /**
     * Create an instance of {@link PlacementDto }
     * 
     */
    public PlacementDto createPlacementDto() {
        return new PlacementDto();
    }

    /**
     * Create an instance of {@link GetEntityNotesWhereResponse }
     * 
     */
    public GetEntityNotesWhereResponse createGetEntityNotesWhereResponse() {
        return new GetEntityNotesWhereResponse();
    }

    /**
     * Create an instance of {@link RemoveNoteReferenceResponse }
     * 
     */
    public RemoveNoteReferenceResponse createRemoveNoteReferenceResponse() {
        return new RemoveNoteReferenceResponse();
    }

    /**
     * Create an instance of {@link GetEntityMetadataResponse }
     * 
     */
    public GetEntityMetadataResponse createGetEntityMetadataResponse() {
        return new GetEntityMetadataResponse();
    }

    /**
     * Create an instance of {@link CorporationDepartmentDto }
     * 
     */
    public CorporationDepartmentDto createCorporationDepartmentDto() {
        return new CorporationDepartmentDto();
    }

    /**
     * Create an instance of {@link CategoryDto }
     * 
     */
    public CategoryDto createCategoryDto() {
        return new CategoryDto();
    }

    /**
     * Create an instance of {@link HousingComplexUtilityAccountDto }
     * 
     */
    public HousingComplexUtilityAccountDto createHousingComplexUtilityAccountDto() {
        return new HousingComplexUtilityAccountDto();
    }

    /**
     * Create an instance of {@link UnassociateResponse }
     * 
     */
    public UnassociateResponse createUnassociateResponse() {
        return new UnassociateResponse();
    }

    /**
     * Create an instance of {@link EventsGetEventsResponse }
     * 
     */
    public EventsGetEventsResponse createEventsGetEventsResponse() {
        return new EventsGetEventsResponse();
    }

    /**
     * Create an instance of {@link GetJobOrderMetadataResponse }
     * 
     */
    public GetJobOrderMetadataResponse createGetJobOrderMetadataResponse() {
        return new GetJobOrderMetadataResponse();
    }

    /**
     * Create an instance of {@link EventsUnsubscribeResponse }
     * 
     */
    public EventsUnsubscribeResponse createEventsUnsubscribeResponse() {
        return new EventsUnsubscribeResponse();
    }

    /**
     * Create an instance of {@link JobOrderTemplateAttributeDto }
     * 
     */
    public JobOrderTemplateAttributeDto createJobOrderTemplateAttributeDto() {
        return new JobOrderTemplateAttributeDto();
    }

    /**
     * Create an instance of {@link ApiGetNoteReferencesResult }
     * 
     */
    public ApiGetNoteReferencesResult createApiGetNoteReferencesResult() {
        return new ApiGetNoteReferencesResult();
    }

    /**
     * Create an instance of {@link EventsSubscribeResponse }
     * 
     */
    public EventsSubscribeResponse createEventsSubscribeResponse() {
        return new EventsSubscribeResponse();
    }

    /**
     * Create an instance of {@link EntityNameIdPair }
     * 
     */
    public EntityNameIdPair createEntityNameIdPair() {
        return new EntityNameIdPair();
    }

    /**
     * Create an instance of {@link AssociateResponse }
     * 
     */
    public AssociateResponse createAssociateResponse() {
        return new AssociateResponse();
    }

    /**
     * Create an instance of {@link EventsGenerateBogusEventsResponse }
     * 
     */
    public EventsGenerateBogusEventsResponse createEventsGenerateBogusEventsResponse() {
        return new EventsGenerateBogusEventsResponse();
    }

    /**
     * Create an instance of {@link NoteEntityDto }
     * 
     */
    public NoteEntityDto createNoteEntityDto() {
        return new NoteEntityDto();
    }

    /**
     * Create an instance of {@link ApiEventsGetLastRequestIdResult }
     * 
     */
    public ApiEventsGetLastRequestIdResult createApiEventsGetLastRequestIdResult() {
        return new ApiEventsGetLastRequestIdResult();
    }

    /**
     * Create an instance of {@link ApiGetUserTypesResult }
     * 
     */
    public ApiGetUserTypesResult createApiGetUserTypesResult() {
        return new ApiGetUserTypesResult();
    }

    /**
     * Create an instance of {@link EventsSubscribe }
     * 
     */
    public EventsSubscribe createEventsSubscribe() {
        return new EventsSubscribe();
    }

    /**
     * Create an instance of {@link EventsRegetEventsResponse }
     * 
     */
    public EventsRegetEventsResponse createEventsRegetEventsResponse() {
        return new EventsRegetEventsResponse();
    }

    /**
     * Create an instance of {@link CandidateReferenceResponseDto }
     * 
     */
    public CandidateReferenceResponseDto createCandidateReferenceResponseDto() {
        return new CandidateReferenceResponseDto();
    }

    /**
     * Create an instance of {@link ApiQueryResult }
     * 
     */
    public ApiQueryResult createApiQueryResult() {
        return new ApiQueryResult();
    }

    /**
     * Create an instance of {@link AssociateMultipleResponse }
     * 
     */
    public AssociateMultipleResponse createAssociateMultipleResponse() {
        return new AssociateMultipleResponse();
    }

    /**
     * Create an instance of {@link ApiGetAssociationIdsResult }
     * 
     */
    public ApiGetAssociationIdsResult createApiGetAssociationIdsResult() {
        return new ApiGetAssociationIdsResult();
    }

    /**
     * Create an instance of {@link CandidateDto }
     * 
     */
    public CandidateDto createCandidateDto() {
        return new CandidateDto();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link RecurringAppointmentDeleteDto }
     * 
     */
    public RecurringAppointmentDeleteDto createRecurringAppointmentDeleteDto() {
        return new RecurringAppointmentDeleteDto();
    }

    /**
     * Create an instance of {@link DeleteById }
     * 
     */
    public DeleteById createDeleteById() {
        return new DeleteById();
    }

    /**
     * Create an instance of {@link DtoQuery.Parameters.Entry }
     * 
     */
    public DtoQuery.Parameters.Entry createDtoQueryParametersEntry() {
        return new DtoQuery.Parameters.Entry();
    }

    /**
     * Create an instance of {@link EventsUnsubscribe }
     * 
     */
    public EventsUnsubscribe createEventsUnsubscribe() {
        return new EventsUnsubscribe();
    }

    /**
     * Create an instance of {@link TestCategoryDto }
     * 
     */
    public TestCategoryDto createTestCategoryDto() {
        return new TestCategoryDto();
    }

    /**
     * Create an instance of {@link ApiEventsGetEventsResult }
     * 
     */
    public ApiEventsGetEventsResult createApiEventsGetEventsResult() {
        return new ApiEventsGetEventsResult();
    }

    /**
     * Create an instance of {@link GetUserDepartmentIdsResponse }
     * 
     */
    public GetUserDepartmentIdsResponse createGetUserDepartmentIdsResponse() {
        return new GetUserDepartmentIdsResponse();
    }

    /**
     * Create an instance of {@link UserTypeDto }
     * 
     */
    public UserTypeDto createUserTypeDto() {
        return new UserTypeDto();
    }

    /**
     * Create an instance of {@link GetDepartmentUserIdsResponse }
     * 
     */
    public GetDepartmentUserIdsResponse createGetDepartmentUserIdsResponse() {
        return new GetDepartmentUserIdsResponse();
    }

    /**
     * Create an instance of {@link SurveyDto }
     * 
     */
    public SurveyDto createSurveyDto() {
        return new SurveyDto();
    }

    /**
     * Create an instance of {@link EventsGenerateBogusFieldMapChangeEvents }
     * 
     */
    public EventsGenerateBogusFieldMapChangeEvents createEventsGenerateBogusFieldMapChangeEvents() {
        return new EventsGenerateBogusFieldMapChangeEvents();
    }

    /**
     * Create an instance of {@link InvoiceGroupDto }
     * 
     */
    public InvoiceGroupDto createInvoiceGroupDto() {
        return new InvoiceGroupDto();
    }

    /**
     * Create an instance of {@link GetApplicationServerHost }
     * 
     */
    public GetApplicationServerHost createGetApplicationServerHost() {
        return new GetApplicationServerHost();
    }

    /**
     * Create an instance of {@link SpecialtyDto }
     * 
     */
    public SpecialtyDto createSpecialtyDto() {
        return new SpecialtyDto();
    }

    /**
     * Create an instance of {@link ApiGetUserDepartmentIdsResult }
     * 
     */
    public ApiGetUserDepartmentIdsResult createApiGetUserDepartmentIdsResult() {
        return new ApiGetUserDepartmentIdsResult();
    }

    /**
     * Create an instance of {@link ApiGetDepartmentUserIdsResult }
     * 
     */
    public ApiGetDepartmentUserIdsResult createApiGetDepartmentUserIdsResult() {
        return new ApiGetDepartmentUserIdsResult();
    }

    /**
     * Create an instance of {@link ExportApiEnumsResponse }
     * 
     */
    public ExportApiEnumsResponse createExportApiEnumsResponse() {
        return new ExportApiEnumsResponse();
    }

    /**
     * Create an instance of {@link ApiAssociateResult }
     * 
     */
    public ApiAssociateResult createApiAssociateResult() {
        return new ApiAssociateResult();
    }

    /**
     * Create an instance of {@link FindMultiple }
     * 
     */
    public FindMultiple createFindMultiple() {
        return new FindMultiple();
    }

    /**
     * Create an instance of {@link GetUserTypesResponse }
     * 
     */
    public GetUserTypesResponse createGetUserTypesResponse() {
        return new GetUserTypesResponse();
    }

    /**
     * Create an instance of {@link EventsGenerateBogusEvents }
     * 
     */
    public EventsGenerateBogusEvents createEventsGenerateBogusEvents() {
        return new EventsGenerateBogusEvents();
    }

    /**
     * Create an instance of {@link GetUserTypes }
     * 
     */
    public GetUserTypes createGetUserTypes() {
        return new GetUserTypes();
    }

    /**
     * Create an instance of {@link GetUserPrimaryDepartmentId }
     * 
     */
    public GetUserPrimaryDepartmentId createGetUserPrimaryDepartmentId() {
        return new GetUserPrimaryDepartmentId();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link BusinessSectorDto }
     * 
     */
    public BusinessSectorDto createBusinessSectorDto() {
        return new BusinessSectorDto();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link ApiFindMultipleResult }
     * 
     */
    public ApiFindMultipleResult createApiFindMultipleResult() {
        return new ApiFindMultipleResult();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link ApiSaveResult }
     * 
     */
    public ApiSaveResult createApiSaveResult() {
        return new ApiSaveResult();
    }

    /**
     * Create an instance of {@link TimeUnitDto }
     * 
     */
    public TimeUnitDto createTimeUnitDto() {
        return new TimeUnitDto();
    }

    /**
     * Create an instance of {@link GetEntityNotes }
     * 
     */
    public GetEntityNotes createGetEntityNotes() {
        return new GetEntityNotes();
    }

    /**
     * Create an instance of {@link ApiRemoveNoteReferenceResult }
     * 
     */
    public ApiRemoveNoteReferenceResult createApiRemoveNoteReferenceResult() {
        return new ApiRemoveNoteReferenceResult();
    }

    /**
     * Create an instance of {@link ApiAddNoteReferenceResult }
     * 
     */
    public ApiAddNoteReferenceResult createApiAddNoteReferenceResult() {
        return new ApiAddNoteReferenceResult();
    }

    /**
     * Create an instance of {@link WorkersCompensationRateDto }
     * 
     */
    public WorkersCompensationRateDto createWorkersCompensationRateDto() {
        return new WorkersCompensationRateDto();
    }

    /**
     * Create an instance of {@link JobOrderDto }
     * 
     */
    public JobOrderDto createJobOrderDto() {
        return new JobOrderDto();
    }

    /**
     * Create an instance of {@link FindMultipleResponse }
     * 
     */
    public FindMultipleResponse createFindMultipleResponse() {
        return new FindMultipleResponse();
    }

    /**
     * Create an instance of {@link UnassociateMultiple }
     * 
     */
    public UnassociateMultiple createUnassociateMultiple() {
        return new UnassociateMultiple();
    }

    /**
     * Create an instance of {@link Address1 }
     * 
     */
    public Address1 createAddress1() {
        return new Address1();
    }

    /**
     * Create an instance of {@link TimecardDto }
     * 
     */
    public TimecardDto createTimecardDto() {
        return new TimecardDto();
    }

    /**
     * Create an instance of {@link DistributionListDto }
     * 
     */
    public DistributionListDto createDistributionListDto() {
        return new DistributionListDto();
    }

    /**
     * Create an instance of {@link EventsGetEvents }
     * 
     */
    public EventsGetEvents createEventsGetEvents() {
        return new EventsGetEvents();
    }

    /**
     * Create an instance of {@link DtoQuery.Parameters }
     * 
     */
    public DtoQuery.Parameters createDtoQueryParameters() {
        return new DtoQuery.Parameters();
    }

    /**
     * Create an instance of {@link ApiFindResult }
     * 
     */
    public ApiFindResult createApiFindResult() {
        return new ApiFindResult();
    }

    /**
     * Create an instance of {@link PlacementChangeRequestDto }
     * 
     */
    public PlacementChangeRequestDto createPlacementChangeRequestDto() {
        return new PlacementChangeRequestDto();
    }

    /**
     * Create an instance of {@link ApiGetEntityNotesResult }
     * 
     */
    public ApiGetEntityNotesResult createApiGetEntityNotesResult() {
        return new ApiGetEntityNotesResult();
    }

    /**
     * Create an instance of {@link GetEntityNotesWhere }
     * 
     */
    public GetEntityNotesWhere createGetEntityNotesWhere() {
        return new GetEntityNotesWhere();
    }

    /**
     * Create an instance of {@link ApiGetUserPrimaryDepartmentIdResult }
     * 
     */
    public ApiGetUserPrimaryDepartmentIdResult createApiGetUserPrimaryDepartmentIdResult() {
        return new ApiGetUserPrimaryDepartmentIdResult();
    }

    /**
     * Create an instance of {@link JobMatchSearchEvent }
     * 
     */
    public JobMatchSearchEvent createJobMatchSearchEvent() {
        return new JobMatchSearchEvent();
    }

    /**
     * Create an instance of {@link Unassociate }
     * 
     */
    public Unassociate createUnassociate() {
        return new Unassociate();
    }

    /**
     * Create an instance of {@link EventsRegetEvents }
     * 
     */
    public EventsRegetEvents createEventsRegetEvents() {
        return new EventsRegetEvents();
    }

    /**
     * Create an instance of {@link HousingComplexAmenityDto }
     * 
     */
    public HousingComplexAmenityDto createHousingComplexAmenityDto() {
        return new HousingComplexAmenityDto();
    }

    /**
     * Create an instance of {@link EventsGenerateBogusJobMatchSearchEventsResponse }
     * 
     */
    public EventsGenerateBogusJobMatchSearchEventsResponse createEventsGenerateBogusJobMatchSearchEventsResponse() {
        return new EventsGenerateBogusJobMatchSearchEventsResponse();
    }

    /**
     * Create an instance of {@link GetEntityMetadata }
     * 
     */
    public GetEntityMetadata createGetEntityMetadata() {
        return new GetEntityMetadata();
    }

    /**
     * Create an instance of {@link AddressWithoutCountry }
     * 
     */
    public AddressWithoutCountry createAddressWithoutCountry() {
        return new AddressWithoutCountry();
    }

    /**
     * Create an instance of {@link EntityInsertedEvent }
     * 
     */
    public EntityInsertedEvent createEntityInsertedEvent() {
        return new EntityInsertedEvent();
    }

    /**
     * Create an instance of {@link RateCardDto }
     * 
     */
    public RateCardDto createRateCardDto() {
        return new RateCardDto();
    }

    /**
     * Create an instance of {@link GetNoteReferences }
     * 
     */
    public GetNoteReferences createGetNoteReferences() {
        return new GetNoteReferences();
    }

    /**
     * Create an instance of {@link AppointmentAttendeeDto }
     * 
     */
    public AppointmentAttendeeDto createAppointmentAttendeeDto() {
        return new AppointmentAttendeeDto();
    }

    /**
     * Create an instance of {@link ApiSession }
     * 
     */
    public ApiSession createApiSession() {
        return new ApiSession();
    }

    /**
     * Create an instance of {@link TearsheetDto }
     * 
     */
    public TearsheetDto createTearsheetDto() {
        return new TearsheetDto();
    }

    /**
     * Create an instance of {@link ApiResult }
     * 
     */
    public ApiResult createApiResult() {
        return new ApiResult();
    }

    /**
     * Create an instance of {@link AddNoteReference }
     * 
     */
    public AddNoteReference createAddNoteReference() {
        return new AddNoteReference();
    }

    /**
     * Create an instance of {@link SendoutDto }
     * 
     */
    public SendoutDto createSendoutDto() {
        return new SendoutDto();
    }

    /**
     * Create an instance of {@link GetDepartmentUserIds }
     * 
     */
    public GetDepartmentUserIds createGetDepartmentUserIds() {
        return new GetDepartmentUserIds();
    }

    /**
     * Create an instance of {@link CostCenterDto }
     * 
     */
    public CostCenterDto createCostCenterDto() {
        return new CostCenterDto();
    }

    /**
     * Create an instance of {@link SkillDto }
     * 
     */
    public SkillDto createSkillDto() {
        return new SkillDto();
    }

    /**
     * Create an instance of {@link EventsGetLastRequestIdResponse }
     * 
     */
    public EventsGetLastRequestIdResponse createEventsGetLastRequestIdResponse() {
        return new EventsGetLastRequestIdResponse();
    }

    /**
     * Create an instance of {@link AppointmentDto }
     * 
     */
    public AppointmentDto createAppointmentDto() {
        return new AppointmentDto();
    }

    /**
     * Create an instance of {@link CandidateAssessmentSystemDto }
     * 
     */
    public CandidateAssessmentSystemDto createCandidateAssessmentSystemDto() {
        return new CandidateAssessmentSystemDto();
    }

    /**
     * Create an instance of {@link CorporateUserDto }
     * 
     */
    public CorporateUserDto createCorporateUserDto() {
        return new CorporateUserDto();
    }

    /**
     * Create an instance of {@link SurveyQuestionDto }
     * 
     */
    public SurveyQuestionDto createSurveyQuestionDto() {
        return new SurveyQuestionDto();
    }

    /**
     * Create an instance of {@link SubscriptionMetaData }
     * 
     */
    public SubscriptionMetaData createSubscriptionMetaData() {
        return new SubscriptionMetaData();
    }

    /**
     * Create an instance of {@link CandidateEducationDto }
     * 
     */
    public CandidateEducationDto createCandidateEducationDto() {
        return new CandidateEducationDto();
    }

    /**
     * Create an instance of {@link HousingComplexUnitDto }
     * 
     */
    public HousingComplexUnitDto createHousingComplexUnitDto() {
        return new HousingComplexUnitDto();
    }

    /**
     * Create an instance of {@link CandidateWorkHistoryDto }
     * 
     */
    public CandidateWorkHistoryDto createCandidateWorkHistoryDto() {
        return new CandidateWorkHistoryDto();
    }

    /**
     * Create an instance of {@link ExportApiEnums }
     * 
     */
    public ExportApiEnums createExportApiEnums() {
        return new ExportApiEnums();
    }

    /**
     * Create an instance of {@link FieldMapChangeEvent }
     * 
     */
    public FieldMapChangeEvent createFieldMapChangeEvent() {
        return new FieldMapChangeEvent();
    }

    /**
     * Create an instance of {@link ApiValueDisplayPair }
     * 
     */
    public ApiValueDisplayPair createApiValueDisplayPair() {
        return new ApiValueDisplayPair();
    }

    /**
     * Create an instance of {@link GetJobOrderMetadata }
     * 
     */
    public GetJobOrderMetadata createGetJobOrderMetadata() {
        return new GetJobOrderMetadata();
    }

    /**
     * Create an instance of {@link ClientContactDto }
     * 
     */
    public ClientContactDto createClientContactDto() {
        return new ClientContactDto();
    }

    /**
     * Create an instance of {@link FieldMapChangeEventSubscriptionCriteria }
     * 
     */
    public FieldMapChangeEventSubscriptionCriteria createFieldMapChangeEventSubscriptionCriteria() {
        return new FieldMapChangeEventSubscriptionCriteria();
    }

    /**
     * Create an instance of {@link CountryDto }
     * 
     */
    public CountryDto createCountryDto() {
        return new CountryDto();
    }

    /**
     * Create an instance of {@link GetAssociationIdsResponse }
     * 
     */
    public GetAssociationIdsResponse createGetAssociationIdsResponse() {
        return new GetAssociationIdsResponse();
    }

    /**
     * Create an instance of {@link ClientCorporationTemplateAttributeDto }
     * 
     */
    public ClientCorporationTemplateAttributeDto createClientCorporationTemplateAttributeDto() {
        return new ClientCorporationTemplateAttributeDto();
    }

    /**
     * Create an instance of {@link ApiGetEntityMetadataResult }
     * 
     */
    public ApiGetEntityMetadataResult createApiGetEntityMetadataResult() {
        return new ApiGetEntityMetadataResult();
    }

    /**
     * Create an instance of {@link GetEntityNotesResponse }
     * 
     */
    public GetEntityNotesResponse createGetEntityNotesResponse() {
        return new GetEntityNotesResponse();
    }

    /**
     * Create an instance of {@link InvoiceItemDto }
     * 
     */
    public InvoiceItemDto createInvoiceItemDto() {
        return new InvoiceItemDto();
    }

    /**
     * Create an instance of {@link Associate }
     * 
     */
    public Associate createAssociate() {
        return new Associate();
    }

    /**
     * Create an instance of {@link EntityDeletedEvent }
     * 
     */
    public EntityDeletedEvent createEntityDeletedEvent() {
        return new EntityDeletedEvent();
    }

    /**
     * Create an instance of {@link CandidateAssessmentDto }
     * 
     */
    public CandidateAssessmentDto createCandidateAssessmentDto() {
        return new CandidateAssessmentDto();
    }

    /**
     * Create an instance of {@link ClientCorporationInvoiceGroupDto }
     * 
     */
    public ClientCorporationInvoiceGroupDto createClientCorporationInvoiceGroupDto() {
        return new ClientCorporationInvoiceGroupDto();
    }

    /**
     * Create an instance of {@link TimecardTimeDto }
     * 
     */
    public TimecardTimeDto createTimecardTimeDto() {
        return new TimecardTimeDto();
    }

    /**
     * Create an instance of {@link ApiUnassociateResult }
     * 
     */
    public ApiUnassociateResult createApiUnassociateResult() {
        return new ApiUnassociateResult();
    }

    /**
     * Create an instance of {@link EventsGetLastRequestId }
     * 
     */
    public EventsGetLastRequestId createEventsGetLastRequestId() {
        return new EventsGetLastRequestId();
    }

    /**
     * Create an instance of {@link CandidateSourceDto }
     * 
     */
    public CandidateSourceDto createCandidateSourceDto() {
        return new CandidateSourceDto();
    }

    /**
     * Create an instance of {@link UserWorkDto }
     * 
     */
    public UserWorkDto createUserWorkDto() {
        return new UserWorkDto();
    }

    /**
     * Create an instance of {@link TimecardExpenseDto }
     * 
     */
    public TimecardExpenseDto createTimecardExpenseDto() {
        return new TimecardExpenseDto();
    }

    /**
     * Create an instance of {@link InvoiceDto }
     * 
     */
    public InvoiceDto createInvoiceDto() {
        return new InvoiceDto();
    }

    /**
     * Create an instance of {@link JobMatchSearchEventSubscriptionCriteria }
     * 
     */
    public JobMatchSearchEventSubscriptionCriteria createJobMatchSearchEventSubscriptionCriteria() {
        return new JobMatchSearchEventSubscriptionCriteria();
    }

    /**
     * Create an instance of {@link EntityEventSubscriptionCriteria }
     * 
     */
    public EntityEventSubscriptionCriteria createEntityEventSubscriptionCriteria() {
        return new EntityEventSubscriptionCriteria();
    }

    /**
     * Create an instance of {@link GetUserPrimaryDepartmentIdResponse }
     * 
     */
    public GetUserPrimaryDepartmentIdResponse createGetUserPrimaryDepartmentIdResponse() {
        return new GetUserPrimaryDepartmentIdResponse();
    }

    /**
     * Create an instance of {@link StartSession }
     * 
     */
    public StartSession createStartSession() {
        return new StartSession();
    }

    /**
     * Create an instance of {@link GetEventsResults }
     * 
     */
    public GetEventsResults createGetEventsResults() {
        return new GetEventsResults();
    }

    /**
     * Create an instance of {@link TestOwnerDto }
     * 
     */
    public TestOwnerDto createTestOwnerDto() {
        return new TestOwnerDto();
    }

    /**
     * Create an instance of {@link ApiEntityMeta }
     * 
     */
    public ApiEntityMeta createApiEntityMeta() {
        return new ApiEntityMeta();
    }

    /**
     * Create an instance of {@link SurveyTemplateDto }
     * 
     */
    public SurveyTemplateDto createSurveyTemplateDto() {
        return new SurveyTemplateDto();
    }

    /**
     * Create an instance of {@link TimecardPayClassDto }
     * 
     */
    public TimecardPayClassDto createTimecardPayClassDto() {
        return new TimecardPayClassDto();
    }

    /**
     * Create an instance of {@link UserTemplateAttributeDto }
     * 
     */
    public UserTemplateAttributeDto createUserTemplateAttributeDto() {
        return new UserTemplateAttributeDto();
    }

    /**
     * Create an instance of {@link HousingComplexFurnitureDeliveryDto }
     * 
     */
    public HousingComplexFurnitureDeliveryDto createHousingComplexFurnitureDeliveryDto() {
        return new HousingComplexFurnitureDeliveryDto();
    }

    /**
     * Create an instance of {@link ApiPropertyMeta }
     * 
     */
    public ApiPropertyMeta createApiPropertyMeta() {
        return new ApiPropertyMeta();
    }

    /**
     * Create an instance of {@link ClientCorporationCertificationDto }
     * 
     */
    public ClientCorporationCertificationDto createClientCorporationCertificationDto() {
        return new ClientCorporationCertificationDto();
    }

    /**
     * Create an instance of {@link TestJobDto }
     * 
     */
    public TestJobDto createTestJobDto() {
        return new TestJobDto();
    }

    /**
     * Create an instance of {@link AddNoteReferenceResponse }
     * 
     */
    public AddNoteReferenceResponse createAddNoteReferenceResponse() {
        return new AddNoteReferenceResponse();
    }

    /**
     * Create an instance of {@link EntityUpdatedEvent }
     * 
     */
    public EntityUpdatedEvent createEntityUpdatedEvent() {
        return new EntityUpdatedEvent();
    }

    /**
     * Create an instance of {@link TimecardBatchDto }
     * 
     */
    public TimecardBatchDto createTimecardBatchDto() {
        return new TimecardBatchDto();
    }

    /**
     * Create an instance of {@link DtoQuery }
     * 
     */
    public DtoQuery createDtoQuery() {
        return new DtoQuery();
    }

    /**
     * Create an instance of {@link WorkersCompensationDto }
     * 
     */
    public WorkersCompensationDto createWorkersCompensationDto() {
        return new WorkersCompensationDto();
    }

    /**
     * Create an instance of {@link TaskDto }
     * 
     */
    public TaskDto createTaskDto() {
        return new TaskDto();
    }

    /**
     * Create an instance of {@link GetApplicationServerHostResponse }
     * 
     */
    public GetApplicationServerHostResponse createGetApplicationServerHostResponse() {
        return new GetApplicationServerHostResponse();
    }

    /**
     * Create an instance of {@link ApiEventsSubscribeResult }
     * 
     */
    public ApiEventsSubscribeResult createApiEventsSubscribeResult() {
        return new ApiEventsSubscribeResult();
    }

    /**
     * Create an instance of {@link RemoveNoteReference }
     * 
     */
    public RemoveNoteReference createRemoveNoteReference() {
        return new RemoveNoteReference();
    }

    /**
     * Create an instance of {@link UnassociateMultipleResponse }
     * 
     */
    public UnassociateMultipleResponse createUnassociateMultipleResponse() {
        return new UnassociateMultipleResponse();
    }

    /**
     * Create an instance of {@link PrivateLabelDto }
     * 
     */
    public PrivateLabelDto createPrivateLabelDto() {
        return new PrivateLabelDto();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link CandidateReferenceDto }
     * 
     */
    public CandidateReferenceDto createCandidateReferenceDto() {
        return new CandidateReferenceDto();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link ClientCorporationDto }
     * 
     */
    public ClientCorporationDto createClientCorporationDto() {
        return new ClientCorporationDto();
    }

    /**
     * Create an instance of {@link PlacementCommissionDto }
     * 
     */
    public PlacementCommissionDto createPlacementCommissionDto() {
        return new PlacementCommissionDto();
    }

    /**
     * Create an instance of {@link NoteDto }
     * 
     */
    public NoteDto createNoteDto() {
        return new NoteDto();
    }

    /**
     * Create an instance of {@link CertificationDto }
     * 
     */
    public CertificationDto createCertificationDto() {
        return new CertificationDto();
    }

    /**
     * Create an instance of {@link CandidateReferenceQuestionDto }
     * 
     */
    public CandidateReferenceQuestionDto createCandidateReferenceQuestionDto() {
        return new CandidateReferenceQuestionDto();
    }

    /**
     * Create an instance of {@link HousingComplexDto }
     * 
     */
    public HousingComplexDto createHousingComplexDto() {
        return new HousingComplexDto();
    }

    /**
     * Create an instance of {@link ApiEventsUnsubscribeResult }
     * 
     */
    public ApiEventsUnsubscribeResult createApiEventsUnsubscribeResult() {
        return new ApiEventsUnsubscribeResult();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link DeleteByIdResponse }
     * 
     */
    public DeleteByIdResponse createDeleteByIdResponse() {
        return new DeleteByIdResponse();
    }

    /**
     * Create an instance of {@link AssociateMultiple }
     * 
     */
    public AssociateMultiple createAssociateMultiple() {
        return new AssociateMultiple();
    }

    /**
     * Create an instance of {@link EventsGenerateBogusJobMatchSearchEvents }
     * 
     */
    public EventsGenerateBogusJobMatchSearchEvents createEventsGenerateBogusJobMatchSearchEvents() {
        return new EventsGenerateBogusJobMatchSearchEvents();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsRegetEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsRegetEvents")
    public JAXBElement<EventsRegetEvents> createEventsRegetEvents(EventsRegetEvents value) {
        return new JAXBElement<EventsRegetEvents>(_EventsRegetEvents_QNAME, EventsRegetEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unassociate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "unassociate")
    public JAXBElement<Unassociate> createUnassociate(Unassociate value) {
        return new JAXBElement<Unassociate>(_Unassociate_QNAME, Unassociate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityNotesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getEntityNotesResponse")
    public JAXBElement<GetEntityNotesResponse> createGetEntityNotesResponse(GetEntityNotesResponse value) {
        return new JAXBElement<GetEntityNotesResponse>(_GetEntityNotesResponse_QNAME, GetEntityNotesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGenerateBogusJobMatchSearchEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "_eventsGenerateBogusJobMatchSearchEventsResponse")
    public JAXBElement<EventsGenerateBogusJobMatchSearchEventsResponse> createEventsGenerateBogusJobMatchSearchEventsResponse(EventsGenerateBogusJobMatchSearchEventsResponse value) {
        return new JAXBElement<EventsGenerateBogusJobMatchSearchEventsResponse>(_EventsGenerateBogusJobMatchSearchEventsResponse_QNAME, EventsGenerateBogusJobMatchSearchEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnassociateMultiple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "unassociateMultiple")
    public JAXBElement<UnassociateMultiple> createUnassociateMultiple(UnassociateMultiple value) {
        return new JAXBElement<UnassociateMultiple>(_UnassociateMultiple_QNAME, UnassociateMultiple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGetLastRequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsGetLastRequestId")
    public JAXBElement<EventsGetLastRequestId> createEventsGetLastRequestId(EventsGetLastRequestId value) {
        return new JAXBElement<EventsGetLastRequestId>(_EventsGetLastRequestId_QNAME, EventsGetLastRequestId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociationIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getAssociationIdsResponse")
    public JAXBElement<GetAssociationIdsResponse> createGetAssociationIdsResponse(GetAssociationIdsResponse value) {
        return new JAXBElement<GetAssociationIdsResponse>(_GetAssociationIdsResponse_QNAME, GetAssociationIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "queryResponse")
    public JAXBElement<QueryResponse> createQueryResponse(QueryResponse value) {
        return new JAXBElement<QueryResponse>(_QueryResponse_QNAME, QueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoteReferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getNoteReferencesResponse")
    public JAXBElement<GetNoteReferencesResponse> createGetNoteReferencesResponse(GetNoteReferencesResponse value) {
        return new JAXBElement<GetNoteReferencesResponse>(_GetNoteReferencesResponse_QNAME, GetNoteReferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportApiEnumsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "_exportApiEnumsResponse")
    public JAXBElement<ExportApiEnumsResponse> createExportApiEnumsResponse(ExportApiEnumsResponse value) {
        return new JAXBElement<ExportApiEnumsResponse>(_ExportApiEnumsResponse_QNAME, ExportApiEnumsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGenerateBogusJobMatchSearchEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "_eventsGenerateBogusJobMatchSearchEvents")
    public JAXBElement<EventsGenerateBogusJobMatchSearchEvents> createEventsGenerateBogusJobMatchSearchEvents(EventsGenerateBogusJobMatchSearchEvents value) {
        return new JAXBElement<EventsGenerateBogusJobMatchSearchEvents>(_EventsGenerateBogusJobMatchSearchEvents_QNAME, EventsGenerateBogusJobMatchSearchEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationServerHost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getApplicationServerHost")
    public JAXBElement<GetApplicationServerHost> createGetApplicationServerHost(GetApplicationServerHost value) {
        return new JAXBElement<GetApplicationServerHost>(_GetApplicationServerHost_QNAME, GetApplicationServerHost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsUnsubscribe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsUnsubscribe")
    public JAXBElement<EventsUnsubscribe> createEventsUnsubscribe(EventsUnsubscribe value) {
        return new JAXBElement<EventsUnsubscribe>(_EventsUnsubscribe_QNAME, EventsUnsubscribe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationServerHostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getApplicationServerHostResponse")
    public JAXBElement<GetApplicationServerHostResponse> createGetApplicationServerHostResponse(GetApplicationServerHostResponse value) {
        return new JAXBElement<GetApplicationServerHostResponse>(_GetApplicationServerHostResponse_QNAME, GetApplicationServerHostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGenerateBogusFieldMapChangeEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "_eventsGenerateBogusFieldMapChangeEventsResponse")
    public JAXBElement<EventsGenerateBogusFieldMapChangeEventsResponse> createEventsGenerateBogusFieldMapChangeEventsResponse(EventsGenerateBogusFieldMapChangeEventsResponse value) {
        return new JAXBElement<EventsGenerateBogusFieldMapChangeEventsResponse>(_EventsGenerateBogusFieldMapChangeEventsResponse_QNAME, EventsGenerateBogusFieldMapChangeEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "deleteById")
    public JAXBElement<DeleteById> createDeleteById(DeleteById value) {
        return new JAXBElement<DeleteById>(_DeleteById_QNAME, DeleteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsRegetEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsRegetEventsResponse")
    public JAXBElement<EventsRegetEventsResponse> createEventsRegetEventsResponse(EventsRegetEventsResponse value) {
        return new JAXBElement<EventsRegetEventsResponse>(_EventsRegetEventsResponse_QNAME, EventsRegetEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNoteReferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "removeNoteReferenceResponse")
    public JAXBElement<RemoveNoteReferenceResponse> createRemoveNoteReferenceResponse(RemoveNoteReferenceResponse value) {
        return new JAXBElement<RemoveNoteReferenceResponse>(_RemoveNoteReferenceResponse_QNAME, RemoveNoteReferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMultiple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "findMultiple")
    public JAXBElement<FindMultiple> createFindMultiple(FindMultiple value) {
        return new JAXBElement<FindMultiple>(_FindMultiple_QNAME, FindMultiple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsUnsubscribeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsUnsubscribeResponse")
    public JAXBElement<EventsUnsubscribeResponse> createEventsUnsubscribeResponse(EventsUnsubscribeResponse value) {
        return new JAXBElement<EventsUnsubscribeResponse>(_EventsUnsubscribeResponse_QNAME, EventsUnsubscribeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociationIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getAssociationIds")
    public JAXBElement<GetAssociationIds> createGetAssociationIds(GetAssociationIds value) {
        return new JAXBElement<GetAssociationIds>(_GetAssociationIds_QNAME, GetAssociationIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserPrimaryDepartmentIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getUserPrimaryDepartmentIdResponse")
    public JAXBElement<GetUserPrimaryDepartmentIdResponse> createGetUserPrimaryDepartmentIdResponse(GetUserPrimaryDepartmentIdResponse value) {
        return new JAXBElement<GetUserPrimaryDepartmentIdResponse>(_GetUserPrimaryDepartmentIdResponse_QNAME, GetUserPrimaryDepartmentIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsSubscribe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsSubscribe")
    public JAXBElement<EventsSubscribe> createEventsSubscribe(EventsSubscribe value) {
        return new JAXBElement<EventsSubscribe>(_EventsSubscribe_QNAME, EventsSubscribe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserPrimaryDepartmentId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getUserPrimaryDepartmentId")
    public JAXBElement<GetUserPrimaryDepartmentId> createGetUserPrimaryDepartmentId(GetUserPrimaryDepartmentId value) {
        return new JAXBElement<GetUserPrimaryDepartmentId>(_GetUserPrimaryDepartmentId_QNAME, GetUserPrimaryDepartmentId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobOrderMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getJobOrderMetadata")
    public JAXBElement<GetJobOrderMetadata> createGetJobOrderMetadata(GetJobOrderMetadata value) {
        return new JAXBElement<GetJobOrderMetadata>(_GetJobOrderMetadata_QNAME, GetJobOrderMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateMultiple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "associateMultiple")
    public JAXBElement<AssociateMultiple> createAssociateMultiple(AssociateMultiple value) {
        return new JAXBElement<AssociateMultiple>(_AssociateMultiple_QNAME, AssociateMultiple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "startSessionResponse")
    public JAXBElement<StartSessionResponse> createStartSessionResponse(StartSessionResponse value) {
        return new JAXBElement<StartSessionResponse>(_StartSessionResponse_QNAME, StartSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnassociateMultipleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "unassociateMultipleResponse")
    public JAXBElement<UnassociateMultipleResponse> createUnassociateMultipleResponse(UnassociateMultipleResponse value) {
        return new JAXBElement<UnassociateMultipleResponse>(_UnassociateMultipleResponse_QNAME, UnassociateMultipleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentUserIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getDepartmentUserIds")
    public JAXBElement<GetDepartmentUserIds> createGetDepartmentUserIds(GetDepartmentUserIds value) {
        return new JAXBElement<GetDepartmentUserIds>(_GetDepartmentUserIds_QNAME, GetDepartmentUserIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMultipleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "findMultipleResponse")
    public JAXBElement<FindMultipleResponse> createFindMultipleResponse(FindMultipleResponse value) {
        return new JAXBElement<FindMultipleResponse>(_FindMultipleResponse_QNAME, FindMultipleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getEntityMetadata")
    public JAXBElement<GetEntityMetadata> createGetEntityMetadata(GetEntityMetadata value) {
        return new JAXBElement<GetEntityMetadata>(_GetEntityMetadata_QNAME, GetEntityMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "deleteByIdResponse")
    public JAXBElement<DeleteByIdResponse> createDeleteByIdResponse(DeleteByIdResponse value) {
        return new JAXBElement<DeleteByIdResponse>(_DeleteByIdResponse_QNAME, DeleteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGetEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsGetEvents")
    public JAXBElement<EventsGetEvents> createEventsGetEvents(EventsGetEvents value) {
        return new JAXBElement<EventsGetEvents>(_EventsGetEvents_QNAME, EventsGetEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateMultipleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "associateMultipleResponse")
    public JAXBElement<AssociateMultipleResponse> createAssociateMultipleResponse(AssociateMultipleResponse value) {
        return new JAXBElement<AssociateMultipleResponse>(_AssociateMultipleResponse_QNAME, AssociateMultipleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "associateResponse")
    public JAXBElement<AssociateResponse> createAssociateResponse(AssociateResponse value) {
        return new JAXBElement<AssociateResponse>(_AssociateResponse_QNAME, AssociateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnassociateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "unassociateResponse")
    public JAXBElement<UnassociateResponse> createUnassociateResponse(UnassociateResponse value) {
        return new JAXBElement<UnassociateResponse>(_UnassociateResponse_QNAME, UnassociateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGenerateBogusEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "_eventsGenerateBogusEvents")
    public JAXBElement<EventsGenerateBogusEvents> createEventsGenerateBogusEvents(EventsGenerateBogusEvents value) {
        return new JAXBElement<EventsGenerateBogusEvents>(_EventsGenerateBogusEvents_QNAME, EventsGenerateBogusEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportApiEnums }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "_exportApiEnums")
    public JAXBElement<ExportApiEnums> createExportApiEnums(ExportApiEnums value) {
        return new JAXBElement<ExportApiEnums>(_ExportApiEnums_QNAME, ExportApiEnums.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGenerateBogusEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "_eventsGenerateBogusEventsResponse")
    public JAXBElement<EventsGenerateBogusEventsResponse> createEventsGenerateBogusEventsResponse(EventsGenerateBogusEventsResponse value) {
        return new JAXBElement<EventsGenerateBogusEventsResponse>(_EventsGenerateBogusEventsResponse_QNAME, EventsGenerateBogusEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGetEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsGetEventsResponse")
    public JAXBElement<EventsGetEventsResponse> createEventsGetEventsResponse(EventsGetEventsResponse value) {
        return new JAXBElement<EventsGetEventsResponse>(_EventsGetEventsResponse_QNAME, EventsGetEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsSubscribeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsSubscribeResponse")
    public JAXBElement<EventsSubscribeResponse> createEventsSubscribeResponse(EventsSubscribeResponse value) {
        return new JAXBElement<EventsSubscribeResponse>(_EventsSubscribeResponse_QNAME, EventsSubscribeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getUserTypesResponse")
    public JAXBElement<GetUserTypesResponse> createGetUserTypesResponse(GetUserTypesResponse value) {
        return new JAXBElement<GetUserTypesResponse>(_GetUserTypesResponse_QNAME, GetUserTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityNotes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getEntityNotes")
    public JAXBElement<GetEntityNotes> createGetEntityNotes(GetEntityNotes value) {
        return new JAXBElement<GetEntityNotes>(_GetEntityNotes_QNAME, GetEntityNotes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDepartmentIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getUserDepartmentIdsResponse")
    public JAXBElement<GetUserDepartmentIdsResponse> createGetUserDepartmentIdsResponse(GetUserDepartmentIdsResponse value) {
        return new JAXBElement<GetUserDepartmentIdsResponse>(_GetUserDepartmentIdsResponse_QNAME, GetUserDepartmentIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "startSession")
    public JAXBElement<StartSession> createStartSession(StartSession value) {
        return new JAXBElement<StartSession>(_StartSession_QNAME, StartSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoteReferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getNoteReferences")
    public JAXBElement<GetNoteReferences> createGetNoteReferences(GetNoteReferences value) {
        return new JAXBElement<GetNoteReferences>(_GetNoteReferences_QNAME, GetNoteReferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getEntityMetadataResponse")
    public JAXBElement<GetEntityMetadataResponse> createGetEntityMetadataResponse(GetEntityMetadataResponse value) {
        return new JAXBElement<GetEntityMetadataResponse>(_GetEntityMetadataResponse_QNAME, GetEntityMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Associate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "associate")
    public JAXBElement<Associate> createAssociate(Associate value) {
        return new JAXBElement<Associate>(_Associate_QNAME, Associate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getUserTypes")
    public JAXBElement<GetUserTypes> createGetUserTypes(GetUserTypes value) {
        return new JAXBElement<GetUserTypes>(_GetUserTypes_QNAME, GetUserTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Query }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "query")
    public JAXBElement<Query> createQuery(Query value) {
        return new JAXBElement<Query>(_Query_QNAME, Query.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNoteReferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "addNoteReferenceResponse")
    public JAXBElement<AddNoteReferenceResponse> createAddNoteReferenceResponse(AddNoteReferenceResponse value) {
        return new JAXBElement<AddNoteReferenceResponse>(_AddNoteReferenceResponse_QNAME, AddNoteReferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityNotesWhere }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getEntityNotesWhere")
    public JAXBElement<GetEntityNotesWhere> createGetEntityNotesWhere(GetEntityNotesWhere value) {
        return new JAXBElement<GetEntityNotesWhere>(_GetEntityNotesWhere_QNAME, GetEntityNotesWhere.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGetLastRequestIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "eventsGetLastRequestIdResponse")
    public JAXBElement<EventsGetLastRequestIdResponse> createEventsGetLastRequestIdResponse(EventsGetLastRequestIdResponse value) {
        return new JAXBElement<EventsGetLastRequestIdResponse>(_EventsGetLastRequestIdResponse_QNAME, EventsGetLastRequestIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNoteReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "removeNoteReference")
    public JAXBElement<RemoveNoteReference> createRemoveNoteReference(RemoveNoteReference value) {
        return new JAXBElement<RemoveNoteReference>(_RemoveNoteReference_QNAME, RemoveNoteReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDepartmentIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getUserDepartmentIds")
    public JAXBElement<GetUserDepartmentIds> createGetUserDepartmentIds(GetUserDepartmentIds value) {
        return new JAXBElement<GetUserDepartmentIds>(_GetUserDepartmentIds_QNAME, GetUserDepartmentIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobOrderMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getJobOrderMetadataResponse")
    public JAXBElement<GetJobOrderMetadataResponse> createGetJobOrderMetadataResponse(GetJobOrderMetadataResponse value) {
        return new JAXBElement<GetJobOrderMetadataResponse>(_GetJobOrderMetadataResponse_QNAME, GetJobOrderMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityNotesWhereResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getEntityNotesWhereResponse")
    public JAXBElement<GetEntityNotesWhereResponse> createGetEntityNotesWhereResponse(GetEntityNotesWhereResponse value) {
        return new JAXBElement<GetEntityNotesWhereResponse>(_GetEntityNotesWhereResponse_QNAME, GetEntityNotesWhereResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentUserIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "getDepartmentUserIdsResponse")
    public JAXBElement<GetDepartmentUserIdsResponse> createGetDepartmentUserIdsResponse(GetDepartmentUserIdsResponse value) {
        return new JAXBElement<GetDepartmentUserIdsResponse>(_GetDepartmentUserIdsResponse_QNAME, GetDepartmentUserIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsGenerateBogusFieldMapChangeEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "_eventsGenerateBogusFieldMapChangeEvents")
    public JAXBElement<EventsGenerateBogusFieldMapChangeEvents> createEventsGenerateBogusFieldMapChangeEvents(EventsGenerateBogusFieldMapChangeEvents value) {
        return new JAXBElement<EventsGenerateBogusFieldMapChangeEvents>(_EventsGenerateBogusFieldMapChangeEvents_QNAME, EventsGenerateBogusFieldMapChangeEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNoteReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "addNoteReference")
    public JAXBElement<AddNoteReference> createAddNoteReference(AddNoteReference value) {
        return new JAXBElement<AddNoteReference>(_AddNoteReference_QNAME, AddNoteReference.class, null, value);
    }

}

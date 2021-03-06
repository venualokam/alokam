
package BullhornClient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ApiService", targetNamespace = "http://apiservice.bullhorn.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ApiService {


    /**
     * 
     * @param session
     * @param id
     * @param entityName
     * @return
     *     returns BullhornClient.ApiFindResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.FindResponse")
    public ApiFindResult find(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param session
     * @param dto
     * @return
     *     returns BullhornClient.ApiSaveResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "save", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.SaveResponse")
    public ApiSaveResult save(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "dto", targetNamespace = "")
        AbstractDto dto);

    /**
     * 
     * @param session
     * @param dto
     * @return
     *     returns BullhornClient.ApiResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.DeleteResponse")
    public ApiResult delete(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "dto", targetNamespace = "")
        AbstractDto dto);

    /**
     * 
     * @param query
     * @param session
     * @return
     *     returns BullhornClient.ApiQueryResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "query", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.QueryResponse")
    public ApiQueryResult query(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "query", targetNamespace = "")
        DtoQuery query);

    /**
     * 
     * @param session
     * @param id
     * @param entityName
     * @param associateId
     * @param associationName
     * @return
     *     returns BullhornClient.ApiAssociateResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "associate", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.Associate")
    @ResponseWrapper(localName = "associateResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.AssociateResponse")
    public ApiAssociateResult associate(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "id", targetNamespace = "")
        Object id,
        @WebParam(name = "associationName", targetNamespace = "")
        String associationName,
        @WebParam(name = "associateId", targetNamespace = "")
        Object associateId);

    /**
     * 
     * @param password
     * @param apiKey
     * @param username
     * @return
     *     returns BullhornClient.ApiSession
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "startSession", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.StartSession")
    @ResponseWrapper(localName = "startSessionResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.StartSessionResponse")
    public ApiSession startSession(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "apiKey", targetNamespace = "")
        String apiKey);

    /**
     * 
     * @param ids
     * @param session
     * @param entityName
     * @return
     *     returns BullhornClient.ApiFindMultipleResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findMultiple", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.FindMultiple")
    @ResponseWrapper(localName = "findMultipleResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.FindMultipleResponse")
    public ApiFindMultipleResult findMultiple(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "ids", targetNamespace = "")
        List<Object> ids);

    /**
     * 
     * @param session
     * @param id
     * @param entityName
     * @return
     *     returns BullhornClient.ApiResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteById", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.DeleteById")
    @ResponseWrapper(localName = "deleteByIdResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.DeleteByIdResponse")
    public ApiResult deleteById(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param session
     * @param id
     * @param entityName
     * @param associationName
     * @return
     *     returns BullhornClient.ApiGetAssociationIdsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAssociationIds", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetAssociationIds")
    @ResponseWrapper(localName = "getAssociationIdsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetAssociationIdsResponse")
    public ApiGetAssociationIdsResult getAssociationIds(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "id", targetNamespace = "")
        Object id,
        @WebParam(name = "associationName", targetNamespace = "")
        String associationName);

    /**
     * 
     * @param associateIds
     * @param session
     * @param id
     * @param entityName
     * @param associationName
     * @return
     *     returns BullhornClient.ApiAssociateResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "associateMultiple", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.AssociateMultiple")
    @ResponseWrapper(localName = "associateMultipleResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.AssociateMultipleResponse")
    public ApiAssociateResult associateMultiple(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "id", targetNamespace = "")
        Object id,
        @WebParam(name = "associationName", targetNamespace = "")
        String associationName,
        @WebParam(name = "associateIds", targetNamespace = "")
        List<Object> associateIds);

    /**
     * 
     * @param session
     * @param id
     * @param entityName
     * @param associateId
     * @param associationName
     * @return
     *     returns BullhornClient.ApiUnassociateResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "unassociate", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.Unassociate")
    @ResponseWrapper(localName = "unassociateResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.UnassociateResponse")
    public ApiUnassociateResult unassociate(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "id", targetNamespace = "")
        Object id,
        @WebParam(name = "associationName", targetNamespace = "")
        String associationName,
        @WebParam(name = "associateId", targetNamespace = "")
        Object associateId);

    /**
     * 
     * @param associateIds
     * @param session
     * @param id
     * @param entityName
     * @param associationName
     * @return
     *     returns BullhornClient.ApiUnassociateResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "unassociateMultiple", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.UnassociateMultiple")
    @ResponseWrapper(localName = "unassociateMultipleResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.UnassociateMultipleResponse")
    public ApiUnassociateResult unassociateMultiple(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "id", targetNamespace = "")
        Object id,
        @WebParam(name = "associationName", targetNamespace = "")
        String associationName,
        @WebParam(name = "associateIds", targetNamespace = "")
        List<Object> associateIds);

    /**
     * 
     * @param departmentId
     * @param session
     * @return
     *     returns BullhornClient.ApiGetDepartmentUserIdsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDepartmentUserIds", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetDepartmentUserIds")
    @ResponseWrapper(localName = "getDepartmentUserIdsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetDepartmentUserIdsResponse")
    public ApiGetDepartmentUserIdsResult getDepartmentUserIds(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "departmentId", targetNamespace = "")
        Integer departmentId);

    /**
     * 
     * @param session
     * @param corporateUserId
     * @return
     *     returns BullhornClient.ApiGetUserDepartmentIdsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserDepartmentIds", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetUserDepartmentIds")
    @ResponseWrapper(localName = "getUserDepartmentIdsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetUserDepartmentIdsResponse")
    public ApiGetUserDepartmentIdsResult getUserDepartmentIds(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "corporateUserId", targetNamespace = "")
        Integer corporateUserId);

    /**
     * 
     * @param session
     * @param corporateUserId
     * @return
     *     returns BullhornClient.ApiGetUserPrimaryDepartmentIdResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserPrimaryDepartmentId", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetUserPrimaryDepartmentId")
    @ResponseWrapper(localName = "getUserPrimaryDepartmentIdResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetUserPrimaryDepartmentIdResponse")
    public ApiGetUserPrimaryDepartmentIdResult getUserPrimaryDepartmentId(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "corporateUserId", targetNamespace = "")
        Integer corporateUserId);

    /**
     * 
     * @param personEntityName
     * @param session
     * @return
     *     returns BullhornClient.ApiGetUserTypesResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserTypes", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetUserTypes")
    @ResponseWrapper(localName = "getUserTypesResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetUserTypesResponse")
    public ApiGetUserTypesResult getUserTypes(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "personEntityName", targetNamespace = "")
        String personEntityName);

    /**
     * 
     * @param subscriptionId
     * @param criteria
     * @param session
     * @return
     *     returns BullhornClient.ApiEventsSubscribeResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsSubscribe", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsSubscribe")
    @ResponseWrapper(localName = "eventsSubscribeResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsSubscribeResponse")
    public ApiEventsSubscribeResult eventsSubscribe(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "subscriptionId", targetNamespace = "")
        String subscriptionId,
        @WebParam(name = "criteria", targetNamespace = "")
        SubscriptionCriteria criteria);

    /**
     * 
     * @param subscriptionId
     * @param session
     * @return
     *     returns BullhornClient.ApiEventsUnsubscribeResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsUnsubscribe", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsUnsubscribe")
    @ResponseWrapper(localName = "eventsUnsubscribeResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsUnsubscribeResponse")
    public ApiEventsUnsubscribeResult eventsUnsubscribe(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "subscriptionId", targetNamespace = "")
        String subscriptionId);

    /**
     * 
     * @param session
     * @param id
     * @param entityName
     * @return
     *     returns BullhornClient.ApiGetEntityNotesResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEntityNotes", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetEntityNotes")
    @ResponseWrapper(localName = "getEntityNotesResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetEntityNotesResponse")
    public ApiGetEntityNotesResult getEntityNotes(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param notesWhere
     * @param session
     * @param id
     * @param entityName
     * @return
     *     returns BullhornClient.ApiGetEntityNotesResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEntityNotesWhere", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetEntityNotesWhere")
    @ResponseWrapper(localName = "getEntityNotesWhereResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetEntityNotesWhereResponse")
    public ApiGetEntityNotesResult getEntityNotesWhere(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "id", targetNamespace = "")
        Object id,
        @WebParam(name = "notesWhere", targetNamespace = "")
        String notesWhere);

    /**
     * 
     * @param session
     * @param id
     * @return
     *     returns BullhornClient.ApiGetNoteReferencesResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNoteReferences", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetNoteReferences")
    @ResponseWrapper(localName = "getNoteReferencesResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetNoteReferencesResponse")
    public ApiGetNoteReferencesResult getNoteReferences(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param noteId
     * @param session
     * @param entityName
     * @param entityId
     * @return
     *     returns BullhornClient.ApiAddNoteReferenceResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addNoteReference", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.AddNoteReference")
    @ResponseWrapper(localName = "addNoteReferenceResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.AddNoteReferenceResponse")
    public ApiAddNoteReferenceResult addNoteReference(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "noteId", targetNamespace = "")
        Object noteId,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "entityId", targetNamespace = "")
        Object entityId);

    /**
     * 
     * @param noteId
     * @param session
     * @param entityName
     * @param entityId
     * @return
     *     returns BullhornClient.ApiRemoveNoteReferenceResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeNoteReference", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.RemoveNoteReference")
    @ResponseWrapper(localName = "removeNoteReferenceResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.RemoveNoteReferenceResponse")
    public ApiRemoveNoteReferenceResult removeNoteReference(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "noteId", targetNamespace = "")
        Object noteId,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "entityId", targetNamespace = "")
        Object entityId);

    /**
     * 
     * @param session
     * @param privateLabelId
     * @param entityName
     * @return
     *     returns BullhornClient.ApiGetEntityMetadataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEntityMetadata", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetEntityMetadata")
    @ResponseWrapper(localName = "getEntityMetadataResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetEntityMetadataResponse")
    public ApiGetEntityMetadataResult getEntityMetadata(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "privateLabelId", targetNamespace = "")
        Object privateLabelId);

    /**
     * 
     * @param typeId
     * @param session
     * @param privateLabelId
     * @return
     *     returns BullhornClient.ApiGetEntityMetadataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getJobOrderMetadata", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetJobOrderMetadata")
    @ResponseWrapper(localName = "getJobOrderMetadataResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetJobOrderMetadataResponse")
    public ApiGetEntityMetadataResult getJobOrderMetadata(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "typeId", targetNamespace = "")
        Object typeId,
        @WebParam(name = "privateLabelId", targetNamespace = "")
        Object privateLabelId);

    /**
     * 
     * @param subscriptionId
     * @param session
     * @param count
     * @param entityName
     */
    @WebMethod(operationName = "_eventsGenerateBogusEvents")
    @RequestWrapper(localName = "_eventsGenerateBogusEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGenerateBogusEvents")
    @ResponseWrapper(localName = "_eventsGenerateBogusEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGenerateBogusEventsResponse")
    public void eventsGenerateBogusEvents(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "subscriptionId", targetNamespace = "")
        String subscriptionId,
        @WebParam(name = "entityName", targetNamespace = "")
        String entityName,
        @WebParam(name = "count", targetNamespace = "")
        int count);

    /**
     * 
     * @param subscriptionId
     * @param session
     * @param count
     */
    @WebMethod(operationName = "_eventsGenerateBogusJobMatchSearchEvents")
    @RequestWrapper(localName = "_eventsGenerateBogusJobMatchSearchEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGenerateBogusJobMatchSearchEvents")
    @ResponseWrapper(localName = "_eventsGenerateBogusJobMatchSearchEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGenerateBogusJobMatchSearchEventsResponse")
    public void eventsGenerateBogusJobMatchSearchEvents(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "subscriptionId", targetNamespace = "")
        String subscriptionId,
        @WebParam(name = "count", targetNamespace = "")
        int count);

    /**
     * 
     * @param subscriptionId
     * @param session
     * @param count
     */
    @WebMethod(operationName = "_eventsGenerateBogusFieldMapChangeEvents")
    @RequestWrapper(localName = "_eventsGenerateBogusFieldMapChangeEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGenerateBogusFieldMapChangeEvents")
    @ResponseWrapper(localName = "_eventsGenerateBogusFieldMapChangeEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGenerateBogusFieldMapChangeEventsResponse")
    public void eventsGenerateBogusFieldMapChangeEvents(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "subscriptionId", targetNamespace = "")
        String subscriptionId,
        @WebParam(name = "count", targetNamespace = "")
        int count);

    /**
     * 
     * @param subscriptionId
     * @param session
     * @param maxEvents
     * @return
     *     returns BullhornClient.ApiEventsGetEventsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsGetEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGetEvents")
    @ResponseWrapper(localName = "eventsGetEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGetEventsResponse")
    public ApiEventsGetEventsResult eventsGetEvents(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "subscriptionId", targetNamespace = "")
        String subscriptionId,
        @WebParam(name = "maxEvents", targetNamespace = "")
        int maxEvents);

    /**
     * 
     * @param subscriptionId
     * @param session
     * @return
     *     returns BullhornClient.ApiEventsGetLastRequestIdResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsGetLastRequestId", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGetLastRequestId")
    @ResponseWrapper(localName = "eventsGetLastRequestIdResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsGetLastRequestIdResponse")
    public ApiEventsGetLastRequestIdResult eventsGetLastRequestId(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "subscriptionId", targetNamespace = "")
        String subscriptionId);

    /**
     * 
     * @param subscriptionId
     * @param requestId
     * @param session
     * @return
     *     returns BullhornClient.ApiEventsGetEventsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsRegetEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsRegetEvents")
    @ResponseWrapper(localName = "eventsRegetEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.EventsRegetEventsResponse")
    public ApiEventsGetEventsResult eventsRegetEvents(
        @WebParam(name = "session", targetNamespace = "")
        ApiSession session,
        @WebParam(name = "subscriptionId", targetNamespace = "")
        String subscriptionId,
        @WebParam(name = "requestId", targetNamespace = "")
        long requestId);

    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "_exportApiEnums")
    @RequestWrapper(localName = "_exportApiEnums", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.ExportApiEnums")
    @ResponseWrapper(localName = "_exportApiEnumsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.ExportApiEnumsResponse")
    public void exportApiEnums(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param username
     * @param source
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getApplicationServerHost", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetApplicationServerHost")
    @ResponseWrapper(localName = "getApplicationServerHostResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "BullhornClient.GetApplicationServerHostResponse")
    public String getApplicationServerHost(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "source", targetNamespace = "")
        String source);

}

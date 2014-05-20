
package bullhorn;

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
     *     returns bullhorn.ApiFindResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.FindResponse")
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
     *     returns bullhorn.ApiSaveResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "save", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.SaveResponse")
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
     *     returns bullhorn.ApiResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.DeleteResponse")
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
     *     returns bullhorn.ApiQueryResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "query", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.QueryResponse")
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
     *     returns bullhorn.ApiAssociateResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "associate", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.Associate")
    @ResponseWrapper(localName = "associateResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.AssociateResponse")
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
     *     returns bullhorn.ApiSession
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "startSession", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.StartSession")
    @ResponseWrapper(localName = "startSessionResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.StartSessionResponse")
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
     *     returns bullhorn.ApiFindMultipleResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findMultiple", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.FindMultiple")
    @ResponseWrapper(localName = "findMultipleResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.FindMultipleResponse")
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
     *     returns bullhorn.ApiResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteById", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.DeleteById")
    @ResponseWrapper(localName = "deleteByIdResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.DeleteByIdResponse")
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
     *     returns bullhorn.ApiGetAssociationIdsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAssociationIds", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetAssociationIds")
    @ResponseWrapper(localName = "getAssociationIdsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetAssociationIdsResponse")
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
     *     returns bullhorn.ApiAssociateResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "associateMultiple", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.AssociateMultiple")
    @ResponseWrapper(localName = "associateMultipleResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.AssociateMultipleResponse")
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
     *     returns bullhorn.ApiUnassociateResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "unassociate", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.Unassociate")
    @ResponseWrapper(localName = "unassociateResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.UnassociateResponse")
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
     *     returns bullhorn.ApiUnassociateResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "unassociateMultiple", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.UnassociateMultiple")
    @ResponseWrapper(localName = "unassociateMultipleResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.UnassociateMultipleResponse")
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
     *     returns bullhorn.ApiGetDepartmentUserIdsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDepartmentUserIds", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetDepartmentUserIds")
    @ResponseWrapper(localName = "getDepartmentUserIdsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetDepartmentUserIdsResponse")
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
     *     returns bullhorn.ApiGetUserDepartmentIdsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserDepartmentIds", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetUserDepartmentIds")
    @ResponseWrapper(localName = "getUserDepartmentIdsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetUserDepartmentIdsResponse")
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
     *     returns bullhorn.ApiGetUserPrimaryDepartmentIdResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserPrimaryDepartmentId", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetUserPrimaryDepartmentId")
    @ResponseWrapper(localName = "getUserPrimaryDepartmentIdResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetUserPrimaryDepartmentIdResponse")
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
     *     returns bullhorn.ApiGetUserTypesResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserTypes", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetUserTypes")
    @ResponseWrapper(localName = "getUserTypesResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetUserTypesResponse")
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
     *     returns bullhorn.ApiEventsSubscribeResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsSubscribe", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsSubscribe")
    @ResponseWrapper(localName = "eventsSubscribeResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsSubscribeResponse")
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
     *     returns bullhorn.ApiEventsUnsubscribeResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsUnsubscribe", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsUnsubscribe")
    @ResponseWrapper(localName = "eventsUnsubscribeResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsUnsubscribeResponse")
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
     *     returns bullhorn.ApiGetEntityNotesResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEntityNotes", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetEntityNotes")
    @ResponseWrapper(localName = "getEntityNotesResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetEntityNotesResponse")
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
     *     returns bullhorn.ApiGetEntityNotesResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEntityNotesWhere", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetEntityNotesWhere")
    @ResponseWrapper(localName = "getEntityNotesWhereResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetEntityNotesWhereResponse")
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
     *     returns bullhorn.ApiGetNoteReferencesResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNoteReferences", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetNoteReferences")
    @ResponseWrapper(localName = "getNoteReferencesResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetNoteReferencesResponse")
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
     *     returns bullhorn.ApiAddNoteReferenceResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addNoteReference", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.AddNoteReference")
    @ResponseWrapper(localName = "addNoteReferenceResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.AddNoteReferenceResponse")
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
     *     returns bullhorn.ApiRemoveNoteReferenceResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeNoteReference", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.RemoveNoteReference")
    @ResponseWrapper(localName = "removeNoteReferenceResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.RemoveNoteReferenceResponse")
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
     *     returns bullhorn.ApiGetEntityMetadataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEntityMetadata", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetEntityMetadata")
    @ResponseWrapper(localName = "getEntityMetadataResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetEntityMetadataResponse")
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
     *     returns bullhorn.ApiGetEntityMetadataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getJobOrderMetadata", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetJobOrderMetadata")
    @ResponseWrapper(localName = "getJobOrderMetadataResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetJobOrderMetadataResponse")
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
    @RequestWrapper(localName = "_eventsGenerateBogusEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGenerateBogusEvents")
    @ResponseWrapper(localName = "_eventsGenerateBogusEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGenerateBogusEventsResponse")
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
    @RequestWrapper(localName = "_eventsGenerateBogusJobMatchSearchEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGenerateBogusJobMatchSearchEvents")
    @ResponseWrapper(localName = "_eventsGenerateBogusJobMatchSearchEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGenerateBogusJobMatchSearchEventsResponse")
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
    @RequestWrapper(localName = "_eventsGenerateBogusFieldMapChangeEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGenerateBogusFieldMapChangeEvents")
    @ResponseWrapper(localName = "_eventsGenerateBogusFieldMapChangeEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGenerateBogusFieldMapChangeEventsResponse")
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
     *     returns bullhorn.ApiEventsGetEventsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsGetEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGetEvents")
    @ResponseWrapper(localName = "eventsGetEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGetEventsResponse")
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
     *     returns bullhorn.ApiEventsGetLastRequestIdResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsGetLastRequestId", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGetLastRequestId")
    @ResponseWrapper(localName = "eventsGetLastRequestIdResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsGetLastRequestIdResponse")
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
     *     returns bullhorn.ApiEventsGetEventsResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventsRegetEvents", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsRegetEvents")
    @ResponseWrapper(localName = "eventsRegetEventsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.EventsRegetEventsResponse")
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
    @RequestWrapper(localName = "_exportApiEnums", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.ExportApiEnums")
    @ResponseWrapper(localName = "_exportApiEnumsResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.ExportApiEnumsResponse")
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
    @RequestWrapper(localName = "getApplicationServerHost", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetApplicationServerHost")
    @ResponseWrapper(localName = "getApplicationServerHostResponse", targetNamespace = "http://apiservice.bullhorn.com/", className = "bullhorn.GetApplicationServerHostResponse")
    public String getApplicationServerHost(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "source", targetNamespace = "")
        String source);

}

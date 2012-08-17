
package com.skillcheck.web_management.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-02/02/2007 03:56 AM(vivekp)-FCS
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ScoreUploading", targetNamespace = "http://webtest.skillcheck.com")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ScoreUploading {


    /**
     * 
     * @param licenseID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ValidateLicense")
    @WebResult(partName = "return")
    public String validateLicense(
        @WebParam(name = "licenseID", partName = "licenseID")
        String licenseID);

    /**
     * 
     * @param clientAccountID
     * @param licenseID
     * @param clientPassword
     * @param clientUsername
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PostLicense")
    @WebResult(partName = "return")
    public String postLicense(
        @WebParam(name = "clientAccountID", partName = "clientAccountID")
        String clientAccountID,
        @WebParam(name = "clientUsername", partName = "clientUsername")
        String clientUsername,
        @WebParam(name = "clientPassword", partName = "clientPassword")
        String clientPassword,
        @WebParam(name = "licenseID", partName = "licenseID")
        String licenseID);

    /**
     * 
     * @param clientAccountID
     * @param scoreData
     * @param clientPassword
     * @param talentscoutData
     * @param clientUsername
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PostScore")
    @WebResult(partName = "return")
    public String postScore(
        @WebParam(name = "clientAccountID", partName = "clientAccountID")
        String clientAccountID,
        @WebParam(name = "clientUsername", partName = "clientUsername")
        String clientUsername,
        @WebParam(name = "clientPassword", partName = "clientPassword")
        String clientPassword,
        @WebParam(name = "talentscoutData", partName = "talentscoutData")
        String talentscoutData,
        @WebParam(name = "scoreData", partName = "scoreData")
        String scoreData);

    /**
     * 
     * @param clientAccountID
     * @param licenseID
     * @param clientPassword
     * @param clientUsername
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AccountQuery")
    @WebResult(partName = "return")
    public String accountQuery(
        @WebParam(name = "licenseID", partName = "licenseID")
        String licenseID,
        @WebParam(name = "clientAccountID", partName = "clientAccountID")
        String clientAccountID,
        @WebParam(name = "clientUsername", partName = "clientUsername")
        String clientUsername,
        @WebParam(name = "clientPassword", partName = "clientPassword")
        String clientPassword);

    /**
     * 
     * @param clientAccountID
     * @param showOptions
     * @param reportSettings
     * @param clientPassword
     * @param reportType
     * @param testID
     * @param testName
     * @param clientUsername
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PostNewTest")
    @WebResult(partName = "return")
    public String postNewTest(
        @WebParam(name = "clientAccountID", partName = "clientAccountID")
        String clientAccountID,
        @WebParam(name = "clientUsername", partName = "clientUsername")
        String clientUsername,
        @WebParam(name = "clientPassword", partName = "clientPassword")
        String clientPassword,
        @WebParam(name = "testID", partName = "testID")
        String testID,
        @WebParam(name = "testName", partName = "testName")
        String testName,
        @WebParam(name = "reportType", partName = "reportType")
        String reportType,
        @WebParam(name = "showOptions", partName = "showOptions")
        String showOptions,
        @WebParam(name = "reportSettings", partName = "reportSettings")
        String reportSettings);

    /**
     * 
     * @param emailAddr
     * @param licenseID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AccountCreate")
    @WebResult(partName = "return")
    public String accountCreate(
        @WebParam(name = "licenseID", partName = "licenseID")
        String licenseID,
        @WebParam(name = "emailAddr", partName = "emailAddr")
        String emailAddr);

    /**
     * 
     * @param clientAccountID
     * @param clientPassword
     * @param testID
     * @param testName
     * @param clientUsername
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TestExists")
    @WebResult(partName = "return")
    public String testExists(
        @WebParam(name = "clientAccountID", partName = "clientAccountID")
        String clientAccountID,
        @WebParam(name = "clientUsername", partName = "clientUsername")
        String clientUsername,
        @WebParam(name = "clientPassword", partName = "clientPassword")
        String clientPassword,
        @WebParam(name = "testID", partName = "testID")
        String testID,
        @WebParam(name = "testName", partName = "testName")
        String testName);

}

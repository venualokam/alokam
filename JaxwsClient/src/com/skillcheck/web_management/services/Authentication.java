
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
@WebService(name = "Authentication", targetNamespace = "http://webtest.skillcheck.com")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Authentication {


    /**
     * 
     * @param password
     * @param accountId
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Authenticate")
    @WebResult(partName = "return")
    public String authenticate(
        @WebParam(name = "username", partName = "username")
        String username,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "accountId", partName = "accountId")
        String accountId);

    /**
     * 
     * @param password
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PasswordStrengthValidation")
    @WebResult(partName = "return")
    public String passwordStrengthValidation(
        @WebParam(name = "password", partName = "password")
        String password);

    /**
     * 
     * @param accountId
     * @param username
     * @param currentPassword
     * @param newPassword
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PasswordChangeRequest")
    @WebResult(partName = "return")
    public String passwordChangeRequest(
        @WebParam(name = "username", partName = "username")
        String username,
        @WebParam(name = "accountId", partName = "accountId")
        String accountId,
        @WebParam(name = "currentPassword", partName = "currentPassword")
        String currentPassword,
        @WebParam(name = "newPassword", partName = "newPassword")
        String newPassword);

    /**
     * 
     * @param userName
     * @param accountId
     * @param emailAddress
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PasswordResetRequest")
    @WebResult(partName = "return")
    public String passwordResetRequest(
        @WebParam(name = "emailAddress", partName = "emailAddress")
        String emailAddress,
        @WebParam(name = "userName", partName = "userName")
        String userName,
        @WebParam(name = "accountId", partName = "accountId")
        String accountId);

}

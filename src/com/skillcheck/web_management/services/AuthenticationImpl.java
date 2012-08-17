package com.skillcheck.web_management.services;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 7/25/12
 * Time: 1:32 PM
 */
@WebService(endpointInterface="com.skillcheck.web_management.services.Authentication", portName = "AuthenticationSoapPort",serviceName = "AuthenticationService")
public class AuthenticationImpl implements Authentication{
    public String authenticate(@WebParam(name = "username", partName = "username") String username, @WebParam(name = "password", partName = "password") String password, @WebParam(name = "accountId", partName = "accountId") String accountId) {
        System.out.print("sadasdasd");
        return "ALOKAM VENU TEST";  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String passwordStrengthValidation(@WebParam(name = "password", partName = "password") String password) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String passwordChangeRequest(@WebParam(name = "username", partName = "username") String username, @WebParam(name = "accountId", partName = "accountId") String accountId, @WebParam(name = "currentPassword", partName = "currentPassword") String currentPassword, @WebParam(name = "newPassword", partName = "newPassword") String newPassword) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String passwordResetRequest(@WebParam(name = "emailAddress", partName = "emailAddress") String emailAddress, @WebParam(name = "userName", partName = "userName") String userName, @WebParam(name = "accountId", partName = "accountId") String accountId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

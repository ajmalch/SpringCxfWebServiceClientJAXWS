
package com.example.webservice.impl;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;
import com.example.webservice.AddUserDetailsResponse;
import com.example.webservice.GetUserDetailsResponse;
import com.example.webservice.ObjectFactory;
import com.example.webservice.UserDetails;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IBankAccountService", targetNamespace = "http://webservice.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IBankAccountService {


    /**
     * 
     * @param userName
     * @return
     *     returns javax.xml.ws.Response<com.example.webservice.GetUserDetailsResponse>
     */
    @WebMethod(operationName = "getUserDetails")
    @RequestWrapper(localName = "getUserDetails", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.GetUserDetails")
    @ResponseWrapper(localName = "getUserDetailsResponse", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.GetUserDetailsResponse")
    public Response<GetUserDetailsResponse> getUserDetailsAsync(
        @WebParam(name = "userName", targetNamespace = "")
        String userName);

    /**
     * 
     * @param asyncHandler
     * @param userName
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getUserDetails")
    @RequestWrapper(localName = "getUserDetails", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.GetUserDetails")
    @ResponseWrapper(localName = "getUserDetailsResponse", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.GetUserDetailsResponse")
    public Future<?> getUserDetailsAsync(
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetUserDetailsResponse> asyncHandler);

    /**
     * 
     * @param userName
     * @return
     *     returns com.example.webservice.UserDetails
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserDetails", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.GetUserDetails")
    @ResponseWrapper(localName = "getUserDetailsResponse", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.GetUserDetailsResponse")
    public UserDetails getUserDetails(
        @WebParam(name = "userName", targetNamespace = "")
        String userName);

    /**
     * 
     * @param user
     * @return
     *     returns javax.xml.ws.Response<com.example.webservice.AddUserDetailsResponse>
     */
    @WebMethod(operationName = "addUserDetails")
    @RequestWrapper(localName = "addUserDetails", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.AddUserDetails")
    @ResponseWrapper(localName = "addUserDetailsResponse", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.AddUserDetailsResponse")
    public Response<AddUserDetailsResponse> addUserDetailsAsync(
        @WebParam(name = "user", targetNamespace = "")
        UserDetails user);

    /**
     * 
     * @param asyncHandler
     * @param user
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "addUserDetails")
    @RequestWrapper(localName = "addUserDetails", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.AddUserDetails")
    @ResponseWrapper(localName = "addUserDetailsResponse", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.AddUserDetailsResponse")
    public Future<?> addUserDetailsAsync(
        @WebParam(name = "user", targetNamespace = "")
        UserDetails user,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<AddUserDetailsResponse> asyncHandler);

    /**
     * 
     * @param user
     */
    @WebMethod
    @RequestWrapper(localName = "addUserDetails", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.AddUserDetails")
    @ResponseWrapper(localName = "addUserDetailsResponse", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.AddUserDetailsResponse")
    public void addUserDetails(
        @WebParam(name = "user", targetNamespace = "")
        UserDetails user);

}

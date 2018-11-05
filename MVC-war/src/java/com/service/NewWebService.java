/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

//import com.session.UsersFacade;
import com.session.UsersFacadeLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author azaxa
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
    
    @EJB
    UsersFacadeLocal  usersLogin ;

    /**
     * This is a sample web service operation
//
     * @param name
     * @param password */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }
    
      @WebMethod(operationName = "checkLogin")
    public boolean checkLogin(@WebParam(name = "name") String name,@WebParam(name = "password") String password) {
        return usersLogin.checkLogin(name, password);
        
    }
}

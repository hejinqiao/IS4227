/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author chenliyuquan
 */
@WebService(serviceName = "TestNewWebService", targetNamespace = "http://my.org/ns/")
public class TestNewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation1")
    public String operation1(@WebParam(name = "input1") String input1, @WebParam(name = "input2") String input2) {
        //TODO write your implementation code here:
        return input1+input2;
    }
}

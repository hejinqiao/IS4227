/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import java.lang.Object;

/**
 *
 * @author chenliyuquan
 */
@WebService(serviceName = "TestWebService")
@Stateless()
public class TestWebService {
    
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
    @WebMethod(operationName = "print")
    public String print(@WebParam(name = "input1") String input1, @WebParam(name = "input2") String input2) {
        //TODO write your implementation code here:
        System.out.println("Webservice called");
        return input1+" "+input2;
    }
}

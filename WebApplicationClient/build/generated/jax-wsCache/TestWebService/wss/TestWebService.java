
package wss;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestWebService", targetNamespace = "http://WSS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestWebService {


    /**
     * 
     * @param input2
     * @param input1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "print", targetNamespace = "http://WSS/", className = "wss.Print")
    @ResponseWrapper(localName = "printResponse", targetNamespace = "http://WSS/", className = "wss.PrintResponse")
    @Action(input = "http://WSS/TestWebService/printRequest", output = "http://WSS/TestWebService/printResponse")
    public String print(
        @WebParam(name = "input1", targetNamespace = "")
        String input1,
        @WebParam(name = "input2", targetNamespace = "")
        String input2);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://WSS/", className = "wss.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://WSS/", className = "wss.HelloResponse")
    @Action(input = "http://WSS/TestWebService/helloRequest", output = "http://WSS/TestWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}

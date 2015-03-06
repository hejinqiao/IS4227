
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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AccountMgtWS", targetNamespace = "http://WSS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AccountMgtWS {


    /**
     * 
     * @param password
     * @param email
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://WSS/", className = "wss.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://WSS/", className = "wss.LoginResponse")
    @Action(input = "http://WSS/AccountMgtWS/loginRequest", output = "http://WSS/AccountMgtWS/loginResponse")
    public String login(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password);

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
    @Action(input = "http://WSS/AccountMgtWS/helloRequest", output = "http://WSS/AccountMgtWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}

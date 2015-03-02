
package wss;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TestWebService", targetNamespace = "http://WSS/", wsdlLocation = "http://localhost:8080/TestWebService/TestWebService?WSDL")
public class TestWebService_Service
    extends Service
{

    private final static URL TESTWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TESTWEBSERVICE_EXCEPTION;
    private final static QName TESTWEBSERVICE_QNAME = new QName("http://WSS/", "TestWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/TestWebService/TestWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TESTWEBSERVICE_WSDL_LOCATION = url;
        TESTWEBSERVICE_EXCEPTION = e;
    }

    public TestWebService_Service() {
        super(__getWsdlLocation(), TESTWEBSERVICE_QNAME);
    }

    public TestWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TESTWEBSERVICE_QNAME, features);
    }

    public TestWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, TESTWEBSERVICE_QNAME);
    }

    public TestWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TESTWEBSERVICE_QNAME, features);
    }

    public TestWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TestWebService
     */
    @WebEndpoint(name = "TestWebServicePort")
    public TestWebService getTestWebServicePort() {
        return super.getPort(new QName("http://WSS/", "TestWebServicePort"), TestWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TestWebService
     */
    @WebEndpoint(name = "TestWebServicePort")
    public TestWebService getTestWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WSS/", "TestWebServicePort"), TestWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TESTWEBSERVICE_EXCEPTION!= null) {
            throw TESTWEBSERVICE_EXCEPTION;
        }
        return TESTWEBSERVICE_WSDL_LOCATION;
    }

}

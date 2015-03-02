
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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AccountMgtWS", targetNamespace = "http://WSS/", wsdlLocation = "http://localhost:8080/AccountMgtWS/AccountMgtWS?WSDL")
public class AccountMgtWS_Service
    extends Service
{

    private final static URL ACCOUNTMGTWS_WSDL_LOCATION;
    private final static WebServiceException ACCOUNTMGTWS_EXCEPTION;
    private final static QName ACCOUNTMGTWS_QNAME = new QName("http://WSS/", "AccountMgtWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AccountMgtWS/AccountMgtWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACCOUNTMGTWS_WSDL_LOCATION = url;
        ACCOUNTMGTWS_EXCEPTION = e;
    }

    public AccountMgtWS_Service() {
        super(__getWsdlLocation(), ACCOUNTMGTWS_QNAME);
    }

    public AccountMgtWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACCOUNTMGTWS_QNAME, features);
    }

    public AccountMgtWS_Service(URL wsdlLocation) {
        super(wsdlLocation, ACCOUNTMGTWS_QNAME);
    }

    public AccountMgtWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACCOUNTMGTWS_QNAME, features);
    }

    public AccountMgtWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountMgtWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AccountMgtWS
     */
    @WebEndpoint(name = "AccountMgtWSPort")
    public AccountMgtWS getAccountMgtWSPort() {
        return super.getPort(new QName("http://WSS/", "AccountMgtWSPort"), AccountMgtWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountMgtWS
     */
    @WebEndpoint(name = "AccountMgtWSPort")
    public AccountMgtWS getAccountMgtWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WSS/", "AccountMgtWSPort"), AccountMgtWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCOUNTMGTWS_EXCEPTION!= null) {
            throw ACCOUNTMGTWS_EXCEPTION;
        }
        return ACCOUNTMGTWS_WSDL_LOCATION;
    }

}
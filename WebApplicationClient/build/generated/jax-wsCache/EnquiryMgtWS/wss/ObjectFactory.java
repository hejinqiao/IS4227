
package wss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wss package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ViewOneEnquiry_QNAME = new QName("http://WSS/", "viewOneEnquiry");
    private final static QName _AccountNotFoundException_QNAME = new QName("http://WSS/", "AccountNotFoundException");
    private final static QName _ProcessEnquiry_QNAME = new QName("http://WSS/", "processEnquiry");
    private final static QName _SubmitEnquery_QNAME = new QName("http://WSS/", "submitEnquery");
    private final static QName _ViewOneEnquiryResponse_QNAME = new QName("http://WSS/", "viewOneEnquiryResponse");
    private final static QName _SubmitEnqueryResponse_QNAME = new QName("http://WSS/", "submitEnqueryResponse");
    private final static QName _ProcessEnquiryResponse_QNAME = new QName("http://WSS/", "processEnquiryResponse");
    private final static QName _ViewAllEnquiry_QNAME = new QName("http://WSS/", "viewAllEnquiry");
    private final static QName _EnquiryNotFoundException_QNAME = new QName("http://WSS/", "EnquiryNotFoundException");
    private final static QName _ViewAllEnquiryResponse_QNAME = new QName("http://WSS/", "viewAllEnquiryResponse");
    private final static QName _AdminNotFoundException_QNAME = new QName("http://WSS/", "AdminNotFoundException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitEnqueryResponse }
     * 
     */
    public SubmitEnqueryResponse createSubmitEnqueryResponse() {
        return new SubmitEnqueryResponse();
    }

    /**
     * Create an instance of {@link ProcessEnquiryResponse }
     * 
     */
    public ProcessEnquiryResponse createProcessEnquiryResponse() {
        return new ProcessEnquiryResponse();
    }

    /**
     * Create an instance of {@link ViewAllEnquiry }
     * 
     */
    public ViewAllEnquiry createViewAllEnquiry() {
        return new ViewAllEnquiry();
    }

    /**
     * Create an instance of {@link EnquiryNotFoundException }
     * 
     */
    public EnquiryNotFoundException createEnquiryNotFoundException() {
        return new EnquiryNotFoundException();
    }

    /**
     * Create an instance of {@link ViewAllEnquiryResponse }
     * 
     */
    public ViewAllEnquiryResponse createViewAllEnquiryResponse() {
        return new ViewAllEnquiryResponse();
    }

    /**
     * Create an instance of {@link AdminNotFoundException }
     * 
     */
    public AdminNotFoundException createAdminNotFoundException() {
        return new AdminNotFoundException();
    }

    /**
     * Create an instance of {@link ViewOneEnquiry }
     * 
     */
    public ViewOneEnquiry createViewOneEnquiry() {
        return new ViewOneEnquiry();
    }

    /**
     * Create an instance of {@link AccountNotFoundException }
     * 
     */
    public AccountNotFoundException createAccountNotFoundException() {
        return new AccountNotFoundException();
    }

    /**
     * Create an instance of {@link ProcessEnquiry }
     * 
     */
    public ProcessEnquiry createProcessEnquiry() {
        return new ProcessEnquiry();
    }

    /**
     * Create an instance of {@link SubmitEnquery }
     * 
     */
    public SubmitEnquery createSubmitEnquery() {
        return new SubmitEnquery();
    }

    /**
     * Create an instance of {@link ViewOneEnquiryResponse }
     * 
     */
    public ViewOneEnquiryResponse createViewOneEnquiryResponse() {
        return new ViewOneEnquiryResponse();
    }

    /**
     * Create an instance of {@link EnquiryEntity }
     * 
     */
    public EnquiryEntity createEnquiryEntity() {
        return new EnquiryEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewOneEnquiry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewOneEnquiry")
    public JAXBElement<ViewOneEnquiry> createViewOneEnquiry(ViewOneEnquiry value) {
        return new JAXBElement<ViewOneEnquiry>(_ViewOneEnquiry_QNAME, ViewOneEnquiry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "AccountNotFoundException")
    public JAXBElement<AccountNotFoundException> createAccountNotFoundException(AccountNotFoundException value) {
        return new JAXBElement<AccountNotFoundException>(_AccountNotFoundException_QNAME, AccountNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessEnquiry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "processEnquiry")
    public JAXBElement<ProcessEnquiry> createProcessEnquiry(ProcessEnquiry value) {
        return new JAXBElement<ProcessEnquiry>(_ProcessEnquiry_QNAME, ProcessEnquiry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitEnquery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "submitEnquery")
    public JAXBElement<SubmitEnquery> createSubmitEnquery(SubmitEnquery value) {
        return new JAXBElement<SubmitEnquery>(_SubmitEnquery_QNAME, SubmitEnquery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewOneEnquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewOneEnquiryResponse")
    public JAXBElement<ViewOneEnquiryResponse> createViewOneEnquiryResponse(ViewOneEnquiryResponse value) {
        return new JAXBElement<ViewOneEnquiryResponse>(_ViewOneEnquiryResponse_QNAME, ViewOneEnquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitEnqueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "submitEnqueryResponse")
    public JAXBElement<SubmitEnqueryResponse> createSubmitEnqueryResponse(SubmitEnqueryResponse value) {
        return new JAXBElement<SubmitEnqueryResponse>(_SubmitEnqueryResponse_QNAME, SubmitEnqueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessEnquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "processEnquiryResponse")
    public JAXBElement<ProcessEnquiryResponse> createProcessEnquiryResponse(ProcessEnquiryResponse value) {
        return new JAXBElement<ProcessEnquiryResponse>(_ProcessEnquiryResponse_QNAME, ProcessEnquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllEnquiry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewAllEnquiry")
    public JAXBElement<ViewAllEnquiry> createViewAllEnquiry(ViewAllEnquiry value) {
        return new JAXBElement<ViewAllEnquiry>(_ViewAllEnquiry_QNAME, ViewAllEnquiry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnquiryNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "EnquiryNotFoundException")
    public JAXBElement<EnquiryNotFoundException> createEnquiryNotFoundException(EnquiryNotFoundException value) {
        return new JAXBElement<EnquiryNotFoundException>(_EnquiryNotFoundException_QNAME, EnquiryNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllEnquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewAllEnquiryResponse")
    public JAXBElement<ViewAllEnquiryResponse> createViewAllEnquiryResponse(ViewAllEnquiryResponse value) {
        return new JAXBElement<ViewAllEnquiryResponse>(_ViewAllEnquiryResponse_QNAME, ViewAllEnquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "AdminNotFoundException")
    public JAXBElement<AdminNotFoundException> createAdminNotFoundException(AdminNotFoundException value) {
        return new JAXBElement<AdminNotFoundException>(_AdminNotFoundException_QNAME, AdminNotFoundException.class, null, value);
    }

}

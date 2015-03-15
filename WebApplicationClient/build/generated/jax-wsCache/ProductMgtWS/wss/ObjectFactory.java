
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

    private final static QName _ViewAllCommentsOfProduct_QNAME = new QName("http://WSS/", "viewAllCommentsOfProduct");
    private final static QName _SearchProductResponse_QNAME = new QName("http://WSS/", "searchProductResponse");
    private final static QName _ViewAllCommentsOfProductResponse_QNAME = new QName("http://WSS/", "viewAllCommentsOfProductResponse");
    private final static QName _ProductNotFoundException_QNAME = new QName("http://WSS/", "ProductNotFoundException");
    private final static QName _AccountNotFoundException_QNAME = new QName("http://WSS/", "AccountNotFoundException");
    private final static QName _SearchProduct1_QNAME = new QName("http://WSS/", "searchProduct_1");
    private final static QName _SearchProduct1Response_QNAME = new QName("http://WSS/", "searchProduct_1Response");
    private final static QName _SearchProduct_QNAME = new QName("http://WSS/", "searchProduct");
    private final static QName _ViewAllCommentsFromAccountResponse_QNAME = new QName("http://WSS/", "viewAllCommentsFromAccountResponse");
    private final static QName _ViewAllCommentsFromAccount_QNAME = new QName("http://WSS/", "viewAllCommentsFromAccount");
    private final static QName _RateProductResponse_QNAME = new QName("http://WSS/", "rateProductResponse");
    private final static QName _RateProduct_QNAME = new QName("http://WSS/", "rateProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchProduct1 }
     * 
     */
    public SearchProduct1 createSearchProduct1() {
        return new SearchProduct1();
    }

    /**
     * Create an instance of {@link SearchProduct1Response }
     * 
     */
    public SearchProduct1Response createSearchProduct1Response() {
        return new SearchProduct1Response();
    }

    /**
     * Create an instance of {@link SearchProduct }
     * 
     */
    public SearchProduct createSearchProduct() {
        return new SearchProduct();
    }

    /**
     * Create an instance of {@link ViewAllCommentsFromAccountResponse }
     * 
     */
    public ViewAllCommentsFromAccountResponse createViewAllCommentsFromAccountResponse() {
        return new ViewAllCommentsFromAccountResponse();
    }

    /**
     * Create an instance of {@link ViewAllCommentsFromAccount }
     * 
     */
    public ViewAllCommentsFromAccount createViewAllCommentsFromAccount() {
        return new ViewAllCommentsFromAccount();
    }

    /**
     * Create an instance of {@link RateProductResponse }
     * 
     */
    public RateProductResponse createRateProductResponse() {
        return new RateProductResponse();
    }

    /**
     * Create an instance of {@link RateProduct }
     * 
     */
    public RateProduct createRateProduct() {
        return new RateProduct();
    }

    /**
     * Create an instance of {@link ViewAllCommentsOfProduct }
     * 
     */
    public ViewAllCommentsOfProduct createViewAllCommentsOfProduct() {
        return new ViewAllCommentsOfProduct();
    }

    /**
     * Create an instance of {@link SearchProductResponse }
     * 
     */
    public SearchProductResponse createSearchProductResponse() {
        return new SearchProductResponse();
    }

    /**
     * Create an instance of {@link ViewAllCommentsOfProductResponse }
     * 
     */
    public ViewAllCommentsOfProductResponse createViewAllCommentsOfProductResponse() {
        return new ViewAllCommentsOfProductResponse();
    }

    /**
     * Create an instance of {@link ProductNotFoundException }
     * 
     */
    public ProductNotFoundException createProductNotFoundException() {
        return new ProductNotFoundException();
    }

    /**
     * Create an instance of {@link AccountNotFoundException }
     * 
     */
    public AccountNotFoundException createAccountNotFoundException() {
        return new AccountNotFoundException();
    }

    /**
     * Create an instance of {@link ShoppingCartEntity }
     * 
     */
    public ShoppingCartEntity createShoppingCartEntity() {
        return new ShoppingCartEntity();
    }

    /**
     * Create an instance of {@link TransactionEntity }
     * 
     */
    public TransactionEntity createTransactionEntity() {
        return new TransactionEntity();
    }

    /**
     * Create an instance of {@link OrderEntity }
     * 
     */
    public OrderEntity createOrderEntity() {
        return new OrderEntity();
    }

    /**
     * Create an instance of {@link ItemPurchasedEntity }
     * 
     */
    public ItemPurchasedEntity createItemPurchasedEntity() {
        return new ItemPurchasedEntity();
    }

    /**
     * Create an instance of {@link CommentEntity }
     * 
     */
    public CommentEntity createCommentEntity() {
        return new CommentEntity();
    }

    /**
     * Create an instance of {@link AccountEntity }
     * 
     */
    public AccountEntity createAccountEntity() {
        return new AccountEntity();
    }

    /**
     * Create an instance of {@link RegionEntity }
     * 
     */
    public RegionEntity createRegionEntity() {
        return new RegionEntity();
    }

    /**
     * Create an instance of {@link ItemEntity }
     * 
     */
    public ItemEntity createItemEntity() {
        return new ItemEntity();
    }

    /**
     * Create an instance of {@link CategoryEntity }
     * 
     */
    public CategoryEntity createCategoryEntity() {
        return new CategoryEntity();
    }

    /**
     * Create an instance of {@link WineryEntity }
     * 
     */
    public WineryEntity createWineryEntity() {
        return new WineryEntity();
    }

    /**
     * Create an instance of {@link PurchaseEntity }
     * 
     */
    public PurchaseEntity createPurchaseEntity() {
        return new PurchaseEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllCommentsOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewAllCommentsOfProduct")
    public JAXBElement<ViewAllCommentsOfProduct> createViewAllCommentsOfProduct(ViewAllCommentsOfProduct value) {
        return new JAXBElement<ViewAllCommentsOfProduct>(_ViewAllCommentsOfProduct_QNAME, ViewAllCommentsOfProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "searchProductResponse")
    public JAXBElement<SearchProductResponse> createSearchProductResponse(SearchProductResponse value) {
        return new JAXBElement<SearchProductResponse>(_SearchProductResponse_QNAME, SearchProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllCommentsOfProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewAllCommentsOfProductResponse")
    public JAXBElement<ViewAllCommentsOfProductResponse> createViewAllCommentsOfProductResponse(ViewAllCommentsOfProductResponse value) {
        return new JAXBElement<ViewAllCommentsOfProductResponse>(_ViewAllCommentsOfProductResponse_QNAME, ViewAllCommentsOfProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "ProductNotFoundException")
    public JAXBElement<ProductNotFoundException> createProductNotFoundException(ProductNotFoundException value) {
        return new JAXBElement<ProductNotFoundException>(_ProductNotFoundException_QNAME, ProductNotFoundException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProduct1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "searchProduct_1")
    public JAXBElement<SearchProduct1> createSearchProduct1(SearchProduct1 value) {
        return new JAXBElement<SearchProduct1>(_SearchProduct1_QNAME, SearchProduct1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProduct1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "searchProduct_1Response")
    public JAXBElement<SearchProduct1Response> createSearchProduct1Response(SearchProduct1Response value) {
        return new JAXBElement<SearchProduct1Response>(_SearchProduct1Response_QNAME, SearchProduct1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "searchProduct")
    public JAXBElement<SearchProduct> createSearchProduct(SearchProduct value) {
        return new JAXBElement<SearchProduct>(_SearchProduct_QNAME, SearchProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllCommentsFromAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewAllCommentsFromAccountResponse")
    public JAXBElement<ViewAllCommentsFromAccountResponse> createViewAllCommentsFromAccountResponse(ViewAllCommentsFromAccountResponse value) {
        return new JAXBElement<ViewAllCommentsFromAccountResponse>(_ViewAllCommentsFromAccountResponse_QNAME, ViewAllCommentsFromAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllCommentsFromAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewAllCommentsFromAccount")
    public JAXBElement<ViewAllCommentsFromAccount> createViewAllCommentsFromAccount(ViewAllCommentsFromAccount value) {
        return new JAXBElement<ViewAllCommentsFromAccount>(_ViewAllCommentsFromAccount_QNAME, ViewAllCommentsFromAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "rateProductResponse")
    public JAXBElement<RateProductResponse> createRateProductResponse(RateProductResponse value) {
        return new JAXBElement<RateProductResponse>(_RateProductResponse_QNAME, RateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "rateProduct")
    public JAXBElement<RateProduct> createRateProduct(RateProduct value) {
        return new JAXBElement<RateProduct>(_RateProduct_QNAME, RateProduct.class, null, value);
    }

}

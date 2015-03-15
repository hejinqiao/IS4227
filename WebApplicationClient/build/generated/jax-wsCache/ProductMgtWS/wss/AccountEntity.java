
package wss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentList" type="{http://WSS/}commentEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchase" type="{http://WSS/}purchaseEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shoppingcart" type="{http://WSS/}shoppingCartEntity" minOccurs="0"/>
 *         &lt;element name="transactions" type="{http://WSS/}transactionEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountEntity", propOrder = {
    "activationCode",
    "commentList",
    "email",
    "gender",
    "id",
    "isBlocked",
    "isMember",
    "name",
    "password",
    "purchase",
    "shoppingcart",
    "transactions"
})
public class AccountEntity {

    protected String activationCode;
    @XmlElement(nillable = true)
    protected List<CommentEntity> commentList;
    protected String email;
    protected String gender;
    protected Long id;
    protected boolean isBlocked;
    protected Boolean isMember;
    protected String name;
    protected String password;
    @XmlElement(nillable = true)
    protected List<PurchaseEntity> purchase;
    protected ShoppingCartEntity shoppingcart;
    @XmlElement(nillable = true)
    protected List<TransactionEntity> transactions;

    /**
     * Gets the value of the activationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Sets the value of the activationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

    /**
     * Gets the value of the commentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentEntity }
     * 
     * 
     */
    public List<CommentEntity> getCommentList() {
        if (commentList == null) {
            commentList = new ArrayList<CommentEntity>();
        }
        return this.commentList;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isBlocked property.
     * 
     */
    public boolean isIsBlocked() {
        return isBlocked;
    }

    /**
     * Sets the value of the isBlocked property.
     * 
     */
    public void setIsBlocked(boolean value) {
        this.isBlocked = value;
    }

    /**
     * Gets the value of the isMember property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMember() {
        return isMember;
    }

    /**
     * Sets the value of the isMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMember(Boolean value) {
        this.isMember = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseEntity }
     * 
     * 
     */
    public List<PurchaseEntity> getPurchase() {
        if (purchase == null) {
            purchase = new ArrayList<PurchaseEntity>();
        }
        return this.purchase;
    }

    /**
     * Gets the value of the shoppingcart property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartEntity }
     *     
     */
    public ShoppingCartEntity getShoppingcart() {
        return shoppingcart;
    }

    /**
     * Sets the value of the shoppingcart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartEntity }
     *     
     */
    public void setShoppingcart(ShoppingCartEntity value) {
        this.shoppingcart = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionEntity }
     * 
     * 
     */
    public List<TransactionEntity> getTransactions() {
        if (transactions == null) {
            transactions = new ArrayList<TransactionEntity>();
        }
        return this.transactions;
    }

}

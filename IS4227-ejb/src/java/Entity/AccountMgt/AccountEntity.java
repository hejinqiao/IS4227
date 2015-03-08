package Entity.AccountMgt;


import Entity.ProductMgt.CommentEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
@Entity
public class AccountEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    private String email;
    private String password;
    private String name;
    private String gender;
    private Boolean isMember;
    
    /************************/
    //NEW ATTRIBUTES
    private boolean isBlocked;
    private String activationCode;
    /************************/
    
    //account -- pruchase : 1 --> M
    @OneToMany
    private List<PurchaseEntity> purchase;

    //account -- transaction: 1-->M
    @OneToMany
    private List<TransactionEntity> transactions;

    //account -- shoppingcart : 1 --->1
    @OneToOne
    private ShoppingCartEntity shoppingcart;

    @OneToMany
    private List<EnquiryEntity> enquiryList;
    
    @OneToMany
    private List<CommentEntity> commentList;
    public  AccountEntity(){
    
    }
    
    public AccountEntity (String email, String password, String name, String gender){
        this.email=email;
        this.password=password;
        this.name=name;
        this.gender=gender;
        isMember=false;
        
        /************************/
        //NEW ATTRIBUTE
        isBlocked=false;
        /************************/
        

        purchase=new ArrayList<PurchaseEntity>();

        shoppingcart=new ShoppingCartEntity();
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /************************/
    //TYPO Passwrod-->Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String passwrod) {
        this.password = password;
    }
    /************************/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getIsMember() {
        return isMember;
    }

    public void setIsMember(Boolean isMember) {
        this.isMember = isMember;
    }

    public List<PurchaseEntity> getPurchase() {
        return purchase;
    }

    public void setPurchase(List<PurchaseEntity> purchase) {

        this.purchase = purchase;
    }

    public ShoppingCartEntity getShoppingcart() {
        return shoppingcart;
    }

    public void setShoppingcart(ShoppingCartEntity shoppingcart) {
        this.shoppingcart = shoppingcart;
    }
    
     /**
     * @return **********************/
    // NEW ATTRIBUTES
    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;

    }   

    public List<TransactionEntity> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionEntity> transactions) {
        this.transactions = transactions;

    } 
    
     public List<CommentEntity> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentEntity> commentList) {
        this.commentList = commentList;

    }

    public List<EnquiryEntity> getEnquiryList() {
        return enquiryList;
    }

    public void setEnquiryList(List<EnquiryEntity> enquiryList) {
        this.enquiryList = enquiryList;
    }
    /************************/
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.AccountMgt;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Administrator
 */
@Entity
public class PurchaseEntity implements Serializable{
     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar purchasedDate = Calendar.getInstance();
    private Integer quantity;
    private Double totalPrice;
    private boolean status;
    
    //purchase -- order :  1 -->1
    @OneToOne
    private OrderEntity order;
    
    //purchase -- transaction : M --> 1
    @ManyToOne
    private TransactionEntity transaction;
    
    @ManyToOne
    private AccountEntity account;

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public PurchaseEntity(){
    }

    
    public PurchaseEntity(Calendar date, Integer quantity, Double totalPrice,OrderEntity order, TransactionEntity transaction){
        this.quantity=quantity;
        this.purchasedDate=date;
        this.totalPrice=totalPrice;
        this.order=order;
        this.transaction=transaction;
        this.status=true;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Calendar purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }
    
    public TransactionEntity getTransaction() {
        return transaction;
    }

    public void setTransaction(TransactionEntity transaction) {
        this.transaction = transaction;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

 
    
    
}

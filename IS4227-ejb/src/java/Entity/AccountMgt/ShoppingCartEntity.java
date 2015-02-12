/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.AccountMgt;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Administrator
 */
public class ShoppingCartEntity {
      private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //????
    private String status;
    
    //shoppingcart -- account : 1<-->1
    @OneToOne
    AccountEntity account;
    
    //shoppingcart -- order : 1 <---> m
    @OneToMany
    List<OrderEntity> orderList=new ArrayList<>(); 
    
    public ShoppingCartEntity(){
    }
    
    public ShoppingCartEntity(AccountEntity account){
        this.account=account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public List<OrderEntity> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderEntity> orderList) {
        this.orderList = orderList;
    }
    
    
}


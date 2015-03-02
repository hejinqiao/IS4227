/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.ProductMgt;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author HanXiangyu
 */
@Entity
public class WineryEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String wineryName;
    private String wineryAddress;
    private String wineryContact;
    
    @OneToMany
    private List<ItemEntity> itemList;

    public WineryEntity() {
    }

    public WineryEntity(String wineryName, String wineryAddress, String wineryContact) {
        this.wineryName = wineryName;
        this.wineryAddress = wineryAddress;
        this.wineryContact = wineryContact;
    }
    
    public String getWineryName() {
        return wineryName;
    }

    public void setWineryName(String wineryName) {
        this.wineryName = wineryName;
    }

    public String getWineryAddress() {
        return wineryAddress;
    }

    public void setWineryAddress(String wineryAddress) {
        this.wineryAddress = wineryAddress;
    }

    public String getWineryContact() {
        return wineryContact;
    }

    public void setWineryContact(String wineryContact) {
        this.wineryContact = wineryContact;
    }

    public List<ItemEntity> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemEntity> itemList) {
        this.itemList = itemList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WineryEntity)) {
            return false;
        }
        WineryEntity other = (WineryEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ProductMgt.WineryEntity[ id=" + id + " ]";
    }
    
}

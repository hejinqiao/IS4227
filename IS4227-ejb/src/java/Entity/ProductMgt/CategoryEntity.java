/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.ProductMgt;

import java.io.Serializable;
import java.util.ArrayList;
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
public class CategoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String categoryName;
    private String categorySpec;
    
//    @OneToMany(mappedBy="category")
//    private List<ItemEntity> itemList;

    public CategoryEntity() {
    }

    public CategoryEntity(String categoryName, String categorySpec) {
        this.categoryName = categoryName;
        this.categorySpec = categorySpec;
//        itemList=new ArrayList<ItemEntity>();
    }        
  
//    public List<ItemEntity> getItemList() {
//        return itemList;
//    }
//
//    public void setItemList(List<ItemEntity> itemList) {
//        this.itemList = itemList;
//    }

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
        if (!(object instanceof CategoryEntity)) {
            return false;
        }
        CategoryEntity other = (CategoryEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.AccountMgt.CategoryEntity[ id=" + id + " ]";
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the categorySpec
     */
    public String getCategorySpec() {
        return categorySpec;
    }

    /**
     * @param categorySpec the categorySpec to set
     */
    public void setCategorySpec(String categorySpec) {
        this.categorySpec = categorySpec;
    }
    
}

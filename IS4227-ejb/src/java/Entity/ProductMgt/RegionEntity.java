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
public class RegionEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String regionName;
    private String country;
    private String regionSpec;
    
    @OneToMany
    private List<ItemEntity> itemList;

    public RegionEntity() {
    }

    public RegionEntity(String regionName, String country, String regionSpec) {
        this.regionName = regionName;
        this.country = country;
        this.regionSpec = regionSpec;
    }  
        
    public List<ItemEntity> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemEntity> itemList) {
        this.itemList = itemList;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegionSpec() {
        return regionSpec;
    }

    public void setRegionSpec(String regionSpec) {
        this.regionSpec = regionSpec;
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
        if (!(object instanceof RegionEntity)) {
            return false;
        }
        RegionEntity other = (RegionEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ProductMgt.RegionEntity[ id=" + id + " ]";
    }
    
}

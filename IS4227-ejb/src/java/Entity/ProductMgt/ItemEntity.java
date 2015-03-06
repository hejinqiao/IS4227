/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.ProductMgt;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author HanXiangyu
 */
@Entity
public class ItemEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String itemName;
    private String vitage;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar expiringDate;
    private String tastingNote;
    
    @ManyToOne
    private CategoryEntity category;
    @ManyToOne
    private RegionEntity region;
    @ManyToOne
    private WineryEntity winery;
    @OneToOne
    private ItemPurchasedEntity itemPurchased;
    @OneToMany
    private List<CommentEntity> commentList;

    public ItemEntity() {
    }

    public List<CommentEntity> getCommentList() {
        return commentList;
    }

    public ItemEntity(String itemName, String vitage, Calendar expiringDate, String tastingNote, CategoryEntity category, RegionEntity region, WineryEntity winery) {
        this.itemName = itemName;
        this.vitage = vitage;
        this.expiringDate = expiringDate;
        this.tastingNote = tastingNote;
        this.category = category;
        this.region = region;
        this.winery = winery;
    }
   
    public void setCommentList(List<CommentEntity> commentList) {
        this.commentList = commentList;
    }

    public RegionEntity getRegion() {
        return region;
    }

    public void setRegion(RegionEntity region) {
        this.region = region;
    }

    public WineryEntity getWinery() {
        return winery;
    }

    public void setWinery(WineryEntity winery) {
        this.winery = winery;
    }

    public ItemPurchasedEntity getItemPurchased() {
        return itemPurchased;
    }

    public void setItemPurchased(ItemPurchasedEntity itemPurchased) {
        this.itemPurchased = itemPurchased;
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
        if (!(object instanceof ItemEntity)) {
            return false;
        }
        ItemEntity other = (ItemEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ProductMgt.ItemEntity[ id=" + id + " ]";
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the vitage
     */
    public String getVitage() {
        return vitage;
    }

    /**
     * @param vitage the vitage to set
     */
    public void setVitage(String vitage) {
        this.vitage = vitage;
    }

    /**
     * @return the expiringDate
     */
    public Calendar getExpiringDate() {
        return expiringDate;
    }

    /**
     * @param expiringDate the expiringDate to set
     */
    public void setExpiringDate(Calendar expiringDate) {
        this.expiringDate = expiringDate;
    }

    /**
     * @return the tastingNote
     */
    public String getTastingNote() {
        return tastingNote;
    }

    /**
     * @param tastingNote the tastingNote to set
     */
    public void setTastingNote(String tastingNote) {
        this.tastingNote = tastingNote;
    }

    /**
     * @return the category
     */
    public CategoryEntity getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
    
}

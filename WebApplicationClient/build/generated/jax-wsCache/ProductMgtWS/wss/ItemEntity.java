
package wss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for itemEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://WSS/}categoryEntity" minOccurs="0"/>
 *         &lt;element name="commentList" type="{http://WSS/}commentEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expiringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemPurchased" type="{http://WSS/}itemPurchasedEntity" minOccurs="0"/>
 *         &lt;element name="region" type="{http://WSS/}regionEntity" minOccurs="0"/>
 *         &lt;element name="tastingNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vitage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="winery" type="{http://WSS/}wineryEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemEntity", propOrder = {
    "category",
    "commentList",
    "expiringDate",
    "id",
    "itemName",
    "itemPurchased",
    "region",
    "tastingNote",
    "vitage",
    "winery"
})
public class ItemEntity {

    protected CategoryEntity category;
    @XmlElement(nillable = true)
    protected List<CommentEntity> commentList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiringDate;
    protected Long id;
    protected String itemName;
    protected ItemPurchasedEntity itemPurchased;
    protected RegionEntity region;
    protected String tastingNote;
    protected String vitage;
    protected WineryEntity winery;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryEntity }
     *     
     */
    public CategoryEntity getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryEntity }
     *     
     */
    public void setCategory(CategoryEntity value) {
        this.category = value;
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
     * Gets the value of the expiringDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiringDate() {
        return expiringDate;
    }

    /**
     * Sets the value of the expiringDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiringDate(XMLGregorianCalendar value) {
        this.expiringDate = value;
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
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemPurchased property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPurchasedEntity }
     *     
     */
    public ItemPurchasedEntity getItemPurchased() {
        return itemPurchased;
    }

    /**
     * Sets the value of the itemPurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPurchasedEntity }
     *     
     */
    public void setItemPurchased(ItemPurchasedEntity value) {
        this.itemPurchased = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link RegionEntity }
     *     
     */
    public RegionEntity getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionEntity }
     *     
     */
    public void setRegion(RegionEntity value) {
        this.region = value;
    }

    /**
     * Gets the value of the tastingNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTastingNote() {
        return tastingNote;
    }

    /**
     * Sets the value of the tastingNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTastingNote(String value) {
        this.tastingNote = value;
    }

    /**
     * Gets the value of the vitage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVitage() {
        return vitage;
    }

    /**
     * Sets the value of the vitage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVitage(String value) {
        this.vitage = value;
    }

    /**
     * Gets the value of the winery property.
     * 
     * @return
     *     possible object is
     *     {@link WineryEntity }
     *     
     */
    public WineryEntity getWinery() {
        return winery;
    }

    /**
     * Sets the value of the winery property.
     * 
     * @param value
     *     allowed object is
     *     {@link WineryEntity }
     *     
     */
    public void setWinery(WineryEntity value) {
        this.winery = value;
    }

}

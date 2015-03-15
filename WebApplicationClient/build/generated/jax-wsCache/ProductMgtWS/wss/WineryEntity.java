
package wss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wineryEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wineryEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="itemList" type="{http://WSS/}itemEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wineryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wineryContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wineryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wineryEntity", propOrder = {
    "id",
    "itemList",
    "wineryAddress",
    "wineryContact",
    "wineryName"
})
public class WineryEntity {

    protected Long id;
    @XmlElement(nillable = true)
    protected List<ItemEntity> itemList;
    protected String wineryAddress;
    protected String wineryContact;
    protected String wineryName;

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
     * Gets the value of the itemList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEntity }
     * 
     * 
     */
    public List<ItemEntity> getItemList() {
        if (itemList == null) {
            itemList = new ArrayList<ItemEntity>();
        }
        return this.itemList;
    }

    /**
     * Gets the value of the wineryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWineryAddress() {
        return wineryAddress;
    }

    /**
     * Sets the value of the wineryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWineryAddress(String value) {
        this.wineryAddress = value;
    }

    /**
     * Gets the value of the wineryContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWineryContact() {
        return wineryContact;
    }

    /**
     * Sets the value of the wineryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWineryContact(String value) {
        this.wineryContact = value;
    }

    /**
     * Gets the value of the wineryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWineryName() {
        return wineryName;
    }

    /**
     * Sets the value of the wineryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWineryName(String value) {
        this.wineryName = value;
    }

}

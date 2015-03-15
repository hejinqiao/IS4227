
package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for addItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wineryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vitage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tastingNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addItem", propOrder = {
    "cateName",
    "regionName",
    "wineryName",
    "itemName",
    "vitage",
    "expiringDate",
    "tastingNote"
})
public class AddItem {

    protected String cateName;
    protected String regionName;
    protected String wineryName;
    protected String itemName;
    protected String vitage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiringDate;
    protected String tastingNote;

    /**
     * Gets the value of the cateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCateName() {
        return cateName;
    }

    /**
     * Sets the value of the cateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCateName(String value) {
        this.cateName = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
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

}

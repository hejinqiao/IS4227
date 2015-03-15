
package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchProduct_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchProduct_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wineryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchProduct_1", propOrder = {
    "wineryName",
    "regionName",
    "cateName"
})
public class SearchProduct1 {

    protected String wineryName;
    protected String regionName;
    protected String cateName;

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

}


package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWineryByName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWineryByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getWineryByName", propOrder = {
    "wineryName"
})
public class GetWineryByName {

    protected String wineryName;

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

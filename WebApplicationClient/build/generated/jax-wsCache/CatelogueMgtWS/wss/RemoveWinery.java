
package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeWinery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeWinery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wineryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeWinery", propOrder = {
    "wineryId"
})
public class RemoveWinery {

    protected String wineryId;

    /**
     * Gets the value of the wineryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWineryId() {
        return wineryId;
    }

    /**
     * Sets the value of the wineryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWineryId(String value) {
        this.wineryId = value;
    }

}

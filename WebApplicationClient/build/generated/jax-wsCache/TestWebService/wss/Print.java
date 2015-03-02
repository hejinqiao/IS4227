
package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for print complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="print">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="input2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "print", propOrder = {
    "input1",
    "input2"
})
public class Print {

    protected String input1;
    protected String input2;

    /**
     * Gets the value of the input1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput1() {
        return input1;
    }

    /**
     * Sets the value of the input1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput1(String value) {
        this.input1 = value;
    }

    /**
     * Gets the value of the input2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput2() {
        return input2;
    }

    /**
     * Sets the value of the input2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput2(String value) {
        this.input2 = value;
    }

}

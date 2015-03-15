
package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processEnquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processEnquiry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adminId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enquiryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="replyContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processEnquiry", propOrder = {
    "adminId",
    "enquiryId",
    "replyContent"
})
public class ProcessEnquiry {

    protected Long adminId;
    protected Long enquiryId;
    protected String replyContent;

    /**
     * Gets the value of the adminId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * Sets the value of the adminId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdminId(Long value) {
        this.adminId = value;
    }

    /**
     * Gets the value of the enquiryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnquiryId() {
        return enquiryId;
    }

    /**
     * Sets the value of the enquiryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnquiryId(Long value) {
        this.enquiryId = value;
    }

    /**
     * Gets the value of the replyContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * Sets the value of the replyContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyContent(String value) {
        this.replyContent = value;
    }

}

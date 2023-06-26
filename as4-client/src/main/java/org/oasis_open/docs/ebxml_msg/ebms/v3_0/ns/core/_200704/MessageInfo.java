
package org.oasis_open.docs.ebxml_msg.ebms.v3_0.ns.core._200704;

import com.migesok.jaxb.adapter.javatime.LocalDateTimeXmlAdapter;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;


/**
 * &lt;p&gt;Java-Klasse f�r MessageInfo complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MessageInfo"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="MessageId" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}non-empty-string"/&amp;gt;
 *         &amp;lt;element name="RefToMessageId" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}non-empty-string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageInfo", propOrder = {
    "timestamp",
    "messageId",
    "refToMessageId"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
public class MessageInfo {

    @XmlElement(name = "Timestamp", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected LocalDateTime timestamp;
    @XmlElement(name = "MessageId", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String messageId;
    @XmlElement(name = "RefToMessageId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String refToMessageId;

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setTimestamp(LocalDateTime value) {
        this.timestamp = value;
    }

    /**
     * Ruft den Wert der messageId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Legt den Wert der messageId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Ruft den Wert der refToMessageId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getRefToMessageId() {
        return refToMessageId;
    }

    /**
     * Legt den Wert der refToMessageId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setRefToMessageId(String value) {
        this.refToMessageId = value;
    }

}

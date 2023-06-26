
package org.oasis_open.docs.ebxml_msg.ebms.v3_0.ns.core._200704;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * &lt;p&gt;Java-Klasse f�r UserMessage complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UserMessage"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MessageInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}MessageInfo"/&amp;gt;
 *         &amp;lt;element name="PartyInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}PartyInfo"/&amp;gt;
 *         &amp;lt;element name="CollaborationInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}CollaborationInfo"/&amp;gt;
 *         &amp;lt;element name="MessageProperties" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}MessageProperties" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PayloadInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}PayloadInfo" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="mpc" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserMessage", propOrder = {
    "messageInfo",
    "partyInfo",
    "collaborationInfo",
    "messageProperties",
    "payloadInfo"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
public class UserMessage {

    @XmlElement(name = "MessageInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected MessageInfo messageInfo;
    @XmlElement(name = "PartyInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected PartyInfo partyInfo;
    @XmlElement(name = "CollaborationInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected CollaborationInfo collaborationInfo;
    @XmlElement(name = "MessageProperties")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected MessageProperties messageProperties;
    @XmlElement(name = "PayloadInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected PayloadInfo payloadInfo;
    @XmlAttribute(name = "mpc")
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String mpc;

    /**
     * Ruft den Wert der messageInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public MessageInfo getMessageInfo() {
        return messageInfo;
    }

    /**
     * Legt den Wert der messageInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setMessageInfo(MessageInfo value) {
        this.messageInfo = value;
    }

    /**
     * Ruft den Wert der partyInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public PartyInfo getPartyInfo() {
        return partyInfo;
    }

    /**
     * Legt den Wert der partyInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setPartyInfo(PartyInfo value) {
        this.partyInfo = value;
    }

    /**
     * Ruft den Wert der collaborationInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public CollaborationInfo getCollaborationInfo() {
        return collaborationInfo;
    }

    /**
     * Legt den Wert der collaborationInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setCollaborationInfo(CollaborationInfo value) {
        this.collaborationInfo = value;
    }

    /**
     * Ruft den Wert der messageProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageProperties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public MessageProperties getMessageProperties() {
        return messageProperties;
    }

    /**
     * Legt den Wert der messageProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageProperties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setMessageProperties(MessageProperties value) {
        this.messageProperties = value;
    }

    /**
     * Ruft den Wert der payloadInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PayloadInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public PayloadInfo getPayloadInfo() {
        return payloadInfo;
    }

    /**
     * Legt den Wert der payloadInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setPayloadInfo(PayloadInfo value) {
        this.payloadInfo = value;
    }

    /**
     * Ruft den Wert der mpc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getMpc() {
        return mpc;
    }

    /**
     * Legt den Wert der mpc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setMpc(String value) {
        this.mpc = value;
    }

}

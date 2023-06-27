
package org.oasis_open.docs.ebxml_msg.ebms.v3_0.ns.core._200704;

import org.w3c.dom.Element;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * 				In the core part of ebMS-3 specification, an eb:Signal Message is allowed to
 * 				contain eb:MessageInfo and at most one Receipt Signal, at most one eb:PullRequest
 * 				element, and/or a series of eb:Error elements. In part 2 of the ebMS-3
 * 				specification, new signals may be introduced, and for this reason,
 * 				an extensibility point is added here to the eb:SignalMessage element to
 * 				allow it to contain any elements.
 * 			
 * 
 * &lt;p&gt;Java-Klasse f�r SignalMessage complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignalMessage"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MessageInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}MessageInfo"/&amp;gt;
 *         &amp;lt;element name="PullRequest" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}PullRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Receipt" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}Receipt" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Error" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}Error" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalMessage", propOrder = {
    "messageInfo",
    "pullRequest",
    "receipt",
    "error",
    "any"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
public class SignalMessage {

    @XmlElement(name = "MessageInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected MessageInfo messageInfo;
    @XmlElement(name = "PullRequest")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected PullRequest pullRequest;
    @XmlElement(name = "Receipt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected Receipt receipt;
    @XmlElement(name = "Error")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected List<Error> error;
    @XmlAnyElement(lax = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected List<Object> any;

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
     * Ruft den Wert der pullRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PullRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public PullRequest getPullRequest() {
        return pullRequest;
    }

    /**
     * Legt den Wert der pullRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PullRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setPullRequest(PullRequest value) {
        this.pullRequest = value;
    }

    /**
     * Ruft den Wert der receipt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Receipt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public Receipt getReceipt() {
        return receipt;
    }

    /**
     * Legt den Wert der receipt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Receipt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setReceipt(Receipt value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the error property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getError().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<Error>();
        }
        return this.error;
    }

    /**
     * Gets the value of the any property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAny().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}

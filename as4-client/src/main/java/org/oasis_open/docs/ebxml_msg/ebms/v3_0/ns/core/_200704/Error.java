
package org.oasis_open.docs.ebxml_msg.ebms.v3_0.ns.core._200704;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java-Klasse f�r Error complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Error"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Description" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}Description" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ErrorDetail" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}token" /&amp;gt;
 *       &amp;lt;attribute name="refToMessageInError" type="{http://www.w3.org/2001/XMLSchema}token" /&amp;gt;
 *       &amp;lt;attribute name="errorCode" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&amp;gt;
 *       &amp;lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}token" /&amp;gt;
 *       &amp;lt;attribute name="severity" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&amp;gt;
 *       &amp;lt;attribute name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}token" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Error", propOrder = {
    "description",
    "errorDetail"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
public class Error {

    @XmlElement(name = "Description")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected Description description;
    @XmlElement(name = "ErrorDetail")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String errorDetail;
    @XmlAttribute(name = "category")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String category;
    @XmlAttribute(name = "refToMessageInError")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String refToMessageInError;
    @XmlAttribute(name = "errorCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String errorCode;
    @XmlAttribute(name = "origin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String origin;
    @XmlAttribute(name = "severity", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String severity;
    @XmlAttribute(name = "shortDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected String shortDescription;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public Description getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der errorDetail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getErrorDetail() {
        return errorDetail;
    }

    /**
     * Legt den Wert der errorDetail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setErrorDetail(String value) {
        this.errorDetail = value;
    }

    /**
     * Ruft den Wert der category-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Ruft den Wert der refToMessageInError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getRefToMessageInError() {
        return refToMessageInError;
    }

    /**
     * Legt den Wert der refToMessageInError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setRefToMessageInError(String value) {
        this.refToMessageInError = value;
    }

    /**
     * Ruft den Wert der errorCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Legt den Wert der errorCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der severity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getSeverity() {
        return severity;
    }

    /**
     * Legt den Wert der severity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Ruft den Wert der shortDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Legt den Wert der shortDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

}

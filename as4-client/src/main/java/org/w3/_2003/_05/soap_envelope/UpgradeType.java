
package org.w3._2003._05.soap_envelope;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java-Klasse f�r UpgradeType complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UpgradeType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SupportedEnvelope" type="{http://www.w3.org/2003/05/soap-envelope}SupportedEnvType" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeType", propOrder = {
    "supportedEnvelope"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
public class UpgradeType {

    @XmlElement(name = "SupportedEnvelope", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    protected List<SupportedEnvType> supportedEnvelope;

    /**
     * Gets the value of the supportedEnvelope property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the supportedEnvelope property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSupportedEnvelope().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedEnvType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-06-14T11:27:53+02:00", comments = "JAXB RI v2.3.3")
    public List<SupportedEnvType> getSupportedEnvelope() {
        if (supportedEnvelope == null) {
            supportedEnvelope = new ArrayList<SupportedEnvType>();
        }
        return this.supportedEnvelope;
    }

}


package dk.skat.mft.dms_declaration_status._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.skat.mft.dms_declaration_status._1 package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StatusResponse_QNAME = new QName("urn:dk:skat:mft:DMS.declaration.status:1", "StatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.skat.mft.dms_declaration_status._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusResponseType }
     * 
     */
    public StatusResponseType createStatusResponseType() {
        return new StatusResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:dk:skat:mft:DMS.declaration.status:1", name = "StatusResponse")
    public JAXBElement<StatusResponseType> createStatusResponse(StatusResponseType value) {
        return new JAXBElement<StatusResponseType>(_StatusResponse_QNAME, StatusResponseType.class, null, value);
    }

}


package rainyhills.wsc.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rainyhills.wsc.generated package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _GetRainyHillsVolume_QNAME = new QName("http://ws.rainyhills/", "getRainyHillsVolume");
    private final static QName _GetRainyHillsVolumeResponse_QNAME = new QName("http://ws.rainyhills/", "getRainyHillsVolumeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rainyhills.wsc.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRainyHillsVolumeResponse }
     * 
     */
    public GetRainyHillsVolumeResponse createGetRainyHillsVolumeResponse() {
        return new GetRainyHillsVolumeResponse();
    }

    /**
     * Create an instance of {@link GetRainyHillsVolume }
     * 
     */
    public GetRainyHillsVolume createGetRainyHillsVolume() {
        return new GetRainyHillsVolume();
    }

    /**
     * Create an instance of {@link GetRainyHillsVolumeReq }
     * 
     */
    public GetRainyHillsVolumeReq createGetRainyHillsVolumeReq() {
        return new GetRainyHillsVolumeReq();
    }

    /**
     * Create an instance of {@link GetRainyHillsVolumeResp }
     * 
     */
    public GetRainyHillsVolumeResp createGetRainyHillsVolumeResp() {
        return new GetRainyHillsVolumeResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRainyHillsVolume }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.rainyhills/", name = "getRainyHillsVolume")
    public JAXBElement<GetRainyHillsVolume> createGetRainyHillsVolume(GetRainyHillsVolume value) {
        return new JAXBElement<GetRainyHillsVolume>(_GetRainyHillsVolume_QNAME, GetRainyHillsVolume.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRainyHillsVolumeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.rainyhills/", name = "getRainyHillsVolumeResponse")
    public JAXBElement<GetRainyHillsVolumeResponse> createGetRainyHillsVolumeResponse(GetRainyHillsVolumeResponse value) {
        return new JAXBElement<GetRainyHillsVolumeResponse>(_GetRainyHillsVolumeResponse_QNAME, GetRainyHillsVolumeResponse.class, null, value);
    }

}


package rainyhills.wsc.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRainyHillsVolumeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRainyHillsVolumeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.rainyhills/}getRainyHillsVolumeResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRainyHillsVolumeResponse", propOrder = {
    "_return"
})
public class GetRainyHillsVolumeResponse {

    @XmlElement(name = "return")
    protected GetRainyHillsVolumeResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRainyHillsVolumeResp }
     *     
     */
    public GetRainyHillsVolumeResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRainyHillsVolumeResp }
     *     
     */
    public void setReturn(GetRainyHillsVolumeResp value) {
        this._return = value;
    }

}

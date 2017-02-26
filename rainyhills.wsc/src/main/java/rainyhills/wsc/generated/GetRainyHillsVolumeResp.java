
package rainyhills.wsc.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRainyHillsVolumeResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRainyHillsVolumeResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRainyHillsVolumeResp", propOrder = {
    "volume"
})
public class GetRainyHillsVolumeResp {

    protected int volume;

    /**
     * Gets the value of the volume property.
     * 
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(int value) {
        this.volume = value;
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A calendar is a discrete temporal reference system 
 *       that provides a basis for defining temporal position to a resolution of one day. 
 *       A single calendar may reference more than one calendar era.
 * 
 * <p>Classe Java pour TimeCalendarType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimeCalendarType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element name="referenceFrame" type="{http://www.opengis.net/gml}TimeCalendarEraPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCalendarType", propOrder = {
    "referenceFrame"
})
public class TimeCalendarType
    extends AbstractTimeReferenceSystemType
{

    @XmlElement(required = true)
    protected List<TimeCalendarEraPropertyType> referenceFrame;

    /**
     * Gets the value of the referenceFrame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceFrame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceFrame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeCalendarEraPropertyType }
     * 
     * 
     */
    public List<TimeCalendarEraPropertyType> getReferenceFrame() {
        if (referenceFrame == null) {
            referenceFrame = new ArrayList<TimeCalendarEraPropertyType>();
        }
        return this.referenceFrame;
    }

    public boolean isSetReferenceFrame() {
        return ((this.referenceFrame!= null)&&(!this.referenceFrame.isEmpty()));
    }

    public void unsetReferenceFrame() {
        this.referenceFrame = null;
    }

}

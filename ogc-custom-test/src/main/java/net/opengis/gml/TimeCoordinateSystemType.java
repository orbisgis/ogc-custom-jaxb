//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A temporal coordinate system is based on a continuous interval scale defined in terms of a single time interval.
 * 
 * <p>Classe Java pour TimeCoordinateSystemType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimeCoordinateSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="originPosition" type="{http://www.opengis.net/gml}TimePositionType"/>
 *           &lt;element name="origin" type="{http://www.opengis.net/gml}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;element name="interval" type="{http://www.opengis.net/gml}TimeIntervalLengthType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCoordinateSystemType", propOrder = {
    "originPosition",
    "origin",
    "interval"
})
public class TimeCoordinateSystemType
    extends AbstractTimeReferenceSystemType
{

    protected TimePositionType originPosition;
    protected TimeInstantPropertyType origin;
    @XmlElement(required = true)
    protected TimeIntervalLengthType interval;

    /**
     * Obtient la valeur de la propriété originPosition.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getOriginPosition() {
        return originPosition;
    }

    /**
     * Définit la valeur de la propriété originPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setOriginPosition(TimePositionType value) {
        this.originPosition = value;
    }

    public boolean isSetOriginPosition() {
        return (this.originPosition!= null);
    }

    /**
     * Obtient la valeur de la propriété origin.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getOrigin() {
        return origin;
    }

    /**
     * Définit la valeur de la propriété origin.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setOrigin(TimeInstantPropertyType value) {
        this.origin = value;
    }

    public boolean isSetOrigin() {
        return (this.origin!= null);
    }

    /**
     * Obtient la valeur de la propriété interval.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getInterval() {
        return interval;
    }

    /**
     * Définit la valeur de la propriété interval.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public void setInterval(TimeIntervalLengthType value) {
        this.interval = value;
    }

    public boolean isSetInterval() {
        return (this.interval!= null);
    }

}

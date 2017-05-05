//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Value of an angle quantity provided in either degree-minute-second format or single value format.
 * 
 * <p>Classe Java pour AngleChoiceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AngleChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}angle"/>
 *         &lt;element ref="{http://www.opengis.net/gml}dmsAngle"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngleChoiceType", propOrder = {
    "angle",
    "dmsAngle"
})
public class AngleChoiceType {

    protected MeasureType angle;
    protected DMSAngleType dmsAngle;

    /**
     * Obtient la valeur de la propriété angle.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAngle() {
        return angle;
    }

    /**
     * Définit la valeur de la propriété angle.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAngle(MeasureType value) {
        this.angle = value;
    }

    public boolean isSetAngle() {
        return (this.angle!= null);
    }

    /**
     * Obtient la valeur de la propriété dmsAngle.
     * 
     * @return
     *     possible object is
     *     {@link DMSAngleType }
     *     
     */
    public DMSAngleType getDmsAngle() {
        return dmsAngle;
    }

    /**
     * Définit la valeur de la propriété dmsAngle.
     * 
     * @param value
     *     allowed object is
     *     {@link DMSAngleType }
     *     
     */
    public void setDmsAngle(DMSAngleType value) {
        this.dmsAngle = value;
    }

    public boolean isSetDmsAngle() {
        return (this.dmsAngle!= null);
    }

}

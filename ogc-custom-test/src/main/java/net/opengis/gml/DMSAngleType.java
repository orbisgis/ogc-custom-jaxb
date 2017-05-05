//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Angle value provided in degree-minute-second or degree-minute format.
 * 
 * <p>Classe Java pour DMSAngleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DMSAngleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}degrees"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/gml}decimalMinutes"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.opengis.net/gml}minutes"/>
 *             &lt;element ref="{http://www.opengis.net/gml}seconds" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMSAngleType", propOrder = {
    "degrees",
    "decimalMinutes",
    "minutes",
    "seconds"
})
public class DMSAngleType {

    @XmlElement(required = true)
    protected DegreesType degrees;
    protected BigDecimal decimalMinutes;
    protected Integer minutes;
    protected BigDecimal seconds;

    /**
     * Obtient la valeur de la propriété degrees.
     * 
     * @return
     *     possible object is
     *     {@link DegreesType }
     *     
     */
    public DegreesType getDegrees() {
        return degrees;
    }

    /**
     * Définit la valeur de la propriété degrees.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreesType }
     *     
     */
    public void setDegrees(DegreesType value) {
        this.degrees = value;
    }

    public boolean isSetDegrees() {
        return (this.degrees!= null);
    }

    /**
     * Obtient la valeur de la propriété decimalMinutes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalMinutes() {
        return decimalMinutes;
    }

    /**
     * Définit la valeur de la propriété decimalMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalMinutes(BigDecimal value) {
        this.decimalMinutes = value;
    }

    public boolean isSetDecimalMinutes() {
        return (this.decimalMinutes!= null);
    }

    /**
     * Obtient la valeur de la propriété minutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Définit la valeur de la propriété minutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutes(Integer value) {
        this.minutes = value;
    }

    public boolean isSetMinutes() {
        return (this.minutes!= null);
    }

    /**
     * Obtient la valeur de la propriété seconds.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeconds() {
        return seconds;
    }

    /**
     * Définit la valeur de la propriété seconds.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeconds(BigDecimal value) {
        this.seconds = value;
    }

    public boolean isSetSeconds() {
        return (this.seconds!= null);
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.raster;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ShadedReliefType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ShadedReliefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}BrightnessOnly" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}ReliefFactor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShadedReliefType", propOrder = {
    "brightnessOnly",
    "reliefFactor"
})
public class ShadedReliefType {

    @XmlElement(name = "BrightnessOnly")
    protected Boolean brightnessOnly;
    @XmlElement(name = "ReliefFactor")
    protected Double reliefFactor;

    /**
     * Obtient la valeur de la propriété brightnessOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrightnessOnly() {
        return brightnessOnly;
    }

    /**
     * Définit la valeur de la propriété brightnessOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrightnessOnly(Boolean value) {
        this.brightnessOnly = value;
    }

    public boolean isSetBrightnessOnly() {
        return (this.brightnessOnly!= null);
    }

    /**
     * Obtient la valeur de la propriété reliefFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReliefFactor() {
        return reliefFactor;
    }

    /**
     * Définit la valeur de la propriété reliefFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReliefFactor(Double value) {
        this.reliefFactor = value;
    }

    public boolean isSetReliefFactor() {
        return (this.reliefFactor!= null);
    }

}

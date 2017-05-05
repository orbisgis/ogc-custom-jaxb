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
 * <p>Classe Java pour SelectedChannelType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SelectedChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}SourceChannelName"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}ContrastEnhancement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedChannelType", propOrder = {
    "sourceChannelName",
    "contrastEnhancement"
})
public class SelectedChannelType {

    @XmlElement(name = "SourceChannelName", required = true)
    protected String sourceChannelName;
    @XmlElement(name = "ContrastEnhancement")
    protected ContrastEnhancementType contrastEnhancement;

    /**
     * Obtient la valeur de la propriété sourceChannelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceChannelName() {
        return sourceChannelName;
    }

    /**
     * Définit la valeur de la propriété sourceChannelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceChannelName(String value) {
        this.sourceChannelName = value;
    }

    public boolean isSetSourceChannelName() {
        return (this.sourceChannelName!= null);
    }

    /**
     * Obtient la valeur de la propriété contrastEnhancement.
     * 
     * @return
     *     possible object is
     *     {@link ContrastEnhancementType }
     *     
     */
    public ContrastEnhancementType getContrastEnhancement() {
        return contrastEnhancement;
    }

    /**
     * Définit la valeur de la propriété contrastEnhancement.
     * 
     * @param value
     *     allowed object is
     *     {@link ContrastEnhancementType }
     *     
     */
    public void setContrastEnhancement(ContrastEnhancementType value) {
        this.contrastEnhancement = value;
    }

    public boolean isSetContrastEnhancement() {
        return (this.contrastEnhancement!= null);
    }

}

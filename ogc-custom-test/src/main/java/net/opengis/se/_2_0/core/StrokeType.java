//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StrokeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StrokeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}LinearRapport" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Extension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrokeType", propOrder = {
    "linearRapport",
    "extension"
})
@XmlSeeAlso({
    StrokeReferenceType.class,
    CompoundStrokeType.class,
    GraphicStrokeType.class,
    TextStrokeType.class,
    PenStrokeType.class
})
public abstract class StrokeType {

    @XmlElement(name = "LinearRapport")
    protected Boolean linearRapport;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;

    /**
     * Obtient la valeur de la propriété linearRapport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinearRapport() {
        return linearRapport;
    }

    /**
     * Définit la valeur de la propriété linearRapport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinearRapport(Boolean value) {
        this.linearRapport = value;
    }

    public boolean isSetLinearRapport() {
        return (this.linearRapport!= null);
    }

    /**
     * Obtient la valeur de la propriété extension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Définit la valeur de la propriété extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

    public boolean isSetExtension() {
        return (this.extension!= null);
    }

}

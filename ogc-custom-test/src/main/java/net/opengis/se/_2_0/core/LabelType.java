//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LabelType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LabelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}StyledText"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}HorizontalAlignment" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}VerticalAlignment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uom" type="{http://www.opengis.net/se/2.0/core}UomType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelType", propOrder = {
    "styledText",
    "horizontalAlignment",
    "verticalAlignment"
})
@XmlSeeAlso({
    LineLabelType.class,
    PointLabelType.class
})
public abstract class LabelType {

    @XmlElement(name = "StyledText", required = true)
    protected StyledTextType styledText;
    @XmlElement(name = "HorizontalAlignment")
    protected ParameterValueType horizontalAlignment;
    @XmlElement(name = "VerticalAlignment")
    protected ParameterValueType verticalAlignment;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Obtient la valeur de la propriété styledText.
     * 
     * @return
     *     possible object is
     *     {@link StyledTextType }
     *     
     */
    public StyledTextType getStyledText() {
        return styledText;
    }

    /**
     * Définit la valeur de la propriété styledText.
     * 
     * @param value
     *     allowed object is
     *     {@link StyledTextType }
     *     
     */
    public void setStyledText(StyledTextType value) {
        this.styledText = value;
    }

    public boolean isSetStyledText() {
        return (this.styledText!= null);
    }

    /**
     * Obtient la valeur de la propriété horizontalAlignment.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getHorizontalAlignment() {
        return horizontalAlignment;
    }

    /**
     * Définit la valeur de la propriété horizontalAlignment.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setHorizontalAlignment(ParameterValueType value) {
        this.horizontalAlignment = value;
    }

    public boolean isSetHorizontalAlignment() {
        return (this.horizontalAlignment!= null);
    }

    /**
     * Obtient la valeur de la propriété verticalAlignment.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getVerticalAlignment() {
        return verticalAlignment;
    }

    /**
     * Définit la valeur de la propriété verticalAlignment.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setVerticalAlignment(ParameterValueType value) {
        this.verticalAlignment = value;
    }

    public boolean isSetVerticalAlignment() {
        return (this.verticalAlignment!= null);
    }

    /**
     * Obtient la valeur de la propriété uom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Définit la valeur de la propriété uom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    public boolean isSetUom() {
        return (this.uom!= null);
    }

}

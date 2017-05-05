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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour FontType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FontType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}FontFamily" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}FontStyle" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}FontWeight" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}FontSize" minOccurs="0"/>
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
@XmlType(name = "FontType", propOrder = {
    "fontFamily",
    "fontStyle",
    "fontWeight",
    "fontSize"
})
public class FontType {

    @XmlElement(name = "FontFamily")
    protected ParameterValueType fontFamily;
    @XmlElement(name = "FontStyle")
    protected ParameterValueType fontStyle;
    @XmlElement(name = "FontWeight")
    protected ParameterValueType fontWeight;
    @XmlElement(name = "FontSize")
    protected ParameterValueType fontSize;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Obtient la valeur de la propriété fontFamily.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getFontFamily() {
        return fontFamily;
    }

    /**
     * Définit la valeur de la propriété fontFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setFontFamily(ParameterValueType value) {
        this.fontFamily = value;
    }

    public boolean isSetFontFamily() {
        return (this.fontFamily!= null);
    }

    /**
     * Obtient la valeur de la propriété fontStyle.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getFontStyle() {
        return fontStyle;
    }

    /**
     * Définit la valeur de la propriété fontStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setFontStyle(ParameterValueType value) {
        this.fontStyle = value;
    }

    public boolean isSetFontStyle() {
        return (this.fontStyle!= null);
    }

    /**
     * Obtient la valeur de la propriété fontWeight.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getFontWeight() {
        return fontWeight;
    }

    /**
     * Définit la valeur de la propriété fontWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setFontWeight(ParameterValueType value) {
        this.fontWeight = value;
    }

    public boolean isSetFontWeight() {
        return (this.fontWeight!= null);
    }

    /**
     * Obtient la valeur de la propriété fontSize.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getFontSize() {
        return fontSize;
    }

    /**
     * Définit la valeur de la propriété fontSize.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setFontSize(ParameterValueType value) {
        this.fontSize = value;
    }

    public boolean isSetFontSize() {
        return (this.fontSize!= null);
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

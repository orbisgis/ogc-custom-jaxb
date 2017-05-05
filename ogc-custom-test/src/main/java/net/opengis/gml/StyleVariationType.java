//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Used to vary individual graphic parameters and attributes of the style, symbol or text.
 * 
 * <p>Classe Java pour StyleVariationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StyleVariationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="styleProperty" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="featurePropertyRange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleVariationType", propOrder = {
    "value"
})
public class StyleVariationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "styleProperty", required = true)
    protected String styleProperty;
    @XmlAttribute(name = "featurePropertyRange")
    protected String featurePropertyRange;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Obtient la valeur de la propriété styleProperty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleProperty() {
        return styleProperty;
    }

    /**
     * Définit la valeur de la propriété styleProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleProperty(String value) {
        this.styleProperty = value;
    }

    public boolean isSetStyleProperty() {
        return (this.styleProperty!= null);
    }

    /**
     * Obtient la valeur de la propriété featurePropertyRange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturePropertyRange() {
        return featurePropertyRange;
    }

    /**
     * Définit la valeur de la propriété featurePropertyRange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturePropertyRange(String value) {
        this.featurePropertyRange = value;
    }

    public boolean isSetFeaturePropertyRange() {
        return (this.featurePropertyRange!= null);
    }

}

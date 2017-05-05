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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * [complexType of] The style descriptor for geometries of a feature.
 * 
 * <p>Classe Java pour GeometryStyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeometryStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}BaseStyleDescriptorType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}symbol"/>
 *           &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}labelStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="geometryProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="geometryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryStyleType", propOrder = {
    "symbol",
    "style",
    "labelStyle"
})
public class GeometryStyleType
    extends BaseStyleDescriptorType
{

    protected SymbolType symbol;
    protected String style;
    @XmlElementRef(name = "labelStyle", namespace = "http://www.opengis.net/gml", type = LabelStylePropertyElement.class)
    protected LabelStylePropertyElement labelStyle;
    @XmlAttribute(name = "geometryProperty")
    protected String geometryProperty;
    @XmlAttribute(name = "geometryType")
    protected String geometryType;

    /**
     * Obtient la valeur de la propriété symbol.
     * 
     * @return
     *     possible object is
     *     {@link SymbolType }
     *     
     */
    public SymbolType getSymbol() {
        return symbol;
    }

    /**
     * Définit la valeur de la propriété symbol.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolType }
     *     
     */
    public void setSymbol(SymbolType value) {
        this.symbol = value;
    }

    public boolean isSetSymbol() {
        return (this.symbol!= null);
    }

    /**
     * Obtient la valeur de la propriété style.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Définit la valeur de la propriété style.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    public boolean isSetStyle() {
        return (this.style!= null);
    }

    /**
     * Obtient la valeur de la propriété labelStyle.
     * 
     * @return
     *     possible object is
     *     {@link LabelStylePropertyElement }
     *     
     */
    public LabelStylePropertyElement getLabelStyle() {
        return labelStyle;
    }

    /**
     * Définit la valeur de la propriété labelStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelStylePropertyElement }
     *     
     */
    public void setLabelStyle(LabelStylePropertyElement value) {
        this.labelStyle = value;
    }

    public boolean isSetLabelStyle() {
        return (this.labelStyle!= null);
    }

    /**
     * Obtient la valeur de la propriété geometryProperty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometryProperty() {
        return geometryProperty;
    }

    /**
     * Définit la valeur de la propriété geometryProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometryProperty(String value) {
        this.geometryProperty = value;
    }

    public boolean isSetGeometryProperty() {
        return (this.geometryProperty!= null);
    }

    /**
     * Obtient la valeur de la propriété geometryType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometryType() {
        return geometryType;
    }

    /**
     * Définit la valeur de la propriété geometryType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometryType(String value) {
        this.geometryType = value;
    }

    public boolean isSetGeometryType() {
        return (this.geometryType!= null);
    }

}

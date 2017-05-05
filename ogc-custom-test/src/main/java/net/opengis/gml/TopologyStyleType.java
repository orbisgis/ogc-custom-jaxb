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
 * [complexType of] The style descriptor for topologies of a feature. Describes individual topology elements styles.
 * 
 * <p>Classe Java pour TopologyStyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TopologyStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}BaseStyleDescriptorType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}symbol"/>
 *           &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}labelStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="topologyProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topologyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopologyStyleType", propOrder = {
    "symbol",
    "style",
    "labelStyle"
})
public class TopologyStyleType
    extends BaseStyleDescriptorType
{

    protected SymbolType symbol;
    protected String style;
    @XmlElementRef(name = "labelStyle", namespace = "http://www.opengis.net/gml", type = LabelStylePropertyElement.class)
    protected LabelStylePropertyElement labelStyle;
    @XmlAttribute(name = "topologyProperty")
    protected String topologyProperty;
    @XmlAttribute(name = "topologyType")
    protected String topologyType;

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
     * Obtient la valeur de la propriété topologyProperty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopologyProperty() {
        return topologyProperty;
    }

    /**
     * Définit la valeur de la propriété topologyProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopologyProperty(String value) {
        this.topologyProperty = value;
    }

    public boolean isSetTopologyProperty() {
        return (this.topologyProperty!= null);
    }

    /**
     * Obtient la valeur de la propriété topologyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopologyType() {
        return topologyType;
    }

    /**
     * Définit la valeur de la propriété topologyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopologyType(String value) {
        this.topologyType = value;
    }

    public boolean isSetTopologyType() {
        return (this.topologyType!= null);
    }

}

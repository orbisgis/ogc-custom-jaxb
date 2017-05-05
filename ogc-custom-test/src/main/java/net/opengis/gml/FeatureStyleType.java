//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * [complexType of] The style descriptor for features.
 * 
 * <p>Classe Java pour FeatureStyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FeatureStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element name="featureConstraint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}geometryStyle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}topologyStyle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}labelStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="featureType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="baseType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queryGrammar" type="{http://www.opengis.net/gml}QueryGrammarEnumeration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureStyleType", propOrder = {
    "featureConstraint",
    "geometryStyle",
    "topologyStyle",
    "labelStyle"
})
public class FeatureStyleType
    extends AbstractGMLType
{

    protected String featureConstraint;
    @XmlElementRef(name = "geometryStyle", namespace = "http://www.opengis.net/gml", type = GeometryStylePropertyElement.class)
    protected List<GeometryStylePropertyElement> geometryStyle;
    @XmlElementRef(name = "topologyStyle", namespace = "http://www.opengis.net/gml", type = TopologyStylePropertyElement.class)
    protected List<TopologyStylePropertyElement> topologyStyle;
    @XmlElementRef(name = "labelStyle", namespace = "http://www.opengis.net/gml", type = LabelStylePropertyElement.class)
    protected LabelStylePropertyElement labelStyle;
    @XmlAttribute(name = "featureType")
    protected String featureType;
    @XmlAttribute(name = "baseType")
    protected String baseType;
    @XmlAttribute(name = "queryGrammar")
    protected QueryGrammarEnumeration queryGrammar;

    /**
     * Obtient la valeur de la propriété featureConstraint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureConstraint() {
        return featureConstraint;
    }

    /**
     * Définit la valeur de la propriété featureConstraint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureConstraint(String value) {
        this.featureConstraint = value;
    }

    public boolean isSetFeatureConstraint() {
        return (this.featureConstraint!= null);
    }

    /**
     * Gets the value of the geometryStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometryStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometryStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeometryStylePropertyElement }
     * 
     * 
     */
    public List<GeometryStylePropertyElement> getGeometryStyle() {
        if (geometryStyle == null) {
            geometryStyle = new ArrayList<GeometryStylePropertyElement>();
        }
        return this.geometryStyle;
    }

    public boolean isSetGeometryStyle() {
        return ((this.geometryStyle!= null)&&(!this.geometryStyle.isEmpty()));
    }

    public void unsetGeometryStyle() {
        this.geometryStyle = null;
    }

    /**
     * Gets the value of the topologyStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topologyStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopologyStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopologyStylePropertyElement }
     * 
     * 
     */
    public List<TopologyStylePropertyElement> getTopologyStyle() {
        if (topologyStyle == null) {
            topologyStyle = new ArrayList<TopologyStylePropertyElement>();
        }
        return this.topologyStyle;
    }

    public boolean isSetTopologyStyle() {
        return ((this.topologyStyle!= null)&&(!this.topologyStyle.isEmpty()));
    }

    public void unsetTopologyStyle() {
        this.topologyStyle = null;
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
     * Obtient la valeur de la propriété featureType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Définit la valeur de la propriété featureType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    public boolean isSetFeatureType() {
        return (this.featureType!= null);
    }

    /**
     * Obtient la valeur de la propriété baseType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Définit la valeur de la propriété baseType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    public boolean isSetBaseType() {
        return (this.baseType!= null);
    }

    /**
     * Obtient la valeur de la propriété queryGrammar.
     * 
     * @return
     *     possible object is
     *     {@link QueryGrammarEnumeration }
     *     
     */
    public QueryGrammarEnumeration getQueryGrammar() {
        return queryGrammar;
    }

    /**
     * Définit la valeur de la propriété queryGrammar.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryGrammarEnumeration }
     *     
     */
    public void setQueryGrammar(QueryGrammarEnumeration value) {
        this.queryGrammar = value;
    }

    public boolean isSetQueryGrammar() {
        return (this.queryGrammar!= null);
    }

}

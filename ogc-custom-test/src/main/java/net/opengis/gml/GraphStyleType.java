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
import javax.xml.bind.annotation.XmlType;


/**
 * [complexType of] The style descriptor for a graph consisting of a number of features. Describes graph-specific style attributes.
 * 
 * <p>Classe Java pour GraphStyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GraphStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}BaseStyleDescriptorType">
 *       &lt;sequence>
 *         &lt;element name="planar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="grid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="minDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="graphType" type="{http://www.opengis.net/gml}GraphTypeType" minOccurs="0"/>
 *         &lt;element name="drawingType" type="{http://www.opengis.net/gml}DrawingTypeType" minOccurs="0"/>
 *         &lt;element name="lineType" type="{http://www.opengis.net/gml}LineTypeType" minOccurs="0"/>
 *         &lt;element name="aestheticCriteria" type="{http://www.opengis.net/gml}AesheticCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphStyleType", propOrder = {
    "planar",
    "directed",
    "grid",
    "minDistance",
    "minAngle",
    "graphType",
    "drawingType",
    "lineType",
    "aestheticCriteria"
})
public class GraphStyleType
    extends BaseStyleDescriptorType
{

    protected Boolean planar;
    protected Boolean directed;
    protected Boolean grid;
    protected Double minDistance;
    protected Double minAngle;
    protected GraphTypeType graphType;
    protected DrawingTypeType drawingType;
    protected LineTypeType lineType;
    protected List<AesheticCriteriaType> aestheticCriteria;

    /**
     * Obtient la valeur de la propriété planar.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanar() {
        return planar;
    }

    /**
     * Définit la valeur de la propriété planar.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanar(Boolean value) {
        this.planar = value;
    }

    public boolean isSetPlanar() {
        return (this.planar!= null);
    }

    /**
     * Obtient la valeur de la propriété directed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirected() {
        return directed;
    }

    /**
     * Définit la valeur de la propriété directed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirected(Boolean value) {
        this.directed = value;
    }

    public boolean isSetDirected() {
        return (this.directed!= null);
    }

    /**
     * Obtient la valeur de la propriété grid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrid() {
        return grid;
    }

    /**
     * Définit la valeur de la propriété grid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrid(Boolean value) {
        this.grid = value;
    }

    public boolean isSetGrid() {
        return (this.grid!= null);
    }

    /**
     * Obtient la valeur de la propriété minDistance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDistance() {
        return minDistance;
    }

    /**
     * Définit la valeur de la propriété minDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDistance(Double value) {
        this.minDistance = value;
    }

    public boolean isSetMinDistance() {
        return (this.minDistance!= null);
    }

    /**
     * Obtient la valeur de la propriété minAngle.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAngle() {
        return minAngle;
    }

    /**
     * Définit la valeur de la propriété minAngle.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAngle(Double value) {
        this.minAngle = value;
    }

    public boolean isSetMinAngle() {
        return (this.minAngle!= null);
    }

    /**
     * Obtient la valeur de la propriété graphType.
     * 
     * @return
     *     possible object is
     *     {@link GraphTypeType }
     *     
     */
    public GraphTypeType getGraphType() {
        return graphType;
    }

    /**
     * Définit la valeur de la propriété graphType.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphTypeType }
     *     
     */
    public void setGraphType(GraphTypeType value) {
        this.graphType = value;
    }

    public boolean isSetGraphType() {
        return (this.graphType!= null);
    }

    /**
     * Obtient la valeur de la propriété drawingType.
     * 
     * @return
     *     possible object is
     *     {@link DrawingTypeType }
     *     
     */
    public DrawingTypeType getDrawingType() {
        return drawingType;
    }

    /**
     * Définit la valeur de la propriété drawingType.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawingTypeType }
     *     
     */
    public void setDrawingType(DrawingTypeType value) {
        this.drawingType = value;
    }

    public boolean isSetDrawingType() {
        return (this.drawingType!= null);
    }

    /**
     * Obtient la valeur de la propriété lineType.
     * 
     * @return
     *     possible object is
     *     {@link LineTypeType }
     *     
     */
    public LineTypeType getLineType() {
        return lineType;
    }

    /**
     * Définit la valeur de la propriété lineType.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTypeType }
     *     
     */
    public void setLineType(LineTypeType value) {
        this.lineType = value;
    }

    public boolean isSetLineType() {
        return (this.lineType!= null);
    }

    /**
     * Gets the value of the aestheticCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aestheticCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAestheticCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AesheticCriteriaType }
     * 
     * 
     */
    public List<AesheticCriteriaType> getAestheticCriteria() {
        if (aestheticCriteria == null) {
            aestheticCriteria = new ArrayList<AesheticCriteriaType>();
        }
        return this.aestheticCriteria;
    }

    public boolean isSetAestheticCriteria() {
        return ((this.aestheticCriteria!= null)&&(!this.aestheticCriteria.isEmpty()));
    }

    public void unsetAestheticCriteria() {
        this.aestheticCriteria = null;
    }

}

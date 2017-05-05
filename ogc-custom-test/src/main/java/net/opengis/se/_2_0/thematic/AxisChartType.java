//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.thematic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.core.CompoundStrokeType;
import net.opengis.se._2_0.core.FillReferenceType;
import net.opengis.se._2_0.core.FillType;
import net.opengis.se._2_0.core.GraphicFillType;
import net.opengis.se._2_0.core.GraphicStrokeType;
import net.opengis.se._2_0.core.GraphicType;
import net.opengis.se._2_0.core.HatchedFillType;
import net.opengis.se._2_0.core.ParameterValueType;
import net.opengis.se._2_0.core.PenStrokeType;
import net.opengis.se._2_0.core.SolidFillType;
import net.opengis.se._2_0.core.StrokeReferenceType;
import net.opengis.se._2_0.core.StrokeType;
import net.opengis.se._2_0.core.TextStrokeType;
import net.opengis.se._2_0.core.TransformType;


/**
 * <p>Classe Java pour AxisChartType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AxisChartType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}GraphicType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Transform" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}Normalization" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}AxisChartSubtype" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}CategoryWidth"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}CategoryGap" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}AxisScale"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Fill" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Stroke" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}Category" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uom" type="{http://www.opengis.net/se/2.0/core}UomType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxisChartType", propOrder = {
    "transform",
    "normalization",
    "axisChartSubtype",
    "categoryWidth",
    "categoryGap",
    "axisScale",
    "fill",
    "stroke",
    "category"
})
public class AxisChartType
    extends GraphicType
{

    @XmlElement(name = "Transform", namespace = "http://www.opengis.net/se/2.0/core")
    protected TransformType transform;
    @XmlElement(name = "Normalization")
    protected ParameterValueType normalization;
    @XmlElement(name = "AxisChartSubtype")
    protected AxisChartSubtypeType axisChartSubtype;
    @XmlElement(name = "CategoryWidth", required = true)
    protected ParameterValueType categoryWidth;
    @XmlElement(name = "CategoryGap")
    protected ParameterValueType categoryGap;
    @XmlElement(name = "AxisScale", required = true)
    protected AxisScaleType axisScale;
    @XmlElementRef(name = "Fill", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends FillType> fill;
    @XmlElementRef(name = "Stroke", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends StrokeType> stroke;
    @XmlElement(name = "Category", required = true)
    protected List<CategoryType> category;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Obtient la valeur de la propriété transform.
     * 
     * @return
     *     possible object is
     *     {@link TransformType }
     *     
     */
    public TransformType getTransform() {
        return transform;
    }

    /**
     * Définit la valeur de la propriété transform.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformType }
     *     
     */
    public void setTransform(TransformType value) {
        this.transform = value;
    }

    public boolean isSetTransform() {
        return (this.transform!= null);
    }

    /**
     * Obtient la valeur de la propriété normalization.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getNormalization() {
        return normalization;
    }

    /**
     * Définit la valeur de la propriété normalization.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setNormalization(ParameterValueType value) {
        this.normalization = value;
    }

    public boolean isSetNormalization() {
        return (this.normalization!= null);
    }

    /**
     * Obtient la valeur de la propriété axisChartSubtype.
     * 
     * @return
     *     possible object is
     *     {@link AxisChartSubtypeType }
     *     
     */
    public AxisChartSubtypeType getAxisChartSubtype() {
        return axisChartSubtype;
    }

    /**
     * Définit la valeur de la propriété axisChartSubtype.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisChartSubtypeType }
     *     
     */
    public void setAxisChartSubtype(AxisChartSubtypeType value) {
        this.axisChartSubtype = value;
    }

    public boolean isSetAxisChartSubtype() {
        return (this.axisChartSubtype!= null);
    }

    /**
     * Obtient la valeur de la propriété categoryWidth.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getCategoryWidth() {
        return categoryWidth;
    }

    /**
     * Définit la valeur de la propriété categoryWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setCategoryWidth(ParameterValueType value) {
        this.categoryWidth = value;
    }

    public boolean isSetCategoryWidth() {
        return (this.categoryWidth!= null);
    }

    /**
     * Obtient la valeur de la propriété categoryGap.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getCategoryGap() {
        return categoryGap;
    }

    /**
     * Définit la valeur de la propriété categoryGap.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setCategoryGap(ParameterValueType value) {
        this.categoryGap = value;
    }

    public boolean isSetCategoryGap() {
        return (this.categoryGap!= null);
    }

    /**
     * Obtient la valeur de la propriété axisScale.
     * 
     * @return
     *     possible object is
     *     {@link AxisScaleType }
     *     
     */
    public AxisScaleType getAxisScale() {
        return axisScale;
    }

    /**
     * Définit la valeur de la propriété axisScale.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisScaleType }
     *     
     */
    public void setAxisScale(AxisScaleType value) {
        this.axisScale = value;
    }

    public boolean isSetAxisScale() {
        return (this.axisScale!= null);
    }

    /**
     * if defined, fill area defined by all categories
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SolidFillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FillReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GraphicFillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HatchedFillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DotMapFillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DensityFillType }{@code >}
     *     
     */
    public JAXBElement<? extends FillType> getFill() {
        return fill;
    }

    /**
     * Définit la valeur de la propriété fill.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SolidFillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FillReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GraphicFillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HatchedFillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DotMapFillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FillType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DensityFillType }{@code >}
     *     
     */
    public void setFill(JAXBElement<? extends FillType> value) {
        this.fill = value;
    }

    public boolean isSetFill() {
        return (this.fill!= null);
    }

    /**
     * if defined, draw a line between each category
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompoundStrokeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StrokeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PenStrokeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TextStrokeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StrokeReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GraphicStrokeType }{@code >}
     *     
     */
    public JAXBElement<? extends StrokeType> getStroke() {
        return stroke;
    }

    /**
     * Définit la valeur de la propriété stroke.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompoundStrokeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StrokeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PenStrokeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TextStrokeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StrokeReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GraphicStrokeType }{@code >}
     *     
     */
    public void setStroke(JAXBElement<? extends StrokeType> value) {
        this.stroke = value;
    }

    public boolean isSetStroke() {
        return (this.stroke!= null);
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryType }
     * 
     * 
     */
    public List<CategoryType> getCategory() {
        if (category == null) {
            category = new ArrayList<CategoryType>();
        }
        return this.category;
    }

    public boolean isSetCategory() {
        return ((this.category!= null)&&(!this.category.isEmpty()));
    }

    public void unsetCategory() {
        this.category = null;
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

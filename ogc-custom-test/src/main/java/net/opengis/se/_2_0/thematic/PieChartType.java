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
import net.opengis.se._2_0.core.GraphicStrokeType;
import net.opengis.se._2_0.core.GraphicType;
import net.opengis.se._2_0.core.ParameterValueType;
import net.opengis.se._2_0.core.PenStrokeType;
import net.opengis.se._2_0.core.StrokeReferenceType;
import net.opengis.se._2_0.core.StrokeType;
import net.opengis.se._2_0.core.TextStrokeType;
import net.opengis.se._2_0.core.TransformType;


/**
 * <p>Classe Java pour PieChartType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PieChartType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}GraphicType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Transform" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Radius" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}HoleRadius" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Stroke" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}Slice" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}PieSubtype" minOccurs="0"/>
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
@XmlType(name = "PieChartType", propOrder = {
    "transform",
    "radius",
    "holeRadius",
    "stroke",
    "slice",
    "pieSubtype"
})
public class PieChartType
    extends GraphicType
{

    @XmlElement(name = "Transform", namespace = "http://www.opengis.net/se/2.0/core")
    protected TransformType transform;
    @XmlElement(name = "Radius", namespace = "http://www.opengis.net/se/2.0/core")
    protected ParameterValueType radius;
    @XmlElement(name = "HoleRadius")
    protected ParameterValueType holeRadius;
    @XmlElementRef(name = "Stroke", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends StrokeType> stroke;
    @XmlElement(name = "Slice", required = true)
    protected List<SliceType> slice;
    @XmlElement(name = "PieSubtype")
    protected PieSubtypeType pieSubtype;
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
     * Obtient la valeur de la propriété radius.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getRadius() {
        return radius;
    }

    /**
     * Définit la valeur de la propriété radius.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setRadius(ParameterValueType value) {
        this.radius = value;
    }

    public boolean isSetRadius() {
        return (this.radius!= null);
    }

    /**
     * Obtient la valeur de la propriété holeRadius.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getHoleRadius() {
        return holeRadius;
    }

    /**
     * Définit la valeur de la propriété holeRadius.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setHoleRadius(ParameterValueType value) {
        this.holeRadius = value;
    }

    public boolean isSetHoleRadius() {
        return (this.holeRadius!= null);
    }

    /**
     * Obtient la valeur de la propriété stroke.
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
     * Gets the value of the slice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SliceType }
     * 
     * 
     */
    public List<SliceType> getSlice() {
        if (slice == null) {
            slice = new ArrayList<SliceType>();
        }
        return this.slice;
    }

    public boolean isSetSlice() {
        return ((this.slice!= null)&&(!this.slice.isEmpty()));
    }

    public void unsetSlice() {
        this.slice = null;
    }

    /**
     * Obtient la valeur de la propriété pieSubtype.
     * 
     * @return
     *     possible object is
     *     {@link PieSubtypeType }
     *     
     */
    public PieSubtypeType getPieSubtype() {
        return pieSubtype;
    }

    /**
     * Définit la valeur de la propriété pieSubtype.
     * 
     * @param value
     *     allowed object is
     *     {@link PieSubtypeType }
     *     
     */
    public void setPieSubtype(PieSubtypeType value) {
        this.pieSubtype = value;
    }

    public boolean isSetPieSubtype() {
        return (this.pieSubtype!= null);
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

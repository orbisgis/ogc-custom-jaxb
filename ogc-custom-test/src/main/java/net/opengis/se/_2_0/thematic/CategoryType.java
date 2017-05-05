//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.thematic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.core.AlternativeGraphicsType;
import net.opengis.se._2_0.core.CompositeGraphicType;
import net.opengis.se._2_0.core.CompoundStrokeType;
import net.opengis.se._2_0.core.ExternalGraphicType;
import net.opengis.se._2_0.core.FillReferenceType;
import net.opengis.se._2_0.core.FillType;
import net.opengis.se._2_0.core.GraphicFillType;
import net.opengis.se._2_0.core.GraphicReferenceType;
import net.opengis.se._2_0.core.GraphicStrokeType;
import net.opengis.se._2_0.core.GraphicType;
import net.opengis.se._2_0.core.HatchedFillType;
import net.opengis.se._2_0.core.MarkGraphicType;
import net.opengis.se._2_0.core.ParameterValueType;
import net.opengis.se._2_0.core.PenStrokeType;
import net.opengis.se._2_0.core.PointTextGraphicType;
import net.opengis.se._2_0.core.SolidFillType;
import net.opengis.se._2_0.core.StrokeReferenceType;
import net.opengis.se._2_0.core.StrokeType;
import net.opengis.se._2_0.core.TextStrokeType;


/**
 * <p>Classe Java pour CategoryType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Name"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Value"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Fill" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Stroke" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Graphic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryType", propOrder = {
    "name",
    "value",
    "fill",
    "stroke",
    "graphic"
})
public class CategoryType {

    @XmlElement(name = "Name", namespace = "http://www.opengis.net/se/2.0/core", required = true)
    protected String name;
    @XmlElement(name = "Value", namespace = "http://www.opengis.net/se/2.0/core", required = true)
    protected ParameterValueType value;
    @XmlElementRef(name = "Fill", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends FillType> fill;
    @XmlElementRef(name = "Stroke", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends StrokeType> stroke;
    @XmlElementRef(name = "Graphic", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends GraphicType> graphic;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setValue(ParameterValueType value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * if defined, fill a bar
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
     * if defined, outline the bar
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
     * if defined, plot the graphic over the point
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GraphicReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeGraphicsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PieChartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExternalGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointTextGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AxisChartType }{@code >}
     *     
     */
    public JAXBElement<? extends GraphicType> getGraphic() {
        return graphic;
    }

    /**
     * Définit la valeur de la propriété graphic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GraphicReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeGraphicsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PieChartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExternalGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointTextGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AxisChartType }{@code >}
     *     
     */
    public void setGraphic(JAXBElement<? extends GraphicType> value) {
        this.graphic = value;
    }

    public boolean isSetGraphic() {
        return (this.graphic!= null);
    }

}

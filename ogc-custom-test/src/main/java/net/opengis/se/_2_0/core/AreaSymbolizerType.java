//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.thematic.DensityFillType;
import net.opengis.se._2_0.thematic.DotMapFillType;


/**
 * <p>Classe Java pour AreaSymbolizerType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AreaSymbolizerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}SymbolizerType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Geometry" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}PerpendicularOffset" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Displacement" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Fill" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Stroke" minOccurs="0"/>
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
@XmlType(name = "AreaSymbolizerType", propOrder = {
    "geometry",
    "perpendicularOffset",
    "displacement",
    "fill",
    "stroke"
})
public class AreaSymbolizerType
    extends SymbolizerType
{

    @XmlElement(name = "Geometry")
    protected GeometryType geometry;
    @XmlElement(name = "PerpendicularOffset")
    protected ParameterValueType perpendicularOffset;
    @XmlElement(name = "Displacement")
    protected TranslateType displacement;
    @XmlElementRef(name = "Fill", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends FillType> fill;
    @XmlElementRef(name = "Stroke", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends StrokeType> stroke;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Obtient la valeur de la propriété geometry.
     * 
     * @return
     *     possible object is
     *     {@link GeometryType }
     *     
     */
    public GeometryType getGeometry() {
        return geometry;
    }

    /**
     * Définit la valeur de la propriété geometry.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryType }
     *     
     */
    public void setGeometry(GeometryType value) {
        this.geometry = value;
    }

    public boolean isSetGeometry() {
        return (this.geometry!= null);
    }

    /**
     * Obtient la valeur de la propriété perpendicularOffset.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getPerpendicularOffset() {
        return perpendicularOffset;
    }

    /**
     * Définit la valeur de la propriété perpendicularOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setPerpendicularOffset(ParameterValueType value) {
        this.perpendicularOffset = value;
    }

    public boolean isSetPerpendicularOffset() {
        return (this.perpendicularOffset!= null);
    }

    /**
     * Obtient la valeur de la propriété displacement.
     * 
     * @return
     *     possible object is
     *     {@link TranslateType }
     *     
     */
    public TranslateType getDisplacement() {
        return displacement;
    }

    /**
     * Définit la valeur de la propriété displacement.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslateType }
     *     
     */
    public void setDisplacement(TranslateType value) {
        this.displacement = value;
    }

    public boolean isSetDisplacement() {
        return (this.displacement!= null);
    }

    /**
     * Obtient la valeur de la propriété fill.
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

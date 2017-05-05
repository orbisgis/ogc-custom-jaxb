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
 * <p>Classe Java pour PenStrokeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PenStrokeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}StrokeType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Fill" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Width" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}LineJoin" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}LineCap" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}DashArray" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}DashOffset" minOccurs="0"/>
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
@XmlType(name = "PenStrokeType", propOrder = {
    "fill",
    "width",
    "lineJoin",
    "lineCap",
    "dashArray",
    "dashOffset"
})
public class PenStrokeType
    extends StrokeType
{

    @XmlElementRef(name = "Fill", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends FillType> fill;
    @XmlElement(name = "Width")
    protected ParameterValueType width;
    @XmlElement(name = "LineJoin")
    protected ParameterValueType lineJoin;
    @XmlElement(name = "LineCap")
    protected ParameterValueType lineCap;
    @XmlElement(name = "DashArray")
    protected ParameterValueType dashArray;
    @XmlElement(name = "DashOffset")
    protected ParameterValueType dashOffset;
    @XmlAttribute(name = "uom")
    protected String uom;

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
     * Obtient la valeur de la propriété width.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getWidth() {
        return width;
    }

    /**
     * Définit la valeur de la propriété width.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setWidth(ParameterValueType value) {
        this.width = value;
    }

    public boolean isSetWidth() {
        return (this.width!= null);
    }

    /**
     * Obtient la valeur de la propriété lineJoin.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getLineJoin() {
        return lineJoin;
    }

    /**
     * Définit la valeur de la propriété lineJoin.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setLineJoin(ParameterValueType value) {
        this.lineJoin = value;
    }

    public boolean isSetLineJoin() {
        return (this.lineJoin!= null);
    }

    /**
     * Obtient la valeur de la propriété lineCap.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getLineCap() {
        return lineCap;
    }

    /**
     * Définit la valeur de la propriété lineCap.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setLineCap(ParameterValueType value) {
        this.lineCap = value;
    }

    public boolean isSetLineCap() {
        return (this.lineCap!= null);
    }

    /**
     * Obtient la valeur de la propriété dashArray.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getDashArray() {
        return dashArray;
    }

    /**
     * Définit la valeur de la propriété dashArray.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setDashArray(ParameterValueType value) {
        this.dashArray = value;
    }

    public boolean isSetDashArray() {
        return (this.dashArray!= null);
    }

    /**
     * Obtient la valeur de la propriété dashOffset.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getDashOffset() {
        return dashOffset;
    }

    /**
     * Définit la valeur de la propriété dashOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setDashOffset(ParameterValueType value) {
        this.dashOffset = value;
    }

    public boolean isSetDashOffset() {
        return (this.dashOffset!= null);
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

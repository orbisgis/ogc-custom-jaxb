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


/**
 * <p>Classe Java pour HatchedFillType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HatchedFillType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FillType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Stroke"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Angle" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Distance"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Offset"/>
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
@XmlType(name = "HatchedFillType", propOrder = {
    "stroke",
    "angle",
    "distance",
    "offset"
})
public class HatchedFillType
    extends FillType
{

    @XmlElementRef(name = "Stroke", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends StrokeType> stroke;
    @XmlElement(name = "Angle")
    protected ParameterValueType angle;
    @XmlElement(name = "Distance", required = true)
    protected ParameterValueType distance;
    @XmlElement(name = "Offset", required = true)
    protected ParameterValueType offset;
    @XmlAttribute(name = "uom")
    protected String uom;

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
     * Obtient la valeur de la propriété angle.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getAngle() {
        return angle;
    }

    /**
     * Définit la valeur de la propriété angle.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setAngle(ParameterValueType value) {
        this.angle = value;
    }

    public boolean isSetAngle() {
        return (this.angle!= null);
    }

    /**
     * Obtient la valeur de la propriété distance.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getDistance() {
        return distance;
    }

    /**
     * Définit la valeur de la propriété distance.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setDistance(ParameterValueType value) {
        this.distance = value;
    }

    public boolean isSetDistance() {
        return (this.distance!= null);
    }

    /**
     * Obtient la valeur de la propriété offset.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getOffset() {
        return offset;
    }

    /**
     * Définit la valeur de la propriété offset.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setOffset(ParameterValueType value) {
        this.offset = value;
    }

    public boolean isSetOffset() {
        return (this.offset!= null);
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

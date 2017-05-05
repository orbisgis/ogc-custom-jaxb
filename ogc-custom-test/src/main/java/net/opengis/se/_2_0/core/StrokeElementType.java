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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StrokeElementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StrokeElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}PreGap" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Stroke"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Length" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}PostGap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrokeElementType", propOrder = {
    "preGap",
    "stroke",
    "length",
    "postGap"
})
public class StrokeElementType {

    @XmlElement(name = "PreGap")
    protected ParameterValueType preGap;
    @XmlElementRef(name = "Stroke", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends StrokeType> stroke;
    @XmlElement(name = "Length")
    protected ParameterValueType length;
    @XmlElement(name = "PostGap")
    protected ParameterValueType postGap;

    /**
     * Obtient la valeur de la propriété preGap.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getPreGap() {
        return preGap;
    }

    /**
     * Définit la valeur de la propriété preGap.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setPreGap(ParameterValueType value) {
        this.preGap = value;
    }

    public boolean isSetPreGap() {
        return (this.preGap!= null);
    }

    /**
     * Restricted Stroke: not allowed to nest a compound stroke within a compound stroke...
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
     * Obtient la valeur de la propriété length.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getLength() {
        return length;
    }

    /**
     * Définit la valeur de la propriété length.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setLength(ParameterValueType value) {
        this.length = value;
    }

    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Obtient la valeur de la propriété postGap.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getPostGap() {
        return postGap;
    }

    /**
     * Définit la valeur de la propriété postGap.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setPostGap(ParameterValueType value) {
        this.postGap = value;
    }

    public boolean isSetPostGap() {
        return (this.postGap!= null);
    }

}

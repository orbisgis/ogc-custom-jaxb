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
import net.opengis.se._2_0.core.FillReferenceType;
import net.opengis.se._2_0.core.FillType;
import net.opengis.se._2_0.core.GraphicFillType;
import net.opengis.se._2_0.core.HatchedFillType;
import net.opengis.se._2_0.core.ParameterValueType;
import net.opengis.se._2_0.core.SolidFillType;


/**
 * <p>Classe Java pour SliceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SliceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Name"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Value"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Fill"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}Gap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SliceType", propOrder = {
    "name",
    "value",
    "fill",
    "gap"
})
public class SliceType {

    @XmlElement(name = "Name", namespace = "http://www.opengis.net/se/2.0/core", required = true)
    protected String name;
    @XmlElement(name = "Value", namespace = "http://www.opengis.net/se/2.0/core", required = true)
    protected ParameterValueType value;
    @XmlElementRef(name = "Fill", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends FillType> fill;
    @XmlElement(name = "Gap")
    protected ParameterValueType gap;

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
     * Obtient la valeur de la propriété gap.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getGap() {
        return gap;
    }

    /**
     * Définit la valeur de la propriété gap.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setGap(ParameterValueType value) {
        this.gap = value;
    }

    public boolean isSetGap() {
        return (this.gap!= null);
    }

}

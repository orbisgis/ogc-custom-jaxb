//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ExternalGraphicType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ExternalGraphicType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}GraphicType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OnlineResource" type="{http://www.opengis.net/se/2.0/core}VariableOnlineResourceType"/>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/core}InlineContent"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Format"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}ViewBox" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Transform" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Opacity" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Halo" minOccurs="0"/>
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
@XmlType(name = "ExternalGraphicType", propOrder = {
    "onlineResource",
    "inlineContent",
    "format",
    "viewBox",
    "transform",
    "opacity",
    "halo"
})
public class ExternalGraphicType
    extends GraphicType
{

    @XmlElement(name = "OnlineResource")
    protected VariableOnlineResourceType onlineResource;
    @XmlElement(name = "InlineContent")
    protected InlineContentType inlineContent;
    @XmlElement(name = "Format", required = true)
    protected String format;
    @XmlElement(name = "ViewBox")
    protected ViewBoxType viewBox;
    @XmlElement(name = "Transform")
    protected TransformType transform;
    @XmlElement(name = "Opacity")
    protected ParameterValueType opacity;
    @XmlElement(name = "Halo")
    protected HaloType halo;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Obtient la valeur de la propriété onlineResource.
     * 
     * @return
     *     possible object is
     *     {@link VariableOnlineResourceType }
     *     
     */
    public VariableOnlineResourceType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Définit la valeur de la propriété onlineResource.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableOnlineResourceType }
     *     
     */
    public void setOnlineResource(VariableOnlineResourceType value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

    /**
     * Obtient la valeur de la propriété inlineContent.
     * 
     * @return
     *     possible object is
     *     {@link InlineContentType }
     *     
     */
    public InlineContentType getInlineContent() {
        return inlineContent;
    }

    /**
     * Définit la valeur de la propriété inlineContent.
     * 
     * @param value
     *     allowed object is
     *     {@link InlineContentType }
     *     
     */
    public void setInlineContent(InlineContentType value) {
        this.inlineContent = value;
    }

    public boolean isSetInlineContent() {
        return (this.inlineContent!= null);
    }

    /**
     * Obtient la valeur de la propriété format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Définit la valeur de la propriété format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    public boolean isSetFormat() {
        return (this.format!= null);
    }

    /**
     * Obtient la valeur de la propriété viewBox.
     * 
     * @return
     *     possible object is
     *     {@link ViewBoxType }
     *     
     */
    public ViewBoxType getViewBox() {
        return viewBox;
    }

    /**
     * Définit la valeur de la propriété viewBox.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewBoxType }
     *     
     */
    public void setViewBox(ViewBoxType value) {
        this.viewBox = value;
    }

    public boolean isSetViewBox() {
        return (this.viewBox!= null);
    }

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
     * Obtient la valeur de la propriété opacity.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getOpacity() {
        return opacity;
    }

    /**
     * Définit la valeur de la propriété opacity.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setOpacity(ParameterValueType value) {
        this.opacity = value;
    }

    public boolean isSetOpacity() {
        return (this.opacity!= null);
    }

    /**
     * Obtient la valeur de la propriété halo.
     * 
     * @return
     *     possible object is
     *     {@link HaloType }
     *     
     */
    public HaloType getHalo() {
        return halo;
    }

    /**
     * Définit la valeur de la propriété halo.
     * 
     * @param value
     *     allowed object is
     *     {@link HaloType }
     *     
     */
    public void setHalo(HaloType value) {
        this.halo = value;
    }

    public boolean isSetHalo() {
        return (this.halo!= null);
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

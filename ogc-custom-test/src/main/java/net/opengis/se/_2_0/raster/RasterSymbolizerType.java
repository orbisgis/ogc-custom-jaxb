//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.raster;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.core.GeometryType;
import net.opengis.se._2_0.core.ParameterValueType;
import net.opengis.se._2_0.core.SymbolizerType;


/**
 * <p>Classe Java pour RasterSymbolizerType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RasterSymbolizerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}SymbolizerType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Geometry" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Opacity" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}ChannelSelection" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}OverlapBehavior" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}ColorMap" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}ContrastEnhancement" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}ShadedRelief" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}ImageOutline" minOccurs="0"/>
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
@XmlType(name = "RasterSymbolizerType", propOrder = {
    "geometry",
    "opacity",
    "channelSelection",
    "overlapBehavior",
    "colorMap",
    "contrastEnhancement",
    "shadedRelief",
    "imageOutline"
})
public class RasterSymbolizerType
    extends SymbolizerType
{

    @XmlElement(name = "Geometry", namespace = "http://www.opengis.net/se/2.0/core")
    protected GeometryType geometry;
    @XmlElement(name = "Opacity", namespace = "http://www.opengis.net/se/2.0/core")
    protected ParameterValueType opacity;
    @XmlElement(name = "ChannelSelection")
    protected ChannelSelectionType channelSelection;
    @XmlElement(name = "OverlapBehavior")
    protected String overlapBehavior;
    @XmlElement(name = "ColorMap")
    protected ColorMapType colorMap;
    @XmlElement(name = "ContrastEnhancement")
    protected ContrastEnhancementType contrastEnhancement;
    @XmlElement(name = "ShadedRelief")
    protected ShadedReliefType shadedRelief;
    @XmlElement(name = "ImageOutline")
    protected ImageOutlineType imageOutline;
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
     * Obtient la valeur de la propriété channelSelection.
     * 
     * @return
     *     possible object is
     *     {@link ChannelSelectionType }
     *     
     */
    public ChannelSelectionType getChannelSelection() {
        return channelSelection;
    }

    /**
     * Définit la valeur de la propriété channelSelection.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelSelectionType }
     *     
     */
    public void setChannelSelection(ChannelSelectionType value) {
        this.channelSelection = value;
    }

    public boolean isSetChannelSelection() {
        return (this.channelSelection!= null);
    }

    /**
     * Obtient la valeur de la propriété overlapBehavior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverlapBehavior() {
        return overlapBehavior;
    }

    /**
     * Définit la valeur de la propriété overlapBehavior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverlapBehavior(String value) {
        this.overlapBehavior = value;
    }

    public boolean isSetOverlapBehavior() {
        return (this.overlapBehavior!= null);
    }

    /**
     * Obtient la valeur de la propriété colorMap.
     * 
     * @return
     *     possible object is
     *     {@link ColorMapType }
     *     
     */
    public ColorMapType getColorMap() {
        return colorMap;
    }

    /**
     * Définit la valeur de la propriété colorMap.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorMapType }
     *     
     */
    public void setColorMap(ColorMapType value) {
        this.colorMap = value;
    }

    public boolean isSetColorMap() {
        return (this.colorMap!= null);
    }

    /**
     * Obtient la valeur de la propriété contrastEnhancement.
     * 
     * @return
     *     possible object is
     *     {@link ContrastEnhancementType }
     *     
     */
    public ContrastEnhancementType getContrastEnhancement() {
        return contrastEnhancement;
    }

    /**
     * Définit la valeur de la propriété contrastEnhancement.
     * 
     * @param value
     *     allowed object is
     *     {@link ContrastEnhancementType }
     *     
     */
    public void setContrastEnhancement(ContrastEnhancementType value) {
        this.contrastEnhancement = value;
    }

    public boolean isSetContrastEnhancement() {
        return (this.contrastEnhancement!= null);
    }

    /**
     * Obtient la valeur de la propriété shadedRelief.
     * 
     * @return
     *     possible object is
     *     {@link ShadedReliefType }
     *     
     */
    public ShadedReliefType getShadedRelief() {
        return shadedRelief;
    }

    /**
     * Définit la valeur de la propriété shadedRelief.
     * 
     * @param value
     *     allowed object is
     *     {@link ShadedReliefType }
     *     
     */
    public void setShadedRelief(ShadedReliefType value) {
        this.shadedRelief = value;
    }

    public boolean isSetShadedRelief() {
        return (this.shadedRelief!= null);
    }

    /**
     * Obtient la valeur de la propriété imageOutline.
     * 
     * @return
     *     possible object is
     *     {@link ImageOutlineType }
     *     
     */
    public ImageOutlineType getImageOutline() {
        return imageOutline;
    }

    /**
     * Définit la valeur de la propriété imageOutline.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageOutlineType }
     *     
     */
    public void setImageOutline(ImageOutlineType value) {
        this.imageOutline = value;
    }

    public boolean isSetImageOutline() {
        return (this.imageOutline!= null);
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

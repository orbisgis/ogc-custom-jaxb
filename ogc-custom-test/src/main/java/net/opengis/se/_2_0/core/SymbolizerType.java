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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.ows._2.DescriptionType;
import net.opengis.se._2_0.raster.RasterSymbolizerType;


/**
 * A "SymbolizerType" is an abstract type for encoding the graphical properties used to portray geographic information.  Concrete Symbolizer types are derived from this base type.
 * 
 * <p>Classe Java pour SymbolizerType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SymbolizerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}LegendGraphic" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Extension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.opengis.net/se/2.0/core}VersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymbolizerType", propOrder = {
    "name",
    "description",
    "legendGraphic",
    "extension"
})
@XmlSeeAlso({
    CompositeSymbolizerType.class,
    SymbolizerReferenceType.class,
    TextSymbolizerType.class,
    LineSymbolizerType.class,
    AreaSymbolizerType.class,
    PointSymbolizerType.class,
    RasterSymbolizerType.class
})
public abstract class SymbolizerType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "LegendGraphic")
    protected LegendGraphicType legendGraphic;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;
    @XmlAttribute(name = "version")
    protected VersionType version;

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
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Obtient la valeur de la propriété legendGraphic.
     * 
     * @return
     *     possible object is
     *     {@link LegendGraphicType }
     *     
     */
    public LegendGraphicType getLegendGraphic() {
        return legendGraphic;
    }

    /**
     * Définit la valeur de la propriété legendGraphic.
     * 
     * @param value
     *     allowed object is
     *     {@link LegendGraphicType }
     *     
     */
    public void setLegendGraphic(LegendGraphicType value) {
        this.legendGraphic = value;
    }

    public boolean isSetLegendGraphic() {
        return (this.legendGraphic!= null);
    }

    /**
     * Obtient la valeur de la propriété extension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Définit la valeur de la propriété extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

    public boolean isSetExtension() {
        return (this.extension!= null);
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link VersionType }
     *     
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionType }
     *     
     */
    public void setVersion(VersionType value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}

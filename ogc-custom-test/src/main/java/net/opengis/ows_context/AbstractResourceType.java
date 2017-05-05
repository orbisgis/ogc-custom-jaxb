//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.ows._2.IdentificationType;


/**
 * <p>Classe Java pour AbstractResourceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractResourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows/2.0}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="DataURL" type="{http://www.opengis.net/ows-context}URLType" minOccurs="0"/>
 *         &lt;element name="MetadataURL" type="{http://www.opengis.net/ows-context}URLType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}MinScaleDenominator" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}MaxScaleDenominator" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.opengis.net/ows-context}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="opacity" type="{http://www.w3.org/2001/XMLSchema}decimal" default="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResourceType", propOrder = {
    "dataURL",
    "metadataURL",
    "minScaleDenominator",
    "maxScaleDenominator",
    "extension"
})
@XmlSeeAlso({
    MediaType.class,
    LayerType.class
})
public abstract class AbstractResourceType
    extends IdentificationType
{

    @XmlElement(name = "DataURL")
    protected URLType dataURL;
    @XmlElement(name = "MetadataURL")
    protected URLType metadataURL;
    @XmlElement(name = "MinScaleDenominator", namespace = "http://www.opengis.net/se/2.0/core")
    protected Double minScaleDenominator;
    @XmlElement(name = "MaxScaleDenominator", namespace = "http://www.opengis.net/se/2.0/core")
    protected Double maxScaleDenominator;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "group")
    @XmlSchemaType(name = "anySimpleType")
    protected String group;
    @XmlAttribute(name = "hidden")
    protected Boolean hidden;
    @XmlAttribute(name = "opacity")
    protected BigDecimal opacity;

    /**
     * Obtient la valeur de la propriété dataURL.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getDataURL() {
        return dataURL;
    }

    /**
     * Définit la valeur de la propriété dataURL.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setDataURL(URLType value) {
        this.dataURL = value;
    }

    public boolean isSetDataURL() {
        return (this.dataURL!= null);
    }

    /**
     * Obtient la valeur de la propriété metadataURL.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getMetadataURL() {
        return metadataURL;
    }

    /**
     * Définit la valeur de la propriété metadataURL.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setMetadataURL(URLType value) {
        this.metadataURL = value;
    }

    public boolean isSetMetadataURL() {
        return (this.metadataURL!= null);
    }

    /**
     * Obtient la valeur de la propriété minScaleDenominator.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinScaleDenominator() {
        return minScaleDenominator;
    }

    /**
     * Définit la valeur de la propriété minScaleDenominator.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinScaleDenominator(Double value) {
        this.minScaleDenominator = value;
    }

    public boolean isSetMinScaleDenominator() {
        return (this.minScaleDenominator!= null);
    }

    /**
     * Obtient la valeur de la propriété maxScaleDenominator.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxScaleDenominator() {
        return maxScaleDenominator;
    }

    /**
     * Définit la valeur de la propriété maxScaleDenominator.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxScaleDenominator(Double value) {
        this.maxScaleDenominator = value;
    }

    public boolean isSetMaxScaleDenominator() {
        return (this.maxScaleDenominator!= null);
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
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Obtient la valeur de la propriété group.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Définit la valeur de la propriété group.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    public boolean isSetGroup() {
        return (this.group!= null);
    }

    /**
     * Obtient la valeur de la propriété hidden.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHidden() {
        if (hidden == null) {
            return false;
        } else {
            return hidden;
        }
    }

    /**
     * Définit la valeur de la propriété hidden.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(boolean value) {
        this.hidden = value;
    }

    public boolean isSetHidden() {
        return (this.hidden!= null);
    }

    public void unsetHidden() {
        this.hidden = null;
    }

    /**
     * Obtient la valeur de la propriété opacity.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpacity() {
        if (opacity == null) {
            return new BigDecimal("1");
        } else {
            return opacity;
        }
    }

    /**
     * Définit la valeur de la propriété opacity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpacity(BigDecimal value) {
        this.opacity = value;
    }

    public boolean isSetOpacity() {
        return (this.opacity!= null);
    }

}

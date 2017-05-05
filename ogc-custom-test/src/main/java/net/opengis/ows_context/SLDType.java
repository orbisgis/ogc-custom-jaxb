//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.core.AbstractStyleType;
import net.opengis.se._2_0.core.StyleReferenceType;
import net.opengis.se._2_0.core.StyleType;
import net.opengis.sld._1_2.StyledLayerDescriptorElement;


/**
 * <p>Classe Java pour SLDType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegendURL" type="{http://www.opengis.net/ows-context}URLType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="OnlineResource" type="{http://www.opengis.net/ows-context}OnlineResourceType"/>
 *           &lt;element ref="{http://www.opengis.net/sld/1.2}StyledLayerDescriptor"/>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/core}AbstractStyle"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLDType", propOrder = {
    "name",
    "title",
    "legendURL",
    "onlineResource",
    "styledLayerDescriptor",
    "abstractStyle"
})
public class SLDType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "LegendURL")
    protected URLType legendURL;
    @XmlElement(name = "OnlineResource")
    protected OnlineResourceType onlineResource;
    @XmlElement(name = "StyledLayerDescriptor", namespace = "http://www.opengis.net/sld/1.2")
    protected StyledLayerDescriptorElement styledLayerDescriptor;
    @XmlElementRef(name = "AbstractStyle", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractStyleType> abstractStyle;

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
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Obtient la valeur de la propriété legendURL.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getLegendURL() {
        return legendURL;
    }

    /**
     * Définit la valeur de la propriété legendURL.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setLegendURL(URLType value) {
        this.legendURL = value;
    }

    public boolean isSetLegendURL() {
        return (this.legendURL!= null);
    }

    /**
     * Obtient la valeur de la propriété onlineResource.
     * 
     * @return
     *     possible object is
     *     {@link OnlineResourceType }
     *     
     */
    public OnlineResourceType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Définit la valeur de la propriété onlineResource.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineResourceType }
     *     
     */
    public void setOnlineResource(OnlineResourceType value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

    /**
     * Obtient la valeur de la propriété styledLayerDescriptor.
     * 
     * @return
     *     possible object is
     *     {@link StyledLayerDescriptorElement }
     *     
     */
    public StyledLayerDescriptorElement getStyledLayerDescriptor() {
        return styledLayerDescriptor;
    }

    /**
     * Définit la valeur de la propriété styledLayerDescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link StyledLayerDescriptorElement }
     *     
     */
    public void setStyledLayerDescriptor(StyledLayerDescriptorElement value) {
        this.styledLayerDescriptor = value;
    }

    public boolean isSetStyledLayerDescriptor() {
        return (this.styledLayerDescriptor!= null);
    }

    /**
     * Obtient la valeur de la propriété abstractStyle.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StyleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StyleReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractStyleType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractStyleType> getAbstractStyle() {
        return abstractStyle;
    }

    /**
     * Définit la valeur de la propriété abstractStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StyleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StyleReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractStyleType }{@code >}
     *     
     */
    public void setAbstractStyle(JAXBElement<? extends AbstractStyleType> value) {
        this.abstractStyle = value;
    }

    public boolean isSetAbstractStyle() {
        return (this.abstractStyle!= null);
    }

}

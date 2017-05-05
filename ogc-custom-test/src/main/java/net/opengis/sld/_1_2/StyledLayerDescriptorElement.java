//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.sld._1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.ows._2.DescriptionType;
import net.opengis.se._2_0.core.VersionType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/sld/1.2}UseSLDLibrary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/sld/1.2}NamedLayer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.opengis.net/se/2.0/core}VersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "description",
    "useSLDLibrary",
    "namedLayer"
})
@XmlRootElement(name = "StyledLayerDescriptor")
public class StyledLayerDescriptorElement {

    @XmlElement(name = "Name", namespace = "http://www.opengis.net/se/2.0/core")
    protected String name;
    @XmlElement(name = "Description", namespace = "http://www.opengis.net/se/2.0/core")
    protected DescriptionType description;
    @XmlElement(name = "UseSLDLibrary")
    protected List<UseSLDLibraryElement> useSLDLibrary;
    @XmlElement(name = "NamedLayer")
    protected List<NamedLayerElement> namedLayer;
    @XmlAttribute(name = "version", required = true)
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
     * Gets the value of the useSLDLibrary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useSLDLibrary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseSLDLibrary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UseSLDLibraryElement }
     * 
     * 
     */
    public List<UseSLDLibraryElement> getUseSLDLibrary() {
        if (useSLDLibrary == null) {
            useSLDLibrary = new ArrayList<UseSLDLibraryElement>();
        }
        return this.useSLDLibrary;
    }

    public boolean isSetUseSLDLibrary() {
        return ((this.useSLDLibrary!= null)&&(!this.useSLDLibrary.isEmpty()));
    }

    public void unsetUseSLDLibrary() {
        this.useSLDLibrary = null;
    }

    /**
     * Gets the value of the namedLayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedLayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedLayerElement }
     * 
     * 
     */
    public List<NamedLayerElement> getNamedLayer() {
        if (namedLayer == null) {
            namedLayer = new ArrayList<NamedLayerElement>();
        }
        return this.namedLayer;
    }

    public boolean isSetNamedLayer() {
        return ((this.namedLayer!= null)&&(!this.namedLayer.isEmpty()));
    }

    public void unsetNamedLayer() {
        this.namedLayer = null;
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

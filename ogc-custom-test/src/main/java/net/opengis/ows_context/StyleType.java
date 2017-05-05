//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StyleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="LegendURL" type="{http://www.opengis.net/ows-context}URLType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="SLD" type="{http://www.opengis.net/ows-context}SLDType" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="current" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleType", propOrder = {
    "name",
    "title",
    "_abstract",
    "legendURL",
    "sld"
})
public class StyleType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Abstract")
    protected String _abstract;
    @XmlElement(name = "LegendURL")
    protected URLType legendURL;
    @XmlElement(name = "SLD")
    protected SLDType sld;
    @XmlAttribute(name = "current")
    protected Boolean current;

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
     * Obtient la valeur de la propriété abstract.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Définit la valeur de la propriété abstract.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    public boolean isSetAbstract() {
        return (this._abstract!= null);
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
     * Obtient la valeur de la propriété sld.
     * 
     * @return
     *     possible object is
     *     {@link SLDType }
     *     
     */
    public SLDType getSLD() {
        return sld;
    }

    /**
     * Définit la valeur de la propriété sld.
     * 
     * @param value
     *     allowed object is
     *     {@link SLDType }
     *     
     */
    public void setSLD(SLDType value) {
        this.sld = value;
    }

    public boolean isSetSLD() {
        return (this.sld!= null);
    }

    /**
     * Obtient la valeur de la propriété current.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     * Définit la valeur de la propriété current.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrent(boolean value) {
        this.current = value;
    }

    public boolean isSetCurrent() {
        return (this.current!= null);
    }

    public void unsetCurrent() {
        this.current = null;
    }

}

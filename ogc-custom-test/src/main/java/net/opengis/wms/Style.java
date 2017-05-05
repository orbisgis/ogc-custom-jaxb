//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.opengis.net/wms}Name"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Title"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Abstract" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}LegendURL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}StyleSheetURL" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}StyleURL" minOccurs="0"/>
 *       &lt;/sequence>
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
    "title",
    "_abstract",
    "legendURL",
    "styleSheetURL",
    "styleURL"
})
@XmlRootElement(name = "Style")
public class Style {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Abstract")
    protected String _abstract;
    @XmlElement(name = "LegendURL")
    protected List<LegendURL> legendURL;
    @XmlElement(name = "StyleSheetURL")
    protected StyleSheetURL styleSheetURL;
    @XmlElement(name = "StyleURL")
    protected StyleURL styleURL;

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
     * Gets the value of the legendURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legendURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegendURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegendURL }
     * 
     * 
     */
    public List<LegendURL> getLegendURL() {
        if (legendURL == null) {
            legendURL = new ArrayList<LegendURL>();
        }
        return this.legendURL;
    }

    public boolean isSetLegendURL() {
        return ((this.legendURL!= null)&&(!this.legendURL.isEmpty()));
    }

    public void unsetLegendURL() {
        this.legendURL = null;
    }

    /**
     * Obtient la valeur de la propriété styleSheetURL.
     * 
     * @return
     *     possible object is
     *     {@link StyleSheetURL }
     *     
     */
    public StyleSheetURL getStyleSheetURL() {
        return styleSheetURL;
    }

    /**
     * Définit la valeur de la propriété styleSheetURL.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleSheetURL }
     *     
     */
    public void setStyleSheetURL(StyleSheetURL value) {
        this.styleSheetURL = value;
    }

    public boolean isSetStyleSheetURL() {
        return (this.styleSheetURL!= null);
    }

    /**
     * Obtient la valeur de la propriété styleURL.
     * 
     * @return
     *     possible object is
     *     {@link StyleURL }
     *     
     */
    public StyleURL getStyleURL() {
        return styleURL;
    }

    /**
     * Définit la valeur de la propriété styleURL.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleURL }
     *     
     */
    public void setStyleURL(StyleURL value) {
        this.styleURL = value;
    }

    public boolean isSetStyleURL() {
        return (this.styleURL!= null);
    }

}

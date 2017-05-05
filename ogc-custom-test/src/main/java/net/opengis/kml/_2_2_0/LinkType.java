//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.kml._2_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LinkType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LinkType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}BasicLinkType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}refreshMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}refreshInterval" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}viewRefreshMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}viewRefreshTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}viewBoundScale" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}viewFormat" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}httpQuery" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LinkSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LinkObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkType", propOrder = {
    "refreshMode",
    "refreshInterval",
    "viewRefreshMode",
    "viewRefreshTime",
    "viewBoundScale",
    "viewFormat",
    "httpQuery",
    "linkSimpleExtensionGroup",
    "linkObjectExtensionGroup"
})
public class LinkType
    extends BasicLinkType
{

    @XmlElement(defaultValue = "onChange")
    protected RefreshModeEnumType refreshMode;
    @XmlElement(defaultValue = "4.0")
    protected Double refreshInterval;
    @XmlElement(defaultValue = "never")
    protected ViewRefreshModeEnumType viewRefreshMode;
    @XmlElement(defaultValue = "4.0")
    protected Double viewRefreshTime;
    @XmlElement(defaultValue = "1.0")
    protected Double viewBoundScale;
    protected String viewFormat;
    protected String httpQuery;
    @XmlElement(name = "LinkSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> linkSimpleExtensionGroup;
    @XmlElement(name = "LinkObjectExtensionGroup")
    protected List<AbstractObjectType> linkObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété refreshMode.
     * 
     * @return
     *     possible object is
     *     {@link RefreshModeEnumType }
     *     
     */
    public RefreshModeEnumType getRefreshMode() {
        return refreshMode;
    }

    /**
     * Définit la valeur de la propriété refreshMode.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshModeEnumType }
     *     
     */
    public void setRefreshMode(RefreshModeEnumType value) {
        this.refreshMode = value;
    }

    public boolean isSetRefreshMode() {
        return (this.refreshMode!= null);
    }

    /**
     * Obtient la valeur de la propriété refreshInterval.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * Définit la valeur de la propriété refreshInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRefreshInterval(Double value) {
        this.refreshInterval = value;
    }

    public boolean isSetRefreshInterval() {
        return (this.refreshInterval!= null);
    }

    /**
     * Obtient la valeur de la propriété viewRefreshMode.
     * 
     * @return
     *     possible object is
     *     {@link ViewRefreshModeEnumType }
     *     
     */
    public ViewRefreshModeEnumType getViewRefreshMode() {
        return viewRefreshMode;
    }

    /**
     * Définit la valeur de la propriété viewRefreshMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewRefreshModeEnumType }
     *     
     */
    public void setViewRefreshMode(ViewRefreshModeEnumType value) {
        this.viewRefreshMode = value;
    }

    public boolean isSetViewRefreshMode() {
        return (this.viewRefreshMode!= null);
    }

    /**
     * Obtient la valeur de la propriété viewRefreshTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getViewRefreshTime() {
        return viewRefreshTime;
    }

    /**
     * Définit la valeur de la propriété viewRefreshTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setViewRefreshTime(Double value) {
        this.viewRefreshTime = value;
    }

    public boolean isSetViewRefreshTime() {
        return (this.viewRefreshTime!= null);
    }

    /**
     * Obtient la valeur de la propriété viewBoundScale.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getViewBoundScale() {
        return viewBoundScale;
    }

    /**
     * Définit la valeur de la propriété viewBoundScale.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setViewBoundScale(Double value) {
        this.viewBoundScale = value;
    }

    public boolean isSetViewBoundScale() {
        return (this.viewBoundScale!= null);
    }

    /**
     * Obtient la valeur de la propriété viewFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewFormat() {
        return viewFormat;
    }

    /**
     * Définit la valeur de la propriété viewFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewFormat(String value) {
        this.viewFormat = value;
    }

    public boolean isSetViewFormat() {
        return (this.viewFormat!= null);
    }

    /**
     * Obtient la valeur de la propriété httpQuery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpQuery() {
        return httpQuery;
    }

    /**
     * Définit la valeur de la propriété httpQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpQuery(String value) {
        this.httpQuery = value;
    }

    public boolean isSetHttpQuery() {
        return (this.httpQuery!= null);
    }

    /**
     * Gets the value of the linkSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLinkSimpleExtensionGroup() {
        if (linkSimpleExtensionGroup == null) {
            linkSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.linkSimpleExtensionGroup;
    }

    public boolean isSetLinkSimpleExtensionGroup() {
        return ((this.linkSimpleExtensionGroup!= null)&&(!this.linkSimpleExtensionGroup.isEmpty()));
    }

    public void unsetLinkSimpleExtensionGroup() {
        this.linkSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the linkObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getLinkObjectExtensionGroup() {
        if (linkObjectExtensionGroup == null) {
            linkObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.linkObjectExtensionGroup;
    }

    public boolean isSetLinkObjectExtensionGroup() {
        return ((this.linkObjectExtensionGroup!= null)&&(!this.linkObjectExtensionGroup.isEmpty()));
    }

    public void unsetLinkObjectExtensionGroup() {
        this.linkObjectExtensionGroup = null;
    }

}

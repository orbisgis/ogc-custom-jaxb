//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.kml._2_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NetworkLinkControlType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkLinkControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}minRefreshPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}maxSessionLength" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}cookie" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}message" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}linkName" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}linkDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}linkSnippet" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}expires" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}Update" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractViewGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}NetworkLinkControlSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}NetworkLinkControlObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkLinkControlType", propOrder = {
    "minRefreshPeriod",
    "maxSessionLength",
    "cookie",
    "message",
    "linkName",
    "linkDescription",
    "linkSnippet",
    "expires",
    "update",
    "abstractViewGroup",
    "networkLinkControlSimpleExtensionGroup",
    "networkLinkControlObjectExtensionGroup"
})
public class NetworkLinkControlType {

    @XmlElement(defaultValue = "0.0")
    protected Double minRefreshPeriod;
    @XmlElement(defaultValue = "-1.0")
    protected Double maxSessionLength;
    protected String cookie;
    protected String message;
    protected String linkName;
    protected String linkDescription;
    protected SnippetType linkSnippet;
    protected String expires;
    @XmlElement(name = "Update")
    protected UpdateType update;
    @XmlElementRef(name = "AbstractViewGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractViewType> abstractViewGroup;
    @XmlElement(name = "NetworkLinkControlSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> networkLinkControlSimpleExtensionGroup;
    @XmlElement(name = "NetworkLinkControlObjectExtensionGroup")
    protected List<AbstractObjectType> networkLinkControlObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété minRefreshPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinRefreshPeriod() {
        return minRefreshPeriod;
    }

    /**
     * Définit la valeur de la propriété minRefreshPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinRefreshPeriod(Double value) {
        this.minRefreshPeriod = value;
    }

    public boolean isSetMinRefreshPeriod() {
        return (this.minRefreshPeriod!= null);
    }

    /**
     * Obtient la valeur de la propriété maxSessionLength.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxSessionLength() {
        return maxSessionLength;
    }

    /**
     * Définit la valeur de la propriété maxSessionLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxSessionLength(Double value) {
        this.maxSessionLength = value;
    }

    public boolean isSetMaxSessionLength() {
        return (this.maxSessionLength!= null);
    }

    /**
     * Obtient la valeur de la propriété cookie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * Définit la valeur de la propriété cookie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookie(String value) {
        this.cookie = value;
    }

    public boolean isSetCookie() {
        return (this.cookie!= null);
    }

    /**
     * Obtient la valeur de la propriété message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    public boolean isSetMessage() {
        return (this.message!= null);
    }

    /**
     * Obtient la valeur de la propriété linkName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * Définit la valeur de la propriété linkName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkName(String value) {
        this.linkName = value;
    }

    public boolean isSetLinkName() {
        return (this.linkName!= null);
    }

    /**
     * Obtient la valeur de la propriété linkDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkDescription() {
        return linkDescription;
    }

    /**
     * Définit la valeur de la propriété linkDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkDescription(String value) {
        this.linkDescription = value;
    }

    public boolean isSetLinkDescription() {
        return (this.linkDescription!= null);
    }

    /**
     * Obtient la valeur de la propriété linkSnippet.
     * 
     * @return
     *     possible object is
     *     {@link SnippetType }
     *     
     */
    public SnippetType getLinkSnippet() {
        return linkSnippet;
    }

    /**
     * Définit la valeur de la propriété linkSnippet.
     * 
     * @param value
     *     allowed object is
     *     {@link SnippetType }
     *     
     */
    public void setLinkSnippet(SnippetType value) {
        this.linkSnippet = value;
    }

    public boolean isSetLinkSnippet() {
        return (this.linkSnippet!= null);
    }

    /**
     * Obtient la valeur de la propriété expires.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpires() {
        return expires;
    }

    /**
     * Définit la valeur de la propriété expires.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpires(String value) {
        this.expires = value;
    }

    public boolean isSetExpires() {
        return (this.expires!= null);
    }

    /**
     * Obtient la valeur de la propriété update.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType }
     *     
     */
    public UpdateType getUpdate() {
        return update;
    }

    /**
     * Définit la valeur de la propriété update.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType }
     *     
     */
    public void setUpdate(UpdateType value) {
        this.update = value;
    }

    public boolean isSetUpdate() {
        return (this.update!= null);
    }

    /**
     * Obtient la valeur de la propriété abstractViewGroup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CameraType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractViewType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LookAtType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractViewType> getAbstractViewGroup() {
        return abstractViewGroup;
    }

    /**
     * Définit la valeur de la propriété abstractViewGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CameraType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractViewType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LookAtType }{@code >}
     *     
     */
    public void setAbstractViewGroup(JAXBElement<? extends AbstractViewType> value) {
        this.abstractViewGroup = value;
    }

    public boolean isSetAbstractViewGroup() {
        return (this.abstractViewGroup!= null);
    }

    /**
     * Gets the value of the networkLinkControlSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkLinkControlSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkLinkControlSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getNetworkLinkControlSimpleExtensionGroup() {
        if (networkLinkControlSimpleExtensionGroup == null) {
            networkLinkControlSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.networkLinkControlSimpleExtensionGroup;
    }

    public boolean isSetNetworkLinkControlSimpleExtensionGroup() {
        return ((this.networkLinkControlSimpleExtensionGroup!= null)&&(!this.networkLinkControlSimpleExtensionGroup.isEmpty()));
    }

    public void unsetNetworkLinkControlSimpleExtensionGroup() {
        this.networkLinkControlSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the networkLinkControlObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkLinkControlObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkLinkControlObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getNetworkLinkControlObjectExtensionGroup() {
        if (networkLinkControlObjectExtensionGroup == null) {
            networkLinkControlObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.networkLinkControlObjectExtensionGroup;
    }

    public boolean isSetNetworkLinkControlObjectExtensionGroup() {
        return ((this.networkLinkControlObjectExtensionGroup!= null)&&(!this.networkLinkControlObjectExtensionGroup.isEmpty()));
    }

    public void unsetNetworkLinkControlObjectExtensionGroup() {
        this.networkLinkControlObjectExtensionGroup = null;
    }

}

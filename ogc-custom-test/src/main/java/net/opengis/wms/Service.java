//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="WMS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opengis.net/wms}Title"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Abstract" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}KeywordList" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}OnlineResource"/>
 *         &lt;element ref="{http://www.opengis.net/wms}ContactInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Fees" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}AccessConstraints" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}LayerLimit" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}MaxWidth" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}MaxHeight" minOccurs="0"/>
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
    "keywordList",
    "onlineResource",
    "contactInformation",
    "fees",
    "accessConstraints",
    "layerLimit",
    "maxWidth",
    "maxHeight"
})
@XmlRootElement(name = "Service")
public class Service {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Abstract")
    protected String _abstract;
    @XmlElement(name = "KeywordList")
    protected KeywordList keywordList;
    @XmlElement(name = "OnlineResource", required = true)
    protected OnlineResource onlineResource;
    @XmlElement(name = "ContactInformation")
    protected ContactInformation contactInformation;
    @XmlElement(name = "Fees")
    protected String fees;
    @XmlElement(name = "AccessConstraints")
    protected String accessConstraints;
    @XmlElement(name = "LayerLimit")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger layerLimit;
    @XmlElement(name = "MaxWidth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxWidth;
    @XmlElement(name = "MaxHeight")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxHeight;

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
     * Obtient la valeur de la propriété keywordList.
     * 
     * @return
     *     possible object is
     *     {@link KeywordList }
     *     
     */
    public KeywordList getKeywordList() {
        return keywordList;
    }

    /**
     * Définit la valeur de la propriété keywordList.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordList }
     *     
     */
    public void setKeywordList(KeywordList value) {
        this.keywordList = value;
    }

    public boolean isSetKeywordList() {
        return (this.keywordList!= null);
    }

    /**
     * Obtient la valeur de la propriété onlineResource.
     * 
     * @return
     *     possible object is
     *     {@link OnlineResource }
     *     
     */
    public OnlineResource getOnlineResource() {
        return onlineResource;
    }

    /**
     * Définit la valeur de la propriété onlineResource.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineResource }
     *     
     */
    public void setOnlineResource(OnlineResource value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

    /**
     * Obtient la valeur de la propriété contactInformation.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Définit la valeur de la propriété contactInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactInformation(ContactInformation value) {
        this.contactInformation = value;
    }

    public boolean isSetContactInformation() {
        return (this.contactInformation!= null);
    }

    /**
     * Obtient la valeur de la propriété fees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Définit la valeur de la propriété fees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFees(String value) {
        this.fees = value;
    }

    public boolean isSetFees() {
        return (this.fees!= null);
    }

    /**
     * Obtient la valeur de la propriété accessConstraints.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessConstraints() {
        return accessConstraints;
    }

    /**
     * Définit la valeur de la propriété accessConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessConstraints(String value) {
        this.accessConstraints = value;
    }

    public boolean isSetAccessConstraints() {
        return (this.accessConstraints!= null);
    }

    /**
     * Obtient la valeur de la propriété layerLimit.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLayerLimit() {
        return layerLimit;
    }

    /**
     * Définit la valeur de la propriété layerLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLayerLimit(BigInteger value) {
        this.layerLimit = value;
    }

    public boolean isSetLayerLimit() {
        return (this.layerLimit!= null);
    }

    /**
     * Obtient la valeur de la propriété maxWidth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxWidth() {
        return maxWidth;
    }

    /**
     * Définit la valeur de la propriété maxWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxWidth(BigInteger value) {
        this.maxWidth = value;
    }

    public boolean isSetMaxWidth() {
        return (this.maxWidth!= null);
    }

    /**
     * Obtient la valeur de la propriété maxHeight.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxHeight() {
        return maxHeight;
    }

    /**
     * Définit la valeur de la propriété maxHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxHeight(BigInteger value) {
        this.maxHeight = value;
    }

    public boolean isSetMaxHeight() {
        return (this.maxHeight!= null);
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.ows._2.BoundingBoxType;
import net.opengis.ows._2.KeywordsType;
import net.opengis.ows._2.LanguageStringType;
import net.opengis.ows._2.ServiceProvider;
import net.opengis.ows._2.WGS84BoundingBoxType;


/**
 * <p>Classe Java pour GeneralType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Window" type="{http://www.opengis.net/ows-context}WindowType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}BoundingBox"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}MinScaleDenominator" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}MaxScaleDenominator" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Title" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Abstract" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Keywords" minOccurs="0"/>
 *         &lt;element name="LogoURL" type="{http://www.opengis.net/ows-context}URLType" minOccurs="0"/>
 *         &lt;element name="DescriptionURL" type="{http://www.opengis.net/ows-context}URLType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}ServiceProvider" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.opengis.net/ows-context}ExtensionType" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://www.opengis.net/ows-context}ExtensionType" minOccurs="0"/>
 *         &lt;element name="SearchURL" type="{http://www.opengis.net/ows-context}URLType" minOccurs="0"/>
 *         &lt;element name="totalResults" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="itemsPerPage" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralType", propOrder = {
    "window",
    "boundingBox",
    "minScaleDenominator",
    "maxScaleDenominator",
    "title",
    "_abstract",
    "keywords",
    "logoURL",
    "descriptionURL",
    "serviceProvider",
    "extension",
    "query",
    "searchURL",
    "totalResults",
    "startIndex",
    "itemsPerPage"
})
public class GeneralType {

    @XmlElement(name = "Window")
    protected WindowType window;
    @XmlElementRef(name = "BoundingBox", namespace = "http://www.opengis.net/ows/2.0", type = JAXBElement.class)
    protected JAXBElement<? extends BoundingBoxType> boundingBox;
    @XmlElement(name = "MinScaleDenominator", namespace = "http://www.opengis.net/se/2.0/core")
    protected Double minScaleDenominator;
    @XmlElement(name = "MaxScaleDenominator", namespace = "http://www.opengis.net/se/2.0/core")
    protected Double maxScaleDenominator;
    @XmlElement(name = "Title", namespace = "http://www.opengis.net/ows/2.0")
    protected LanguageStringType title;
    @XmlElement(name = "Abstract", namespace = "http://www.opengis.net/ows/2.0")
    protected LanguageStringType _abstract;
    @XmlElement(name = "Keywords", namespace = "http://www.opengis.net/ows/2.0")
    protected KeywordsType keywords;
    @XmlElement(name = "LogoURL")
    protected URLType logoURL;
    @XmlElement(name = "DescriptionURL")
    protected URLType descriptionURL;
    @XmlElement(name = "ServiceProvider", namespace = "http://www.opengis.net/ows/2.0")
    protected ServiceProvider serviceProvider;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;
    @XmlElement(name = "Query")
    protected ExtensionType query;
    @XmlElement(name = "SearchURL")
    protected URLType searchURL;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalResults;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger startIndex;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger itemsPerPage;

    /**
     * Obtient la valeur de la propriété window.
     * 
     * @return
     *     possible object is
     *     {@link WindowType }
     *     
     */
    public WindowType getWindow() {
        return window;
    }

    /**
     * Définit la valeur de la propriété window.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowType }
     *     
     */
    public void setWindow(WindowType value) {
        this.window = value;
    }

    public boolean isSetWindow() {
        return (this.window!= null);
    }

    /**
     * Obtient la valeur de la propriété boundingBox.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WGS84BoundingBoxType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoundingBoxType }{@code >}
     *     
     */
    public JAXBElement<? extends BoundingBoxType> getBoundingBox() {
        return boundingBox;
    }

    /**
     * Définit la valeur de la propriété boundingBox.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WGS84BoundingBoxType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoundingBoxType }{@code >}
     *     
     */
    public void setBoundingBox(JAXBElement<? extends BoundingBoxType> value) {
        this.boundingBox = value;
    }

    public boolean isSetBoundingBox() {
        return (this.boundingBox!= null);
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
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link LanguageStringType }
     *     
     */
    public LanguageStringType getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageStringType }
     *     
     */
    public void setTitle(LanguageStringType value) {
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
     *     {@link LanguageStringType }
     *     
     */
    public LanguageStringType getAbstract() {
        return _abstract;
    }

    /**
     * Définit la valeur de la propriété abstract.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageStringType }
     *     
     */
    public void setAbstract(LanguageStringType value) {
        this._abstract = value;
    }

    public boolean isSetAbstract() {
        return (this._abstract!= null);
    }

    /**
     * Obtient la valeur de la propriété keywords.
     * 
     * @return
     *     possible object is
     *     {@link KeywordsType }
     *     
     */
    public KeywordsType getKeywords() {
        return keywords;
    }

    /**
     * Définit la valeur de la propriété keywords.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordsType }
     *     
     */
    public void setKeywords(KeywordsType value) {
        this.keywords = value;
    }

    public boolean isSetKeywords() {
        return (this.keywords!= null);
    }

    /**
     * Obtient la valeur de la propriété logoURL.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getLogoURL() {
        return logoURL;
    }

    /**
     * Définit la valeur de la propriété logoURL.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setLogoURL(URLType value) {
        this.logoURL = value;
    }

    public boolean isSetLogoURL() {
        return (this.logoURL!= null);
    }

    /**
     * Obtient la valeur de la propriété descriptionURL.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getDescriptionURL() {
        return descriptionURL;
    }

    /**
     * Définit la valeur de la propriété descriptionURL.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setDescriptionURL(URLType value) {
        this.descriptionURL = value;
    }

    public boolean isSetDescriptionURL() {
        return (this.descriptionURL!= null);
    }

    /**
     * Obtient la valeur de la propriété serviceProvider.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProvider }
     *     
     */
    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Définit la valeur de la propriété serviceProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProvider }
     *     
     */
    public void setServiceProvider(ServiceProvider value) {
        this.serviceProvider = value;
    }

    public boolean isSetServiceProvider() {
        return (this.serviceProvider!= null);
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
     * Obtient la valeur de la propriété query.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getQuery() {
        return query;
    }

    /**
     * Définit la valeur de la propriété query.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setQuery(ExtensionType value) {
        this.query = value;
    }

    public boolean isSetQuery() {
        return (this.query!= null);
    }

    /**
     * Obtient la valeur de la propriété searchURL.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getSearchURL() {
        return searchURL;
    }

    /**
     * Définit la valeur de la propriété searchURL.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setSearchURL(URLType value) {
        this.searchURL = value;
    }

    public boolean isSetSearchURL() {
        return (this.searchURL!= null);
    }

    /**
     * Obtient la valeur de la propriété totalResults.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalResults() {
        return totalResults;
    }

    /**
     * Définit la valeur de la propriété totalResults.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalResults(BigInteger value) {
        this.totalResults = value;
    }

    public boolean isSetTotalResults() {
        return (this.totalResults!= null);
    }

    /**
     * Obtient la valeur de la propriété startIndex.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartIndex() {
        return startIndex;
    }

    /**
     * Définit la valeur de la propriété startIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartIndex(BigInteger value) {
        this.startIndex = value;
    }

    public boolean isSetStartIndex() {
        return (this.startIndex!= null);
    }

    /**
     * Obtient la valeur de la propriété itemsPerPage.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Définit la valeur de la propriété itemsPerPage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemsPerPage(BigInteger value) {
        this.itemsPerPage = value;
    }

    public boolean isSetItemsPerPage() {
        return (this.itemsPerPage!= null);
    }

}

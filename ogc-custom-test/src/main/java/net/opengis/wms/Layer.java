//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.opengis.net/wms}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Title"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Abstract" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}KeywordList" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}CRS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}EX_GeographicBoundingBox" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}BoundingBox" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Dimension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Attribution" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}AuthorityURL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}MetadataURL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}DataURL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}FeatureListURL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Style" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}MinScaleDenominator" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}MaxScaleDenominator" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Layer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="queryable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="cascaded" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="opaque" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="noSubsets" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="fixedWidth" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="fixedHeight" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
    "crs",
    "exGeographicBoundingBox",
    "boundingBox",
    "dimension",
    "attribution",
    "authorityURL",
    "identifier",
    "metadataURL",
    "dataURL",
    "featureListURL",
    "style",
    "minScaleDenominator",
    "maxScaleDenominator",
    "layer"
})
@XmlRootElement(name = "Layer")
public class Layer {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Abstract")
    protected String _abstract;
    @XmlElement(name = "KeywordList")
    protected KeywordList keywordList;
    @XmlElement(name = "CRS")
    protected List<String> crs;
    @XmlElement(name = "EX_GeographicBoundingBox")
    protected EXGeographicBoundingBox exGeographicBoundingBox;
    @XmlElement(name = "BoundingBox")
    protected List<BoundingBox> boundingBox;
    @XmlElement(name = "Dimension")
    protected List<Dimension> dimension;
    @XmlElement(name = "Attribution")
    protected Attribution attribution;
    @XmlElement(name = "AuthorityURL")
    protected List<AuthorityURL> authorityURL;
    @XmlElement(name = "Identifier")
    protected List<Identifier> identifier;
    @XmlElement(name = "MetadataURL")
    protected List<MetadataURL> metadataURL;
    @XmlElement(name = "DataURL")
    protected List<DataURL> dataURL;
    @XmlElement(name = "FeatureListURL")
    protected List<FeatureListURL> featureListURL;
    @XmlElement(name = "Style")
    protected List<Style> style;
    @XmlElement(name = "MinScaleDenominator")
    protected Double minScaleDenominator;
    @XmlElement(name = "MaxScaleDenominator")
    protected Double maxScaleDenominator;
    @XmlElement(name = "Layer")
    protected List<Layer> layer;
    @XmlAttribute(name = "queryable")
    protected Boolean queryable;
    @XmlAttribute(name = "cascaded")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cascaded;
    @XmlAttribute(name = "opaque")
    protected Boolean opaque;
    @XmlAttribute(name = "noSubsets")
    protected Boolean noSubsets;
    @XmlAttribute(name = "fixedWidth")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fixedWidth;
    @XmlAttribute(name = "fixedHeight")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fixedHeight;

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
     * Gets the value of the crs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCRS() {
        if (crs == null) {
            crs = new ArrayList<String>();
        }
        return this.crs;
    }

    public boolean isSetCRS() {
        return ((this.crs!= null)&&(!this.crs.isEmpty()));
    }

    public void unsetCRS() {
        this.crs = null;
    }

    /**
     * Obtient la valeur de la propriété exGeographicBoundingBox.
     * 
     * @return
     *     possible object is
     *     {@link EXGeographicBoundingBox }
     *     
     */
    public EXGeographicBoundingBox getEXGeographicBoundingBox() {
        return exGeographicBoundingBox;
    }

    /**
     * Définit la valeur de la propriété exGeographicBoundingBox.
     * 
     * @param value
     *     allowed object is
     *     {@link EXGeographicBoundingBox }
     *     
     */
    public void setEXGeographicBoundingBox(EXGeographicBoundingBox value) {
        this.exGeographicBoundingBox = value;
    }

    public boolean isSetEXGeographicBoundingBox() {
        return (this.exGeographicBoundingBox!= null);
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundingBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundingBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoundingBox }
     * 
     * 
     */
    public List<BoundingBox> getBoundingBox() {
        if (boundingBox == null) {
            boundingBox = new ArrayList<BoundingBox>();
        }
        return this.boundingBox;
    }

    public boolean isSetBoundingBox() {
        return ((this.boundingBox!= null)&&(!this.boundingBox.isEmpty()));
    }

    public void unsetBoundingBox() {
        this.boundingBox = null;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dimension }
     * 
     * 
     */
    public List<Dimension> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<Dimension>();
        }
        return this.dimension;
    }

    public boolean isSetDimension() {
        return ((this.dimension!= null)&&(!this.dimension.isEmpty()));
    }

    public void unsetDimension() {
        this.dimension = null;
    }

    /**
     * Obtient la valeur de la propriété attribution.
     * 
     * @return
     *     possible object is
     *     {@link Attribution }
     *     
     */
    public Attribution getAttribution() {
        return attribution;
    }

    /**
     * Définit la valeur de la propriété attribution.
     * 
     * @param value
     *     allowed object is
     *     {@link Attribution }
     *     
     */
    public void setAttribution(Attribution value) {
        this.attribution = value;
    }

    public boolean isSetAttribution() {
        return (this.attribution!= null);
    }

    /**
     * Gets the value of the authorityURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorityURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorityURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityURL }
     * 
     * 
     */
    public List<AuthorityURL> getAuthorityURL() {
        if (authorityURL == null) {
            authorityURL = new ArrayList<AuthorityURL>();
        }
        return this.authorityURL;
    }

    public boolean isSetAuthorityURL() {
        return ((this.authorityURL!= null)&&(!this.authorityURL.isEmpty()));
    }

    public void unsetAuthorityURL() {
        this.authorityURL = null;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    public boolean isSetIdentifier() {
        return ((this.identifier!= null)&&(!this.identifier.isEmpty()));
    }

    public void unsetIdentifier() {
        this.identifier = null;
    }

    /**
     * Gets the value of the metadataURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataURL }
     * 
     * 
     */
    public List<MetadataURL> getMetadataURL() {
        if (metadataURL == null) {
            metadataURL = new ArrayList<MetadataURL>();
        }
        return this.metadataURL;
    }

    public boolean isSetMetadataURL() {
        return ((this.metadataURL!= null)&&(!this.metadataURL.isEmpty()));
    }

    public void unsetMetadataURL() {
        this.metadataURL = null;
    }

    /**
     * Gets the value of the dataURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataURL }
     * 
     * 
     */
    public List<DataURL> getDataURL() {
        if (dataURL == null) {
            dataURL = new ArrayList<DataURL>();
        }
        return this.dataURL;
    }

    public boolean isSetDataURL() {
        return ((this.dataURL!= null)&&(!this.dataURL.isEmpty()));
    }

    public void unsetDataURL() {
        this.dataURL = null;
    }

    /**
     * Gets the value of the featureListURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureListURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureListURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureListURL }
     * 
     * 
     */
    public List<FeatureListURL> getFeatureListURL() {
        if (featureListURL == null) {
            featureListURL = new ArrayList<FeatureListURL>();
        }
        return this.featureListURL;
    }

    public boolean isSetFeatureListURL() {
        return ((this.featureListURL!= null)&&(!this.featureListURL.isEmpty()));
    }

    public void unsetFeatureListURL() {
        this.featureListURL = null;
    }

    /**
     * Gets the value of the style property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the style property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Style }
     * 
     * 
     */
    public List<Style> getStyle() {
        if (style == null) {
            style = new ArrayList<Style>();
        }
        return this.style;
    }

    public boolean isSetStyle() {
        return ((this.style!= null)&&(!this.style.isEmpty()));
    }

    public void unsetStyle() {
        this.style = null;
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
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Layer }
     * 
     * 
     */
    public List<Layer> getLayer() {
        if (layer == null) {
            layer = new ArrayList<Layer>();
        }
        return this.layer;
    }

    public boolean isSetLayer() {
        return ((this.layer!= null)&&(!this.layer.isEmpty()));
    }

    public void unsetLayer() {
        this.layer = null;
    }

    /**
     * Obtient la valeur de la propriété queryable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQueryable() {
        if (queryable == null) {
            return false;
        } else {
            return queryable;
        }
    }

    /**
     * Définit la valeur de la propriété queryable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryable(boolean value) {
        this.queryable = value;
    }

    public boolean isSetQueryable() {
        return (this.queryable!= null);
    }

    public void unsetQueryable() {
        this.queryable = null;
    }

    /**
     * Obtient la valeur de la propriété cascaded.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCascaded() {
        return cascaded;
    }

    /**
     * Définit la valeur de la propriété cascaded.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCascaded(BigInteger value) {
        this.cascaded = value;
    }

    public boolean isSetCascaded() {
        return (this.cascaded!= null);
    }

    /**
     * Obtient la valeur de la propriété opaque.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOpaque() {
        if (opaque == null) {
            return false;
        } else {
            return opaque;
        }
    }

    /**
     * Définit la valeur de la propriété opaque.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpaque(boolean value) {
        this.opaque = value;
    }

    public boolean isSetOpaque() {
        return (this.opaque!= null);
    }

    public void unsetOpaque() {
        this.opaque = null;
    }

    /**
     * Obtient la valeur de la propriété noSubsets.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoSubsets() {
        if (noSubsets == null) {
            return false;
        } else {
            return noSubsets;
        }
    }

    /**
     * Définit la valeur de la propriété noSubsets.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoSubsets(boolean value) {
        this.noSubsets = value;
    }

    public boolean isSetNoSubsets() {
        return (this.noSubsets!= null);
    }

    public void unsetNoSubsets() {
        this.noSubsets = null;
    }

    /**
     * Obtient la valeur de la propriété fixedWidth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFixedWidth() {
        return fixedWidth;
    }

    /**
     * Définit la valeur de la propriété fixedWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFixedWidth(BigInteger value) {
        this.fixedWidth = value;
    }

    public boolean isSetFixedWidth() {
        return (this.fixedWidth!= null);
    }

    /**
     * Obtient la valeur de la propriété fixedHeight.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFixedHeight() {
        return fixedHeight;
    }

    /**
     * Définit la valeur de la propriété fixedHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFixedHeight(BigInteger value) {
        this.fixedHeight = value;
    }

    public boolean isSetFixedHeight() {
        return (this.fixedHeight!= null);
    }

}

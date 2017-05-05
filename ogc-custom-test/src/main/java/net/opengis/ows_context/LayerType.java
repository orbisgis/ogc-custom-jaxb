//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.FilterType;
import net.opengis.kml._2_2_0.DocumentType;


/**
 * <p>Classe Java pour LayerType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LayerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows-context}AbstractResourceType">
 *       &lt;sequence>
 *         &lt;element name="Server" type="{http://www.opengis.net/ows-context}ServerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DimensionList" type="{http://www.opengis.net/ows-context}DimensionListType" minOccurs="0"/>
 *         &lt;element name="ResponseCRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParameterList" type="{http://www.opengis.net/ows-context}ParameterListType" minOccurs="0"/>
 *         &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxFeatures" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/fes/2.1}Filter" minOccurs="0"/>
 *         &lt;element name="InlineGeometry" type="{http://www.opengis.net/ows-context}InlineFeatureCollectionType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}Document" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VendorExtension" type="{http://www.opengis.net/ows-context}ExtensionType" minOccurs="0"/>
 *         &lt;element name="StyleList" type="{http://www.opengis.net/ows-context}StyleListType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows-context}Layer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="queryable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayerType", propOrder = {
    "server",
    "dimensionList",
    "responseCRS",
    "parameterList",
    "depth",
    "resx",
    "resy",
    "resz",
    "maxFeatures",
    "filter",
    "inlineGeometry",
    "document",
    "vendorExtension",
    "styleList",
    "layer"
})
public class LayerType
    extends AbstractResourceType
{

    @XmlElement(name = "Server")
    protected List<ServerType> server;
    @XmlElement(name = "DimensionList")
    protected DimensionListType dimensionList;
    @XmlElement(name = "ResponseCRS")
    protected String responseCRS;
    @XmlElement(name = "ParameterList")
    protected ParameterListType parameterList;
    @XmlElement(name = "Depth")
    protected String depth;
    @XmlElement(name = "Resx")
    protected String resx;
    @XmlElement(name = "Resy")
    protected String resy;
    @XmlElement(name = "Resz")
    protected String resz;
    @XmlElement(name = "MaxFeatures")
    protected BigInteger maxFeatures;
    @XmlElement(name = "Filter", namespace = "http://www.opengis.net/fes/2.1")
    protected FilterType filter;
    @XmlElement(name = "InlineGeometry")
    protected InlineFeatureCollectionType inlineGeometry;
    @XmlElement(name = "Document", namespace = "http://www.opengis.net/kml/2.2")
    protected List<DocumentType> document;
    @XmlElement(name = "VendorExtension")
    protected ExtensionType vendorExtension;
    @XmlElement(name = "StyleList")
    protected StyleListType styleList;
    @XmlElement(name = "Layer")
    protected List<LayerType> layer;
    @XmlAttribute(name = "queryable")
    protected Boolean queryable;

    /**
     * Gets the value of the server property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the server property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerType }
     * 
     * 
     */
    public List<ServerType> getServer() {
        if (server == null) {
            server = new ArrayList<ServerType>();
        }
        return this.server;
    }

    public boolean isSetServer() {
        return ((this.server!= null)&&(!this.server.isEmpty()));
    }

    public void unsetServer() {
        this.server = null;
    }

    /**
     * Obtient la valeur de la propriété dimensionList.
     * 
     * @return
     *     possible object is
     *     {@link DimensionListType }
     *     
     */
    public DimensionListType getDimensionList() {
        return dimensionList;
    }

    /**
     * Définit la valeur de la propriété dimensionList.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionListType }
     *     
     */
    public void setDimensionList(DimensionListType value) {
        this.dimensionList = value;
    }

    public boolean isSetDimensionList() {
        return (this.dimensionList!= null);
    }

    /**
     * Obtient la valeur de la propriété responseCRS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCRS() {
        return responseCRS;
    }

    /**
     * Définit la valeur de la propriété responseCRS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCRS(String value) {
        this.responseCRS = value;
    }

    public boolean isSetResponseCRS() {
        return (this.responseCRS!= null);
    }

    /**
     * Obtient la valeur de la propriété parameterList.
     * 
     * @return
     *     possible object is
     *     {@link ParameterListType }
     *     
     */
    public ParameterListType getParameterList() {
        return parameterList;
    }

    /**
     * Définit la valeur de la propriété parameterList.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterListType }
     *     
     */
    public void setParameterList(ParameterListType value) {
        this.parameterList = value;
    }

    public boolean isSetParameterList() {
        return (this.parameterList!= null);
    }

    /**
     * Obtient la valeur de la propriété depth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepth() {
        return depth;
    }

    /**
     * Définit la valeur de la propriété depth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepth(String value) {
        this.depth = value;
    }

    public boolean isSetDepth() {
        return (this.depth!= null);
    }

    /**
     * Obtient la valeur de la propriété resx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResx() {
        return resx;
    }

    /**
     * Définit la valeur de la propriété resx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResx(String value) {
        this.resx = value;
    }

    public boolean isSetResx() {
        return (this.resx!= null);
    }

    /**
     * Obtient la valeur de la propriété resy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResy() {
        return resy;
    }

    /**
     * Définit la valeur de la propriété resy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResy(String value) {
        this.resy = value;
    }

    public boolean isSetResy() {
        return (this.resy!= null);
    }

    /**
     * Obtient la valeur de la propriété resz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResz() {
        return resz;
    }

    /**
     * Définit la valeur de la propriété resz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResz(String value) {
        this.resz = value;
    }

    public boolean isSetResz() {
        return (this.resz!= null);
    }

    /**
     * Obtient la valeur de la propriété maxFeatures.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFeatures() {
        return maxFeatures;
    }

    /**
     * Définit la valeur de la propriété maxFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFeatures(BigInteger value) {
        this.maxFeatures = value;
    }

    public boolean isSetMaxFeatures() {
        return (this.maxFeatures!= null);
    }

    /**
     * Obtient la valeur de la propriété filter.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilter() {
        return filter;
    }

    /**
     * Définit la valeur de la propriété filter.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilter(FilterType value) {
        this.filter = value;
    }

    public boolean isSetFilter() {
        return (this.filter!= null);
    }

    /**
     * Obtient la valeur de la propriété inlineGeometry.
     * 
     * @return
     *     possible object is
     *     {@link InlineFeatureCollectionType }
     *     
     */
    public InlineFeatureCollectionType getInlineGeometry() {
        return inlineGeometry;
    }

    /**
     * Définit la valeur de la propriété inlineGeometry.
     * 
     * @param value
     *     allowed object is
     *     {@link InlineFeatureCollectionType }
     *     
     */
    public void setInlineGeometry(InlineFeatureCollectionType value) {
        this.inlineGeometry = value;
    }

    public boolean isSetInlineGeometry() {
        return (this.inlineGeometry!= null);
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
    }

    public boolean isSetDocument() {
        return ((this.document!= null)&&(!this.document.isEmpty()));
    }

    public void unsetDocument() {
        this.document = null;
    }

    /**
     * Obtient la valeur de la propriété vendorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVendorExtension() {
        return vendorExtension;
    }

    /**
     * Définit la valeur de la propriété vendorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVendorExtension(ExtensionType value) {
        this.vendorExtension = value;
    }

    public boolean isSetVendorExtension() {
        return (this.vendorExtension!= null);
    }

    /**
     * Obtient la valeur de la propriété styleList.
     * 
     * @return
     *     possible object is
     *     {@link StyleListType }
     *     
     */
    public StyleListType getStyleList() {
        return styleList;
    }

    /**
     * Définit la valeur de la propriété styleList.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleListType }
     *     
     */
    public void setStyleList(StyleListType value) {
        this.styleList = value;
    }

    public boolean isSetStyleList() {
        return (this.styleList!= null);
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
     * {@link LayerType }
     * 
     * 
     */
    public List<LayerType> getLayer() {
        if (layer == null) {
            layer = new ArrayList<LayerType>();
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

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.FilterType;
import net.opengis.ows._2.DescriptionType;
import net.opengis.se._2_0.raster.RasterSymbolizerType;


/**
 * <p>Classe Java pour RuleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Description" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/fes/2.1}Filter"/>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/core}ElseFilter"/>
 *           &lt;element name="WhereClause" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}MinScaleDenominator" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}MaxScaleDenominator" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Symbolizer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleType", propOrder = {
    "name",
    "description",
    "filter",
    "elseFilter",
    "whereClause",
    "minScaleDenominator",
    "maxScaleDenominator",
    "symbolizer"
})
public class RuleType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "Filter", namespace = "http://www.opengis.net/fes/2.1")
    protected FilterType filter;
    @XmlElement(name = "ElseFilter")
    protected ElseFilterType elseFilter;
    @XmlElement(name = "WhereClause")
    protected String whereClause;
    @XmlElement(name = "MinScaleDenominator")
    protected Double minScaleDenominator;
    @XmlElement(name = "MaxScaleDenominator")
    protected Double maxScaleDenominator;
    @XmlElementRef(name = "Symbolizer", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends SymbolizerType> symbolizer;

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
     * Obtient la valeur de la propriété elseFilter.
     * 
     * @return
     *     possible object is
     *     {@link ElseFilterType }
     *     
     */
    public ElseFilterType getElseFilter() {
        return elseFilter;
    }

    /**
     * Définit la valeur de la propriété elseFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link ElseFilterType }
     *     
     */
    public void setElseFilter(ElseFilterType value) {
        this.elseFilter = value;
    }

    public boolean isSetElseFilter() {
        return (this.elseFilter!= null);
    }

    /**
     * Obtient la valeur de la propriété whereClause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhereClause() {
        return whereClause;
    }

    /**
     * Définit la valeur de la propriété whereClause.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhereClause(String value) {
        this.whereClause = value;
    }

    public boolean isSetWhereClause() {
        return (this.whereClause!= null);
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
     * Obtient la valeur de la propriété symbolizer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AreaSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RasterSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TextSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SymbolizerReferenceType }{@code >}
     *     
     */
    public JAXBElement<? extends SymbolizerType> getSymbolizer() {
        return symbolizer;
    }

    /**
     * Définit la valeur de la propriété symbolizer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AreaSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RasterSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TextSymbolizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SymbolizerReferenceType }{@code >}
     *     
     */
    public void setSymbolizer(JAXBElement<? extends SymbolizerType> value) {
        this.symbolizer = value;
    }

    public boolean isSetSymbolizer() {
        return (this.symbolizer!= null);
    }

}

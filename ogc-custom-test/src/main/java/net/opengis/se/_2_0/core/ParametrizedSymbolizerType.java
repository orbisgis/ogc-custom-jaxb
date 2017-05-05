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
import net.opengis.se._2_0.raster.RasterSymbolizerType;


/**
 * <p>Classe Java pour ParametrizedSymbolizerType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ParametrizedSymbolizerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}FormalParameterList" minOccurs="0"/>
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
@XmlType(name = "ParametrizedSymbolizerType", propOrder = {
    "formalParameterList",
    "symbolizer"
})
public class ParametrizedSymbolizerType {

    @XmlElement(name = "FormalParameterList")
    protected FormalParameterListType formalParameterList;
    @XmlElementRef(name = "Symbolizer", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends SymbolizerType> symbolizer;

    /**
     * Obtient la valeur de la propriété formalParameterList.
     * 
     * @return
     *     possible object is
     *     {@link FormalParameterListType }
     *     
     */
    public FormalParameterListType getFormalParameterList() {
        return formalParameterList;
    }

    /**
     * Définit la valeur de la propriété formalParameterList.
     * 
     * @param value
     *     allowed object is
     *     {@link FormalParameterListType }
     *     
     */
    public void setFormalParameterList(FormalParameterListType value) {
        this.formalParameterList = value;
    }

    public boolean isSetFormalParameterList() {
        return (this.formalParameterList!= null);
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

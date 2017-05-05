//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * The function or rule which defines the map from members of the domainSet to the range.  
 *       More functions will be added to this list
 * 
 * <p>Classe Java pour CoverageFunctionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CoverageFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}MappingRule"/>
 *         &lt;element ref="{http://www.opengis.net/gml}GridFunction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageFunctionType", propOrder = {
    "mappingRule",
    "gridFunction"
})
public class CoverageFunctionType {

    @XmlElement(name = "MappingRule")
    protected StringOrRefType mappingRule;
    @XmlElementRef(name = "GridFunction", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<? extends GridFunctionType> gridFunction;

    /**
     * Obtient la valeur de la propriété mappingRule.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getMappingRule() {
        return mappingRule;
    }

    /**
     * Définit la valeur de la propriété mappingRule.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setMappingRule(StringOrRefType value) {
        this.mappingRule = value;
    }

    public boolean isSetMappingRule() {
        return (this.mappingRule!= null);
    }

    /**
     * Obtient la valeur de la propriété gridFunction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexMapType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     *     
     */
    public JAXBElement<? extends GridFunctionType> getGridFunction() {
        return gridFunction;
    }

    /**
     * Définit la valeur de la propriété gridFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexMapType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     *     
     */
    public void setGridFunction(JAXBElement<? extends GridFunctionType> value) {
        this.gridFunction = value;
    }

    public boolean isSetGridFunction() {
        return (this.gridFunction!= null);
    }

}

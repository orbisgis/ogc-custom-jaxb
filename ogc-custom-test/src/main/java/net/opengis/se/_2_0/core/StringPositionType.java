//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StringPositionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StringPositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FunctionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}LookupString"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}StringValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="searchDirection" type="{http://www.opengis.net/se/2.0/core}searchDirectionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringPositionType", propOrder = {
    "lookupString",
    "stringValue"
})
public class StringPositionType
    extends FunctionType
{

    @XmlElement(name = "LookupString", required = true)
    protected ParameterValueType lookupString;
    @XmlElement(name = "StringValue", required = true)
    protected ParameterValueType stringValue;
    @XmlAttribute(name = "searchDirection")
    protected SearchDirectionType searchDirection;

    /**
     * Obtient la valeur de la propriété lookupString.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getLookupString() {
        return lookupString;
    }

    /**
     * Définit la valeur de la propriété lookupString.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setLookupString(ParameterValueType value) {
        this.lookupString = value;
    }

    public boolean isSetLookupString() {
        return (this.lookupString!= null);
    }

    /**
     * Obtient la valeur de la propriété stringValue.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getStringValue() {
        return stringValue;
    }

    /**
     * Définit la valeur de la propriété stringValue.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setStringValue(ParameterValueType value) {
        this.stringValue = value;
    }

    public boolean isSetStringValue() {
        return (this.stringValue!= null);
    }

    /**
     * Obtient la valeur de la propriété searchDirection.
     * 
     * @return
     *     possible object is
     *     {@link SearchDirectionType }
     *     
     */
    public SearchDirectionType getSearchDirection() {
        return searchDirection;
    }

    /**
     * Définit la valeur de la propriété searchDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDirectionType }
     *     
     */
    public void setSearchDirection(SearchDirectionType value) {
        this.searchDirection = value;
    }

    public boolean isSetSearchDirection() {
        return (this.searchDirection!= null);
    }

}

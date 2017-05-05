//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wps._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.ows._2.AllowedValues;
import net.opengis.ows._2.AnyValue;
import net.opengis.ows._2.DomainMetadataType;
import net.opengis.ows._2.ValueType;
import net.opengis.ows._2.ValuesReference;


/**
 * 
 * 				A literal data domain consists of a value type and range,
 * 				and optionally a unit of measurement and a default value.
 * 			
 * 
 * <p>Classe Java pour LiteralDataDomainType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LiteralDataDomainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/ows/2.0}AllowedValues"/>
 *           &lt;element ref="{http://www.opengis.net/ows/2.0}AnyValue"/>
 *           &lt;element ref="{http://www.opengis.net/ows/2.0}ValuesReference"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}DataType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}UOM" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}DefaultValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiteralDataDomainType", propOrder = {
    "allowedValues",
    "anyValue",
    "valuesReference",
    "dataType",
    "uom",
    "defaultValue"
})
@XmlSeeAlso({
    net.opengis.wps._2_0.LiteralDataType.LiteralDataDomain.class
})
public class LiteralDataDomainType {

    @XmlElement(name = "AllowedValues", namespace = "http://www.opengis.net/ows/2.0")
    protected AllowedValues allowedValues;
    @XmlElement(name = "AnyValue", namespace = "http://www.opengis.net/ows/2.0")
    protected AnyValue anyValue;
    @XmlElement(name = "ValuesReference", namespace = "http://www.opengis.net/ows/2.0")
    protected ValuesReference valuesReference;
    @XmlElement(name = "DataType", namespace = "http://www.opengis.net/ows/2.0")
    protected DomainMetadataType dataType;
    @XmlElement(name = "UOM", namespace = "http://www.opengis.net/ows/2.0")
    protected DomainMetadataType uom;
    @XmlElement(name = "DefaultValue", namespace = "http://www.opengis.net/ows/2.0")
    protected ValueType defaultValue;

    /**
     * Obtient la valeur de la propriété allowedValues.
     * 
     * @return
     *     possible object is
     *     {@link AllowedValues }
     *     
     */
    public AllowedValues getAllowedValues() {
        return allowedValues;
    }

    /**
     * Définit la valeur de la propriété allowedValues.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedValues }
     *     
     */
    public void setAllowedValues(AllowedValues value) {
        this.allowedValues = value;
    }

    public boolean isSetAllowedValues() {
        return (this.allowedValues!= null);
    }

    /**
     * Obtient la valeur de la propriété anyValue.
     * 
     * @return
     *     possible object is
     *     {@link AnyValue }
     *     
     */
    public AnyValue getAnyValue() {
        return anyValue;
    }

    /**
     * Définit la valeur de la propriété anyValue.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyValue }
     *     
     */
    public void setAnyValue(AnyValue value) {
        this.anyValue = value;
    }

    public boolean isSetAnyValue() {
        return (this.anyValue!= null);
    }

    /**
     * Obtient la valeur de la propriété valuesReference.
     * 
     * @return
     *     possible object is
     *     {@link ValuesReference }
     *     
     */
    public ValuesReference getValuesReference() {
        return valuesReference;
    }

    /**
     * Définit la valeur de la propriété valuesReference.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesReference }
     *     
     */
    public void setValuesReference(ValuesReference value) {
        this.valuesReference = value;
    }

    public boolean isSetValuesReference() {
        return (this.valuesReference!= null);
    }

    /**
     * Obtient la valeur de la propriété dataType.
     * 
     * @return
     *     possible object is
     *     {@link DomainMetadataType }
     *     
     */
    public DomainMetadataType getDataType() {
        return dataType;
    }

    /**
     * Définit la valeur de la propriété dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainMetadataType }
     *     
     */
    public void setDataType(DomainMetadataType value) {
        this.dataType = value;
    }

    public boolean isSetDataType() {
        return (this.dataType!= null);
    }

    /**
     * Obtient la valeur de la propriété uom.
     * 
     * @return
     *     possible object is
     *     {@link DomainMetadataType }
     *     
     */
    public DomainMetadataType getUOM() {
        return uom;
    }

    /**
     * Définit la valeur de la propriété uom.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainMetadataType }
     *     
     */
    public void setUOM(DomainMetadataType value) {
        this.uom = value;
    }

    public boolean isSetUOM() {
        return (this.uom!= null);
    }

    /**
     * Obtient la valeur de la propriété defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getDefaultValue() {
        return defaultValue;
    }

    /**
     * Définit la valeur de la propriété defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setDefaultValue(ValueType value) {
        this.defaultValue = value;
    }

    public boolean isSetDefaultValue() {
        return (this.defaultValue!= null);
    }

}

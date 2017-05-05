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
 * <p>Classe Java pour FormatNumberType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FormatNumberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FunctionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}NumericValue"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Pattern"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}NegativePattern" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="decimalPoint" type="{http://www.w3.org/2001/XMLSchema}string" default="." />
 *       &lt;attribute name="groupingSeparator" type="{http://www.w3.org/2001/XMLSchema}string" default="," />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormatNumberType", propOrder = {
    "numericValue",
    "pattern",
    "negativePattern"
})
public class FormatNumberType
    extends FunctionType
{

    @XmlElement(name = "NumericValue", required = true)
    protected ParameterValueType numericValue;
    @XmlElement(name = "Pattern", required = true)
    protected String pattern;
    @XmlElement(name = "NegativePattern")
    protected String negativePattern;
    @XmlAttribute(name = "decimalPoint")
    protected String decimalPoint;
    @XmlAttribute(name = "groupingSeparator")
    protected String groupingSeparator;

    /**
     * Obtient la valeur de la propriété numericValue.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getNumericValue() {
        return numericValue;
    }

    /**
     * Définit la valeur de la propriété numericValue.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setNumericValue(ParameterValueType value) {
        this.numericValue = value;
    }

    public boolean isSetNumericValue() {
        return (this.numericValue!= null);
    }

    /**
     * Obtient la valeur de la propriété pattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Définit la valeur de la propriété pattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    public boolean isSetPattern() {
        return (this.pattern!= null);
    }

    /**
     * Obtient la valeur de la propriété negativePattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativePattern() {
        return negativePattern;
    }

    /**
     * Définit la valeur de la propriété negativePattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativePattern(String value) {
        this.negativePattern = value;
    }

    public boolean isSetNegativePattern() {
        return (this.negativePattern!= null);
    }

    /**
     * Obtient la valeur de la propriété decimalPoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalPoint() {
        if (decimalPoint == null) {
            return ".";
        } else {
            return decimalPoint;
        }
    }

    /**
     * Définit la valeur de la propriété decimalPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalPoint(String value) {
        this.decimalPoint = value;
    }

    public boolean isSetDecimalPoint() {
        return (this.decimalPoint!= null);
    }

    /**
     * Obtient la valeur de la propriété groupingSeparator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupingSeparator() {
        if (groupingSeparator == null) {
            return ",";
        } else {
            return groupingSeparator;
        }
    }

    /**
     * Définit la valeur de la propriété groupingSeparator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupingSeparator(String value) {
        this.groupingSeparator = value;
    }

    public boolean isSetGroupingSeparator() {
        return (this.groupingSeparator!= null);
    }

}

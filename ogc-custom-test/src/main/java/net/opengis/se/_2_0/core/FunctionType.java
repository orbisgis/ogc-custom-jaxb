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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour FunctionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="fallbackValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionType")
@XmlSeeAlso({
    SubstringType.class,
    TrimType.class,
    RecodeType.class,
    DimensionType.class,
    FormatDateType.class,
    InterpolateType.class,
    ChangeCaseType.class,
    CategorizeType.class,
    StringLengthType.class,
    ConcatenateType.class,
    FormatNumberType.class,
    StringPositionType.class
})
public abstract class FunctionType {

    @XmlAttribute(name = "fallbackValue")
    protected String fallbackValue;

    /**
     * Obtient la valeur de la propriété fallbackValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackValue() {
        return fallbackValue;
    }

    /**
     * Définit la valeur de la propriété fallbackValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackValue(String value) {
        this.fallbackValue = value;
    }

    public boolean isSetFallbackValue() {
        return (this.fallbackValue!= null);
    }

}

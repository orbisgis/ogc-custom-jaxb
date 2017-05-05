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
 * <p>Classe Java pour TrimType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrimType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FunctionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}StringValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stripOffPosition" type="{http://www.opengis.net/se/2.0/core}stripOffPositionType" />
 *       &lt;attribute name="stripOffChar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrimType", propOrder = {
    "stringValue"
})
public class TrimType
    extends FunctionType
{

    @XmlElement(name = "StringValue", required = true)
    protected ParameterValueType stringValue;
    @XmlAttribute(name = "stripOffPosition")
    protected StripOffPositionType stripOffPosition;
    @XmlAttribute(name = "stripOffChar")
    protected String stripOffChar;

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
     * Obtient la valeur de la propriété stripOffPosition.
     * 
     * @return
     *     possible object is
     *     {@link StripOffPositionType }
     *     
     */
    public StripOffPositionType getStripOffPosition() {
        return stripOffPosition;
    }

    /**
     * Définit la valeur de la propriété stripOffPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link StripOffPositionType }
     *     
     */
    public void setStripOffPosition(StripOffPositionType value) {
        this.stripOffPosition = value;
    }

    public boolean isSetStripOffPosition() {
        return (this.stripOffPosition!= null);
    }

    /**
     * Obtient la valeur de la propriété stripOffChar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripOffChar() {
        return stripOffChar;
    }

    /**
     * Définit la valeur de la propriété stripOffChar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripOffChar(String value) {
        this.stripOffChar = value;
    }

    public boolean isSetStripOffChar() {
        return (this.stripOffChar!= null);
    }

}

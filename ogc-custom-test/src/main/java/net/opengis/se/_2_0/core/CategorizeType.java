//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.LiteralType;


/**
 * <p>Classe Java pour CategorizeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CategorizeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FunctionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}LookupValue"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/se/2.0/core}Threshold"/>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/core}Value"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Extension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="thresholdBelongsTo" type="{http://www.opengis.net/se/2.0/core}ThresholdBelongsToType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategorizeType", propOrder = {
    "lookupValue",
    "thresholdAndValue",
    "extension"
})
public class CategorizeType
    extends FunctionType
{

    @XmlElement(name = "LookupValue", required = true)
    protected ParameterValueType lookupValue;
    @XmlElements({
        @XmlElement(name = "Threshold", type = LiteralType.class),
        @XmlElement(name = "Value", type = ParameterValueType.class)
    })
    protected List<Object> thresholdAndValue;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;
    @XmlAttribute(name = "thresholdBelongsTo")
    protected ThresholdBelongsToType thresholdBelongsTo;

    /**
     * Obtient la valeur de la propriété lookupValue.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getLookupValue() {
        return lookupValue;
    }

    /**
     * Définit la valeur de la propriété lookupValue.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setLookupValue(ParameterValueType value) {
        this.lookupValue = value;
    }

    public boolean isSetLookupValue() {
        return (this.lookupValue!= null);
    }

    /**
     * Gets the value of the thresholdAndValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thresholdAndValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThresholdAndValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiteralType }
     * {@link ParameterValueType }
     * 
     * 
     */
    public List<Object> getThresholdAndValue() {
        if (thresholdAndValue == null) {
            thresholdAndValue = new ArrayList<Object>();
        }
        return this.thresholdAndValue;
    }

    public boolean isSetThresholdAndValue() {
        return ((this.thresholdAndValue!= null)&&(!this.thresholdAndValue.isEmpty()));
    }

    public void unsetThresholdAndValue() {
        this.thresholdAndValue = null;
    }

    /**
     * Obtient la valeur de la propriété extension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Définit la valeur de la propriété extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

    public boolean isSetExtension() {
        return (this.extension!= null);
    }

    /**
     * Obtient la valeur de la propriété thresholdBelongsTo.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdBelongsToType }
     *     
     */
    public ThresholdBelongsToType getThresholdBelongsTo() {
        return thresholdBelongsTo;
    }

    /**
     * Définit la valeur de la propriété thresholdBelongsTo.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdBelongsToType }
     *     
     */
    public void setThresholdBelongsTo(ThresholdBelongsToType value) {
        this.thresholdBelongsTo = value;
    }

    public boolean isSetThresholdBelongsTo() {
        return (this.thresholdBelongsTo!= null);
    }

}

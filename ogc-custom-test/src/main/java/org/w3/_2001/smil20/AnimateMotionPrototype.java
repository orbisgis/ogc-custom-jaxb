//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package org.w3._2001.smil20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001.smil20.language.AnimateMotionType;


/**
 * <p>Classe Java pour animateMotionPrototype complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="animateMotionPrototype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animValuesAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animAddAccumAttrs"/>
 *       &lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "animateMotionPrototype")
@XmlSeeAlso({
    AnimateMotionType.class
})
public class AnimateMotionPrototype {

    @XmlAttribute(name = "origin")
    protected String origin;
    @XmlAttribute(name = "from")
    protected String from;
    @XmlAttribute(name = "by")
    protected String by;
    @XmlAttribute(name = "values")
    protected String values;
    @XmlAttribute(name = "to")
    protected String to;
    @XmlAttribute(name = "additive")
    protected String additive;
    @XmlAttribute(name = "accumulate")
    protected String accumulate;

    /**
     * Obtient la valeur de la propriété origin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Définit la valeur de la propriété origin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    public boolean isSetOrigin() {
        return (this.origin!= null);
    }

    /**
     * Obtient la valeur de la propriété from.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Définit la valeur de la propriété from.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    public boolean isSetFrom() {
        return (this.from!= null);
    }

    /**
     * Obtient la valeur de la propriété by.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBy() {
        return by;
    }

    /**
     * Définit la valeur de la propriété by.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBy(String value) {
        this.by = value;
    }

    public boolean isSetBy() {
        return (this.by!= null);
    }

    /**
     * Obtient la valeur de la propriété values.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValues() {
        return values;
    }

    /**
     * Définit la valeur de la propriété values.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValues(String value) {
        this.values = value;
    }

    public boolean isSetValues() {
        return (this.values!= null);
    }

    /**
     * Obtient la valeur de la propriété to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Définit la valeur de la propriété to.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    public boolean isSetTo() {
        return (this.to!= null);
    }

    /**
     * Obtient la valeur de la propriété additive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditive() {
        if (additive == null) {
            return "replace";
        } else {
            return additive;
        }
    }

    /**
     * Définit la valeur de la propriété additive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditive(String value) {
        this.additive = value;
    }

    public boolean isSetAdditive() {
        return (this.additive!= null);
    }

    /**
     * Obtient la valeur de la propriété accumulate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulate() {
        if (accumulate == null) {
            return "none";
        } else {
            return accumulate;
        }
    }

    /**
     * Définit la valeur de la propriété accumulate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulate(String value) {
        this.accumulate = value;
    }

    public boolean isSetAccumulate() {
        return (this.accumulate!= null);
    }

}

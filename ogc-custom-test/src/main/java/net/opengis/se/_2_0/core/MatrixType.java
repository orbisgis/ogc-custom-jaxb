//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MatrixType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MatrixType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}A" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}B" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}C" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}D" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}E" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}F" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixType", propOrder = {
    "a",
    "b",
    "c",
    "d",
    "e",
    "f"
})
public class MatrixType {

    @XmlElement(name = "A")
    protected ParameterValueType a;
    @XmlElement(name = "B")
    protected ParameterValueType b;
    @XmlElement(name = "C")
    protected ParameterValueType c;
    @XmlElement(name = "D")
    protected ParameterValueType d;
    @XmlElement(name = "E")
    protected ParameterValueType e;
    @XmlElement(name = "F")
    protected ParameterValueType f;

    /**
     * Obtient la valeur de la propriété a.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getA() {
        return a;
    }

    /**
     * Définit la valeur de la propriété a.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setA(ParameterValueType value) {
        this.a = value;
    }

    public boolean isSetA() {
        return (this.a!= null);
    }

    /**
     * Obtient la valeur de la propriété b.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getB() {
        return b;
    }

    /**
     * Définit la valeur de la propriété b.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setB(ParameterValueType value) {
        this.b = value;
    }

    public boolean isSetB() {
        return (this.b!= null);
    }

    /**
     * Obtient la valeur de la propriété c.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getC() {
        return c;
    }

    /**
     * Définit la valeur de la propriété c.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setC(ParameterValueType value) {
        this.c = value;
    }

    public boolean isSetC() {
        return (this.c!= null);
    }

    /**
     * Obtient la valeur de la propriété d.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getD() {
        return d;
    }

    /**
     * Définit la valeur de la propriété d.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setD(ParameterValueType value) {
        this.d = value;
    }

    public boolean isSetD() {
        return (this.d!= null);
    }

    /**
     * Obtient la valeur de la propriété e.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getE() {
        return e;
    }

    /**
     * Définit la valeur de la propriété e.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setE(ParameterValueType value) {
        this.e = value;
    }

    public boolean isSetE() {
        return (this.e!= null);
    }

    /**
     * Obtient la valeur de la propriété f.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getF() {
        return f;
    }

    /**
     * Définit la valeur de la propriété f.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setF(ParameterValueType value) {
        this.f = value;
    }

    public boolean isSetF() {
        return (this.f!= null);
    }

}

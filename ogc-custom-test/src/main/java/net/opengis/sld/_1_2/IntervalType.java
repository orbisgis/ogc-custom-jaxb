//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.sld._1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour IntervalType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IntervalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalType", propOrder = {
    "min",
    "max"
})
public class IntervalType {

    @XmlElement(name = "Min")
    protected double min;
    @XmlElement(name = "Max")
    protected double max;

    /**
     * Obtient la valeur de la propriété min.
     * 
     */
    public double getMin() {
        return min;
    }

    /**
     * Définit la valeur de la propriété min.
     * 
     */
    public void setMin(double value) {
        this.min = value;
    }

    public boolean isSetMin() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété max.
     * 
     */
    public double getMax() {
        return max;
    }

    /**
     * Définit la valeur de la propriété max.
     * 
     */
    public void setMax(double value) {
        this.max = value;
    }

    public boolean isSetMax() {
        return true;
    }

}

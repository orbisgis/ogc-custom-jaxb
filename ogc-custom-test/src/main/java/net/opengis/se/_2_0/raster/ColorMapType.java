//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.raster;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.core.CategorizeType;
import net.opengis.se._2_0.core.InterpolateType;


/**
 * <p>Classe Java pour ColorMapType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ColorMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Categorize"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Interpolate"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorMapType", propOrder = {
    "categorize",
    "interpolate"
})
public class ColorMapType {

    @XmlElement(name = "Categorize", namespace = "http://www.opengis.net/se/2.0/core")
    protected CategorizeType categorize;
    @XmlElement(name = "Interpolate", namespace = "http://www.opengis.net/se/2.0/core")
    protected InterpolateType interpolate;

    /**
     * Obtient la valeur de la propriété categorize.
     * 
     * @return
     *     possible object is
     *     {@link CategorizeType }
     *     
     */
    public CategorizeType getCategorize() {
        return categorize;
    }

    /**
     * Définit la valeur de la propriété categorize.
     * 
     * @param value
     *     allowed object is
     *     {@link CategorizeType }
     *     
     */
    public void setCategorize(CategorizeType value) {
        this.categorize = value;
    }

    public boolean isSetCategorize() {
        return (this.categorize!= null);
    }

    /**
     * Obtient la valeur de la propriété interpolate.
     * 
     * @return
     *     possible object is
     *     {@link InterpolateType }
     *     
     */
    public InterpolateType getInterpolate() {
        return interpolate;
    }

    /**
     * Définit la valeur de la propriété interpolate.
     * 
     * @param value
     *     allowed object is
     *     {@link InterpolateType }
     *     
     */
    public void setInterpolate(InterpolateType value) {
        this.interpolate = value;
    }

    public boolean isSetInterpolate() {
        return (this.interpolate!= null);
    }

}

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
import net.opengis.se._2_0.core.AreaSymbolizerType;
import net.opengis.se._2_0.core.LineSymbolizerType;


/**
 * <p>Classe Java pour ImageOutlineType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ImageOutlineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}LineSymbolizer"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}AreaSymbolizer"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageOutlineType", propOrder = {
    "lineSymbolizer",
    "areaSymbolizer"
})
public class ImageOutlineType {

    @XmlElement(name = "LineSymbolizer", namespace = "http://www.opengis.net/se/2.0/core")
    protected LineSymbolizerType lineSymbolizer;
    @XmlElement(name = "AreaSymbolizer", namespace = "http://www.opengis.net/se/2.0/core")
    protected AreaSymbolizerType areaSymbolizer;

    /**
     * Obtient la valeur de la propriété lineSymbolizer.
     * 
     * @return
     *     possible object is
     *     {@link LineSymbolizerType }
     *     
     */
    public LineSymbolizerType getLineSymbolizer() {
        return lineSymbolizer;
    }

    /**
     * Définit la valeur de la propriété lineSymbolizer.
     * 
     * @param value
     *     allowed object is
     *     {@link LineSymbolizerType }
     *     
     */
    public void setLineSymbolizer(LineSymbolizerType value) {
        this.lineSymbolizer = value;
    }

    public boolean isSetLineSymbolizer() {
        return (this.lineSymbolizer!= null);
    }

    /**
     * Obtient la valeur de la propriété areaSymbolizer.
     * 
     * @return
     *     possible object is
     *     {@link AreaSymbolizerType }
     *     
     */
    public AreaSymbolizerType getAreaSymbolizer() {
        return areaSymbolizer;
    }

    /**
     * Définit la valeur de la propriété areaSymbolizer.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaSymbolizerType }
     *     
     */
    public void setAreaSymbolizer(AreaSymbolizerType value) {
        this.areaSymbolizer = value;
    }

    public boolean isSetAreaSymbolizer() {
        return (this.areaSymbolizer!= null);
    }

}

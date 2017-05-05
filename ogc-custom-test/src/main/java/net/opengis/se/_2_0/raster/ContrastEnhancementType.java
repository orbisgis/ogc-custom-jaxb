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


/**
 * <p>Classe Java pour ContrastEnhancementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContrastEnhancementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/se/2.0/raster}Normalize"/>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/raster}Histogram"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}GammaValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContrastEnhancementType", propOrder = {
    "normalize",
    "histogram",
    "gammaValue"
})
public class ContrastEnhancementType {

    @XmlElement(name = "Normalize")
    protected NormalizeType normalize;
    @XmlElement(name = "Histogram")
    protected HistogramType histogram;
    @XmlElement(name = "GammaValue")
    protected Double gammaValue;

    /**
     * Obtient la valeur de la propriété normalize.
     * 
     * @return
     *     possible object is
     *     {@link NormalizeType }
     *     
     */
    public NormalizeType getNormalize() {
        return normalize;
    }

    /**
     * Définit la valeur de la propriété normalize.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalizeType }
     *     
     */
    public void setNormalize(NormalizeType value) {
        this.normalize = value;
    }

    public boolean isSetNormalize() {
        return (this.normalize!= null);
    }

    /**
     * Obtient la valeur de la propriété histogram.
     * 
     * @return
     *     possible object is
     *     {@link HistogramType }
     *     
     */
    public HistogramType getHistogram() {
        return histogram;
    }

    /**
     * Définit la valeur de la propriété histogram.
     * 
     * @param value
     *     allowed object is
     *     {@link HistogramType }
     *     
     */
    public void setHistogram(HistogramType value) {
        this.histogram = value;
    }

    public boolean isSetHistogram() {
        return (this.histogram!= null);
    }

    /**
     * Obtient la valeur de la propriété gammaValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGammaValue() {
        return gammaValue;
    }

    /**
     * Définit la valeur de la propriété gammaValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGammaValue(Double value) {
        this.gammaValue = value;
    }

    public boolean isSetGammaValue() {
        return (this.gammaValue!= null);
    }

}

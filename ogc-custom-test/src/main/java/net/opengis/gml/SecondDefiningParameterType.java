//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
 * 
 * <p>Classe Java pour SecondDefiningParameterType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SecondDefiningParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}inverseFlattening"/>
 *         &lt;element ref="{http://www.opengis.net/gml}semiMinorAxis"/>
 *         &lt;element ref="{http://www.opengis.net/gml}isSphere"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondDefiningParameterType", propOrder = {
    "inverseFlattening",
    "semiMinorAxis",
    "isSphere"
})
public class SecondDefiningParameterType {

    protected MeasureType inverseFlattening;
    protected MeasureType semiMinorAxis;
    protected String isSphere;

    /**
     * Obtient la valeur de la propriété inverseFlattening.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInverseFlattening() {
        return inverseFlattening;
    }

    /**
     * Définit la valeur de la propriété inverseFlattening.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInverseFlattening(MeasureType value) {
        this.inverseFlattening = value;
    }

    public boolean isSetInverseFlattening() {
        return (this.inverseFlattening!= null);
    }

    /**
     * Obtient la valeur de la propriété semiMinorAxis.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSemiMinorAxis() {
        return semiMinorAxis;
    }

    /**
     * Définit la valeur de la propriété semiMinorAxis.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSemiMinorAxis(MeasureType value) {
        this.semiMinorAxis = value;
    }

    public boolean isSetSemiMinorAxis() {
        return (this.semiMinorAxis!= null);
    }

    /**
     * Obtient la valeur de la propriété isSphere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSphere() {
        return isSphere;
    }

    /**
     * Définit la valeur de la propriété isSphere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSphere(String value) {
        this.isSphere = value;
    }

    public boolean isSetIsSphere() {
        return (this.isSphere!= null);
    }

}

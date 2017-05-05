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
 * Direction expressed as a vector, either using components, or using angles.
 * 
 * <p>Classe Java pour DirectionVectorType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DirectionVectorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}vector"/>
 *         &lt;sequence>
 *           &lt;element name="horizontalAngle" type="{http://www.opengis.net/gml}AngleType"/>
 *           &lt;element name="verticalAngle" type="{http://www.opengis.net/gml}AngleType"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionVectorType", propOrder = {
    "vector",
    "horizontalAngle",
    "verticalAngle"
})
public class DirectionVectorType {

    protected VectorType vector;
    protected AngleType horizontalAngle;
    protected AngleType verticalAngle;

    /**
     * Obtient la valeur de la propriété vector.
     * 
     * @return
     *     possible object is
     *     {@link VectorType }
     *     
     */
    public VectorType getVector() {
        return vector;
    }

    /**
     * Définit la valeur de la propriété vector.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorType }
     *     
     */
    public void setVector(VectorType value) {
        this.vector = value;
    }

    public boolean isSetVector() {
        return (this.vector!= null);
    }

    /**
     * Obtient la valeur de la propriété horizontalAngle.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getHorizontalAngle() {
        return horizontalAngle;
    }

    /**
     * Définit la valeur de la propriété horizontalAngle.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setHorizontalAngle(AngleType value) {
        this.horizontalAngle = value;
    }

    public boolean isSetHorizontalAngle() {
        return (this.horizontalAngle!= null);
    }

    /**
     * Obtient la valeur de la propriété verticalAngle.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getVerticalAngle() {
        return verticalAngle;
    }

    /**
     * Définit la valeur de la propriété verticalAngle.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setVerticalAngle(AngleType value) {
        this.verticalAngle = value;
    }

    public boolean isSetVerticalAngle() {
        return (this.verticalAngle!= null);
    }

}

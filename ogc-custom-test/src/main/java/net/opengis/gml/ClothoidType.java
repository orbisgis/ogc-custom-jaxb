//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A clothoid, or Cornu's spiral, is plane
 *    curve whose curvature is a fixed function of its length.
 *    In suitably chosen co-ordinates it is given by Fresnel's
 *    integrals.
 * 
 *     x(t) = 0-integral-t cos(AT*T/2)dT    
 *     
 *     y(t) = 0-integral-t sin(AT*T/2)dT
 *    
 *    This geometry is mainly used as a transition curve between
 *    curves of type straight line to circular arc or circular arc
 *    to circular arc. With this curve type it is possible to 
 *    achieve a C2-continous transition between the above mentioned
 *    curve types. One formula for the Clothoid is A*A = R*t where
 *    A is constant, R is the varying radius of curvature along the
 *    the curve and t is the length along and given in the Fresnel 
 *    integrals.
 * 
 * <p>Classe Java pour ClothoidType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ClothoidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;element name="refLocation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opengis.net/gml}AffinePlacement"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scaleFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="startParameter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="endParameter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClothoidType", propOrder = {
    "refLocation",
    "scaleFactor",
    "startParameter",
    "endParameter"
})
public class ClothoidType
    extends AbstractCurveSegmentType
{

    @XmlElement(required = true)
    protected ClothoidType.RefLocation refLocation;
    @XmlElement(required = true)
    protected BigDecimal scaleFactor;
    protected double startParameter;
    protected double endParameter;

    /**
     * Obtient la valeur de la propriété refLocation.
     * 
     * @return
     *     possible object is
     *     {@link ClothoidType.RefLocation }
     *     
     */
    public ClothoidType.RefLocation getRefLocation() {
        return refLocation;
    }

    /**
     * Définit la valeur de la propriété refLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link ClothoidType.RefLocation }
     *     
     */
    public void setRefLocation(ClothoidType.RefLocation value) {
        this.refLocation = value;
    }

    public boolean isSetRefLocation() {
        return (this.refLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété scaleFactor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaleFactor() {
        return scaleFactor;
    }

    /**
     * Définit la valeur de la propriété scaleFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaleFactor(BigDecimal value) {
        this.scaleFactor = value;
    }

    public boolean isSetScaleFactor() {
        return (this.scaleFactor!= null);
    }

    /**
     * Obtient la valeur de la propriété startParameter.
     * 
     */
    public double getStartParameter() {
        return startParameter;
    }

    /**
     * Définit la valeur de la propriété startParameter.
     * 
     */
    public void setStartParameter(double value) {
        this.startParameter = value;
    }

    public boolean isSetStartParameter() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété endParameter.
     * 
     */
    public double getEndParameter() {
        return endParameter;
    }

    /**
     * Définit la valeur de la propriété endParameter.
     * 
     */
    public void setEndParameter(double value) {
        this.endParameter = value;
    }

    public boolean isSetEndParameter() {
        return true;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opengis.net/gml}AffinePlacement"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affinePlacement"
    })
    public static class RefLocation {

        @XmlElement(name = "AffinePlacement", required = true)
        protected AffinePlacementType affinePlacement;

        /**
         * The "refLocation" is an affine mapping 
         *           that places  the curve defined by the Fresnel Integrals  
         *           into the co-ordinate reference system of this object.
         * 
         * @return
         *     possible object is
         *     {@link AffinePlacementType }
         *     
         */
        public AffinePlacementType getAffinePlacement() {
            return affinePlacement;
        }

        /**
         * Définit la valeur de la propriété affinePlacement.
         * 
         * @param value
         *     allowed object is
         *     {@link AffinePlacementType }
         *     
         */
        public void setAffinePlacement(AffinePlacementType value) {
            this.affinePlacement = value;
        }

        public boolean isSetAffinePlacement() {
            return (this.affinePlacement!= null);
        }

    }

}

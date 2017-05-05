//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A geodetic datum defines the precise location and orientation in 3-dimensional space of a defined ellipsoid (or sphere) that approximates the shape of the earth, or of a Cartesian coordinate system centered in this ellipsoid (or sphere). 
 * 
 * <p>Classe Java pour GeodeticDatumType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeodeticDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesPrimeMeridian"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesEllipsoid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", propOrder = {
    "usesPrimeMeridian",
    "usesEllipsoid"
})
public class GeodeticDatumType
    extends AbstractDatumType
{

    @XmlElement(required = true)
    protected PrimeMeridianRefType usesPrimeMeridian;
    @XmlElement(required = true)
    protected EllipsoidRefType usesEllipsoid;

    /**
     * Obtient la valeur de la propriété usesPrimeMeridian.
     * 
     * @return
     *     possible object is
     *     {@link PrimeMeridianRefType }
     *     
     */
    public PrimeMeridianRefType getUsesPrimeMeridian() {
        return usesPrimeMeridian;
    }

    /**
     * Définit la valeur de la propriété usesPrimeMeridian.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeMeridianRefType }
     *     
     */
    public void setUsesPrimeMeridian(PrimeMeridianRefType value) {
        this.usesPrimeMeridian = value;
    }

    public boolean isSetUsesPrimeMeridian() {
        return (this.usesPrimeMeridian!= null);
    }

    /**
     * Obtient la valeur de la propriété usesEllipsoid.
     * 
     * @return
     *     possible object is
     *     {@link EllipsoidRefType }
     *     
     */
    public EllipsoidRefType getUsesEllipsoid() {
        return usesEllipsoid;
    }

    /**
     * Définit la valeur de la propriété usesEllipsoid.
     * 
     * @param value
     *     allowed object is
     *     {@link EllipsoidRefType }
     *     
     */
    public void setUsesEllipsoid(EllipsoidRefType value) {
        this.usesEllipsoid = value;
    }

    public boolean isSetUsesEllipsoid() {
        return (this.usesEllipsoid!= null);
    }

}

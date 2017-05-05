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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A coordinate reference system that is defined by its coordinate conversion from another coordinate reference system (not by a datum). This abstract complexType shall not be used, extended, or restricted, in an Application Schema, to define a concrete subtype with a meaning equivalent to a concrete subtype specified in this document. 
 * 
 * <p>Classe Java pour AbstractGeneralDerivedCRSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeneralDerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}baseCRS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}definedByConversion"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralDerivedCRSType", propOrder = {
    "baseCRS",
    "definedByConversion"
})
@XmlSeeAlso({
    DerivedCRSType.class,
    ProjectedCRSType.class
})
public abstract class AbstractGeneralDerivedCRSType
    extends AbstractReferenceSystemType
{

    @XmlElement(required = true)
    protected CoordinateReferenceSystemRefType baseCRS;
    @XmlElement(required = true)
    protected GeneralConversionRefType definedByConversion;

    /**
     * Obtient la valeur de la propriété baseCRS.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateReferenceSystemRefType }
     *     
     */
    public CoordinateReferenceSystemRefType getBaseCRS() {
        return baseCRS;
    }

    /**
     * Définit la valeur de la propriété baseCRS.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateReferenceSystemRefType }
     *     
     */
    public void setBaseCRS(CoordinateReferenceSystemRefType value) {
        this.baseCRS = value;
    }

    public boolean isSetBaseCRS() {
        return (this.baseCRS!= null);
    }

    /**
     * Obtient la valeur de la propriété definedByConversion.
     * 
     * @return
     *     possible object is
     *     {@link GeneralConversionRefType }
     *     
     */
    public GeneralConversionRefType getDefinedByConversion() {
        return definedByConversion;
    }

    /**
     * Définit la valeur de la propriété definedByConversion.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralConversionRefType }
     *     
     */
    public void setDefinedByConversion(GeneralConversionRefType value) {
        this.definedByConversion = value;
    }

    public boolean isSetDefinedByConversion() {
        return (this.definedByConversion!= null);
    }

}

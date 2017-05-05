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
 * A coordinate reference system that is defined by its coordinate conversion from another coordinate reference system but is not a projected coordinate reference system. This category includes coordinate reference systems derived from a projected coordinate reference system. 
 * 
 * <p>Classe Java pour DerivedCRSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralDerivedCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}derivedCRSType"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesCS"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedCRSType", propOrder = {
    "derivedCRSType",
    "usesCS"
})
public class DerivedCRSType
    extends AbstractGeneralDerivedCRSType
{

    @XmlElement(required = true)
    protected DerivedCRSTypeType derivedCRSType;
    @XmlElement(required = true)
    protected CoordinateSystemRefType usesCS;

    /**
     * Obtient la valeur de la propriété derivedCRSType.
     * 
     * @return
     *     possible object is
     *     {@link DerivedCRSTypeType }
     *     
     */
    public DerivedCRSTypeType getDerivedCRSType() {
        return derivedCRSType;
    }

    /**
     * Définit la valeur de la propriété derivedCRSType.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedCRSTypeType }
     *     
     */
    public void setDerivedCRSType(DerivedCRSTypeType value) {
        this.derivedCRSType = value;
    }

    public boolean isSetDerivedCRSType() {
        return (this.derivedCRSType!= null);
    }

    /**
     * Obtient la valeur de la propriété usesCS.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystemRefType }
     *     
     */
    public CoordinateSystemRefType getUsesCS() {
        return usesCS;
    }

    /**
     * Définit la valeur de la propriété usesCS.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystemRefType }
     *     
     */
    public void setUsesCS(CoordinateSystemRefType value) {
        this.usesCS = value;
    }

    public boolean isSetUsesCS() {
        return (this.usesCS!= null);
    }

}

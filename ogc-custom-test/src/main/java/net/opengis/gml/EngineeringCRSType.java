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
 * A contextually local coordinate reference system; which can be divided into two broad categories:
 * - earth-fixed systems applied to engineering activities on or near the surface of the earth;
 * - CRSs on moving platforms such as road vehicles, vessels, aircraft, or spacecraft.
 * For further information, see OGC Abstract Specification Topic 2. 
 * 
 * <p>Classe Java pour EngineeringCRSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EngineeringCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesEngineeringDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineeringCRSType", propOrder = {
    "usesCS",
    "usesEngineeringDatum"
})
public class EngineeringCRSType
    extends AbstractReferenceSystemType
{

    @XmlElement(required = true)
    protected CoordinateSystemRefType usesCS;
    @XmlElement(required = true)
    protected EngineeringDatumRefType usesEngineeringDatum;

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

    /**
     * Obtient la valeur de la propriété usesEngineeringDatum.
     * 
     * @return
     *     possible object is
     *     {@link EngineeringDatumRefType }
     *     
     */
    public EngineeringDatumRefType getUsesEngineeringDatum() {
        return usesEngineeringDatum;
    }

    /**
     * Définit la valeur de la propriété usesEngineeringDatum.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineeringDatumRefType }
     *     
     */
    public void setUsesEngineeringDatum(EngineeringDatumRefType value) {
        this.usesEngineeringDatum = value;
    }

    public boolean isSetUsesEngineeringDatum() {
        return (this.usesEngineeringDatum!= null);
    }

}

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
 * A 1D coordinate reference system used for recording heights or depths. Vertical CRSs make use of the direction of gravity to define the concept of height or depth, but the relationship with gravity may not be straightforward. By implication, ellipsoidal heights (h) cannot be captured in a vertical coordinate reference system. Ellipsoidal heights cannot exist independently, but only as an inseparable part of a 3D coordinate tuple defined in a geographic 3D coordinate reference system. 
 * 
 * <p>Classe Java pour VerticalCRSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VerticalCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesVerticalCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesVerticalDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalCRSType", propOrder = {
    "usesVerticalCS",
    "usesVerticalDatum"
})
public class VerticalCRSType
    extends AbstractReferenceSystemType
{

    @XmlElement(required = true)
    protected VerticalCSRefType usesVerticalCS;
    @XmlElement(required = true)
    protected VerticalDatumRefType usesVerticalDatum;

    /**
     * Obtient la valeur de la propriété usesVerticalCS.
     * 
     * @return
     *     possible object is
     *     {@link VerticalCSRefType }
     *     
     */
    public VerticalCSRefType getUsesVerticalCS() {
        return usesVerticalCS;
    }

    /**
     * Définit la valeur de la propriété usesVerticalCS.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalCSRefType }
     *     
     */
    public void setUsesVerticalCS(VerticalCSRefType value) {
        this.usesVerticalCS = value;
    }

    public boolean isSetUsesVerticalCS() {
        return (this.usesVerticalCS!= null);
    }

    /**
     * Obtient la valeur de la propriété usesVerticalDatum.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDatumRefType }
     *     
     */
    public VerticalDatumRefType getUsesVerticalDatum() {
        return usesVerticalDatum;
    }

    /**
     * Définit la valeur de la propriété usesVerticalDatum.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDatumRefType }
     *     
     */
    public void setUsesVerticalDatum(VerticalDatumRefType value) {
        this.usesVerticalDatum = value;
    }

    public boolean isSetUsesVerticalDatum() {
        return (this.usesVerticalDatum!= null);
    }

}

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
 * A 1D coordinate reference system used for the recording of time. 
 * 
 * <p>Classe Java pour TemporalCRSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TemporalCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesTemporalCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesTemporalDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalCRSType", propOrder = {
    "usesTemporalCS",
    "usesTemporalDatum"
})
public class TemporalCRSType
    extends AbstractReferenceSystemType
{

    @XmlElement(required = true)
    protected TemporalCSRefType usesTemporalCS;
    @XmlElement(required = true)
    protected TemporalDatumRefType usesTemporalDatum;

    /**
     * Obtient la valeur de la propriété usesTemporalCS.
     * 
     * @return
     *     possible object is
     *     {@link TemporalCSRefType }
     *     
     */
    public TemporalCSRefType getUsesTemporalCS() {
        return usesTemporalCS;
    }

    /**
     * Définit la valeur de la propriété usesTemporalCS.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalCSRefType }
     *     
     */
    public void setUsesTemporalCS(TemporalCSRefType value) {
        this.usesTemporalCS = value;
    }

    public boolean isSetUsesTemporalCS() {
        return (this.usesTemporalCS!= null);
    }

    /**
     * Obtient la valeur de la propriété usesTemporalDatum.
     * 
     * @return
     *     possible object is
     *     {@link TemporalDatumRefType }
     *     
     */
    public TemporalDatumRefType getUsesTemporalDatum() {
        return usesTemporalDatum;
    }

    /**
     * Définit la valeur de la propriété usesTemporalDatum.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalDatumRefType }
     *     
     */
    public void setUsesTemporalDatum(TemporalDatumRefType value) {
        this.usesTemporalDatum = value;
    }

    public boolean isSetUsesTemporalDatum() {
        return (this.usesTemporalDatum!= null);
    }

}

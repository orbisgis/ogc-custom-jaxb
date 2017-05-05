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
 * <p>Classe Java pour GridLimitsType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GridLimitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GridEnvelope" type="{http://www.opengis.net/gml}GridEnvelopeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridLimitsType", propOrder = {
    "gridEnvelope"
})
public class GridLimitsType {

    @XmlElement(name = "GridEnvelope", required = true)
    protected GridEnvelopeType gridEnvelope;

    /**
     * Obtient la valeur de la propriété gridEnvelope.
     * 
     * @return
     *     possible object is
     *     {@link GridEnvelopeType }
     *     
     */
    public GridEnvelopeType getGridEnvelope() {
        return gridEnvelope;
    }

    /**
     * Définit la valeur de la propriété gridEnvelope.
     * 
     * @param value
     *     allowed object is
     *     {@link GridEnvelopeType }
     *     
     */
    public void setGridEnvelope(GridEnvelopeType value) {
        this.gridEnvelope = value;
    }

    public boolean isSetGridEnvelope() {
        return (this.gridEnvelope!= null);
    }

}

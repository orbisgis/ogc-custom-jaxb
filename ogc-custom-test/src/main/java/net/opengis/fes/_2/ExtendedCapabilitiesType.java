//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.fes._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Extended_CapabilitiesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Extended_CapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalOperators" type="{http://www.opengis.net/fes/2.1}AdditionalOperatorsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extended_CapabilitiesType", propOrder = {
    "additionalOperators"
})
public class ExtendedCapabilitiesType {

    @XmlElement(name = "AdditionalOperators")
    protected AdditionalOperatorsType additionalOperators;

    /**
     * Obtient la valeur de la propriété additionalOperators.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalOperatorsType }
     *     
     */
    public AdditionalOperatorsType getAdditionalOperators() {
        return additionalOperators;
    }

    /**
     * Définit la valeur de la propriété additionalOperators.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalOperatorsType }
     *     
     */
    public void setAdditionalOperators(AdditionalOperatorsType value) {
        this.additionalOperators = value;
    }

    public boolean isSetAdditionalOperators() {
        return (this.additionalOperators!= null);
    }

}

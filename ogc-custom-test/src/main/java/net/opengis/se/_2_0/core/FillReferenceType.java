//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour FillReferenceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FillReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FillType">
 *       &lt;sequence>
 *         &lt;element name="OnlineResource" type="{http://www.opengis.net/se/2.0/core}VariableOnlineResourceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FillReferenceType", propOrder = {
    "onlineResource"
})
public class FillReferenceType
    extends FillType
{

    @XmlElement(name = "OnlineResource", required = true)
    protected VariableOnlineResourceType onlineResource;

    /**
     * Obtient la valeur de la propriété onlineResource.
     * 
     * @return
     *     possible object is
     *     {@link VariableOnlineResourceType }
     *     
     */
    public VariableOnlineResourceType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Définit la valeur de la propriété onlineResource.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableOnlineResourceType }
     *     
     */
    public void setOnlineResource(VariableOnlineResourceType value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

}

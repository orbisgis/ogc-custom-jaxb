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
 * <p>Classe Java pour SymbolizerReferenceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SymbolizerReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}SymbolizerType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}OnlineResource"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}ArgumentList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymbolizerReferenceType", propOrder = {
    "onlineResource",
    "argumentList"
})
public class SymbolizerReferenceType
    extends SymbolizerType
{

    @XmlElement(name = "OnlineResource", required = true)
    protected OnlineResourceType onlineResource;
    @XmlElement(name = "ArgumentList")
    protected ArgumentListType argumentList;

    /**
     * Obtient la valeur de la propriété onlineResource.
     * 
     * @return
     *     possible object is
     *     {@link OnlineResourceType }
     *     
     */
    public OnlineResourceType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Définit la valeur de la propriété onlineResource.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineResourceType }
     *     
     */
    public void setOnlineResource(OnlineResourceType value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

    /**
     * Obtient la valeur de la propriété argumentList.
     * 
     * @return
     *     possible object is
     *     {@link ArgumentListType }
     *     
     */
    public ArgumentListType getArgumentList() {
        return argumentList;
    }

    /**
     * Définit la valeur de la propriété argumentList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArgumentListType }
     *     
     */
    public void setArgumentList(ArgumentListType value) {
        this.argumentList = value;
    }

    public boolean isSetArgumentList() {
        return (this.argumentList!= null);
    }

}

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
 * <p>Classe Java pour TopoVolumePropertyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TopoVolumePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}TopoVolume"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoVolumePropertyType", propOrder = {
    "topoVolume"
})
public class TopoVolumePropertyType {

    @XmlElement(name = "TopoVolume", required = true)
    protected TopoVolumeType topoVolume;

    /**
     * Obtient la valeur de la propriété topoVolume.
     * 
     * @return
     *     possible object is
     *     {@link TopoVolumeType }
     *     
     */
    public TopoVolumeType getTopoVolume() {
        return topoVolume;
    }

    /**
     * Définit la valeur de la propriété topoVolume.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoVolumeType }
     *     
     */
    public void setTopoVolume(TopoVolumeType value) {
        this.topoVolume = value;
    }

    public boolean isSetTopoVolume() {
        return (this.topoVolume!= null);
    }

}

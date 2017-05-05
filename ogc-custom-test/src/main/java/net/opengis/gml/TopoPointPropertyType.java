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
 * <p>Classe Java pour TopoPointPropertyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TopoPointPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}TopoPoint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoPointPropertyType", propOrder = {
    "topoPoint"
})
public class TopoPointPropertyType {

    @XmlElement(name = "TopoPoint", required = true)
    protected TopoPointType topoPoint;

    /**
     * Obtient la valeur de la propriété topoPoint.
     * 
     * @return
     *     possible object is
     *     {@link TopoPointType }
     *     
     */
    public TopoPointType getTopoPoint() {
        return topoPoint;
    }

    /**
     * Définit la valeur de la propriété topoPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoPointType }
     *     
     */
    public void setTopoPoint(TopoPointType value) {
        this.topoPoint = value;
    }

    public boolean isSetTopoPoint() {
        return (this.topoPoint!= null);
    }

}

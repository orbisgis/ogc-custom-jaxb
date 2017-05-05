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
 * <p>Classe Java pour LineLabelType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LineLabelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}LabelType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}RelativeOrientation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineLabelType", propOrder = {
    "relativeOrientation"
})
public class LineLabelType
    extends LabelType
{

    @XmlElement(name = "RelativeOrientation", required = true)
    protected RelativeOrientationType relativeOrientation;

    /**
     * Obtient la valeur de la propriété relativeOrientation.
     * 
     * @return
     *     possible object is
     *     {@link RelativeOrientationType }
     *     
     */
    public RelativeOrientationType getRelativeOrientation() {
        return relativeOrientation;
    }

    /**
     * Définit la valeur de la propriété relativeOrientation.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeOrientationType }
     *     
     */
    public void setRelativeOrientation(RelativeOrientationType value) {
        this.relativeOrientation = value;
    }

    public boolean isSetRelativeOrientation() {
        return (this.relativeOrientation!= null);
    }

}

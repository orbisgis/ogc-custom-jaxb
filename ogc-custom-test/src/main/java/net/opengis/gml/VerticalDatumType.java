//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A textual description and/or a set of parameters identifying a particular reference level surface used as a zero-height surface, including its position with respect to the Earth for any of the height types recognized by this standard. There are several types of Vertical Datums, and each may place constraints on the Coordinate Axis with which it is combined to create a Vertical CRS. 
 * 
 * <p>Classe Java pour VerticalDatumType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VerticalDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}verticalDatumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalDatumType", propOrder = {
    "verticalDatumType"
})
public class VerticalDatumType
    extends AbstractDatumType
{

    protected VerticalDatumTypeType verticalDatumType;

    /**
     * Obtient la valeur de la propriété verticalDatumType.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDatumTypeType }
     *     
     */
    public VerticalDatumTypeType getVerticalDatumType() {
        return verticalDatumType;
    }

    /**
     * Définit la valeur de la propriété verticalDatumType.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDatumTypeType }
     *     
     */
    public void setVerticalDatumType(VerticalDatumTypeType value) {
        this.verticalDatumType = value;
    }

    public boolean isSetVerticalDatumType() {
        return (this.verticalDatumType!= null);
    }

}

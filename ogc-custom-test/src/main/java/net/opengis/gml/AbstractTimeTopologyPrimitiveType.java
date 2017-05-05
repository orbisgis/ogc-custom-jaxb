//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The element "complex" carries a reference to the complex containing this primitive.
 * 
 * <p>Classe Java pour AbstractTimeTopologyPrimitiveType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractTimeTopologyPrimitiveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimePrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="complex" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeTopologyPrimitiveType", propOrder = {
    "complex"
})
@XmlSeeAlso({
    TimeEdgeType.class,
    TimeNodeType.class
})
public abstract class AbstractTimeTopologyPrimitiveType
    extends AbstractTimePrimitiveType
{

    protected ReferenceType complex;

    /**
     * Obtient la valeur de la propriété complex.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getComplex() {
        return complex;
    }

    /**
     * Définit la valeur de la propriété complex.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setComplex(ReferenceType value) {
        this.complex = value;
    }

    public boolean isSetComplex() {
        return (this.complex!= null);
    }

}

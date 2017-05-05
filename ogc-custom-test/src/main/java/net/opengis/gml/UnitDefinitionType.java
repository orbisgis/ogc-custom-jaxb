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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of a unit of measure (or uom). The definition includes a quantityType property, which indicates the phenomenon to which the units apply, and a catalogSymbol, which gives the short symbol used for this unit. This element is used when the relationship of this unit to other units or units systems is unknown.
 * 
 * <p>Classe Java pour UnitDefinitionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UnitDefinitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DefinitionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}quantityType"/>
 *         &lt;element ref="{http://www.opengis.net/gml}catalogSymbol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitDefinitionType", propOrder = {
    "quantityType",
    "catalogSymbol"
})
@XmlSeeAlso({
    BaseUnitType.class,
    ConventionalUnitType.class,
    DerivedUnitType.class
})
public class UnitDefinitionType
    extends DefinitionType
{

    @XmlElement(required = true)
    protected StringOrRefType quantityType;
    protected CodeType catalogSymbol;

    /**
     * Obtient la valeur de la propriété quantityType.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getQuantityType() {
        return quantityType;
    }

    /**
     * Définit la valeur de la propriété quantityType.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setQuantityType(StringOrRefType value) {
        this.quantityType = value;
    }

    public boolean isSetQuantityType() {
        return (this.quantityType!= null);
    }

    /**
     * Obtient la valeur de la propriété catalogSymbol.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCatalogSymbol() {
        return catalogSymbol;
    }

    /**
     * Définit la valeur de la propriété catalogSymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCatalogSymbol(CodeType value) {
        this.catalogSymbol = value;
    }

    public boolean isSetCatalogSymbol() {
        return (this.catalogSymbol!= null);
    }

}

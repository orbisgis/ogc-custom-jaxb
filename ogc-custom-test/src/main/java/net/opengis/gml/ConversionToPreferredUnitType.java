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
 * Relation of a unit to the preferred unit for this quantity type, specified by an arithmetic conversion (scaling and/or offset). A preferred unit is either a base unit or a derived unit selected for all units of one quantity type. The mandatory attribute "uom" shall reference the preferred unit that this conversion applies to. The conversion is specified by one of two alternative elements: "factor" or "formula".
 * 
 * <p>Classe Java pour ConversionToPreferredUnitType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConversionToPreferredUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}UnitOfMeasureType">
 *       &lt;choice>
 *         &lt;element name="factor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="formula" type="{http://www.opengis.net/gml}FormulaType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionToPreferredUnitType", propOrder = {
    "factor",
    "formula"
})
public class ConversionToPreferredUnitType
    extends UnitOfMeasureType
{

    protected Double factor;
    protected FormulaType formula;

    /**
     * Obtient la valeur de la propriété factor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFactor() {
        return factor;
    }

    /**
     * Définit la valeur de la propriété factor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFactor(Double value) {
        this.factor = value;
    }

    public boolean isSetFactor() {
        return (this.factor!= null);
    }

    /**
     * Obtient la valeur de la propriété formula.
     * 
     * @return
     *     possible object is
     *     {@link FormulaType }
     *     
     */
    public FormulaType getFormula() {
        return formula;
    }

    /**
     * Définit la valeur de la propriété formula.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaType }
     *     
     */
    public void setFormula(FormulaType value) {
        this.formula = value;
    }

    public boolean isSetFormula() {
        return (this.formula!= null);
    }

}

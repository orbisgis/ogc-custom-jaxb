//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour DimensionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DimensionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitSymbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="multipleValues" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="nearestValue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="current" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionType", propOrder = {
    "value"
})
public class DimensionType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "units", required = true)
    protected String units;
    @XmlAttribute(name = "unitSymbol")
    protected String unitSymbol;
    @XmlAttribute(name = "userValue")
    protected String userValue;
    @XmlAttribute(name = "default")
    protected String _default;
    @XmlAttribute(name = "multipleValues")
    protected Boolean multipleValues;
    @XmlAttribute(name = "nearestValue")
    protected Boolean nearestValue;
    @XmlAttribute(name = "current")
    protected Boolean current;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Obtient la valeur de la propriété units.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Définit la valeur de la propriété units.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    public boolean isSetUnits() {
        return (this.units!= null);
    }

    /**
     * Obtient la valeur de la propriété unitSymbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSymbol() {
        return unitSymbol;
    }

    /**
     * Définit la valeur de la propriété unitSymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSymbol(String value) {
        this.unitSymbol = value;
    }

    public boolean isSetUnitSymbol() {
        return (this.unitSymbol!= null);
    }

    /**
     * Obtient la valeur de la propriété userValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserValue() {
        return userValue;
    }

    /**
     * Définit la valeur de la propriété userValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserValue(String value) {
        this.userValue = value;
    }

    public boolean isSetUserValue() {
        return (this.userValue!= null);
    }

    /**
     * Obtient la valeur de la propriété default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Définit la valeur de la propriété default.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    public boolean isSetDefault() {
        return (this._default!= null);
    }

    /**
     * Obtient la valeur de la propriété multipleValues.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultipleValues() {
        return multipleValues;
    }

    /**
     * Définit la valeur de la propriété multipleValues.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleValues(boolean value) {
        this.multipleValues = value;
    }

    public boolean isSetMultipleValues() {
        return (this.multipleValues!= null);
    }

    public void unsetMultipleValues() {
        this.multipleValues = null;
    }

    /**
     * Obtient la valeur de la propriété nearestValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNearestValue() {
        return nearestValue;
    }

    /**
     * Définit la valeur de la propriété nearestValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNearestValue(boolean value) {
        this.nearestValue = value;
    }

    public boolean isSetNearestValue() {
        return (this.nearestValue!= null);
    }

    public void unsetNearestValue() {
        this.nearestValue = null;
    }

    /**
     * Obtient la valeur de la propriété current.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     * Définit la valeur de la propriété current.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrent(boolean value) {
        this.current = value;
    }

    public boolean isSetCurrent() {
        return (this.current!= null);
    }

    public void unsetCurrent() {
        this.current = null;
    }

}

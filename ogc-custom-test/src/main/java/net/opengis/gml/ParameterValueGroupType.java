//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A group of related parameter values. The same group can be repeated more than once in a Conversion, Transformation, or higher level parameterValueGroup, if those instances contain different values of one or more parameterValues which suitably distinquish among those groups. This concrete complexType can be used for operation methods without using an Application Schema that defines operation-method-specialized element names and contents, especially for methods with only one instance. This complexType can be used, extended, or restricted for well-known operation methods, especially for methods with many instances. 
 * 
 * <p>Classe Java pour ParameterValueGroupType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ParameterValueGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralParameterValueType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}includesValue" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{http://www.opengis.net/gml}valuesOfGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueGroupType", propOrder = {
    "includesValue",
    "valuesOfGroup"
})
public class ParameterValueGroupType
    extends AbstractGeneralParameterValueType
{

    @XmlElement(required = true)
    protected List<AbstractGeneralParameterValueType> includesValue;
    @XmlElement(required = true)
    protected OperationParameterGroupRefType valuesOfGroup;

    /**
     * Unordered set of composition associations to the parameter values and groups of values included in this group. Gets the value of the includesValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractGeneralParameterValueType }
     * 
     * 
     */
    public List<AbstractGeneralParameterValueType> getIncludesValue() {
        if (includesValue == null) {
            includesValue = new ArrayList<AbstractGeneralParameterValueType>();
        }
        return this.includesValue;
    }

    public boolean isSetIncludesValue() {
        return ((this.includesValue!= null)&&(!this.includesValue.isEmpty()));
    }

    public void unsetIncludesValue() {
        this.includesValue = null;
    }

    /**
     * Obtient la valeur de la propriété valuesOfGroup.
     * 
     * @return
     *     possible object is
     *     {@link OperationParameterGroupRefType }
     *     
     */
    public OperationParameterGroupRefType getValuesOfGroup() {
        return valuesOfGroup;
    }

    /**
     * Définit la valeur de la propriété valuesOfGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationParameterGroupRefType }
     *     
     */
    public void setValuesOfGroup(OperationParameterGroupRefType value) {
        this.valuesOfGroup = value;
    }

    public boolean isSetValuesOfGroup() {
        return (this.valuesOfGroup!= null);
    }

}

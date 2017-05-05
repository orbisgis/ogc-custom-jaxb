//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InterpolateType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InterpolateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FunctionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}LookupValue"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}InterpolationPoint" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mode" type="{http://www.opengis.net/se/2.0/core}ModeType" />
 *       &lt;attribute name="method" type="{http://www.opengis.net/se/2.0/core}MethodType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterpolateType", propOrder = {
    "lookupValue",
    "interpolationPoint"
})
public class InterpolateType
    extends FunctionType
{

    @XmlElement(name = "LookupValue", required = true)
    protected ParameterValueType lookupValue;
    @XmlElement(name = "InterpolationPoint", required = true)
    protected List<InterpolationPointType> interpolationPoint;
    @XmlAttribute(name = "mode")
    protected ModeType mode;
    @XmlAttribute(name = "method")
    protected MethodType method;

    /**
     * Obtient la valeur de la propriété lookupValue.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getLookupValue() {
        return lookupValue;
    }

    /**
     * Définit la valeur de la propriété lookupValue.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setLookupValue(ParameterValueType value) {
        this.lookupValue = value;
    }

    public boolean isSetLookupValue() {
        return (this.lookupValue!= null);
    }

    /**
     * Gets the value of the interpolationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interpolationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterpolationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterpolationPointType }
     * 
     * 
     */
    public List<InterpolationPointType> getInterpolationPoint() {
        if (interpolationPoint == null) {
            interpolationPoint = new ArrayList<InterpolationPointType>();
        }
        return this.interpolationPoint;
    }

    public boolean isSetInterpolationPoint() {
        return ((this.interpolationPoint!= null)&&(!this.interpolationPoint.isEmpty()));
    }

    public void unsetInterpolationPoint() {
        this.interpolationPoint = null;
    }

    /**
     * Obtient la valeur de la propriété mode.
     * 
     * @return
     *     possible object is
     *     {@link ModeType }
     *     
     */
    public ModeType getMode() {
        return mode;
    }

    /**
     * Définit la valeur de la propriété mode.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeType }
     *     
     */
    public void setMode(ModeType value) {
        this.mode = value;
    }

    public boolean isSetMode() {
        return (this.mode!= null);
    }

    /**
     * Obtient la valeur de la propriété method.
     * 
     * @return
     *     possible object is
     *     {@link MethodType }
     *     
     */
    public MethodType getMethod() {
        return method;
    }

    /**
     * Définit la valeur de la propriété method.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodType }
     *     
     */
    public void setMethod(MethodType value) {
        this.method = value;
    }

    public boolean isSetMethod() {
        return (this.method!= null);
    }

}

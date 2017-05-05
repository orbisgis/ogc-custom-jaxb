//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.thematic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.core.ParameterValueType;


/**
 * <p>Classe Java pour AxisScaleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AxisScaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}AxisLength"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Value"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxisScaleType", propOrder = {
    "axisLength",
    "value"
})
public class AxisScaleType {

    @XmlElement(name = "AxisLength", required = true)
    protected ParameterValueType axisLength;
    @XmlElement(name = "Value", namespace = "http://www.opengis.net/se/2.0/core", required = true)
    protected ParameterValueType value;

    /**
     * Obtient la valeur de la propriété axisLength.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getAxisLength() {
        return axisLength;
    }

    /**
     * Définit la valeur de la propriété axisLength.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setAxisLength(ParameterValueType value) {
        this.axisLength = value;
    }

    public boolean isSetAxisLength() {
        return (this.axisLength!= null);
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setValue(ParameterValueType value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour PropertyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueReference">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="action" type="{http://www.opengis.net/wfs/2.1}UpdateActionType" default="replace" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyType", propOrder = {
    "valueReference",
    "value"
})
public class PropertyType {

    @XmlElement(name = "ValueReference", required = true)
    protected PropertyType.ValueReference valueReference;
    @XmlElement(name = "Value")
    protected Object value;

    /**
     * Obtient la valeur de la propriété valueReference.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType.ValueReference }
     *     
     */
    public PropertyType.ValueReference getValueReference() {
        return valueReference;
    }

    /**
     * Définit la valeur de la propriété valueReference.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType.ValueReference }
     *     
     */
    public void setValueReference(PropertyType.ValueReference value) {
        this.valueReference = value;
    }

    public boolean isSetValueReference() {
        return (this.valueReference!= null);
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="action" type="{http://www.opengis.net/wfs/2.1}UpdateActionType" default="replace" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ValueReference {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "action")
        protected UpdateActionType action;

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
         * Obtient la valeur de la propriété action.
         * 
         * @return
         *     possible object is
         *     {@link UpdateActionType }
         *     
         */
        public UpdateActionType getAction() {
            if (action == null) {
                return UpdateActionType.REPLACE;
            } else {
                return action;
            }
        }

        /**
         * Définit la valeur de la propriété action.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateActionType }
         *     
         */
        public void setAction(UpdateActionType value) {
            this.action = value;
        }

        public boolean isSetAction() {
            return (this.action!= null);
        }

    }

}

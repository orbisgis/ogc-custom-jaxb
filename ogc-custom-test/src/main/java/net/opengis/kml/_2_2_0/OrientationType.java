//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.kml._2_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OrientationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OrientationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}heading" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}tilt" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}roll" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}OrientationSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}OrientationObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrientationType", propOrder = {
    "heading",
    "tilt",
    "roll",
    "orientationSimpleExtensionGroup",
    "orientationObjectExtensionGroup"
})
public class OrientationType
    extends AbstractObjectType
{

    @XmlElement(defaultValue = "0.0")
    protected Double heading;
    @XmlElement(defaultValue = "0.0")
    protected Double tilt;
    @XmlElement(defaultValue = "0.0")
    protected Double roll;
    @XmlElement(name = "OrientationSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> orientationSimpleExtensionGroup;
    @XmlElement(name = "OrientationObjectExtensionGroup")
    protected List<AbstractObjectType> orientationObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété heading.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeading() {
        return heading;
    }

    /**
     * Définit la valeur de la propriété heading.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeading(Double value) {
        this.heading = value;
    }

    public boolean isSetHeading() {
        return (this.heading!= null);
    }

    /**
     * Obtient la valeur de la propriété tilt.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTilt() {
        return tilt;
    }

    /**
     * Définit la valeur de la propriété tilt.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTilt(Double value) {
        this.tilt = value;
    }

    public boolean isSetTilt() {
        return (this.tilt!= null);
    }

    /**
     * Obtient la valeur de la propriété roll.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoll() {
        return roll;
    }

    /**
     * Définit la valeur de la propriété roll.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoll(Double value) {
        this.roll = value;
    }

    public boolean isSetRoll() {
        return (this.roll!= null);
    }

    /**
     * Gets the value of the orientationSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientationSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrientationSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOrientationSimpleExtensionGroup() {
        if (orientationSimpleExtensionGroup == null) {
            orientationSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.orientationSimpleExtensionGroup;
    }

    public boolean isSetOrientationSimpleExtensionGroup() {
        return ((this.orientationSimpleExtensionGroup!= null)&&(!this.orientationSimpleExtensionGroup.isEmpty()));
    }

    public void unsetOrientationSimpleExtensionGroup() {
        this.orientationSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the orientationObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientationObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrientationObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getOrientationObjectExtensionGroup() {
        if (orientationObjectExtensionGroup == null) {
            orientationObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.orientationObjectExtensionGroup;
    }

    public boolean isSetOrientationObjectExtensionGroup() {
        return ((this.orientationObjectExtensionGroup!= null)&&(!this.orientationObjectExtensionGroup.isEmpty()));
    }

    public void unsetOrientationObjectExtensionGroup() {
        this.orientationObjectExtensionGroup = null;
    }

}

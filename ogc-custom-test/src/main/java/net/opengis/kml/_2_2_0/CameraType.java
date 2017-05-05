//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.kml._2_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CameraType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CameraType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractViewType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}longitude" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}latitude" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}altitude" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}heading" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}tilt" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}roll" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}altitudeModeGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}CameraSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}CameraObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraType", propOrder = {
    "longitude",
    "latitude",
    "altitude",
    "heading",
    "tilt",
    "roll",
    "altitudeModeGroup",
    "cameraSimpleExtensionGroup",
    "cameraObjectExtensionGroup"
})
public class CameraType
    extends AbstractViewType
{

    @XmlElement(defaultValue = "0.0")
    protected Double longitude;
    @XmlElement(defaultValue = "0.0")
    protected Double latitude;
    @XmlElement(defaultValue = "0.0")
    protected Double altitude;
    @XmlElement(defaultValue = "0.0")
    protected Double heading;
    @XmlElement(defaultValue = "0.0")
    protected Double tilt;
    @XmlElement(defaultValue = "0.0")
    protected Double roll;
    @XmlElementRef(name = "altitudeModeGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class)
    protected JAXBElement<?> altitudeModeGroup;
    @XmlElement(name = "CameraSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> cameraSimpleExtensionGroup;
    @XmlElement(name = "CameraObjectExtensionGroup")
    protected List<AbstractObjectType> cameraObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété longitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Définit la valeur de la propriété longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    public boolean isSetLongitude() {
        return (this.longitude!= null);
    }

    /**
     * Obtient la valeur de la propriété latitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Définit la valeur de la propriété latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    public boolean isSetLatitude() {
        return (this.latitude!= null);
    }

    /**
     * Obtient la valeur de la propriété altitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltitude() {
        return altitude;
    }

    /**
     * Définit la valeur de la propriété altitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltitude(Double value) {
        this.altitude = value;
    }

    public boolean isSetAltitude() {
        return (this.altitude!= null);
    }

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
     * Obtient la valeur de la propriété altitudeModeGroup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AltitudeModeEnumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getAltitudeModeGroup() {
        return altitudeModeGroup;
    }

    /**
     * Définit la valeur de la propriété altitudeModeGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AltitudeModeEnumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setAltitudeModeGroup(JAXBElement<?> value) {
        this.altitudeModeGroup = value;
    }

    public boolean isSetAltitudeModeGroup() {
        return (this.altitudeModeGroup!= null);
    }

    /**
     * Gets the value of the cameraSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cameraSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCameraSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCameraSimpleExtensionGroup() {
        if (cameraSimpleExtensionGroup == null) {
            cameraSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.cameraSimpleExtensionGroup;
    }

    public boolean isSetCameraSimpleExtensionGroup() {
        return ((this.cameraSimpleExtensionGroup!= null)&&(!this.cameraSimpleExtensionGroup.isEmpty()));
    }

    public void unsetCameraSimpleExtensionGroup() {
        this.cameraSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the cameraObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cameraObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCameraObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getCameraObjectExtensionGroup() {
        if (cameraObjectExtensionGroup == null) {
            cameraObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.cameraObjectExtensionGroup;
    }

    public boolean isSetCameraObjectExtensionGroup() {
        return ((this.cameraObjectExtensionGroup!= null)&&(!this.cameraObjectExtensionGroup.isEmpty()));
    }

    public void unsetCameraObjectExtensionGroup() {
        this.cameraObjectExtensionGroup = null;
    }

}

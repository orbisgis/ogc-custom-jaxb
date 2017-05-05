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
 * <p>Classe Java pour LatLonAltBoxType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LatLonAltBoxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractLatLonBoxType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}minAltitude" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}maxAltitude" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}altitudeModeGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LatLonAltBoxSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LatLonAltBoxObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLonAltBoxType", propOrder = {
    "minAltitude",
    "maxAltitude",
    "altitudeModeGroup",
    "latLonAltBoxSimpleExtensionGroup",
    "latLonAltBoxObjectExtensionGroup"
})
public class LatLonAltBoxType
    extends AbstractLatLonBoxType
{

    @XmlElement(defaultValue = "0.0")
    protected Double minAltitude;
    @XmlElement(defaultValue = "0.0")
    protected Double maxAltitude;
    @XmlElementRef(name = "altitudeModeGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class)
    protected JAXBElement<?> altitudeModeGroup;
    @XmlElement(name = "LatLonAltBoxSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> latLonAltBoxSimpleExtensionGroup;
    @XmlElement(name = "LatLonAltBoxObjectExtensionGroup")
    protected List<AbstractObjectType> latLonAltBoxObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété minAltitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAltitude() {
        return minAltitude;
    }

    /**
     * Définit la valeur de la propriété minAltitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAltitude(Double value) {
        this.minAltitude = value;
    }

    public boolean isSetMinAltitude() {
        return (this.minAltitude!= null);
    }

    /**
     * Obtient la valeur de la propriété maxAltitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxAltitude() {
        return maxAltitude;
    }

    /**
     * Définit la valeur de la propriété maxAltitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxAltitude(Double value) {
        this.maxAltitude = value;
    }

    public boolean isSetMaxAltitude() {
        return (this.maxAltitude!= null);
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
     * Gets the value of the latLonAltBoxSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latLonAltBoxSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatLonAltBoxSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLatLonAltBoxSimpleExtensionGroup() {
        if (latLonAltBoxSimpleExtensionGroup == null) {
            latLonAltBoxSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.latLonAltBoxSimpleExtensionGroup;
    }

    public boolean isSetLatLonAltBoxSimpleExtensionGroup() {
        return ((this.latLonAltBoxSimpleExtensionGroup!= null)&&(!this.latLonAltBoxSimpleExtensionGroup.isEmpty()));
    }

    public void unsetLatLonAltBoxSimpleExtensionGroup() {
        this.latLonAltBoxSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the latLonAltBoxObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latLonAltBoxObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatLonAltBoxObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getLatLonAltBoxObjectExtensionGroup() {
        if (latLonAltBoxObjectExtensionGroup == null) {
            latLonAltBoxObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.latLonAltBoxObjectExtensionGroup;
    }

    public boolean isSetLatLonAltBoxObjectExtensionGroup() {
        return ((this.latLonAltBoxObjectExtensionGroup!= null)&&(!this.latLonAltBoxObjectExtensionGroup.isEmpty()));
    }

    public void unsetLatLonAltBoxObjectExtensionGroup() {
        this.latLonAltBoxObjectExtensionGroup = null;
    }

}

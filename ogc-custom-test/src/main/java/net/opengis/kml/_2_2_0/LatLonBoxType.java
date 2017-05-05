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
 * <p>Classe Java pour LatLonBoxType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LatLonBoxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractLatLonBoxType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}rotation" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LatLonBoxSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LatLonBoxObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLonBoxType", propOrder = {
    "rotation",
    "latLonBoxSimpleExtensionGroup",
    "latLonBoxObjectExtensionGroup"
})
public class LatLonBoxType
    extends AbstractLatLonBoxType
{

    @XmlElement(defaultValue = "0.0")
    protected Double rotation;
    @XmlElement(name = "LatLonBoxSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> latLonBoxSimpleExtensionGroup;
    @XmlElement(name = "LatLonBoxObjectExtensionGroup")
    protected List<AbstractObjectType> latLonBoxObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété rotation.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRotation() {
        return rotation;
    }

    /**
     * Définit la valeur de la propriété rotation.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRotation(Double value) {
        this.rotation = value;
    }

    public boolean isSetRotation() {
        return (this.rotation!= null);
    }

    /**
     * Gets the value of the latLonBoxSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latLonBoxSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatLonBoxSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLatLonBoxSimpleExtensionGroup() {
        if (latLonBoxSimpleExtensionGroup == null) {
            latLonBoxSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.latLonBoxSimpleExtensionGroup;
    }

    public boolean isSetLatLonBoxSimpleExtensionGroup() {
        return ((this.latLonBoxSimpleExtensionGroup!= null)&&(!this.latLonBoxSimpleExtensionGroup.isEmpty()));
    }

    public void unsetLatLonBoxSimpleExtensionGroup() {
        this.latLonBoxSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the latLonBoxObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latLonBoxObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatLonBoxObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getLatLonBoxObjectExtensionGroup() {
        if (latLonBoxObjectExtensionGroup == null) {
            latLonBoxObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.latLonBoxObjectExtensionGroup;
    }

    public boolean isSetLatLonBoxObjectExtensionGroup() {
        return ((this.latLonBoxObjectExtensionGroup!= null)&&(!this.latLonBoxObjectExtensionGroup.isEmpty()));
    }

    public void unsetLatLonBoxObjectExtensionGroup() {
        this.latLonBoxObjectExtensionGroup = null;
    }

}

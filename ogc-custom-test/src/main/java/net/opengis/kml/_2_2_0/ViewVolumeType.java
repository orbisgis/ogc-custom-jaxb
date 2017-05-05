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
 * <p>Classe Java pour ViewVolumeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ViewVolumeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}leftFov" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}rightFov" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}bottomFov" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}topFov" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}near" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ViewVolumeSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ViewVolumeObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewVolumeType", propOrder = {
    "leftFov",
    "rightFov",
    "bottomFov",
    "topFov",
    "near",
    "viewVolumeSimpleExtensionGroup",
    "viewVolumeObjectExtensionGroup"
})
public class ViewVolumeType
    extends AbstractObjectType
{

    @XmlElement(defaultValue = "0.0")
    protected Double leftFov;
    @XmlElement(defaultValue = "0.0")
    protected Double rightFov;
    @XmlElement(defaultValue = "0.0")
    protected Double bottomFov;
    @XmlElement(defaultValue = "0.0")
    protected Double topFov;
    @XmlElement(defaultValue = "0.0")
    protected Double near;
    @XmlElement(name = "ViewVolumeSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> viewVolumeSimpleExtensionGroup;
    @XmlElement(name = "ViewVolumeObjectExtensionGroup")
    protected List<AbstractObjectType> viewVolumeObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété leftFov.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLeftFov() {
        return leftFov;
    }

    /**
     * Définit la valeur de la propriété leftFov.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLeftFov(Double value) {
        this.leftFov = value;
    }

    public boolean isSetLeftFov() {
        return (this.leftFov!= null);
    }

    /**
     * Obtient la valeur de la propriété rightFov.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRightFov() {
        return rightFov;
    }

    /**
     * Définit la valeur de la propriété rightFov.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRightFov(Double value) {
        this.rightFov = value;
    }

    public boolean isSetRightFov() {
        return (this.rightFov!= null);
    }

    /**
     * Obtient la valeur de la propriété bottomFov.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottomFov() {
        return bottomFov;
    }

    /**
     * Définit la valeur de la propriété bottomFov.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottomFov(Double value) {
        this.bottomFov = value;
    }

    public boolean isSetBottomFov() {
        return (this.bottomFov!= null);
    }

    /**
     * Obtient la valeur de la propriété topFov.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopFov() {
        return topFov;
    }

    /**
     * Définit la valeur de la propriété topFov.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopFov(Double value) {
        this.topFov = value;
    }

    public boolean isSetTopFov() {
        return (this.topFov!= null);
    }

    /**
     * Obtient la valeur de la propriété near.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNear() {
        return near;
    }

    /**
     * Définit la valeur de la propriété near.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNear(Double value) {
        this.near = value;
    }

    public boolean isSetNear() {
        return (this.near!= null);
    }

    /**
     * Gets the value of the viewVolumeSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewVolumeSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewVolumeSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getViewVolumeSimpleExtensionGroup() {
        if (viewVolumeSimpleExtensionGroup == null) {
            viewVolumeSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.viewVolumeSimpleExtensionGroup;
    }

    public boolean isSetViewVolumeSimpleExtensionGroup() {
        return ((this.viewVolumeSimpleExtensionGroup!= null)&&(!this.viewVolumeSimpleExtensionGroup.isEmpty()));
    }

    public void unsetViewVolumeSimpleExtensionGroup() {
        this.viewVolumeSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the viewVolumeObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewVolumeObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewVolumeObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getViewVolumeObjectExtensionGroup() {
        if (viewVolumeObjectExtensionGroup == null) {
            viewVolumeObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.viewVolumeObjectExtensionGroup;
    }

    public boolean isSetViewVolumeObjectExtensionGroup() {
        return ((this.viewVolumeObjectExtensionGroup!= null)&&(!this.viewVolumeObjectExtensionGroup.isEmpty()));
    }

    public void unsetViewVolumeObjectExtensionGroup() {
        this.viewVolumeObjectExtensionGroup = null;
    }

}

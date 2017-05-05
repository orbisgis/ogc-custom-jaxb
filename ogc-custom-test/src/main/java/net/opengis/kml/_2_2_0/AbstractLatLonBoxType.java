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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AbstractLatLonBoxType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractLatLonBoxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}north" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}south" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}east" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}west" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractLatLonBoxSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractLatLonBoxObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractLatLonBoxType", propOrder = {
    "north",
    "south",
    "east",
    "west",
    "abstractLatLonBoxSimpleExtensionGroup",
    "abstractLatLonBoxObjectExtensionGroup"
})
@XmlSeeAlso({
    LatLonBoxType.class,
    LatLonAltBoxType.class
})
public abstract class AbstractLatLonBoxType
    extends AbstractObjectType
{

    @XmlElement(defaultValue = "180.0")
    protected Double north;
    @XmlElement(defaultValue = "-180.0")
    protected Double south;
    @XmlElement(defaultValue = "180.0")
    protected Double east;
    @XmlElement(defaultValue = "-180.0")
    protected Double west;
    @XmlElement(name = "AbstractLatLonBoxSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> abstractLatLonBoxSimpleExtensionGroup;
    @XmlElement(name = "AbstractLatLonBoxObjectExtensionGroup")
    protected List<AbstractObjectType> abstractLatLonBoxObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété north.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNorth() {
        return north;
    }

    /**
     * Définit la valeur de la propriété north.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNorth(Double value) {
        this.north = value;
    }

    public boolean isSetNorth() {
        return (this.north!= null);
    }

    /**
     * Obtient la valeur de la propriété south.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSouth() {
        return south;
    }

    /**
     * Définit la valeur de la propriété south.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSouth(Double value) {
        this.south = value;
    }

    public boolean isSetSouth() {
        return (this.south!= null);
    }

    /**
     * Obtient la valeur de la propriété east.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEast() {
        return east;
    }

    /**
     * Définit la valeur de la propriété east.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEast(Double value) {
        this.east = value;
    }

    public boolean isSetEast() {
        return (this.east!= null);
    }

    /**
     * Obtient la valeur de la propriété west.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWest() {
        return west;
    }

    /**
     * Définit la valeur de la propriété west.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWest(Double value) {
        this.west = value;
    }

    public boolean isSetWest() {
        return (this.west!= null);
    }

    /**
     * Gets the value of the abstractLatLonBoxSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractLatLonBoxSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractLatLonBoxSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAbstractLatLonBoxSimpleExtensionGroup() {
        if (abstractLatLonBoxSimpleExtensionGroup == null) {
            abstractLatLonBoxSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.abstractLatLonBoxSimpleExtensionGroup;
    }

    public boolean isSetAbstractLatLonBoxSimpleExtensionGroup() {
        return ((this.abstractLatLonBoxSimpleExtensionGroup!= null)&&(!this.abstractLatLonBoxSimpleExtensionGroup.isEmpty()));
    }

    public void unsetAbstractLatLonBoxSimpleExtensionGroup() {
        this.abstractLatLonBoxSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the abstractLatLonBoxObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractLatLonBoxObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractLatLonBoxObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getAbstractLatLonBoxObjectExtensionGroup() {
        if (abstractLatLonBoxObjectExtensionGroup == null) {
            abstractLatLonBoxObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.abstractLatLonBoxObjectExtensionGroup;
    }

    public boolean isSetAbstractLatLonBoxObjectExtensionGroup() {
        return ((this.abstractLatLonBoxObjectExtensionGroup!= null)&&(!this.abstractLatLonBoxObjectExtensionGroup.isEmpty()));
    }

    public void unsetAbstractLatLonBoxObjectExtensionGroup() {
        this.abstractLatLonBoxObjectExtensionGroup = null;
    }

}

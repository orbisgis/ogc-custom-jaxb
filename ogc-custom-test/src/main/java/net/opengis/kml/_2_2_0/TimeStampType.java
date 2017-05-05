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
 * <p>Classe Java pour TimeStampType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimeStampType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractTimePrimitiveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}when" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}TimeStampSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}TimeStampObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeStampType", propOrder = {
    "when",
    "timeStampSimpleExtensionGroup",
    "timeStampObjectExtensionGroup"
})
public class TimeStampType
    extends AbstractTimePrimitiveType
{

    protected String when;
    @XmlElement(name = "TimeStampSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> timeStampSimpleExtensionGroup;
    @XmlElement(name = "TimeStampObjectExtensionGroup")
    protected List<AbstractObjectType> timeStampObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété when.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhen() {
        return when;
    }

    /**
     * Définit la valeur de la propriété when.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhen(String value) {
        this.when = value;
    }

    public boolean isSetWhen() {
        return (this.when!= null);
    }

    /**
     * Gets the value of the timeStampSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeStampSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeStampSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTimeStampSimpleExtensionGroup() {
        if (timeStampSimpleExtensionGroup == null) {
            timeStampSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.timeStampSimpleExtensionGroup;
    }

    public boolean isSetTimeStampSimpleExtensionGroup() {
        return ((this.timeStampSimpleExtensionGroup!= null)&&(!this.timeStampSimpleExtensionGroup.isEmpty()));
    }

    public void unsetTimeStampSimpleExtensionGroup() {
        this.timeStampSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the timeStampObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeStampObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeStampObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getTimeStampObjectExtensionGroup() {
        if (timeStampObjectExtensionGroup == null) {
            timeStampObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.timeStampObjectExtensionGroup;
    }

    public boolean isSetTimeStampObjectExtensionGroup() {
        return ((this.timeStampObjectExtensionGroup!= null)&&(!this.timeStampObjectExtensionGroup.isEmpty()));
    }

    public void unsetTimeStampObjectExtensionGroup() {
        this.timeStampObjectExtensionGroup = null;
    }

}

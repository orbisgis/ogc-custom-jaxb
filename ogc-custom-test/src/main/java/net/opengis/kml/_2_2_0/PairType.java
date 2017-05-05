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
 * <p>Classe Java pour PairType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PairType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}key" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}styleUrl" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractStyleSelectorGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}PairSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}PairObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairType", propOrder = {
    "key",
    "styleUrl",
    "abstractStyleSelectorGroup",
    "pairSimpleExtensionGroup",
    "pairObjectExtensionGroup"
})
public class PairType
    extends AbstractObjectType
{

    @XmlElement(defaultValue = "normal")
    protected StyleStateEnumType key;
    @XmlSchemaType(name = "anyURI")
    protected String styleUrl;
    @XmlElementRef(name = "AbstractStyleSelectorGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractStyleSelectorType> abstractStyleSelectorGroup;
    @XmlElement(name = "PairSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> pairSimpleExtensionGroup;
    @XmlElement(name = "PairObjectExtensionGroup")
    protected List<AbstractObjectType> pairObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété key.
     * 
     * @return
     *     possible object is
     *     {@link StyleStateEnumType }
     *     
     */
    public StyleStateEnumType getKey() {
        return key;
    }

    /**
     * Définit la valeur de la propriété key.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleStateEnumType }
     *     
     */
    public void setKey(StyleStateEnumType value) {
        this.key = value;
    }

    public boolean isSetKey() {
        return (this.key!= null);
    }

    /**
     * Obtient la valeur de la propriété styleUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleUrl() {
        return styleUrl;
    }

    /**
     * Définit la valeur de la propriété styleUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleUrl(String value) {
        this.styleUrl = value;
    }

    public boolean isSetStyleUrl() {
        return (this.styleUrl!= null);
    }

    /**
     * Obtient la valeur de la propriété abstractStyleSelectorGroup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StyleMapType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StyleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractStyleSelectorType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractStyleSelectorType> getAbstractStyleSelectorGroup() {
        return abstractStyleSelectorGroup;
    }

    /**
     * Définit la valeur de la propriété abstractStyleSelectorGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StyleMapType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StyleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractStyleSelectorType }{@code >}
     *     
     */
    public void setAbstractStyleSelectorGroup(JAXBElement<? extends AbstractStyleSelectorType> value) {
        this.abstractStyleSelectorGroup = value;
    }

    public boolean isSetAbstractStyleSelectorGroup() {
        return (this.abstractStyleSelectorGroup!= null);
    }

    /**
     * Gets the value of the pairSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPairSimpleExtensionGroup() {
        if (pairSimpleExtensionGroup == null) {
            pairSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.pairSimpleExtensionGroup;
    }

    public boolean isSetPairSimpleExtensionGroup() {
        return ((this.pairSimpleExtensionGroup!= null)&&(!this.pairSimpleExtensionGroup.isEmpty()));
    }

    public void unsetPairSimpleExtensionGroup() {
        this.pairSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the pairObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getPairObjectExtensionGroup() {
        if (pairObjectExtensionGroup == null) {
            pairObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.pairObjectExtensionGroup;
    }

    public boolean isSetPairObjectExtensionGroup() {
        return ((this.pairObjectExtensionGroup!= null)&&(!this.pairObjectExtensionGroup.isEmpty()));
    }

    public void unsetPairObjectExtensionGroup() {
        this.pairObjectExtensionGroup = null;
    }

}

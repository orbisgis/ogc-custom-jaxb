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
 * <p>Classe Java pour StyleMapType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StyleMapType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractStyleSelectorType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}Pair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}StyleMapSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}StyleMapObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleMapType", propOrder = {
    "pair",
    "styleMapSimpleExtensionGroup",
    "styleMapObjectExtensionGroup"
})
public class StyleMapType
    extends AbstractStyleSelectorType
{

    @XmlElement(name = "Pair")
    protected List<PairType> pair;
    @XmlElement(name = "StyleMapSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> styleMapSimpleExtensionGroup;
    @XmlElement(name = "StyleMapObjectExtensionGroup")
    protected List<AbstractObjectType> styleMapObjectExtensionGroup;

    /**
     * Gets the value of the pair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PairType }
     * 
     * 
     */
    public List<PairType> getPair() {
        if (pair == null) {
            pair = new ArrayList<PairType>();
        }
        return this.pair;
    }

    public boolean isSetPair() {
        return ((this.pair!= null)&&(!this.pair.isEmpty()));
    }

    public void unsetPair() {
        this.pair = null;
    }

    /**
     * Gets the value of the styleMapSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleMapSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleMapSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getStyleMapSimpleExtensionGroup() {
        if (styleMapSimpleExtensionGroup == null) {
            styleMapSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.styleMapSimpleExtensionGroup;
    }

    public boolean isSetStyleMapSimpleExtensionGroup() {
        return ((this.styleMapSimpleExtensionGroup!= null)&&(!this.styleMapSimpleExtensionGroup.isEmpty()));
    }

    public void unsetStyleMapSimpleExtensionGroup() {
        this.styleMapSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the styleMapObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleMapObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleMapObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getStyleMapObjectExtensionGroup() {
        if (styleMapObjectExtensionGroup == null) {
            styleMapObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.styleMapObjectExtensionGroup;
    }

    public boolean isSetStyleMapObjectExtensionGroup() {
        return ((this.styleMapObjectExtensionGroup!= null)&&(!this.styleMapObjectExtensionGroup.isEmpty()));
    }

    public void unsetStyleMapObjectExtensionGroup() {
        this.styleMapObjectExtensionGroup = null;
    }

}

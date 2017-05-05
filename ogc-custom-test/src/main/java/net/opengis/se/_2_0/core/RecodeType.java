//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RecodeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RecodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FunctionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}LookupValue"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}MapItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecodeType", propOrder = {
    "lookupValue",
    "mapItem"
})
public class RecodeType
    extends FunctionType
{

    @XmlElement(name = "LookupValue", required = true)
    protected ParameterValueType lookupValue;
    @XmlElement(name = "MapItem", required = true)
    protected List<MapItemType> mapItem;

    /**
     * Obtient la valeur de la propriété lookupValue.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getLookupValue() {
        return lookupValue;
    }

    /**
     * Définit la valeur de la propriété lookupValue.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setLookupValue(ParameterValueType value) {
        this.lookupValue = value;
    }

    public boolean isSetLookupValue() {
        return (this.lookupValue!= null);
    }

    /**
     * Gets the value of the mapItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapItemType }
     * 
     * 
     */
    public List<MapItemType> getMapItem() {
        if (mapItem == null) {
            mapItem = new ArrayList<MapItemType>();
        }
        return this.mapItem;
    }

    public boolean isSetMapItem() {
        return ((this.mapItem!= null)&&(!this.mapItem.isEmpty()));
    }

    public void unsetMapItem() {
        this.mapItem = null;
    }

}

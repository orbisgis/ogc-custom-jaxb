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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour ListStyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractSubStyleType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}listItemType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}bgColor" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ItemIcon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}maxSnippetLines" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ListStyleSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ListStyleObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListStyleType", propOrder = {
    "listItemType",
    "bgColor",
    "itemIcon",
    "maxSnippetLines",
    "listStyleSimpleExtensionGroup",
    "listStyleObjectExtensionGroup"
})
public class ListStyleType
    extends AbstractSubStyleType
{

    @XmlElement(defaultValue = "check")
    protected ListItemTypeEnumType listItemType;
    @XmlElement(type = String.class, defaultValue = "ffffffff")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] bgColor;
    @XmlElement(name = "ItemIcon")
    protected List<ItemIconType> itemIcon;
    @XmlElement(defaultValue = "2")
    protected Integer maxSnippetLines;
    @XmlElement(name = "ListStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> listStyleSimpleExtensionGroup;
    @XmlElement(name = "ListStyleObjectExtensionGroup")
    protected List<AbstractObjectType> listStyleObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété listItemType.
     * 
     * @return
     *     possible object is
     *     {@link ListItemTypeEnumType }
     *     
     */
    public ListItemTypeEnumType getListItemType() {
        return listItemType;
    }

    /**
     * Définit la valeur de la propriété listItemType.
     * 
     * @param value
     *     allowed object is
     *     {@link ListItemTypeEnumType }
     *     
     */
    public void setListItemType(ListItemTypeEnumType value) {
        this.listItemType = value;
    }

    public boolean isSetListItemType() {
        return (this.listItemType!= null);
    }

    /**
     * Obtient la valeur de la propriété bgColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getBgColor() {
        return bgColor;
    }

    /**
     * Définit la valeur de la propriété bgColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgColor(byte[] value) {
        this.bgColor = value;
    }

    public boolean isSetBgColor() {
        return (this.bgColor!= null);
    }

    /**
     * Gets the value of the itemIcon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemIcon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemIcon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIconType }
     * 
     * 
     */
    public List<ItemIconType> getItemIcon() {
        if (itemIcon == null) {
            itemIcon = new ArrayList<ItemIconType>();
        }
        return this.itemIcon;
    }

    public boolean isSetItemIcon() {
        return ((this.itemIcon!= null)&&(!this.itemIcon.isEmpty()));
    }

    public void unsetItemIcon() {
        this.itemIcon = null;
    }

    /**
     * Obtient la valeur de la propriété maxSnippetLines.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSnippetLines() {
        return maxSnippetLines;
    }

    /**
     * Définit la valeur de la propriété maxSnippetLines.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSnippetLines(Integer value) {
        this.maxSnippetLines = value;
    }

    public boolean isSetMaxSnippetLines() {
        return (this.maxSnippetLines!= null);
    }

    /**
     * Gets the value of the listStyleSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listStyleSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListStyleSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getListStyleSimpleExtensionGroup() {
        if (listStyleSimpleExtensionGroup == null) {
            listStyleSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.listStyleSimpleExtensionGroup;
    }

    public boolean isSetListStyleSimpleExtensionGroup() {
        return ((this.listStyleSimpleExtensionGroup!= null)&&(!this.listStyleSimpleExtensionGroup.isEmpty()));
    }

    public void unsetListStyleSimpleExtensionGroup() {
        this.listStyleSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the listStyleObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listStyleObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListStyleObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getListStyleObjectExtensionGroup() {
        if (listStyleObjectExtensionGroup == null) {
            listStyleObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.listStyleObjectExtensionGroup;
    }

    public boolean isSetListStyleObjectExtensionGroup() {
        return ((this.listStyleObjectExtensionGroup!= null)&&(!this.listStyleObjectExtensionGroup.isEmpty()));
    }

    public void unsetListStyleObjectExtensionGroup() {
        this.listStyleObjectExtensionGroup = null;
    }

}

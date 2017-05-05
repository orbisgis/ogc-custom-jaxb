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
 * <p>Classe Java pour StyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractStyleSelectorType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}IconStyle" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LabelStyle" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LineStyle" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}PolyStyle" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}BalloonStyle" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ListStyle" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}StyleSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}StyleObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleType", propOrder = {
    "iconStyle",
    "labelStyle",
    "lineStyle",
    "polyStyle",
    "balloonStyle",
    "listStyle",
    "styleSimpleExtensionGroup",
    "styleObjectExtensionGroup"
})
public class StyleType
    extends AbstractStyleSelectorType
{

    @XmlElement(name = "IconStyle")
    protected IconStyleType iconStyle;
    @XmlElement(name = "LabelStyle")
    protected LabelStyleType labelStyle;
    @XmlElement(name = "LineStyle")
    protected LineStyleType lineStyle;
    @XmlElement(name = "PolyStyle")
    protected PolyStyleType polyStyle;
    @XmlElement(name = "BalloonStyle")
    protected BalloonStyleType balloonStyle;
    @XmlElement(name = "ListStyle")
    protected ListStyleType listStyle;
    @XmlElement(name = "StyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> styleSimpleExtensionGroup;
    @XmlElement(name = "StyleObjectExtensionGroup")
    protected List<AbstractObjectType> styleObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété iconStyle.
     * 
     * @return
     *     possible object is
     *     {@link IconStyleType }
     *     
     */
    public IconStyleType getIconStyle() {
        return iconStyle;
    }

    /**
     * Définit la valeur de la propriété iconStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link IconStyleType }
     *     
     */
    public void setIconStyle(IconStyleType value) {
        this.iconStyle = value;
    }

    public boolean isSetIconStyle() {
        return (this.iconStyle!= null);
    }

    /**
     * Obtient la valeur de la propriété labelStyle.
     * 
     * @return
     *     possible object is
     *     {@link LabelStyleType }
     *     
     */
    public LabelStyleType getLabelStyle() {
        return labelStyle;
    }

    /**
     * Définit la valeur de la propriété labelStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelStyleType }
     *     
     */
    public void setLabelStyle(LabelStyleType value) {
        this.labelStyle = value;
    }

    public boolean isSetLabelStyle() {
        return (this.labelStyle!= null);
    }

    /**
     * Obtient la valeur de la propriété lineStyle.
     * 
     * @return
     *     possible object is
     *     {@link LineStyleType }
     *     
     */
    public LineStyleType getLineStyle() {
        return lineStyle;
    }

    /**
     * Définit la valeur de la propriété lineStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStyleType }
     *     
     */
    public void setLineStyle(LineStyleType value) {
        this.lineStyle = value;
    }

    public boolean isSetLineStyle() {
        return (this.lineStyle!= null);
    }

    /**
     * Obtient la valeur de la propriété polyStyle.
     * 
     * @return
     *     possible object is
     *     {@link PolyStyleType }
     *     
     */
    public PolyStyleType getPolyStyle() {
        return polyStyle;
    }

    /**
     * Définit la valeur de la propriété polyStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link PolyStyleType }
     *     
     */
    public void setPolyStyle(PolyStyleType value) {
        this.polyStyle = value;
    }

    public boolean isSetPolyStyle() {
        return (this.polyStyle!= null);
    }

    /**
     * Obtient la valeur de la propriété balloonStyle.
     * 
     * @return
     *     possible object is
     *     {@link BalloonStyleType }
     *     
     */
    public BalloonStyleType getBalloonStyle() {
        return balloonStyle;
    }

    /**
     * Définit la valeur de la propriété balloonStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link BalloonStyleType }
     *     
     */
    public void setBalloonStyle(BalloonStyleType value) {
        this.balloonStyle = value;
    }

    public boolean isSetBalloonStyle() {
        return (this.balloonStyle!= null);
    }

    /**
     * Obtient la valeur de la propriété listStyle.
     * 
     * @return
     *     possible object is
     *     {@link ListStyleType }
     *     
     */
    public ListStyleType getListStyle() {
        return listStyle;
    }

    /**
     * Définit la valeur de la propriété listStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link ListStyleType }
     *     
     */
    public void setListStyle(ListStyleType value) {
        this.listStyle = value;
    }

    public boolean isSetListStyle() {
        return (this.listStyle!= null);
    }

    /**
     * Gets the value of the styleSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getStyleSimpleExtensionGroup() {
        if (styleSimpleExtensionGroup == null) {
            styleSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.styleSimpleExtensionGroup;
    }

    public boolean isSetStyleSimpleExtensionGroup() {
        return ((this.styleSimpleExtensionGroup!= null)&&(!this.styleSimpleExtensionGroup.isEmpty()));
    }

    public void unsetStyleSimpleExtensionGroup() {
        this.styleSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the styleObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getStyleObjectExtensionGroup() {
        if (styleObjectExtensionGroup == null) {
            styleObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.styleObjectExtensionGroup;
    }

    public boolean isSetStyleObjectExtensionGroup() {
        return ((this.styleObjectExtensionGroup!= null)&&(!this.styleObjectExtensionGroup.isEmpty()));
    }

    public void unsetStyleObjectExtensionGroup() {
        this.styleObjectExtensionGroup = null;
    }

}

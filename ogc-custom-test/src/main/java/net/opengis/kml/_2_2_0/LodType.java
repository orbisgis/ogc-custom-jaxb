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
 * <p>Classe Java pour LodType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}minLodPixels" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}maxLodPixels" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}minFadeExtent" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}maxFadeExtent" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LodSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LodObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodType", propOrder = {
    "minLodPixels",
    "maxLodPixels",
    "minFadeExtent",
    "maxFadeExtent",
    "lodSimpleExtensionGroup",
    "lodObjectExtensionGroup"
})
public class LodType
    extends AbstractObjectType
{

    @XmlElement(defaultValue = "0.0")
    protected Double minLodPixels;
    @XmlElement(defaultValue = "-1.0")
    protected Double maxLodPixels;
    @XmlElement(defaultValue = "0.0")
    protected Double minFadeExtent;
    @XmlElement(defaultValue = "0.0")
    protected Double maxFadeExtent;
    @XmlElement(name = "LodSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> lodSimpleExtensionGroup;
    @XmlElement(name = "LodObjectExtensionGroup")
    protected List<AbstractObjectType> lodObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété minLodPixels.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinLodPixels() {
        return minLodPixels;
    }

    /**
     * Définit la valeur de la propriété minLodPixels.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinLodPixels(Double value) {
        this.minLodPixels = value;
    }

    public boolean isSetMinLodPixels() {
        return (this.minLodPixels!= null);
    }

    /**
     * Obtient la valeur de la propriété maxLodPixels.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxLodPixels() {
        return maxLodPixels;
    }

    /**
     * Définit la valeur de la propriété maxLodPixels.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxLodPixels(Double value) {
        this.maxLodPixels = value;
    }

    public boolean isSetMaxLodPixels() {
        return (this.maxLodPixels!= null);
    }

    /**
     * Obtient la valeur de la propriété minFadeExtent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinFadeExtent() {
        return minFadeExtent;
    }

    /**
     * Définit la valeur de la propriété minFadeExtent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinFadeExtent(Double value) {
        this.minFadeExtent = value;
    }

    public boolean isSetMinFadeExtent() {
        return (this.minFadeExtent!= null);
    }

    /**
     * Obtient la valeur de la propriété maxFadeExtent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxFadeExtent() {
        return maxFadeExtent;
    }

    /**
     * Définit la valeur de la propriété maxFadeExtent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxFadeExtent(Double value) {
        this.maxFadeExtent = value;
    }

    public boolean isSetMaxFadeExtent() {
        return (this.maxFadeExtent!= null);
    }

    /**
     * Gets the value of the lodSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lodSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLodSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLodSimpleExtensionGroup() {
        if (lodSimpleExtensionGroup == null) {
            lodSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.lodSimpleExtensionGroup;
    }

    public boolean isSetLodSimpleExtensionGroup() {
        return ((this.lodSimpleExtensionGroup!= null)&&(!this.lodSimpleExtensionGroup.isEmpty()));
    }

    public void unsetLodSimpleExtensionGroup() {
        this.lodSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the lodObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lodObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLodObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getLodObjectExtensionGroup() {
        if (lodObjectExtensionGroup == null) {
            lodObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.lodObjectExtensionGroup;
    }

    public boolean isSetLodObjectExtensionGroup() {
        return ((this.lodObjectExtensionGroup!= null)&&(!this.lodObjectExtensionGroup.isEmpty()));
    }

    public void unsetLodObjectExtensionGroup() {
        this.lodObjectExtensionGroup = null;
    }

}

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
 * <p>Classe Java pour ImagePyramidType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ImagePyramidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}tileSize" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}maxWidth" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}maxHeight" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}gridOrigin" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ImagePyramidSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ImagePyramidObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagePyramidType", propOrder = {
    "tileSize",
    "maxWidth",
    "maxHeight",
    "gridOrigin",
    "imagePyramidSimpleExtensionGroup",
    "imagePyramidObjectExtensionGroup"
})
public class ImagePyramidType
    extends AbstractObjectType
{

    @XmlElement(defaultValue = "256")
    protected Integer tileSize;
    @XmlElement(defaultValue = "0")
    protected Integer maxWidth;
    @XmlElement(defaultValue = "0")
    protected Integer maxHeight;
    @XmlElement(defaultValue = "lowerLeft")
    protected GridOriginEnumType gridOrigin;
    @XmlElement(name = "ImagePyramidSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> imagePyramidSimpleExtensionGroup;
    @XmlElement(name = "ImagePyramidObjectExtensionGroup")
    protected List<AbstractObjectType> imagePyramidObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété tileSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTileSize() {
        return tileSize;
    }

    /**
     * Définit la valeur de la propriété tileSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTileSize(Integer value) {
        this.tileSize = value;
    }

    public boolean isSetTileSize() {
        return (this.tileSize!= null);
    }

    /**
     * Obtient la valeur de la propriété maxWidth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxWidth() {
        return maxWidth;
    }

    /**
     * Définit la valeur de la propriété maxWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxWidth(Integer value) {
        this.maxWidth = value;
    }

    public boolean isSetMaxWidth() {
        return (this.maxWidth!= null);
    }

    /**
     * Obtient la valeur de la propriété maxHeight.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxHeight() {
        return maxHeight;
    }

    /**
     * Définit la valeur de la propriété maxHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxHeight(Integer value) {
        this.maxHeight = value;
    }

    public boolean isSetMaxHeight() {
        return (this.maxHeight!= null);
    }

    /**
     * Obtient la valeur de la propriété gridOrigin.
     * 
     * @return
     *     possible object is
     *     {@link GridOriginEnumType }
     *     
     */
    public GridOriginEnumType getGridOrigin() {
        return gridOrigin;
    }

    /**
     * Définit la valeur de la propriété gridOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link GridOriginEnumType }
     *     
     */
    public void setGridOrigin(GridOriginEnumType value) {
        this.gridOrigin = value;
    }

    public boolean isSetGridOrigin() {
        return (this.gridOrigin!= null);
    }

    /**
     * Gets the value of the imagePyramidSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagePyramidSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagePyramidSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getImagePyramidSimpleExtensionGroup() {
        if (imagePyramidSimpleExtensionGroup == null) {
            imagePyramidSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.imagePyramidSimpleExtensionGroup;
    }

    public boolean isSetImagePyramidSimpleExtensionGroup() {
        return ((this.imagePyramidSimpleExtensionGroup!= null)&&(!this.imagePyramidSimpleExtensionGroup.isEmpty()));
    }

    public void unsetImagePyramidSimpleExtensionGroup() {
        this.imagePyramidSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the imagePyramidObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagePyramidObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagePyramidObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getImagePyramidObjectExtensionGroup() {
        if (imagePyramidObjectExtensionGroup == null) {
            imagePyramidObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.imagePyramidObjectExtensionGroup;
    }

    public boolean isSetImagePyramidObjectExtensionGroup() {
        return ((this.imagePyramidObjectExtensionGroup!= null)&&(!this.imagePyramidObjectExtensionGroup.isEmpty()));
    }

    public void unsetImagePyramidObjectExtensionGroup() {
        this.imagePyramidObjectExtensionGroup = null;
    }

}

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
 * <p>Classe Java pour LineStyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LineStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractColorStyleType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}width" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LineStyleSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LineStyleObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineStyleType", propOrder = {
    "width",
    "lineStyleSimpleExtensionGroup",
    "lineStyleObjectExtensionGroup"
})
public class LineStyleType
    extends AbstractColorStyleType
{

    @XmlElement(defaultValue = "1.0")
    protected Double width;
    @XmlElement(name = "LineStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> lineStyleSimpleExtensionGroup;
    @XmlElement(name = "LineStyleObjectExtensionGroup")
    protected List<AbstractObjectType> lineStyleObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété width.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Définit la valeur de la propriété width.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

    public boolean isSetWidth() {
        return (this.width!= null);
    }

    /**
     * Gets the value of the lineStyleSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineStyleSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineStyleSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLineStyleSimpleExtensionGroup() {
        if (lineStyleSimpleExtensionGroup == null) {
            lineStyleSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.lineStyleSimpleExtensionGroup;
    }

    public boolean isSetLineStyleSimpleExtensionGroup() {
        return ((this.lineStyleSimpleExtensionGroup!= null)&&(!this.lineStyleSimpleExtensionGroup.isEmpty()));
    }

    public void unsetLineStyleSimpleExtensionGroup() {
        this.lineStyleSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the lineStyleObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineStyleObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineStyleObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getLineStyleObjectExtensionGroup() {
        if (lineStyleObjectExtensionGroup == null) {
            lineStyleObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.lineStyleObjectExtensionGroup;
    }

    public boolean isSetLineStyleObjectExtensionGroup() {
        return ((this.lineStyleObjectExtensionGroup!= null)&&(!this.lineStyleObjectExtensionGroup.isEmpty()));
    }

    public void unsetLineStyleObjectExtensionGroup() {
        this.lineStyleObjectExtensionGroup = null;
    }

}

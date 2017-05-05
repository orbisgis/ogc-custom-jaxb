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
 * <p>Classe Java pour BoundaryType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BoundaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LinearRing" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}BoundarySimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}BoundaryObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundaryType", propOrder = {
    "linearRing",
    "boundarySimpleExtensionGroup",
    "boundaryObjectExtensionGroup"
})
public class BoundaryType {

    @XmlElement(name = "LinearRing")
    protected LinearRingType linearRing;
    @XmlElement(name = "BoundarySimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> boundarySimpleExtensionGroup;
    @XmlElement(name = "BoundaryObjectExtensionGroup")
    protected List<AbstractObjectType> boundaryObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété linearRing.
     * 
     * @return
     *     possible object is
     *     {@link LinearRingType }
     *     
     */
    public LinearRingType getLinearRing() {
        return linearRing;
    }

    /**
     * Définit la valeur de la propriété linearRing.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearRingType }
     *     
     */
    public void setLinearRing(LinearRingType value) {
        this.linearRing = value;
    }

    public boolean isSetLinearRing() {
        return (this.linearRing!= null);
    }

    /**
     * Gets the value of the boundarySimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundarySimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundarySimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBoundarySimpleExtensionGroup() {
        if (boundarySimpleExtensionGroup == null) {
            boundarySimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.boundarySimpleExtensionGroup;
    }

    public boolean isSetBoundarySimpleExtensionGroup() {
        return ((this.boundarySimpleExtensionGroup!= null)&&(!this.boundarySimpleExtensionGroup.isEmpty()));
    }

    public void unsetBoundarySimpleExtensionGroup() {
        this.boundarySimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the boundaryObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundaryObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundaryObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getBoundaryObjectExtensionGroup() {
        if (boundaryObjectExtensionGroup == null) {
            boundaryObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.boundaryObjectExtensionGroup;
    }

    public boolean isSetBoundaryObjectExtensionGroup() {
        return ((this.boundaryObjectExtensionGroup!= null)&&(!this.boundaryObjectExtensionGroup.isEmpty()));
    }

    public void unsetBoundaryObjectExtensionGroup() {
        this.boundaryObjectExtensionGroup = null;
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.sld._1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.core.OnlineResourceType;


/**
 * <p>Classe Java pour LayerDescriptionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LayerDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="owsType" type="{http://www.opengis.net/sld/1.2}owsTypeType"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}OnlineResource"/>
 *         &lt;element name="TypeName" type="{http://www.opengis.net/sld/1.2}TypeNameType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayerDescriptionType", propOrder = {
    "owsType",
    "onlineResource",
    "typeName"
})
public class LayerDescriptionType {

    @XmlElement(required = true)
    protected OwsTypeType owsType;
    @XmlElement(name = "OnlineResource", namespace = "http://www.opengis.net/se/2.0/core", required = true)
    protected OnlineResourceType onlineResource;
    @XmlElement(name = "TypeName", required = true)
    protected List<TypeNameType> typeName;

    /**
     * Obtient la valeur de la propriété owsType.
     * 
     * @return
     *     possible object is
     *     {@link OwsTypeType }
     *     
     */
    public OwsTypeType getOwsType() {
        return owsType;
    }

    /**
     * Définit la valeur de la propriété owsType.
     * 
     * @param value
     *     allowed object is
     *     {@link OwsTypeType }
     *     
     */
    public void setOwsType(OwsTypeType value) {
        this.owsType = value;
    }

    public boolean isSetOwsType() {
        return (this.owsType!= null);
    }

    /**
     * Obtient la valeur de la propriété onlineResource.
     * 
     * @return
     *     possible object is
     *     {@link OnlineResourceType }
     *     
     */
    public OnlineResourceType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Définit la valeur de la propriété onlineResource.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineResourceType }
     *     
     */
    public void setOnlineResource(OnlineResourceType value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

    /**
     * Gets the value of the typeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeNameType }
     * 
     * 
     */
    public List<TypeNameType> getTypeName() {
        if (typeName == null) {
            typeName = new ArrayList<TypeNameType>();
        }
        return this.typeName;
    }

    public boolean isSetTypeName() {
        return ((this.typeName!= null)&&(!this.typeName.isEmpty()));
    }

    public void unsetTypeName() {
        this.typeName = null;
    }

}

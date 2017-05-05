//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PointLabelType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PointLabelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}LabelType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Rotation" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}ExclusionZone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointLabelType", propOrder = {
    "rotation",
    "exclusionZone"
})
public class PointLabelType
    extends LabelType
{

    @XmlElement(name = "Rotation")
    protected ParameterValueType rotation;
    @XmlElementRef(name = "ExclusionZone", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends ExclusionZoneType> exclusionZone;

    /**
     * Obtient la valeur de la propriété rotation.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getRotation() {
        return rotation;
    }

    /**
     * Définit la valeur de la propriété rotation.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setRotation(ParameterValueType value) {
        this.rotation = value;
    }

    public boolean isSetRotation() {
        return (this.rotation!= null);
    }

    /**
     * Obtient la valeur de la propriété exclusionZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclusionRectangleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExclusionRadiusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExclusionZoneType }{@code >}
     *     
     */
    public JAXBElement<? extends ExclusionZoneType> getExclusionZone() {
        return exclusionZone;
    }

    /**
     * Définit la valeur de la propriété exclusionZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclusionRectangleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExclusionRadiusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExclusionZoneType }{@code >}
     *     
     */
    public void setExclusionZone(JAXBElement<? extends ExclusionZoneType> value) {
        this.exclusionZone = value;
    }

    public boolean isSetExclusionZone() {
        return (this.exclusionZone!= null);
    }

}

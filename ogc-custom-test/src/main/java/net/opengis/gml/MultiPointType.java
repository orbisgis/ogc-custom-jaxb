//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A MultiPoint is defined by one or more Points, referenced through pointMember elements.
 * 
 * <p>Classe Java pour MultiPointType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MultiPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}pointMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}pointMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPointType", propOrder = {
    "pointMember",
    "pointMembers"
})
public class MultiPointType
    extends AbstractGeometricAggregateType
{

    protected List<PointPropertyType> pointMember;
    protected PointArrayPropertyType pointMembers;

    /**
     * Gets the value of the pointMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointPropertyType }
     * 
     * 
     */
    public List<PointPropertyType> getPointMember() {
        if (pointMember == null) {
            pointMember = new ArrayList<PointPropertyType>();
        }
        return this.pointMember;
    }

    public boolean isSetPointMember() {
        return ((this.pointMember!= null)&&(!this.pointMember.isEmpty()));
    }

    public void unsetPointMember() {
        this.pointMember = null;
    }

    /**
     * Obtient la valeur de la propriété pointMembers.
     * 
     * @return
     *     possible object is
     *     {@link PointArrayPropertyType }
     *     
     */
    public PointArrayPropertyType getPointMembers() {
        return pointMembers;
    }

    /**
     * Définit la valeur de la propriété pointMembers.
     * 
     * @param value
     *     allowed object is
     *     {@link PointArrayPropertyType }
     *     
     */
    public void setPointMembers(PointArrayPropertyType value) {
        this.pointMembers = value;
    }

    public boolean isSetPointMembers() {
        return (this.pointMembers!= null);
    }

}

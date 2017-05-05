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
 * A MultiLineString is defined by one or more LineStrings, referenced through lineStringMember elements. Deprecated with GML version 3.0. Use MultiCurveType instead.
 * 
 * <p>Classe Java pour MultiLineStringType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MultiLineStringType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}lineStringMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLineStringType", propOrder = {
    "lineStringMember"
})
public class MultiLineStringType
    extends AbstractGeometricAggregateType
{

    protected List<LineStringPropertyType> lineStringMember;

    /**
     * Gets the value of the lineStringMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineStringMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineStringMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineStringPropertyType }
     * 
     * 
     */
    public List<LineStringPropertyType> getLineStringMember() {
        if (lineStringMember == null) {
            lineStringMember = new ArrayList<LineStringPropertyType>();
        }
        return this.lineStringMember;
    }

    public boolean isSetLineStringMember() {
        return ((this.lineStringMember!= null)&&(!this.lineStringMember.isEmpty()));
    }

    public void unsetLineStringMember() {
        this.lineStringMember = null;
    }

}

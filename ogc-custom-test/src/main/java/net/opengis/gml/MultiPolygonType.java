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
 * A MultiPolygon is defined by one or more Polygons, referenced through polygonMember elements. Deprecated with GML version 3.0. Use MultiSurfaceType instead.
 * 
 * <p>Classe Java pour MultiPolygonType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MultiPolygonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}polygonMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPolygonType", propOrder = {
    "polygonMember"
})
public class MultiPolygonType
    extends AbstractGeometricAggregateType
{

    protected List<PolygonPropertyType> polygonMember;

    /**
     * Gets the value of the polygonMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygonMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygonMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolygonPropertyType }
     * 
     * 
     */
    public List<PolygonPropertyType> getPolygonMember() {
        if (polygonMember == null) {
            polygonMember = new ArrayList<PolygonPropertyType>();
        }
        return this.polygonMember;
    }

    public boolean isSetPolygonMember() {
        return ((this.polygonMember!= null)&&(!this.polygonMember.isEmpty()));
    }

    public void unsetPolygonMember() {
        this.polygonMember = null;
    }

}

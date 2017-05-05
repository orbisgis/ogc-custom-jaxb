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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A temporal topology complex.
 * 
 * <p>Classe Java pour TimeTopologyComplexType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimeTopologyComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeComplexType">
 *       &lt;sequence>
 *         &lt;element name="primitive" type="{http://www.opengis.net/gml}TimeTopologyPrimitivePropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTopologyComplexType", propOrder = {
    "primitive"
})
public class TimeTopologyComplexType
    extends AbstractTimeComplexType
{

    @XmlElement(required = true)
    protected List<TimeTopologyPrimitivePropertyType> primitive;

    /**
     * Gets the value of the primitive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primitive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimitive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTopologyPrimitivePropertyType }
     * 
     * 
     */
    public List<TimeTopologyPrimitivePropertyType> getPrimitive() {
        if (primitive == null) {
            primitive = new ArrayList<TimeTopologyPrimitivePropertyType>();
        }
        return this.primitive;
    }

    public boolean isSetPrimitive() {
        return ((this.primitive!= null)&&(!this.primitive.isEmpty()));
    }

    public void unsetPrimitive() {
        this.primitive = null;
    }

}

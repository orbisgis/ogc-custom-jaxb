//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A container for an array of curves. The elements are always contained in the array property, referencing geometry elements 
 * 			or arrays of geometry elements is not supported.
 * 
 * <p>Classe Java pour CurveArrayPropertyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CurveArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Curve" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveArrayPropertyType", propOrder = {
    "curve"
})
public class CurveArrayPropertyType {

    @XmlElementRef(name = "_Curve", namespace = "http://www.opengis.net/gml", type = ACurveElement.class)
    protected List<JAXBElement<? extends AbstractCurveType>> curve;

    /**
     * Gets the value of the curve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link ACurveElement }
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractCurveType>> getCurve() {
        if (curve == null) {
            curve = new ArrayList<JAXBElement<? extends AbstractCurveType>>();
        }
        return this.curve;
    }

    public boolean isSetCurve() {
        return ((this.curve!= null)&&(!this.curve.isEmpty()));
    }

    public void unsetCurve() {
        this.curve = null;
    }

}

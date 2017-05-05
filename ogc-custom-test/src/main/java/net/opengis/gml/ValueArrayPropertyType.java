//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * GML property which refers to, or contains, a set of homogeneously typed Values.
 * 
 * <p>Classe Java pour ValueArrayPropertyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ValueArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/gml}Value" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueArrayPropertyType", propOrder = {
    "value"
})
public class ValueArrayPropertyType {

    @XmlElementRefs({
        @XmlElementRef(name = "CompositeValue", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "Count", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CategoryExtent", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "Null", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "Boolean", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "Quantity", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CountExtent", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CategoryList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "Category", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "QuantityList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "QuantityExtent", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "BooleanList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CountList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    })
    @XmlAnyElement
    protected List<Object> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link CategoryExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeOrNullListType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNullListType }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantityExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<Object> getValue() {
        if (value == null) {
            value = new ArrayList<Object>();
        }
        return this.value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
    }

}

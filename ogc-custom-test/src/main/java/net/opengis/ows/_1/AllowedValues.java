//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}Value"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}Range"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valueOrRange"
})
@XmlRootElement(name = "AllowedValues")
public class AllowedValues {

    @XmlElements({
        @XmlElement(name = "Value", type = ValueType.class),
        @XmlElement(name = "Range", type = RangeType.class)
    })
    protected List<Object> valueOrRange;

    /**
     * Gets the value of the valueOrRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueOrRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueOrRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     * {@link RangeType }
     * 
     * 
     */
    public List<Object> getValueOrRange() {
        if (valueOrRange == null) {
            valueOrRange = new ArrayList<Object>();
        }
        return this.valueOrRange;
    }

    public boolean isSetValueOrRange() {
        return ((this.valueOrRange!= null)&&(!this.valueOrRange.isEmpty()));
    }

    public void unsetValueOrRange() {
        this.valueOrRange = null;
    }

}

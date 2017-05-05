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
 * A coordinate reference system describing the position of points through two or more independent coordinate reference systems. 
 * 
 * <p>Classe Java pour CompoundCRSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CompoundCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}includesCRS" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundCRSType", propOrder = {
    "includesCRS"
})
public class CompoundCRSType
    extends AbstractReferenceSystemType
{

    @XmlElement(required = true)
    protected List<CoordinateReferenceSystemRefType> includesCRS;

    /**
     * Ordered sequence of associations to all the component coordinate reference systems included in this compound coordinate reference system. Gets the value of the includesCRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesCRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesCRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateReferenceSystemRefType }
     * 
     * 
     */
    public List<CoordinateReferenceSystemRefType> getIncludesCRS() {
        if (includesCRS == null) {
            includesCRS = new ArrayList<CoordinateReferenceSystemRefType>();
        }
        return this.includesCRS;
    }

    public boolean isSetIncludesCRS() {
        return ((this.includesCRS!= null)&&(!this.includesCRS.isEmpty()));
    }

    public void unsetIncludesCRS() {
        this.includesCRS = null;
    }

}

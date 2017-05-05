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
 * An ordered sequence of two or more single coordinate operations. The sequence of operations is constrained by the requirement that the source coordinate reference system of step (n+1) must be the same as the target coordinate reference system of step (n). The source coordinate reference system of the first step and the target coordinate reference system of the last step are the source and target coordinate reference system associated with the concatenated operation. Instead of a forward operation, an inverse operation may be used for one or more of the operation steps mentioned above, if the inverse operation is uniquely defined by the forward operation.
 * 
 * <p>Classe Java pour ConcatenatedOperationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConcatenatedOperationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCoordinateOperationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesSingleOperation" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcatenatedOperationType", propOrder = {
    "usesSingleOperation"
})
public class ConcatenatedOperationType
    extends AbstractCoordinateOperationType
{

    @XmlElement(required = true)
    protected List<SingleOperationRefType> usesSingleOperation;

    /**
     * Ordered sequence of associations to the two or more single operations used by this concatenated operation. Gets the value of the usesSingleOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesSingleOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesSingleOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleOperationRefType }
     * 
     * 
     */
    public List<SingleOperationRefType> getUsesSingleOperation() {
        if (usesSingleOperation == null) {
            usesSingleOperation = new ArrayList<SingleOperationRefType>();
        }
        return this.usesSingleOperation;
    }

    public boolean isSetUsesSingleOperation() {
        return ((this.usesSingleOperation!= null)&&(!this.usesSingleOperation.isEmpty()));
    }

    public void unsetUsesSingleOperation() {
        this.usesSingleOperation = null;
    }

}

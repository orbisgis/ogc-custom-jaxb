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
 * Error estimate covariance matrix. 
 * 
 * <p>Classe Java pour CovarianceMatrixType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CovarianceMatrixType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractPositionalAccuracyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}unitOfMeasure" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}includesElement" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CovarianceMatrixType", propOrder = {
    "unitOfMeasure",
    "includesElement"
})
public class CovarianceMatrixType
    extends AbstractPositionalAccuracyType
{

    @XmlElement(required = true)
    protected List<UnitOfMeasureType> unitOfMeasure;
    @XmlElement(required = true)
    protected List<CovarianceElementType> includesElement;

    /**
     * Ordered sequence of units of measure, corresponding to the row and column index numbers of the covariance matrix, starting with row and column 1 and ending with row/column N. Each unit of measure is for the ordinate reflected in the relevant row and column of the covariance matrix. Gets the value of the unitOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitOfMeasureType }
     * 
     * 
     */
    public List<UnitOfMeasureType> getUnitOfMeasure() {
        if (unitOfMeasure == null) {
            unitOfMeasure = new ArrayList<UnitOfMeasureType>();
        }
        return this.unitOfMeasure;
    }

    public boolean isSetUnitOfMeasure() {
        return ((this.unitOfMeasure!= null)&&(!this.unitOfMeasure.isEmpty()));
    }

    public void unsetUnitOfMeasure() {
        this.unitOfMeasure = null;
    }

    /**
     * Unordered set of elements in this covariance matrix. Because the covariance matrix is symmetrical, only the elements in the upper or lower diagonal part (including the main diagonal) of the matrix need to be specified. Any zero valued covariance elements can be omitted. Gets the value of the includesElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CovarianceElementType }
     * 
     * 
     */
    public List<CovarianceElementType> getIncludesElement() {
        if (includesElement == null) {
            includesElement = new ArrayList<CovarianceElementType>();
        }
        return this.includesElement;
    }

    public boolean isSetIncludesElement() {
        return ((this.includesElement!= null)&&(!this.includesElement.isEmpty()));
    }

    public void unsetIncludesElement() {
        this.includesElement = null;
    }

}

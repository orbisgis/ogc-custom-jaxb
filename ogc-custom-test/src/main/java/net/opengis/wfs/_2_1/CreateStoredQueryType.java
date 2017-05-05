//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CreateStoredQueryType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CreateStoredQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wfs/2.1}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="StoredQueryDefinition" type="{http://www.opengis.net/wfs/2.1}StoredQueryDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateStoredQueryType", propOrder = {
    "storedQueryDefinition"
})
public class CreateStoredQueryType
    extends BaseRequestType
{

    @XmlElement(name = "StoredQueryDefinition")
    protected List<StoredQueryDescriptionType> storedQueryDefinition;

    /**
     * Gets the value of the storedQueryDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedQueryDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredQueryDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredQueryDescriptionType }
     * 
     * 
     */
    public List<StoredQueryDescriptionType> getStoredQueryDefinition() {
        if (storedQueryDefinition == null) {
            storedQueryDefinition = new ArrayList<StoredQueryDescriptionType>();
        }
        return this.storedQueryDefinition;
    }

    public boolean isSetStoredQueryDefinition() {
        return ((this.storedQueryDefinition!= null)&&(!this.storedQueryDefinition.isEmpty()));
    }

    public void unsetStoredQueryDefinition() {
        this.storedQueryDefinition = null;
    }

}

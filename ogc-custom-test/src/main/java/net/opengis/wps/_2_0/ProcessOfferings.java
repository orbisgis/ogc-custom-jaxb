//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wps._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/wps/2.0}ProcessOffering" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processOffering"
})
@XmlRootElement(name = "ProcessOfferings")
public class ProcessOfferings {

    @XmlElement(name = "ProcessOffering", required = true)
    protected List<ProcessOffering> processOffering;

    /**
     * 
     * 							Ordered list of one or more full Process
     * 							descriptions, listed in the order in which they were requested
     * 							in the DescribeProcess operation request.
     * 						Gets the value of the processOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessOffering }
     * 
     * 
     */
    public List<ProcessOffering> getProcessOffering() {
        if (processOffering == null) {
            processOffering = new ArrayList<ProcessOffering>();
        }
        return this.processOffering;
    }

    public boolean isSetProcessOffering() {
        return ((this.processOffering!= null)&&(!this.processOffering.isEmpty()));
    }

    public void unsetProcessOffering() {
        this.processOffering = null;
    }

}

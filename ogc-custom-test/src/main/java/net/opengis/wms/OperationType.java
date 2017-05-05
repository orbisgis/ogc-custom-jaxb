//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         For each operation offered by the server, list the available output
 *         formats and the online resource.
 *       
 * 
 * <p>Classe Java pour OperationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OperationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/wms}Format" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/wms}DCPType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationType", propOrder = {
    "format",
    "dcpType"
})
public class OperationType {

    @XmlElement(name = "Format", required = true)
    protected List<String> format;
    @XmlElement(name = "DCPType", required = true)
    protected List<DCPType> dcpType;

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFormat() {
        if (format == null) {
            format = new ArrayList<String>();
        }
        return this.format;
    }

    public boolean isSetFormat() {
        return ((this.format!= null)&&(!this.format.isEmpty()));
    }

    public void unsetFormat() {
        this.format = null;
    }

    /**
     * Gets the value of the dcpType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcpType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCPType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DCPType }
     * 
     * 
     */
    public List<DCPType> getDCPType() {
        if (dcpType == null) {
            dcpType = new ArrayList<DCPType>();
        }
        return this.dcpType;
    }

    public boolean isSetDCPType() {
        return ((this.dcpType!= null)&&(!this.dcpType.isEmpty()));
    }

    public void unsetDCPType() {
        this.dcpType = null;
    }

}

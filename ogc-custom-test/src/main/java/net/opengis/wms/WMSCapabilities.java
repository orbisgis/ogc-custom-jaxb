//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.opengis.net/wms}Service"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Capability"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.3.0" />
 *       &lt;attribute name="updateSequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "service",
    "capability"
})
@XmlRootElement(name = "WMS_Capabilities")
public class WMSCapabilities {

    @XmlElement(name = "Service", required = true)
    protected Service service;
    @XmlElement(name = "Capability", required = true)
    protected Capability capability;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "version")
    public final static String VERSION = "1.3.0";
    @XmlAttribute(name = "updateSequence")
    protected String updateSequence;

    /**
     * Obtient la valeur de la propriété service.
     * 
     * @return
     *     possible object is
     *     {@link Service }
     *     
     */
    public Service getService() {
        return service;
    }

    /**
     * Définit la valeur de la propriété service.
     * 
     * @param value
     *     allowed object is
     *     {@link Service }
     *     
     */
    public void setService(Service value) {
        this.service = value;
    }

    public boolean isSetService() {
        return (this.service!= null);
    }

    /**
     * Obtient la valeur de la propriété capability.
     * 
     * @return
     *     possible object is
     *     {@link Capability }
     *     
     */
    public Capability getCapability() {
        return capability;
    }

    /**
     * Définit la valeur de la propriété capability.
     * 
     * @param value
     *     allowed object is
     *     {@link Capability }
     *     
     */
    public void setCapability(Capability value) {
        this.capability = value;
    }

    public boolean isSetCapability() {
        return (this.capability!= null);
    }

    /**
     * Obtient la valeur de la propriété updateSequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateSequence() {
        return updateSequence;
    }

    /**
     * Définit la valeur de la propriété updateSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateSequence(String value) {
        this.updateSequence = value;
    }

    public boolean isSetUpdateSequence() {
        return (this.updateSequence!= null);
    }

}

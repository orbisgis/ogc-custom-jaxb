//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

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
 *         &lt;element ref="{http://www.opengis.net/wms}ContactPerson"/>
 *         &lt;element ref="{http://www.opengis.net/wms}ContactOrganization"/>
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
    "contactPerson",
    "contactOrganization"
})
@XmlRootElement(name = "ContactPersonPrimary")
public class ContactPersonPrimary {

    @XmlElement(name = "ContactPerson", required = true)
    protected String contactPerson;
    @XmlElement(name = "ContactOrganization", required = true)
    protected String contactOrganization;

    /**
     * Obtient la valeur de la propriété contactPerson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Définit la valeur de la propriété contactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    public boolean isSetContactPerson() {
        return (this.contactPerson!= null);
    }

    /**
     * Obtient la valeur de la propriété contactOrganization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactOrganization() {
        return contactOrganization;
    }

    /**
     * Définit la valeur de la propriété contactOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactOrganization(String value) {
        this.contactOrganization = value;
    }

    public boolean isSetContactOrganization() {
        return (this.contactOrganization!= null);
    }

}

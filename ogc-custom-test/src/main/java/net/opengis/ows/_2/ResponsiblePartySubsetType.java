//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * For OWS use in the ServiceProvider section of a service
 *       metadata document, the optional organizationName element was removed,
 *       since this type is always used with the ProviderName element which
 *       provides that information. The mandatory "role" element was changed to
 *       optional, since no clear use of this information is known in the
 *       ServiceProvider section.
 * 
 * <p>Classe Java pour ResponsiblePartySubsetType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ResponsiblePartySubsetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}IndividualName" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}PositionName" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}ContactInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Role" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiblePartySubsetType", propOrder = {
    "individualName",
    "positionName",
    "contactInfo",
    "role"
})
public class ResponsiblePartySubsetType {

    @XmlElement(name = "IndividualName")
    protected String individualName;
    @XmlElement(name = "PositionName")
    protected String positionName;
    @XmlElement(name = "ContactInfo")
    protected ContactType contactInfo;
    @XmlElement(name = "Role")
    protected CodeType role;

    /**
     * Obtient la valeur de la propriété individualName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualName() {
        return individualName;
    }

    /**
     * Définit la valeur de la propriété individualName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualName(String value) {
        this.individualName = value;
    }

    public boolean isSetIndividualName() {
        return (this.individualName!= null);
    }

    /**
     * Obtient la valeur de la propriété positionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * Définit la valeur de la propriété positionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionName(String value) {
        this.positionName = value;
    }

    public boolean isSetPositionName() {
        return (this.positionName!= null);
    }

    /**
     * Obtient la valeur de la propriété contactInfo.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContactInfo() {
        return contactInfo;
    }

    /**
     * Définit la valeur de la propriété contactInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContactInfo(ContactType value) {
        this.contactInfo = value;
    }

    public boolean isSetContactInfo() {
        return (this.contactInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété role.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRole() {
        return role;
    }

    /**
     * Définit la valeur de la propriété role.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRole(CodeType value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

}

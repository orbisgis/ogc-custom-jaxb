//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * For OWS use in the service metadata document, the optional hoursOfService and contactInstructions elements were retained, as possibly being useful in the ServiceProvider section. 
 * 
 * <p>Classe Java pour ContactType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Phone" type="{http://www.opengis.net/ows/1.1}TelephoneType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.opengis.net/ows/1.1}AddressType" minOccurs="0"/>
 *         &lt;element name="OnlineResource" type="{http://www.opengis.net/ows/1.1}OnlineResourceType" minOccurs="0"/>
 *         &lt;element name="HoursOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "phone",
    "address",
    "onlineResource",
    "hoursOfService",
    "contactInstructions"
})
public class ContactType {

    @XmlElement(name = "Phone")
    protected TelephoneType phone;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "OnlineResource")
    protected OnlineResourceType onlineResource;
    @XmlElement(name = "HoursOfService")
    protected String hoursOfService;
    @XmlElement(name = "ContactInstructions")
    protected String contactInstructions;

    /**
     * Obtient la valeur de la propriété phone.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneType }
     *     
     */
    public TelephoneType getPhone() {
        return phone;
    }

    /**
     * Définit la valeur de la propriété phone.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneType }
     *     
     */
    public void setPhone(TelephoneType value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * Obtient la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Définit la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Obtient la valeur de la propriété onlineResource.
     * 
     * @return
     *     possible object is
     *     {@link OnlineResourceType }
     *     
     */
    public OnlineResourceType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Définit la valeur de la propriété onlineResource.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineResourceType }
     *     
     */
    public void setOnlineResource(OnlineResourceType value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

    /**
     * Obtient la valeur de la propriété hoursOfService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfService() {
        return hoursOfService;
    }

    /**
     * Définit la valeur de la propriété hoursOfService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfService(String value) {
        this.hoursOfService = value;
    }

    public boolean isSetHoursOfService() {
        return (this.hoursOfService!= null);
    }

    /**
     * Obtient la valeur de la propriété contactInstructions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInstructions() {
        return contactInstructions;
    }

    /**
     * Définit la valeur de la propriété contactInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInstructions(String value) {
        this.contactInstructions = value;
    }

    public boolean isSetContactInstructions() {
        return (this.contactInstructions!= null);
    }

}

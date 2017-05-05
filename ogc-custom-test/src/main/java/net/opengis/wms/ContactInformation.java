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
 *         &lt;element ref="{http://www.opengis.net/wms}ContactPersonPrimary" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}ContactPosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}ContactAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}ContactVoiceTelephone" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}ContactFacsimileTelephone" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}ContactElectronicMailAddress" minOccurs="0"/>
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
    "contactPersonPrimary",
    "contactPosition",
    "contactAddress",
    "contactVoiceTelephone",
    "contactFacsimileTelephone",
    "contactElectronicMailAddress"
})
@XmlRootElement(name = "ContactInformation")
public class ContactInformation {

    @XmlElement(name = "ContactPersonPrimary")
    protected ContactPersonPrimary contactPersonPrimary;
    @XmlElement(name = "ContactPosition")
    protected String contactPosition;
    @XmlElement(name = "ContactAddress")
    protected ContactAddress contactAddress;
    @XmlElement(name = "ContactVoiceTelephone")
    protected String contactVoiceTelephone;
    @XmlElement(name = "ContactFacsimileTelephone")
    protected String contactFacsimileTelephone;
    @XmlElement(name = "ContactElectronicMailAddress")
    protected String contactElectronicMailAddress;

    /**
     * Obtient la valeur de la propriété contactPersonPrimary.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonPrimary }
     *     
     */
    public ContactPersonPrimary getContactPersonPrimary() {
        return contactPersonPrimary;
    }

    /**
     * Définit la valeur de la propriété contactPersonPrimary.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonPrimary }
     *     
     */
    public void setContactPersonPrimary(ContactPersonPrimary value) {
        this.contactPersonPrimary = value;
    }

    public boolean isSetContactPersonPrimary() {
        return (this.contactPersonPrimary!= null);
    }

    /**
     * Obtient la valeur de la propriété contactPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPosition() {
        return contactPosition;
    }

    /**
     * Définit la valeur de la propriété contactPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPosition(String value) {
        this.contactPosition = value;
    }

    public boolean isSetContactPosition() {
        return (this.contactPosition!= null);
    }

    /**
     * Obtient la valeur de la propriété contactAddress.
     * 
     * @return
     *     possible object is
     *     {@link ContactAddress }
     *     
     */
    public ContactAddress getContactAddress() {
        return contactAddress;
    }

    /**
     * Définit la valeur de la propriété contactAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAddress }
     *     
     */
    public void setContactAddress(ContactAddress value) {
        this.contactAddress = value;
    }

    public boolean isSetContactAddress() {
        return (this.contactAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété contactVoiceTelephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactVoiceTelephone() {
        return contactVoiceTelephone;
    }

    /**
     * Définit la valeur de la propriété contactVoiceTelephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactVoiceTelephone(String value) {
        this.contactVoiceTelephone = value;
    }

    public boolean isSetContactVoiceTelephone() {
        return (this.contactVoiceTelephone!= null);
    }

    /**
     * Obtient la valeur de la propriété contactFacsimileTelephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFacsimileTelephone() {
        return contactFacsimileTelephone;
    }

    /**
     * Définit la valeur de la propriété contactFacsimileTelephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFacsimileTelephone(String value) {
        this.contactFacsimileTelephone = value;
    }

    public boolean isSetContactFacsimileTelephone() {
        return (this.contactFacsimileTelephone!= null);
    }

    /**
     * Obtient la valeur de la propriété contactElectronicMailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactElectronicMailAddress() {
        return contactElectronicMailAddress;
    }

    /**
     * Définit la valeur de la propriété contactElectronicMailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactElectronicMailAddress(String value) {
        this.contactElectronicMailAddress = value;
    }

    public boolean isSetContactElectronicMailAddress() {
        return (this.contactElectronicMailAddress!= null);
    }

}

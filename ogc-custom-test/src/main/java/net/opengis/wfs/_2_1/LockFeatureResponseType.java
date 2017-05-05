//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LockFeatureResponseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LockFeatureResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeaturesLocked" type="{http://www.opengis.net/wfs/2.1}FeaturesLockedType" minOccurs="0"/>
 *         &lt;element name="FeaturesNotLocked" type="{http://www.opengis.net/wfs/2.1}FeaturesNotLockedType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lockId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockFeatureResponseType", propOrder = {
    "featuresLocked",
    "featuresNotLocked"
})
public class LockFeatureResponseType {

    @XmlElement(name = "FeaturesLocked")
    protected FeaturesLockedType featuresLocked;
    @XmlElement(name = "FeaturesNotLocked")
    protected FeaturesNotLockedType featuresNotLocked;
    @XmlAttribute(name = "lockId")
    protected String lockId;

    /**
     * Obtient la valeur de la propriété featuresLocked.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesLockedType }
     *     
     */
    public FeaturesLockedType getFeaturesLocked() {
        return featuresLocked;
    }

    /**
     * Définit la valeur de la propriété featuresLocked.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesLockedType }
     *     
     */
    public void setFeaturesLocked(FeaturesLockedType value) {
        this.featuresLocked = value;
    }

    public boolean isSetFeaturesLocked() {
        return (this.featuresLocked!= null);
    }

    /**
     * Obtient la valeur de la propriété featuresNotLocked.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesNotLockedType }
     *     
     */
    public FeaturesNotLockedType getFeaturesNotLocked() {
        return featuresNotLocked;
    }

    /**
     * Définit la valeur de la propriété featuresNotLocked.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesNotLockedType }
     *     
     */
    public void setFeaturesNotLocked(FeaturesNotLockedType value) {
        this.featuresNotLocked = value;
    }

    public boolean isSetFeaturesNotLocked() {
        return (this.featuresNotLocked!= null);
    }

    /**
     * Obtient la valeur de la propriété lockId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * Définit la valeur de la propriété lockId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockId(String value) {
        this.lockId = value;
    }

    public boolean isSetLockId() {
        return (this.lockId!= null);
    }

}

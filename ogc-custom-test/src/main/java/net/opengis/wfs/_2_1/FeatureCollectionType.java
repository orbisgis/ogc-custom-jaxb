//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour FeatureCollectionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FeatureCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wfs/2.1}SimpleFeatureCollectionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.1}additionalObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.1}truncatedResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/wfs/2.1}StandardResponseParameters"/>
 *       &lt;attribute name="lockId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureCollectionType", propOrder = {
    "additionalObjects",
    "truncatedResponse"
})
public class FeatureCollectionType
    extends SimpleFeatureCollectionType
{

    protected AdditionalObjects additionalObjects;
    protected TruncatedResponse truncatedResponse;
    @XmlAttribute(name = "lockId")
    protected String lockId;
    @XmlAttribute(name = "timeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "numberMatched", required = true)
    protected String numberMatched;
    @XmlAttribute(name = "numberReturned", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberReturned;
    @XmlAttribute(name = "next")
    @XmlSchemaType(name = "anyURI")
    protected String next;
    @XmlAttribute(name = "previous")
    @XmlSchemaType(name = "anyURI")
    protected String previous;

    /**
     * Obtient la valeur de la propriété additionalObjects.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalObjects }
     *     
     */
    public AdditionalObjects getAdditionalObjects() {
        return additionalObjects;
    }

    /**
     * Définit la valeur de la propriété additionalObjects.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalObjects }
     *     
     */
    public void setAdditionalObjects(AdditionalObjects value) {
        this.additionalObjects = value;
    }

    public boolean isSetAdditionalObjects() {
        return (this.additionalObjects!= null);
    }

    /**
     * Obtient la valeur de la propriété truncatedResponse.
     * 
     * @return
     *     possible object is
     *     {@link TruncatedResponse }
     *     
     */
    public TruncatedResponse getTruncatedResponse() {
        return truncatedResponse;
    }

    /**
     * Définit la valeur de la propriété truncatedResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TruncatedResponse }
     *     
     */
    public void setTruncatedResponse(TruncatedResponse value) {
        this.truncatedResponse = value;
    }

    public boolean isSetTruncatedResponse() {
        return (this.truncatedResponse!= null);
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

    /**
     * Obtient la valeur de la propriété timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Définit la valeur de la propriété timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    public boolean isSetTimeStamp() {
        return (this.timeStamp!= null);
    }

    /**
     * Obtient la valeur de la propriété numberMatched.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberMatched() {
        return numberMatched;
    }

    /**
     * Définit la valeur de la propriété numberMatched.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberMatched(String value) {
        this.numberMatched = value;
    }

    public boolean isSetNumberMatched() {
        return (this.numberMatched!= null);
    }

    /**
     * Obtient la valeur de la propriété numberReturned.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberReturned() {
        return numberReturned;
    }

    /**
     * Définit la valeur de la propriété numberReturned.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberReturned(BigInteger value) {
        this.numberReturned = value;
    }

    public boolean isSetNumberReturned() {
        return (this.numberReturned!= null);
    }

    /**
     * Obtient la valeur de la propriété next.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNext() {
        return next;
    }

    /**
     * Définit la valeur de la propriété next.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNext(String value) {
        this.next = value;
    }

    public boolean isSetNext() {
        return (this.next!= null);
    }

    /**
     * Obtient la valeur de la propriété previous.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevious() {
        return previous;
    }

    /**
     * Définit la valeur de la propriété previous.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevious(String value) {
        this.previous = value;
    }

    public boolean isSetPrevious() {
        return (this.previous!= null);
    }

}

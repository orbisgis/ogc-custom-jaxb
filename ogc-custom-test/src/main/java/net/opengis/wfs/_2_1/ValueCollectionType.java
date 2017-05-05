//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ValueCollectionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ValueCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.1}member" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.1}additionalValues" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.1}truncatedResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/wfs/2.1}StandardResponseParameters"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueCollectionType", propOrder = {
    "member",
    "additionalValues",
    "truncatedResponse"
})
public class ValueCollectionType {

    protected List<MemberPropertyType> member;
    protected AdditionalValues additionalValues;
    protected TruncatedResponse truncatedResponse;
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
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberPropertyType }
     * 
     * 
     */
    public List<MemberPropertyType> getMember() {
        if (member == null) {
            member = new ArrayList<MemberPropertyType>();
        }
        return this.member;
    }

    public boolean isSetMember() {
        return ((this.member!= null)&&(!this.member.isEmpty()));
    }

    public void unsetMember() {
        this.member = null;
    }

    /**
     * Obtient la valeur de la propriété additionalValues.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalValues }
     *     
     */
    public AdditionalValues getAdditionalValues() {
        return additionalValues;
    }

    /**
     * Définit la valeur de la propriété additionalValues.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalValues }
     *     
     */
    public void setAdditionalValues(AdditionalValues value) {
        this.additionalValues = value;
    }

    public boolean isSetAdditionalValues() {
        return (this.additionalValues!= null);
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

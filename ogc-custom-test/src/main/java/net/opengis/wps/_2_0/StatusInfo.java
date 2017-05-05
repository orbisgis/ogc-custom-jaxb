//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wps._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.opengis.net/wps/2.0}JobID"/>
 *         &lt;element name="Status">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="Succeeded"/>
 *                   &lt;enumeration value="Failed"/>
 *                   &lt;enumeration value="Accepted"/>
 *                   &lt;enumeration value="Running"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opengis.net/wps/2.0}ExpirationDate" minOccurs="0"/>
 *         &lt;element name="EstimatedCompletion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NextPoll" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PercentCompleted" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "jobID",
    "status",
    "expirationDate",
    "estimatedCompletion",
    "nextPoll",
    "percentCompleted"
})
@XmlRootElement(name = "StatusInfo")
public class StatusInfo {

    @XmlElement(name = "JobID", required = true)
    protected String jobID;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "EstimatedCompletion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedCompletion;
    @XmlElement(name = "NextPoll")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPoll;
    @XmlElement(name = "PercentCompleted")
    protected Integer percentCompleted;

    /**
     * Obtient la valeur de la propriété jobID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Définit la valeur de la propriété jobID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    public boolean isSetJobID() {
        return (this.jobID!= null);
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Obtient la valeur de la propriété expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Définit la valeur de la propriété expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    public boolean isSetExpirationDate() {
        return (this.expirationDate!= null);
    }

    /**
     * Obtient la valeur de la propriété estimatedCompletion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedCompletion() {
        return estimatedCompletion;
    }

    /**
     * Définit la valeur de la propriété estimatedCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedCompletion(XMLGregorianCalendar value) {
        this.estimatedCompletion = value;
    }

    public boolean isSetEstimatedCompletion() {
        return (this.estimatedCompletion!= null);
    }

    /**
     * Obtient la valeur de la propriété nextPoll.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPoll() {
        return nextPoll;
    }

    /**
     * Définit la valeur de la propriété nextPoll.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPoll(XMLGregorianCalendar value) {
        this.nextPoll = value;
    }

    public boolean isSetNextPoll() {
        return (this.nextPoll!= null);
    }

    /**
     * Obtient la valeur de la propriété percentCompleted.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentCompleted() {
        return percentCompleted;
    }

    /**
     * Définit la valeur de la propriété percentCompleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentCompleted(Integer value) {
        this.percentCompleted = value;
    }

    public boolean isSetPercentCompleted() {
        return (this.percentCompleted!= null);
    }

}

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
 * <p>Classe Java pour TransactionResponseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransactionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionSummary" type="{http://www.opengis.net/wfs/2.1}TransactionSummaryType"/>
 *         &lt;element name="InsertResults" type="{http://www.opengis.net/wfs/2.1}ActionResultsType" minOccurs="0"/>
 *         &lt;element name="UpdateResults" type="{http://www.opengis.net/wfs/2.1}ActionResultsType" minOccurs="0"/>
 *         &lt;element name="ReplaceResults" type="{http://www.opengis.net/wfs/2.1}ActionResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResponseType", propOrder = {
    "transactionSummary",
    "insertResults",
    "updateResults",
    "replaceResults"
})
public class TransactionResponseType {

    @XmlElement(name = "TransactionSummary", required = true)
    protected TransactionSummaryType transactionSummary;
    @XmlElement(name = "InsertResults")
    protected ActionResultsType insertResults;
    @XmlElement(name = "UpdateResults")
    protected ActionResultsType updateResults;
    @XmlElement(name = "ReplaceResults")
    protected ActionResultsType replaceResults;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "version", required = true)
    public final static String VERSION = "2.0.0";

    /**
     * Obtient la valeur de la propriété transactionSummary.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSummaryType }
     *     
     */
    public TransactionSummaryType getTransactionSummary() {
        return transactionSummary;
    }

    /**
     * Définit la valeur de la propriété transactionSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSummaryType }
     *     
     */
    public void setTransactionSummary(TransactionSummaryType value) {
        this.transactionSummary = value;
    }

    public boolean isSetTransactionSummary() {
        return (this.transactionSummary!= null);
    }

    /**
     * Obtient la valeur de la propriété insertResults.
     * 
     * @return
     *     possible object is
     *     {@link ActionResultsType }
     *     
     */
    public ActionResultsType getInsertResults() {
        return insertResults;
    }

    /**
     * Définit la valeur de la propriété insertResults.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResultsType }
     *     
     */
    public void setInsertResults(ActionResultsType value) {
        this.insertResults = value;
    }

    public boolean isSetInsertResults() {
        return (this.insertResults!= null);
    }

    /**
     * Obtient la valeur de la propriété updateResults.
     * 
     * @return
     *     possible object is
     *     {@link ActionResultsType }
     *     
     */
    public ActionResultsType getUpdateResults() {
        return updateResults;
    }

    /**
     * Définit la valeur de la propriété updateResults.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResultsType }
     *     
     */
    public void setUpdateResults(ActionResultsType value) {
        this.updateResults = value;
    }

    public boolean isSetUpdateResults() {
        return (this.updateResults!= null);
    }

    /**
     * Obtient la valeur de la propriété replaceResults.
     * 
     * @return
     *     possible object is
     *     {@link ActionResultsType }
     *     
     */
    public ActionResultsType getReplaceResults() {
        return replaceResults;
    }

    /**
     * Définit la valeur de la propriété replaceResults.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResultsType }
     *     
     */
    public void setReplaceResults(ActionResultsType value) {
        this.replaceResults = value;
    }

    public boolean isSetReplaceResults() {
        return (this.replaceResults!= null);
    }

}

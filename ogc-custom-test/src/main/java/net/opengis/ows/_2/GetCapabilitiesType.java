//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * XML encoded GetCapabilities operation request. This
 *       operation allows clients to retrieve service metadata about a specific
 *       service instance. In this XML encoding, no "request" parameter is
 *       included, since the element name specifies the specific operation. This
 *       base type shall be extended by each specific OWS to include the
 *       additional required "service" attribute, with the correct value for that
 *       OWS.
 * 
 * <p>Classe Java pour GetCapabilitiesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetCapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptVersions" type="{http://www.opengis.net/ows/2.0}AcceptVersionsType" minOccurs="0"/>
 *         &lt;element name="Sections" type="{http://www.opengis.net/ows/2.0}SectionsType" minOccurs="0"/>
 *         &lt;element name="AcceptFormats" type="{http://www.opengis.net/ows/2.0}AcceptFormatsType" minOccurs="0"/>
 *         &lt;element name="AcceptLanguages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opengis.net/ows/2.0}Language" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="updateSequence" type="{http://www.opengis.net/ows/2.0}UpdateSequenceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCapabilitiesType", propOrder = {
    "acceptVersions",
    "sections",
    "acceptFormats",
    "acceptLanguages"
})
@XmlSeeAlso({
    net.opengis.wps._2_0.GetCapabilitiesType.class,
    net.opengis.wfs._2_1.GetCapabilitiesType.class
})
public class GetCapabilitiesType {

    @XmlElement(name = "AcceptVersions")
    protected AcceptVersionsType acceptVersions;
    @XmlElement(name = "Sections")
    protected SectionsType sections;
    @XmlElement(name = "AcceptFormats")
    protected AcceptFormatsType acceptFormats;
    @XmlElement(name = "AcceptLanguages")
    protected GetCapabilitiesType.AcceptLanguages acceptLanguages;
    @XmlAttribute(name = "updateSequence")
    protected String updateSequence;

    /**
     * Obtient la valeur de la propriété acceptVersions.
     * 
     * @return
     *     possible object is
     *     {@link AcceptVersionsType }
     *     
     */
    public AcceptVersionsType getAcceptVersions() {
        return acceptVersions;
    }

    /**
     * Définit la valeur de la propriété acceptVersions.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptVersionsType }
     *     
     */
    public void setAcceptVersions(AcceptVersionsType value) {
        this.acceptVersions = value;
    }

    public boolean isSetAcceptVersions() {
        return (this.acceptVersions!= null);
    }

    /**
     * Obtient la valeur de la propriété sections.
     * 
     * @return
     *     possible object is
     *     {@link SectionsType }
     *     
     */
    public SectionsType getSections() {
        return sections;
    }

    /**
     * Définit la valeur de la propriété sections.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionsType }
     *     
     */
    public void setSections(SectionsType value) {
        this.sections = value;
    }

    public boolean isSetSections() {
        return (this.sections!= null);
    }

    /**
     * Obtient la valeur de la propriété acceptFormats.
     * 
     * @return
     *     possible object is
     *     {@link AcceptFormatsType }
     *     
     */
    public AcceptFormatsType getAcceptFormats() {
        return acceptFormats;
    }

    /**
     * Définit la valeur de la propriété acceptFormats.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptFormatsType }
     *     
     */
    public void setAcceptFormats(AcceptFormatsType value) {
        this.acceptFormats = value;
    }

    public boolean isSetAcceptFormats() {
        return (this.acceptFormats!= null);
    }

    /**
     * Obtient la valeur de la propriété acceptLanguages.
     * 
     * @return
     *     possible object is
     *     {@link GetCapabilitiesType.AcceptLanguages }
     *     
     */
    public GetCapabilitiesType.AcceptLanguages getAcceptLanguages() {
        return acceptLanguages;
    }

    /**
     * Définit la valeur de la propriété acceptLanguages.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCapabilitiesType.AcceptLanguages }
     *     
     */
    public void setAcceptLanguages(GetCapabilitiesType.AcceptLanguages value) {
        this.acceptLanguages = value;
    }

    public boolean isSetAcceptLanguages() {
        return (this.acceptLanguages!= null);
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
     *         &lt;element ref="{http://www.opengis.net/ows/2.0}Language" maxOccurs="unbounded"/>
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
        "language"
    })
    public static class AcceptLanguages {

        @XmlElement(name = "Language", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected List<String> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLanguage() {
            if (language == null) {
                language = new ArrayList<String>();
            }
            return this.language;
        }

        public boolean isSetLanguage() {
            return ((this.language!= null)&&(!this.language.isEmpty()));
        }

        public void unsetLanguage() {
            this.language = null;
        }

    }

}

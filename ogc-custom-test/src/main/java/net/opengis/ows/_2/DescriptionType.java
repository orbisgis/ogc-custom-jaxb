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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Human-readable descriptive information for the object it
 *       is included within. This type shall be extended if needed for specific
 *       OWS use to include additional metadata for each type of information.
 *       This type shall not be restricted for a specific OWS to change the
 *       multiplicity (or optionality) of some elements. If the xml:lang
 *       attribute is not included in a Title, Abstract or Keyword element, then
 *       no language is specified for that element unless specified by another
 *       means. All Title, Abstract and Keyword elements in the same Description
 *       that share the same xml:lang attribute value represent the description
 *       of the parent object in that language. Multiple Title or Abstract
 *       elements shall not exist in the same Description with the same xml:lang
 *       attribute value unless otherwise specified.
 * 
 * <p>Classe Java pour DescriptionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Title" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Abstract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Keywords" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionType", propOrder = {
    "title",
    "_abstract",
    "keywords"
})
@XmlSeeAlso({
    DatasetDescriptionSummaryBaseType.class,
    BasicIdentificationType.class,
    ServiceIdentification.class
})
public class DescriptionType {

    @XmlElement(name = "Title")
    protected List<LanguageStringType> title;
    @XmlElement(name = "Abstract")
    protected List<LanguageStringType> _abstract;
    @XmlElement(name = "Keywords")
    protected List<KeywordsType> keywords;

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageStringType }
     * 
     * 
     */
    public List<LanguageStringType> getTitle() {
        if (title == null) {
            title = new ArrayList<LanguageStringType>();
        }
        return this.title;
    }

    public boolean isSetTitle() {
        return ((this.title!= null)&&(!this.title.isEmpty()));
    }

    public void unsetTitle() {
        this.title = null;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageStringType }
     * 
     * 
     */
    public List<LanguageStringType> getAbstract() {
        if (_abstract == null) {
            _abstract = new ArrayList<LanguageStringType>();
        }
        return this._abstract;
    }

    public boolean isSetAbstract() {
        return ((this._abstract!= null)&&(!this._abstract.isEmpty()));
    }

    public void unsetAbstract() {
        this._abstract = null;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordsType }
     * 
     * 
     */
    public List<KeywordsType> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<KeywordsType>();
        }
        return this.keywords;
    }

    public boolean isSetKeywords() {
        return ((this.keywords!= null)&&(!this.keywords.isEmpty()));
    }

    public void unsetKeywords() {
        this.keywords = null;
    }

}

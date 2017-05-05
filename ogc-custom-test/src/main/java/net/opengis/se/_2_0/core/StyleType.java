//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import net.opengis.ows._2.DescriptionType;


/**
 * <p>Classe Java pour StyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}AbstractStyleType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}DataTypeName" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}SemanticTypeIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Rule" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.opengis.net/se/2.0/core}VersionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleType", propOrder = {
    "name",
    "description",
    "dataTypeName",
    "semanticTypeIdentifier",
    "rule"
})
public class StyleType
    extends AbstractStyleType
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "DataTypeName")
    protected QName dataTypeName;
    @XmlElement(name = "SemanticTypeIdentifier")
    protected List<String> semanticTypeIdentifier;
    @XmlElement(name = "Rule", required = true)
    protected List<RuleType> rule;
    @XmlAttribute(name = "version")
    protected VersionType version;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Obtient la valeur de la propriété dataTypeName.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getDataTypeName() {
        return dataTypeName;
    }

    /**
     * Définit la valeur de la propriété dataTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setDataTypeName(QName value) {
        this.dataTypeName = value;
    }

    public boolean isSetDataTypeName() {
        return (this.dataTypeName!= null);
    }

    /**
     * Gets the value of the semanticTypeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticTypeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticTypeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSemanticTypeIdentifier() {
        if (semanticTypeIdentifier == null) {
            semanticTypeIdentifier = new ArrayList<String>();
        }
        return this.semanticTypeIdentifier;
    }

    public boolean isSetSemanticTypeIdentifier() {
        return ((this.semanticTypeIdentifier!= null)&&(!this.semanticTypeIdentifier.isEmpty()));
    }

    public void unsetSemanticTypeIdentifier() {
        this.semanticTypeIdentifier = null;
    }

    /**
     * Gets the value of the rule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleType }
     * 
     * 
     */
    public List<RuleType> getRule() {
        if (rule == null) {
            rule = new ArrayList<RuleType>();
        }
        return this.rule;
    }

    public boolean isSetRule() {
        return ((this.rule!= null)&&(!this.rule.isEmpty()));
    }

    public void unsetRule() {
        this.rule = null;
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link VersionType }
     *     
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionType }
     *     
     */
    public void setVersion(VersionType value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}

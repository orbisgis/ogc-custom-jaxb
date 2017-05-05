//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OWSContextType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OWSContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="General" type="{http://www.opengis.net/ows-context}GeneralType"/>
 *         &lt;element ref="{http://www.opengis.net/ows-context}ResourceList"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="0.4.2" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OWSContextType", propOrder = {
    "general",
    "resourceList"
})
public class OWSContextType {

    @XmlElement(name = "General", required = true)
    protected GeneralType general;
    @XmlElement(name = "ResourceList", required = true)
    protected ResourceListType resourceList;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "version", required = true)
    public final static String VERSION = "0.4.2";
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Obtient la valeur de la propriété general.
     * 
     * @return
     *     possible object is
     *     {@link GeneralType }
     *     
     */
    public GeneralType getGeneral() {
        return general;
    }

    /**
     * Définit la valeur de la propriété general.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralType }
     *     
     */
    public void setGeneral(GeneralType value) {
        this.general = value;
    }

    public boolean isSetGeneral() {
        return (this.general!= null);
    }

    /**
     * Obtient la valeur de la propriété resourceList.
     * 
     * @return
     *     possible object is
     *     {@link ResourceListType }
     *     
     */
    public ResourceListType getResourceList() {
        return resourceList;
    }

    /**
     * Définit la valeur de la propriété resourceList.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceListType }
     *     
     */
    public void setResourceList(ResourceListType value) {
        this.resourceList = value;
    }

    public boolean isSetResourceList() {
        return (this.resourceList!= null);
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

}

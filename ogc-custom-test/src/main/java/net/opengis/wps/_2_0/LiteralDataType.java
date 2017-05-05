//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wps._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LiteralDataType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LiteralDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wps/2.0}DataDescriptionType">
 *       &lt;sequence>
 *         &lt;element name="LiteralDataDomain" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opengis.net/wps/2.0}LiteralDataDomainType">
 *                 &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiteralDataType", propOrder = {
    "literalDataDomain"
})
public class LiteralDataType
    extends DataDescriptionType
{

    @XmlElement(name = "LiteralDataDomain", namespace = "", required = true)
    protected List<LiteralDataType.LiteralDataDomain> literalDataDomain;

    /**
     * Gets the value of the literalDataDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the literalDataDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiteralDataDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiteralDataType.LiteralDataDomain }
     * 
     * 
     */
    public List<LiteralDataType.LiteralDataDomain> getLiteralDataDomain() {
        if (literalDataDomain == null) {
            literalDataDomain = new ArrayList<LiteralDataType.LiteralDataDomain>();
        }
        return this.literalDataDomain;
    }

    public boolean isSetLiteralDataDomain() {
        return ((this.literalDataDomain!= null)&&(!this.literalDataDomain.isEmpty()));
    }

    public void unsetLiteralDataDomain() {
        this.literalDataDomain = null;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opengis.net/wps/2.0}LiteralDataDomainType">
     *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LiteralDataDomain
        extends LiteralDataDomainType
    {

        @XmlAttribute(name = "default")
        protected Boolean _default;

        /**
         * Obtient la valeur de la propriété default.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isDefault() {
            return _default;
        }

        /**
         * Définit la valeur de la propriété default.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefault(boolean value) {
            this._default = value;
        }

        public boolean isSetDefault() {
            return (this._default!= null);
        }

        public void unsetDefault() {
            this._default = null;
        }

    }

}

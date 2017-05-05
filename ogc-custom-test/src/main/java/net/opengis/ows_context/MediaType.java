//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MediaType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MediaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows-context}AbstractResourceType">
 *       &lt;sequence>
 *         &lt;element name="InlineMedia" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="InlineText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageMedia" type="{http://www.opengis.net/ows-context}URLType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaType", propOrder = {
    "inlineMedia",
    "inlineText",
    "imageMedia"
})
public class MediaType
    extends AbstractResourceType
{

    @XmlElement(name = "InlineMedia")
    protected byte[] inlineMedia;
    @XmlElement(name = "InlineText")
    protected String inlineText;
    @XmlElement(name = "ImageMedia")
    protected URLType imageMedia;

    /**
     * Obtient la valeur de la propriété inlineMedia.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInlineMedia() {
        return inlineMedia;
    }

    /**
     * Définit la valeur de la propriété inlineMedia.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInlineMedia(byte[] value) {
        this.inlineMedia = value;
    }

    public boolean isSetInlineMedia() {
        return (this.inlineMedia!= null);
    }

    /**
     * Obtient la valeur de la propriété inlineText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineText() {
        return inlineText;
    }

    /**
     * Définit la valeur de la propriété inlineText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineText(String value) {
        this.inlineText = value;
    }

    public boolean isSetInlineText() {
        return (this.inlineText!= null);
    }

    /**
     * Obtient la valeur de la propriété imageMedia.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getImageMedia() {
        return imageMedia;
    }

    /**
     * Définit la valeur de la propriété imageMedia.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setImageMedia(URLType value) {
        this.imageMedia = value;
    }

    public boolean isSetImageMedia() {
        return (this.imageMedia!= null);
    }

}

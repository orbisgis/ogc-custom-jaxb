//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.opengis.net/wms}Get"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Post" minOccurs="0"/>
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
    "get",
    "post"
})
@XmlRootElement(name = "HTTP")
public class HTTP {

    @XmlElement(name = "Get", required = true)
    protected Get get;
    @XmlElement(name = "Post")
    protected Post post;

    /**
     * Obtient la valeur de la propriété get.
     * 
     * @return
     *     possible object is
     *     {@link Get }
     *     
     */
    public Get getGet() {
        return get;
    }

    /**
     * Définit la valeur de la propriété get.
     * 
     * @param value
     *     allowed object is
     *     {@link Get }
     *     
     */
    public void setGet(Get value) {
        this.get = value;
    }

    public boolean isSetGet() {
        return (this.get!= null);
    }

    /**
     * Obtient la valeur de la propriété post.
     * 
     * @return
     *     possible object is
     *     {@link Post }
     *     
     */
    public Post getPost() {
        return post;
    }

    /**
     * Définit la valeur de la propriété post.
     * 
     * @param value
     *     allowed object is
     *     {@link Post }
     *     
     */
    public void setPost(Post value) {
        this.post = value;
    }

    public boolean isSetPost() {
        return (this.post!= null);
    }

}

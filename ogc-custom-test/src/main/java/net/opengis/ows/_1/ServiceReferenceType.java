//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Complete reference to a remote resource that needs to be retrieved from an OWS using an XML-encoded operation request. This element shall be used, within an InputData or Manifest element that is used for input data, when that input data needs to be retrieved from another web service using a XML-encoded OWS operation request. This element shall not be used for local payload input data or for requesting the resource from a web server using HTTP Get. 
 * 
 * <p>Classe Java pour ServiceReferenceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows/1.1}ReferenceType">
 *       &lt;choice>
 *         &lt;element name="RequestMessage" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="RequestMessageReference" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceReferenceType", propOrder = {
    "requestMessage",
    "requestMessageReference"
})
public class ServiceReferenceType
    extends ReferenceType
{

    @XmlElement(name = "RequestMessage")
    protected Object requestMessage;
    @XmlElement(name = "RequestMessageReference")
    @XmlSchemaType(name = "anyURI")
    protected String requestMessageReference;

    /**
     * Obtient la valeur de la propriété requestMessage.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRequestMessage() {
        return requestMessage;
    }

    /**
     * Définit la valeur de la propriété requestMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRequestMessage(Object value) {
        this.requestMessage = value;
    }

    public boolean isSetRequestMessage() {
        return (this.requestMessage!= null);
    }

    /**
     * Obtient la valeur de la propriété requestMessageReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestMessageReference() {
        return requestMessageReference;
    }

    /**
     * Définit la valeur de la propriété requestMessageReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestMessageReference(String value) {
        this.requestMessageReference = value;
    }

    public boolean isSetRequestMessageReference() {
        return (this.requestMessageReference!= null);
    }

}

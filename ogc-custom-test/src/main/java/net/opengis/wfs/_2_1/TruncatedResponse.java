//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.ows._2.ExceptionReport;


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
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}ExceptionReport"/>
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
    "exceptionReport"
})
@XmlRootElement(name = "truncatedResponse")
public class TruncatedResponse {

    @XmlElement(name = "ExceptionReport", namespace = "http://www.opengis.net/ows/2.0", required = true)
    protected ExceptionReport exceptionReport;

    /**
     * Obtient la valeur de la propriété exceptionReport.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionReport }
     *     
     */
    public ExceptionReport getExceptionReport() {
        return exceptionReport;
    }

    /**
     * Définit la valeur de la propriété exceptionReport.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionReport }
     *     
     */
    public void setExceptionReport(ExceptionReport value) {
        this.exceptionReport = value;
    }

    public boolean isSetExceptionReport() {
        return (this.exceptionReport!= null);
    }

}

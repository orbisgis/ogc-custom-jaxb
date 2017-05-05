//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An engineering coordinate reference system applied to locations in images. Image coordinate reference systems are treated as a separate sub-type because a separate user community exists for images with its own terms of reference. 
 * 
 * <p>Classe Java pour ImageCRSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ImageCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}usesCartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml}usesObliqueCartesianCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}usesImageDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageCRSType", propOrder = {
    "usesCartesianCS",
    "usesObliqueCartesianCS",
    "usesImageDatum"
})
public class ImageCRSType
    extends AbstractReferenceSystemType
{

    protected CartesianCSRefType usesCartesianCS;
    protected ObliqueCartesianCSRefType usesObliqueCartesianCS;
    @XmlElement(required = true)
    protected ImageDatumRefType usesImageDatum;

    /**
     * Obtient la valeur de la propriété usesCartesianCS.
     * 
     * @return
     *     possible object is
     *     {@link CartesianCSRefType }
     *     
     */
    public CartesianCSRefType getUsesCartesianCS() {
        return usesCartesianCS;
    }

    /**
     * Définit la valeur de la propriété usesCartesianCS.
     * 
     * @param value
     *     allowed object is
     *     {@link CartesianCSRefType }
     *     
     */
    public void setUsesCartesianCS(CartesianCSRefType value) {
        this.usesCartesianCS = value;
    }

    public boolean isSetUsesCartesianCS() {
        return (this.usesCartesianCS!= null);
    }

    /**
     * Obtient la valeur de la propriété usesObliqueCartesianCS.
     * 
     * @return
     *     possible object is
     *     {@link ObliqueCartesianCSRefType }
     *     
     */
    public ObliqueCartesianCSRefType getUsesObliqueCartesianCS() {
        return usesObliqueCartesianCS;
    }

    /**
     * Définit la valeur de la propriété usesObliqueCartesianCS.
     * 
     * @param value
     *     allowed object is
     *     {@link ObliqueCartesianCSRefType }
     *     
     */
    public void setUsesObliqueCartesianCS(ObliqueCartesianCSRefType value) {
        this.usesObliqueCartesianCS = value;
    }

    public boolean isSetUsesObliqueCartesianCS() {
        return (this.usesObliqueCartesianCS!= null);
    }

    /**
     * Obtient la valeur de la propriété usesImageDatum.
     * 
     * @return
     *     possible object is
     *     {@link ImageDatumRefType }
     *     
     */
    public ImageDatumRefType getUsesImageDatum() {
        return usesImageDatum;
    }

    /**
     * Définit la valeur de la propriété usesImageDatum.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDatumRefType }
     *     
     */
    public void setUsesImageDatum(ImageDatumRefType value) {
        this.usesImageDatum = value;
    }

    public boolean isSetUsesImageDatum() {
        return (this.usesImageDatum!= null);
    }

}

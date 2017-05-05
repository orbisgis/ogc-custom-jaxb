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
 * An image datum defines the origin of an image coordinate reference system, and is used in a local context only. For more information, see OGC Abstract Specification Topic 2. 
 * 
 * <p>Classe Java pour ImageDatumType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ImageDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}pixelInCell"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDatumType", propOrder = {
    "pixelInCell"
})
public class ImageDatumType
    extends AbstractDatumType
{

    @XmlElement(required = true)
    protected PixelInCellType pixelInCell;

    /**
     * Obtient la valeur de la propriété pixelInCell.
     * 
     * @return
     *     possible object is
     *     {@link PixelInCellType }
     *     
     */
    public PixelInCellType getPixelInCell() {
        return pixelInCell;
    }

    /**
     * Définit la valeur de la propriété pixelInCell.
     * 
     * @param value
     *     allowed object is
     *     {@link PixelInCellType }
     *     
     */
    public void setPixelInCell(PixelInCellType value) {
        this.pixelInCell = value;
    }

    public boolean isSetPixelInCell() {
        return (this.pixelInCell!= null);
    }

}

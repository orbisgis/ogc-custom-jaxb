//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.sld._1_2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OutputType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OutputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Size">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="PixelSize" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opengis.net/wms}Format"/>
 *         &lt;element name="Transparent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BGcolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputType", propOrder = {
    "size",
    "format",
    "transparent",
    "bGcolor"
})
public class OutputType {

    @XmlElement(name = "Size", required = true)
    protected OutputType.Size size;
    @XmlElement(name = "Format", namespace = "http://www.opengis.net/wms", required = true)
    protected String format;
    @XmlElement(name = "Transparent")
    protected Boolean transparent;
    @XmlElement(name = "BGcolor")
    protected String bGcolor;

    /**
     * Obtient la valeur de la propriété size.
     * 
     * @return
     *     possible object is
     *     {@link OutputType.Size }
     *     
     */
    public OutputType.Size getSize() {
        return size;
    }

    /**
     * Définit la valeur de la propriété size.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputType.Size }
     *     
     */
    public void setSize(OutputType.Size value) {
        this.size = value;
    }

    public boolean isSetSize() {
        return (this.size!= null);
    }

    /**
     * Obtient la valeur de la propriété format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Définit la valeur de la propriété format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    public boolean isSetFormat() {
        return (this.format!= null);
    }

    /**
     * Obtient la valeur de la propriété transparent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransparent() {
        return transparent;
    }

    /**
     * Définit la valeur de la propriété transparent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransparent(Boolean value) {
        this.transparent = value;
    }

    public boolean isSetTransparent() {
        return (this.transparent!= null);
    }

    /**
     * Obtient la valeur de la propriété bGcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBGcolor() {
        return bGcolor;
    }

    /**
     * Définit la valeur de la propriété bGcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBGcolor(String value) {
        this.bGcolor = value;
    }

    public boolean isSetBGcolor() {
        return (this.bGcolor!= null);
    }


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
     *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="PixelSize" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "width",
        "height",
        "pixelSize"
    })
    public static class Size {

        @XmlElement(name = "Width", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger width;
        @XmlElement(name = "Height", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger height;
        @XmlElement(name = "PixelSize")
        protected Double pixelSize;

        /**
         * Obtient la valeur de la propriété width.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWidth() {
            return width;
        }

        /**
         * Définit la valeur de la propriété width.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWidth(BigInteger value) {
            this.width = value;
        }

        public boolean isSetWidth() {
            return (this.width!= null);
        }

        /**
         * Obtient la valeur de la propriété height.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHeight() {
            return height;
        }

        /**
         * Définit la valeur de la propriété height.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHeight(BigInteger value) {
            this.height = value;
        }

        public boolean isSetHeight() {
            return (this.height!= null);
        }

        /**
         * Obtient la valeur de la propriété pixelSize.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getPixelSize() {
            return pixelSize;
        }

        /**
         * Définit la valeur de la propriété pixelSize.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setPixelSize(Double value) {
            this.pixelSize = value;
        }

        public boolean isSetPixelSize() {
            return (this.pixelSize!= null);
        }

    }

}

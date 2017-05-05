//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.sld._1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.ows._2.BoundingBoxType;


/**
 * <p>Classe Java pour GetMapType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/sld/1.2}StyledLayerDescriptor"/>
 *         &lt;element name="CRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BoundingBox" type="{http://www.opengis.net/ows/2.0}BoundingBoxType"/>
 *         &lt;element name="Output" type="{http://www.opengis.net/sld/1.2}OutputType"/>
 *         &lt;element name="Exceptions" type="{http://www.opengis.net/sld/1.2}ExceptionsType" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Elevation" type="{http://www.opengis.net/sld/1.2}ElevationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.3.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMapType", propOrder = {
    "styledLayerDescriptor",
    "crs",
    "boundingBox",
    "output",
    "exceptions",
    "time",
    "elevation"
})
public class GetMapType {

    @XmlElement(name = "StyledLayerDescriptor", required = true)
    protected StyledLayerDescriptorElement styledLayerDescriptor;
    @XmlElement(name = "CRS", required = true)
    protected String crs;
    @XmlElement(name = "BoundingBox", required = true)
    protected BoundingBoxType boundingBox;
    @XmlElement(name = "Output", required = true)
    protected OutputType output;
    @XmlElement(name = "Exceptions")
    protected ExceptionsType exceptions;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Elevation")
    protected ElevationType elevation;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "version")
    public final static String VERSION = "1.3.0";

    /**
     * Obtient la valeur de la propriété styledLayerDescriptor.
     * 
     * @return
     *     possible object is
     *     {@link StyledLayerDescriptorElement }
     *     
     */
    public StyledLayerDescriptorElement getStyledLayerDescriptor() {
        return styledLayerDescriptor;
    }

    /**
     * Définit la valeur de la propriété styledLayerDescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link StyledLayerDescriptorElement }
     *     
     */
    public void setStyledLayerDescriptor(StyledLayerDescriptorElement value) {
        this.styledLayerDescriptor = value;
    }

    public boolean isSetStyledLayerDescriptor() {
        return (this.styledLayerDescriptor!= null);
    }

    /**
     * Obtient la valeur de la propriété crs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRS() {
        return crs;
    }

    /**
     * Définit la valeur de la propriété crs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRS(String value) {
        this.crs = value;
    }

    public boolean isSetCRS() {
        return (this.crs!= null);
    }

    /**
     * Obtient la valeur de la propriété boundingBox.
     * 
     * @return
     *     possible object is
     *     {@link BoundingBoxType }
     *     
     */
    public BoundingBoxType getBoundingBox() {
        return boundingBox;
    }

    /**
     * Définit la valeur de la propriété boundingBox.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingBoxType }
     *     
     */
    public void setBoundingBox(BoundingBoxType value) {
        this.boundingBox = value;
    }

    public boolean isSetBoundingBox() {
        return (this.boundingBox!= null);
    }

    /**
     * Obtient la valeur de la propriété output.
     * 
     * @return
     *     possible object is
     *     {@link OutputType }
     *     
     */
    public OutputType getOutput() {
        return output;
    }

    /**
     * Définit la valeur de la propriété output.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputType }
     *     
     */
    public void setOutput(OutputType value) {
        this.output = value;
    }

    public boolean isSetOutput() {
        return (this.output!= null);
    }

    /**
     * Obtient la valeur de la propriété exceptions.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionsType }
     *     
     */
    public ExceptionsType getExceptions() {
        return exceptions;
    }

    /**
     * Définit la valeur de la propriété exceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionsType }
     *     
     */
    public void setExceptions(ExceptionsType value) {
        this.exceptions = value;
    }

    public boolean isSetExceptions() {
        return (this.exceptions!= null);
    }

    /**
     * Obtient la valeur de la propriété time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Définit la valeur de la propriété time.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    public boolean isSetTime() {
        return (this.time!= null);
    }

    /**
     * Obtient la valeur de la propriété elevation.
     * 
     * @return
     *     possible object is
     *     {@link ElevationType }
     *     
     */
    public ElevationType getElevation() {
        return elevation;
    }

    /**
     * Définit la valeur de la propriété elevation.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevationType }
     *     
     */
    public void setElevation(ElevationType value) {
        this.elevation = value;
    }

    public boolean isSetElevation() {
        return (this.elevation!= null);
    }

}

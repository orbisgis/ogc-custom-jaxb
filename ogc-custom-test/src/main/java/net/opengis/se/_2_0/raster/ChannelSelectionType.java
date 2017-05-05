//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.raster;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ChannelSelectionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ChannelSelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/raster}RedChannel"/>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/raster}GreenChannel"/>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/raster}BlueChannel"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/raster}GrayChannel"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelSelectionType", propOrder = {
    "redChannel",
    "greenChannel",
    "blueChannel",
    "grayChannel"
})
public class ChannelSelectionType {

    @XmlElement(name = "RedChannel")
    protected SelectedChannelType redChannel;
    @XmlElement(name = "GreenChannel")
    protected SelectedChannelType greenChannel;
    @XmlElement(name = "BlueChannel")
    protected SelectedChannelType blueChannel;
    @XmlElement(name = "GrayChannel")
    protected SelectedChannelType grayChannel;

    /**
     * Obtient la valeur de la propriété redChannel.
     * 
     * @return
     *     possible object is
     *     {@link SelectedChannelType }
     *     
     */
    public SelectedChannelType getRedChannel() {
        return redChannel;
    }

    /**
     * Définit la valeur de la propriété redChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedChannelType }
     *     
     */
    public void setRedChannel(SelectedChannelType value) {
        this.redChannel = value;
    }

    public boolean isSetRedChannel() {
        return (this.redChannel!= null);
    }

    /**
     * Obtient la valeur de la propriété greenChannel.
     * 
     * @return
     *     possible object is
     *     {@link SelectedChannelType }
     *     
     */
    public SelectedChannelType getGreenChannel() {
        return greenChannel;
    }

    /**
     * Définit la valeur de la propriété greenChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedChannelType }
     *     
     */
    public void setGreenChannel(SelectedChannelType value) {
        this.greenChannel = value;
    }

    public boolean isSetGreenChannel() {
        return (this.greenChannel!= null);
    }

    /**
     * Obtient la valeur de la propriété blueChannel.
     * 
     * @return
     *     possible object is
     *     {@link SelectedChannelType }
     *     
     */
    public SelectedChannelType getBlueChannel() {
        return blueChannel;
    }

    /**
     * Définit la valeur de la propriété blueChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedChannelType }
     *     
     */
    public void setBlueChannel(SelectedChannelType value) {
        this.blueChannel = value;
    }

    public boolean isSetBlueChannel() {
        return (this.blueChannel!= null);
    }

    /**
     * Obtient la valeur de la propriété grayChannel.
     * 
     * @return
     *     possible object is
     *     {@link SelectedChannelType }
     *     
     */
    public SelectedChannelType getGrayChannel() {
        return grayChannel;
    }

    /**
     * Définit la valeur de la propriété grayChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedChannelType }
     *     
     */
    public void setGrayChannel(SelectedChannelType value) {
        this.grayChannel = value;
    }

    public boolean isSetGrayChannel() {
        return (this.grayChannel!= null);
    }

}

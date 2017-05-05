//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.ows_context.AbstractResourceType;


/**
 * Extended metadata identifying and describing a set of
 *       data. This type shall be extended if needed for each specific OWS to
 *       include additional metadata for each type of dataset. If needed, this
 *       type should first be restricted for each specific OWS to change the
 *       multiplicity (or optionality) of some elements.
 * 
 * <p>Classe Java pour IdentificationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows/2.0}BasicIdentificationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}BoundingBox" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}OutputFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}AvailableCRS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationType", propOrder = {
    "boundingBox",
    "outputFormat",
    "availableCRS"
})
@XmlSeeAlso({
    AbstractResourceType.class
})
public class IdentificationType
    extends BasicIdentificationType
{

    @XmlElementRef(name = "BoundingBox", namespace = "http://www.opengis.net/ows/2.0", type = JAXBElement.class)
    protected List<JAXBElement<? extends BoundingBoxType>> boundingBox;
    @XmlElement(name = "OutputFormat")
    protected List<String> outputFormat;
    @XmlElementRef(name = "AvailableCRS", namespace = "http://www.opengis.net/ows/2.0", type = JAXBElement.class)
    protected List<JAXBElement<String>> availableCRS;

    /**
     * Unordered list of zero or more bounding boxes
     *               whose union describes the extent of this
     *               dataset.Gets the value of the boundingBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundingBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundingBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link WGS84BoundingBoxType }{@code >}
     * {@link JAXBElement }{@code <}{@link BoundingBoxType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BoundingBoxType>> getBoundingBox() {
        if (boundingBox == null) {
            boundingBox = new ArrayList<JAXBElement<? extends BoundingBoxType>>();
        }
        return this.boundingBox;
    }

    public boolean isSetBoundingBox() {
        return ((this.boundingBox!= null)&&(!this.boundingBox.isEmpty()));
    }

    public void unsetBoundingBox() {
        this.boundingBox = null;
    }

    /**
     * Unordered list of zero or more references to data
     *               formats supported for server outputs.Gets the value of the outputFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOutputFormat() {
        if (outputFormat == null) {
            outputFormat = new ArrayList<String>();
        }
        return this.outputFormat;
    }

    public boolean isSetOutputFormat() {
        return ((this.outputFormat!= null)&&(!this.outputFormat.isEmpty()));
    }

    public void unsetOutputFormat() {
        this.outputFormat = null;
    }

    /**
     * Unordered list of zero or more available
     *               coordinate reference systems.Gets the value of the availableCRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableCRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableCRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getAvailableCRS() {
        if (availableCRS == null) {
            availableCRS = new ArrayList<JAXBElement<String>>();
        }
        return this.availableCRS;
    }

    public boolean isSetAvailableCRS() {
        return ((this.availableCRS!= null)&&(!this.availableCRS.isEmpty()));
    }

    public void unsetAvailableCRS() {
        this.availableCRS = null;
    }

}

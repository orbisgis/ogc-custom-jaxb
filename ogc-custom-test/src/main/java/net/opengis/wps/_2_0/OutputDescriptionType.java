//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wps._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of a process Output. 
 * 
 * 
 * 						In this use, the DescriptionType shall describe a process output.
 * 					
 * 
 * <p>Classe Java pour OutputDescriptionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OutputDescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wps/2.0}DescriptionType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/wps/2.0}DataDescription"/>
 *         &lt;element name="Output" type="{http://www.opengis.net/wps/2.0}OutputDescriptionType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputDescriptionType", propOrder = {
    "dataDescription",
    "output"
})
public class OutputDescriptionType
    extends DescriptionType
{

    @XmlElementRef(name = "DataDescription", namespace = "http://www.opengis.net/wps/2.0", type = JAXBElement.class)
    protected JAXBElement<? extends DataDescriptionType> dataDescription;
    @XmlElement(name = "Output")
    protected List<OutputDescriptionType> output;

    /**
     * Obtient la valeur de la propriété dataDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComplexDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataDescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LiteralDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoundingBoxData }{@code >}
     *     
     */
    public JAXBElement<? extends DataDescriptionType> getDataDescription() {
        return dataDescription;
    }

    /**
     * Définit la valeur de la propriété dataDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComplexDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataDescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LiteralDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoundingBoxData }{@code >}
     *     
     */
    public void setDataDescription(JAXBElement<? extends DataDescriptionType> value) {
        this.dataDescription = value;
    }

    public boolean isSetDataDescription() {
        return (this.dataDescription!= null);
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputDescriptionType }
     * 
     * 
     */
    public List<OutputDescriptionType> getOutput() {
        if (output == null) {
            output = new ArrayList<OutputDescriptionType>();
        }
        return this.output;
    }

    public boolean isSetOutput() {
        return ((this.output!= null)&&(!this.output.isEmpty()));
    }

    public void unsetOutput() {
        this.output = null;
    }

}

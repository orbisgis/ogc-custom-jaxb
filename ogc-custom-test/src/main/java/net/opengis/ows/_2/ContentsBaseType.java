//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contents of typical Contents section of an OWS service
 *       metadata (Capabilities) document. This type shall be extended and/or
 *       restricted if needed for specific OWS use to include the specific
 *       metadata needed.
 * 
 * <p>Classe Java pour ContentsBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContentsBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}DatasetDescriptionSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}OtherSource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentsBaseType", propOrder = {
    "datasetDescriptionSummary",
    "otherSource"
})
public class ContentsBaseType {

    @XmlElement(name = "DatasetDescriptionSummary")
    protected List<DatasetDescriptionSummaryBaseType> datasetDescriptionSummary;
    @XmlElement(name = "OtherSource")
    protected List<MetadataType> otherSource;

    /**
     * Unordered set of summary descriptions for the
     *           datasets available from this OWS server. This set shall be included
     *           unless another source is referenced and all this metadata is
     *           available from that source.Gets the value of the datasetDescriptionSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetDescriptionSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetDescriptionSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasetDescriptionSummaryBaseType }
     * 
     * 
     */
    public List<DatasetDescriptionSummaryBaseType> getDatasetDescriptionSummary() {
        if (datasetDescriptionSummary == null) {
            datasetDescriptionSummary = new ArrayList<DatasetDescriptionSummaryBaseType>();
        }
        return this.datasetDescriptionSummary;
    }

    public boolean isSetDatasetDescriptionSummary() {
        return ((this.datasetDescriptionSummary!= null)&&(!this.datasetDescriptionSummary.isEmpty()));
    }

    public void unsetDatasetDescriptionSummary() {
        this.datasetDescriptionSummary = null;
    }

    /**
     * Unordered set of references to other sources of
     *           metadata describing the coverage offerings available from this
     *           server.Gets the value of the otherSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataType }
     * 
     * 
     */
    public List<MetadataType> getOtherSource() {
        if (otherSource == null) {
            otherSource = new ArrayList<MetadataType>();
        }
        return this.otherSource;
    }

    public boolean isSetOtherSource() {
        return ((this.otherSource!= null)&&(!this.otherSource.isEmpty()));
    }

    public void unsetOtherSource() {
        this.otherSource = null;
    }

}

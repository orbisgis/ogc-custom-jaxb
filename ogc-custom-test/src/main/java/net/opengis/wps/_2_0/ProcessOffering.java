//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wps._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/wps/2.0}Process"/>
 *           &lt;any processContents='lax' namespace='##other'/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/wps/2.0}processPropertiesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "process",
    "any"
})
@XmlRootElement(name = "ProcessOffering")
public class ProcessOffering {

    @XmlElement(name = "Process")
    protected ProcessDescriptionType process;
    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "jobControlOptions", required = true)
    protected List<String> jobControlOptions;
    @XmlAttribute(name = "outputTransmission")
    protected List<DataTransmissionModeType> outputTransmission;
    @XmlAttribute(name = "processVersion")
    protected String processVersion;
    @XmlAttribute(name = "processModel")
    protected String processModel;

    /**
     * Obtient la valeur de la propriété process.
     * 
     * @return
     *     possible object is
     *     {@link ProcessDescriptionType }
     *     
     */
    public ProcessDescriptionType getProcess() {
        return process;
    }

    /**
     * Définit la valeur de la propriété process.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessDescriptionType }
     *     
     */
    public void setProcess(ProcessDescriptionType value) {
        this.process = value;
    }

    public boolean isSetProcess() {
        return (this.process!= null);
    }

    /**
     * Obtient la valeur de la propriété any.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Définit la valeur de la propriété any.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    public boolean isSetAny() {
        return (this.any!= null);
    }

    /**
     * Gets the value of the jobControlOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobControlOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobControlOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJobControlOptions() {
        if (jobControlOptions == null) {
            jobControlOptions = new ArrayList<String>();
        }
        return this.jobControlOptions;
    }

    public boolean isSetJobControlOptions() {
        return ((this.jobControlOptions!= null)&&(!this.jobControlOptions.isEmpty()));
    }

    public void unsetJobControlOptions() {
        this.jobControlOptions = null;
    }

    /**
     * Gets the value of the outputTransmission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputTransmission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputTransmission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTransmissionModeType }
     * 
     * 
     */
    public List<DataTransmissionModeType> getOutputTransmission() {
        if (outputTransmission == null) {
            outputTransmission = new ArrayList<DataTransmissionModeType>();
        }
        return this.outputTransmission;
    }

    public boolean isSetOutputTransmission() {
        return ((this.outputTransmission!= null)&&(!this.outputTransmission.isEmpty()));
    }

    public void unsetOutputTransmission() {
        this.outputTransmission = null;
    }

    /**
     * Obtient la valeur de la propriété processVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessVersion() {
        return processVersion;
    }

    /**
     * Définit la valeur de la propriété processVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessVersion(String value) {
        this.processVersion = value;
    }

    public boolean isSetProcessVersion() {
        return (this.processVersion!= null);
    }

    /**
     * Obtient la valeur de la propriété processModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessModel() {
        if (processModel == null) {
            return "native";
        } else {
            return processModel;
        }
    }

    /**
     * Définit la valeur de la propriété processModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessModel(String value) {
        this.processModel = value;
    }

    public boolean isSetProcessModel() {
        return (this.processModel!= null);
    }

}

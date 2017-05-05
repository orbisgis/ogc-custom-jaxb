//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.fes._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Conformance" type="{http://www.opengis.net/fes/2.1}ConformanceType"/>
 *         &lt;element name="Id_Capabilities" type="{http://www.opengis.net/fes/2.1}Id_CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="Scalar_Capabilities" type="{http://www.opengis.net/fes/2.1}Scalar_CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="Spatial_Capabilities" type="{http://www.opengis.net/fes/2.1}Spatial_CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="Temporal_Capabilities" type="{http://www.opengis.net/fes/2.1}Temporal_CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="Functions" type="{http://www.opengis.net/fes/2.1}AvailableFunctionsType" minOccurs="0"/>
 *         &lt;element name="Extended_Capabilities" type="{http://www.opengis.net/fes/2.1}Extended_CapabilitiesType" minOccurs="0"/>
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
    "conformance",
    "idCapabilities",
    "scalarCapabilities",
    "spatialCapabilities",
    "temporalCapabilities",
    "functions",
    "extendedCapabilities"
})
@XmlRootElement(name = "Filter_Capabilities")
public class FilterCapabilities {

    @XmlElement(name = "Conformance", required = true)
    protected ConformanceType conformance;
    @XmlElement(name = "Id_Capabilities")
    protected IdCapabilitiesType idCapabilities;
    @XmlElement(name = "Scalar_Capabilities")
    protected ScalarCapabilitiesType scalarCapabilities;
    @XmlElement(name = "Spatial_Capabilities")
    protected SpatialCapabilitiesType spatialCapabilities;
    @XmlElement(name = "Temporal_Capabilities")
    protected TemporalCapabilitiesType temporalCapabilities;
    @XmlElement(name = "Functions")
    protected AvailableFunctionsType functions;
    @XmlElement(name = "Extended_Capabilities")
    protected ExtendedCapabilitiesType extendedCapabilities;

    /**
     * Obtient la valeur de la propriété conformance.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceType }
     *     
     */
    public ConformanceType getConformance() {
        return conformance;
    }

    /**
     * Définit la valeur de la propriété conformance.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceType }
     *     
     */
    public void setConformance(ConformanceType value) {
        this.conformance = value;
    }

    public boolean isSetConformance() {
        return (this.conformance!= null);
    }

    /**
     * Obtient la valeur de la propriété idCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link IdCapabilitiesType }
     *     
     */
    public IdCapabilitiesType getIdCapabilities() {
        return idCapabilities;
    }

    /**
     * Définit la valeur de la propriété idCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link IdCapabilitiesType }
     *     
     */
    public void setIdCapabilities(IdCapabilitiesType value) {
        this.idCapabilities = value;
    }

    public boolean isSetIdCapabilities() {
        return (this.idCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété scalarCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link ScalarCapabilitiesType }
     *     
     */
    public ScalarCapabilitiesType getScalarCapabilities() {
        return scalarCapabilities;
    }

    /**
     * Définit la valeur de la propriété scalarCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link ScalarCapabilitiesType }
     *     
     */
    public void setScalarCapabilities(ScalarCapabilitiesType value) {
        this.scalarCapabilities = value;
    }

    public boolean isSetScalarCapabilities() {
        return (this.scalarCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété spatialCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link SpatialCapabilitiesType }
     *     
     */
    public SpatialCapabilitiesType getSpatialCapabilities() {
        return spatialCapabilities;
    }

    /**
     * Définit la valeur de la propriété spatialCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialCapabilitiesType }
     *     
     */
    public void setSpatialCapabilities(SpatialCapabilitiesType value) {
        this.spatialCapabilities = value;
    }

    public boolean isSetSpatialCapabilities() {
        return (this.spatialCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété temporalCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link TemporalCapabilitiesType }
     *     
     */
    public TemporalCapabilitiesType getTemporalCapabilities() {
        return temporalCapabilities;
    }

    /**
     * Définit la valeur de la propriété temporalCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalCapabilitiesType }
     *     
     */
    public void setTemporalCapabilities(TemporalCapabilitiesType value) {
        this.temporalCapabilities = value;
    }

    public boolean isSetTemporalCapabilities() {
        return (this.temporalCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété functions.
     * 
     * @return
     *     possible object is
     *     {@link AvailableFunctionsType }
     *     
     */
    public AvailableFunctionsType getFunctions() {
        return functions;
    }

    /**
     * Définit la valeur de la propriété functions.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableFunctionsType }
     *     
     */
    public void setFunctions(AvailableFunctionsType value) {
        this.functions = value;
    }

    public boolean isSetFunctions() {
        return (this.functions!= null);
    }

    /**
     * Obtient la valeur de la propriété extendedCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCapabilitiesType }
     *     
     */
    public ExtendedCapabilitiesType getExtendedCapabilities() {
        return extendedCapabilities;
    }

    /**
     * Définit la valeur de la propriété extendedCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCapabilitiesType }
     *     
     */
    public void setExtendedCapabilities(ExtendedCapabilitiesType value) {
        this.extendedCapabilities = value;
    }

    public boolean isSetExtendedCapabilities() {
        return (this.extendedCapabilities!= null);
    }

}

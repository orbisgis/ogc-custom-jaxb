//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A mathematical operation on coordinates that transforms or converts coordinates to another coordinate reference system. Many but not all coordinate operations (from CRS A to CRS B) also uniquely define the inverse operation (from CRS B to CRS A). In some cases, the operation method algorithm for the inverse operation is the same as for the forward algorithm, but the signs of some operation parameter values must be reversed. In other cases, different algorithms are required for the forward and inverse operations, but the same operation parameter values are used. If (some) entirely different parameter values are needed, a different coordinate operation shall be defined.
 * 
 * <p>Classe Java pour AbstractCoordinateOperationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractCoordinateOperationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCoordinateOperationBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}coordinateOperationID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}operationVersion" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}validArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}scope" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}_positionalAccuracy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}sourceCRS" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}targetCRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoordinateOperationType", propOrder = {
    "coordinateOperationID",
    "remarks",
    "operationVersion",
    "validArea",
    "scope",
    "positionalAccuracy",
    "sourceCRS",
    "targetCRS"
})
@XmlSeeAlso({
    PassThroughOperationType.class,
    AbstractGeneralConversionType.class,
    ConcatenatedOperationType.class,
    AbstractGeneralTransformationType.class
})
public abstract class AbstractCoordinateOperationType
    extends AbstractCoordinateOperationBaseType
{

    protected List<IdentifierType> coordinateOperationID;
    protected StringOrRefType remarks;
    protected String operationVersion;
    protected ExtentType validArea;
    protected String scope;
    @XmlElementRef(name = "_positionalAccuracy", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractPositionalAccuracyType>> positionalAccuracy;
    protected CRSRefType sourceCRS;
    protected CRSRefType targetCRS;

    /**
     * Set of alternative identifications of this coordinate operation. The first coordinateOperationID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the coordinateOperationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinateOperationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinateOperationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getCoordinateOperationID() {
        if (coordinateOperationID == null) {
            coordinateOperationID = new ArrayList<IdentifierType>();
        }
        return this.coordinateOperationID;
    }

    public boolean isSetCoordinateOperationID() {
        return ((this.coordinateOperationID!= null)&&(!this.coordinateOperationID.isEmpty()));
    }

    public void unsetCoordinateOperationID() {
        this.coordinateOperationID = null;
    }

    /**
     * Comments on or information about this coordinate operation, including source information. 
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRemarks() {
        return remarks;
    }

    /**
     * Définit la valeur de la propriété remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRemarks(StringOrRefType value) {
        this.remarks = value;
    }

    public boolean isSetRemarks() {
        return (this.remarks!= null);
    }

    /**
     * Obtient la valeur de la propriété operationVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationVersion() {
        return operationVersion;
    }

    /**
     * Définit la valeur de la propriété operationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationVersion(String value) {
        this.operationVersion = value;
    }

    public boolean isSetOperationVersion() {
        return (this.operationVersion!= null);
    }

    /**
     * Obtient la valeur de la propriété validArea.
     * 
     * @return
     *     possible object is
     *     {@link ExtentType }
     *     
     */
    public ExtentType getValidArea() {
        return validArea;
    }

    /**
     * Définit la valeur de la propriété validArea.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtentType }
     *     
     */
    public void setValidArea(ExtentType value) {
        this.validArea = value;
    }

    public boolean isSetValidArea() {
        return (this.validArea!= null);
    }

    /**
     * Obtient la valeur de la propriété scope.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Définit la valeur de la propriété scope.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    public boolean isSetScope() {
        return (this.scope!= null);
    }

    /**
     * Unordered set of estimates of the impact of this coordinate operation on point position accuracy. Gives position error estimates for target coordinates of this coordinate operation, assuming no errors in source coordinates. Gets the value of the positionalAccuracy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionalAccuracy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionalAccuracy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractPositionalAccuracyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CovarianceMatrixType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelativeInternalPositionalAccuracyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbsoluteExternalPositionalAccuracyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractPositionalAccuracyType>> getPositionalAccuracy() {
        if (positionalAccuracy == null) {
            positionalAccuracy = new ArrayList<JAXBElement<? extends AbstractPositionalAccuracyType>>();
        }
        return this.positionalAccuracy;
    }

    public boolean isSetPositionalAccuracy() {
        return ((this.positionalAccuracy!= null)&&(!this.positionalAccuracy.isEmpty()));
    }

    public void unsetPositionalAccuracy() {
        this.positionalAccuracy = null;
    }

    /**
     * Obtient la valeur de la propriété sourceCRS.
     * 
     * @return
     *     possible object is
     *     {@link CRSRefType }
     *     
     */
    public CRSRefType getSourceCRS() {
        return sourceCRS;
    }

    /**
     * Définit la valeur de la propriété sourceCRS.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSRefType }
     *     
     */
    public void setSourceCRS(CRSRefType value) {
        this.sourceCRS = value;
    }

    public boolean isSetSourceCRS() {
        return (this.sourceCRS!= null);
    }

    /**
     * Obtient la valeur de la propriété targetCRS.
     * 
     * @return
     *     possible object is
     *     {@link CRSRefType }
     *     
     */
    public CRSRefType getTargetCRS() {
        return targetCRS;
    }

    /**
     * Définit la valeur de la propriété targetCRS.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSRefType }
     *     
     */
    public void setTargetCRS(CRSRefType value) {
        this.targetCRS = value;
    }

    public boolean isSetTargetCRS() {
        return (this.targetCRS!= null);
    }

}

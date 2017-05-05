//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of an algorithm used to perform a coordinate operation. Most operation methods use a number of operation parameters, although some coordinate conversions use none. Each coordinate operation using the method assigns values to these parameters. 
 * 
 * <p>Classe Java pour OperationMethodType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OperationMethodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}OperationMethodBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}methodID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}methodFormula"/>
 *         &lt;element ref="{http://www.opengis.net/gml}sourceDimensions"/>
 *         &lt;element ref="{http://www.opengis.net/gml}targetDimensions"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationMethodType", propOrder = {
    "methodID",
    "remarks",
    "methodFormula",
    "sourceDimensions",
    "targetDimensions",
    "usesParameter"
})
public class OperationMethodType
    extends OperationMethodBaseType
{

    protected List<IdentifierType> methodID;
    protected StringOrRefType remarks;
    @XmlElement(required = true)
    protected CodeType methodFormula;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sourceDimensions;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger targetDimensions;
    protected List<AbstractGeneralOperationParameterRefType> usesParameter;

    /**
     * Set of alternative identifications of this operation method. The first methodID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the methodID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getMethodID() {
        if (methodID == null) {
            methodID = new ArrayList<IdentifierType>();
        }
        return this.methodID;
    }

    public boolean isSetMethodID() {
        return ((this.methodID!= null)&&(!this.methodID.isEmpty()));
    }

    public void unsetMethodID() {
        this.methodID = null;
    }

    /**
     * Comments on or information about this operation method, including source information.
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
     * Obtient la valeur de la propriété methodFormula.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMethodFormula() {
        return methodFormula;
    }

    /**
     * Définit la valeur de la propriété methodFormula.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMethodFormula(CodeType value) {
        this.methodFormula = value;
    }

    public boolean isSetMethodFormula() {
        return (this.methodFormula!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceDimensions.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceDimensions() {
        return sourceDimensions;
    }

    /**
     * Définit la valeur de la propriété sourceDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceDimensions(BigInteger value) {
        this.sourceDimensions = value;
    }

    public boolean isSetSourceDimensions() {
        return (this.sourceDimensions!= null);
    }

    /**
     * Obtient la valeur de la propriété targetDimensions.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetDimensions() {
        return targetDimensions;
    }

    /**
     * Définit la valeur de la propriété targetDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetDimensions(BigInteger value) {
        this.targetDimensions = value;
    }

    public boolean isSetTargetDimensions() {
        return (this.targetDimensions!= null);
    }

    /**
     * Unordered list of associations to the set of operation parameters and parameter groups used by this operation method. Gets the value of the usesParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractGeneralOperationParameterRefType }
     * 
     * 
     */
    public List<AbstractGeneralOperationParameterRefType> getUsesParameter() {
        if (usesParameter == null) {
            usesParameter = new ArrayList<AbstractGeneralOperationParameterRefType>();
        }
        return this.usesParameter;
    }

    public boolean isSetUsesParameter() {
        return ((this.usesParameter!= null)&&(!this.usesParameter.isEmpty()));
    }

    public void unsetUsesParameter() {
        this.usesParameter = null;
    }

}

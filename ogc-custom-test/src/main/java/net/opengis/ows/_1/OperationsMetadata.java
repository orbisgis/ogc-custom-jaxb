//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows._1;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}Operation" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="Parameter" type="{http://www.opengis.net/ows/1.1}DomainType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Constraint" type="{http://www.opengis.net/ows/1.1}DomainType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}ExtendedCapabilities" minOccurs="0"/>
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
    "operation",
    "parameter",
    "constraint",
    "extendedCapabilities"
})
@XmlRootElement(name = "OperationsMetadata")
public class OperationsMetadata {

    @XmlElement(name = "Operation", required = true)
    protected List<Operation> operation;
    @XmlElement(name = "Parameter")
    protected List<DomainType> parameter;
    @XmlElement(name = "Constraint")
    protected List<DomainType> constraint;
    @XmlElement(name = "ExtendedCapabilities")
    protected Object extendedCapabilities;

    /**
     * Metadata for unordered list of all the (requests for) operations that this server interface implements. The list of required and optional operations implemented shall be specified in the Implementation Specification for this service. Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operation }
     * 
     * 
     */
    public List<Operation> getOperation() {
        if (operation == null) {
            operation = new ArrayList<Operation>();
        }
        return this.operation;
    }

    public boolean isSetOperation() {
        return ((this.operation!= null)&&(!this.operation.isEmpty()));
    }

    public void unsetOperation() {
        this.operation = null;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainType }
     * 
     * 
     */
    public List<DomainType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<DomainType>();
        }
        return this.parameter;
    }

    public boolean isSetParameter() {
        return ((this.parameter!= null)&&(!this.parameter.isEmpty()));
    }

    public void unsetParameter() {
        this.parameter = null;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainType }
     * 
     * 
     */
    public List<DomainType> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<DomainType>();
        }
        return this.constraint;
    }

    public boolean isSetConstraint() {
        return ((this.constraint!= null)&&(!this.constraint.isEmpty()));
    }

    public void unsetConstraint() {
        this.constraint = null;
    }

    /**
     * Obtient la valeur de la propriété extendedCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtendedCapabilities() {
        return extendedCapabilities;
    }

    /**
     * Définit la valeur de la propriété extendedCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtendedCapabilities(Object value) {
        this.extendedCapabilities = value;
    }

    public boolean isSetExtendedCapabilities() {
        return (this.extendedCapabilities!= null);
    }

}

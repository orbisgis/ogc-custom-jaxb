//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element ref="{http://www.opengis.net/wms}GetCapabilities"/>
 *         &lt;element ref="{http://www.opengis.net/wms}GetMap"/>
 *         &lt;element ref="{http://www.opengis.net/wms}GetFeatureInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}_ExtendedOperation" maxOccurs="unbounded" minOccurs="0"/>
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
    "getCapabilities",
    "getMap",
    "getFeatureInfo",
    "extendedOperation"
})
@XmlRootElement(name = "Request")
public class Request {

    @XmlElement(name = "GetCapabilities", required = true)
    protected OperationType getCapabilities;
    @XmlElement(name = "GetMap", required = true)
    protected OperationType getMap;
    @XmlElement(name = "GetFeatureInfo")
    protected OperationType getFeatureInfo;
    @XmlElementRef(name = "_ExtendedOperation", namespace = "http://www.opengis.net/wms", type = JAXBElement.class)
    protected List<JAXBElement<OperationType>> extendedOperation;

    /**
     * Obtient la valeur de la propriété getCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getGetCapabilities() {
        return getCapabilities;
    }

    /**
     * Définit la valeur de la propriété getCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setGetCapabilities(OperationType value) {
        this.getCapabilities = value;
    }

    public boolean isSetGetCapabilities() {
        return (this.getCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété getMap.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getGetMap() {
        return getMap;
    }

    /**
     * Définit la valeur de la propriété getMap.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setGetMap(OperationType value) {
        this.getMap = value;
    }

    public boolean isSetGetMap() {
        return (this.getMap!= null);
    }

    /**
     * Obtient la valeur de la propriété getFeatureInfo.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getGetFeatureInfo() {
        return getFeatureInfo;
    }

    /**
     * Définit la valeur de la propriété getFeatureInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setGetFeatureInfo(OperationType value) {
        this.getFeatureInfo = value;
    }

    public boolean isSetGetFeatureInfo() {
        return (this.getFeatureInfo!= null);
    }

    /**
     * Gets the value of the extendedOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<OperationType>> getExtendedOperation() {
        if (extendedOperation == null) {
            extendedOperation = new ArrayList<JAXBElement<OperationType>>();
        }
        return this.extendedOperation;
    }

    public boolean isSetExtendedOperation() {
        return ((this.extendedOperation!= null)&&(!this.extendedOperation.isEmpty()));
    }

    public void unsetExtendedOperation() {
        this.extendedOperation = null;
    }

}

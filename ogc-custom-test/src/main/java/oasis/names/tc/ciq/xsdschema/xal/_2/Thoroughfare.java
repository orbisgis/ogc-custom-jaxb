//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package oasis.names.tc.ciq.xsdschema.xal._2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


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
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumber"/>
 *           &lt;element name="ThoroughfareNumberRange">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="ThoroughfareNumberFrom">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumber" maxOccurs="unbounded"/>
 *                               &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
 *                             &lt;anyAttribute namespace='##other'/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="ThoroughfareNumberTo">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumber" maxOccurs="unbounded"/>
 *                               &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
 *                             &lt;anyAttribute namespace='##other'/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
 *                   &lt;attribute name="RangeType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="Odd"/>
 *                         &lt;enumeration value="Even"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;attribute name="Separator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;attribute name="IndicatorOccurrence">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="Before"/>
 *                         &lt;enumeration value="After"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="NumberRangeOccurrence">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="BeforeName"/>
 *                         &lt;enumeration value="AfterName"/>
 *                         &lt;enumeration value="BeforeType"/>
 *                         &lt;enumeration value="AfterType"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;anyAttribute namespace='##other'/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThoroughfarePreDirection" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfarePreDirectionType" minOccurs="0"/>
 *         &lt;element name="ThoroughfareLeadingType" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareLeadingTypeType" minOccurs="0"/>
 *         &lt;element name="ThoroughfareName" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThoroughfareTrailingType" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareTrailingTypeType" minOccurs="0"/>
 *         &lt;element name="ThoroughfarePostDirection" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfarePostDirectionType" minOccurs="0"/>
 *         &lt;element name="DependentThoroughfare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ThoroughfarePreDirection" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfarePreDirectionType" minOccurs="0"/>
 *                   &lt;element name="ThoroughfareLeadingType" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareLeadingTypeType" minOccurs="0"/>
 *                   &lt;element name="ThoroughfareName" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNameType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ThoroughfareTrailingType" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareTrailingTypeType" minOccurs="0"/>
 *                   &lt;element name="ThoroughfarePostDirection" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfarePostDirectionType" minOccurs="0"/>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;anyAttribute namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="DependentLocality" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}DependentLocalityType"/>
 *           &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}Premise"/>
 *           &lt;element name="Firm" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}FirmType"/>
 *           &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PostalCode"/>
 *         &lt;/choice>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DependentThoroughfares">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DependentThoroughfaresIndicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DependentThoroughfaresConnector" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DependentThoroughfaresType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressLine",
    "thoroughfareNumberOrThoroughfareNumberRange",
    "thoroughfareNumberPrefix",
    "thoroughfareNumberSuffix",
    "thoroughfarePreDirection",
    "thoroughfareLeadingType",
    "thoroughfareName",
    "thoroughfareTrailingType",
    "thoroughfarePostDirection",
    "dependentThoroughfare",
    "dependentLocality",
    "premise",
    "firm",
    "postalCode",
    "any"
})
@XmlRootElement(name = "Thoroughfare")
public class Thoroughfare {

    @XmlElement(name = "AddressLine")
    protected List<AddressLine> addressLine;
    @XmlElements({
        @XmlElement(name = "ThoroughfareNumber", type = ThoroughfareNumber.class),
        @XmlElement(name = "ThoroughfareNumberRange", type = Thoroughfare.ThoroughfareNumberRange.class)
    })
    protected List<Object> thoroughfareNumberOrThoroughfareNumberRange;
    @XmlElement(name = "ThoroughfareNumberPrefix")
    protected List<ThoroughfareNumberPrefix> thoroughfareNumberPrefix;
    @XmlElement(name = "ThoroughfareNumberSuffix")
    protected List<ThoroughfareNumberSuffix> thoroughfareNumberSuffix;
    @XmlElement(name = "ThoroughfarePreDirection")
    protected ThoroughfarePreDirectionType thoroughfarePreDirection;
    @XmlElement(name = "ThoroughfareLeadingType")
    protected ThoroughfareLeadingTypeType thoroughfareLeadingType;
    @XmlElement(name = "ThoroughfareName")
    protected List<ThoroughfareNameType> thoroughfareName;
    @XmlElement(name = "ThoroughfareTrailingType")
    protected ThoroughfareTrailingTypeType thoroughfareTrailingType;
    @XmlElement(name = "ThoroughfarePostDirection")
    protected ThoroughfarePostDirectionType thoroughfarePostDirection;
    @XmlElement(name = "DependentThoroughfare")
    protected Thoroughfare.DependentThoroughfare dependentThoroughfare;
    @XmlElement(name = "DependentLocality")
    protected DependentLocalityType dependentLocality;
    @XmlElement(name = "Premise")
    protected Premise premise;
    @XmlElement(name = "Firm")
    protected FirmType firm;
    @XmlElement(name = "PostalCode")
    protected PostalCode postalCode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "DependentThoroughfares")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dependentThoroughfares;
    @XmlAttribute(name = "DependentThoroughfaresIndicator")
    @XmlSchemaType(name = "anySimpleType")
    protected String dependentThoroughfaresIndicator;
    @XmlAttribute(name = "DependentThoroughfaresConnector")
    @XmlSchemaType(name = "anySimpleType")
    protected String dependentThoroughfaresConnector;
    @XmlAttribute(name = "DependentThoroughfaresType")
    @XmlSchemaType(name = "anySimpleType")
    protected String dependentThoroughfaresType;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLine }
     * 
     * 
     */
    public List<AddressLine> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<AddressLine>();
        }
        return this.addressLine;
    }

    public boolean isSetAddressLine() {
        return ((this.addressLine!= null)&&(!this.addressLine.isEmpty()));
    }

    public void unsetAddressLine() {
        this.addressLine = null;
    }

    /**
     * Gets the value of the thoroughfareNumberOrThoroughfareNumberRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thoroughfareNumberOrThoroughfareNumberRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThoroughfareNumberOrThoroughfareNumberRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThoroughfareNumber }
     * {@link Thoroughfare.ThoroughfareNumberRange }
     * 
     * 
     */
    public List<Object> getThoroughfareNumberOrThoroughfareNumberRange() {
        if (thoroughfareNumberOrThoroughfareNumberRange == null) {
            thoroughfareNumberOrThoroughfareNumberRange = new ArrayList<Object>();
        }
        return this.thoroughfareNumberOrThoroughfareNumberRange;
    }

    public boolean isSetThoroughfareNumberOrThoroughfareNumberRange() {
        return ((this.thoroughfareNumberOrThoroughfareNumberRange!= null)&&(!this.thoroughfareNumberOrThoroughfareNumberRange.isEmpty()));
    }

    public void unsetThoroughfareNumberOrThoroughfareNumberRange() {
        this.thoroughfareNumberOrThoroughfareNumberRange = null;
    }

    /**
     * Gets the value of the thoroughfareNumberPrefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thoroughfareNumberPrefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThoroughfareNumberPrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThoroughfareNumberPrefix }
     * 
     * 
     */
    public List<ThoroughfareNumberPrefix> getThoroughfareNumberPrefix() {
        if (thoroughfareNumberPrefix == null) {
            thoroughfareNumberPrefix = new ArrayList<ThoroughfareNumberPrefix>();
        }
        return this.thoroughfareNumberPrefix;
    }

    public boolean isSetThoroughfareNumberPrefix() {
        return ((this.thoroughfareNumberPrefix!= null)&&(!this.thoroughfareNumberPrefix.isEmpty()));
    }

    public void unsetThoroughfareNumberPrefix() {
        this.thoroughfareNumberPrefix = null;
    }

    /**
     * Gets the value of the thoroughfareNumberSuffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thoroughfareNumberSuffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThoroughfareNumberSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThoroughfareNumberSuffix }
     * 
     * 
     */
    public List<ThoroughfareNumberSuffix> getThoroughfareNumberSuffix() {
        if (thoroughfareNumberSuffix == null) {
            thoroughfareNumberSuffix = new ArrayList<ThoroughfareNumberSuffix>();
        }
        return this.thoroughfareNumberSuffix;
    }

    public boolean isSetThoroughfareNumberSuffix() {
        return ((this.thoroughfareNumberSuffix!= null)&&(!this.thoroughfareNumberSuffix.isEmpty()));
    }

    public void unsetThoroughfareNumberSuffix() {
        this.thoroughfareNumberSuffix = null;
    }

    /**
     * Obtient la valeur de la propriété thoroughfarePreDirection.
     * 
     * @return
     *     possible object is
     *     {@link ThoroughfarePreDirectionType }
     *     
     */
    public ThoroughfarePreDirectionType getThoroughfarePreDirection() {
        return thoroughfarePreDirection;
    }

    /**
     * Définit la valeur de la propriété thoroughfarePreDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link ThoroughfarePreDirectionType }
     *     
     */
    public void setThoroughfarePreDirection(ThoroughfarePreDirectionType value) {
        this.thoroughfarePreDirection = value;
    }

    public boolean isSetThoroughfarePreDirection() {
        return (this.thoroughfarePreDirection!= null);
    }

    /**
     * Obtient la valeur de la propriété thoroughfareLeadingType.
     * 
     * @return
     *     possible object is
     *     {@link ThoroughfareLeadingTypeType }
     *     
     */
    public ThoroughfareLeadingTypeType getThoroughfareLeadingType() {
        return thoroughfareLeadingType;
    }

    /**
     * Définit la valeur de la propriété thoroughfareLeadingType.
     * 
     * @param value
     *     allowed object is
     *     {@link ThoroughfareLeadingTypeType }
     *     
     */
    public void setThoroughfareLeadingType(ThoroughfareLeadingTypeType value) {
        this.thoroughfareLeadingType = value;
    }

    public boolean isSetThoroughfareLeadingType() {
        return (this.thoroughfareLeadingType!= null);
    }

    /**
     * Gets the value of the thoroughfareName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thoroughfareName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThoroughfareName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThoroughfareNameType }
     * 
     * 
     */
    public List<ThoroughfareNameType> getThoroughfareName() {
        if (thoroughfareName == null) {
            thoroughfareName = new ArrayList<ThoroughfareNameType>();
        }
        return this.thoroughfareName;
    }

    public boolean isSetThoroughfareName() {
        return ((this.thoroughfareName!= null)&&(!this.thoroughfareName.isEmpty()));
    }

    public void unsetThoroughfareName() {
        this.thoroughfareName = null;
    }

    /**
     * Obtient la valeur de la propriété thoroughfareTrailingType.
     * 
     * @return
     *     possible object is
     *     {@link ThoroughfareTrailingTypeType }
     *     
     */
    public ThoroughfareTrailingTypeType getThoroughfareTrailingType() {
        return thoroughfareTrailingType;
    }

    /**
     * Définit la valeur de la propriété thoroughfareTrailingType.
     * 
     * @param value
     *     allowed object is
     *     {@link ThoroughfareTrailingTypeType }
     *     
     */
    public void setThoroughfareTrailingType(ThoroughfareTrailingTypeType value) {
        this.thoroughfareTrailingType = value;
    }

    public boolean isSetThoroughfareTrailingType() {
        return (this.thoroughfareTrailingType!= null);
    }

    /**
     * Obtient la valeur de la propriété thoroughfarePostDirection.
     * 
     * @return
     *     possible object is
     *     {@link ThoroughfarePostDirectionType }
     *     
     */
    public ThoroughfarePostDirectionType getThoroughfarePostDirection() {
        return thoroughfarePostDirection;
    }

    /**
     * Définit la valeur de la propriété thoroughfarePostDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link ThoroughfarePostDirectionType }
     *     
     */
    public void setThoroughfarePostDirection(ThoroughfarePostDirectionType value) {
        this.thoroughfarePostDirection = value;
    }

    public boolean isSetThoroughfarePostDirection() {
        return (this.thoroughfarePostDirection!= null);
    }

    /**
     * Obtient la valeur de la propriété dependentThoroughfare.
     * 
     * @return
     *     possible object is
     *     {@link Thoroughfare.DependentThoroughfare }
     *     
     */
    public Thoroughfare.DependentThoroughfare getDependentThoroughfare() {
        return dependentThoroughfare;
    }

    /**
     * Définit la valeur de la propriété dependentThoroughfare.
     * 
     * @param value
     *     allowed object is
     *     {@link Thoroughfare.DependentThoroughfare }
     *     
     */
    public void setDependentThoroughfare(Thoroughfare.DependentThoroughfare value) {
        this.dependentThoroughfare = value;
    }

    public boolean isSetDependentThoroughfare() {
        return (this.dependentThoroughfare!= null);
    }

    /**
     * Obtient la valeur de la propriété dependentLocality.
     * 
     * @return
     *     possible object is
     *     {@link DependentLocalityType }
     *     
     */
    public DependentLocalityType getDependentLocality() {
        return dependentLocality;
    }

    /**
     * Définit la valeur de la propriété dependentLocality.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentLocalityType }
     *     
     */
    public void setDependentLocality(DependentLocalityType value) {
        this.dependentLocality = value;
    }

    public boolean isSetDependentLocality() {
        return (this.dependentLocality!= null);
    }

    /**
     * Obtient la valeur de la propriété premise.
     * 
     * @return
     *     possible object is
     *     {@link Premise }
     *     
     */
    public Premise getPremise() {
        return premise;
    }

    /**
     * Définit la valeur de la propriété premise.
     * 
     * @param value
     *     allowed object is
     *     {@link Premise }
     *     
     */
    public void setPremise(Premise value) {
        this.premise = value;
    }

    public boolean isSetPremise() {
        return (this.premise!= null);
    }

    /**
     * Obtient la valeur de la propriété firm.
     * 
     * @return
     *     possible object is
     *     {@link FirmType }
     *     
     */
    public FirmType getFirm() {
        return firm;
    }

    /**
     * Définit la valeur de la propriété firm.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmType }
     *     
     */
    public void setFirm(FirmType value) {
        this.firm = value;
    }

    public boolean isSetFirm() {
        return (this.firm!= null);
    }

    /**
     * Obtient la valeur de la propriété postalCode.
     * 
     * @return
     *     possible object is
     *     {@link PostalCode }
     *     
     */
    public PostalCode getPostalCode() {
        return postalCode;
    }

    /**
     * Définit la valeur de la propriété postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCode }
     *     
     */
    public void setPostalCode(PostalCode value) {
        this.postalCode = value;
    }

    public boolean isSetPostalCode() {
        return (this.postalCode!= null);
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    public boolean isSetAny() {
        return ((this.any!= null)&&(!this.any.isEmpty()));
    }

    public void unsetAny() {
        this.any = null;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Obtient la valeur de la propriété dependentThoroughfares.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentThoroughfares() {
        return dependentThoroughfares;
    }

    /**
     * Définit la valeur de la propriété dependentThoroughfares.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentThoroughfares(String value) {
        this.dependentThoroughfares = value;
    }

    public boolean isSetDependentThoroughfares() {
        return (this.dependentThoroughfares!= null);
    }

    /**
     * Obtient la valeur de la propriété dependentThoroughfaresIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentThoroughfaresIndicator() {
        return dependentThoroughfaresIndicator;
    }

    /**
     * Définit la valeur de la propriété dependentThoroughfaresIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentThoroughfaresIndicator(String value) {
        this.dependentThoroughfaresIndicator = value;
    }

    public boolean isSetDependentThoroughfaresIndicator() {
        return (this.dependentThoroughfaresIndicator!= null);
    }

    /**
     * Obtient la valeur de la propriété dependentThoroughfaresConnector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentThoroughfaresConnector() {
        return dependentThoroughfaresConnector;
    }

    /**
     * Définit la valeur de la propriété dependentThoroughfaresConnector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentThoroughfaresConnector(String value) {
        this.dependentThoroughfaresConnector = value;
    }

    public boolean isSetDependentThoroughfaresConnector() {
        return (this.dependentThoroughfaresConnector!= null);
    }

    /**
     * Obtient la valeur de la propriété dependentThoroughfaresType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentThoroughfaresType() {
        return dependentThoroughfaresType;
    }

    /**
     * Définit la valeur de la propriété dependentThoroughfaresType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentThoroughfaresType(String value) {
        this.dependentThoroughfaresType = value;
    }

    public boolean isSetDependentThoroughfaresType() {
        return (this.dependentThoroughfaresType!= null);
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


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
     *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ThoroughfarePreDirection" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfarePreDirectionType" minOccurs="0"/>
     *         &lt;element name="ThoroughfareLeadingType" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareLeadingTypeType" minOccurs="0"/>
     *         &lt;element name="ThoroughfareName" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNameType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ThoroughfareTrailingType" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareTrailingTypeType" minOccurs="0"/>
     *         &lt;element name="ThoroughfarePostDirection" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfarePostDirectionType" minOccurs="0"/>
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;anyAttribute namespace='##other'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addressLine",
        "thoroughfarePreDirection",
        "thoroughfareLeadingType",
        "thoroughfareName",
        "thoroughfareTrailingType",
        "thoroughfarePostDirection",
        "any"
    })
    public static class DependentThoroughfare {

        @XmlElement(name = "AddressLine")
        protected List<AddressLine> addressLine;
        @XmlElement(name = "ThoroughfarePreDirection")
        protected ThoroughfarePreDirectionType thoroughfarePreDirection;
        @XmlElement(name = "ThoroughfareLeadingType")
        protected ThoroughfareLeadingTypeType thoroughfareLeadingType;
        @XmlElement(name = "ThoroughfareName")
        protected List<ThoroughfareNameType> thoroughfareName;
        @XmlElement(name = "ThoroughfareTrailingType")
        protected ThoroughfareTrailingTypeType thoroughfareTrailingType;
        @XmlElement(name = "ThoroughfarePostDirection")
        protected ThoroughfarePostDirectionType thoroughfarePostDirection;
        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the addressLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addressLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddressLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddressLine }
         * 
         * 
         */
        public List<AddressLine> getAddressLine() {
            if (addressLine == null) {
                addressLine = new ArrayList<AddressLine>();
            }
            return this.addressLine;
        }

        public boolean isSetAddressLine() {
            return ((this.addressLine!= null)&&(!this.addressLine.isEmpty()));
        }

        public void unsetAddressLine() {
            this.addressLine = null;
        }

        /**
         * Obtient la valeur de la propriété thoroughfarePreDirection.
         * 
         * @return
         *     possible object is
         *     {@link ThoroughfarePreDirectionType }
         *     
         */
        public ThoroughfarePreDirectionType getThoroughfarePreDirection() {
            return thoroughfarePreDirection;
        }

        /**
         * Définit la valeur de la propriété thoroughfarePreDirection.
         * 
         * @param value
         *     allowed object is
         *     {@link ThoroughfarePreDirectionType }
         *     
         */
        public void setThoroughfarePreDirection(ThoroughfarePreDirectionType value) {
            this.thoroughfarePreDirection = value;
        }

        public boolean isSetThoroughfarePreDirection() {
            return (this.thoroughfarePreDirection!= null);
        }

        /**
         * Obtient la valeur de la propriété thoroughfareLeadingType.
         * 
         * @return
         *     possible object is
         *     {@link ThoroughfareLeadingTypeType }
         *     
         */
        public ThoroughfareLeadingTypeType getThoroughfareLeadingType() {
            return thoroughfareLeadingType;
        }

        /**
         * Définit la valeur de la propriété thoroughfareLeadingType.
         * 
         * @param value
         *     allowed object is
         *     {@link ThoroughfareLeadingTypeType }
         *     
         */
        public void setThoroughfareLeadingType(ThoroughfareLeadingTypeType value) {
            this.thoroughfareLeadingType = value;
        }

        public boolean isSetThoroughfareLeadingType() {
            return (this.thoroughfareLeadingType!= null);
        }

        /**
         * Gets the value of the thoroughfareName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the thoroughfareName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getThoroughfareName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ThoroughfareNameType }
         * 
         * 
         */
        public List<ThoroughfareNameType> getThoroughfareName() {
            if (thoroughfareName == null) {
                thoroughfareName = new ArrayList<ThoroughfareNameType>();
            }
            return this.thoroughfareName;
        }

        public boolean isSetThoroughfareName() {
            return ((this.thoroughfareName!= null)&&(!this.thoroughfareName.isEmpty()));
        }

        public void unsetThoroughfareName() {
            this.thoroughfareName = null;
        }

        /**
         * Obtient la valeur de la propriété thoroughfareTrailingType.
         * 
         * @return
         *     possible object is
         *     {@link ThoroughfareTrailingTypeType }
         *     
         */
        public ThoroughfareTrailingTypeType getThoroughfareTrailingType() {
            return thoroughfareTrailingType;
        }

        /**
         * Définit la valeur de la propriété thoroughfareTrailingType.
         * 
         * @param value
         *     allowed object is
         *     {@link ThoroughfareTrailingTypeType }
         *     
         */
        public void setThoroughfareTrailingType(ThoroughfareTrailingTypeType value) {
            this.thoroughfareTrailingType = value;
        }

        public boolean isSetThoroughfareTrailingType() {
            return (this.thoroughfareTrailingType!= null);
        }

        /**
         * Obtient la valeur de la propriété thoroughfarePostDirection.
         * 
         * @return
         *     possible object is
         *     {@link ThoroughfarePostDirectionType }
         *     
         */
        public ThoroughfarePostDirectionType getThoroughfarePostDirection() {
            return thoroughfarePostDirection;
        }

        /**
         * Définit la valeur de la propriété thoroughfarePostDirection.
         * 
         * @param value
         *     allowed object is
         *     {@link ThoroughfarePostDirectionType }
         *     
         */
        public void setThoroughfarePostDirection(ThoroughfarePostDirectionType value) {
            this.thoroughfarePostDirection = value;
        }

        public boolean isSetThoroughfarePostDirection() {
            return (this.thoroughfarePostDirection!= null);
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public boolean isSetAny() {
            return ((this.any!= null)&&(!this.any.isEmpty()));
        }

        public void unsetAny() {
            this.any = null;
        }

        /**
         * Obtient la valeur de la propriété type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Définit la valeur de la propriété type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        public boolean isSetType() {
            return (this.type!= null);
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


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
     *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ThoroughfareNumberFrom">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumber" maxOccurs="unbounded"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
     *                 &lt;anyAttribute namespace='##other'/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ThoroughfareNumberTo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumber" maxOccurs="unbounded"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
     *                 &lt;anyAttribute namespace='##other'/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
     *       &lt;attribute name="RangeType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Odd"/>
     *             &lt;enumeration value="Even"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Separator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="IndicatorOccurrence">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Before"/>
     *             &lt;enumeration value="After"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="NumberRangeOccurrence">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="BeforeName"/>
     *             &lt;enumeration value="AfterName"/>
     *             &lt;enumeration value="BeforeType"/>
     *             &lt;enumeration value="AfterType"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;anyAttribute namespace='##other'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addressLine",
        "thoroughfareNumberFrom",
        "thoroughfareNumberTo"
    })
    public static class ThoroughfareNumberRange {

        @XmlElement(name = "AddressLine")
        protected List<AddressLine> addressLine;
        @XmlElement(name = "ThoroughfareNumberFrom", required = true)
        protected Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom thoroughfareNumberFrom;
        @XmlElement(name = "ThoroughfareNumberTo", required = true)
        protected Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo thoroughfareNumberTo;
        @XmlAttribute(name = "RangeType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String rangeType;
        @XmlAttribute(name = "Indicator")
        @XmlSchemaType(name = "anySimpleType")
        protected String indicator;
        @XmlAttribute(name = "Separator")
        @XmlSchemaType(name = "anySimpleType")
        protected String separator;
        @XmlAttribute(name = "IndicatorOccurrence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String indicatorOccurrence;
        @XmlAttribute(name = "NumberRangeOccurrence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String numberRangeOccurrence;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAttribute(name = "Code")
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the addressLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addressLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddressLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddressLine }
         * 
         * 
         */
        public List<AddressLine> getAddressLine() {
            if (addressLine == null) {
                addressLine = new ArrayList<AddressLine>();
            }
            return this.addressLine;
        }

        public boolean isSetAddressLine() {
            return ((this.addressLine!= null)&&(!this.addressLine.isEmpty()));
        }

        public void unsetAddressLine() {
            this.addressLine = null;
        }

        /**
         * Obtient la valeur de la propriété thoroughfareNumberFrom.
         * 
         * @return
         *     possible object is
         *     {@link Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom }
         *     
         */
        public Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom getThoroughfareNumberFrom() {
            return thoroughfareNumberFrom;
        }

        /**
         * Définit la valeur de la propriété thoroughfareNumberFrom.
         * 
         * @param value
         *     allowed object is
         *     {@link Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom }
         *     
         */
        public void setThoroughfareNumberFrom(Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom value) {
            this.thoroughfareNumberFrom = value;
        }

        public boolean isSetThoroughfareNumberFrom() {
            return (this.thoroughfareNumberFrom!= null);
        }

        /**
         * Obtient la valeur de la propriété thoroughfareNumberTo.
         * 
         * @return
         *     possible object is
         *     {@link Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo }
         *     
         */
        public Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo getThoroughfareNumberTo() {
            return thoroughfareNumberTo;
        }

        /**
         * Définit la valeur de la propriété thoroughfareNumberTo.
         * 
         * @param value
         *     allowed object is
         *     {@link Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo }
         *     
         */
        public void setThoroughfareNumberTo(Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo value) {
            this.thoroughfareNumberTo = value;
        }

        public boolean isSetThoroughfareNumberTo() {
            return (this.thoroughfareNumberTo!= null);
        }

        /**
         * Obtient la valeur de la propriété rangeType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRangeType() {
            return rangeType;
        }

        /**
         * Définit la valeur de la propriété rangeType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRangeType(String value) {
            this.rangeType = value;
        }

        public boolean isSetRangeType() {
            return (this.rangeType!= null);
        }

        /**
         * Obtient la valeur de la propriété indicator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicator() {
            return indicator;
        }

        /**
         * Définit la valeur de la propriété indicator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndicator(String value) {
            this.indicator = value;
        }

        public boolean isSetIndicator() {
            return (this.indicator!= null);
        }

        /**
         * Obtient la valeur de la propriété separator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeparator() {
            return separator;
        }

        /**
         * Définit la valeur de la propriété separator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeparator(String value) {
            this.separator = value;
        }

        public boolean isSetSeparator() {
            return (this.separator!= null);
        }

        /**
         * Obtient la valeur de la propriété indicatorOccurrence.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicatorOccurrence() {
            return indicatorOccurrence;
        }

        /**
         * Définit la valeur de la propriété indicatorOccurrence.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndicatorOccurrence(String value) {
            this.indicatorOccurrence = value;
        }

        public boolean isSetIndicatorOccurrence() {
            return (this.indicatorOccurrence!= null);
        }

        /**
         * Obtient la valeur de la propriété numberRangeOccurrence.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberRangeOccurrence() {
            return numberRangeOccurrence;
        }

        /**
         * Définit la valeur de la propriété numberRangeOccurrence.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberRangeOccurrence(String value) {
            this.numberRangeOccurrence = value;
        }

        public boolean isSetNumberRangeOccurrence() {
            return (this.numberRangeOccurrence!= null);
        }

        /**
         * Obtient la valeur de la propriété type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Définit la valeur de la propriété type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        public boolean isSetType() {
            return (this.type!= null);
        }

        /**
         * Obtient la valeur de la propriété code.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Définit la valeur de la propriété code.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        public boolean isSetCode() {
            return (this.code!= null);
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }


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
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumber" maxOccurs="unbounded"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
         *       &lt;anyAttribute namespace='##other'/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class ThoroughfareNumberFrom {

            @XmlElementRefs({
                @XmlElementRef(name = "ThoroughfareNumberPrefix", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = ThoroughfareNumberPrefix.class),
                @XmlElementRef(name = "ThoroughfareNumberSuffix", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = ThoroughfareNumberSuffix.class),
                @XmlElementRef(name = "AddressLine", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = AddressLine.class),
                @XmlElementRef(name = "ThoroughfareNumber", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = ThoroughfareNumber.class)
            })
            @XmlMixed
            protected List<Object> content;
            @XmlAttribute(name = "Code")
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddressLine }
             * {@link ThoroughfareNumber }
             * {@link ThoroughfareNumberPrefix }
             * {@link ThoroughfareNumberSuffix }
             * {@link String }
             * 
             * 
             */
            public List<Object> getContent() {
                if (content == null) {
                    content = new ArrayList<Object>();
                }
                return this.content;
            }

            public boolean isSetContent() {
                return ((this.content!= null)&&(!this.content.isEmpty()));
            }

            public void unsetContent() {
                this.content = null;
            }

            /**
             * Obtient la valeur de la propriété code.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Définit la valeur de la propriété code.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            public boolean isSetCode() {
                return (this.code!= null);
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }


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
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumber" maxOccurs="unbounded"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}ThoroughfareNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
         *       &lt;anyAttribute namespace='##other'/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class ThoroughfareNumberTo {

            @XmlElementRefs({
                @XmlElementRef(name = "ThoroughfareNumberPrefix", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = ThoroughfareNumberPrefix.class),
                @XmlElementRef(name = "ThoroughfareNumberSuffix", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = ThoroughfareNumberSuffix.class),
                @XmlElementRef(name = "AddressLine", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = AddressLine.class),
                @XmlElementRef(name = "ThoroughfareNumber", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = ThoroughfareNumber.class)
            })
            @XmlMixed
            protected List<Object> content;
            @XmlAttribute(name = "Code")
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddressLine }
             * {@link ThoroughfareNumber }
             * {@link ThoroughfareNumberPrefix }
             * {@link ThoroughfareNumberSuffix }
             * {@link String }
             * 
             * 
             */
            public List<Object> getContent() {
                if (content == null) {
                    content = new ArrayList<Object>();
                }
                return this.content;
            }

            public boolean isSetContent() {
                return ((this.content!= null)&&(!this.content.isEmpty()));
            }

            public void unsetContent() {
                this.content = null;
            }

            /**
             * Obtient la valeur de la propriété code.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Définit la valeur de la propriété code.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            public boolean isSetCode() {
                return (this.code!= null);
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }

    }

}

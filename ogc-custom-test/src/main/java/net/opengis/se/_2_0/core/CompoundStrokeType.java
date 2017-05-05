//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CompoundStrokeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CompoundStrokeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}StrokeType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}PreGap" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.opengis.net/se/2.0/core}StrokeElement"/>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/core}AlternativeStrokeElements"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}PostGap" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uom" type="{http://www.opengis.net/se/2.0/core}UomType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundStrokeType", propOrder = {
    "preGap",
    "strokeElementOrAlternativeStrokeElements",
    "postGap"
})
public class CompoundStrokeType
    extends StrokeType
{

    @XmlElement(name = "PreGap")
    protected ParameterValueType preGap;
    @XmlElements({
        @XmlElement(name = "StrokeElement", type = StrokeElementType.class),
        @XmlElement(name = "AlternativeStrokeElements", type = AlternativeStrokeElementsType.class)
    })
    protected List<Object> strokeElementOrAlternativeStrokeElements;
    @XmlElement(name = "PostGap")
    protected ParameterValueType postGap;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Obtient la valeur de la propriété preGap.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getPreGap() {
        return preGap;
    }

    /**
     * Définit la valeur de la propriété preGap.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setPreGap(ParameterValueType value) {
        this.preGap = value;
    }

    public boolean isSetPreGap() {
        return (this.preGap!= null);
    }

    /**
     * Gets the value of the strokeElementOrAlternativeStrokeElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strokeElementOrAlternativeStrokeElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrokeElementOrAlternativeStrokeElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrokeElementType }
     * {@link AlternativeStrokeElementsType }
     * 
     * 
     */
    public List<Object> getStrokeElementOrAlternativeStrokeElements() {
        if (strokeElementOrAlternativeStrokeElements == null) {
            strokeElementOrAlternativeStrokeElements = new ArrayList<Object>();
        }
        return this.strokeElementOrAlternativeStrokeElements;
    }

    public boolean isSetStrokeElementOrAlternativeStrokeElements() {
        return ((this.strokeElementOrAlternativeStrokeElements!= null)&&(!this.strokeElementOrAlternativeStrokeElements.isEmpty()));
    }

    public void unsetStrokeElementOrAlternativeStrokeElements() {
        this.strokeElementOrAlternativeStrokeElements = null;
    }

    /**
     * Obtient la valeur de la propriété postGap.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getPostGap() {
        return postGap;
    }

    /**
     * Définit la valeur de la propriété postGap.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setPostGap(ParameterValueType value) {
        this.postGap = value;
    }

    public boolean isSetPostGap() {
        return (this.postGap!= null);
    }

    /**
     * Obtient la valeur de la propriété uom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Définit la valeur de la propriété uom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    public boolean isSetUom() {
        return (this.uom!= null);
    }

}

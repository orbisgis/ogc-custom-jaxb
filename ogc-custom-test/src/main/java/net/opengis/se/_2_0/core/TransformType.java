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
 * <p>Classe Java pour TransformType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransformType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Translate" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Rotate" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Scale" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Matrix" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="uom" type="{http://www.opengis.net/se/2.0/core}UomType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformType", propOrder = {
    "translateOrRotateOrScale"
})
public class TransformType {

    @XmlElements({
        @XmlElement(name = "Translate", type = TranslateType.class),
        @XmlElement(name = "Rotate", type = RotateType.class),
        @XmlElement(name = "Scale", type = ScaleType.class),
        @XmlElement(name = "Matrix", type = MatrixType.class)
    })
    protected List<Object> translateOrRotateOrScale;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Gets the value of the translateOrRotateOrScale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translateOrRotateOrScale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslateOrRotateOrScale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranslateType }
     * {@link RotateType }
     * {@link ScaleType }
     * {@link MatrixType }
     * 
     * 
     */
    public List<Object> getTranslateOrRotateOrScale() {
        if (translateOrRotateOrScale == null) {
            translateOrRotateOrScale = new ArrayList<Object>();
        }
        return this.translateOrRotateOrScale;
    }

    public boolean isSetTranslateOrRotateOrScale() {
        return ((this.translateOrRotateOrScale!= null)&&(!this.translateOrRotateOrScale.isEmpty()));
    }

    public void unsetTranslateOrRotateOrScale() {
        this.translateOrRotateOrScale = null;
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

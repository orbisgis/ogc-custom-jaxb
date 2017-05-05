//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PointTextGraphicType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PointTextGraphicType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}GraphicType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}PointPosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}PointLabel" minOccurs="0"/>
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
@XmlType(name = "PointTextGraphicType", propOrder = {
    "pointPosition",
    "pointLabel"
})
public class PointTextGraphicType
    extends GraphicType
{

    @XmlElement(name = "PointPosition")
    protected TranslateType pointPosition;
    @XmlElement(name = "PointLabel")
    protected PointLabelType pointLabel;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Obtient la valeur de la propriété pointPosition.
     * 
     * @return
     *     possible object is
     *     {@link TranslateType }
     *     
     */
    public TranslateType getPointPosition() {
        return pointPosition;
    }

    /**
     * Définit la valeur de la propriété pointPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslateType }
     *     
     */
    public void setPointPosition(TranslateType value) {
        this.pointPosition = value;
    }

    public boolean isSetPointPosition() {
        return (this.pointPosition!= null);
    }

    /**
     * Obtient la valeur de la propriété pointLabel.
     * 
     * @return
     *     possible object is
     *     {@link PointLabelType }
     *     
     */
    public PointLabelType getPointLabel() {
        return pointLabel;
    }

    /**
     * Définit la valeur de la propriété pointLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link PointLabelType }
     *     
     */
    public void setPointLabel(PointLabelType value) {
        this.pointLabel = value;
    }

    public boolean isSetPointLabel() {
        return (this.pointLabel!= null);
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

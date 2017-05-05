//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.thematic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.core.AlternativeGraphicsType;
import net.opengis.se._2_0.core.CompositeGraphicType;
import net.opengis.se._2_0.core.ExternalGraphicType;
import net.opengis.se._2_0.core.FillType;
import net.opengis.se._2_0.core.GraphicReferenceType;
import net.opengis.se._2_0.core.GraphicType;
import net.opengis.se._2_0.core.MarkGraphicType;
import net.opengis.se._2_0.core.ParameterValueType;
import net.opengis.se._2_0.core.PointTextGraphicType;


/**
 * <p>Classe Java pour DotMapFillType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DotMapFillType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FillType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Graphic"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}ValuePerMark"/>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}ValueToRepresent"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DotMapFillType", propOrder = {
    "graphic",
    "valuePerMark",
    "valueToRepresent"
})
public class DotMapFillType
    extends FillType
{

    @XmlElementRef(name = "Graphic", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends GraphicType> graphic;
    @XmlElement(name = "ValuePerMark", required = true)
    protected ParameterValueType valuePerMark;
    @XmlElement(name = "ValueToRepresent", required = true)
    protected ParameterValueType valueToRepresent;

    /**
     * Obtient la valeur de la propriété graphic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GraphicReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeGraphicsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PieChartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExternalGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointTextGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AxisChartType }{@code >}
     *     
     */
    public JAXBElement<? extends GraphicType> getGraphic() {
        return graphic;
    }

    /**
     * Définit la valeur de la propriété graphic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GraphicReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeGraphicsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PieChartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExternalGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointTextGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeGraphicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AxisChartType }{@code >}
     *     
     */
    public void setGraphic(JAXBElement<? extends GraphicType> value) {
        this.graphic = value;
    }

    public boolean isSetGraphic() {
        return (this.graphic!= null);
    }

    /**
     * Obtient la valeur de la propriété valuePerMark.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getValuePerMark() {
        return valuePerMark;
    }

    /**
     * Définit la valeur de la propriété valuePerMark.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setValuePerMark(ParameterValueType value) {
        this.valuePerMark = value;
    }

    public boolean isSetValuePerMark() {
        return (this.valuePerMark!= null);
    }

    /**
     * Obtient la valeur de la propriété valueToRepresent.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getValueToRepresent() {
        return valueToRepresent;
    }

    /**
     * Définit la valeur de la propriété valueToRepresent.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setValueToRepresent(ParameterValueType value) {
        this.valueToRepresent = value;
    }

    public boolean isSetValueToRepresent() {
        return (this.valueToRepresent!= null);
    }

}

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
import net.opengis.se._2_0.core.PenStrokeType;
import net.opengis.se._2_0.core.PointTextGraphicType;


/**
 * <p>Classe Java pour DensityFillType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DensityFillType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}FillType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.opengis.net/se/2.0/core}PenStroke"/>
 *             &lt;element ref="{http://www.opengis.net/se/2.0/thematic}Orientation" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.opengis.net/se/2.0/core}Graphic"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/thematic}Percentage"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DensityFillType", propOrder = {
    "penStroke",
    "orientation",
    "graphic",
    "percentage"
})
public class DensityFillType
    extends FillType
{

    @XmlElement(name = "PenStroke", namespace = "http://www.opengis.net/se/2.0/core")
    protected PenStrokeType penStroke;
    @XmlElement(name = "Orientation")
    protected ParameterValueType orientation;
    @XmlElementRef(name = "Graphic", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends GraphicType> graphic;
    @XmlElement(name = "Percentage", required = true)
    protected ParameterValueType percentage;

    /**
     * Obtient la valeur de la propriété penStroke.
     * 
     * @return
     *     possible object is
     *     {@link PenStrokeType }
     *     
     */
    public PenStrokeType getPenStroke() {
        return penStroke;
    }

    /**
     * Définit la valeur de la propriété penStroke.
     * 
     * @param value
     *     allowed object is
     *     {@link PenStrokeType }
     *     
     */
    public void setPenStroke(PenStrokeType value) {
        this.penStroke = value;
    }

    public boolean isSetPenStroke() {
        return (this.penStroke!= null);
    }

    /**
     * Obtient la valeur de la propriété orientation.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getOrientation() {
        return orientation;
    }

    /**
     * Définit la valeur de la propriété orientation.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setOrientation(ParameterValueType value) {
        this.orientation = value;
    }

    public boolean isSetOrientation() {
        return (this.orientation!= null);
    }

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
     * Obtient la valeur de la propriété percentage.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getPercentage() {
        return percentage;
    }

    /**
     * Définit la valeur de la propriété percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setPercentage(ParameterValueType value) {
        this.percentage = value;
    }

    public boolean isSetPercentage() {
        return (this.percentage!= null);
    }

}

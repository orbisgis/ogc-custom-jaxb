//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.thematic.AxisChartType;
import net.opengis.se._2_0.thematic.PieChartType;


/**
 * <p>Classe Java pour LegendGraphicType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LegendGraphicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Graphic"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegendGraphicType", propOrder = {
    "graphic"
})
public class LegendGraphicType {

    @XmlElementRef(name = "Graphic", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected JAXBElement<? extends GraphicType> graphic;

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

}

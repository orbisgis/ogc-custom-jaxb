//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.thematic.AxisChartType;
import net.opengis.se._2_0.thematic.PieChartType;


/**
 * <p>Classe Java pour CompositeGraphicType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CompositeGraphicType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}GraphicType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Graphic" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeGraphicType", propOrder = {
    "graphic"
})
public class CompositeGraphicType
    extends GraphicType
{

    @XmlElementRef(name = "Graphic", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected List<JAXBElement<? extends GraphicType>> graphic;

    /**
     * Gets the value of the graphic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GraphicType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkGraphicType }{@code >}
     * {@link JAXBElement }{@code <}{@link GraphicReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AlternativeGraphicsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PieChartType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExternalGraphicType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointTextGraphicType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeGraphicType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisChartType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends GraphicType>> getGraphic() {
        if (graphic == null) {
            graphic = new ArrayList<JAXBElement<? extends GraphicType>>();
        }
        return this.graphic;
    }

    public boolean isSetGraphic() {
        return ((this.graphic!= null)&&(!this.graphic.isEmpty()));
    }

    public void unsetGraphic() {
        this.graphic = null;
    }

}

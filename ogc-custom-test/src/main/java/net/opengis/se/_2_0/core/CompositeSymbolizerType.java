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
import net.opengis.se._2_0.raster.RasterSymbolizerType;


/**
 * <p>Classe Java pour CompositeSymbolizerType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CompositeSymbolizerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/se/2.0/core}SymbolizerType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/se/2.0/core}Symbolizer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeSymbolizerType", propOrder = {
    "symbolizer"
})
public class CompositeSymbolizerType
    extends SymbolizerType
{

    @XmlElementRef(name = "Symbolizer", namespace = "http://www.opengis.net/se/2.0/core", type = JAXBElement.class)
    protected List<JAXBElement<? extends SymbolizerType>> symbolizer;

    /**
     * Gets the value of the symbolizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symbolizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymbolizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PointSymbolizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link SymbolizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSymbolizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link AreaSymbolizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineSymbolizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link RasterSymbolizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextSymbolizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link SymbolizerReferenceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends SymbolizerType>> getSymbolizer() {
        if (symbolizer == null) {
            symbolizer = new ArrayList<JAXBElement<? extends SymbolizerType>>();
        }
        return this.symbolizer;
    }

    public boolean isSetSymbolizer() {
        return ((this.symbolizer!= null)&&(!this.symbolizer.isEmpty()));
    }

    public void unsetSymbolizer() {
        this.symbolizer = null;
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * [complexType of] Predefined concrete value of the top-level property. Encapsulates all other styling information.
 * 
 * <p>Classe Java pour StyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractStyleType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}featureStyle" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}graphStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleType", propOrder = {
    "featureStyle",
    "graphStyle"
})
public class StyleType
    extends AbstractStyleType
{

    @XmlElementRef(name = "featureStyle", namespace = "http://www.opengis.net/gml", type = FeatureStylePropertyElement.class)
    protected List<FeatureStylePropertyElement> featureStyle;
    @XmlElementRef(name = "graphStyle", namespace = "http://www.opengis.net/gml", type = GraphStylePropertyElement.class)
    protected GraphStylePropertyElement graphStyle;

    /**
     * Gets the value of the featureStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureStylePropertyElement }
     * 
     * 
     */
    public List<FeatureStylePropertyElement> getFeatureStyle() {
        if (featureStyle == null) {
            featureStyle = new ArrayList<FeatureStylePropertyElement>();
        }
        return this.featureStyle;
    }

    public boolean isSetFeatureStyle() {
        return ((this.featureStyle!= null)&&(!this.featureStyle.isEmpty()));
    }

    public void unsetFeatureStyle() {
        this.featureStyle = null;
    }

    /**
     * Obtient la valeur de la propriété graphStyle.
     * 
     * @return
     *     possible object is
     *     {@link GraphStylePropertyElement }
     *     
     */
    public GraphStylePropertyElement getGraphStyle() {
        return graphStyle;
    }

    /**
     * Définit la valeur de la propriété graphStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphStylePropertyElement }
     *     
     */
    public void setGraphStyle(GraphStylePropertyElement value) {
        this.graphStyle = value;
    }

    public boolean isSetGraphStyle() {
        return (this.graphStyle!= null);
    }

}

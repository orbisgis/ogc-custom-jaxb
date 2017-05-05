//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.1}ValueCollection"/>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.1}SimpleFeatureCollection"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valueCollection",
    "simpleFeatureCollection"
})
@XmlRootElement(name = "additionalObjects")
public class AdditionalObjects {

    @XmlElement(name = "ValueCollection")
    protected ValueCollectionType valueCollection;
    @XmlElementRef(name = "SimpleFeatureCollection", namespace = "http://www.opengis.net/wfs/2.1", type = JAXBElement.class)
    protected JAXBElement<? extends SimpleFeatureCollectionType> simpleFeatureCollection;

    /**
     * Obtient la valeur de la propriété valueCollection.
     * 
     * @return
     *     possible object is
     *     {@link ValueCollectionType }
     *     
     */
    public ValueCollectionType getValueCollection() {
        return valueCollection;
    }

    /**
     * Définit la valeur de la propriété valueCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueCollectionType }
     *     
     */
    public void setValueCollection(ValueCollectionType value) {
        this.valueCollection = value;
    }

    public boolean isSetValueCollection() {
        return (this.valueCollection!= null);
    }

    /**
     * Obtient la valeur de la propriété simpleFeatureCollection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleFeatureCollectionType }{@code >}
     *     
     */
    public JAXBElement<? extends SimpleFeatureCollectionType> getSimpleFeatureCollection() {
        return simpleFeatureCollection;
    }

    /**
     * Définit la valeur de la propriété simpleFeatureCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleFeatureCollectionType }{@code >}
     *     
     */
    public void setSimpleFeatureCollection(JAXBElement<? extends SimpleFeatureCollectionType> value) {
        this.simpleFeatureCollection = value;
    }

    public boolean isSetSimpleFeatureCollection() {
        return (this.simpleFeatureCollection!= null);
    }

}

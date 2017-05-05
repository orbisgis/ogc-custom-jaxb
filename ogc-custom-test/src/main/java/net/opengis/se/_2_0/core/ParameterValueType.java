//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.LiteralType;


/**
 * Type for numeric, text and color parameters
 * 
 * <p>Classe Java pour ParameterValueType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ParameterValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/fes/2.1}expression"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueType", propOrder = {
    "content"
})
public class ParameterValueType {

    @XmlElementRef(name = "expression", namespace = "http://www.opengis.net/fes/2.1", type = JAXBElement.class)
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Type for numeric, text and color parameters Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link net.opengis.fes._2.FunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeCaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.se._2_0.core.FunctionType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link StringPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TrimType }{@code >}
     * {@link JAXBElement }{@code <}{@link LiteralType }{@code >}
     * {@link JAXBElement }{@code <}{@link DimensionType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterpolateType }{@code >}
     * {@link JAXBElement }{@code <}{@link FormatNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link FormatDateType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link RecodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link StringLengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcatenateType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubstringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategorizeType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    public boolean isSetContent() {
        return ((this.content!= null)&&(!this.content.isEmpty()));
    }

    public void unsetContent() {
        this.content = null;
    }

}

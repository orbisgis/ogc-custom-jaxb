//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.fes._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.se._2_0.core.CategorizeType;
import net.opengis.se._2_0.core.ChangeCaseType;
import net.opengis.se._2_0.core.ConcatenateType;
import net.opengis.se._2_0.core.DimensionType;
import net.opengis.se._2_0.core.FormatDateType;
import net.opengis.se._2_0.core.FormatNumberType;
import net.opengis.se._2_0.core.InterpolateType;
import net.opengis.se._2_0.core.RecodeType;
import net.opengis.se._2_0.core.StringLengthType;
import net.opengis.se._2_0.core.StringPositionType;
import net.opengis.se._2_0.core.SubstringType;
import net.opengis.se._2_0.core.TrimType;


/**
 * <p>Classe Java pour PropertyIsBetweenType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PropertyIsBetweenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/fes/2.1}ComparisonOpsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/fes/2.1}expression"/>
 *         &lt;element name="LowerBoundary" type="{http://www.opengis.net/fes/2.1}LowerBoundaryType"/>
 *         &lt;element name="UpperBoundary" type="{http://www.opengis.net/fes/2.1}UpperBoundaryType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyIsBetweenType", propOrder = {
    "expression",
    "lowerBoundary",
    "upperBoundary"
})
public class PropertyIsBetweenType
    extends ComparisonOpsType
{

    @XmlElementRef(name = "expression", namespace = "http://www.opengis.net/fes/2.1", type = JAXBElement.class)
    protected JAXBElement<?> expression;
    @XmlElement(name = "LowerBoundary", required = true)
    protected LowerBoundaryType lowerBoundary;
    @XmlElement(name = "UpperBoundary", required = true)
    protected UpperBoundaryType upperBoundary;

    /**
     * Obtient la valeur de la propriété expression.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link net.opengis.fes._2.FunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.se._2_0.core.FunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrimType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DimensionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterpolateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FormatNumberType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link FormatDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringLengthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConcatenateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubstringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategorizeType }{@code >}
     *     
     */
    public JAXBElement<?> getExpression() {
        return expression;
    }

    /**
     * Définit la valeur de la propriété expression.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link net.opengis.fes._2.FunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.se._2_0.core.FunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrimType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DimensionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterpolateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FormatNumberType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link FormatDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringLengthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConcatenateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubstringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategorizeType }{@code >}
     *     
     */
    public void setExpression(JAXBElement<?> value) {
        this.expression = value;
    }

    public boolean isSetExpression() {
        return (this.expression!= null);
    }

    /**
     * Obtient la valeur de la propriété lowerBoundary.
     * 
     * @return
     *     possible object is
     *     {@link LowerBoundaryType }
     *     
     */
    public LowerBoundaryType getLowerBoundary() {
        return lowerBoundary;
    }

    /**
     * Définit la valeur de la propriété lowerBoundary.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerBoundaryType }
     *     
     */
    public void setLowerBoundary(LowerBoundaryType value) {
        this.lowerBoundary = value;
    }

    public boolean isSetLowerBoundary() {
        return (this.lowerBoundary!= null);
    }

    /**
     * Obtient la valeur de la propriété upperBoundary.
     * 
     * @return
     *     possible object is
     *     {@link UpperBoundaryType }
     *     
     */
    public UpperBoundaryType getUpperBoundary() {
        return upperBoundary;
    }

    /**
     * Définit la valeur de la propriété upperBoundary.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperBoundaryType }
     *     
     */
    public void setUpperBoundary(UpperBoundaryType value) {
        this.upperBoundary = value;
    }

    public boolean isSetUpperBoundary() {
        return (this.upperBoundary!= null);
    }

}

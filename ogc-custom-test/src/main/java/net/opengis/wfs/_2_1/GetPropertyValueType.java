//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.AbstractAdhocQueryExpressionType;
import net.opengis.fes._2.AbstractQueryExpressionType;


/**
 * <p>Classe Java pour GetPropertyValueType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetPropertyValueType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wfs/2.1}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/fes/2.1}AbstractQueryExpression"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/wfs/2.1}StandardPresentationParameters"/>
 *       &lt;attGroup ref="{http://www.opengis.net/wfs/2.1}StandardResolveParameters"/>
 *       &lt;attribute name="valueReference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resolvePath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPropertyValueType", propOrder = {
    "abstractQueryExpression"
})
public class GetPropertyValueType
    extends BaseRequestType
{

    @XmlElementRef(name = "AbstractQueryExpression", namespace = "http://www.opengis.net/fes/2.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractQueryExpressionType> abstractQueryExpression;
    @XmlAttribute(name = "valueReference", required = true)
    protected String valueReference;
    @XmlAttribute(name = "resolvePath")
    protected String resolvePath;
    @XmlAttribute(name = "startIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger startIndex;
    @XmlAttribute(name = "count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlAttribute(name = "resultType")
    protected ResultTypeType resultType;
    @XmlAttribute(name = "outputFormat")
    protected String outputFormat;
    @XmlAttribute(name = "resolve")
    protected ResolveValueType resolve;
    @XmlAttribute(name = "resolveDepth")
    protected String resolveDepth;
    @XmlAttribute(name = "resolveTimeout")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger resolveTimeout;

    /**
     * Obtient la valeur de la propriété abstractQueryExpression.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StoredQueryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractQueryExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link QueryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAdhocQueryExpressionType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractQueryExpressionType> getAbstractQueryExpression() {
        return abstractQueryExpression;
    }

    /**
     * Définit la valeur de la propriété abstractQueryExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StoredQueryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractQueryExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link QueryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAdhocQueryExpressionType }{@code >}
     *     
     */
    public void setAbstractQueryExpression(JAXBElement<? extends AbstractQueryExpressionType> value) {
        this.abstractQueryExpression = value;
    }

    public boolean isSetAbstractQueryExpression() {
        return (this.abstractQueryExpression!= null);
    }

    /**
     * Obtient la valeur de la propriété valueReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueReference() {
        return valueReference;
    }

    /**
     * Définit la valeur de la propriété valueReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueReference(String value) {
        this.valueReference = value;
    }

    public boolean isSetValueReference() {
        return (this.valueReference!= null);
    }

    /**
     * Obtient la valeur de la propriété resolvePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolvePath() {
        return resolvePath;
    }

    /**
     * Définit la valeur de la propriété resolvePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolvePath(String value) {
        this.resolvePath = value;
    }

    public boolean isSetResolvePath() {
        return (this.resolvePath!= null);
    }

    /**
     * Obtient la valeur de la propriété startIndex.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartIndex() {
        if (startIndex == null) {
            return new BigInteger("0");
        } else {
            return startIndex;
        }
    }

    /**
     * Définit la valeur de la propriété startIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartIndex(BigInteger value) {
        this.startIndex = value;
    }

    public boolean isSetStartIndex() {
        return (this.startIndex!= null);
    }

    /**
     * Obtient la valeur de la propriété count.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Définit la valeur de la propriété count.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    public boolean isSetCount() {
        return (this.count!= null);
    }

    /**
     * Obtient la valeur de la propriété resultType.
     * 
     * @return
     *     possible object is
     *     {@link ResultTypeType }
     *     
     */
    public ResultTypeType getResultType() {
        if (resultType == null) {
            return ResultTypeType.RESULTS;
        } else {
            return resultType;
        }
    }

    /**
     * Définit la valeur de la propriété resultType.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultTypeType }
     *     
     */
    public void setResultType(ResultTypeType value) {
        this.resultType = value;
    }

    public boolean isSetResultType() {
        return (this.resultType!= null);
    }

    /**
     * Obtient la valeur de la propriété outputFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFormat() {
        if (outputFormat == null) {
            return "application/gml+xml; version=3.2";
        } else {
            return outputFormat;
        }
    }

    /**
     * Définit la valeur de la propriété outputFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFormat(String value) {
        this.outputFormat = value;
    }

    public boolean isSetOutputFormat() {
        return (this.outputFormat!= null);
    }

    /**
     * Obtient la valeur de la propriété resolve.
     * 
     * @return
     *     possible object is
     *     {@link ResolveValueType }
     *     
     */
    public ResolveValueType getResolve() {
        if (resolve == null) {
            return ResolveValueType.NONE;
        } else {
            return resolve;
        }
    }

    /**
     * Définit la valeur de la propriété resolve.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolveValueType }
     *     
     */
    public void setResolve(ResolveValueType value) {
        this.resolve = value;
    }

    public boolean isSetResolve() {
        return (this.resolve!= null);
    }

    /**
     * Obtient la valeur de la propriété resolveDepth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolveDepth() {
        if (resolveDepth == null) {
            return "*";
        } else {
            return resolveDepth;
        }
    }

    /**
     * Définit la valeur de la propriété resolveDepth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolveDepth(String value) {
        this.resolveDepth = value;
    }

    public boolean isSetResolveDepth() {
        return (this.resolveDepth!= null);
    }

    /**
     * Obtient la valeur de la propriété resolveTimeout.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResolveTimeout() {
        if (resolveTimeout == null) {
            return new BigInteger("300");
        } else {
            return resolveTimeout;
        }
    }

    /**
     * Définit la valeur de la propriété resolveTimeout.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResolveTimeout(BigInteger value) {
        this.resolveTimeout = value;
    }

    public boolean isSetResolveTimeout() {
        return (this.resolveTimeout!= null);
    }

}

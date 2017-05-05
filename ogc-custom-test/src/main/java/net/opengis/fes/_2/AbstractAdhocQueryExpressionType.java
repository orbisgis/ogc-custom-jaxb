//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.fes._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.wfs._2_1.PropertyName;
import net.opengis.wfs._2_1.QueryType;


/**
 * <p>Classe Java pour AbstractAdhocQueryExpressionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractAdhocQueryExpressionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/fes/2.1}AbstractQueryExpressionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/fes/2.1}AbstractProjectionClause" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/fes/2.1}AbstractSelectionClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/fes/2.1}AbstractSortingClause" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="typeNames" use="required" type="{http://www.opengis.net/fes/2.1}TypeNamesListType" />
 *       &lt;attribute name="aliases" type="{http://www.opengis.net/fes/2.1}AliasesType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAdhocQueryExpressionType", propOrder = {
    "abstractProjectionClause",
    "abstractSelectionClause",
    "abstractSortingClause"
})
@XmlSeeAlso({
    QueryType.class
})
public abstract class AbstractAdhocQueryExpressionType
    extends AbstractQueryExpressionType
{

    @XmlElementRef(name = "AbstractProjectionClause", namespace = "http://www.opengis.net/fes/2.1", type = JAXBElement.class)
    protected List<JAXBElement<?>> abstractProjectionClause;
    @XmlElementRef(name = "AbstractSelectionClause", namespace = "http://www.opengis.net/fes/2.1", type = JAXBElement.class)
    protected JAXBElement<?> abstractSelectionClause;
    @XmlElementRef(name = "AbstractSortingClause", namespace = "http://www.opengis.net/fes/2.1", type = JAXBElement.class)
    protected JAXBElement<?> abstractSortingClause;
    @XmlAttribute(name = "typeNames", required = true)
    protected List<String> typeNames;
    @XmlAttribute(name = "aliases")
    protected List<String> aliases;

    /**
     * Gets the value of the abstractProjectionClause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractProjectionClause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractProjectionClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyName }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractProjectionClause() {
        if (abstractProjectionClause == null) {
            abstractProjectionClause = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractProjectionClause;
    }

    public boolean isSetAbstractProjectionClause() {
        return ((this.abstractProjectionClause!= null)&&(!this.abstractProjectionClause.isEmpty()));
    }

    public void unsetAbstractProjectionClause() {
        this.abstractProjectionClause = null;
    }

    /**
     * Obtient la valeur de la propriété abstractSelectionClause.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getAbstractSelectionClause() {
        return abstractSelectionClause;
    }

    /**
     * Définit la valeur de la propriété abstractSelectionClause.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setAbstractSelectionClause(JAXBElement<?> value) {
        this.abstractSelectionClause = value;
    }

    public boolean isSetAbstractSelectionClause() {
        return (this.abstractSelectionClause!= null);
    }

    /**
     * Obtient la valeur de la propriété abstractSortingClause.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link SortByType }{@code >}
     *     
     */
    public JAXBElement<?> getAbstractSortingClause() {
        return abstractSortingClause;
    }

    /**
     * Définit la valeur de la propriété abstractSortingClause.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link SortByType }{@code >}
     *     
     */
    public void setAbstractSortingClause(JAXBElement<?> value) {
        this.abstractSortingClause = value;
    }

    public boolean isSetAbstractSortingClause() {
        return (this.abstractSortingClause!= null);
    }

    /**
     * Gets the value of the typeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeNames() {
        if (typeNames == null) {
            typeNames = new ArrayList<String>();
        }
        return this.typeNames;
    }

    public boolean isSetTypeNames() {
        return ((this.typeNames!= null)&&(!this.typeNames.isEmpty()));
    }

    public void unsetTypeNames() {
        this.typeNames = null;
    }

    /**
     * Gets the value of the aliases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAliases() {
        if (aliases == null) {
            aliases = new ArrayList<String>();
        }
        return this.aliases;
    }

    public boolean isSetAliases() {
        return ((this.aliases!= null)&&(!this.aliases.isEmpty()));
    }

    public void unsetAliases() {
        this.aliases = null;
    }

}

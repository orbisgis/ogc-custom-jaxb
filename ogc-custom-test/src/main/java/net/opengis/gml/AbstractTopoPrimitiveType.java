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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AbstractTopoPrimitiveType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractTopoPrimitiveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopologyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}isolated" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}container" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTopoPrimitiveType", propOrder = {
    "isolated",
    "container"
})
@XmlSeeAlso({
    TopoSolidType.class,
    EdgeType.class,
    NodeType.class,
    FaceType.class
})
public abstract class AbstractTopoPrimitiveType
    extends AbstractTopologyType
{

    protected List<IsolatedPropertyType> isolated;
    protected ContainerPropertyType container;

    /**
     * Gets the value of the isolated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isolated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsolated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsolatedPropertyType }
     * 
     * 
     */
    public List<IsolatedPropertyType> getIsolated() {
        if (isolated == null) {
            isolated = new ArrayList<IsolatedPropertyType>();
        }
        return this.isolated;
    }

    public boolean isSetIsolated() {
        return ((this.isolated!= null)&&(!this.isolated.isEmpty()));
    }

    public void unsetIsolated() {
        this.isolated = null;
    }

    /**
     * Obtient la valeur de la propriété container.
     * 
     * @return
     *     possible object is
     *     {@link ContainerPropertyType }
     *     
     */
    public ContainerPropertyType getContainer() {
        return container;
    }

    /**
     * Définit la valeur de la propriété container.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerPropertyType }
     *     
     */
    public void setContainer(ContainerPropertyType value) {
        this.container = value;
    }

    public boolean isSetContainer() {
        return (this.container!= null);
    }

}

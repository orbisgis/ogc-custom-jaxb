//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * A property that has a geometric complex as its value domain can either be an appropriate geometry element encapsulated in an element of this type or an XLink reference to a remote geometry element (where remote includes geometry elements located elsewhere in the same document). Either the reference or the contained element must be given, but neither both nor none.
 * NOTE: The allowed geometry elements contained in such a property (or referenced by it) have to be modelled by an XML Schema choice element since the composites inherit both from geometric complex *and* geometric primitive and are already part of the _GeometricPrimitive substitution group.
 * 
 * <p>Classe Java pour GeometricComplexPropertyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeometricComplexPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}GeometricComplex"/>
 *           &lt;element ref="{http://www.opengis.net/gml}CompositeCurve"/>
 *           &lt;element ref="{http://www.opengis.net/gml}CompositeSurface"/>
 *           &lt;element ref="{http://www.opengis.net/gml}CompositeSolid"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometricComplexPropertyType", propOrder = {
    "geometricComplex",
    "compositeCurve",
    "compositeSurface",
    "compositeSolid"
})
public class GeometricComplexPropertyType {

    @XmlElement(name = "GeometricComplex")
    protected GeometricComplexType geometricComplex;
    @XmlElement(name = "CompositeCurve")
    protected CompositeCurveType compositeCurve;
    @XmlElement(name = "CompositeSurface")
    protected CompositeSurfaceType compositeSurface;
    @XmlElement(name = "CompositeSolid")
    protected CompositeSolidType compositeSolid;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    public final static TypeType TYPE = TypeType.SIMPLE;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Obtient la valeur de la propriété geometricComplex.
     * 
     * @return
     *     possible object is
     *     {@link GeometricComplexType }
     *     
     */
    public GeometricComplexType getGeometricComplex() {
        return geometricComplex;
    }

    /**
     * Définit la valeur de la propriété geometricComplex.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometricComplexType }
     *     
     */
    public void setGeometricComplex(GeometricComplexType value) {
        this.geometricComplex = value;
    }

    public boolean isSetGeometricComplex() {
        return (this.geometricComplex!= null);
    }

    /**
     * Obtient la valeur de la propriété compositeCurve.
     * 
     * @return
     *     possible object is
     *     {@link CompositeCurveType }
     *     
     */
    public CompositeCurveType getCompositeCurve() {
        return compositeCurve;
    }

    /**
     * Définit la valeur de la propriété compositeCurve.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeCurveType }
     *     
     */
    public void setCompositeCurve(CompositeCurveType value) {
        this.compositeCurve = value;
    }

    public boolean isSetCompositeCurve() {
        return (this.compositeCurve!= null);
    }

    /**
     * Obtient la valeur de la propriété compositeSurface.
     * 
     * @return
     *     possible object is
     *     {@link CompositeSurfaceType }
     *     
     */
    public CompositeSurfaceType getCompositeSurface() {
        return compositeSurface;
    }

    /**
     * Définit la valeur de la propriété compositeSurface.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeSurfaceType }
     *     
     */
    public void setCompositeSurface(CompositeSurfaceType value) {
        this.compositeSurface = value;
    }

    public boolean isSetCompositeSurface() {
        return (this.compositeSurface!= null);
    }

    /**
     * Obtient la valeur de la propriété compositeSolid.
     * 
     * @return
     *     possible object is
     *     {@link CompositeSolidType }
     *     
     */
    public CompositeSolidType getCompositeSolid() {
        return compositeSolid;
    }

    /**
     * Définit la valeur de la propriété compositeSolid.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeSolidType }
     *     
     */
    public void setCompositeSolid(CompositeSolidType value) {
        this.compositeSolid = value;
    }

    public boolean isSetCompositeSolid() {
        return (this.compositeSolid!= null);
    }

    /**
     * Obtient la valeur de la propriété remoteSchema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Définit la valeur de la propriété remoteSchema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Obtient la valeur de la propriété href.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Définit la valeur de la propriété href.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Obtient la valeur de la propriété role.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Définit la valeur de la propriété role.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Obtient la valeur de la propriété arcrole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Définit la valeur de la propriété arcrole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Obtient la valeur de la propriété show.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Définit la valeur de la propriété show.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Obtient la valeur de la propriété actuate.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Définit la valeur de la propriété actuate.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
    }

}

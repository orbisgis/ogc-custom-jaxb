//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="CRS" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minx" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="miny" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="maxx" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="maxy" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="resx" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="resy" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BoundingBox")
public class BoundingBox {

    @XmlAttribute(name = "CRS", required = true)
    protected String crs;
    @XmlAttribute(name = "minx", required = true)
    protected double minx;
    @XmlAttribute(name = "miny", required = true)
    protected double miny;
    @XmlAttribute(name = "maxx", required = true)
    protected double maxx;
    @XmlAttribute(name = "maxy", required = true)
    protected double maxy;
    @XmlAttribute(name = "resx")
    protected Double resx;
    @XmlAttribute(name = "resy")
    protected Double resy;

    /**
     * Obtient la valeur de la propriété crs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRS() {
        return crs;
    }

    /**
     * Définit la valeur de la propriété crs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRS(String value) {
        this.crs = value;
    }

    public boolean isSetCRS() {
        return (this.crs!= null);
    }

    /**
     * Obtient la valeur de la propriété minx.
     * 
     */
    public double getMinx() {
        return minx;
    }

    /**
     * Définit la valeur de la propriété minx.
     * 
     */
    public void setMinx(double value) {
        this.minx = value;
    }

    public boolean isSetMinx() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété miny.
     * 
     */
    public double getMiny() {
        return miny;
    }

    /**
     * Définit la valeur de la propriété miny.
     * 
     */
    public void setMiny(double value) {
        this.miny = value;
    }

    public boolean isSetMiny() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété maxx.
     * 
     */
    public double getMaxx() {
        return maxx;
    }

    /**
     * Définit la valeur de la propriété maxx.
     * 
     */
    public void setMaxx(double value) {
        this.maxx = value;
    }

    public boolean isSetMaxx() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété maxy.
     * 
     */
    public double getMaxy() {
        return maxy;
    }

    /**
     * Définit la valeur de la propriété maxy.
     * 
     */
    public void setMaxy(double value) {
        this.maxy = value;
    }

    public boolean isSetMaxy() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété resx.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getResx() {
        return resx;
    }

    /**
     * Définit la valeur de la propriété resx.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResx(double value) {
        this.resx = value;
    }

    public boolean isSetResx() {
        return (this.resx!= null);
    }

    public void unsetResx() {
        this.resx = null;
    }

    /**
     * Obtient la valeur de la propriété resy.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getResy() {
        return resy;
    }

    /**
     * Définit la valeur de la propriété resy.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResy(double value) {
        this.resy = value;
    }

    public boolean isSetResy() {
        return (this.resy!= null);
    }

    public void unsetResy() {
        this.resy = null;
    }

}

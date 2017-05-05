//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.kml._2_2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour vec2Type complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="vec2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}double" default="1.0" />
 *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}double" default="1.0" />
 *       &lt;attribute name="xunits" type="{http://www.opengis.net/kml/2.2}unitsEnumType" default="fraction" />
 *       &lt;attribute name="yunits" type="{http://www.opengis.net/kml/2.2}unitsEnumType" default="fraction" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vec2Type")
public class Vec2Type {

    @XmlAttribute(name = "x")
    protected Double x;
    @XmlAttribute(name = "y")
    protected Double y;
    @XmlAttribute(name = "xunits")
    protected UnitsEnumType xunits;
    @XmlAttribute(name = "yunits")
    protected UnitsEnumType yunits;

    /**
     * Obtient la valeur de la propriété x.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getX() {
        if (x == null) {
            return  1.0D;
        } else {
            return x;
        }
    }

    /**
     * Définit la valeur de la propriété x.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX(double value) {
        this.x = value;
    }

    public boolean isSetX() {
        return (this.x!= null);
    }

    public void unsetX() {
        this.x = null;
    }

    /**
     * Obtient la valeur de la propriété y.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getY() {
        if (y == null) {
            return  1.0D;
        } else {
            return y;
        }
    }

    /**
     * Définit la valeur de la propriété y.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setY(double value) {
        this.y = value;
    }

    public boolean isSetY() {
        return (this.y!= null);
    }

    public void unsetY() {
        this.y = null;
    }

    /**
     * Obtient la valeur de la propriété xunits.
     * 
     * @return
     *     possible object is
     *     {@link UnitsEnumType }
     *     
     */
    public UnitsEnumType getXunits() {
        if (xunits == null) {
            return UnitsEnumType.FRACTION;
        } else {
            return xunits;
        }
    }

    /**
     * Définit la valeur de la propriété xunits.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsEnumType }
     *     
     */
    public void setXunits(UnitsEnumType value) {
        this.xunits = value;
    }

    public boolean isSetXunits() {
        return (this.xunits!= null);
    }

    /**
     * Obtient la valeur de la propriété yunits.
     * 
     * @return
     *     possible object is
     *     {@link UnitsEnumType }
     *     
     */
    public UnitsEnumType getYunits() {
        if (yunits == null) {
            return UnitsEnumType.FRACTION;
        } else {
            return yunits;
        }
    }

    /**
     * Définit la valeur de la propriété yunits.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsEnumType }
     *     
     */
    public void setYunits(UnitsEnumType value) {
        this.yunits = value;
    }

    public boolean isSetYunits() {
        return (this.yunits!= null);
    }

}

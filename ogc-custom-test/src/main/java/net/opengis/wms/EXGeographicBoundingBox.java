//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence>
 *         &lt;element name="westBoundLongitude" type="{http://www.opengis.net/wms}longitudeType"/>
 *         &lt;element name="eastBoundLongitude" type="{http://www.opengis.net/wms}longitudeType"/>
 *         &lt;element name="southBoundLatitude" type="{http://www.opengis.net/wms}latitudeType"/>
 *         &lt;element name="northBoundLatitude" type="{http://www.opengis.net/wms}latitudeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "westBoundLongitude",
    "eastBoundLongitude",
    "southBoundLatitude",
    "northBoundLatitude"
})
@XmlRootElement(name = "EX_GeographicBoundingBox")
public class EXGeographicBoundingBox {

    protected double westBoundLongitude;
    protected double eastBoundLongitude;
    protected double southBoundLatitude;
    protected double northBoundLatitude;

    /**
     * Obtient la valeur de la propriété westBoundLongitude.
     * 
     */
    public double getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * Définit la valeur de la propriété westBoundLongitude.
     * 
     */
    public void setWestBoundLongitude(double value) {
        this.westBoundLongitude = value;
    }

    public boolean isSetWestBoundLongitude() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété eastBoundLongitude.
     * 
     */
    public double getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * Définit la valeur de la propriété eastBoundLongitude.
     * 
     */
    public void setEastBoundLongitude(double value) {
        this.eastBoundLongitude = value;
    }

    public boolean isSetEastBoundLongitude() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété southBoundLatitude.
     * 
     */
    public double getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * Définit la valeur de la propriété southBoundLatitude.
     * 
     */
    public void setSouthBoundLatitude(double value) {
        this.southBoundLatitude = value;
    }

    public boolean isSetSouthBoundLatitude() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété northBoundLatitude.
     * 
     */
    public double getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * Définit la valeur de la propriété northBoundLatitude.
     * 
     */
    public void setNorthBoundLatitude(double value) {
        this.northBoundLatitude = value;
    }

    public boolean isSetNorthBoundLatitude() {
        return true;
    }

}

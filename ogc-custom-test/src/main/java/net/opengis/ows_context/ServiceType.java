//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour serviceType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="urn:ogc:serviceType:WMS"/>
 *     &lt;enumeration value="urn:ogc:serviceType:WFS"/>
 *     &lt;enumeration value="urn:ogc:serviceType:WCS"/>
 *     &lt;enumeration value="urn:ogc:serviceType:GML"/>
 *     &lt;enumeration value="urn:ogc:serviceType:SLD"/>
 *     &lt;enumeration value="urn:ogc:serviceType:FES"/>
 *     &lt;enumeration value="urn:ogc:serviceType:KML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceType")
@XmlEnum
public enum ServiceType {

    @XmlEnumValue("urn:ogc:serviceType:WMS")
    URN_OGC_SERVICE_TYPE_WMS("urn:ogc:serviceType:WMS"),
    @XmlEnumValue("urn:ogc:serviceType:WFS")
    URN_OGC_SERVICE_TYPE_WFS("urn:ogc:serviceType:WFS"),
    @XmlEnumValue("urn:ogc:serviceType:WCS")
    URN_OGC_SERVICE_TYPE_WCS("urn:ogc:serviceType:WCS"),
    @XmlEnumValue("urn:ogc:serviceType:GML")
    URN_OGC_SERVICE_TYPE_GML("urn:ogc:serviceType:GML"),
    @XmlEnumValue("urn:ogc:serviceType:SLD")
    URN_OGC_SERVICE_TYPE_SLD("urn:ogc:serviceType:SLD"),
    @XmlEnumValue("urn:ogc:serviceType:FES")
    URN_OGC_SERVICE_TYPE_FES("urn:ogc:serviceType:FES"),
    @XmlEnumValue("urn:ogc:serviceType:KML")
    URN_OGC_SERVICE_TYPE_KML("urn:ogc:serviceType:KML");
    private final String value;

    ServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceType fromValue(String v) {
        for (ServiceType c: ServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.thematic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AxisChartSubtypeType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AxisChartSubtypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ortho"/>
 *     &lt;enumeration value="polar"/>
 *     &lt;enumeration value="stacked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxisChartSubtypeType")
@XmlEnum
public enum AxisChartSubtypeType {

    @XmlEnumValue("ortho")
    ORTHO("ortho"),
    @XmlEnumValue("polar")
    POLAR("polar"),
    @XmlEnumValue("stacked")
    STACKED("stacked");
    private final String value;

    AxisChartSubtypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxisChartSubtypeType fromValue(String v) {
        for (AxisChartSubtypeType c: AxisChartSubtypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

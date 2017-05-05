//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ThresholdBelongsToType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ThresholdBelongsToType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="succeeding"/>
 *     &lt;enumeration value="preceding"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThresholdBelongsToType")
@XmlEnum
public enum ThresholdBelongsToType {

    @XmlEnumValue("succeeding")
    SUCCEEDING("succeeding"),
    @XmlEnumValue("preceding")
    PRECEDING("preceding");
    private final String value;

    ThresholdBelongsToType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThresholdBelongsToType fromValue(String v) {
        for (ThresholdBelongsToType c: ThresholdBelongsToType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

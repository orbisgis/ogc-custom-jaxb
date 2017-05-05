//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package org.w3._2001.smil20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour fillTimingAttrsType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="fillTimingAttrsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="freeze"/>
 *     &lt;enumeration value="hold"/>
 *     &lt;enumeration value="auto"/>
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="transition"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fillTimingAttrsType")
@XmlEnum
public enum FillTimingAttrsType {

    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("freeze")
    FREEZE("freeze"),
    @XmlEnumValue("hold")
    HOLD("hold"),
    @XmlEnumValue("auto")
    AUTO("auto"),
    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("transition")
    TRANSITION("transition");
    private final String value;

    FillTimingAttrsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FillTimingAttrsType fromValue(String v) {
        for (FillTimingAttrsType c: FillTimingAttrsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

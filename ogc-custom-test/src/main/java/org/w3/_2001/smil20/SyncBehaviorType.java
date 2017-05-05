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
 * <p>Classe Java pour syncBehaviorType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="syncBehaviorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="canSlip"/>
 *     &lt;enumeration value="locked"/>
 *     &lt;enumeration value="independent"/>
 *     &lt;enumeration value="default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "syncBehaviorType")
@XmlEnum
public enum SyncBehaviorType {

    @XmlEnumValue("canSlip")
    CAN_SLIP("canSlip"),
    @XmlEnumValue("locked")
    LOCKED("locked"),
    @XmlEnumValue("independent")
    INDEPENDENT("independent"),
    @XmlEnumValue("default")
    DEFAULT("default");
    private final String value;

    SyncBehaviorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SyncBehaviorType fromValue(String v) {
        for (SyncBehaviorType c: SyncBehaviorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

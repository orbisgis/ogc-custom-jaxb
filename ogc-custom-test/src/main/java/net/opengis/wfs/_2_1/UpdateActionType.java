//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour UpdateActionType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="insertBefore"/>
 *     &lt;enumeration value="insertAfter"/>
 *     &lt;enumeration value="remove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateActionType")
@XmlEnum
public enum UpdateActionType {

    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("insertBefore")
    INSERT_BEFORE("insertBefore"),
    @XmlEnumValue("insertAfter")
    INSERT_AFTER("insertAfter"),
    @XmlEnumValue("remove")
    REMOVE("remove");
    private final String value;

    UpdateActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateActionType fromValue(String v) {
        for (UpdateActionType c: UpdateActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

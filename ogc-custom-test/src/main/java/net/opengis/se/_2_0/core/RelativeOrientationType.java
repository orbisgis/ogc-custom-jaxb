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
 * <p>Classe Java pour RelativeOrientationType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RelativeOrientationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="line"/>
 *     &lt;enumeration value="portrayal"/>
 *     &lt;enumeration value="normalUp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelativeOrientationType")
@XmlEnum
public enum RelativeOrientationType {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("portrayal")
    PORTRAYAL("portrayal"),
    @XmlEnumValue("normalUp")
    NORMAL_UP("normalUp");
    private final String value;

    RelativeOrientationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelativeOrientationType fromValue(String v) {
        for (RelativeOrientationType c: RelativeOrientationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

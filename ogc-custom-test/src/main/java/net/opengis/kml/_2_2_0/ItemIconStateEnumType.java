//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.kml._2_2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour itemIconStateEnumType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="itemIconStateEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="closed"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="fetching0"/>
 *     &lt;enumeration value="fetching1"/>
 *     &lt;enumeration value="fetching2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "itemIconStateEnumType")
@XmlEnum
public enum ItemIconStateEnumType {

    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("fetching0")
    FETCHING_0("fetching0"),
    @XmlEnumValue("fetching1")
    FETCHING_1("fetching1"),
    @XmlEnumValue("fetching2")
    FETCHING_2("fetching2");
    private final String value;

    ItemIconStateEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemIconStateEnumType fromValue(String v) {
        for (ItemIconStateEnumType c: ItemIconStateEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

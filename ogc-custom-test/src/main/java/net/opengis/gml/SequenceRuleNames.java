//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SequenceRuleNames.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SequenceRuleNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Linear"/>
 *     &lt;enumeration value="Boustrophedonic"/>
 *     &lt;enumeration value="Cantor-diagonal"/>
 *     &lt;enumeration value="Spiral"/>
 *     &lt;enumeration value="Morton"/>
 *     &lt;enumeration value="Hilbert"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SequenceRuleNames")
@XmlEnum
public enum SequenceRuleNames {

    @XmlEnumValue("Linear")
    LINEAR("Linear"),
    @XmlEnumValue("Boustrophedonic")
    BOUSTROPHEDONIC("Boustrophedonic"),
    @XmlEnumValue("Cantor-diagonal")
    CANTOR_DIAGONAL("Cantor-diagonal"),
    @XmlEnumValue("Spiral")
    SPIRAL("Spiral"),
    @XmlEnumValue("Morton")
    MORTON("Morton"),
    @XmlEnumValue("Hilbert")
    HILBERT("Hilbert");
    private final String value;

    SequenceRuleNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SequenceRuleNames fromValue(String v) {
        for (SequenceRuleNames c: SequenceRuleNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

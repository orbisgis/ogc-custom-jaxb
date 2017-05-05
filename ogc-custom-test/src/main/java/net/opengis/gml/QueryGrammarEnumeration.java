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
 * <p>Classe Java pour QueryGrammarEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryGrammarEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xpath"/>
 *     &lt;enumeration value="xquery"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryGrammarEnumeration")
@XmlEnum
public enum QueryGrammarEnumeration {

    @XmlEnumValue("xpath")
    XPATH("xpath"),
    @XmlEnumValue("xquery")
    XQUERY("xquery"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    QueryGrammarEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryGrammarEnumeration fromValue(String v) {
        for (QueryGrammarEnumeration c: QueryGrammarEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

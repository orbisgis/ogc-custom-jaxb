//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AesheticCriteriaType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AesheticCriteriaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MIN_CROSSINGS"/>
 *     &lt;enumeration value="MIN_AREA"/>
 *     &lt;enumeration value="MIN_BENDS"/>
 *     &lt;enumeration value="MAX_BENDS"/>
 *     &lt;enumeration value="UNIFORM_BENDS"/>
 *     &lt;enumeration value="MIN_SLOPES"/>
 *     &lt;enumeration value="MIN_EDGE_LENGTH"/>
 *     &lt;enumeration value="MAX_EDGE_LENGTH"/>
 *     &lt;enumeration value="UNIFORM_EDGE_LENGTH"/>
 *     &lt;enumeration value="MAX_ANGULAR_RESOLUTION"/>
 *     &lt;enumeration value="MIN_ASPECT_RATIO"/>
 *     &lt;enumeration value="MAX_SYMMETRIES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AesheticCriteriaType")
@XmlEnum
public enum AesheticCriteriaType {

    MIN_CROSSINGS,
    MIN_AREA,
    MIN_BENDS,
    MAX_BENDS,
    UNIFORM_BENDS,
    MIN_SLOPES,
    MIN_EDGE_LENGTH,
    MAX_EDGE_LENGTH,
    UNIFORM_EDGE_LENGTH,
    MAX_ANGULAR_RESOLUTION,
    MIN_ASPECT_RATIO,
    MAX_SYMMETRIES;

    public String value() {
        return name();
    }

    public static AesheticCriteriaType fromValue(String v) {
        return valueOf(v);
    }

}

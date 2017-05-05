//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An ArcByBulge is an arc string with only one arc unit, i.e. two control points and one bulge.
 * 
 * <p>Classe Java pour ArcByBulgeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArcByBulgeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml}ArcStringByBulgeType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice maxOccurs="2" minOccurs="2">
 *             &lt;element ref="{http://www.opengis.net/gml}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="bulge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="normal" type="{http://www.opengis.net/gml}VectorType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numArc" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcByBulgeType")
public class ArcByBulgeType
    extends ArcStringByBulgeType
{


}

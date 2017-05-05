//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wps._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.ows._2.BasicIdentificationType;


/**
 * 
 * 				Description type for process or input/output data items.
 * 			
 * 
 * <p>Classe Java pour DescriptionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/ows/2.0}BasicIdentificationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Title"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Abstract" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Keywords" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Identifier"/>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Metadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionType")
@XmlSeeAlso({
    ProcessDescriptionType.class,
    GenericProcessType.class,
    ProcessSummaryType.class,
    GenericInputType.class,
    GenericOutputType.class,
    InputDescriptionType.class,
    OutputDescriptionType.class
})
public class DescriptionType
    extends BasicIdentificationType
{


}

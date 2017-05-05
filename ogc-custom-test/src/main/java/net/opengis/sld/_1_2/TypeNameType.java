//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.sld._1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java pour TypeNameType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;element ref="{http://www.opengis.net/se/2.0/core}DataTypeName"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeNameType", propOrder = {
    "dataTypeName"
})
public class TypeNameType {

    @XmlElement(name = "DataTypeName", namespace = "http://www.opengis.net/se/2.0/core", required = true)
    protected QName dataTypeName;

    /**
     * Obtient la valeur de la propriété dataTypeName.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getDataTypeName() {
        return dataTypeName;
    }

    /**
     * Définit la valeur de la propriété dataTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setDataTypeName(QName value) {
        this.dataTypeName = value;
    }

    public boolean isSetDataTypeName() {
        return (this.dataTypeName!= null);
    }

}

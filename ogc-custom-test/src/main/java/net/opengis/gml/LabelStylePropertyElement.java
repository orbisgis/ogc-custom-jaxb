//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LabelStylePropertyElement
    extends JAXBElement<LabelStylePropertyType>
{

    protected final static QName NAME = new QName("http://www.opengis.net/gml", "labelStyle");

    public LabelStylePropertyElement(LabelStylePropertyType value) {
        super(NAME, ((Class) LabelStylePropertyType.class), null, value);
    }

    public LabelStylePropertyElement() {
        super(NAME, ((Class) LabelStylePropertyType.class), null, null);
    }

}

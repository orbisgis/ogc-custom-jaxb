//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ASolidElement
    extends JAXBElement<AbstractSolidType>
{

    protected final static QName NAME = new QName("http://www.opengis.net/gml", "_Solid");

    public ASolidElement(AbstractSolidType value) {
        super(NAME, ((Class) AbstractSolidType.class), null, value);
    }

    public ASolidElement() {
        super(NAME, ((Class) AbstractSolidType.class), null, null);
    }

}

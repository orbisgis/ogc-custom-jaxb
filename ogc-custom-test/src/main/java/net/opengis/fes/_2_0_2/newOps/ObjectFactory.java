//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.05.15 � 03:12:35 PM CEST 
//


package net.opengis.fes._2_0_2.newOps;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.fes._2_0_2.newOps package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PropertyExists_QNAME = new QName("http://www.someserver.com/myops/1.0", "PropertyExists");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.fes._2_0_2.newOps
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropertyExistsType }
     * 
     */
    public PropertyExistsType createPropertyExistsType() {
        return new PropertyExistsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyExistsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.someserver.com/myops/1.0", name = "PropertyExists", substitutionHeadNamespace = "http://www.opengis.net/fes/2.0", substitutionHeadName = "comparisonOps")
    public JAXBElement<PropertyExistsType> createPropertyExists(PropertyExistsType value) {
        return new JAXBElement<PropertyExistsType>(_PropertyExists_QNAME, PropertyExistsType.class, value);
    }

}

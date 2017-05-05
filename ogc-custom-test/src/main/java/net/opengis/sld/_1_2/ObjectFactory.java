//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.sld._1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.opengis.wms.OperationType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.sld._1_2 package. 
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

    private final static QName _DescribeLayerResponse_QNAME = new QName("http://www.opengis.net/sld/1.2", "DescribeLayerResponse");
    private final static QName _IsDefault_QNAME = new QName("http://www.opengis.net/sld/1.2", "IsDefault");
    private final static QName _GetMap_QNAME = new QName("http://www.opengis.net/sld/1.2", "GetMap");
    private final static QName _DescribeLayer_QNAME = new QName("http://www.opengis.net/sld/1.2", "DescribeLayer");
    private final static QName _UserDefinedSymbolization_QNAME = new QName("http://www.opengis.net/sld/1.2", "UserDefinedSymbolization");
    private final static QName _GetLegendGraphic_QNAME = new QName("http://www.opengis.net/sld/1.2", "GetLegendGraphic");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.sld._1_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OutputType }
     * 
     */
    public OutputType createOutputType() {
        return new OutputType();
    }

    /**
     * Create an instance of {@link UserStyleElement }
     * 
     */
    public UserStyleElement createUserStyleElement() {
        return new UserStyleElement();
    }

    /**
     * Create an instance of {@link StyledLayerDescriptorElement }
     * 
     */
    public StyledLayerDescriptorElement createStyledLayerDescriptorElement() {
        return new StyledLayerDescriptorElement();
    }

    /**
     * Create an instance of {@link UseSLDLibraryElement }
     * 
     */
    public UseSLDLibraryElement createUseSLDLibraryElement() {
        return new UseSLDLibraryElement();
    }

    /**
     * Create an instance of {@link NamedLayerElement }
     * 
     */
    public NamedLayerElement createNamedLayerElement() {
        return new NamedLayerElement();
    }

    /**
     * Create an instance of {@link NamedStyleElement }
     * 
     */
    public NamedStyleElement createNamedStyleElement() {
        return new NamedStyleElement();
    }

    /**
     * Create an instance of {@link UserDefinedSymbolization }
     * 
     */
    public UserDefinedSymbolization createUserDefinedSymbolization() {
        return new UserDefinedSymbolization();
    }

    /**
     * Create an instance of {@link GetMapType }
     * 
     */
    public GetMapType createGetMapType() {
        return new GetMapType();
    }

    /**
     * Create an instance of {@link DescribeLayerResponseType }
     * 
     */
    public DescribeLayerResponseType createDescribeLayerResponseType() {
        return new DescribeLayerResponseType();
    }

    /**
     * Create an instance of {@link IntervalType }
     * 
     */
    public IntervalType createIntervalType() {
        return new IntervalType();
    }

    /**
     * Create an instance of {@link LayerDescriptionType }
     * 
     */
    public LayerDescriptionType createLayerDescriptionType() {
        return new LayerDescriptionType();
    }

    /**
     * Create an instance of {@link TypeNameType }
     * 
     */
    public TypeNameType createTypeNameType() {
        return new TypeNameType();
    }

    /**
     * Create an instance of {@link ElevationType }
     * 
     */
    public ElevationType createElevationType() {
        return new ElevationType();
    }

    /**
     * Create an instance of {@link OutputType.Size }
     * 
     */
    public OutputType.Size createOutputTypeSize() {
        return new OutputType.Size();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeLayerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/sld/1.2", name = "DescribeLayerResponse")
    public JAXBElement<DescribeLayerResponseType> createDescribeLayerResponse(DescribeLayerResponseType value) {
        return new JAXBElement<DescribeLayerResponseType>(_DescribeLayerResponse_QNAME, DescribeLayerResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/sld/1.2", name = "IsDefault")
    public JAXBElement<Boolean> createIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_IsDefault_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMapType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/sld/1.2", name = "GetMap")
    public JAXBElement<GetMapType> createGetMap(GetMapType value) {
        return new JAXBElement<GetMapType>(_GetMap_QNAME, GetMapType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/sld/1.2", name = "DescribeLayer", substitutionHeadNamespace = "http://www.opengis.net/wms", substitutionHeadName = "_ExtendedOperation")
    public JAXBElement<OperationType> createDescribeLayer(OperationType value) {
        return new JAXBElement<OperationType>(_DescribeLayer_QNAME, OperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedSymbolization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/sld/1.2", name = "UserDefinedSymbolization", substitutionHeadNamespace = "http://www.opengis.net/wms", substitutionHeadName = "_ExtendedCapabilities")
    public JAXBElement<UserDefinedSymbolization> createUserDefinedSymbolization(UserDefinedSymbolization value) {
        return new JAXBElement<UserDefinedSymbolization>(_UserDefinedSymbolization_QNAME, UserDefinedSymbolization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/sld/1.2", name = "GetLegendGraphic", substitutionHeadNamespace = "http://www.opengis.net/wms", substitutionHeadName = "_ExtendedOperation")
    public JAXBElement<OperationType> createGetLegendGraphic(OperationType value) {
        return new JAXBElement<OperationType>(_GetLegendGraphic_QNAME, OperationType.class, null, value);
    }

}

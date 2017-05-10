package org.orbisgis.ogccustomtest;

import net.opengis.fes._2_0_2.*;
import org.junit.*;

import javax.xml.bind.*;
import java.io.*;

/**
 * This class tests the Filter Encoding class generated in ogc-custom-model
 * and follows the requirements of the OGC Standard.
 *
 * @author Vincent QUILLIEN
 */
public class OGC_TestFilterEncoding {


    Unmarshaller unmarshaller;//Object for the process of deserializing XML data into newly created Java content trees.
    Marshaller marshaller;//Object for the process of serializing Java content trees back into XML data.
    ObjectFactory objFactory;//Object used for the creation of class from net.opengis.fes._2_0_2.* .
    InputStream xml;////Object used for save the data from a file of resources.

    /**
     * Initialised the attributes from the class
     * @throws JAXBException
     */
    @Before
    public void initialize() throws JAXBException{
        unmarshaller = org.orbisgis.ogccustomtest.JaxbContainer.JAXBCONTEXT.createUnmarshaller();
        marshaller = org.orbisgis.ogccustomtest.JaxbContainer.JAXBCONTEXT.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        objFactory = new ObjectFactory();


    }


    /**
     * Test of the operator type Resource Identification defined in the FES
     * @throws JAXBException
     */
    @Test
    public void TestResourceIdentification() throws JAXBException {
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_RessourceID.xml");
        JAXBElement ridElement = (JAXBElement) unmarshaller.unmarshal(xml);
        ResourceIdType rid = (ResourceIdType) ridElement.getValue();

        Assert.assertEquals(ridElement.getName().getLocalPart(), "ResourceId");
        Assert.assertEquals(rid.getRid(), "001");
    }

    /**
     * Test of the type Function defined in the FES
     * @throws JAXBException
     */
    @Test
    public void TestFonction() throws JAXBException {
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_function.xml");
        JAXBElement functionElement = (JAXBElement) unmarshaller.unmarshal(xml);
        FunctionType function = (FunctionType) functionElement.getValue();

        Assert.assertEquals(functionElement.getName().getLocalPart(), "Function");
        Assert.assertEquals(function.getExpression().size(), 3);
    }


    /**
     * Test of the type Filter defined in the FES and a part of operator used in the filter
     * @throws JAXBException
     */
    @Test
    public void TestMinimumStandardFilter() throws JAXBException {

        //test PropertyIsEqualTo
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsEqualTo.xml");
        JAXBElement EqualElement = (JAXBElement) unmarshaller.unmarshal(xml);
        FilterType comparisonOps = (FilterType) EqualElement.getValue();

        JAXBElement<BinaryComparisonOpType> Equal = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(EqualElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(Equal.getName().getLocalPart(), "PropertyIsEqualTo");


        //test PropertyIsNotEqualTo
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsNotEqualTo.xml");
        JAXBElement notEqualElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) notEqualElement.getValue();

        JAXBElement<BinaryComparisonOpType> notEqual = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(notEqualElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(notEqual.getName().getLocalPart(), "PropertyIsNotEqualTo");


        //test PropertyIsLessThan
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsLessThan.xml");
        JAXBElement isLessElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isLessElement.getValue();

        JAXBElement<BinaryComparisonOpType> isless = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(isLessElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(isless.getName().getLocalPart(), "PropertyIsLessThan");


        //test PropertyIsGreaterThan
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsGreaterThan.xml");
        JAXBElement isGreaterElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isGreaterElement.getValue();

        JAXBElement<BinaryComparisonOpType> isGreater = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(isGreaterElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(isGreater.getName().getLocalPart(), "PropertyIsGreaterThan");


        //test PropertyIsGreaterThanOrEqualTo
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsGreaterThanOrEqualTo.xml");
        JAXBElement isGreaterOrElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isGreaterOrElement.getValue();

        JAXBElement<BinaryComparisonOpType> isGreaterOr = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(isGreaterOrElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(isGreaterOr.getName().getLocalPart(), "PropertyIsGreaterThanOrEqualTo");

        //test PropertyIsLessThanOrEqualTo
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsLessThanOrEqualTo.xml");
        JAXBElement isLessOrElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isLessOrElement.getValue();

        JAXBElement<BinaryComparisonOpType> isLessOr = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(isGreaterOrElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(isLessOr.getName().getLocalPart(), "PropertyIsLessThanOrEqualTo");



    }


    /**
     * Test of the type Filter defined in the FES and a second part of operator used in the filter
     * @throws JAXBException
     */
    @Test
    public void TestStandardFilter() throws JAXBException {

        //test PropertyIsNull
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsNull.xml");
        JAXBElement isNullElement = (JAXBElement) unmarshaller.unmarshal(xml);
        FilterType comparisonOps = (FilterType) isNullElement.getValue();

        JAXBElement<PropertyIsNullType> isNull = (JAXBElement<PropertyIsNullType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(isNullElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(isNull.getName().getLocalPart(), "PropertyIsNull");

        //test PropertyIsNil
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsNil.xml");
        JAXBElement isNilElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isNilElement.getValue();

        JAXBElement<PropertyIsNullType> isNil = (JAXBElement<PropertyIsNullType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(isNilElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(isNil.getName().getLocalPart(), "PropertyIsNil");


        //test PropertyIsLike
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsLike.xml");
        JAXBElement isLikeElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isLikeElement.getValue();

        JAXBElement<PropertyIsNullType> isLike = (JAXBElement<PropertyIsNullType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(isLikeElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(isLike.getName().getLocalPart(), "PropertyIsLike");


        //test PropertyIsBetween
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsNil.xml");
        JAXBElement isBetweenElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isBetweenElement.getValue();

        JAXBElement<PropertyIsNullType> isBetween = (JAXBElement<PropertyIsNullType>) comparisonOps.getComparisonOps();

        Assert.assertEquals(isBetweenElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals(isBetween.getName().getLocalPart(), "PropertyIsBetween");

    }


    /**
     * Test of the type Bounding-BOX defined in the FES
     * @throws JAXBException
     */
    @Test
    public void TestMinimumSpatialFilter(){
        //To be implemented
    }


    /**
     * Test of the type Bounding-BOX defined in the FES and others spatial operators
     * @throws JAXBException
     */
    @Test
    public void TestSpatialFilter(){
        //To be implemented
    }


    /**
     * Test of the During operator defined in the FES
     * @throws JAXBException
     */
    @Test
    public void TestMinimumTemporalFilter(){
        //To be implemented
    }


    /**
     * Test of the During operator defined in the FES and others spatial operators
     * @throws JAXBException
     */
    @Test
    public void TestTemporalFilter(){
        //To be implemented
    }

    /**
     * Test of the type ResourceId operator defined in the FES with the parameters : version, startTime, endTime.
     * @throws JAXBException
     */
    @Test
    public void TestVersionNavigation(){
        //To be implemented
    }


    /**
     * Test of the type Filter defined in the FES and the operator of sorting.
     * @throws JAXBException
     */
    @Test
    public void TestSorting(){
        //To be implemented
    }


    /**
     * Test of the additional operators not defined in the FES.
     * @throws JAXBException
     */
    @Test
    public void TestExtendedOperators(){
        //To be implemented
    }

    /**
     * Display a xml file
     */
    public void displayFileXML(InputStream flux ){
        try{
            InputStreamReader lecture=new InputStreamReader(flux);
            BufferedReader buff=new BufferedReader(lecture);
            String line;
            while ((line=buff.readLine())!=null ) {
                System.out.println(line);
            }
            buff.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

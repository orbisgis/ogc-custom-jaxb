package org.orbisgis.ogccustomtest;

import net.opengis.fes._2_0_2.*;
import org.junit.*;

import javax.xml.bind.*;
import java.io.*;

/**
 * Created by quillien on 05/05/2017.
 * Test of generate class on .xsd about Filter Encoding Standard
 */
public class OGC_TestFilterEncoding {

    Unmarshaller unmarshaller;
    Marshaller marshaller;
    ObjectFactory objFactory;


    @Before
    public void initialize() throws JAXBException{
        unmarshaller = org.orbisgis.ogccustomtest.JaxbContainer.JAXBCONTEXT.createUnmarshaller();
        marshaller = org.orbisgis.ogccustomtest.JaxbContainer.JAXBCONTEXT.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        objFactory = new ObjectFactory();

    }



    @Test
    public void TestResourceIdentification() throws JAXBException {
        InputStream xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_RessourceID.xml");
        JAXBElement ridElement = (JAXBElement) unmarshaller.unmarshal(xml);
        ResourceIdType rid = (ResourceIdType) ridElement.getValue();

        Assert.assertEquals(ridElement.getName().getLocalPart(), "ResourceId");
        Assert.assertEquals(rid.getRid(), "001");
    }

    @Test
    public void TestMinimumStandardFilter() throws JAXBException {

        //test PropertyIsEqualTo
        InputStream xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsEqualTo.xml");
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

    @Test
    public void TestStandardFilter(){

    }

    @Test
    public void TestMinimumSpatialFilter(){

    }

    @Test
    public void TestSpatialFilter(){

    }

    @Test
    public void TestMinimumTemporalFilter(){

    }


    @Test
    public void TestTemporalFilter(){

    }


    @Test
    public void TestVersionNavigation(){

    }


    @Test
    public void TestSorting(){

    }

    @Test
    public void TestExtendedOperators(){

    }

    @Test
    public void TestMinimumXPath(){

    }

    @Test
    public void TestSchemaElementFunction(){

    }

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

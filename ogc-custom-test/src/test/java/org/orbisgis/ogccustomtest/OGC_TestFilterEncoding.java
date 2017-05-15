package org.orbisgis.ogccustomtest;

import net.opengis.fes._2_0_2.*;
import org.junit.*;

import javax.xml.bind.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * This class tests the Filter Encoding class generated in ogc-custom-model
 * and follows the requirements of the OGC Standard.
 *
 * @author Vincent QUILLIEN
 */
public class OGC_TestFilterEncoding {

    /**Object for the process of deserializing XML data into newly created Java content trees.*/
    Unmarshaller unmarshaller;

    /**Object for the process of serializing Java content trees back into XML data.*/
    Marshaller marshaller;

    /**Object used for the creation of class from net.opengis.fes._2_0_2.* .*/
    ObjectFactory objFactory;

    /**Object used for save the data from a file of resources.*/
    InputStream xml;


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
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_ResourceID.xml");
        JAXBElement ridElement = (JAXBElement) unmarshaller.unmarshal(xml);
        ResourceIdType rid = (ResourceIdType) ridElement.getValue();

        Assert.assertEquals("Error : the input file isn't a ResourceId",ridElement.getName().getLocalPart(), "ResourceId");
        Assert.assertEquals("Error : the filter doesn't have the operator Resource Identification ",rid.getRid(), "001");
    }

    /**
     * Test of the type Function defined in the FES
     * @throws JAXBException
     */
    @Test
    public void TestFonction() throws JAXBException {
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Function.xml");
        JAXBElement functionElement = (JAXBElement) unmarshaller.unmarshal(xml);
        FunctionType function = (FunctionType) functionElement.getValue();

        Assert.assertEquals("Error : the input file isn't a function",functionElement.getName().getLocalPart(), "Function");
        Assert.assertEquals("Error : the filter doesn't have the good number of expressions  ",function.getExpression().size(), 3);
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

        Assert.assertEquals("Error : the input file isn't a Filter",EqualElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsEqualTo ",Equal.getName().getLocalPart(), "PropertyIsEqualTo");


        //test PropertyIsNotEqualTo
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsNotEqualTo.xml");
        JAXBElement notEqualElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) notEqualElement.getValue();

        JAXBElement<BinaryComparisonOpType> notEqual = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals("Error : the input file isn't a Filter",notEqualElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsNotEqualTo",notEqual.getName().getLocalPart(), "PropertyIsNotEqualTo");


        //test PropertyIsLessThan
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsLessThan.xml");
        JAXBElement isLessElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isLessElement.getValue();

        JAXBElement<BinaryComparisonOpType> isless = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals("Error : the input file isn't a Filter",isLessElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsLessThan ",isless.getName().getLocalPart(), "PropertyIsLessThan");


        //test PropertyIsGreaterThan
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsGreaterThan.xml");
        JAXBElement isGreaterElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isGreaterElement.getValue();

        JAXBElement<BinaryComparisonOpType> isGreater = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals("Error : the input file isn't a Filter",isGreaterElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsGreaterThan ",isGreater.getName().getLocalPart(), "PropertyIsGreaterThan");


        //test PropertyIsGreaterThanOrEqualTo
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsGreaterThanOrEqualTo.xml");
        JAXBElement isGreaterOrElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isGreaterOrElement.getValue();

        JAXBElement<BinaryComparisonOpType> isGreaterOr = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals("Error : the input file isn't a Filter",isGreaterOrElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsGreaterThanOrEqualTo ",isGreaterOr.getName().getLocalPart(), "PropertyIsGreaterThanOrEqualTo");

        //test PropertyIsLessThanOrEqualTo
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsLessThanOrEqualTo.xml");
        JAXBElement isLessOrElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isLessOrElement.getValue();

        JAXBElement<BinaryComparisonOpType> isLessOr = (JAXBElement<BinaryComparisonOpType>) comparisonOps.getComparisonOps();

        Assert.assertEquals("Error : the input file isn't a Filter",isGreaterOrElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsLessThanOrEqualTo ",isLessOr.getName().getLocalPart(), "PropertyIsLessThanOrEqualTo");

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

        Assert.assertEquals("Error : the input file isn't a Filter",isNullElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsNull ",isNull.getName().getLocalPart(), "PropertyIsNull");

        //test PropertyIsNil
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsNil.xml");
        JAXBElement isNilElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isNilElement.getValue();

        JAXBElement<PropertyIsNullType> isNil = (JAXBElement<PropertyIsNullType>) comparisonOps.getComparisonOps();

        Assert.assertEquals("Error : the input file isn't a Filter",isNilElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsNil ",isNil.getName().getLocalPart(), "PropertyIsNil");


        //test PropertyIsLike
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsLike.xml");
        JAXBElement isLikeElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isLikeElement.getValue();

        JAXBElement<PropertyIsNullType> isLike = (JAXBElement<PropertyIsNullType>) comparisonOps.getComparisonOps();

        Assert.assertEquals("Error : the input file isn't a Filter",isLikeElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsLike ",isLike.getName().getLocalPart(), "PropertyIsLike");


        //test PropertyIsBetween
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_PropertyIsBetween.xml");
        JAXBElement isBetweenElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) isBetweenElement.getValue();

        JAXBElement<PropertyIsNullType> isBetween = (JAXBElement<PropertyIsNullType>) comparisonOps.getComparisonOps();

        Assert.assertEquals("Error : the input file isn't a Filter",isBetweenElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator PropertyIsBetween ",isBetween.getName().getLocalPart(), "PropertyIsBetween");

    }


    /**
     * Test of the type Bounding-BOX defined in the FES
     * @throws JAXBException
     */
    @Test
    public void TestMinimumSpatialFilter() throws JAXBException {
        //test BBOX
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_BBOX.xml");
        JAXBElement bBoxElement = (JAXBElement) unmarshaller.unmarshal(xml);
        FilterType comparisonOps = (FilterType) bBoxElement.getValue();

        JAXBElement<BBOXType> bBOX = (JAXBElement<BBOXType>) comparisonOps.getSpatialOps();

        Assert.assertEquals("Error : the input file isn't a Filter",bBoxElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator BBOX ",bBOX.getName().getLocalPart(), "BBOX");
    }


    /**
     * Test of the type Bounding-BOX defined in the FES and others spatial operators
     * @throws JAXBException
     */
    @Test
    public void TestSpatialFilter() throws JAXBException {

        //test DWithIn
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_DWithIn.xml");
        JAXBElement dWithInElement = (JAXBElement) unmarshaller.unmarshal(xml);
        FilterType comparisonOps = (FilterType) dWithInElement.getValue();

        JAXBElement<BBOXType> dWithIn = (JAXBElement<BBOXType>) comparisonOps.getSpatialOps();

        Assert.assertEquals("Error : the input file isn't a Filter",dWithInElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator DWithin ",dWithIn.getName().getLocalPart(), "DWithin");

        //test Beyond
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Beyond.xml");
        JAXBElement beyondElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) beyondElement.getValue();

        JAXBElement<BBOXType> beyond = (JAXBElement<BBOXType>) comparisonOps.getSpatialOps();

        Assert.assertEquals("Error : the input file isn't a Filter", beyondElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Beyond ", beyond.getName().getLocalPart(), "Beyond");


        //test Equals
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Equals.xml");
        JAXBElement equalsElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) equalsElement.getValue();

        JAXBElement<BBOXType> equals = (JAXBElement<BBOXType>) comparisonOps.getSpatialOps();

        Assert.assertEquals("Error : the input file isn't a Filter", equalsElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Equals ", equals.getName().getLocalPart(), "Equals");

        //test Disjoint
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Disjoint.xml");
        JAXBElement disjointElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) disjointElement.getValue();

        JAXBElement<BBOXType> disjoint = (JAXBElement<BBOXType>) comparisonOps.getSpatialOps();

        Assert.assertEquals("Error : the input file isn't a Filter", disjointElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Disjoint ", disjoint.getName().getLocalPart(), "Disjoint");

        //test Touches
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Touches.xml");
        JAXBElement touchesElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) touchesElement.getValue();

        JAXBElement<BBOXType> touches = (JAXBElement<BBOXType>) comparisonOps.getSpatialOps();

        Assert.assertEquals("Error : the input file isn't a Filter", touchesElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Touches ", touches.getName().getLocalPart(), "Touches");


        //test Within
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Within.xml");
        JAXBElement withinElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) withinElement.getValue();

        JAXBElement<BBOXType> within = (JAXBElement<BBOXType>) comparisonOps.getSpatialOps();

        Assert.assertEquals("Error : the input file isn't a Filter", withinElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Within ", within.getName().getLocalPart(), "Within");

        //test Overlaps
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Overlaps.xml");
        JAXBElement overlapsElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) overlapsElement.getValue();

        JAXBElement<BBOXType> overlaps = (JAXBElement<BBOXType>) comparisonOps.getSpatialOps();

        Assert.assertEquals("Error : the input file isn't a Filter", overlapsElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Overlaps ", overlaps.getName().getLocalPart(), "Overlaps");

        //test Crosses
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Crosses.xml");
        JAXBElement CrossesElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) CrossesElement.getValue();

        JAXBElement<BBOXType> crosses = (JAXBElement<BBOXType>) comparisonOps.getSpatialOps();

        Assert.assertEquals("Error : the input file isn't a Filter", CrossesElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Crosses ", crosses.getName().getLocalPart(), "Crosses");

    }


    /**
     * Test of the During operator defined in the FES
     * @throws JAXBException
     */
    @Test
    public void TestMinimumTemporalFilter() throws JAXBException {

        //test During
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_During.xml");
        JAXBElement duringElement = (JAXBElement) unmarshaller.unmarshal(xml);
        FilterType comparisonOps = (FilterType) duringElement.getValue();

        JAXBElement<TemporalOpsType> during = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",duringElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator During ",during.getName().getLocalPart(), "During");
    }


    /**
     * Test of the During operator defined in the FES and others spatial operators
     * @throws JAXBException
     */
    @Test
    public void TestTemporalFilter() throws JAXBException {

        //test TEquals
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_TEquals.xml");
        JAXBElement tEqualsElement = (JAXBElement) unmarshaller.unmarshal(xml);
        FilterType comparisonOps = (FilterType) tEqualsElement.getValue();

        JAXBElement<TemporalOpsType> tEquals = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",tEqualsElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator TEquals ",tEquals.getName().getLocalPart(), "TEquals");

        //test TContains
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_TContains.xml");
        JAXBElement tContainsElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) tContainsElement.getValue();

        JAXBElement<TemporalOpsType> tContains = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",tContainsElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator TContains ",tContains.getName().getLocalPart(), "TContains");

        //test TOverlaps
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_TOverlaps.xml");
        JAXBElement tOverlapsElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) tOverlapsElement.getValue();

        JAXBElement<TemporalOpsType> tOverlaps = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",tOverlapsElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator TOverlaps ",tOverlaps.getName().getLocalPart(), "TOverlaps");

        //test After
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_After.xml");
        JAXBElement afterElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) afterElement.getValue();

        JAXBElement<TemporalOpsType> after = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",afterElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator After ",after.getName().getLocalPart(), "After");

        //test Before
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Before.xml");
        JAXBElement beforeElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) beforeElement.getValue();

        JAXBElement<TemporalOpsType> before = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",beforeElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Before ",before.getName().getLocalPart(), "Before");

        //test Begins
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Begins.xml");
        JAXBElement beginsElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) beginsElement.getValue();

        JAXBElement<TemporalOpsType> begins = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",beginsElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Begins ",begins.getName().getLocalPart(), "Begins");

        //test AnyInteracts
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_AnyInteracts.xml");
        JAXBElement anyInteractsElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) anyInteractsElement.getValue();

        JAXBElement<TemporalOpsType> anyInteracts = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",anyInteractsElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator AnyInteracts ",anyInteracts.getName().getLocalPart(), "AnyInteracts");

        //test Meets
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Meets.xml");
        JAXBElement meetsElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) meetsElement.getValue();

        JAXBElement<TemporalOpsType> meets = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",meetsElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator Meets ",meets.getName().getLocalPart(), "Meets");

        //test BegunBy
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_BegunBy.xml");
        JAXBElement begunByElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) begunByElement.getValue();

        JAXBElement<TemporalOpsType> begunBy = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",begunByElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator BegunBy ",begunBy.getName().getLocalPart(), "BegunBy");

        //test OverlappedBy
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_OverlappedBy.xml");
        JAXBElement overlappedByElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) overlappedByElement.getValue();

        JAXBElement<TemporalOpsType> overlapedBy = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",overlappedByElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator OverlappedBy ",overlapedBy.getName().getLocalPart(), "OverlappedBy");

        //test MetBy
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_MetBy.xml");
        JAXBElement metByElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) metByElement.getValue();

        JAXBElement<TemporalOpsType> metBy = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",metByElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator MetBy ",metBy.getName().getLocalPart(), "MetBy");

        //test EndedBy
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_EndedBy.xml");
        JAXBElement endedByElement = (JAXBElement) unmarshaller.unmarshal(xml);
        comparisonOps = (FilterType) endedByElement.getValue();

        JAXBElement<TemporalOpsType> endedBy = (JAXBElement<TemporalOpsType>) comparisonOps.getTemporalOps();

        Assert.assertEquals("Error : the input file isn't a Filter",endedByElement.getName().getLocalPart(), "Filter");
        Assert.assertEquals("Error : the filter doesn't have the operator EndedBy ",endedBy.getName().getLocalPart(), "EndedBy");

    }

    /**
     * Test of the type ResourceId operator defined in the FES with the parameters : version, startTime, endTime.
     * @throws JAXBException
     */
    @Test
    public void TestVersionNavigation() throws JAXBException {

        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_VersionNavig.xml");
        JAXBElement ridElement = (JAXBElement) unmarshaller.unmarshal(xml);
        ResourceIdType rid = (ResourceIdType) ridElement.getValue();

        GregorianCalendar startDate = (rid.getStartDate()).toGregorianCalendar();
        GregorianCalendar endDate = (rid.getEndDate()).toGregorianCalendar();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setTimeZone(startDate.getTimeZone());
        formatter.setTimeZone(endDate.getTimeZone());


        Assert.assertEquals("Error : the input file isn't a ResourceId",ridElement.getName().getLocalPart(), "ResourceId");
        Assert.assertEquals("Error : the filter doesn't have the operator Resource Identification ",rid.getRid(), "001");
        Assert.assertEquals("",rid.getVersion(), "ALL");
        Assert.assertEquals("",formatter.format(startDate.getTime()), "11/05/2017");
        Assert.assertEquals("",formatter.format(endDate.getTime()), "12/05/2017");

    }

    /**
     * Test of the type Filter defined in the FES and the operator of sorting.
     * @throws JAXBException
     */
    @Test
    public void TestSorting() throws JAXBException {
        //test SortBy
        xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_Sorting.xml");
        JAXBElement sortByElement = (JAXBElement) unmarshaller.unmarshal(xml);
        SortByType sortBy= (SortByType) sortByElement.getValue();

        Assert.assertEquals("Error : the input file isn't a SortBy filter ",sortByElement.getName().getLocalPart(), "SortBy");
        Assert.assertEquals("Error : the filter doesn't have the same valueReference ",
                sortBy.getSortProperty().get(0).getValueReference(), "depth");
        Assert.assertEquals("Error : the filter doesn't have the same valueReference ",
                sortBy.getSortProperty().get(1).getValueReference(), "temperature");
    }


}

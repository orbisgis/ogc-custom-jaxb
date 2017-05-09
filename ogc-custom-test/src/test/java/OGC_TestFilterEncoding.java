
import net.opengis.fes._2_0_2.ObjectFactory;
import org.junit.*;

import javax.xml.bind.*;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by quillien on 05/05/2017.
 * Test of generate class on .xsd about Filter Encoding Standard
 */
public class OGC_TestFilterEncoding {

    Unmarshaller unmarshaller;
    Marshaller marshaller;


    @Before
    public void initialize() throws JAXBException{
        unmarshaller = JaxbContainer.JAXBCONTEXT.createUnmarshaller();
        marshaller = JaxbContainer.JAXBCONTEXT.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

    }
    
    


    @Test
    public void TestQuery() throws JAXBException {
        InputStream xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_query.mxl");
        JAXBElement object = unmarshaller.unmarshal((XMLStreamReader) xml, ObjectFactory.class);
        System.out.println(object.getName());
        Assert.assertEquals(object.getName(), "AbstractQueryExpression");
    }

    @Test
    public void TestAdHocQuery() throws JAXBException {
        InputStream xml = OGC_TestFilterEncoding.class.getResourceAsStream("filter_adhoc_query.mxl");
        JAXBElement object = unmarshaller.unmarshal((XMLStreamReader) xml, ObjectFactory.class);

        Assert.assertEquals(object.getName(), "AbstractQueryExpression");

    }

    @Test
    public void TestResourceIdentification(){

    }

    @Test
    public void TestMinimumStandardFilter(){

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


}

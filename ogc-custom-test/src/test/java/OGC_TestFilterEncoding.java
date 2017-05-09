
import net.opengis.fes._2_0_2.*;
import org.junit.*;

import javax.xml.bind.*;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.util.List;

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
        unmarshaller = JaxbContainer.JAXBCONTEXT.createUnmarshaller();
        marshaller = JaxbContainer.JAXBCONTEXT.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        objFactory = new ObjectFactory();

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

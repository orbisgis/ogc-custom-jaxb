
import junit.framework.Assert;
import net.opengis.fes._2_0_2.*;
import net.opengis.wfs._2_1.PropertyType;
import org.junit.*;

import javax.xml.bind.*;
import javax.xml.namespace.QName;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by quillien on 02/05/2017.
 * Test of generate class on .xsd about Filter Encoding Standard
 */
public class TestClassJaxB_FES {
    private static final int NUMBER_FILTER = 27;
    private ArrayList<File> listFile;
    private ArrayList<String> listXMLTag;
    private File XMLInitial;
    private File XMLReturn;

    /**
     * initialisation Create an ArrayList of  File and add of xml files
     */
    @Before
    public void initialize() throws IOException {
        String path;
        listFile = new ArrayList<File>();
        listXMLTag = new ArrayList<String>();
        for(int i=1;i<=NUMBER_FILTER;i++){
            path = "src\\main\\resources\\filtre_test\\filter";
            if(i<10)path += "0";
            path += (i+".xml");
            listFile.add(new File(path));
        }
    }


    /**
     * Test Round-tripping :
     * @throws JAXBException
     * @throws IOException
     */
    @Test
    public void TestXMLFile() throws JAXBException, IOException {

        Assert.assertNotNull("list file is null",listFile);

        Unmarshaller unmarshaller = JaxbContainer.JAXBCONTEXT.createUnmarshaller();
        Marshaller marshaller = JaxbContainer.JAXBCONTEXT.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //the xml file od the list in directory:resources/filtre_test
        for (File filterXML : listFile ) {
            XMLInitial = filterXML;
            addTagXML();
            Object ob = unmarshaller.unmarshal(filterXML);

            marshaller.marshal(ob,new File("src\\main\\resources\\filtre_test\\XMLreturn.xml"));
            XMLReturn = new File("src\\main\\resources\\filtre_test\\XMLreturn.xml");

            Assert.assertEquals(parseXMLReturn(), 0);

            listXMLTag.clear();
        }

    }

    /**
     *
     */
    @Test
    public void TestJavaObject () throws JAXBException {
        ObjectFactory objFactory = new ObjectFactory();

        Marshaller marshaller = JaxbContainer.JAXBCONTEXT.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        Unmarshaller unmarshaller = JaxbContainer.JAXBCONTEXT.createUnmarshaller();

        //filtre 1
        FilterType filter = objFactory.createFilterType();
        BinaryComparisonOpType valueBinary = objFactory.createBinaryComparisonOpType();
        JAXBElement<String> vRef = objFactory.createValueReference("SomeProperty");
        LiteralType literal = objFactory.createLiteralType();
        literal.getContent().add("100");
        JAXBElement<LiteralType> valLiteral = objFactory.createLiteral(literal);
        valueBinary.getExpression().add(vRef);
        valueBinary.getExpression().add(valLiteral);
        JAXBElement<BinaryComparisonOpType> equalTo = objFactory.createPropertyIsEqualTo(valueBinary);
        filter.setComparisonOps(equalTo);
        JAXBElement<FilterType> eleFilter = objFactory.createFilter(filter);

        marshaller.marshal(eleFilter,new File("src\\main\\resources\\filtre_test\\XMLreturn.xml"));
        XMLReturn = new File("src\\main\\resources\\filtre_test\\XMLreturn.xml");
        displayFile(XMLReturn);

        Object ob = unmarshaller.unmarshal(XMLReturn);
        Assert.assertEquals(ob,eleFilter);

        //filtre 2
        filter = objFactory.createFilterType();
        valueBinary = objFactory.createBinaryComparisonOpType();
        vRef = objFactory.createValueReference("DEPTH");
        literal = objFactory.createLiteralType();
        literal.getContent().clear();
        literal.getContent().add("30");
        valLiteral = objFactory.createLiteral(literal);
        valueBinary.getExpression().add(vRef);
        valueBinary.getExpression().add(valLiteral);
        JAXBElement<BinaryComparisonOpType> lessThan = objFactory.createPropertyIsLessThan(valueBinary);
        filter.setComparisonOps(lessThan);
        eleFilter = objFactory.createFilter(filter);


        marshaller.marshal(eleFilter,new File("src\\main\\resources\\filtre_test\\XMLreturn.xml"));
        XMLReturn = new File("src\\main\\resources\\filtre_test\\XMLreturn.xml");
        displayFile(XMLReturn);
        ob = unmarshaller.unmarshal(XMLReturn);

    }


    /**
     *
     */
    public void addTagXML(){
        try{
            InputStream flux=new FileInputStream(XMLInitial);
            InputStreamReader lecture=new InputStreamReader(flux);
            BufferedReader buff=new BufferedReader(lecture);
            String line;
            while ((line=buff.readLine())!=null ) {
                    line = line.trim();
                    if (line.startsWith("<fes")) {
                        int beginning = line.indexOf(":");
                        int end = line.indexOf(">");
                        if((beginning!=(-1)) && (end!=(-1)) ) {
                            listXMLTag.add(line.substring(beginning+1, end));
                        }
                    }
            }
            buff.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     *@return  nbTag number of tag remaining
     */
    public int parseXMLReturn(){
        int nbTag = listXMLTag.size();
        try{
            //read the filter
            InputStream flux = new FileInputStream(XMLReturn);
            InputStreamReader lecture =new InputStreamReader(flux);
            BufferedReader buff = new BufferedReader(lecture);

            String line;
            String subString = "";

            while ((line=buff.readLine())!=null ) {
                String tmp = "";
                line = line.trim();//delete the space
                if (line.startsWith("<ns")) {
                    //select the tag in the line
                    int beginning = line.indexOf(":");
                    int end = line.indexOf(">");
                    if((beginning!=(-1)) && (end!=(-1)) ) {
                        subString = line.substring(beginning + 1, end);
                    }
                }
                if(subString.indexOf("xmlns")!=-1){
                    //for the test filter19, error of space name : gml
                    //the gml name sapce is add in the line
                    //obligate to remove the name space from substring
                    String[] tagWithoutXmlns = subString.split(" ");
                    if(tagWithoutXmlns.length>2){
                        subString = tagWithoutXmlns[0]+" "+tagWithoutXmlns[2];
                    }
                    else{
                        subString = tagWithoutXmlns[0];
                    }
                }
                if(subString.indexOf("ResourceIdentifier")!=-1){
                    //for the test filter19, error of space name : fes and ns18
                    //ResourceIdentifier name="fes:ResourceId"/ against
                    //ResourceIdentifier name="ns18:ResourceId"
                    subString = (subString.split(" "))[0]+" name=\"fes:ResourceId\"/";

                }
                for(String tag : listXMLTag){

                    if(subString.equals(tag)) {


                        if(!(tmp.equals(tag))) nbTag = nbTag - 1;
                        tmp = tag;
                    }
                }
                //remove the tag from the list
                if(tmp!=""){
                    listXMLTag.remove(tmp);
                }

            }
            buff.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return nbTag ;
    }

    public void displayFile(File file){
        try{
            InputStream flux=new FileInputStream(file);
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

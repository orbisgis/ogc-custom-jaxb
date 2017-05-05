//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wps._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.ows._2.CodeType;


/**
 * 
 * 				Schema for a WPS Execute operation request, to execute
 * 				one identified process with the given data and provide the requested
 * 				output data.
 * 			
 * 
 * <p>Classe Java pour ExecuteRequestType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ExecuteRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wps/2.0}RequestBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/2.0}Identifier"/>
 *         &lt;element name="Input" type="{http://www.opengis.net/wps/2.0}DataInputType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Output" type="{http://www.opengis.net/wps/2.0}OutputDefinitionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mode" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="sync"/>
 *             &lt;enumeration value="async"/>
 *             &lt;enumeration value="auto"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="response" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="raw"/>
 *             &lt;enumeration value="document"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteRequestType", propOrder = {
    "identifier",
    "input",
    "output"
})
public class ExecuteRequestType
    extends RequestBaseType
{

    @XmlElement(name = "Identifier", namespace = "http://www.opengis.net/ows/2.0", required = true)
    protected CodeType identifier;
    @XmlElement(name = "Input")
    protected List<DataInputType> input;
    @XmlElement(name = "Output", required = true)
    protected List<OutputDefinitionType> output;
    @XmlAttribute(name = "mode", required = true)
    protected String mode;
    @XmlAttribute(name = "response", required = true)
    protected String response;

    /**
     * 
     * 								Identifier of the process to be executed. All valid process identifiers are
     * 								listed in the wps:Contents section of the Capabilities document.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getIdentifier() {
        return identifier;
    }

    /**
     * Définit la valeur de la propriété identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setIdentifier(CodeType value) {
        this.identifier = value;
    }

    public boolean isSetIdentifier() {
        return (this.identifier!= null);
    }

    /**
     * Gets the value of the input property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the input property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataInputType }
     * 
     * 
     */
    public List<DataInputType> getInput() {
        if (input == null) {
            input = new ArrayList<DataInputType>();
        }
        return this.input;
    }

    public boolean isSetInput() {
        return ((this.input!= null)&&(!this.input.isEmpty()));
    }

    public void unsetInput() {
        this.input = null;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputDefinitionType }
     * 
     * 
     */
    public List<OutputDefinitionType> getOutput() {
        if (output == null) {
            output = new ArrayList<OutputDefinitionType>();
        }
        return this.output;
    }

    public boolean isSetOutput() {
        return ((this.output!= null)&&(!this.output.isEmpty()));
    }

    public void unsetOutput() {
        this.output = null;
    }

    /**
     * Obtient la valeur de la propriété mode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Définit la valeur de la propriété mode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    public boolean isSetMode() {
        return (this.mode!= null);
    }

    /**
     * Obtient la valeur de la propriété response.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Définit la valeur de la propriété response.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

    public boolean isSetResponse() {
        return (this.response!= null);
    }

}

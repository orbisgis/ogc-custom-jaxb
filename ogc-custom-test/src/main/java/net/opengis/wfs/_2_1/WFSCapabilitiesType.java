//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.FilterCapabilities;
import net.opengis.ows._2.CapabilitiesBaseType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * <p>Classe Java pour WFS_CapabilitiesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WFS_CapabilitiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows/2.0}CapabilitiesBaseType">
 *       &lt;sequence>
 *         &lt;element name="WSDL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleAttrs"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.1}FeatureTypeList" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/fes/2.1}Filter_Capabilities" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WFS_CapabilitiesType", propOrder = {
    "wsdl",
    "featureTypeList",
    "filterCapabilities"
})
public class WFSCapabilitiesType
    extends CapabilitiesBaseType
{

    @XmlElement(name = "WSDL")
    protected WFSCapabilitiesType.WSDL wsdl;
    @XmlElement(name = "FeatureTypeList")
    protected FeatureTypeListType featureTypeList;
    @XmlElement(name = "Filter_Capabilities", namespace = "http://www.opengis.net/fes/2.1")
    protected FilterCapabilities filterCapabilities;

    /**
     * Obtient la valeur de la propriété wsdl.
     * 
     * @return
     *     possible object is
     *     {@link WFSCapabilitiesType.WSDL }
     *     
     */
    public WFSCapabilitiesType.WSDL getWSDL() {
        return wsdl;
    }

    /**
     * Définit la valeur de la propriété wsdl.
     * 
     * @param value
     *     allowed object is
     *     {@link WFSCapabilitiesType.WSDL }
     *     
     */
    public void setWSDL(WFSCapabilitiesType.WSDL value) {
        this.wsdl = value;
    }

    public boolean isSetWSDL() {
        return (this.wsdl!= null);
    }

    /**
     * Obtient la valeur de la propriété featureTypeList.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTypeListType }
     *     
     */
    public FeatureTypeListType getFeatureTypeList() {
        return featureTypeList;
    }

    /**
     * Définit la valeur de la propriété featureTypeList.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTypeListType }
     *     
     */
    public void setFeatureTypeList(FeatureTypeListType value) {
        this.featureTypeList = value;
    }

    public boolean isSetFeatureTypeList() {
        return (this.featureTypeList!= null);
    }

    /**
     * Obtient la valeur de la propriété filterCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link FilterCapabilities }
     *     
     */
    public FilterCapabilities getFilterCapabilities() {
        return filterCapabilities;
    }

    /**
     * Définit la valeur de la propriété filterCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCapabilities }
     *     
     */
    public void setFilterCapabilities(FilterCapabilities value) {
        this.filterCapabilities = value;
    }

    public boolean isSetFilterCapabilities() {
        return (this.filterCapabilities!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleAttrs"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class WSDL {

        /**
         * 
         * 
         */
        @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
        public final static TypeType TYPE = TypeType.SIMPLE;
        @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
        protected String href;
        @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
        protected String role;
        @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
        protected String arcrole;
        @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
        protected String title;
        @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
        protected ShowType show;
        @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
        protected ActuateType actuate;

        /**
         * Obtient la valeur de la propriété href.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Définit la valeur de la propriété href.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

        public boolean isSetHref() {
            return (this.href!= null);
        }

        /**
         * Obtient la valeur de la propriété role.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Définit la valeur de la propriété role.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        public boolean isSetRole() {
            return (this.role!= null);
        }

        /**
         * Obtient la valeur de la propriété arcrole.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArcrole() {
            return arcrole;
        }

        /**
         * Définit la valeur de la propriété arcrole.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArcrole(String value) {
            this.arcrole = value;
        }

        public boolean isSetArcrole() {
            return (this.arcrole!= null);
        }

        /**
         * Obtient la valeur de la propriété title.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Définit la valeur de la propriété title.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        public boolean isSetTitle() {
            return (this.title!= null);
        }

        /**
         * Obtient la valeur de la propriété show.
         * 
         * @return
         *     possible object is
         *     {@link ShowType }
         *     
         */
        public ShowType getShow() {
            return show;
        }

        /**
         * Définit la valeur de la propriété show.
         * 
         * @param value
         *     allowed object is
         *     {@link ShowType }
         *     
         */
        public void setShow(ShowType value) {
            this.show = value;
        }

        public boolean isSetShow() {
            return (this.show!= null);
        }

        /**
         * Obtient la valeur de la propriété actuate.
         * 
         * @return
         *     possible object is
         *     {@link ActuateType }
         *     
         */
        public ActuateType getActuate() {
            return actuate;
        }

        /**
         * Définit la valeur de la propriété actuate.
         * 
         * @param value
         *     allowed object is
         *     {@link ActuateType }
         *     
         */
        public void setActuate(ActuateType value) {
            this.actuate = value;
        }

        public boolean isSetActuate() {
            return (this.actuate!= null);
        }

    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.sld._1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SupportSLD" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="UserLayer" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="UserStyle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="RemoteWFS" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="InlineFeature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="RemoteWCS" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class UserDefinedSymbolization {

    @XmlAttribute(name = "SupportSLD")
    protected Boolean supportSLD;
    @XmlAttribute(name = "UserLayer")
    protected Boolean userLayer;
    @XmlAttribute(name = "UserStyle")
    protected Boolean userStyle;
    @XmlAttribute(name = "RemoteWFS")
    protected Boolean remoteWFS;
    @XmlAttribute(name = "InlineFeature")
    protected Boolean inlineFeature;
    @XmlAttribute(name = "RemoteWCS")
    protected Boolean remoteWCS;

    /**
     * Obtient la valeur de la propriété supportSLD.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSupportSLD() {
        if (supportSLD == null) {
            return false;
        } else {
            return supportSLD;
        }
    }

    /**
     * Définit la valeur de la propriété supportSLD.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportSLD(boolean value) {
        this.supportSLD = value;
    }

    public boolean isSetSupportSLD() {
        return (this.supportSLD!= null);
    }

    public void unsetSupportSLD() {
        this.supportSLD = null;
    }

    /**
     * Obtient la valeur de la propriété userLayer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUserLayer() {
        if (userLayer == null) {
            return false;
        } else {
            return userLayer;
        }
    }

    /**
     * Définit la valeur de la propriété userLayer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserLayer(boolean value) {
        this.userLayer = value;
    }

    public boolean isSetUserLayer() {
        return (this.userLayer!= null);
    }

    public void unsetUserLayer() {
        this.userLayer = null;
    }

    /**
     * Obtient la valeur de la propriété userStyle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUserStyle() {
        if (userStyle == null) {
            return false;
        } else {
            return userStyle;
        }
    }

    /**
     * Définit la valeur de la propriété userStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserStyle(boolean value) {
        this.userStyle = value;
    }

    public boolean isSetUserStyle() {
        return (this.userStyle!= null);
    }

    public void unsetUserStyle() {
        this.userStyle = null;
    }

    /**
     * Obtient la valeur de la propriété remoteWFS.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRemoteWFS() {
        if (remoteWFS == null) {
            return false;
        } else {
            return remoteWFS;
        }
    }

    /**
     * Définit la valeur de la propriété remoteWFS.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteWFS(boolean value) {
        this.remoteWFS = value;
    }

    public boolean isSetRemoteWFS() {
        return (this.remoteWFS!= null);
    }

    public void unsetRemoteWFS() {
        this.remoteWFS = null;
    }

    /**
     * Obtient la valeur de la propriété inlineFeature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInlineFeature() {
        if (inlineFeature == null) {
            return false;
        } else {
            return inlineFeature;
        }
    }

    /**
     * Définit la valeur de la propriété inlineFeature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInlineFeature(boolean value) {
        this.inlineFeature = value;
    }

    public boolean isSetInlineFeature() {
        return (this.inlineFeature!= null);
    }

    public void unsetInlineFeature() {
        this.inlineFeature = null;
    }

    /**
     * Obtient la valeur de la propriété remoteWCS.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRemoteWCS() {
        if (remoteWCS == null) {
            return false;
        } else {
            return remoteWCS;
        }
    }

    /**
     * Définit la valeur de la propriété remoteWCS.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteWCS(boolean value) {
        this.remoteWCS = value;
    }

    public boolean isSetRemoteWCS() {
        return (this.remoteWCS!= null);
    }

    public void unsetRemoteWCS() {
        this.remoteWCS = null;
    }

}

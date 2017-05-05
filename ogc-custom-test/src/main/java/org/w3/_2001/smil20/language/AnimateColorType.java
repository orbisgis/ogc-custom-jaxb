//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package org.w3._2001.smil20.language;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.smil20.AnimateColorPrototype;
import org.w3._2001.smil20.FillDefaultType;
import org.w3._2001.smil20.FillTimingAttrsType;
import org.w3._2001.smil20.RestartDefaultType;
import org.w3._2001.smil20.RestartTimingType;
import org.w3._2001.smil20.SyncBehaviorDefaultType;
import org.w3._2001.smil20.SyncBehaviorType;
import org.w3c.dom.Element;


/**
 * <p>Classe Java pour animateColorType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="animateColorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/SMIL20/}animateColorPrototype">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}skipContentAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/Language}CoreAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animTargetAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/Language}TimingAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animModeAttrs"/>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "animateColorType", propOrder = {
    "any"
})
public class AnimateColorType
    extends AnimateColorPrototype
{

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "skip-content")
    protected Boolean skipContent;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "alt")
    protected String alt;
    @XmlAttribute(name = "longdesc")
    @XmlSchemaType(name = "anyURI")
    protected String longdesc;
    @XmlAttribute(name = "targetElement")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object targetElement;
    @XmlAttribute(name = "begin")
    protected String begin;
    @XmlAttribute(name = "end")
    protected String end;
    @XmlAttribute(name = "repeat")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger repeat;
    @XmlAttribute(name = "dur")
    protected String dur;
    @XmlAttribute(name = "repeatDur")
    protected String repeatDur;
    @XmlAttribute(name = "repeatCount")
    protected BigDecimal repeatCount;
    @XmlAttribute(name = "min")
    protected String min;
    @XmlAttribute(name = "max")
    protected String max;
    @XmlAttribute(name = "fillDefault")
    protected FillDefaultType fillDefault;
    @XmlAttribute(name = "syncBehavior")
    protected SyncBehaviorType syncBehavior;
    @XmlAttribute(name = "syncTolerance")
    protected String syncTolerance;
    @XmlAttribute(name = "syncBehaviorDefault")
    protected SyncBehaviorDefaultType syncBehaviorDefault;
    @XmlAttribute(name = "syncToleranceDefault")
    protected String syncToleranceDefault;
    @XmlAttribute(name = "restart")
    protected RestartTimingType restart;
    @XmlAttribute(name = "fill")
    protected FillTimingAttrsType fill;
    @XmlAttribute(name = "restartDefault")
    protected RestartDefaultType restartDefault;
    @XmlAttribute(name = "calcMode")
    protected String calcMode;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    public boolean isSetAny() {
        return ((this.any!= null)&&(!this.any.isEmpty()));
    }

    public void unsetAny() {
        this.any = null;
    }

    /**
     * Obtient la valeur de la propriété skipContent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSkipContent() {
        if (skipContent == null) {
            return true;
        } else {
            return skipContent;
        }
    }

    /**
     * Définit la valeur de la propriété skipContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipContent(boolean value) {
        this.skipContent = value;
    }

    public boolean isSetSkipContent() {
        return (this.skipContent!= null);
    }

    public void unsetSkipContent() {
        this.skipContent = null;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Obtient la valeur de la propriété clazz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Définit la valeur de la propriété clazz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    public boolean isSetClazz() {
        return (this.clazz!= null);
    }

    /**
     * Obtient la valeur de la propriété lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Définit la valeur de la propriété lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    public boolean isSetLang() {
        return (this.lang!= null);
    }

    /**
     * Obtient la valeur de la propriété alt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlt() {
        return alt;
    }

    /**
     * Définit la valeur de la propriété alt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlt(String value) {
        this.alt = value;
    }

    public boolean isSetAlt() {
        return (this.alt!= null);
    }

    /**
     * Obtient la valeur de la propriété longdesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongdesc() {
        return longdesc;
    }

    /**
     * Définit la valeur de la propriété longdesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongdesc(String value) {
        this.longdesc = value;
    }

    public boolean isSetLongdesc() {
        return (this.longdesc!= null);
    }

    /**
     * Obtient la valeur de la propriété targetElement.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTargetElement() {
        return targetElement;
    }

    /**
     * Définit la valeur de la propriété targetElement.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTargetElement(Object value) {
        this.targetElement = value;
    }

    public boolean isSetTargetElement() {
        return (this.targetElement!= null);
    }

    /**
     * Obtient la valeur de la propriété begin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegin() {
        return begin;
    }

    /**
     * Définit la valeur de la propriété begin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegin(String value) {
        this.begin = value;
    }

    public boolean isSetBegin() {
        return (this.begin!= null);
    }

    /**
     * Obtient la valeur de la propriété end.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Définit la valeur de la propriété end.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    public boolean isSetEnd() {
        return (this.end!= null);
    }

    /**
     * Obtient la valeur de la propriété repeat.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRepeat() {
        return repeat;
    }

    /**
     * Définit la valeur de la propriété repeat.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRepeat(BigInteger value) {
        this.repeat = value;
    }

    public boolean isSetRepeat() {
        return (this.repeat!= null);
    }

    /**
     * Obtient la valeur de la propriété dur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDur() {
        return dur;
    }

    /**
     * Définit la valeur de la propriété dur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDur(String value) {
        this.dur = value;
    }

    public boolean isSetDur() {
        return (this.dur!= null);
    }

    /**
     * Obtient la valeur de la propriété repeatDur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatDur() {
        return repeatDur;
    }

    /**
     * Définit la valeur de la propriété repeatDur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatDur(String value) {
        this.repeatDur = value;
    }

    public boolean isSetRepeatDur() {
        return (this.repeatDur!= null);
    }

    /**
     * Obtient la valeur de la propriété repeatCount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepeatCount() {
        return repeatCount;
    }

    /**
     * Définit la valeur de la propriété repeatCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepeatCount(BigDecimal value) {
        this.repeatCount = value;
    }

    public boolean isSetRepeatCount() {
        return (this.repeatCount!= null);
    }

    /**
     * Obtient la valeur de la propriété min.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Définit la valeur de la propriété min.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    public boolean isSetMin() {
        return (this.min!= null);
    }

    /**
     * Obtient la valeur de la propriété max.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Définit la valeur de la propriété max.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

    public boolean isSetMax() {
        return (this.max!= null);
    }

    /**
     * Obtient la valeur de la propriété fillDefault.
     * 
     * @return
     *     possible object is
     *     {@link FillDefaultType }
     *     
     */
    public FillDefaultType getFillDefault() {
        if (fillDefault == null) {
            return FillDefaultType.INHERIT;
        } else {
            return fillDefault;
        }
    }

    /**
     * Définit la valeur de la propriété fillDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link FillDefaultType }
     *     
     */
    public void setFillDefault(FillDefaultType value) {
        this.fillDefault = value;
    }

    public boolean isSetFillDefault() {
        return (this.fillDefault!= null);
    }

    /**
     * Obtient la valeur de la propriété syncBehavior.
     * 
     * @return
     *     possible object is
     *     {@link SyncBehaviorType }
     *     
     */
    public SyncBehaviorType getSyncBehavior() {
        if (syncBehavior == null) {
            return SyncBehaviorType.DEFAULT;
        } else {
            return syncBehavior;
        }
    }

    /**
     * Définit la valeur de la propriété syncBehavior.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncBehaviorType }
     *     
     */
    public void setSyncBehavior(SyncBehaviorType value) {
        this.syncBehavior = value;
    }

    public boolean isSetSyncBehavior() {
        return (this.syncBehavior!= null);
    }

    /**
     * Obtient la valeur de la propriété syncTolerance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncTolerance() {
        return syncTolerance;
    }

    /**
     * Définit la valeur de la propriété syncTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncTolerance(String value) {
        this.syncTolerance = value;
    }

    public boolean isSetSyncTolerance() {
        return (this.syncTolerance!= null);
    }

    /**
     * Obtient la valeur de la propriété syncBehaviorDefault.
     * 
     * @return
     *     possible object is
     *     {@link SyncBehaviorDefaultType }
     *     
     */
    public SyncBehaviorDefaultType getSyncBehaviorDefault() {
        if (syncBehaviorDefault == null) {
            return SyncBehaviorDefaultType.INHERIT;
        } else {
            return syncBehaviorDefault;
        }
    }

    /**
     * Définit la valeur de la propriété syncBehaviorDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncBehaviorDefaultType }
     *     
     */
    public void setSyncBehaviorDefault(SyncBehaviorDefaultType value) {
        this.syncBehaviorDefault = value;
    }

    public boolean isSetSyncBehaviorDefault() {
        return (this.syncBehaviorDefault!= null);
    }

    /**
     * Obtient la valeur de la propriété syncToleranceDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncToleranceDefault() {
        if (syncToleranceDefault == null) {
            return "inherit";
        } else {
            return syncToleranceDefault;
        }
    }

    /**
     * Définit la valeur de la propriété syncToleranceDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncToleranceDefault(String value) {
        this.syncToleranceDefault = value;
    }

    public boolean isSetSyncToleranceDefault() {
        return (this.syncToleranceDefault!= null);
    }

    /**
     * Obtient la valeur de la propriété restart.
     * 
     * @return
     *     possible object is
     *     {@link RestartTimingType }
     *     
     */
    public RestartTimingType getRestart() {
        if (restart == null) {
            return RestartTimingType.DEFAULT;
        } else {
            return restart;
        }
    }

    /**
     * Définit la valeur de la propriété restart.
     * 
     * @param value
     *     allowed object is
     *     {@link RestartTimingType }
     *     
     */
    public void setRestart(RestartTimingType value) {
        this.restart = value;
    }

    public boolean isSetRestart() {
        return (this.restart!= null);
    }

    /**
     * Obtient la valeur de la propriété fill.
     * 
     * @return
     *     possible object is
     *     {@link FillTimingAttrsType }
     *     
     */
    public FillTimingAttrsType getFill() {
        if (fill == null) {
            return FillTimingAttrsType.DEFAULT;
        } else {
            return fill;
        }
    }

    /**
     * Définit la valeur de la propriété fill.
     * 
     * @param value
     *     allowed object is
     *     {@link FillTimingAttrsType }
     *     
     */
    public void setFill(FillTimingAttrsType value) {
        this.fill = value;
    }

    public boolean isSetFill() {
        return (this.fill!= null);
    }

    /**
     * Obtient la valeur de la propriété restartDefault.
     * 
     * @return
     *     possible object is
     *     {@link RestartDefaultType }
     *     
     */
    public RestartDefaultType getRestartDefault() {
        if (restartDefault == null) {
            return RestartDefaultType.INHERIT;
        } else {
            return restartDefault;
        }
    }

    /**
     * Définit la valeur de la propriété restartDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link RestartDefaultType }
     *     
     */
    public void setRestartDefault(RestartDefaultType value) {
        this.restartDefault = value;
    }

    public boolean isSetRestartDefault() {
        return (this.restartDefault!= null);
    }

    /**
     * Obtient la valeur de la propriété calcMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcMode() {
        if (calcMode == null) {
            return "linear";
        } else {
            return calcMode;
        }
    }

    /**
     * Définit la valeur de la propriété calcMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcMode(String value) {
        this.calcMode = value;
    }

    public boolean isSetCalcMode() {
        return (this.calcMode!= null);
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}

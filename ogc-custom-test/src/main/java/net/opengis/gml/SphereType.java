//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A sphere is a gridded surface given as a
 *    family of circles whose positions vary linearly along the
 *    axis of the sphere, and whise radius varies in proportions to
 *    the cosine function of the central angle. The horizontal 
 *    circles resemble lines of constant latitude, and the vertical
 *    arcs resemble lines of constant longitude. 
 *    NOTE! If the control points are sorted in terms of increasing
 *    longitude, and increasing latitude, the upNormal of a sphere
 *    is the outward normal.
 *    EXAMPLE If we take a gridded set of latitudes and longitudes
 *    in degrees,(u,v) such as
 * 
 * 	(-90,-180)  (-90,-90)  (-90,0)  (-90,  90) (-90, 180) 
 * 	(-45,-180)  (-45,-90)  (-45,0)  (-45,  90) (-45, 180) 
 * 	(  0,-180)  (  0,-90)  (  0,0)  (  0,  90) (  0, 180)
 * 	( 45,-180)  ( 45,-90)  ( 45,0)  ( 45, -90) ( 45, 180)
 * 	( 90,-180)  ( 90,-90)  ( 90,0)  ( 90, -90) ( 90, 180)
 *    
 *    And map these points to 3D using the usual equations (where R
 *    is the radius of the required sphere).
 * 
 *     z = R sin u
 *     x = (R cos u)(sin v)
 *     y = (R cos u)(cos v)
 * 
 *    We have a sphere of Radius R, centred at (0,0), as a gridded
 *    surface. Notice that the entire first row and the entire last
 *    row of the control points map to a single point in each 3D
 *    Euclidean space, North and South poles respectively, and that
 *    each horizontal curve closes back on itself forming a 
 *    geometric cycle. This gives us a metrically bounded (of finite
 *    size), topologically unbounded (not having a boundary, a
 *    cycle) surface.
 * 
 * <p>Classe Java pour SphereType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SphereType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGriddedSurfaceType">
 *       &lt;attribute name="horizontalCurveType" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="circularArc3Points" />
 *       &lt;attribute name="verticalCurveType" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="circularArc3Points" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SphereType")
public class SphereType
    extends AbstractGriddedSurfaceType
{

    /**
     * 
     * 
     */
    @XmlAttribute(name = "horizontalCurveType")
    public final static CurveInterpolationType HORIZONTAL_CURVE_TYPE = CurveInterpolationType.CIRCULAR_ARC_3_POINTS;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "verticalCurveType")
    public final static CurveInterpolationType VERTICAL_CURVE_TYPE = CurveInterpolationType.CIRCULAR_ARC_3_POINTS;

}

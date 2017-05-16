/**
 * OrbisGIS is a java GIS application dedicated to research in GIScience.
 * OrbisGIS is developed by the GIS group of the DECIDE team of the
 * Lab-STICC CNRS laboratory, see <http://www.lab-sticc.fr/>.
 *
 * The GIS group of the DECIDE team is located at :
 *
 * Laboratoire Lab-STICC – CNRS UMR 6285
 * Equipe DECIDE
 * UNIVERSITÉ DE BRETAGNE-SUD
 * Institut Universitaire de Technologie de Vannes
 * 8, Rue Montaigne - BP 561 56017 Vannes Cedex
 *
 * OrbisGIS is distributed under GPL 3 license.
 *
 * Copyright (C) 2015-2017 CNRS (Lab-STICC UMR CNRS 6285)
 *
 * This file is part of OrbisGIS.
 *
 * OrbisGIS is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * OrbisGIS is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * OrbisGIS. If not, see <http://www.gnu.org/licenses/>.
 *
 * For more information, please consult: <http://www.orbisgis.org/>
 * or contact directly:
 * info_at_ orbisgis.org
 */

package org.orbisgis.ogccustomtest.newoperator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.fes._2_0_2.newOps package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */

@XmlRegistry
public class ObjectFactory {

    private final static QName _PropertyExists_QNAME = new QName("http://www.someserver.com/myops/1.0", "PropertyExists");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.fes._2_0_2.newOps
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropertyExistsType }
     * 
     */
    public PropertyExistsType createPropertyExistsType() {
        return new PropertyExistsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyExistsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.someserver.com/myops/1.0", name = "PropertyExists", substitutionHeadNamespace = "http://www.opengis.net/fes/2.0", substitutionHeadName = "comparisonOps")
    public JAXBElement<PropertyExistsType> createPropertyExists(PropertyExistsType value) {
        return new JAXBElement<PropertyExistsType>(_PropertyExists_QNAME, PropertyExistsType.class, value);
    }

}

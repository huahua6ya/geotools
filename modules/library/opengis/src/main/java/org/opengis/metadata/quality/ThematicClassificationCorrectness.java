/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2011, Open Source Geospatial Foundation (OSGeo)
 *    (C) 2004-2005, Open Geospatial Consortium Inc.
 *
 *    All Rights Reserved. http://www.opengis.org/legal/
 */
package org.opengis.metadata.quality;

import static org.opengis.annotation.Specification.ISO_19115;

import org.opengis.annotation.UML;

/**
 * Comparison of the classes assigned to features or their attributes to a universe of discourse.
 *
 * @version <A HREF="http://www.opengeospatial.org/standards/as#01-111">ISO 19115</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 2.0
 */
@UML(identifier = "DQ_ThematicClassificationCorrectness", specification = ISO_19115)
public interface ThematicClassificationCorrectness extends ThematicAccuracy {}

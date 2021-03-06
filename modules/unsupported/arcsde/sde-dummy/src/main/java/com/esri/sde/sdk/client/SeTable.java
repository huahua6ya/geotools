/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2019, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 */

package com.esri.sde.sdk.client;

public class SeTable {

    public SeTable(SeConnection s, String y) throws SeException {}

    public String getQualifiedName() {
        return null;
    }

    public String getName() {
        return null;
    }

    public void addColumn(SeColumnDefinition s) {}

    public void dropColumn(String s) {}

    public void delete() throws SeException {}

    public void create(SeColumnDefinition[] c, String s) {}

    public SeColumnDefinition[] describe() throws SeException {
        return null;
    }

    public void truncate() throws SeException {};

    public static class SeTableStats {
        public static int SE_ALL_STATS = 0;
        public static /* GEOT-947 final*/ int SE_COUNT_STATS = 0;

        public int getCount() {
            return 0;
        }

        public double getMin() {
            return 0;
        }

        public double getMax() {
            return 0;
        }
    }

    public int getPermissions() throws SeException {
        return 0;
    }

    public static class SeTableIdRange {
        public SeObjectId getStartId() {
            return null;
        }
    }

    public SeTableIdRange getIds(int i) throws SeException {
        return null;
    }
}

package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

import java.util.*;

import static org.dnltsk.mapfileplugin.psi.MapfileTypes.*;

public class MapfileKeywordDependencies {

    public static Map<Class<? extends PsiElement>, List<IElementType>> dependencyMap = createMap();

    private static Map<Class<? extends PsiElement>, List<IElementType>> createMap() {
        Map<Class<? extends PsiElement>, List<IElementType>> map = new HashMap<>();
        map.put(
                MapfileMapObject.class,
                Arrays.asList(
                        END, LAYER, LEGEND, PROJECTION, QUERYMAP, REFERENCE, SCALEBAR, SYMBOL, WEB,
                        ANGLE, CONFIG, DATAPATTERN, DEBUG, DEFRESOLUTION, EXTENT, FONTSET, IMAGECOLOR, IMAGETYPE, INTERLACE, MAXSIZE, NAME, RESOLUTION, SCALEDENOM, SHAPEPATH, SIZE, STATUS, SYMBOLSET, TEMPLATEPATTERN, UNITS,
                        INCLUDE
                        ));
        map.put(
                MapfileWebObject.class,
                Arrays.asList(
                        END, METADATA, VALIDATION,
                        BROWSEFORMAT, EMPTY, ERROR, FOOTER, HEADER, IMAGEPATH, IMAGEURL, LEGENDFORMAT, MAXSCALEDENOM, MAXTEMPLATE, MINSCALEDENOM, MINTEMPLATE, QUERYFORMAT, TEMPLATE, TEMPPATH,
                        INCLUDE
                ));
        map.put(
                MapfileLayerObject.class,
                Arrays.asList(
                        END, CLASS, CLUSTER, COMPOSITE, FEATURE, GRID, JOIN, METADATA, PROJECTION, VALIDATION,
                        CLASSGROUP, CLASSITEM, CONNECTION, CONNECTIONTYPE, DATA, DEBUG, DUMP, ENCODING, EXTENT, FILTER, FOOTER, FILTERITEM, GEOMTRANSFORM, GROUP, HEADER, LABELCACHE, LABELITEM, LABELMAXSCALEDENOM, LABELMINSCALEDENOM, LABELREQUIRES, MASK, MAXFEATURES, MAXGEOWIDTH, MAXSCALEDENOM, MINGEOWIDTH, MINSCALEDENOM, NAME, PLUGIN, POSTLABELCACHE, PROCESSING, OFFSITE, SIZEUNITS, REQUIRES, STATUS, STYLEITEM, SYMBOLSCALEDENOM, TEMPLATE, TILEINDEX, TILEITEM, TILESRS, TITLE, TOLERANCEUNITS, TOLERANCE, TRANSFORM, TYPE, UNITS, UTFDATA, UTFITEM,
                        INCLUDE
                ));
        map.put(
                MapfileClassObject.class,
                Arrays.asList(
                        END, LABEL, LEADER, STYLE, VALIDATION,
                        DEBUG, EXPRESSION, GROUP, KEYIMAGE, MAXSCALEDENOM, MINSCALEDENOM, NAME, STATUS, TEMPLATE, TEXT,
                        INCLUDE
                ));
        map.put(
                MapfileSymbolObject.class,
                Arrays.asList(
                        END, PATTERN,
                        ANGLE, ANTIALIAS, COLOR, GAP, GEOMTRANSFORM, INITIALGAP, LINECAP, LINEJOIN, LINEJOINMAXSIZE, MAXSCALEDENOM, MAXSIZE, MAXWIDTH, MINSCALEDENOM, MINSIZE, MINWIDTH, OFFSET, OPACITY, OUTLINECOLOR, OUTLINEWIDTH, POLAROFFSET, SIZE, SYMBOL, WIDTH,
                        INCLUDE
                ));

        map.put(
                MapfileLabelObject.class,
                Arrays.asList(
                        END, STYLE,
                        ALIGN, ANGLE, ANTIALIAS, BUFFER, COLOR, EXPRESSION, FONT, FORCE, MAXLENGTH, MAXOVERLAPANGLE, MAXSCALEDENOM, MAXSIZE, MINDISTANCE, MINFEATURESIZE, MINSCALEDENOM, MINSIZE, OFFSET, OUTLINECOLOR, OUTLINEWIDTH, PARTIALS, POSITION, PRIORITY, REPEATDISTANCE, SHADOWCOLOR, SHADOWSIZE, SIZE, TEXT, TYPE, WRAP,
                        INCLUDE
                ));
        map.put(
                MapfileStyleObject.class,
                Arrays.asList(
                        END, PATTERN,
                        ANGLE, ANTIALIAS, COLOR, GAP, GEOMTRANSFORM, INITIALGAP, LINECAP, LINEJOIN, LINEJOINMAXSIZE, MAXSCALEDENOM, MAXSIZE, MAXWIDTH, MINSCALEDENOM, MINSIZE, MINWIDTH, OFFSET, OPACITY, OUTLINECOLOR, OUTLINEWIDTH, POLAROFFSET, SIZE, SYMBOL, WIDTH,
                        INCLUDE
                ));

        map.put(
                MapfileLeaderObject.class,
                Arrays.asList(
                        END, STYLE,
                        GRID, MAXDISTANCE,
                        INCLUDE
                ));
        map.put(
                MapfileLegendObject.class,
                Arrays.asList(
                        END, LABEL,
                        IMAGECOLOR, INTERLACE, KEYSIZE, KEYSPACING, OUTLINECOLOR, POSITION, POSTLABELCACHE, STATUS, TEMPLATE,
                        INCLUDE
                ));
        map.put(
                MapfileFeatureObject.class,
                Arrays.asList(
                        END,
                        ITEMS, TEXT, WKT,
                        INCLUDE
                ));
        map.put(
                MapfileClusterObject.class,
                Arrays.asList(
                        END,
                        MAXDISTANCE, REGION, BUFFER, GROUP, FILTER, PROCESSING,
                        INCLUDE
                ));
        map.put(
                MapfileCompositeObject.class,
                Arrays.asList(
                        END,
                        OPACITY, COMPOP,
                        INCLUDE
                ));
        map.put(
                MapfileGridObject.class,
                Arrays.asList(
                        END,
                        LABELFORMAT, MINARCS, MAXARCS, MININTERVAL, MAXINTERVAL, MINSUBDIVIDE, MAXSUBDIVIDE,
                        INCLUDE
                ));
        map.put(
                MapfileJoinObject.class,
                Arrays.asList(
                        END,
                        CONNECTION, CONNECTIONTYPE, FOOTER,  FROM, HEADER, NAME, TABLE, TEMPLATE, TO, TYPE,
                        INCLUDE
                ));
        map.put(
                MapfileQuerymapObject.class,
                Arrays.asList(
                        END,
                        COLOR, SIZE, STATUS, STYLE,
                        INCLUDE
                ));
        map.put(
                MapfileReferenceObject.class,
                Arrays.asList(
                        END,
                        COLOR, EXTENT, IMAGE, MARKER, MARKERSIZE, MINBOXSIZE, MAXBOXSIZE, OUTLINECOLOR, SIZE, STATUS,
                        INCLUDE
                ));
        map.put(
                MapfileScalebarObject.class,
                Arrays.asList(
                        END, LABEL,
                        ALIGN, BACKGROUNDCOLOR, COLOR, IMAGECOLOR, INTERLACE, OUTLINECOLOR, POSITION, POSTLABELCACHE, SIZE, STATUS, STYLE, UNITS,
                        INCLUDE
                ));
        map.put(
                MapfilePatternObject.class,
                Arrays.asList(
                        END,
                        INCLUDE));
        map.put(
                MapfileValidationObject.class,
                Arrays.asList(
                        END,
                        INCLUDE));
        map.put(
                MapfileMetadataObject.class,
                Arrays.asList(
                        END,
                        INCLUDE));
        map.put(
                MapfilePointsObject.class,
                Arrays.asList(
                        END,
                        INCLUDE));
        map.put(
                MapfileProjectionObject.class,
                Arrays.asList(
                        END,
                        INCLUDE));

        return Collections.unmodifiableMap(map);
    }

}

package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.PsiElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.dnltsk.mapfileplugin.psi.MapfileTypes.*;

public class MapfileKeywordDependencies {

    public static Map<Class<? extends PsiElement>, PossibleKeywords> dependencyMap = createMap();

    private static Map<Class<? extends PsiElement>, PossibleKeywords> createMap() {
        Map<Class<? extends PsiElement>, PossibleKeywords> map = new HashMap<>();
        map.put(
                MapfileMapObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, LAYER, LEGEND, PROJECTION, QUERYMAP, REFERENCE, SCALEBAR, SYMBOL, WEB,
                                ANGLE, CONFIG, DATAPATTERN, DEBUG, DEFRESOLUTION, EXTENT, FONTSET, IMAGECOLOR, IMAGETYPE, INTERLACE, MAXSIZE, NAME, RESOLUTION, SCALEDENOM, SHAPEPATH, SIZE, STATUS, SYMBOLSET, TEMPLATEPATTERN, UNITS,
                                INCLUDE
                        ),
                        Collections.emptyList()));

        map.put(
                MapfileWebObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, METADATA, VALIDATION,
                                BROWSEFORMAT, EMPTY, ERROR, FOOTER, HEADER, IMAGEPATH, IMAGEURL, LEGENDFORMAT, MAXSCALEDENOM, MAXTEMPLATE, MINSCALEDENOM, MINTEMPLATE, QUERYFORMAT, TEMPLATE, TEMPPATH,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileLayerObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, CLASS, CLUSTER, COMPOSITE, FEATURE, GRID, JOIN, METADATA, PROJECTION, VALIDATION,
                                CLASSGROUP, CLASSITEM, CONNECTION, CONNECTIONTYPE, DATA, DEBUG, DUMP, ENCODING, EXTENT, FILTER, FOOTER, FILTERITEM, GEOMTRANSFORM, GROUP, HEADER, LABELCACHE, LABELITEM, LABELMAXSCALEDENOM, LABELMINSCALEDENOM, LABELREQUIRES, MASK, MAXFEATURES, MAXGEOWIDTH, MAXSCALEDENOM, MINGEOWIDTH, MINSCALEDENOM, NAME, PLUGIN, POSTLABELCACHE, PROCESSING, OFFSITE, SIZEUNITS, REQUIRES, STATUS, STYLEITEM, SYMBOLSCALEDENOM, TEMPLATE, TILEINDEX, TILEITEM, TILESRS, TITLE, TOLERANCEUNITS, TOLERANCE, TRANSFORM, TYPE, UNITS, UTFDATA, UTFITEM,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileClassObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, LABEL, LEADER, STYLE, VALIDATION,
                                DEBUG, EXPRESSION, GROUP, KEYIMAGE, MAXSCALEDENOM, MINSCALEDENOM, NAME, STATUS, TEMPLATE, TEXT,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileSymbolObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, PATTERN,
                                ANGLE, ANTIALIAS, COLOR, GAP, GEOMTRANSFORM, INITIALGAP, LINECAP, LINEJOIN, LINEJOINMAXSIZE, MAXSCALEDENOM, MAXSIZE, MAXWIDTH, MINSCALEDENOM, MINSIZE, MINWIDTH, OFFSET, OPACITY, OUTLINECOLOR, OUTLINEWIDTH, POLAROFFSET, SIZE, SYMBOL, WIDTH,
                                INCLUDE
                        ),
                        Collections.emptyList()));

        map.put(
                MapfileLabelObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, STYLE,
                                ALIGN, ANGLE, ANTIALIAS, BUFFER, COLOR, EXPRESSION, FONT, FORCE, MAXLENGTH, MAXOVERLAPANGLE, MAXSCALEDENOM, MAXSIZE, MINDISTANCE, MINFEATURESIZE, MINSCALEDENOM, MINSIZE, OFFSET, OUTLINECOLOR, OUTLINEWIDTH, PARTIALS, POSITION, PRIORITY, REPEATDISTANCE, SHADOWCOLOR, SHADOWSIZE, SIZE, TEXT, TYPE, WRAP,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileStyleObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, PATTERN,
                                ANGLE, ANTIALIAS, COLOR, GAP, GEOMTRANSFORM, INITIALGAP, LINECAP, LINEJOIN, LINEJOINMAXSIZE, MAXSCALEDENOM, MAXSIZE, MAXWIDTH, MINSCALEDENOM, MINSIZE, MINWIDTH, OFFSET, OPACITY, OUTLINECOLOR, OUTLINEWIDTH, POLAROFFSET, SIZE, SYMBOL, WIDTH,
                                INCLUDE
                        ),
                        Collections.emptyList()));

        map.put(
                MapfileLeaderObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, STYLE,
                                GRID, MAXDISTANCE,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileLegendObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, LABEL,
                                IMAGECOLOR, INTERLACE, KEYSIZE, KEYSPACING, OUTLINECOLOR, POSITION, POSTLABELCACHE, STATUS, TEMPLATE,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileFeatureObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                ITEMS, TEXT, WKT,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileClusterObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                MAXDISTANCE, REGION, BUFFER, GROUP, FILTER, PROCESSING,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileCompositeObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                OPACITY, COMPOP,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileGridObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                LABELFORMAT, MINARCS, MAXARCS, MININTERVAL, MAXINTERVAL, MINSUBDIVIDE, MAXSUBDIVIDE,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileJoinObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                CONNECTION, CONNECTIONTYPE, FOOTER, FROM, HEADER, NAME, TABLE, TEMPLATE, TO, TYPE,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileQuerymapObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                COLOR, SIZE, STATUS, STYLE,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileReferenceObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                COLOR, EXTENT, IMAGE, MARKER, MARKERSIZE, MINBOXSIZE, MAXBOXSIZE, OUTLINECOLOR, SIZE, STATUS,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileScalebarObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END, LABEL,
                                ALIGN, BACKGROUNDCOLOR, COLOR, IMAGECOLOR, INTERLACE, OUTLINECOLOR, POSITION, POSTLABELCACHE, SIZE, STATUS, STYLE, UNITS,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfilePatternObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileValidationObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileMetadataObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfilePointsObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                INCLUDE
                        ),
                        Collections.emptyList()));
        map.put(
                MapfileProjectionObject.class,
                new PossibleKeywords(
                        Arrays.asList(
                                END,
                                INCLUDE
                        ),
                        Collections.emptyList()));

        return Collections.unmodifiableMap(map);
    }

}

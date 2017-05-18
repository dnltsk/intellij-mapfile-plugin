package org.dnltsk.mapfileplugin.completioncontribution;

import org.dnltsk.mapfileplugin.psi.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.dnltsk.mapfileplugin.psi.MapfileTypes.*;

public class ObjectsKeywordsRepository {

    public static List<ObjectsKeywords> objectsKeywords = createMap();

    private static List<ObjectsKeywords> createMap() {
        List<ObjectsKeywords> map = new ArrayList<>();
        map.add(new ObjectsKeywords(
                        Arrays.asList(MapfileMapObject.class, MapfileMapObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, LAYER, LEGEND, PROJECTION, QUERYMAP, REFERENCE, SCALEBAR, SYMBOL, WEB,
                                        ANGLE, CONFIG, DATAPATTERN, DEBUG, DEFRESOLUTION, EXTENT, FONTSET, IMAGECOLOR, IMAGETYPE, INTERLACE, MAXSIZE, NAME, RESOLUTION, SCALEDENOM, SHAPEPATH, SIZE, STATUS, SYMBOLSET, TEMPLATEPATTERN, UNITS,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );

        map.add(new ObjectsKeywords(
                        Arrays.asList(MapfileWebObject.class, MapfileWebObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, METADATA, VALIDATION,
                                        BROWSEFORMAT, EMPTY, ERROR, FOOTER, HEADER, IMAGEPATH, IMAGEURL, LEGENDFORMAT, MAXSCALEDENOM, MAXTEMPLATE, MINSCALEDENOM, MINTEMPLATE, QUERYFORMAT, TEMPLATE, TEMPPATH,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileLayerObject.class, MapfileLayerObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, CLASS, CLUSTER, COMPOSITE, FEATURE, GRID, JOIN, METADATA, PROJECTION, VALIDATION,
                                        CLASSGROUP, CLASSITEM, CONNECTION, CONNECTIONTYPE, DATA, DEBUG, DUMP, ENCODING, EXTENT, FILTER, FOOTER, FILTERITEM, GEOMTRANSFORM, GROUP, HEADER, LABELCACHE, LABELITEM, LABELMAXSCALEDENOM, LABELMINSCALEDENOM, LABELREQUIRES, MASK, MAXFEATURES, MAXGEOWIDTH, MAXSCALEDENOM, MINGEOWIDTH, MINSCALEDENOM, NAME, PLUGIN, POSTLABELCACHE, PROCESSING, OFFSITE, SIZEUNITS, REQUIRES, STATUS, STYLEITEM, SYMBOLSCALEDENOM, TEMPLATE, TILEINDEX, TILEITEM, TILESRS, TITLE, TOLERANCEUNITS, TOLERANCE, TRANSFORM, TYPE, UNITS, UTFDATA, UTFITEM,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileClassObject.class, MapfileClusterObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, LABEL, LEADER, STYLE, VALIDATION,
                                        DEBUG, EXPRESSION, GROUP, KEYIMAGE, MAXSCALEDENOM, MINSCALEDENOM, NAME, STATUS, TEMPLATE, TEXT,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileSymbolObject.class, MapfileSymbolObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, PATTERN,
                                        ANGLE, ANTIALIAS, COLOR, GAP, GEOMTRANSFORM, INITIALGAP, LINECAP, LINEJOIN, LINEJOINMAXSIZE, MAXSCALEDENOM, MAXSIZE, MAXWIDTH, MINSCALEDENOM, MINSIZE, MINWIDTH, OFFSET, OPACITY, OUTLINECOLOR, OUTLINEWIDTH, POLAROFFSET, SIZE, SYMBOL, WIDTH,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );

        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileLabelObject.class, MapfileLabelObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, STYLE,
                                        ALIGN, ANGLE, ANTIALIAS, BUFFER, COLOR, EXPRESSION, FONT, FORCE, MAXLENGTH, MAXOVERLAPANGLE, MAXSCALEDENOM, MAXSIZE, MINDISTANCE, MINFEATURESIZE, MINSCALEDENOM, MINSIZE, OFFSET, OUTLINECOLOR, OUTLINEWIDTH, PARTIALS, POSITION, PRIORITY, REPEATDISTANCE, SHADOWCOLOR, SHADOWSIZE, SIZE, TEXT, TYPE, WRAP,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileStyleObject.class, MapfileStyleObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, PATTERN,
                                        ANGLE, ANTIALIAS, COLOR, GAP, GEOMTRANSFORM, INITIALGAP, LINECAP, LINEJOIN, LINEJOINMAXSIZE, MAXSCALEDENOM, MAXSIZE, MAXWIDTH, MINSCALEDENOM, MINSIZE, MINWIDTH, OFFSET, OPACITY, OUTLINECOLOR, OUTLINEWIDTH, POLAROFFSET, SIZE, SYMBOL, WIDTH,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );

        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileLeaderObject.class, MapfileLeaderObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, STYLE,
                                        GRID, MAXDISTANCE,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileLegendObject.class, MapfileLegendObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, LABEL,
                                        IMAGECOLOR, INTERLACE, KEYSIZE, KEYSPACING, OUTLINECOLOR, POSITION, POSTLABELCACHE, STATUS, TEMPLATE,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(
                                MapfileFeatureObject.class, MapfileFeatureObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        ITEMS, TEXT, WKT,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileClusterObject.class, MapfileClusterObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        MAXDISTANCE, REGION, BUFFER, GROUP, FILTER, PROCESSING,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileCompositeObject.class, MapfileCompositeObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        OPACITY, COMPOP,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileGridObject.class, MapfileGridObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        LABELFORMAT, MINARCS, MAXARCS, MININTERVAL, MAXINTERVAL, MINSUBDIVIDE, MAXSUBDIVIDE,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileJoinObject.class, MapfileJoinObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        CONNECTION, CONNECTIONTYPE, FOOTER, FROM, HEADER, NAME, TABLE, TEMPLATE, TO, TYPE,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileQuerymapObject.class, MapfileQuerymapObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        COLOR, SIZE, STATUS, STYLE,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileReferenceObject.class, MapfileReferenceObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        COLOR, EXTENT, IMAGE, MARKER, MARKERSIZE, MINBOXSIZE, MAXBOXSIZE, OUTLINECOLOR, SIZE, STATUS,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileScalebarObject.class, MapfileScalebarObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END, LABEL,
                                        ALIGN, BACKGROUNDCOLOR, COLOR, IMAGECOLOR, INTERLACE, OUTLINECOLOR, POSITION, POSTLABELCACHE, SIZE, STATUS, STYLE, UNITS,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfilePatternObject.class, MapfilePatternObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileValidationObject.class, MapfileValidationObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileMetadataObject.class, MapfileMetadataObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfilePointsObject.class, MapfilePointsObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );
        map.add(
                new ObjectsKeywords(
                        Arrays.asList(MapfileProjectionObject.class, MapfileProjectionObjectChildren.class),
                        new PossibleKeywords(
                                Arrays.asList(
                                        END,
                                        INCLUDE
                                ),
                                Collections.emptyList()
                        )
                )
        );

        return map;
    }

}

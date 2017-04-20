package org.dnltsk.mapfileplugin.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.dnltsk.mapfileplugin.MapfileLexerAdapter;
import org.dnltsk.mapfileplugin.psi.MapfileTypes;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static org.dnltsk.mapfileplugin.psi.MapfileTypes.*;

public class MapfileSyntaxHighlighter extends SyntaxHighlighterBase {

    static final TextAttributesKey KEYWORD_HIGHLIGHTER = createTextAttributesKey("KEYWORD_HIGHLIGHTER",
            new TextAttributes(new Color(0, 112, 32), null, null, null, Font.BOLD));

    static final TextAttributesKey ENUM_HIGHLIGHTER = createTextAttributesKey("ENUM_HIGHLIGHTER",
            new TextAttributes(new Color(0, 112, 32), null, null, null, Font.PLAIN));

    static final TextAttributesKey NUMBERS_HIGHLIGHTER = createTextAttributesKey("NUMBERS_HIGHLIGHTER",
            new TextAttributes(new Color(32, 128, 80), null, null, null, Font.PLAIN));

    static final TextAttributesKey STRING_HIGHLIGHTER = createTextAttributesKey("STRING_HIGHLIGHTER",
            new TextAttributes(new Color(64, 112, 160), null, null, null, Font.PLAIN));

    static final TextAttributesKey COMMENT_HIGHLIGHTER = createTextAttributesKey("COMMENT_HIGHLIGHTER",
            new TextAttributes(new Color(64, 128, 144), null, null, null, Font.ITALIC));

    public static final TextAttributesKey BAD_CHARACTER_HIGHLIGHTER =
            createTextAttributesKey("MAPFILE_BAD_CHARACTER_HIGHLIGHTER", HighlighterColors.BAD_CHARACTER);

    public static final List<IElementType> OBJECT_KEYWORD_LIST = Arrays.asList(
            CLASS,
            CLUSTER,
            COMPOSITE,
            END,
            FEATURE,
            GRID,
            JOIN,
            LABEL,
            LAYER,
            LEADER,
            LEGEND,
            MAP,
            METADATA,
            PATTERN,
            POINTS,
            PROJECTION,
            QUERYMAP,
            REFERENCE,
            SCALEBAR,
            STYLE,
            SYMBOL,
            VALIDATION,
            WEB
    );

    public static final List<IElementType> CORE_ATTRIBUTE_LIST = Arrays.asList(
            CONFIG,
            CONNECTION,
            DATA,
            EXPRESSION,
            FONTSET,
            FROM,
            IMAGEPATH,
            IMAGEURL,
            MAXTEMPLATE,
            MINTEMPLATE,
            NAME,
            SHAPEPATH,
            STATUS,
            SYMBOLSET,
            TABLE,
            TEMPPATH,
            TITLE,
            TO,
            TYPE
    );

    private static final List<IElementType> ATTRIBUTE_LIST = Arrays.asList(
            ALIGN,
            ANCHORPOINT,
            ANGLE,
            ANTIALIAS,
            BACKGROUNDCOLOR,
            BROWSEFORMAT,
            BUFFER,
            CHARACTER,
            CLASSGROUP,
            CLASSITEM,
            COLOR,
            COMPOP,
            CONNECTIONTYPE,
            DATAPATTERN,
            DEBUG,
            DEFRESOLUTION,
            DUMP,
            ENCODING,
            ERROR,
            EXTENT,
            FILLED,
            FILTER,
            FILTERITEM,
            FONT,
            FOOTER,
            FORCE,
            GAP,
            GEOMTRANSFORM,
            GRIDSTEP,
            GRIDSTEP,
            GROUP,
            HEADER,
            IMAGE,
            IMAGECOLOR,
            IMAGETYPE,
            INITIALGAP,
            INTERLACE,
            ITEMS,
            KEYIMAGE,
            KEYSIZE,
            KEYSPACING,
            LABELCACHE,
            LABELFORMAT,
            LABELITEM,
            LABELMAXSCALEDENOM,
            LABELMINSCALEDENOM,
            LABELREQUIRES,
            LEGENDFORMAT,
            LINECAP,
            LINEJOIN,
            LINEJOINMAXSIZE,
            MapfileTypes.EMPTY,
            MARKER,
            MARKERSIZE,
            MASK,
            MAXARCS,
            MAXBOXSIZE,
            MAXDISTANCE,
            MAXFEATURES,
            MAXGEOWIDTH,
            MAXINTERVAL,
            MAXLENGTH,
            MAXOVERLAPANGLE,
            MAXSCALEDENOM,
            MAXSIZE,
            MAXSUBDIVIDE,
            MAXWIDTH,
            MINARCS,
            MINBOXSIZE,
            MINDISTANCE,
            MINFEATURESIZE,
            MINGEOWIDTH,
            MININTERVAL,
            MINSCALEDENOM,
            MINSUBDIVIDE,
            OFFSET,
            OFFSITE,
            OPACITY,
            OUTLINECOLOR,
            OUTLINEWIDTH,
            PARTIALS,
            PLUGIN,
            POLAROFFSET,
            POSITION,
            POSTLABELCACHE,
            PRIORITY,
            PROCESSING,
            QUERYFORMAT,
            REGION,
            REPEATDISTANCE,
            REQUIRES,
            RESOLUTION,
            SCALEDENOM,
            SHADOWCOLOR,
            SHADOWSIZE,
            SIZE,
            SIZEUNITS,
            STYLEITEM,
            SYMBOLSCALEDENOM,
            TEMPLATE,
            TEMPLATEPATTERN,
            TEXT,
            TILEINDEX,
            TILEITEM,
            TILESRS,
            TOLERANCE,
            TOLERANCEUNITS,
            TRANSFORM,
            TRANSPARENT,
            UNITS,
            UTFDATA,
            UTFITEM,
            WIDTH,
            WKT,
            WRAP
    );

    public static final List<IElementType> KEYWORD_LIST = Arrays.asList(
            AUTO,
            AUTO2,
            BEVEL,
            BUTT,
            CAIROPNG,
            CC,
            CENTER,
            CGI_CONTEXT_URL,
            CHART,
            CIRCLE,
            CL,
            CONTOUR,
            CR,
            CSV,
            DD,
            DDMM,
            DDMMSS,
            DEFAULT,
            ELLIPSE,
            FAIL,
            FALSE,
            FEET,
            FOLLOW,
            GIANT,
            GIF,
            GTIFF,
            HATCH,
            HILITE,
            IGNORE,
            INCHES,
            JPEG,
            KERNELDENSITY,
            KILOMETERS,
            KML,
            KMZ,
            LARGE,
            LC,
            LEFT,
            LINE,
            LL,
            LOCAL,
            LOG,
            LR,
            MEDIUM,
            METERS,
            MILES,
            MITER,
            MS_ENCRYPTION_KEY,
            MS_ERRORFILE,
            MS_NONSQUARE,
            MYSQL,
            NAUTICALMILES,
            NO,
            NONE,
            NORMAL,
            OFF,
            OGR,
            ON,
            ORACLESPATIAL,
            PDF,
            PERCENTAGES,
            PIXELS,
            PIXMAP,
            PLUGIN,
            PNG,
            PNG8,
            POINT,
            POLYGON,
            POSTGIS,
            POSTGRESQL,
            PROJ_LIB,
            QUERY,
            RASTER,
            RIGHT,
            ROUND,
            SDE,
            SELECTED,
            SMALL,
            SQUARE,
            SVG,
            TINY,
            TRUE,
            TRUETYPE,
            UC,
            UL,
            UNION,
            UR,
            UVRASTER,
            VECTOR,
            WFS,
            WMS,
            YES
    );

    private static final List<IElementType> NUMBER_LIST = Arrays.asList(
            ATTRIBUTETOKEN,
            DOUBLE,
            INTEGER,
            LISTEXPRESSIONTOKEN,
            LOGICALEXPRESSIONTOKEN,
            NUMBER,
            REGEXTOKEN
    );

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MapfileLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {

        /*if (OBJECT_KEYWORD_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{OBJECT_KEYWORD_HIGHLIGHTER};

        } else if (CORE_ATTRIBUTE_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{CORE_ATTRIBUTE_HIGHLIGHTER};

        } else if (KEYWORD_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{OBJECT_KEYWORD_HIGHLIGHTER};

        } else if (ATTRIBUTE_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{ATTRIBUTES_HIGHLIGHTER};

        } else if (NUMBER_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{NUMBER_VALUE_HIGHLIGHTER};

        } else if (STRING.equals(tokenType)) {
            return new TextAttributesKey[]{STRING_VALUE_HIGHLIGHTER};

        } else if (COMMENT.equals(tokenType)) {
            return new TextAttributesKey[]{COMMENT_HIGHLIGHTER};

        } else if (TokenType.BAD_CHARACTER.equals(tokenType)) {
            return new TextAttributesKey[]{BAD_CHARACTER_HIGHLIGHTER};
        */

        if (OBJECT_KEYWORD_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{KEYWORD_HIGHLIGHTER};

        } else if (CORE_ATTRIBUTE_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{KEYWORD_HIGHLIGHTER};

        } else if (KEYWORD_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{ENUM_HIGHLIGHTER};

        } else if (ATTRIBUTE_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{KEYWORD_HIGHLIGHTER};

        } else if (NUMBER_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{NUMBERS_HIGHLIGHTER};

        } else if (STRING.equals(tokenType)) {
            return new TextAttributesKey[]{STRING_HIGHLIGHTER};

        } else if (COMMENT.equals(tokenType)) {
            return new TextAttributesKey[]{COMMENT_HIGHLIGHTER};

        } else if (TokenType.BAD_CHARACTER.equals(tokenType)) {
            return new TextAttributesKey[]{BAD_CHARACTER_HIGHLIGHTER};

        }else {
            return new TextAttributesKey[0];
        }
    }
}

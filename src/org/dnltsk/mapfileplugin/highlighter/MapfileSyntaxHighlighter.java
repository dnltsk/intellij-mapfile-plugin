package org.dnltsk.mapfileplugin.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.dnltsk.mapfileplugin.MapfileLexerAdapter;
import org.dnltsk.mapfileplugin.psi.MapfileTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static org.dnltsk.mapfileplugin.psi.MapfileTypes.*;

public class MapfileSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey OBJECT_KEYWORD_HIGHLIGHTER =
            createTextAttributesKey("MAPFILE_OBJECT_KEYWORD_HIGHLIGHTER", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey ATTRIBUTES_HIGHLIGHTER =
            createTextAttributesKey("MAPFILE_ATTRIBUTES_HIGHLIGHTER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey CORE_ATTRIBUTE_HIGHLIGHTER =
            createTextAttributesKey("MAPFILE_CORE_ATTRIBUTES_HIGHLIGHTER", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey STRING_VALUE_HIGHLIGHTER =
            createTextAttributesKey("STRING_VALUE_HIGHLIGHTER", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER_VALUE_HIGHLIGHTER =
            createTextAttributesKey("NUMBER_VALUE_HIGHLIGHTER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT_HIGHLIGHTER =
            createTextAttributesKey("MAPFILE_COMMENT_HIGHLIGHTER", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER_HIGHLIGHTER =
            createTextAttributesKey("MAPFILE_BAD_CHARACTER_HIGHLIGHTER", HighlighterColors.BAD_CHARACTER);

    private static final List<IElementType> OBJECT_KEYWORD_LIST = Arrays.asList(
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

    private static final List<IElementType> CORE_ATTRIBUTE_LIST = Arrays.asList(
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
            ANGLE,
            BACKGROUNDCOLOR,
            BROWSEFORMAT,
            BUFFER,
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
            FILTER,
            FILTERITEM,
            FOOTER,
            GEOMTRANSFORM,
            GRIDSTEP,
            GROUP,
            HEADER,
            IMAGE,
            IMAGECOLOR,
            IMAGETYPE,
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
            MAXSCALEDENOM,
            MAXSIZE,
            MAXSUBDIVIDE,
            MINARCS,
            MINBOXSIZE,
            MINGEOWIDTH,
            MININTERVAL,
            MINSCALEDENOM,
            MINSUBDIVIDE,
            OFFSITE,
            OPACITY,
            OUTLINECOLOR,
            PLUGIN,
            POSITION,
            POSTLABELCACHE,
            PROCESSING,
            QUERYFORMAT,
            REGION,
            REQUIRES,
            RESOLUTION,
            SCALEDENOM,
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
            UNITS,
            UTFDATA,
            UTFITEM,
            WKT
    );

    private static final List<IElementType> KEYWORD_LIST = Arrays.asList(
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
            FAIL,
            FALSE,
            FEET,
            GIF,
            GTIFF,
            HILITE,
            IGNORE,
            INCHES,
            JPEG,
            KERNELDENSITY,
            KILOMETERS,
            KML,
            KMZ,
            LC,
            LEFT,
            LINE,
            LL,
            LOCAL,
            LOG,
            LR,
            METERS,
            MILES,
            MS_ENCRYPTION_KEY,
            MS_ERRORFILE,
            MS_NONSQUARE,
            MYSQL,
            NAUTICALMILES,
            NO,
            NORMAL,
            OFF,
            OGR,
            ON,
            ORACLESPATIAL,
            PDF,
            PERCENTAGES,
            PIXELS,
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
            SDE,
            SELECTED,
            SVG,
            TRUE,
            UC,
            UL,
            UNION,
            UR,
            UVRASTER,
            WFS,
            WMS,
            YES
    );

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MapfileLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (OBJECT_KEYWORD_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{OBJECT_KEYWORD_HIGHLIGHTER};

        } else if (CORE_ATTRIBUTE_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{CORE_ATTRIBUTE_HIGHLIGHTER};

        } else if (KEYWORD_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{OBJECT_KEYWORD_HIGHLIGHTER};

        } else if (ATTRIBUTE_LIST.contains(tokenType)) {
            return new TextAttributesKey[]{ATTRIBUTES_HIGHLIGHTER};

        } else if (STRING.equals(tokenType)) {
            return new TextAttributesKey[]{STRING_VALUE_HIGHLIGHTER};

        } else if (NUMBER.equals(tokenType)) {
            return new TextAttributesKey[]{NUMBER_VALUE_HIGHLIGHTER};

        } else if (COMMENT.equals(tokenType)) {
            return new TextAttributesKey[]{COMMENT_HIGHLIGHTER};

        } else if (TokenType.BAD_CHARACTER.equals(tokenType)) {
            return new TextAttributesKey[]{BAD_CHARACTER_HIGHLIGHTER};

        } else {
            return new TextAttributesKey[0];
        }
    }
}

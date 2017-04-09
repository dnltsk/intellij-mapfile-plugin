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
            MapfileTypes.CLASS,
            MapfileTypes.CLUSTER,
            MapfileTypes.COMPOSITE,
            MapfileTypes.END,
            MapfileTypes.FEATURE,
            MapfileTypes.GRID,
            MapfileTypes.JOIN,
            MapfileTypes.LAYER,
            MapfileTypes.LEGEND,
            MapfileTypes.MAP,
            MapfileTypes.METADATA,
            MapfileTypes.PROJECTION,
            MapfileTypes.QUERYMAP,
            MapfileTypes.REFERENCE,
            MapfileTypes.SCALEBAR,
            MapfileTypes.SYMBOL,
            MapfileTypes.VALIDATION,
            MapfileTypes.WEB
    );

    private static final List<IElementType> CORE_ATTRIBUTE_LIST = Arrays.asList(
            MapfileTypes.CONFIG,
            MapfileTypes.CONNECTION,
            MapfileTypes.DATA,
            MapfileTypes.FONTSET,
            MapfileTypes.IMAGEPATH,
            MapfileTypes.IMAGEURL,
            MapfileTypes.MAXTEMPLATE,
            MapfileTypes.MINTEMPLATE,
            MapfileTypes.NAME,
            MapfileTypes.SHAPEPATH,
            MapfileTypes.STATUS,
            MapfileTypes.SYMBOLSET,
            MapfileTypes.TEMPPATH,
            MapfileTypes.TITLE,
            MapfileTypes.TYPE
    );

    private static final List<IElementType> ATTRIBUTE_LIST = Arrays.asList(
            MapfileTypes.ANGLE,
            MapfileTypes.BROWSEFORMAT,
            MapfileTypes.CLASSGROUP,
            MapfileTypes.CLASSITEM,
            MapfileTypes.CONNECTIONTYPE,
            MapfileTypes.DATAPATTERN,
            MapfileTypes.DEBUG,
            MapfileTypes.DEFRESOLUTION,
            MapfileTypes.DUMP,
            MapfileTypes.EMPTY,
            MapfileTypes.ENCODING,
            MapfileTypes.ERROR,
            MapfileTypes.EXTENT,
            MapfileTypes.FILTER,
            MapfileTypes.FILTERITEM,
            MapfileTypes.FOOTER,
            MapfileTypes.GEOMTRANSFORM,
            MapfileTypes.GROUP,
            MapfileTypes.HEADER,
            MapfileTypes.IMAGECOLOR,
            MapfileTypes.IMAGETYPE,
            MapfileTypes.INTERLACE,
            MapfileTypes.LABELCACHE,
            MapfileTypes.LABELITEM,
            MapfileTypes.LABELMAXSCALEDENOM,
            MapfileTypes.LABELMINSCALEDENOM,
            MapfileTypes.LABELREQUIRES,
            MapfileTypes.LEGENDFORMAT,
            MapfileTypes.MASK,
            MapfileTypes.MAXFEATURES,
            MapfileTypes.MAXGEOWIDTH,
            MapfileTypes.MAXSCALEDENOM,
            MapfileTypes.MAXSIZE,
            MapfileTypes.MINGEOWIDTH,
            MapfileTypes.MINSCALEDENOM,
            MapfileTypes.OFFSITE,
            MapfileTypes.PLUGIN,
            MapfileTypes.POSTLABELCACHE,
            MapfileTypes.PROCESSING,
            MapfileTypes.QUERYFORMAT,
            MapfileTypes.REQUIRES,
            MapfileTypes.RESOLUTION,
            MapfileTypes.SCALEDENOM,
            MapfileTypes.SIZE,
            MapfileTypes.SIZEUNITS,
            MapfileTypes.STYLEITEM,
            MapfileTypes.SYMBOLSCALEDENOM,
            MapfileTypes.TEMPLATE,
            MapfileTypes.TEMPLATEPATTERN,
            MapfileTypes.TILEINDEX,
            MapfileTypes.TILEITEM,
            MapfileTypes.TILESRS,
            MapfileTypes.TOLERANCE,
            MapfileTypes.TOLERANCEUNITS,
            MapfileTypes.TRANSFORM,
            MapfileTypes.UNITS,
            MapfileTypes.UTFDATA,
            MapfileTypes.UTFITEM
    );

    private static final List<IElementType> KEYWORD_LIST = Arrays.asList(
            MapfileTypes.CAIROPNG,
            MapfileTypes.CC,
            MapfileTypes.CGI_CONTEXT_URL,
            MapfileTypes.CHART,
            MapfileTypes.CIRCLE,
            MapfileTypes.CL,
            MapfileTypes.CONTOUR,
            MapfileTypes.CR,
            MapfileTypes.DD,
            MapfileTypes.DEFAULT,
            MapfileTypes.FAIL,
            MapfileTypes.FALSE,
            MapfileTypes.FEET,
            MapfileTypes.GIF,
            MapfileTypes.GTIFF,
            MapfileTypes.IGNORE,
            MapfileTypes.INCHES,
            MapfileTypes.JPEG,
            MapfileTypes.KERNELDENSITY,
            MapfileTypes.KILOMETERS,
            MapfileTypes.KML,
            MapfileTypes.KMZ,
            MapfileTypes.LC,
            MapfileTypes.LINE,
            MapfileTypes.LL,
            MapfileTypes.LOCAL,
            MapfileTypes.LOG,
            MapfileTypes.LR,
            MapfileTypes.METERS,
            MapfileTypes.MILES,
            MapfileTypes.MS_ENCRYPTION_KEY,
            MapfileTypes.MS_ERRORFILE,
            MapfileTypes.MS_NONSQUARE,
            MapfileTypes.NAUTICALMILES,
            MapfileTypes.NO,
            MapfileTypes.OFF,
            MapfileTypes.OGR,
            MapfileTypes.ON,
            MapfileTypes.ORACLESPATIAL,
            MapfileTypes.PDF,
            MapfileTypes.PERCENTAGES,
            MapfileTypes.PIXELS,
            MapfileTypes.PLUGIN,
            MapfileTypes.PNG,
            MapfileTypes.PNG8,
            MapfileTypes.POINT,
            MapfileTypes.POLYGON,
            MapfileTypes.POSTGIS,
            MapfileTypes.PROJ_LIB,
            MapfileTypes.QUERY,
            MapfileTypes.RASTER,
            MapfileTypes.SDE,
            MapfileTypes.SVG,
            MapfileTypes.TRUE,
            MapfileTypes.UC,
            MapfileTypes.UL,
            MapfileTypes.UNION,
            MapfileTypes.UR,
            MapfileTypes.UVRASTER,
            MapfileTypes.WFS,
            MapfileTypes.WMS,
            MapfileTypes.YES
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

        } else if (MapfileTypes.STRING.equals(tokenType)) {
            return new TextAttributesKey[]{STRING_VALUE_HIGHLIGHTER};

        } else if (MapfileTypes.NUMBER.equals(tokenType)) {
            return new TextAttributesKey[]{NUMBER_VALUE_HIGHLIGHTER};

        } else if (MapfileTypes.COMMENT.equals(tokenType)) {
            return new TextAttributesKey[]{COMMENT_HIGHLIGHTER};

        } else if (TokenType.BAD_CHARACTER.equals(tokenType)) {
            return new TextAttributesKey[]{BAD_CHARACTER_HIGHLIGHTER};

        } else {
            return new TextAttributesKey[0];
        }
    }
}

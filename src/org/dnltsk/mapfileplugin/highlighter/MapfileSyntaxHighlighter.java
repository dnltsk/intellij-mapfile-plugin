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
            MapfileTypes.END,
            MapfileTypes.MAP,
            MapfileTypes.LAYER,
            MapfileTypes.CLASS,
            MapfileTypes.CLUSTER,
            MapfileTypes.COMPOSITE,
            MapfileTypes.FEATURE,
            MapfileTypes.GRID,
            MapfileTypes.JOIN,
            MapfileTypes.METADATA,
            MapfileTypes.PROJECTION,
            MapfileTypes.VALIDATION,
            MapfileTypes.TRUE,
            MapfileTypes.FALSE);

    private static final List<IElementType> CORE_ATTRIBUTE_LIST = Arrays.asList(
            MapfileTypes.NAME,
            MapfileTypes.TITLE,
            MapfileTypes.TYPE,
            MapfileTypes.STATUS,
            MapfileTypes.DATA,
            MapfileTypes.CONNECTION);

    private static final List<IElementType> ATTRIBUTE_LIST = Arrays.asList(
            MapfileTypes.DEBUG,
            MapfileTypes.EXTENT,
            MapfileTypes.FILTER,
            MapfileTypes.GEOMTRANSFORM,
            MapfileTypes.LABELCACHE,
            MapfileTypes.OFFSITE,
            MapfileTypes.SIZEUNITS,
            MapfileTypes.STYLEITEM,
            MapfileTypes.TOLERANCEUNITS,
            MapfileTypes.TRANSFORM,
            MapfileTypes.UNIT,
            MapfileTypes.CLASSGROUP,
            MapfileTypes.CLASSITEM,
            MapfileTypes.CONNECTIONTYPE,
            MapfileTypes.DUMP,
            MapfileTypes.ENCODING,
            MapfileTypes.FOOTER,
            MapfileTypes.FILTERITEM,
            MapfileTypes.GROUP,
            MapfileTypes.HEADER,
            MapfileTypes.LABELITEM,
            MapfileTypes.LABELMAXSCALEDENOM,
            MapfileTypes.LABELMINSCALEDENOM,
            MapfileTypes.LABELREQUIRES,
            MapfileTypes.MASK,
            MapfileTypes.MAXFEATURES,
            MapfileTypes.MAXGEOWIDTH,
            MapfileTypes.MAXSCALEDENOM,
            MapfileTypes.MINGEOWIDTH,
            MapfileTypes.MINSCALEDENOM,
            MapfileTypes.PLUGIN,
            MapfileTypes.POSTLABELCACHE,
            MapfileTypes.PROCESSING,
            MapfileTypes.REQUIRES,
            MapfileTypes.SYMBOLSCALEDENOM,
            MapfileTypes.TEMPLATE,
            MapfileTypes.TILEINDEX,
            MapfileTypes.TILEITEM,
            MapfileTypes.TILESRS,
            MapfileTypes.TOLERANCE,
            MapfileTypes.UTFDATA,
            MapfileTypes.UTFITEM);

    private static final List<IElementType> KEYWORD_LIST = Arrays.asList(
            MapfileTypes.TRUE,
            MapfileTypes.FALSE,
            MapfileTypes.ON,
            MapfileTypes.OFF,
            MapfileTypes.FEET,
            MapfileTypes.INCHES,
            MapfileTypes.KILOMETERS,
            MapfileTypes.METERS,
            MapfileTypes.MILES,
            MapfileTypes.NAUTICALMILES,
            MapfileTypes.PIXELS,
            MapfileTypes.DD,
            MapfileTypes.PERCENTAGES,
            MapfileTypes.CONTOUR,
            MapfileTypes.KERNELDENSITY,
            MapfileTypes.LOCAL,
            MapfileTypes.OGR,
            MapfileTypes.ORACLESPATIAL,
            MapfileTypes.PLUGIN,
            MapfileTypes.POSTGIS,
            MapfileTypes.SDE,
            MapfileTypes.UNION,
            MapfileTypes.UVRASTER,
            MapfileTypes.WFS,
            MapfileTypes.WMS,
            MapfileTypes.DEFAULT,
            MapfileTypes.UL,
            MapfileTypes.UC,
            MapfileTypes.UR,
            MapfileTypes.CL,
            MapfileTypes.CC,
            MapfileTypes.CR,
            MapfileTypes.LL,
            MapfileTypes.LC,
            MapfileTypes.LR,
            MapfileTypes.CHART,
            MapfileTypes.CIRCLE,
            MapfileTypes.LINE,
            MapfileTypes.POINT,
            MapfileTypes.POLYGON,
            MapfileTypes.RASTER,
            MapfileTypes.QUERY
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

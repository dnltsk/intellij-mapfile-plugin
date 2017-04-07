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

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class MapfileSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey OBJECT_KEYWORD =
            createTextAttributesKey("MAPFILE_OBJECT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey ATTRIBUTES =
            createTextAttributesKey("MAPFILE_ATTRIBUTES", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey CORE_ATTRIBUTES =
            createTextAttributesKey("MAPFILE_CORE_ATTRIBUTES", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey STRING_VALUE =
            createTextAttributesKey("STRING_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER_VALUE =
            createTextAttributesKey("NUMBER_VALUE", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("MAPFILE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("MAPFILE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MapfileLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (Arrays.asList(
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
                MapfileTypes.FALSE).contains(tokenType)) {
            return new TextAttributesKey[]{OBJECT_KEYWORD};

        } else if (Arrays.asList(
                MapfileTypes.NAME,
                MapfileTypes.TITLE,
                MapfileTypes.TYPE,
                MapfileTypes.DATA,
                MapfileTypes.CONNECTION).contains(tokenType)) {
            return new TextAttributesKey[]{CORE_ATTRIBUTES};

        } else if (Arrays.asList(
                MapfileTypes.DEBUG,
                MapfileTypes.EXTENT,
                MapfileTypes.FILTER,
                MapfileTypes.GEOMTRANSFORM,
                MapfileTypes.LABELCACHE,
                MapfileTypes.OFFSITE,
                MapfileTypes.SIZEUNITS,
                MapfileTypes.STATUS,
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
                MapfileTypes.UTFITEM).contains(tokenType)) {
            return new TextAttributesKey[]{ATTRIBUTES};

        } else if (MapfileTypes.STRING.equals(tokenType)) {
            return new TextAttributesKey[]{STRING_VALUE};

        } else if (MapfileTypes.NUMBER.equals(tokenType)) {
            return new TextAttributesKey[]{NUMBER_VALUE};

        } else if (MapfileTypes.COMMENT.equals(tokenType)) {
            return new TextAttributesKey[]{COMMENT};

        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return new TextAttributesKey[]{BAD_CHARACTER};

        } else {
            return new TextAttributesKey[0];
        }
    }
}

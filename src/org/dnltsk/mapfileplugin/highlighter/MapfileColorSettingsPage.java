package org.dnltsk.mapfileplugin.highlighter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.dnltsk.mapfileplugin.MapfileIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class MapfileColorSettingsPage  implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Attributes (Core)", MapfileSyntaxHighlighter.CORE_ATTRIBUTE_HIGHLIGHTER),
            new AttributesDescriptor("Attributes (Others)", MapfileSyntaxHighlighter.ATTRIBUTES_HIGHLIGHTER),
            new AttributesDescriptor("Bad Characters", MapfileSyntaxHighlighter.BAD_CHARACTER_HIGHLIGHTER),
            new AttributesDescriptor("Comments", MapfileSyntaxHighlighter.COMMENT_HIGHLIGHTER),
            new AttributesDescriptor("Object Keywords", MapfileSyntaxHighlighter.OBJECT_KEYWORD_HIGHLIGHTER),
            new AttributesDescriptor("Values (Number)", MapfileSyntaxHighlighter.NUMBER_VALUE_HIGHLIGHTER),
            new AttributesDescriptor("Values (String)", MapfileSyntaxHighlighter.STRING_VALUE_HIGHLIGHTER)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return MapfileIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new MapfileSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "MAP\n" +
                "    NAME \"sample\"\n" +
                "    STATUS ON\n" +
                "    SIZE 600 400\n" +
                "    SYMBOLSET \"../etc/symbols.txt\"\n" +
                "    EXTENT -180 -90 180 90\n" +
                "    UNITS DD\n" +
                "    SHAPEPATH \"../data\"\n" +
                "    IMAGECOLOR 255 255 255\n" +
                "    FONTSET \"../etc/fonts.txt\"\n" +
                "\n" +
                "    #\n" +
                "    # Start of web interface definition\n" +
                "    #\n" +
                "    WEB\n" +
                "        IMAGEPATH \"/ms4w/tmp/ms_tmp/\"\n" +
                "        IMAGEURL \"/ms_tmp/\"\n" +
                "    END # WEB\n" +
                "\n" +
                "    #\n" +
                "    # Start of layer definitions\n" +
                "    #\n" +
                "    LAYER\n" +
                "        NAME \"global-raster\"\n" +
                "        TYPE RASTER\n" +
                "        STATUS DEFAULT\n" +
                "        DATA \"bluemarble.gif\"\n" +
                "    END # LAYER\n" +
                "END # MAP";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Mapfile";
    }
}
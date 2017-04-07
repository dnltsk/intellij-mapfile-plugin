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
            new AttributesDescriptor("Key", MapfileSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", MapfileSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", MapfileSyntaxHighlighter.VALUE),
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
        return "MAP \n" +
                "    NAME 'name'\n" +
                "    TITLE \"bar title\"\n" +
                "    LAYER\n" +
                "      LABELCACHe OFF\n" +
                "      NAME \"layer alarm\"\n" +
                "      TYPE CIRCLE\n" +
                "      STATUS on\n" +
                "      Title \"foo\n" +
                "      FEATURE\n" +
                "        POINTS\n" +
                "          74.01 -53.8\n" +
                "          110.7 -22.16\n" +
                "        END\n" +
                "      END\n" +
                "      CLASS\n" +
                "        STYLE\n" +
                "          COLOR 0 0 255\n" +
                "        END\n" +
                "      END\n" +
                "    END\n" +
                "END";
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
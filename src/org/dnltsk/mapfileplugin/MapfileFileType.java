package org.dnltsk.mapfileplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MapfileFileType  extends LanguageFileType {
    public static final MapfileFileType INSTANCE = new MapfileFileType();

    private MapfileFileType() {
        super(MapfileLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Mapfile";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "UMN Mapserver Mapfile";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "map";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MapfileIcons.FILE;
    }
}
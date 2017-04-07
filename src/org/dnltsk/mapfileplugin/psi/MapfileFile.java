package org.dnltsk.mapfileplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.dnltsk.mapfileplugin.MapfileFileType;
import org.dnltsk.mapfileplugin.MapfileLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;


/**
 * Created by danielt on 07.04.17.
 */
public class MapfileFile extends PsiFileBase {
    public MapfileFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MapfileLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return MapfileFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Mapfile File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
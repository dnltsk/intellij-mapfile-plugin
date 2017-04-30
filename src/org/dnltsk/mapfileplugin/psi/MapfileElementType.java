package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.dnltsk.mapfileplugin.MapfileLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MapfileElementType extends IElementType {
    public MapfileElementType(@NotNull @NonNls String debugName) {
        super(debugName, MapfileLanguage.INSTANCE);
    }
}
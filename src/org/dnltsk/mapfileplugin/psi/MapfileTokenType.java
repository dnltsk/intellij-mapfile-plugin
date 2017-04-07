package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.dnltsk.mapfileplugin.MapfileLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by danielt on 07.04.17.
 */
public class MapfileTokenType  extends IElementType {

    public MapfileTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MapfileLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MapfileTokenType." + super.toString();
    }
}

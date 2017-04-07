package org.dnltsk.mapfileplugin;

import com.intellij.lang.Language;

/**
 * Created by danielt on 07.04.17.
 */
public class MapfileLanguage extends Language {
    public static final MapfileLanguage INSTANCE = new MapfileLanguage();

    private MapfileLanguage() {
        super("Mapfile");
    }
}


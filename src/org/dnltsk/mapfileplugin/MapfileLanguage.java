package org.dnltsk.mapfileplugin;

import com.intellij.lang.Language;

public class MapfileLanguage extends Language {
    public static final MapfileLanguage INSTANCE = new MapfileLanguage();

    private MapfileLanguage() {
        super("Mapfile");
    }
}


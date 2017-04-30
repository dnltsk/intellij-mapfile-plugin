package org.dnltsk.mapfileplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class MapfileLexerAdapter extends FlexAdapter {
    public MapfileLexerAdapter() {
        super(new MapfileLexer((Reader) null));
    }
}
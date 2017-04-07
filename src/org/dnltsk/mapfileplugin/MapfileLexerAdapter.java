package org.dnltsk.mapfileplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by danielt on 07.04.17.
 */
public class MapfileLexerAdapter extends FlexAdapter {
    public MapfileLexerAdapter() {
        super(new MapfileLexer((Reader) null));
    }
}
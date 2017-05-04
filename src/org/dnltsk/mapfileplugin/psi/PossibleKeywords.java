package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.tree.IElementType;

import java.util.ArrayList;
import java.util.List;

public class PossibleKeywords {

    private List<IElementType> keywords = new ArrayList<>();

    private List<IElementType> deprecatedKeywords = new ArrayList<>();

    public PossibleKeywords(List<IElementType> keywords, List<IElementType> deprecatedKeywords) {
        this.keywords = keywords;
        this.deprecatedKeywords = deprecatedKeywords;
    }

    public List<IElementType> getKeywords() {
        return keywords;
    }

    public List<IElementType> getDeprecatedKeywords() {
        return deprecatedKeywords;
    }
}

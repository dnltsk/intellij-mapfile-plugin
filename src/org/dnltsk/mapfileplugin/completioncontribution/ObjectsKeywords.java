package org.dnltsk.mapfileplugin.completioncontribution;

import com.intellij.psi.PsiElement;
import org.dnltsk.mapfileplugin.psi.PossibleKeywords;

import java.util.List;

public class ObjectsKeywords {

    public List<Class<? extends PsiElement>> objects;
    public PossibleKeywords possibleKeywords;

    public ObjectsKeywords(List<Class<? extends PsiElement>> objects, PossibleKeywords possibleKeywords) {
        this.objects = objects;
        this.possibleKeywords = possibleKeywords;
    }
}

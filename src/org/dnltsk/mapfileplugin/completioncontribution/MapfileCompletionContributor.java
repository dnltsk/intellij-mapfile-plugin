package org.dnltsk.mapfileplugin.completioncontribution;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.ProcessingContext;
import org.dnltsk.mapfileplugin.MapfileLanguage;
import org.dnltsk.mapfileplugin.psi.MapfileKeywordDependencies;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

import static com.intellij.patterns.PlatformPatterns.psiElement;

public class MapfileCompletionContributor extends CompletionContributor {

    public MapfileCompletionContributor() {
        extendForKeywords();
    }

    private void extendForKeywords() {
        extend(CompletionType.BASIC,
                psiElement().withLanguage(MapfileLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {

                    @Override
                    protected void addCompletions(@NotNull CompletionParameters parameters,
                                                  ProcessingContext context,
                                                  @NotNull CompletionResultSet resultSet) {
                        PsiElement position = parameters.getOriginalPosition();
                        PsiElement element = position.getParent();
                        PsiElement parent = element.getParent();
                        if (isOnPrimitiveType(position)) {
                            return;
                        }
                        handleMapfileObject(element, parent, resultSet);
                    }
                });
    }

    private boolean isOnPrimitiveType(PsiElement position) {
        return (position.toString().equalsIgnoreCase("PsiElement(MapfileTokenType.string)")
                || position.toString().equalsIgnoreCase("PsiElement(MapfileTokenType.double)")
                || position.toString().equalsIgnoreCase("PsiElement(MapfileTokenType.number)")
                || position.toString().equalsIgnoreCase("PsiElement(MapfileTokenType.integer)"));
    }

    //
    // MapfileObject
    //
    private boolean handleMapfileObject(PsiElement element, PsiElement parent, CompletionResultSet resultSet) {
        //ELEMENT
        Set<Class<? extends PsiElement>> classes = MapfileKeywordDependencies.dependencyMap.keySet();

        if(!(element instanceof PsiErrorElementImpl)) {
            for (Class<? extends PsiElement> clazz : classes) {
                if (clazz.isInstance(element)) {
                    addEntries(resultSet, MapfileKeywordDependencies.dependencyMap.get(clazz));
                    return true;
                }
            }
        }
        //PARENT
        for (Class<? extends PsiElement> clazz : classes) {
            if (clazz.isInstance(parent)) {
                addEntries(resultSet, MapfileKeywordDependencies.dependencyMap.get(clazz));
                return true;
            }
        }
        return false;
    }

    private void addEntries(@NotNull CompletionResultSet resultSet, List<IElementType> allowedEntries) {
        for (IElementType allowedEntry : allowedEntries) {
            String name = allowedEntry.toString();
            if (name.contains(".")) {
                name = name.substring(name.lastIndexOf(".") + 1, name.length());
            }
            resultSet.addElement(LookupElementBuilder.create(name).bold());
        }
    }

}
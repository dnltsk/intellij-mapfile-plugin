package org.dnltsk.mapfileplugin.completioncontribution;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.ProcessingContext;
import org.dnltsk.mapfileplugin.MapfileLanguage;
import org.dnltsk.mapfileplugin.psi.MapfileKeywordDependencies;
import org.dnltsk.mapfileplugin.psi.PossibleKeywords;
import org.jetbrains.annotations.NotNull;

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
                        if (gotHintsFromErrorMessage(position, element, parent, resultSet)) {
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

    private boolean gotHintsFromErrorMessage(PsiElement position, PsiElement element, PsiElement parent, CompletionResultSet resultSet) {
        if (position instanceof PsiErrorElementImpl) {
            extractKeywordsFromPsiErrorElement(resultSet, (PsiErrorElementImpl) position);
            return true;

        } else if (position.getPrevSibling() != null
                && position.getPrevSibling() instanceof PsiErrorElementImpl) {
            extractKeywordsFromPsiErrorElement(resultSet, (PsiErrorElementImpl) position.getPrevSibling());
            return true;

        } else if (position.getNextSibling() != null
                && position.getNextSibling() instanceof PsiErrorElementImpl) {
            extractKeywordsFromPsiErrorElement(resultSet, (PsiErrorElementImpl) position.getNextSibling());
            return true;

        }
        /* else if (element instanceof PsiErrorElementImpl) {
            extractKeywordsFromPsiErrorElement(resultSet, (PsiErrorElementImpl) element);
            return true;

        } else if (parent instanceof PsiErrorElementImpl) {
            extractKeywordsFromPsiErrorElement(resultSet, (PsiErrorElementImpl) parent);
            return true;
        }*/
        return false;
    }

    //
    // KeywordsFromErrorMessage
    //
    private void extractKeywordsFromPsiErrorElement(@NotNull CompletionResultSet resultSet, PsiErrorElementImpl element) {
        String genericErrorDescription = element.getErrorDescription();
        String[] suggestions = extracKeywordsFromErrorDescription(genericErrorDescription);
        for (String suggestedToken : suggestions) {
            //TODO styling (common keywords bold)
            if (suggestedToken.contains(".")) {
                suggestedToken = suggestedToken.substring(suggestedToken.lastIndexOf(".") + 1, suggestedToken.length());
            }
            resultSet.addElement(LookupElementBuilder.create(suggestedToken.toUpperCase()));
        }
    }

    String[] extracKeywordsFromErrorDescription(String errorDescription) {
        if (errorDescription.contains(" expected, got ")) {
            errorDescription = errorDescription.substring(0, errorDescription.indexOf(" expected, got "));
        }
        errorDescription = errorDescription.replaceAll("MapfileTokenType\\.", "");
        String[] tokens = errorDescription.split("(, )|( or )");
        return tokens;
    }

    //
    // MapfileObject
    //
    private void handleMapfileObject(PsiElement element, PsiElement parent, CompletionResultSet resultSet) {
        Set<Class<? extends PsiElement>> classes = MapfileKeywordDependencies.dependencyMap.keySet();

        //ELEMENT
        if (!(element instanceof PsiErrorElementImpl)) {
            for (Class<? extends PsiElement> clazz : classes) {
                if (clazz.isInstance(element)) {
                    addKeywords(resultSet, MapfileKeywordDependencies.dependencyMap.get(clazz));
                }
            }
        }
        //PARENT
        for (Class<? extends PsiElement> clazz : classes) {
            if (clazz.isInstance(parent)) {
                addKeywords(resultSet, MapfileKeywordDependencies.dependencyMap.get(clazz));
            }
        }
    }

    private void addKeywords(@NotNull CompletionResultSet resultSet, PossibleKeywords possibleKeywords) {
        for (IElementType keyword : possibleKeywords.getKeywords()) {
            String name = keyword.toString();
            if (name.contains(".")) {
                name = name.substring(name.lastIndexOf(".") + 1, name.length());
            }
            resultSet.addElement(LookupElementBuilder.create(name).bold());
        }

        for (IElementType deprecatedKeyword : possibleKeywords.getDeprecatedKeywords()) {
            String name = deprecatedKeyword.toString();
            if (name.contains(".")) {
                name = name.substring(name.lastIndexOf(".") + 1, name.length());
            }
            resultSet.addElement(LookupElementBuilder.create(name).bold().strikeout());
        }
    }

}
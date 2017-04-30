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
                        if (gotHintsFromErrorMessage(position, element, parent, resultSet)) {
                            return;
                        }
                        gotMapfileObject(element, parent, resultSet);
                        //System.out.println("WHAT?");
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
            extractKeywordsFromErrorMessage(resultSet, (PsiErrorElementImpl) position);
            return true;

        } else if (position.getPrevSibling() != null
                && position.getPrevSibling() instanceof PsiErrorElementImpl) {
            extractKeywordsFromErrorMessage(resultSet, (PsiErrorElementImpl) position.getPrevSibling());
            return true;
        } else if (position.getPrevSibling() != null
                && position.getPrevSibling().getPrevSibling() != null
                && position.getPrevSibling().getPrevSibling() instanceof PsiErrorElementImpl) {
            extractKeywordsFromErrorMessage(resultSet, (PsiErrorElementImpl) position.getPrevSibling().getPrevSibling());
            return true;

        } else if (position.getNextSibling() != null
                && position.getNextSibling() instanceof PsiErrorElementImpl) {
            extractKeywordsFromErrorMessage(resultSet, (PsiErrorElementImpl) position.getNextSibling());
            return true;
        } else if (position.getNextSibling() != null
                && position.getNextSibling().getNextSibling() != null
                && position.getNextSibling().getNextSibling() instanceof PsiErrorElementImpl) {
            extractKeywordsFromErrorMessage(resultSet, (PsiErrorElementImpl) position.getNextSibling().getNextSibling());
            return true;

        } else if (element instanceof PsiErrorElementImpl) {
            extractKeywordsFromErrorMessage(resultSet, (PsiErrorElementImpl) element);
            return true;

        } else if (parent instanceof PsiErrorElementImpl) {
            extractKeywordsFromErrorMessage(resultSet, (PsiErrorElementImpl) parent);
            return true;
        }
        return false;
    }

    //
    // KeywordsFromErrorMessage
    //
    private void extractKeywordsFromErrorMessage(@NotNull CompletionResultSet resultSet, PsiErrorElementImpl element) {
        String genericErrorDescription = element.getErrorDescription();
        String[] suggestions = extractTokensFromErrorDescription(genericErrorDescription);
        for (String suggestedToken : suggestions) {
            //TODO styling (common keywords bold)
            if (suggestedToken.contains(".")) {
                suggestedToken = suggestedToken.substring(suggestedToken.lastIndexOf(".") + 1, suggestedToken.length());
            }
            resultSet.addElement(LookupElementBuilder.create(suggestedToken.toUpperCase()));
        }
    }

    String[] extractTokensFromErrorDescription(String errorDescription) {
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
    private boolean gotMapfileObject(PsiElement element, PsiElement parent, CompletionResultSet resultSet) {
        //ELEMENT
        Set<Class<? extends PsiElement>> classes = MapfileKeywordDependencies.dependencyMap.keySet();
        for (Class<? extends PsiElement> clazz : classes) {
            if (clazz.isInstance(element)) {
                addEntries(resultSet, MapfileKeywordDependencies.dependencyMap.get(clazz));
                return true;
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
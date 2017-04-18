package org.dnltsk.mapfileplugin.completioncontribution;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl;
import com.intellij.util.ProcessingContext;
import org.dnltsk.mapfileplugin.MapfileLanguage;
import org.jetbrains.annotations.NotNull;

import static com.intellij.patterns.PlatformPatterns.psiElement;

public class MapfileCompletionContributor extends CompletionContributor {

    public MapfileCompletionContributor() {

        extendForKeywords();

    }

    /**
     * https://stackoverflow.com/questions/43356835/how-to-generate-autocompletion-via-grammar-structure/43476718
     */
    private void extendForKeywords() {
        extend(
                CompletionType.BASIC,
                psiElement().withLanguage(MapfileLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {

                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        PsiElement element = parameters.getPosition().getParent();
                        String genericErrorDescription = ((PsiErrorElementImpl) element).getErrorDescription();
                        String[] suggestedTokens = extractTokensFromErrorDescription(genericErrorDescription);
                        for (String suggestedToken : suggestedTokens) {
                            //TODO ordering and styling (END on top, common keywords on top)
                            resultSet.addElement(LookupElementBuilder.create(suggestedToken.toUpperCase()));
                        }
                    }

                }
        );
    }

    String[] extractTokensFromErrorDescription(String errorDescription) {
        errorDescription = errorDescription.substring(0, errorDescription.indexOf(" expected, got "));
        errorDescription = errorDescription.replaceAll("MapfileTokenType\\.", "");
        String[] tokens = errorDescription.split("(, )|( or )");
        return tokens;
    }

}
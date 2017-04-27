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

                        //PsiElement parent = element.getParent();
                        //PsiTreeUtil.getChildrenOfTypeAsList(parent, PsiElement.class);

                        /*if (element.getContext() instanceof MapfileMapObject) {
                            System.out.println("MAP!!!");
                        } else if (element.getContext() instanceof MapfileLayerObject) {
                            System.out.println("LAYER!!!");
                        } else {
                            System.out.println("!!!FILE!!!");
                        }
                        //root
                        //MAP
                        //OTHER
                        */
                        if (element instanceof PsiErrorElementImpl) {
                            String genericErrorDescription = ((PsiErrorElementImpl) element).getErrorDescription();
                            String[] suggestions = extractTokensFromErrorDescription(genericErrorDescription);
                            //TODO order (END on top, common keywords on top)
                            String[] orderedSuggestions = orderSuggestions(suggestions);
                            for (String suggestedToken : suggestions) {
                                //TODO styling (common keywords bold)
                                resultSet.addElement(LookupElementBuilder.create(suggestedToken.toUpperCase()));
                            }
                        }
                    }

                }
        );
    }

    private String[] orderSuggestions(String[] suggestions) {
//        MapfileSyntaxHighlighter.OBJECT_KEYWORD_LIST;
        return new String[0];
    }

    String[] extractTokensFromErrorDescription(String errorDescription) {
        if (errorDescription.contains(" expected, got ")) {
            errorDescription = errorDescription.substring(0, errorDescription.indexOf(" expected, got "));
        }
        errorDescription = errorDescription.replaceAll("MapfileTokenType\\.", "");
        String[] tokens = errorDescription.split("(, )|( or )");
        return tokens;
    }

}
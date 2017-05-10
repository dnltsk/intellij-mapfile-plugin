package org.dnltsk.mapfileplugin.formatter;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import org.dnltsk.mapfileplugin.MapfileLanguage;
import org.dnltsk.mapfileplugin.psi.MapfileTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MapfileFormattingModelBuilder implements FormattingModelBuilder {
    @NotNull
    @Override
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
        return FormattingModelProvider.createFormattingModelForPsiFile(
                element.getContainingFile(),
                new MapfileBlock(
                        0,
                        element.getNode(),
                        Wrap.createWrap(WrapType.NORMAL,
                                false),
                        Alignment.createAlignment(),
                        createSpaceBuilder(settings)),
                settings);
    }

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, MapfileLanguage.INSTANCE)
                .before(MapfileTypes.COMMENT).spaceIf(true)
                .before(MapfileTypes.EXPRESSION).spaceIf(true)
                .before(MapfileTypes.STRING).spaceIf(true)
                .before(MapfileTypes.INTEGER).spaceIf(true)
                .before(MapfileTypes.DOUBLE).spaceIf(true);

    }



    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }
}

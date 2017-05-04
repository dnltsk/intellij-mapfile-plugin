package org.dnltsk.mapfileplugin.folding;


import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.dnltsk.mapfileplugin.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * main inspiring source
 * http://www.programcreek.com/java-api-examples/index.php?source_dir=idea-byteman-master/src/main/java/net/nicoulaj/idea/byteman/folding/BytemanFoldingBuilder.java
 */
public class MapfileFoldingGroups extends FoldingBuilderEx {

    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull PsiElement root, @NotNull Document document, boolean quick) {
        final List<FoldingDescriptor> descriptors = new ArrayList<FoldingDescriptor>();
        if (root instanceof MapfileFile) {
            registerRecursively(root, descriptors);
        }
        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
    }

    private void registerRecursively(@NotNull PsiElement currentElement, List<FoldingDescriptor> descriptors) {
        if (!(currentElement instanceof MapfileFile)) {
            //don't fold the file!
            descriptors.add(new FoldingDescriptor(currentElement, currentElement.getTextRange()));
        }
        for (PsiElement childElement : PsiTreeUtil.getChildrenOfTypeAsList(currentElement, PsiElement.class)) {
            if (childElement instanceof MapfileClassObject
                    || childElement instanceof MapfileClusterObject
                    || childElement instanceof MapfileCompositeObject
                    || childElement instanceof MapfileFeatureObject
                    || childElement instanceof MapfileGridObject
                    || childElement instanceof MapfileJoinObject
                    || childElement instanceof MapfileLabelObject
                    || childElement instanceof MapfileLayerObject
                    || childElement instanceof MapfileLeaderObject
                    || childElement instanceof MapfileLegendObject
                    || childElement instanceof MapfileMapObject
                    || childElement instanceof MapfileQuerymapObject
                    || childElement instanceof MapfileReferenceObject
                    || childElement instanceof MapfileScalebarObject
                    || childElement instanceof MapfileStyleObject
                    || childElement instanceof MapfileSymbolObject
                    || childElement instanceof MapfileTypes
                    || childElement instanceof MapfileVisitor
                    || childElement instanceof MapfileWebObject) {
                registerRecursively(childElement, descriptors);
            }
        }
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        String oneLineText = node.getText().replaceAll("\\s+", " ");
        if(oneLineText.length() >= 75){
            return oneLineText.substring(0, 75)+"..";
        }
        return oneLineText;
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return false;
    }

}

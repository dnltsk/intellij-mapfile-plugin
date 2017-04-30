package org.dnltsk.mapfileplugin.colorchooser;

import com.intellij.openapi.editor.ElementColorProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.tree.IElementType;
import org.dnltsk.mapfileplugin.psi.MapfileTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MapfileElementColorProvider implements ElementColorProvider {

    @Nullable
    @Override
    public Color getColorFrom(@NotNull PsiElement psiElement) {
        IElementType elementType = psiElement.getNode().getElementType();
        if (elementType == MapfileTypes.COLOR
                || elementType == MapfileTypes.BACKGROUNDCOLOR
                || elementType == MapfileTypes.IMAGECOLOR
                || elementType == MapfileTypes.OUTLINECOLOR
                || elementType == MapfileTypes.SHADOWCOLOR) {
            return parseColor(psiElement);
        }
        return null;
    }

    @Nullable
    private Color parseColor(PsiElement psiElement) {
        List<Integer> rgb = new ArrayList<Integer>();

        PsiElement currentSibling = psiElement;
        while (true) {
            currentSibling = currentSibling.getNextSibling();
            if (currentSibling.getNode().getElementType() == MapfileTypes.INTEGER) {
                Integer rgbComponent = Integer.parseInt(currentSibling.getText());
                rgb.add(rgbComponent);
                if (rgb.size() == 3) {
                    return new Color(rgb.get(0), rgb.get(1), rgb.get(2));
                }
                continue;
            }
            if (rgb.size() == 0 && currentSibling.getNode().getElementType() == MapfileTypes.STRING) {
                String hex = currentSibling.getText();// '#00ff00'
                hex = hex.replaceAll("\\s", "");
                if (hex.length() == 9) {
                    return new Color(
                            Integer.valueOf(hex.substring(2, 4), 16),
                            Integer.valueOf(hex.substring(4, 6), 16),
                            Integer.valueOf(hex.substring(6, 8), 16)
                    );
                }
                return null;
            }
            if (!(currentSibling instanceof PsiWhiteSpace)) {
                return null;
            }
        }
    }

    @Override
    public void setColorTo(@NotNull PsiElement psiElement, @NotNull Color color) {
        //collect
        List<PsiElement> rgbElements = new ArrayList<>();
        PsiElement currentSibling = psiElement;
        while (true) {
            currentSibling = currentSibling.getNextSibling();
            if (currentSibling.getNode().getElementType() == MapfileTypes.INTEGER) {
                rgbElements.add(currentSibling);
                continue;
            }
            if (rgbElements.size() == 0 && currentSibling.getNode().getElementType() == MapfileTypes.STRING) {
                String hex = currentSibling.getText();// '#00ff00'
                hex = hex.replaceAll("\\s", "");
                char quote = hex.charAt(0);
                String newColor = quote + String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue())+quote;
                ((LeafPsiElement) currentSibling).replaceWithText(newColor);
                return;
            }
            if (!(currentSibling instanceof PsiWhiteSpace)) {
                break;
            }
        }
        //replace
        if (rgbElements.size() >= 3) {
            ((LeafPsiElement) rgbElements.get(0)).replaceWithText(Integer.toString(color.getRed()));
            ((LeafPsiElement) rgbElements.get(1)).replaceWithText(Integer.toString(color.getGreen()));
            ((LeafPsiElement) rgbElements.get(2)).replaceWithText(Integer.toString(color.getBlue()));
        }
    }
}

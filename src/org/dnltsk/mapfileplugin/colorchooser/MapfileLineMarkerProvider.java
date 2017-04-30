package org.dnltsk.mapfileplugin.colorchooser;

import com.intellij.codeHighlighting.Pass;
import com.intellij.codeInsight.daemon.*;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.application.AccessToken;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.ElementColorProvider;
import com.intellij.openapi.editor.markup.GutterIconRenderer;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiUtilBase;
import com.intellij.ui.ColorChooser;
import com.intellij.util.Function;
import com.intellij.util.FunctionUtil;
import com.intellij.util.ui.ColorIcon;
import com.intellij.util.ui.TwoColorsIcon;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.List;

public class MapfileLineMarkerProvider implements LineMarkerProvider {

    private final ElementColorProvider[] myExtensions = ElementColorProvider.EP_NAME.getExtensions();

    private final MapfileElementColorProvider mapfileElementColorProvider = new MapfileElementColorProvider();

    @Override
    public LineMarkerInfo getLineMarkerInfo(@NotNull PsiElement element) {
        final Color color = mapfileElementColorProvider.getColorFrom(element);

        if (color != null) {
            MyInfo info = new MyInfo(element, color, mapfileElementColorProvider);
            NavigateAction.setNavigateAction(info, "Choose color", null);
            return info;
        }
        /*for (ElementColorProvider colorProvider : myExtensions) {
            final Color color = colorProvider.getColorFrom(element);
            if (color != null) {
                MyInfo info = new MyInfo(element, color, colorProvider);
                NavigateAction.setNavigateAction(info, "Choose color", null);
                return info;
            }
        }
        */
        return null;
    }

    @Override
    public void collectSlowLineMarkers(@NotNull List<PsiElement> elements, @NotNull Collection<LineMarkerInfo> result) {
    }

    private static class MyInfo extends MergeableLineMarkerInfo<PsiElement> {

        private final Color myColor;

        public MyInfo(@NotNull final PsiElement element, final Color color, final ElementColorProvider colorProvider) {
            super(element,
                    element.getTextRange(),
                    new ColorIcon(12, color),
                    Pass.UPDATE_ALL,
                    FunctionUtil.<Object, String>nullConstant(),
                    new GutterIconNavigationHandler<PsiElement>() {
                        @Override
                        public void navigate(MouseEvent e, PsiElement elt) {
                            if (!elt.isWritable()) return;

                            final Editor editor = PsiUtilBase.findEditor(element);
                            assert editor != null;
                            final Color c = ColorChooser.chooseColor(editor.getComponent(), "Choose Color", color, true);
                            if (c != null) {
                                AccessToken token = ApplicationManager.getApplication().acquireWriteActionLock(MapfileLineMarkerProvider.class);
                                try {
                                    colorProvider.setColorTo(element, c);
                                }
                                finally {
                                    token.finish();
                                }
                            }
                        }
                    },
                    GutterIconRenderer.Alignment.LEFT);
            myColor = color;
        }

        @Override
        public boolean canMergeWith(@NotNull MergeableLineMarkerInfo<?> info) {
            return info instanceof MyInfo;
        }

        @Override
        public Icon getCommonIcon(@NotNull List<MergeableLineMarkerInfo> infos) {
            if (infos.size() == 2 && infos.get(0) instanceof MyInfo && infos.get(1) instanceof MyInfo) {
                return new TwoColorsIcon(12, ((MyInfo)infos.get(0)).myColor, ((MyInfo)infos.get(1)).myColor);
            }
            return AllIcons.Gutter.Colors;
        }

        @NotNull
        @Override
        public Function<? super PsiElement, String> getCommonTooltip(@NotNull List<MergeableLineMarkerInfo> infos) {
            return FunctionUtil.nullConstant();
        }
    }
}
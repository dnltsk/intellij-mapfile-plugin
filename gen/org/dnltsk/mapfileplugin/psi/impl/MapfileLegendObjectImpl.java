// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.dnltsk.mapfileplugin.psi.MapfileLabelObject;
import org.dnltsk.mapfileplugin.psi.MapfileLegendObject;
import org.dnltsk.mapfileplugin.psi.MapfileVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MapfileLegendObjectImpl extends ASTWrapperPsiElement implements MapfileLegendObject {

  public MapfileLegendObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MapfileVisitor visitor) {
    visitor.visitLegendObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MapfileVisitor) accept((MapfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MapfileLabelObject> getLabelObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileLabelObject.class);
  }

}

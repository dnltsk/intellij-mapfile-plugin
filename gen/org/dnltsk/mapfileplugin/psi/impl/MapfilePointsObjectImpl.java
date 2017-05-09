// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.dnltsk.mapfileplugin.psi.MapfilePointsObject;
import org.dnltsk.mapfileplugin.psi.MapfilePointsObjectChildren;
import org.dnltsk.mapfileplugin.psi.MapfileVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MapfilePointsObjectImpl extends ASTWrapperPsiElement implements MapfilePointsObject {

  public MapfilePointsObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MapfileVisitor visitor) {
    visitor.visitPointsObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MapfileVisitor) accept((MapfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MapfilePointsObjectChildren> getPointsObjectChildrenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfilePointsObjectChildren.class);
  }

}

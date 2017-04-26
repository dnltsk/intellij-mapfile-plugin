// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.dnltsk.mapfileplugin.psi.MapfileClusterObject;
import org.dnltsk.mapfileplugin.psi.MapfileVisitor;
import org.jetbrains.annotations.NotNull;

public class MapfileClusterObjectImpl extends ASTWrapperPsiElement implements MapfileClusterObject {

  public MapfileClusterObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MapfileVisitor visitor) {
    visitor.visitClusterObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MapfileVisitor) accept((MapfileVisitor)visitor);
    else super.accept(visitor);
  }

}

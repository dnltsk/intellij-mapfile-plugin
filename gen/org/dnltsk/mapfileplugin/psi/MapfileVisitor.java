// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class MapfileVisitor extends PsiElementVisitor {

  public void visitLayerObject(@NotNull MapfileLayerObject o) {
    visitPsiElement(o);
  }

  public void visitMapObject(@NotNull MapfileMapObject o) {
    visitPsiElement(o);
  }

  public void visitNameAttr(@NotNull MapfileNameAttr o) {
    visitPsiElement(o);
  }

  public void visitStatusAttr(@NotNull MapfileStatusAttr o) {
    visitPsiElement(o);
  }

  public void visitWebObject(@NotNull MapfileWebObject o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}

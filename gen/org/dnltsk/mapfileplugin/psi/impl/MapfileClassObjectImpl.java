// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.dnltsk.mapfileplugin.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MapfileClassObjectImpl extends ASTWrapperPsiElement implements MapfileClassObject {

  public MapfileClassObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MapfileVisitor visitor) {
    visitor.visitClassObject(this);
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

  @Override
  @NotNull
  public List<MapfileLeaderObject> getLeaderObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileLeaderObject.class);
  }

  @Override
  @NotNull
  public List<MapfileStyleObject> getStyleObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileStyleObject.class);
  }

  @Override
  @NotNull
  public List<MapfileValidationObject> getValidationObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileValidationObject.class);
  }

}

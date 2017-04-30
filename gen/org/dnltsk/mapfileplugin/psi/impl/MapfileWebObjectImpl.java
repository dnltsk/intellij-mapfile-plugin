// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.dnltsk.mapfileplugin.psi.MapfileMetadataObject;
import org.dnltsk.mapfileplugin.psi.MapfileValidationObject;
import org.dnltsk.mapfileplugin.psi.MapfileVisitor;
import org.dnltsk.mapfileplugin.psi.MapfileWebObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MapfileWebObjectImpl extends ASTWrapperPsiElement implements MapfileWebObject {

  public MapfileWebObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MapfileVisitor visitor) {
    visitor.visitWebObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MapfileVisitor) accept((MapfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MapfileMetadataObject> getMetadataObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileMetadataObject.class);
  }

  @Override
  @NotNull
  public List<MapfileValidationObject> getValidationObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileValidationObject.class);
  }

}

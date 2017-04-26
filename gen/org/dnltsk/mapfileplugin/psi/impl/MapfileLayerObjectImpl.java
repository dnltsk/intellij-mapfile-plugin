// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.dnltsk.mapfileplugin.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MapfileLayerObjectImpl extends ASTWrapperPsiElement implements MapfileLayerObject {

  public MapfileLayerObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MapfileVisitor visitor) {
    visitor.visitLayerObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MapfileVisitor) accept((MapfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MapfileClassObject> getClassObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileClassObject.class);
  }

  @Override
  @NotNull
  public List<MapfileClusterObject> getClusterObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileClusterObject.class);
  }

  @Override
  @NotNull
  public List<MapfileCompositeObject> getCompositeObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileCompositeObject.class);
  }

  @Override
  @NotNull
  public List<MapfileFeatureObject> getFeatureObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileFeatureObject.class);
  }

  @Override
  @NotNull
  public List<MapfileGridObject> getGridObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileGridObject.class);
  }

  @Override
  @NotNull
  public List<MapfileJoinObject> getJoinObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileJoinObject.class);
  }

}

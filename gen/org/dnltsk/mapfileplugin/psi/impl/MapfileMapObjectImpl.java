// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.dnltsk.mapfileplugin.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MapfileMapObjectImpl extends ASTWrapperPsiElement implements MapfileMapObject {

  public MapfileMapObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MapfileVisitor visitor) {
    visitor.visitMapObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MapfileVisitor) accept((MapfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MapfileLayerObject> getLayerObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileLayerObject.class);
  }

  @Override
  @NotNull
  public List<MapfileLegendObject> getLegendObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileLegendObject.class);
  }

  @Override
  @NotNull
  public List<MapfileProjectionObject> getProjectionObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileProjectionObject.class);
  }

  @Override
  @NotNull
  public List<MapfileQuerymapObject> getQuerymapObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileQuerymapObject.class);
  }

  @Override
  @NotNull
  public List<MapfileReferenceObject> getReferenceObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileReferenceObject.class);
  }

  @Override
  @NotNull
  public List<MapfileScalebarObject> getScalebarObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileScalebarObject.class);
  }

  @Override
  @NotNull
  public List<MapfileSymbolObject> getSymbolObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileSymbolObject.class);
  }

  @Override
  @NotNull
  public List<MapfileWebObject> getWebObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapfileWebObject.class);
  }

}

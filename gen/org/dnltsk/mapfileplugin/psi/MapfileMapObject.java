// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MapfileMapObject extends PsiElement {

  @NotNull
  List<MapfileLayerObject> getLayerObjectList();

  @NotNull
  List<MapfileNameAttr> getNameAttrList();

  @NotNull
  List<MapfileStatusAttr> getStatusAttrList();

  @NotNull
  List<MapfileWebObject> getWebObjectList();

}

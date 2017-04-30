// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MapfileMapObject extends PsiElement {

  @NotNull
  List<MapfileLayerObject> getLayerObjectList();

  @NotNull
  List<MapfileLegendObject> getLegendObjectList();

  @NotNull
  List<MapfileProjectionObject> getProjectionObjectList();

  @NotNull
  List<MapfileQuerymapObject> getQuerymapObjectList();

  @NotNull
  List<MapfileReferenceObject> getReferenceObjectList();

  @NotNull
  List<MapfileScalebarObject> getScalebarObjectList();

  @NotNull
  List<MapfileSymbolObject> getSymbolObjectList();

  @NotNull
  List<MapfileWebObject> getWebObjectList();

}

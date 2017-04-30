// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MapfileLayerObject extends PsiElement {

  @NotNull
  List<MapfileClassObject> getClassObjectList();

  @NotNull
  List<MapfileClusterObject> getClusterObjectList();

  @NotNull
  List<MapfileCompositeObject> getCompositeObjectList();

  @NotNull
  List<MapfileFeatureObject> getFeatureObjectList();

  @NotNull
  List<MapfileGridObject> getGridObjectList();

  @NotNull
  List<MapfileJoinObject> getJoinObjectList();

  @NotNull
  List<MapfileMetadataObject> getMetadataObjectList();

  @NotNull
  List<MapfileProjectionObject> getProjectionObjectList();

  @NotNull
  List<MapfileValidationObject> getValidationObjectList();

}

// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MapfileWebObject extends PsiElement {

  @NotNull
  List<MapfileMetadataObject> getMetadataObjectList();

  @NotNull
  List<MapfileValidationObject> getValidationObjectList();

}

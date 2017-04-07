// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.dnltsk.mapfileplugin.psi.impl.*;

public interface MapfileTypes {


  IElementType CLASS = new MapfileTokenType("CLASS");
  IElementType CLUSTER = new MapfileTokenType("CLUSTER");
  IElementType COMMENT = new MapfileTokenType("comment");
  IElementType COMPOSITE = new MapfileTokenType("COMPOSITE");
  IElementType END = new MapfileTokenType("END");
  IElementType EQ = new MapfileTokenType("=");
  IElementType FALSE = new MapfileTokenType("false");
  IElementType FEATURE = new MapfileTokenType("FEATURE");
  IElementType GRID = new MapfileTokenType("GRID");
  IElementType ID = new MapfileTokenType("id");
  IElementType JOIN = new MapfileTokenType("JOIN");
  IElementType LAYER = new MapfileTokenType("LAYER");
  IElementType LP = new MapfileTokenType("(");
  IElementType MAP = new MapfileTokenType("MAP");
  IElementType METADATA = new MapfileTokenType("METADATA");
  IElementType NUMBER = new MapfileTokenType("number");
  IElementType OP_1 = new MapfileTokenType("+");
  IElementType OP_2 = new MapfileTokenType("-");
  IElementType OP_3 = new MapfileTokenType("*");
  IElementType OP_4 = new MapfileTokenType("/");
  IElementType OP_5 = new MapfileTokenType("!");
  IElementType PROJECTION = new MapfileTokenType("PROJECTION");
  IElementType RP = new MapfileTokenType(")");
  IElementType SEMI = new MapfileTokenType(";");
  IElementType STRING = new MapfileTokenType("string");
  IElementType TRUE = new MapfileTokenType("true");
  IElementType VALIDATION = new MapfileTokenType("VALIDATION");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

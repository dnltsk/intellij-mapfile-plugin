// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface MapfileTypes {


  IElementType BLOCK_COMMENT = new MapfileTokenType("block_comment");
  IElementType CLASS = new MapfileTokenType("CLASS");
  IElementType CLUSTER = new MapfileTokenType("CLUSTER");
  IElementType COMPOSITE = new MapfileTokenType("COMPOSITE");
  IElementType END = new MapfileTokenType("END");
  IElementType EXTERNAL_END = new MapfileTokenType(">>");
  IElementType EXTERNAL_START = new MapfileTokenType("<<");
  IElementType FALSE = new MapfileTokenType("false");
  IElementType FEATURE = new MapfileTokenType("FEATURE");
  IElementType GRID = new MapfileTokenType("GRID");
  IElementType ID = new MapfileTokenType("id");
  IElementType JOIN = new MapfileTokenType("JOIN");
  IElementType LAYER = new MapfileTokenType("LAYER");
  IElementType LEFT_BRACE = new MapfileTokenType("{");
  IElementType LEFT_BRACKET = new MapfileTokenType("[");
  IElementType LEFT_PAREN = new MapfileTokenType("(");
  IElementType LINE_COMMENT = new MapfileTokenType("line_comment");
  IElementType MAP = new MapfileTokenType("MAP");
  IElementType METADATA = new MapfileTokenType("METADATA");
  IElementType NUMBER = new MapfileTokenType("number");
  IElementType OP_AND = new MapfileTokenType("&");
  IElementType OP_EQ = new MapfileTokenType("=");
  IElementType OP_IS = new MapfileTokenType("::=");
  IElementType OP_NOT = new MapfileTokenType("!");
  IElementType OP_ONEMORE = new MapfileTokenType("+");
  IElementType OP_OPT = new MapfileTokenType("?");
  IElementType OP_OR = new MapfileTokenType("|");
  IElementType OP_ZEROMORE = new MapfileTokenType("*");
  IElementType PROJECTION = new MapfileTokenType("PROJECTION");
  IElementType RIGHT_BRACE = new MapfileTokenType("}");
  IElementType RIGHT_BRACKET = new MapfileTokenType("]");
  IElementType RIGHT_PAREN = new MapfileTokenType(")");
  IElementType SEMICOLON = new MapfileTokenType(";");
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

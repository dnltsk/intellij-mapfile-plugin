// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface MapfileTypes {


  IElementType CLASS = new MapfileTokenType("CLASS");
  IElementType CLASSGROUP = new MapfileTokenType("CLASSGROUP");
  IElementType CLASSITEM = new MapfileTokenType("CLASSITEM");
  IElementType CLUSTER = new MapfileTokenType("CLUSTER");
  IElementType COMMENT = new MapfileTokenType("comment");
  IElementType COMPOSITE = new MapfileTokenType("COMPOSITE");
  IElementType CONNECTION = new MapfileTokenType("CONNECTION");
  IElementType CONNECTIONTYPE = new MapfileTokenType("CONNECTIONTYPE");
  IElementType DATA = new MapfileTokenType("DATA");
  IElementType DEBUG = new MapfileTokenType("DEBUG");
  IElementType DUMP = new MapfileTokenType("DUMP");
  IElementType ENCODING = new MapfileTokenType("ENCODING");
  IElementType END = new MapfileTokenType("END");
  IElementType EQ = new MapfileTokenType("=");
  IElementType EXTENT = new MapfileTokenType("EXTENT");
  IElementType FALSE = new MapfileTokenType("false");
  IElementType FEATURE = new MapfileTokenType("FEATURE");
  IElementType FILTER = new MapfileTokenType("FILTER");
  IElementType FILTERITEM = new MapfileTokenType("FILTERITEM");
  IElementType FOOTER = new MapfileTokenType("FOOTER");
  IElementType GEOMTRANSFORM = new MapfileTokenType("GEOMTRANSFORM");
  IElementType GRID = new MapfileTokenType("GRID");
  IElementType GROUP = new MapfileTokenType("GROUP");
  IElementType HEADER = new MapfileTokenType("HEADER");
  IElementType ID = new MapfileTokenType("id");
  IElementType JOIN = new MapfileTokenType("JOIN");
  IElementType LABELCACHE = new MapfileTokenType("LABELCACHE");
  IElementType LABELITEM = new MapfileTokenType("LABELITEM");
  IElementType LABELMAXSCALEDENOM = new MapfileTokenType("LABELMAXSCALEDENOM");
  IElementType LABELMINSCALEDENOM = new MapfileTokenType("LABELMINSCALEDENOM");
  IElementType LABELREQUIRES = new MapfileTokenType("LABELREQUIRES");
  IElementType LAYER = new MapfileTokenType("LAYER");
  IElementType LP = new MapfileTokenType("(");
  IElementType MAP = new MapfileTokenType("MAP");
  IElementType MASK = new MapfileTokenType("MASK");
  IElementType MAXFEATURES = new MapfileTokenType("MAXFEATURES");
  IElementType MAXGEOWIDTH = new MapfileTokenType("MAXGEOWIDTH");
  IElementType MAXSCALEDENOM = new MapfileTokenType("MAXSCALEDENOM");
  IElementType METADATA = new MapfileTokenType("METADATA");
  IElementType MINGEOWIDTH = new MapfileTokenType("MINGEOWIDTH");
  IElementType MINSCALEDENOM = new MapfileTokenType("MINSCALEDENOM");
  IElementType NAME = new MapfileTokenType("NAME");
  IElementType NUMBER = new MapfileTokenType("number");
  IElementType OFFSITE = new MapfileTokenType("OFFSITE");
  IElementType OP_1 = new MapfileTokenType("+");
  IElementType OP_2 = new MapfileTokenType("-");
  IElementType OP_3 = new MapfileTokenType("*");
  IElementType OP_4 = new MapfileTokenType("/");
  IElementType OP_5 = new MapfileTokenType("!");
  IElementType PLUGIN = new MapfileTokenType("PLUGIN");
  IElementType POSTLABELCACHE = new MapfileTokenType("POSTLABELCACHE");
  IElementType PROCESSING = new MapfileTokenType("PROCESSING");
  IElementType PROJECTION = new MapfileTokenType("PROJECTION");
  IElementType REQUIRES = new MapfileTokenType("REQUIRES");
  IElementType RP = new MapfileTokenType(")");
  IElementType SEMI = new MapfileTokenType(";");
  IElementType SIZEUNITS = new MapfileTokenType("SIZEUNITS");
  IElementType STATUS = new MapfileTokenType("STATUS");
  IElementType STRING = new MapfileTokenType("string");
  IElementType STYLEITEM = new MapfileTokenType("STYLEITEM");
  IElementType SYMBOLSCALEDENOM = new MapfileTokenType("SYMBOLSCALEDENOM");
  IElementType TEMPLATE = new MapfileTokenType("TEMPLATE");
  IElementType TILEINDEX = new MapfileTokenType("TILEINDEX");
  IElementType TILEITEM = new MapfileTokenType("TILEITEM");
  IElementType TILESRS = new MapfileTokenType("TILESRS");
  IElementType TITLE = new MapfileTokenType("TITLE");
  IElementType TOLERANCE = new MapfileTokenType("TOLERANCE");
  IElementType TOLERANCEUNITS = new MapfileTokenType("TOLERANCEUNITS");
  IElementType TRANSFORM = new MapfileTokenType("TRANSFORM");
  IElementType TRUE = new MapfileTokenType("true");
  IElementType TYPE = new MapfileTokenType("TYPE");
  IElementType UNIT = new MapfileTokenType("UNIT");
  IElementType UTFDATA = new MapfileTokenType("UTFDATA");
  IElementType UTFITEM = new MapfileTokenType("UTFITEM");
  IElementType VALIDATION = new MapfileTokenType("VALIDATION");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

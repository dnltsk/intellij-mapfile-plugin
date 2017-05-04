// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.dnltsk.mapfileplugin.psi.impl.*;

public interface MapfileTypes {

  IElementType CLASS_OBJECT = new MapfileElementType("CLASS_OBJECT");
  IElementType CLUSTER_OBJECT = new MapfileElementType("CLUSTER_OBJECT");
  IElementType COMPOSITE_OBJECT = new MapfileElementType("COMPOSITE_OBJECT");
  IElementType FEATURE_OBJECT = new MapfileElementType("FEATURE_OBJECT");
  IElementType GRID_OBJECT = new MapfileElementType("GRID_OBJECT");
  IElementType JOIN_OBJECT = new MapfileElementType("JOIN_OBJECT");
  IElementType LABEL_OBJECT = new MapfileElementType("LABEL_OBJECT");
  IElementType LAYER_OBJECT = new MapfileElementType("LAYER_OBJECT");
  IElementType LEADER_OBJECT = new MapfileElementType("LEADER_OBJECT");
  IElementType LEGEND_OBJECT = new MapfileElementType("LEGEND_OBJECT");
  IElementType MAP_OBJECT = new MapfileElementType("MAP_OBJECT");
  IElementType METADATA_OBJECT = new MapfileElementType("METADATA_OBJECT");
  IElementType PATTERN_OBJECT = new MapfileElementType("PATTERN_OBJECT");
  IElementType POINTS_OBJECT = new MapfileElementType("POINTS_OBJECT");
  IElementType PROJECTION_OBJECT = new MapfileElementType("PROJECTION_OBJECT");
  IElementType QUERYMAP_OBJECT = new MapfileElementType("QUERYMAP_OBJECT");
  IElementType REFERENCE_OBJECT = new MapfileElementType("REFERENCE_OBJECT");
  IElementType SCALEBAR_OBJECT = new MapfileElementType("SCALEBAR_OBJECT");
  IElementType STYLE_OBJECT = new MapfileElementType("STYLE_OBJECT");
  IElementType SYMBOL_OBJECT = new MapfileElementType("SYMBOL_OBJECT");
  IElementType VALIDATION_OBJECT = new MapfileElementType("VALIDATION_OBJECT");
  IElementType WEB_OBJECT = new MapfileElementType("WEB_OBJECT");

  IElementType ALIGN = new MapfileTokenType("ALIGN");
  IElementType ANCHORPOINT = new MapfileTokenType("ANCHORPOINT");
  IElementType ANGLE = new MapfileTokenType("ANGLE");
  IElementType ANTIALIAS = new MapfileTokenType("ANTIALIAS");
  IElementType ATTRIBUTETOKEN = new MapfileTokenType("attributeToken");
  IElementType AUTO = new MapfileTokenType("auto");
  IElementType AUTO2 = new MapfileTokenType("auto2");
  IElementType BACKGROUNDCOLOR = new MapfileTokenType("BACKGROUNDCOLOR");
  IElementType BBOX = new MapfileTokenType("bbox");
  IElementType BEVEL = new MapfileTokenType("bevel");
  IElementType BITMAP = new MapfileTokenType("bitmap");
  IElementType BROWSEFORMAT = new MapfileTokenType("BROWSEFORMAT");
  IElementType BUFFER = new MapfileTokenType("BUFFER");
  IElementType BUTT = new MapfileTokenType("butt");
  IElementType CAIROPNG = new MapfileTokenType("cairopng");
  IElementType CC = new MapfileTokenType("cc");
  IElementType CENTER = new MapfileTokenType("center");
  IElementType CENTROID = new MapfileTokenType("centroid");
  IElementType CGI_CONTEXT_URL = new MapfileTokenType("CGI_CONTEXT_URL");
  IElementType CHARACTER = new MapfileTokenType("CHARACTER");
  IElementType CHART = new MapfileTokenType("chart");
  IElementType CIRCLE = new MapfileTokenType("circle");
  IElementType CL = new MapfileTokenType("cl");
  IElementType CLASS = new MapfileTokenType("CLASS");
  IElementType CLASSGROUP = new MapfileTokenType("CLASSGROUP");
  IElementType CLASSITEM = new MapfileTokenType("CLASSITEM");
  IElementType CLUSTER = new MapfileTokenType("CLUSTER");
  IElementType COLOR = new MapfileTokenType("COLOR");
  IElementType COMMENT = new MapfileTokenType("comment");
  IElementType COMPOP = new MapfileTokenType("COMPOP");
  IElementType COMPOSITE = new MapfileTokenType("COMPOSITE");
  IElementType CONFIG = new MapfileTokenType("CONFIG");
  IElementType CONNECTION = new MapfileTokenType("CONNECTION");
  IElementType CONNECTIONTYPE = new MapfileTokenType("CONNECTIONTYPE");
  IElementType CONTOUR = new MapfileTokenType("contour");
  IElementType CR = new MapfileTokenType("cr");
  IElementType CSV = new MapfileTokenType("csv");
  IElementType DATA = new MapfileTokenType("DATA");
  IElementType DATAPATTERN = new MapfileTokenType("DATAPATTERN");
  IElementType DD = new MapfileTokenType("dd");
  IElementType DDMM = new MapfileTokenType("ddmm");
  IElementType DDMMSS = new MapfileTokenType("ddmmss");
  IElementType DEBUG = new MapfileTokenType("DEBUG");
  IElementType DEFAULT = new MapfileTokenType("default");
  IElementType DEFRESOLUTION = new MapfileTokenType("DEFRESOLUTION");
  IElementType DOUBLE = new MapfileTokenType("double");
  IElementType DUMP = new MapfileTokenType("DUMP");
  IElementType ELLIPSE = new MapfileTokenType("ellipse");
  IElementType EMPTY = new MapfileTokenType("EMPTY");
  IElementType ENCODING = new MapfileTokenType("ENCODING");
  IElementType END = new MapfileTokenType("END");
  IElementType EQ = new MapfileTokenType("=");
  IElementType ERROR = new MapfileTokenType("ERROR");
  IElementType EXPRESSION = new MapfileTokenType("EXPRESSION");
  IElementType EXTENT = new MapfileTokenType("EXTENT");
  IElementType FAIL = new MapfileTokenType("fail");
  IElementType FALSE = new MapfileTokenType("false");
  IElementType FEATURE = new MapfileTokenType("FEATURE");
  IElementType FEET = new MapfileTokenType("feet");
  IElementType FILLED = new MapfileTokenType("FILLED");
  IElementType FILTER = new MapfileTokenType("FILTER");
  IElementType FILTERITEM = new MapfileTokenType("FILTERITEM");
  IElementType FOLLOW = new MapfileTokenType("follow");
  IElementType FONT = new MapfileTokenType("FONT");
  IElementType FONTSET = new MapfileTokenType("FONTSET");
  IElementType FOOTER = new MapfileTokenType("FOOTER");
  IElementType FORCE = new MapfileTokenType("FORCE");
  IElementType FROM = new MapfileTokenType("FROM");
  IElementType GAP = new MapfileTokenType("GAP");
  IElementType GEOMTRANSFORM = new MapfileTokenType("GEOMTRANSFORM");
  IElementType GIANT = new MapfileTokenType("giant");
  IElementType GIF = new MapfileTokenType("gif");
  IElementType GRID = new MapfileTokenType("GRID");
  IElementType GRIDSTEP = new MapfileTokenType("GRIDSTEP");
  IElementType GROUP = new MapfileTokenType("GROUP");
  IElementType GTIFF = new MapfileTokenType("gtiff");
  IElementType HATCH = new MapfileTokenType("hatch");
  IElementType HEADER = new MapfileTokenType("HEADER");
  IElementType HILITE = new MapfileTokenType("hilite");
  IElementType ID = new MapfileTokenType("id");
  IElementType IGNORE = new MapfileTokenType("ignore");
  IElementType IMAGE = new MapfileTokenType("IMAGE");
  IElementType IMAGECOLOR = new MapfileTokenType("IMAGECOLOR");
  IElementType IMAGEPATH = new MapfileTokenType("IMAGEPATH");
  IElementType IMAGETYPE = new MapfileTokenType("IMAGETYPE");
  IElementType IMAGEURL = new MapfileTokenType("IMAGEURL");
  IElementType INCHES = new MapfileTokenType("inches");
  IElementType INCLUDE = new MapfileTokenType("INCLUDE");
  IElementType INITIALGAP = new MapfileTokenType("INITIALGAP");
  IElementType INTEGER = new MapfileTokenType("integer");
  IElementType INTERLACE = new MapfileTokenType("INTERLACE");
  IElementType ITEMS = new MapfileTokenType("ITEMS");
  IElementType JOIN = new MapfileTokenType("JOIN");
  IElementType JPEG = new MapfileTokenType("jpeg");
  IElementType KERNELDENSITY = new MapfileTokenType("kerneldensity");
  IElementType KEYIMAGE = new MapfileTokenType("KEYIMAGE");
  IElementType KEYSIZE = new MapfileTokenType("KEYSIZE");
  IElementType KEYSPACING = new MapfileTokenType("KEYSPACING");
  IElementType KILOMETERS = new MapfileTokenType("kilometers");
  IElementType KML = new MapfileTokenType("kml");
  IElementType KMZ = new MapfileTokenType("kmz");
  IElementType LABEL = new MapfileTokenType("LABEL");
  IElementType LABELCACHE = new MapfileTokenType("LABELCACHE");
  IElementType LABELFORMAT = new MapfileTokenType("LABELFORMAT");
  IElementType LABELITEM = new MapfileTokenType("LABELITEM");
  IElementType LABELMAXSCALEDENOM = new MapfileTokenType("LABELMAXSCALEDENOM");
  IElementType LABELMINSCALEDENOM = new MapfileTokenType("LABELMINSCALEDENOM");
  IElementType LABELPNT = new MapfileTokenType("labelpnt");
  IElementType LABELPOLY = new MapfileTokenType("labelpoly");
  IElementType LABELREQUIRES = new MapfileTokenType("LABELREQUIRES");
  IElementType LARGE = new MapfileTokenType("large");
  IElementType LAYER = new MapfileTokenType("LAYER");
  IElementType LC = new MapfileTokenType("lc");
  IElementType LEADER = new MapfileTokenType("LEADER");
  IElementType LEFT = new MapfileTokenType("left");
  IElementType LEGEND = new MapfileTokenType("LEGEND");
  IElementType LEGENDFORMAT = new MapfileTokenType("LEGENDFORMAT");
  IElementType LINE = new MapfileTokenType("line");
  IElementType LINECAP = new MapfileTokenType("LINECAP");
  IElementType LINEJOIN = new MapfileTokenType("LINEJOIN");
  IElementType LINEJOINMAXSIZE = new MapfileTokenType("LINEJOINMAXSIZE");
  IElementType LISTEXPRESSIONTOKEN = new MapfileTokenType("listExpressionToken");
  IElementType LL = new MapfileTokenType("ll");
  IElementType LOCAL = new MapfileTokenType("local");
  IElementType LOG = new MapfileTokenType("log");
  IElementType LOGICALEXPRESSIONTOKEN = new MapfileTokenType("logicalExpressionToken");
  IElementType LP = new MapfileTokenType("(");
  IElementType LR = new MapfileTokenType("lr");
  IElementType MAP = new MapfileTokenType("MAP");
  IElementType MARKER = new MapfileTokenType("MARKER");
  IElementType MARKERSIZE = new MapfileTokenType("MARKERSIZE");
  IElementType MASK = new MapfileTokenType("MASK");
  IElementType MAXARCS = new MapfileTokenType("MAXARCS");
  IElementType MAXBOXSIZE = new MapfileTokenType("MAXBOXSIZE");
  IElementType MAXDISTANCE = new MapfileTokenType("MAXDISTANCE");
  IElementType MAXFEATURES = new MapfileTokenType("MAXFEATURES");
  IElementType MAXGEOWIDTH = new MapfileTokenType("MAXGEOWIDTH");
  IElementType MAXINTERVAL = new MapfileTokenType("MAXINTERVAL");
  IElementType MAXLENGTH = new MapfileTokenType("MAXLENGTH");
  IElementType MAXOVERLAPANGLE = new MapfileTokenType("MAXOVERLAPANGLE");
  IElementType MAXSCALEDENOM = new MapfileTokenType("MAXSCALEDENOM");
  IElementType MAXSIZE = new MapfileTokenType("MAXSIZE");
  IElementType MAXSUBDIVIDE = new MapfileTokenType("MAXSUBDIVIDE");
  IElementType MAXTEMPLATE = new MapfileTokenType("MAXTEMPLATE");
  IElementType MAXWIDTH = new MapfileTokenType("MAXWIDTH");
  IElementType MEDIUM = new MapfileTokenType("medium");
  IElementType METADATA = new MapfileTokenType("METADATA");
  IElementType METERS = new MapfileTokenType("meters");
  IElementType MILES = new MapfileTokenType("miles");
  IElementType MINARCS = new MapfileTokenType("MINARCS");
  IElementType MINBOXSIZE = new MapfileTokenType("MINBOXSIZE");
  IElementType MINDISTANCE = new MapfileTokenType("MINDISTANCE");
  IElementType MINFEATURESIZE = new MapfileTokenType("MINFEATURESIZE");
  IElementType MINGEOWIDTH = new MapfileTokenType("MINGEOWIDTH");
  IElementType MININTERVAL = new MapfileTokenType("MININTERVAL");
  IElementType MINSCALEDENOM = new MapfileTokenType("MINSCALEDENOM");
  IElementType MINSIZE = new MapfileTokenType("MINSIZE");
  IElementType MINSUBDIVIDE = new MapfileTokenType("MINSUBDIVIDE");
  IElementType MINTEMPLATE = new MapfileTokenType("MINTEMPLATE");
  IElementType MINWIDTH = new MapfileTokenType("MINWIDTH");
  IElementType MITER = new MapfileTokenType("miter");
  IElementType MS_ENCRYPTION_KEY = new MapfileTokenType("MS_ENCRYPTION_KEY");
  IElementType MS_ERRORFILE = new MapfileTokenType("MS_ERRORFILE");
  IElementType MS_NONSQUARE = new MapfileTokenType("MS_NONSQUARE");
  IElementType MYSQL = new MapfileTokenType("mysql");
  IElementType NAME = new MapfileTokenType("NAME");
  IElementType NAUTICALMILES = new MapfileTokenType("nauticalmiles");
  IElementType NO = new MapfileTokenType("no");
  IElementType NONE = new MapfileTokenType("none");
  IElementType NORMAL = new MapfileTokenType("normal");
  IElementType NUMBER = new MapfileTokenType("number");
  IElementType OFF = new MapfileTokenType("off");
  IElementType OFFSET = new MapfileTokenType("OFFSET");
  IElementType OFFSITE = new MapfileTokenType("OFFSITE");
  IElementType OGR = new MapfileTokenType("ogr");
  IElementType ON = new MapfileTokenType("on");
  IElementType ONE_TO_MANY = new MapfileTokenType("ONE-TO-MANY");
  IElementType ONE_TO_ONE = new MapfileTokenType("ONE-TO-ONE");
  IElementType ON_MISSING_DATA = new MapfileTokenType("ON_MISSING_DATA");
  IElementType OPACITY = new MapfileTokenType("OPACITY");
  IElementType OP_1 = new MapfileTokenType("+");
  IElementType OP_2 = new MapfileTokenType("-");
  IElementType OP_3 = new MapfileTokenType("*");
  IElementType OP_4 = new MapfileTokenType("/");
  IElementType OP_5 = new MapfileTokenType("!");
  IElementType ORACLESPATIAL = new MapfileTokenType("oraclespatial");
  IElementType OUTLINECOLOR = new MapfileTokenType("OUTLINECOLOR");
  IElementType OUTLINEWIDTH = new MapfileTokenType("OUTLINEWIDTH");
  IElementType PARTIALS = new MapfileTokenType("PARTIALS");
  IElementType PATTERN = new MapfileTokenType("PATTERN");
  IElementType PDF = new MapfileTokenType("pdf");
  IElementType PERCENTAGES = new MapfileTokenType("percentages");
  IElementType PIXELS = new MapfileTokenType("pixels");
  IElementType PIXMAP = new MapfileTokenType("pixmap");
  IElementType PLUGIN = new MapfileTokenType("PLUGIN");
  IElementType PNG = new MapfileTokenType("png");
  IElementType PNG8 = new MapfileTokenType("png8");
  IElementType POINT = new MapfileTokenType("point");
  IElementType POINTS = new MapfileTokenType("POINTS");
  IElementType POLAROFFSET = new MapfileTokenType("POLAROFFSET");
  IElementType POLYGON = new MapfileTokenType("polygon");
  IElementType POSITION = new MapfileTokenType("POSITION");
  IElementType POSTGIS = new MapfileTokenType("postgis");
  IElementType POSTGRESQL = new MapfileTokenType("postgresql");
  IElementType POSTLABELCACHE = new MapfileTokenType("POSTLABELCACHE");
  IElementType PRIORITY = new MapfileTokenType("PRIORITY");
  IElementType PROCESSING = new MapfileTokenType("PROCESSING");
  IElementType PROJECTION = new MapfileTokenType("PROJECTION");
  IElementType PROJ_LIB = new MapfileTokenType("PROJ_LIB");
  IElementType QUERY = new MapfileTokenType("query");
  IElementType QUERYFORMAT = new MapfileTokenType("QUERYFORMAT");
  IElementType QUERYMAP = new MapfileTokenType("QUERYMAP");
  IElementType RASTER = new MapfileTokenType("raster");
  IElementType REFERENCE = new MapfileTokenType("REFERENCE");
  IElementType REGEXTOKEN = new MapfileTokenType("regexToken");
  IElementType REGION = new MapfileTokenType("REGION");
  IElementType REPEATDISTANCE = new MapfileTokenType("REPEATDISTANCE");
  IElementType REQUIRES = new MapfileTokenType("REQUIRES");
  IElementType RESOLUTION = new MapfileTokenType("RESOLUTION");
  IElementType RIGHT = new MapfileTokenType("right");
  IElementType ROUND = new MapfileTokenType("round");
  IElementType RP = new MapfileTokenType(")");
  IElementType SCALEBAR = new MapfileTokenType("SCALEBAR");
  IElementType SCALEDENOM = new MapfileTokenType("SCALEDENOM");
  IElementType SDE = new MapfileTokenType("sde");
  IElementType SELECTED = new MapfileTokenType("selected");
  IElementType SEMI = new MapfileTokenType(";");
  IElementType SHADOWCOLOR = new MapfileTokenType("SHADOWCOLOR");
  IElementType SHADOWSIZE = new MapfileTokenType("SHADOWSIZE");
  IElementType SHAPEPATH = new MapfileTokenType("SHAPEPATH");
  IElementType SIZE = new MapfileTokenType("SIZE");
  IElementType SIZEUNITS = new MapfileTokenType("SIZEUNITS");
  IElementType SMALL = new MapfileTokenType("small");
  IElementType SQUARE = new MapfileTokenType("square");
  IElementType START = new MapfileTokenType("start");
  IElementType STATUS = new MapfileTokenType("STATUS");
  IElementType STRING = new MapfileTokenType("string");
  IElementType STYLE = new MapfileTokenType("STYLE");
  IElementType STYLEITEM = new MapfileTokenType("STYLEITEM");
  IElementType SVG = new MapfileTokenType("svg");
  IElementType SYMBOL = new MapfileTokenType("SYMBOL");
  IElementType SYMBOLSCALEDENOM = new MapfileTokenType("SYMBOLSCALEDENOM");
  IElementType SYMBOLSET = new MapfileTokenType("SYMBOLSET");
  IElementType TABLE = new MapfileTokenType("TABLE");
  IElementType TEMPLATE = new MapfileTokenType("TEMPLATE");
  IElementType TEMPLATEPATTERN = new MapfileTokenType("TEMPLATEPATTERN");
  IElementType TEMPPATH = new MapfileTokenType("TEMPPATH");
  IElementType TEXT = new MapfileTokenType("TEXT");
  IElementType TILEINDEX = new MapfileTokenType("TILEINDEX");
  IElementType TILEITEM = new MapfileTokenType("TILEITEM");
  IElementType TILESRS = new MapfileTokenType("TILESRS");
  IElementType TINY = new MapfileTokenType("tiny");
  IElementType TITLE = new MapfileTokenType("TITLE");
  IElementType TO = new MapfileTokenType("TO");
  IElementType TOLERANCE = new MapfileTokenType("TOLERANCE");
  IElementType TOLERANCEUNITS = new MapfileTokenType("TOLERANCEUNITS");
  IElementType TRANSFORM = new MapfileTokenType("TRANSFORM");
  IElementType TRANSPARENT = new MapfileTokenType("TRANSPARENT");
  IElementType TRUE = new MapfileTokenType("true");
  IElementType TRUETYPE = new MapfileTokenType("truetype");
  IElementType TYPE = new MapfileTokenType("TYPE");
  IElementType UC = new MapfileTokenType("uc");
  IElementType UL = new MapfileTokenType("ul");
  IElementType UNION = new MapfileTokenType("union");
  IElementType UNITS = new MapfileTokenType("UNITS");
  IElementType UR = new MapfileTokenType("ur");
  IElementType UTFDATA = new MapfileTokenType("UTFDATA");
  IElementType UTFITEM = new MapfileTokenType("UTFITEM");
  IElementType UVRASTER = new MapfileTokenType("uvraster");
  IElementType VALIDATION = new MapfileTokenType("VALIDATION");
  IElementType VECTOR = new MapfileTokenType("vector");
  IElementType VERTICES = new MapfileTokenType("vertices");
  IElementType WEB = new MapfileTokenType("WEB");
  IElementType WFS = new MapfileTokenType("wfs");
  IElementType WIDTH = new MapfileTokenType("WIDTH");
  IElementType WKT = new MapfileTokenType("WKT");
  IElementType WMS = new MapfileTokenType("wms");
  IElementType WRAP = new MapfileTokenType("WRAP");
  IElementType YES = new MapfileTokenType("yes");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CLASS_OBJECT) {
        return new MapfileClassObjectImpl(node);
      }
      else if (type == CLUSTER_OBJECT) {
        return new MapfileClusterObjectImpl(node);
      }
      else if (type == COMPOSITE_OBJECT) {
        return new MapfileCompositeObjectImpl(node);
      }
      else if (type == FEATURE_OBJECT) {
        return new MapfileFeatureObjectImpl(node);
      }
      else if (type == GRID_OBJECT) {
        return new MapfileGridObjectImpl(node);
      }
      else if (type == JOIN_OBJECT) {
        return new MapfileJoinObjectImpl(node);
      }
      else if (type == LABEL_OBJECT) {
        return new MapfileLabelObjectImpl(node);
      }
      else if (type == LAYER_OBJECT) {
        return new MapfileLayerObjectImpl(node);
      }
      else if (type == LEADER_OBJECT) {
        return new MapfileLeaderObjectImpl(node);
      }
      else if (type == LEGEND_OBJECT) {
        return new MapfileLegendObjectImpl(node);
      }
      else if (type == MAP_OBJECT) {
        return new MapfileMapObjectImpl(node);
      }
      else if (type == METADATA_OBJECT) {
        return new MapfileMetadataObjectImpl(node);
      }
      else if (type == PATTERN_OBJECT) {
        return new MapfilePatternObjectImpl(node);
      }
      else if (type == POINTS_OBJECT) {
        return new MapfilePointsObjectImpl(node);
      }
      else if (type == PROJECTION_OBJECT) {
        return new MapfileProjectionObjectImpl(node);
      }
      else if (type == QUERYMAP_OBJECT) {
        return new MapfileQuerymapObjectImpl(node);
      }
      else if (type == REFERENCE_OBJECT) {
        return new MapfileReferenceObjectImpl(node);
      }
      else if (type == SCALEBAR_OBJECT) {
        return new MapfileScalebarObjectImpl(node);
      }
      else if (type == STYLE_OBJECT) {
        return new MapfileStyleObjectImpl(node);
      }
      else if (type == SYMBOL_OBJECT) {
        return new MapfileSymbolObjectImpl(node);
      }
      else if (type == VALIDATION_OBJECT) {
        return new MapfileValidationObjectImpl(node);
      }
      else if (type == WEB_OBJECT) {
        return new MapfileWebObjectImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

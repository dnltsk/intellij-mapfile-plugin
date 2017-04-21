package org.dnltsk.mapfileplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.dnltsk.mapfileplugin.psi.MapfileTypes.*;

%%

%{
  public MapfileLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class MapfileLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode
%ignorecase

EOL=\R
WHITE_SPACE=\s+

ATTRIBUTETOKEN=\[.+\]
LOGICALEXPRESSIONTOKEN=\(.+\)
LISTEXPRESSIONTOKEN=\{.+\}
REGEXTOKEN="/".+"/"
INTEGER=[+-]{0,1}[0-9]+
DOUBLE=[+-]{0,1}[0-9]+(\.[0-9]*)?
SPACE=[ \t\n\x0B\f\r]+
COMMENT=#.*
NUMBER=[+-]{0,1}[0-9]+(\.[0-9]*)?
ID=[:letter:][a-zA-Z_0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}                 { return WHITE_SPACE; }

  ";"                           { return SEMI; }
  "="                           { return EQ; }
  "("                           { return LP; }
  ")"                           { return RP; }
  "+"                           { return OP_1; }
  "-"                           { return OP_2; }
  "*"                           { return OP_3; }
  "/"                           { return OP_4; }
  "!"                           { return OP_5; }
  "MAP"                         { return MAP; }
  "END"                         { return END; }
  "LAYER"                       { return LAYER; }
  "LEGEND"                      { return LEGEND; }
  "PROJECTION"                  { return PROJECTION; }
  "QUERYMAP"                    { return QUERYMAP; }
  "REFERENCE"                   { return REFERENCE; }
  "SCALEBAR"                    { return SCALEBAR; }
  "SYMBOL"                      { return SYMBOL; }
  "WEB"                         { return WEB; }
  "ANGLE"                       { return ANGLE; }
  "CONFIG"                      { return CONFIG; }
  "DATAPATTERN"                 { return DATAPATTERN; }
  "DEBUG"                       { return DEBUG; }
  "DEFRESOLUTION"               { return DEFRESOLUTION; }
  "EXTENT"                      { return EXTENT; }
  "FONTSET"                     { return FONTSET; }
  "IMAGECOLOR"                  { return IMAGECOLOR; }
  "IMAGETYPE"                   { return IMAGETYPE; }
  "INTERLACE"                   { return INTERLACE; }
  "MAXSIZE"                     { return MAXSIZE; }
  "NAME"                        { return NAME; }
  "RESOLUTION"                  { return RESOLUTION; }
  "SCALEDENOM"                  { return SCALEDENOM; }
  "SHAPEPATH"                   { return SHAPEPATH; }
  "SIZE"                        { return SIZE; }
  "STATUS"                      { return STATUS; }
  "SYMBOLSET"                   { return SYMBOLSET; }
  "TEMPLATEPATTERN"             { return TEMPLATEPATTERN; }
  "UNITS"                       { return UNITS; }
  "METADATA"                    { return METADATA; }
  "VALIDATION"                  { return VALIDATION; }
  "BROWSEFORMAT"                { return BROWSEFORMAT; }
  "EMPTY"                       { return EMPTY; }
  "ERROR"                       { return ERROR; }
  "FOOTER"                      { return FOOTER; }
  "HEADER"                      { return HEADER; }
  "IMAGEPATH"                   { return IMAGEPATH; }
  "IMAGEURL"                    { return IMAGEURL; }
  "LEGENDFORMAT"                { return LEGENDFORMAT; }
  "MAXSCALEDENOM"               { return MAXSCALEDENOM; }
  "MAXTEMPLATE"                 { return MAXTEMPLATE; }
  "MINSCALEDENOM"               { return MINSCALEDENOM; }
  "MINTEMPLATE"                 { return MINTEMPLATE; }
  "QUERYFORMAT"                 { return QUERYFORMAT; }
  "TEMPLATE"                    { return TEMPLATE; }
  "TEMPPATH"                    { return TEMPPATH; }
  "CLASS"                       { return CLASS; }
  "CLUSTER"                     { return CLUSTER; }
  "COMPOSITE"                   { return COMPOSITE; }
  "FEATURE"                     { return FEATURE; }
  "GRID"                        { return GRID; }
  "JOIN"                        { return JOIN; }
  "CLASSGROUP"                  { return CLASSGROUP; }
  "CLASSITEM"                   { return CLASSITEM; }
  "CONNECTION"                  { return CONNECTION; }
  "CONNECTIONTYPE"              { return CONNECTIONTYPE; }
  "DATA"                        { return DATA; }
  "DUMP"                        { return DUMP; }
  "ENCODING"                    { return ENCODING; }
  "FILTER"                      { return FILTER; }
  "FILTERITEM"                  { return FILTERITEM; }
  "GEOMTRANSFORM"               { return GEOMTRANSFORM; }
  "GROUP"                       { return GROUP; }
  "LABELCACHE"                  { return LABELCACHE; }
  "LABELITEM"                   { return LABELITEM; }
  "LABELMAXSCALEDENOM"          { return LABELMAXSCALEDENOM; }
  "LABELMINSCALEDENOM"          { return LABELMINSCALEDENOM; }
  "LABELREQUIRES"               { return LABELREQUIRES; }
  "MASK"                        { return MASK; }
  "MAXFEATURES"                 { return MAXFEATURES; }
  "MAXGEOWIDTH"                 { return MAXGEOWIDTH; }
  "MINGEOWIDTH"                 { return MINGEOWIDTH; }
  "PLUGIN"                      { return PLUGIN; }
  "POSTLABELCACHE"              { return POSTLABELCACHE; }
  "PROCESSING"                  { return PROCESSING; }
  "OFFSITE"                     { return OFFSITE; }
  "SIZEUNITS"                   { return SIZEUNITS; }
  "REQUIRES"                    { return REQUIRES; }
  "STYLEITEM"                   { return STYLEITEM; }
  "SYMBOLSCALEDENOM"            { return SYMBOLSCALEDENOM; }
  "TILEINDEX"                   { return TILEINDEX; }
  "TILEITEM"                    { return TILEITEM; }
  "TILESRS"                     { return TILESRS; }
  "TITLE"                       { return TITLE; }
  "TOLERANCEUNITS"              { return TOLERANCEUNITS; }
  "TOLERANCE"                   { return TOLERANCE; }
  "TRANSFORM"                   { return TRANSFORM; }
  "TYPE"                        { return TYPE; }
  "UTFDATA"                     { return UTFDATA; }
  "UTFITEM"                     { return UTFITEM; }
  "LABEL"                       { return LABEL; }
  "STYLE"                       { return STYLE; }
  "LEADER"                      { return LEADER; }
  "PATTERN"                     { return PATTERN; }
  "POINTS"                      { return POINTS; }
  "ALIGN"                       { return ALIGN; }
  "ANCHORPOINT"                 { return ANCHORPOINT; }
  "ANTIALIAS"                   { return ANTIALIAS; }
  "BACKGROUNDCOLOR"             { return BACKGROUNDCOLOR; }
  "BUFFER"                      { return BUFFER; }
  "CHARACTER"                   { return CHARACTER; }
  "COLOR"                       { return COLOR; }
  "CGI_CONTEXT_URL"             { return CGI_CONTEXT_URL; }
  "MS_ENCRYPTION_KEY"           { return MS_ENCRYPTION_KEY; }
  "MS_ERRORFILE"                { return MS_ERRORFILE; }
  "MS_NONSQUARE"                { return MS_NONSQUARE; }
  "ON_MISSING_DATA"             { return ON_MISSING_DATA; }
  "PROJ_LIB"                    { return PROJ_LIB; }
  "COMPOP"                      { return COMPOP; }
  "EXPRESSION"                  { return EXPRESSION; }
  "FILLED"                      { return FILLED; }
  "FONT"                        { return FONT; }
  "FORCE"                       { return FORCE; }
  "FROM"                        { return FROM; }
  "GAP"                         { return GAP; }
  "GRIDSTEP"                    { return GRIDSTEP; }
  "IMAGE"                       { return IMAGE; }
  "INITIALGAP"                  { return INITIALGAP; }
  "ITEMS"                       { return ITEMS; }
  "KEYIMAGE"                    { return KEYIMAGE; }
  "KEYSIZE"                     { return KEYSIZE; }
  "KEYSPACING"                  { return KEYSPACING; }
  "LABELFORMAT"                 { return LABELFORMAT; }
  "LINECAP"                     { return LINECAP; }
  "LINEJOIN"                    { return LINEJOIN; }
  "LINEJOINMAXSIZE"             { return LINEJOINMAXSIZE; }
  "MARKER"                      { return MARKER; }
  "MARKERSIZE"                  { return MARKERSIZE; }
  "MAXARCS"                     { return MAXARCS; }
  "MAXBOXSIZE"                  { return MAXBOXSIZE; }
  "MAXDISTANCE"                 { return MAXDISTANCE; }
  "MAXINTERVAL"                 { return MAXINTERVAL; }
  "MAXLENGTH"                   { return MAXLENGTH; }
  "MAXOVERLAPANGLE"             { return MAXOVERLAPANGLE; }
  "MAXSUBDIVIDE"                { return MAXSUBDIVIDE; }
  "MAXWIDTH"                    { return MAXWIDTH; }
  "MINARCS"                     { return MINARCS; }
  "MINBOXSIZE"                  { return MINBOXSIZE; }
  "MINDISTANCE"                 { return MINDISTANCE; }
  "MINFEATURESIZE"              { return MINFEATURESIZE; }
  "MININTERVAL"                 { return MININTERVAL; }
  "MINSIZE"                     { return MINSIZE; }
  "MINSUBDIVIDE"                { return MINSUBDIVIDE; }
  "MINWIDTH"                    { return MINWIDTH; }
  "OFFSET"                      { return OFFSET; }
  "OPACITY"                     { return OPACITY; }
  "OUTLINECOLOR"                { return OUTLINECOLOR; }
  "OUTLINEWIDTH"                { return OUTLINEWIDTH; }
  "PARTIALS"                    { return PARTIALS; }
  "POLAROFFSET"                 { return POLAROFFSET; }
  "POSITION"                    { return POSITION; }
  "PRIORITY"                    { return PRIORITY; }
  "REGION"                      { return REGION; }
  "REPEATDISTANCE"              { return REPEATDISTANCE; }
  "SHADOWCOLOR"                 { return SHADOWCOLOR; }
  "SHADOWSIZE"                  { return SHADOWSIZE; }
  "TABLE"                       { return TABLE; }
  "TEXT"                        { return TEXT; }
  "TO"                          { return TO; }
  "TRANSPARENT"                 { return TRANSPARENT; }
  "WIDTH"                       { return WIDTH; }
  "WKT"                         { return WKT; }
  "WRAP"                        { return WRAP; }
  "left"                        { return LEFT; }
  "center"                      { return CENTER; }
  "right"                       { return RIGHT; }
  "auto"                        { return AUTO; }
  "auto2"                       { return AUTO2; }
  "follow"                      { return FOLLOW; }
  "true"                        { return TRUE; }
  "false"                       { return FALSE; }
  "contour"                     { return CONTOUR; }
  "kerneldensity"               { return KERNELDENSITY; }
  "local"                       { return LOCAL; }
  "ogr"                         { return OGR; }
  "oraclespatial"               { return ORACLESPATIAL; }
  "postgis"                     { return POSTGIS; }
  "sde"                         { return SDE; }
  "union"                       { return UNION; }
  "uvraster"                    { return UVRASTER; }
  "wfs"                         { return WFS; }
  "wms"                         { return WMS; }
  "csv"                         { return CSV; }
  "mysql"                       { return MYSQL; }
  "postgresql"                  { return POSTGRESQL; }
  "bbox"                        { return BBOX; }
  "centroid"                    { return CENTROID; }
  "labelpnt"                    { return LABELPNT; }
  "labelpoly"                   { return LABELPOLY; }
  "start"                       { return START; }
  "vertices"                    { return VERTICES; }
  "png"                         { return PNG; }
  "gif"                         { return GIF; }
  "png8"                        { return PNG8; }
  "jpeg"                        { return JPEG; }
  "svg"                         { return SVG; }
  "pdf"                         { return PDF; }
  "gtiff"                       { return GTIFF; }
  "kml"                         { return KML; }
  "kmz"                         { return KMZ; }
  "cairopng"                    { return CAIROPNG; }
  "dd"                          { return DD; }
  "ddmm"                        { return DDMM; }
  "ddmmss"                      { return DDMMSS; }
  "butt"                        { return BUTT; }
  "round"                       { return ROUND; }
  "square"                      { return SQUARE; }
  "miter"                       { return MITER; }
  "bevel"                       { return BEVEL; }
  "none"                        { return NONE; }
  "fail"                        { return FAIL; }
  "log"                         { return LOG; }
  "ignore"                      { return IGNORE; }
  "on"                          { return ON; }
  "off"                         { return OFF; }
  "ul"                          { return UL; }
  "uc"                          { return UC; }
  "ur"                          { return UR; }
  "cl"                          { return CL; }
  "cc"                          { return CC; }
  "cr"                          { return CR; }
  "ll"                          { return LL; }
  "lc"                          { return LC; }
  "lr"                          { return LR; }
  "tiny"                        { return TINY; }
  "small"                       { return SMALL; }
  "medium"                      { return MEDIUM; }
  "large"                       { return LARGE; }
  "giant"                       { return GIANT; }
  "feet"                        { return FEET; }
  "inches"                      { return INCHES; }
  "kilometers"                  { return KILOMETERS; }
  "meters"                      { return METERS; }
  "miles"                       { return MILES; }
  "nauticalmiles"               { return NAUTICALMILES; }
  "pixels"                      { return PIXELS; }
  "default"                     { return DEFAULT; }
  "normal"                      { return NORMAL; }
  "hilite"                      { return HILITE; }
  "selected"                    { return SELECTED; }
  "chart"                       { return CHART; }
  "circle"                      { return CIRCLE; }
  "line"                        { return LINE; }
  "point"                       { return POINT; }
  "polygon"                     { return POLYGON; }
  "raster"                      { return RASTER; }
  "query"                       { return QUERY; }
  "ONE-TO-ONE"                  { return ONE_TO_ONE; }
  "ONE-TO-MANY"                 { return ONE_TO_MANY; }
  "bitmap"                      { return BITMAP; }
  "truetype"                    { return TRUETYPE; }
  "ellipse"                     { return ELLIPSE; }
  "hatch"                       { return HATCH; }
  "pixmap"                      { return PIXMAP; }
  "vector"                      { return VECTOR; }
  "percentages"                 { return PERCENTAGES; }
  "yes"                         { return YES; }
  "no"                          { return NO; }

  {ATTRIBUTETOKEN}              { return ATTRIBUTETOKEN; }
  {LOGICALEXPRESSIONTOKEN}      { return LOGICALEXPRESSIONTOKEN; }
  {LISTEXPRESSIONTOKEN}         { return LISTEXPRESSIONTOKEN; }
  {REGEXTOKEN}                  { return REGEXTOKEN; }
  {INTEGER}                     { return INTEGER; }
  {DOUBLE}                      { return DOUBLE; }
  {SPACE}                       { return SPACE; }
  {COMMENT}                     { return COMMENT; }
  {NUMBER}                      { return NUMBER; }
  {ID}                          { return ID; }
  {STRING}                      { return STRING; }

}

[^] { return BAD_CHARACTER; }

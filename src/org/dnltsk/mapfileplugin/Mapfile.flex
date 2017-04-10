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

SPACE=[ \t\n\x0B\f\r]+
COMMENT=#.*
NUMBER=[+-]{0,1}[0-9]+(\.[0-9]*)?
ID=[:letter:][a-zA-Z_0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
ATTRIBUTETOKEN=\[[a-zA-Z_0-9]+\]

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }

  ";"                     { return SEMI; }
  "="                     { return EQ; }
  "("                     { return LP; }
  ")"                     { return RP; }
  "+"                     { return OP_1; }
  "-"                     { return OP_2; }
  "*"                     { return OP_3; }
  "/"                     { return OP_4; }
  "!"                     { return OP_5; }
  "MAP"                   { return MAP; }
  "END"                   { return END; }
  "WEB"                   { return WEB; }
  "LAYER"                 { return LAYER; }
  "CLASS"                 { return CLASS; }
  "SYMBOL"                { return SYMBOL; }
  "LABEL"                 { return LABEL; }
  "STYLE"                 { return STYLE; }
  "LEADER"                { return LEADER; }
  "LEGEND"                { return LEGEND; }
  "FEATURE"               { return FEATURE; }
  "CLUSTER"               { return CLUSTER; }
  "COMPOSITE"             { return COMPOSITE; }
  "GRID"                  { return GRID; }
  "JOIN"                  { return JOIN; }
  "QUERYMAP"              { return QUERYMAP; }
  "REFERENCE"             { return REFERENCE; }
  "SCALEBAR"              { return SCALEBAR; }
  "PATTERN"               { return PATTERN; }
  "VALIDATION"            { return VALIDATION; }
  "METADATA"              { return METADATA; }
  "POINTS"                { return POINTS; }
  "PROJECTION"            { return PROJECTION; }
  "ALIGN"                 { return ALIGN; }
  "ANGLE"                 { return ANGLE; }
  "ANTIALIAS"             { return ANTIALIAS; }
  "BACKGROUNDCOLOR"       { return BACKGROUNDCOLOR; }
  "BROWSEFORMAT"          { return BROWSEFORMAT; }
  "BUFFER"                { return BUFFER; }
  "CLASSGROUP"            { return CLASSGROUP; }
  "CLASSITEM"             { return CLASSITEM; }
  "COLOR"                 { return COLOR; }
  "CONFIG"                { return CONFIG; }
  "CGI_CONTEXT_URL"       { return CGI_CONTEXT_URL; }
  "MS_ENCRYPTION_KEY"     { return MS_ENCRYPTION_KEY; }
  "MS_ERRORFILE"          { return MS_ERRORFILE; }
  "MS_NONSQUARE"          { return MS_NONSQUARE; }
  "ON_MISSING_DATA"       { return ON_MISSING_DATA; }
  "PROJ_LIB"              { return PROJ_LIB; }
  "COMPOP"                { return COMPOP; }
  "CONNECTION"            { return CONNECTION; }
  "CONNECTIONTYPE"        { return CONNECTIONTYPE; }
  "DATA"                  { return DATA; }
  "DATAPATTERN"           { return DATAPATTERN; }
  "DEBUG"                 { return DEBUG; }
  "DEFRESOLUTION"         { return DEFRESOLUTION; }
  "DUMP"                  { return DUMP; }
  "EMPTY"                 { return EMPTY; }
  "ENCODING"              { return ENCODING; }
  "ERROR"                 { return ERROR; }
  "EXPRESSION"            { return EXPRESSION; }
  "EXTENT"                { return EXTENT; }
  "FILTER"                { return FILTER; }
  "FILTERITEM"            { return FILTERITEM; }
  "FONTSET"               { return FONTSET; }
  "FOOTER"                { return FOOTER; }
  "FROM"                  { return FROM; }
  "GAP"                   { return GAP; }
  "GEOMTRANSFORM"         { return GEOMTRANSFORM; }
  "GRIDSTEP"              { return GRIDSTEP; }
  "GROUP"                 { return GROUP; }
  "HEADER"                { return HEADER; }
  "IMAGE"                 { return IMAGE; }
  "IMAGECOLOR"            { return IMAGECOLOR; }
  "IMAGEPATH"             { return IMAGEPATH; }
  "IMAGETYPE"             { return IMAGETYPE; }
  "IMAGEURL"              { return IMAGEURL; }
  "INITIALGAP"            { return INITIALGAP; }
  "INTERLACE"             { return INTERLACE; }
  "ITEMS"                 { return ITEMS; }
  "KEYIMAGE"              { return KEYIMAGE; }
  "KEYSIZE"               { return KEYSIZE; }
  "KEYSPACING"            { return KEYSPACING; }
  "LABELCACHE"            { return LABELCACHE; }
  "LABELFORMAT"           { return LABELFORMAT; }
  "LABELITEM"             { return LABELITEM; }
  "LABELMAXSCALEDENOM"    { return LABELMAXSCALEDENOM; }
  "LABELMINSCALEDENOM"    { return LABELMINSCALEDENOM; }
  "LABELREQUIRES"         { return LABELREQUIRES; }
  "LEGENDFORMAT"          { return LEGENDFORMAT; }
  "LINECAP"               { return LINECAP; }
  "LINEJOIN"              { return LINEJOIN; }
  "LINEJOINMAXSIZE"       { return LINEJOINMAXSIZE; }
  "MARKER"                { return MARKER; }
  "MARKERSIZE"            { return MARKERSIZE; }
  "MASK"                  { return MASK; }
  "MAXARCS"               { return MAXARCS; }
  "MAXBOXSIZE"            { return MAXBOXSIZE; }
  "MAXDISTANCE"           { return MAXDISTANCE; }
  "MAXFEATURES"           { return MAXFEATURES; }
  "MAXGEOWIDTH"           { return MAXGEOWIDTH; }
  "MAXINTERVAL"           { return MAXINTERVAL; }
  "MAXSCALEDENOM"         { return MAXSCALEDENOM; }
  "MAXSIZE"               { return MAXSIZE; }
  "MAXSUBDIVIDE"          { return MAXSUBDIVIDE; }
  "MAXTEMPLATE"           { return MAXTEMPLATE; }
  "MAXWIDTH"              { return MAXWIDTH; }
  "MINARCS"               { return MINARCS; }
  "MINBOXSIZE"            { return MINBOXSIZE; }
  "MINGEOWIDTH"           { return MINGEOWIDTH; }
  "MININTERVAL"           { return MININTERVAL; }
  "MINSCALEDENOM"         { return MINSCALEDENOM; }
  "MINSIZE"               { return MINSIZE; }
  "MINSUBDIVIDE"          { return MINSUBDIVIDE; }
  "MINTEMPLATE"           { return MINTEMPLATE; }
  "MINWIDTH"              { return MINWIDTH; }
  "NAME"                  { return NAME; }
  "OFFSET"                { return OFFSET; }
  "OFFSITE"               { return OFFSITE; }
  "OPACITY"               { return OPACITY; }
  "OUTLINECOLOR"          { return OUTLINECOLOR; }
  "OUTLINEWIDTH"          { return OUTLINEWIDTH; }
  "PLUGIN"                { return PLUGIN; }
  "POLAROFFSET"           { return POLAROFFSET; }
  "POSITION"              { return POSITION; }
  "POSTLABELCACHE"        { return POSTLABELCACHE; }
  "PROCESSING"            { return PROCESSING; }
  "QUERYFORMAT"           { return QUERYFORMAT; }
  "REGION"                { return REGION; }
  "REQUIRES"              { return REQUIRES; }
  "RESOLUTION"            { return RESOLUTION; }
  "SCALEDENOM"            { return SCALEDENOM; }
  "SHAPEPATH"             { return SHAPEPATH; }
  "SIZE"                  { return SIZE; }
  "SIZEUNITS"             { return SIZEUNITS; }
  "STATUS"                { return STATUS; }
  "STYLEITEM"             { return STYLEITEM; }
  "SYMBOLSCALEDENOM"      { return SYMBOLSCALEDENOM; }
  "SYMBOLSET"             { return SYMBOLSET; }
  "TABLE"                 { return TABLE; }
  "TEMPLATE"              { return TEMPLATE; }
  "TEMPLATEPATTERN"       { return TEMPLATEPATTERN; }
  "TEMPPATH"              { return TEMPPATH; }
  "TEXT"                  { return TEXT; }
  "TILEINDEX"             { return TILEINDEX; }
  "TILEITEM"              { return TILEITEM; }
  "TILESRS"               { return TILESRS; }
  "TITLE"                 { return TITLE; }
  "TO"                    { return TO; }
  "TOLERANCE"             { return TOLERANCE; }
  "TOLERANCEUNITS"        { return TOLERANCEUNITS; }
  "TRANSFORM"             { return TRANSFORM; }
  "TYPE"                  { return TYPE; }
  "UNITS"                 { return UNITS; }
  "UTFDATA"               { return UTFDATA; }
  "UTFITEM"               { return UTFITEM; }
  "WIDTH"                 { return WIDTH; }
  "WKT"                   { return WKT; }
  "left"                  { return LEFT; }
  "center"                { return CENTER; }
  "right"                 { return RIGHT; }
  "auto"                  { return AUTO; }
  "true"                  { return TRUE; }
  "false"                 { return FALSE; }
  "contour"               { return CONTOUR; }
  "kerneldensity"         { return KERNELDENSITY; }
  "local"                 { return LOCAL; }
  "ogr"                   { return OGR; }
  "oraclespatial"         { return ORACLESPATIAL; }
  "postgis"               { return POSTGIS; }
  "sde"                   { return SDE; }
  "union"                 { return UNION; }
  "uvraster"              { return UVRASTER; }
  "wfs"                   { return WFS; }
  "wms"                   { return WMS; }
  "csv"                   { return CSV; }
  "mysql"                 { return MYSQL; }
  "postgresql"            { return POSTGRESQL; }
  "bbox"                  { return BBOX; }
  "centroid"              { return CENTROID; }
  "labelpnt"              { return LABELPNT; }
  "labelpoly"             { return LABELPOLY; }
  "start"                 { return START; }
  "vertices"              { return VERTICES; }
  "png"                   { return PNG; }
  "gif"                   { return GIF; }
  "png8"                  { return PNG8; }
  "jpeg"                  { return JPEG; }
  "svg"                   { return SVG; }
  "pdf"                   { return PDF; }
  "gtiff"                 { return GTIFF; }
  "kml"                   { return KML; }
  "kmz"                   { return KMZ; }
  "cairopng"              { return CAIROPNG; }
  "dd"                    { return DD; }
  "ddmm"                  { return DDMM; }
  "ddmmss"                { return DDMMSS; }
  "butt"                  { return BUTT; }
  "round"                 { return ROUND; }
  "square"                { return SQUARE; }
  "miter"                 { return MITER; }
  "bevel"                 { return BEVEL; }
  "none"                  { return NONE; }
  "fail"                  { return FAIL; }
  "log"                   { return LOG; }
  "ignore"                { return IGNORE; }
  "on"                    { return ON; }
  "off"                   { return OFF; }
  "ul"                    { return UL; }
  "uc"                    { return UC; }
  "ur"                    { return UR; }
  "ll"                    { return LL; }
  "lc"                    { return LC; }
  "lr"                    { return LR; }
  "feet"                  { return FEET; }
  "inches"                { return INCHES; }
  "kilometers"            { return KILOMETERS; }
  "meters"                { return METERS; }
  "miles"                 { return MILES; }
  "nauticalmiles"         { return NAUTICALMILES; }
  "pixels"                { return PIXELS; }
  "default"               { return DEFAULT; }
  "normal"                { return NORMAL; }
  "hilite"                { return HILITE; }
  "selected"              { return SELECTED; }
  "cl"                    { return CL; }
  "cc"                    { return CC; }
  "cr"                    { return CR; }
  "chart"                 { return CHART; }
  "circle"                { return CIRCLE; }
  "line"                  { return LINE; }
  "point"                 { return POINT; }
  "polygon"               { return POLYGON; }
  "raster"                { return RASTER; }
  "query"                 { return QUERY; }
  "ONE-TO-ONE"            { return ONE_TO_ONE; }
  "ONE-TO-MANY"           { return ONE_TO_MANY; }
  "percentages"           { return PERCENTAGES; }
  "yes"                   { return YES; }
  "no"                    { return NO; }

  {SPACE}                 { return SPACE; }
  {COMMENT}               { return COMMENT; }
  {NUMBER}                { return NUMBER; }
  {ID}                    { return ID; }
  {STRING}                { return STRING; }
  {ATTRIBUTETOKEN}        { return ATTRIBUTETOKEN; }

}

[^] { return BAD_CHARACTER; }

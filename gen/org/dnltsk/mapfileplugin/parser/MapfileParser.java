// This is a generated file. Not intended for manual editing.
package org.dnltsk.mapfileplugin.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static org.dnltsk.mapfileplugin.psi.MapfileTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MapfileParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b, 0);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return mapfile(b, l + 1);
  }

  /* ********************************************************** */
  // ANGLE number
  static boolean AngleAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AngleAttr")) return false;
    if (!nextTokenIs(b, ANGLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ANGLE, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BROWSEFORMAT string
  static boolean BrowseformatAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BrowseformatAttr")) return false;
    if (!nextTokenIs(b, BROWSEFORMAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BROWSEFORMAT, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BUFFER number
  static boolean BufferAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BufferAttr")) return false;
    if (!nextTokenIs(b, BUFFER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BUFFER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS END
  static boolean ClassObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassObject")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASSGROUP string
  static boolean ClassgroupAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassgroupAttr")) return false;
    if (!nextTokenIs(b, CLASSGROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASSGROUP, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASSITEM string
  static boolean ClassitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassitemAttr")) return false;
    if (!nextTokenIs(b, CLASSITEM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASSITEM, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         MaxdistanceAttr | RegionAttr | BufferAttr | GroupAttr | FilterAttr | ProcessingAttr
  //     ) ClusterAttributes*
  static boolean ClusterAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClusterAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClusterAttributes_0(b, l + 1);
    r = r && ClusterAttributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MaxdistanceAttr | RegionAttr | BufferAttr | GroupAttr | FilterAttr | ProcessingAttr
  private static boolean ClusterAttributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClusterAttributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MaxdistanceAttr(b, l + 1);
    if (!r) r = RegionAttr(b, l + 1);
    if (!r) r = BufferAttr(b, l + 1);
    if (!r) r = GroupAttr(b, l + 1);
    if (!r) r = FilterAttr(b, l + 1);
    if (!r) r = ProcessingAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ClusterAttributes*
  private static boolean ClusterAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClusterAttributes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ClusterAttributes(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClusterAttributes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // CLUSTER ClusterAttributes END
  static boolean ClusterObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClusterObject")) return false;
    if (!nextTokenIs(b, CLUSTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLUSTER);
    r = r && ClusterAttributes(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMPOP string
  static boolean CompopAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompopAttr")) return false;
    if (!nextTokenIs(b, COMPOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMPOP, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         OpacityAttr | CompopAttr
  //     ) CompositeAttributes*
  static boolean CompositeAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompositeAttributes")) return false;
    if (!nextTokenIs(b, "", COMPOP, OPACITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CompositeAttributes_0(b, l + 1);
    r = r && CompositeAttributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OpacityAttr | CompopAttr
  private static boolean CompositeAttributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompositeAttributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpacityAttr(b, l + 1);
    if (!r) r = CompopAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CompositeAttributes*
  private static boolean CompositeAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompositeAttributes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CompositeAttributes(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompositeAttributes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // COMPOSITE CompositeAttributes END
  static boolean CompositeObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompositeObject")) return false;
    if (!nextTokenIs(b, COMPOSITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPOSITE);
    r = r && CompositeAttributes(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONFIG (
  //     ( CGI_CONTEXT_URL string )
  //     | ( MS_ENCRYPTION_KEY string )
  //     | ( MS_ERRORFILE string )
  //     | ( MS_NONSQUARE yesNoValues )
  //     | ( ON_MISSING_DATA onMissingDataValues )
  //     | ( PROJ_LIB string ) )
  static boolean ConfigAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr")) return false;
    if (!nextTokenIs(b, CONFIG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONFIG);
    r = r && ConfigAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( CGI_CONTEXT_URL string )
  //     | ( MS_ENCRYPTION_KEY string )
  //     | ( MS_ERRORFILE string )
  //     | ( MS_NONSQUARE yesNoValues )
  //     | ( ON_MISSING_DATA onMissingDataValues )
  //     | ( PROJ_LIB string )
  private static boolean ConfigAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConfigAttr_1_0(b, l + 1);
    if (!r) r = ConfigAttr_1_1(b, l + 1);
    if (!r) r = ConfigAttr_1_2(b, l + 1);
    if (!r) r = ConfigAttr_1_3(b, l + 1);
    if (!r) r = ConfigAttr_1_4(b, l + 1);
    if (!r) r = ConfigAttr_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CGI_CONTEXT_URL string
  private static boolean ConfigAttr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CGI_CONTEXT_URL, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // MS_ENCRYPTION_KEY string
  private static boolean ConfigAttr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MS_ENCRYPTION_KEY, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // MS_ERRORFILE string
  private static boolean ConfigAttr_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MS_ERRORFILE, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // MS_NONSQUARE yesNoValues
  private static boolean ConfigAttr_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MS_NONSQUARE);
    r = r && yesNoValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON_MISSING_DATA onMissingDataValues
  private static boolean ConfigAttr_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON_MISSING_DATA);
    r = r && onMissingDataValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PROJ_LIB string
  private static boolean ConfigAttr_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr_1_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROJ_LIB, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONNECTION string
  static boolean ConnectionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectionAttr")) return false;
    if (!nextTokenIs(b, CONNECTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONNECTION, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONNECTIONTYPE connectionTypeValues
  static boolean ConnectiontypeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectiontypeAttr")) return false;
    if (!nextTokenIs(b, CONNECTIONTYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONNECTIONTYPE);
    r = r && connectionTypeValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DATA string
  static boolean DataAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataAttr")) return false;
    if (!nextTokenIs(b, DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATA, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DATAPATTERN string
  static boolean DatapatternAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatapatternAttr")) return false;
    if (!nextTokenIs(b, DATAPATTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATAPATTERN, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DEBUG debugValues
  static boolean DebugAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugAttr")) return false;
    if (!nextTokenIs(b, DEBUG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEBUG);
    r = r && debugValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DEFRESOLUTION number
  static boolean DefresolutionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefresolutionAttr")) return false;
    if (!nextTokenIs(b, DEFRESOLUTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFRESOLUTION, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DUMP booleanValues
  static boolean DumpAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DumpAttr")) return false;
    if (!nextTokenIs(b, DUMP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DUMP);
    r = r && booleanValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EMPTY string
  static boolean EmptyAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmptyAttr")) return false;
    if (!nextTokenIs(b, EMPTY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EMPTY, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENCODING string
  static boolean EncodingAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncodingAttr")) return false;
    if (!nextTokenIs(b, ENCODING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENCODING, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ERROR string
  static boolean ErrorAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ErrorAttr")) return false;
    if (!nextTokenIs(b, ERROR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ERROR, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXTENT number number number number
  static boolean ExtentAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtentAttr")) return false;
    if (!nextTokenIs(b, EXTENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXTENT, NUMBER, NUMBER, NUMBER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         PointsObject
  //         | ItemsAttr | TextAttr | WktAttr
  //     ) FeatureAttributes*
  static boolean FeatureAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FeatureAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FeatureAttributes_0(b, l + 1);
    r = r && FeatureAttributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PointsObject
  //         | ItemsAttr | TextAttr | WktAttr
  private static boolean FeatureAttributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FeatureAttributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PointsObject(b, l + 1);
    if (!r) r = ItemsAttr(b, l + 1);
    if (!r) r = TextAttr(b, l + 1);
    if (!r) r = WktAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FeatureAttributes*
  private static boolean FeatureAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FeatureAttributes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FeatureAttributes(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FeatureAttributes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // FEATURE FeatureAttributes END
  static boolean FeatureObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FeatureObject")) return false;
    if (!nextTokenIs(b, FEATURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FEATURE);
    r = r && FeatureAttributes(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FILTER string
  static boolean FilterAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilterAttr")) return false;
    if (!nextTokenIs(b, FILTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILTER, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FILTERITEM string
  static boolean FilteritemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilteritemAttr")) return false;
    if (!nextTokenIs(b, FILTERITEM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILTERITEM, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FONTSET string
  static boolean FontsetAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FontsetAttr")) return false;
    if (!nextTokenIs(b, FONTSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FONTSET, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOOTER string
  static boolean FooterAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FooterAttr")) return false;
    if (!nextTokenIs(b, FOOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOOTER, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GEOMTRANSFORM string
  static boolean GeomtransformAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GeomtransformAttr")) return false;
    if (!nextTokenIs(b, GEOMTRANSFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GEOMTRANSFORM, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GRID END
  static boolean GridObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GridObject")) return false;
    if (!nextTokenIs(b, GRID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GRID, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GROUP string
  static boolean GroupAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupAttr")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GROUP, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // HEADER string
  static boolean HeaderAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeaderAttr")) return false;
    if (!nextTokenIs(b, HEADER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HEADER, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IMAGECOLOR ( string | ( number number number ) )
  static boolean ImagecolorAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImagecolorAttr")) return false;
    if (!nextTokenIs(b, IMAGECOLOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMAGECOLOR);
    r = r && ImagecolorAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string | ( number number number )
  private static boolean ImagecolorAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImagecolorAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = ImagecolorAttr_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // number number number
  private static boolean ImagecolorAttr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImagecolorAttr_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, NUMBER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IMAGEPATH string
  static boolean ImagepathAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImagepathAttr")) return false;
    if (!nextTokenIs(b, IMAGEPATH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMAGEPATH, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IMAGETYPE imagetypeValues
  static boolean ImagetypeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImagetypeAttr")) return false;
    if (!nextTokenIs(b, IMAGETYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMAGETYPE);
    r = r && imagetypeValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IMAGEURL string
  static boolean ImageurlAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImageurlAttr")) return false;
    if (!nextTokenIs(b, IMAGEURL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMAGEURL, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTERLACE onOffValues
  static boolean InterlaceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterlaceAttr")) return false;
    if (!nextTokenIs(b, INTERLACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTERLACE);
    r = r && onOffValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ITEMS string
  static boolean ItemsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ItemsAttr")) return false;
    if (!nextTokenIs(b, ITEMS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ITEMS, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // JOIN END
  static boolean JoinObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinObject")) return false;
    if (!nextTokenIs(b, JOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, JOIN, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABELCACHE onOffValues
  static boolean LabelcacheAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelcacheAttr")) return false;
    if (!nextTokenIs(b, LABELCACHE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LABELCACHE);
    r = r && onOffValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABELITEM string
  static boolean LabelitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelitemAttr")) return false;
    if (!nextTokenIs(b, LABELITEM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LABELITEM, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABELMAXSCALEDENOM number
  static boolean LabelmaxscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelmaxscaledenomAttr")) return false;
    if (!nextTokenIs(b, LABELMAXSCALEDENOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LABELMAXSCALEDENOM, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABELMINSCALEDENOM number
  static boolean LabelminscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelminscaledenomAttr")) return false;
    if (!nextTokenIs(b, LABELMINSCALEDENOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LABELMINSCALEDENOM, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABELREQUIRES string
  static boolean LabelrequiresAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelrequiresAttr")) return false;
    if (!nextTokenIs(b, LABELREQUIRES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LABELREQUIRES, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         ClassObject | ClusterObject | CompositeObject | FeatureObject | GridObject | JoinObject | MetadataObject
  //         | ProjectionObject | ValidationObject
  //         | ClassgroupAttr | ClassitemAttr | ConnectionAttr | ConnectiontypeAttr | DataAttr | DebugAttr | DumpAttr
  //         | EncodingAttr | ExtentAttr | FilterAttr | FooterAttr | FilteritemAttr | GeomtransformAttr | GroupAttr
  //         | HeaderAttr | LabelcacheAttr | LabelitemAttr | LabelmaxscaledenomAttr | LabelminscaledenomAttr
  //         | LabelrequiresAttr | MaskAttr | MaxfeaturesAttr | MaxgeowidthAttr | MaxscaledenomAttr | MingeowidthAttr
  //         | MinscaledenomAttr | NameAttr | PluginAttr | PostlabelcacheAttr | ProcessingAttr | OffsiteAttr | SizeunitsAttr
  //         | RequiresAttr | StatusAttr | StyleitemAttr | SymbolscaledenomAttr | TemplateAttr | TileindexAttr
  //         | TileitemAttr | TilesrsAttr | TitleAttr | ToleranceunitsAttr | ToleranceAttr | TransformAttr | TypeAttr
  //         | UnitsAttr | UtfdataAttr | UtfitemAttr
  //     ) LayerAttributes*
  static boolean LayerAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LayerAttributes_0(b, l + 1);
    r = r && LayerAttributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ClassObject | ClusterObject | CompositeObject | FeatureObject | GridObject | JoinObject | MetadataObject
  //         | ProjectionObject | ValidationObject
  //         | ClassgroupAttr | ClassitemAttr | ConnectionAttr | ConnectiontypeAttr | DataAttr | DebugAttr | DumpAttr
  //         | EncodingAttr | ExtentAttr | FilterAttr | FooterAttr | FilteritemAttr | GeomtransformAttr | GroupAttr
  //         | HeaderAttr | LabelcacheAttr | LabelitemAttr | LabelmaxscaledenomAttr | LabelminscaledenomAttr
  //         | LabelrequiresAttr | MaskAttr | MaxfeaturesAttr | MaxgeowidthAttr | MaxscaledenomAttr | MingeowidthAttr
  //         | MinscaledenomAttr | NameAttr | PluginAttr | PostlabelcacheAttr | ProcessingAttr | OffsiteAttr | SizeunitsAttr
  //         | RequiresAttr | StatusAttr | StyleitemAttr | SymbolscaledenomAttr | TemplateAttr | TileindexAttr
  //         | TileitemAttr | TilesrsAttr | TitleAttr | ToleranceunitsAttr | ToleranceAttr | TransformAttr | TypeAttr
  //         | UnitsAttr | UtfdataAttr | UtfitemAttr
  private static boolean LayerAttributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerAttributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassObject(b, l + 1);
    if (!r) r = ClusterObject(b, l + 1);
    if (!r) r = CompositeObject(b, l + 1);
    if (!r) r = FeatureObject(b, l + 1);
    if (!r) r = GridObject(b, l + 1);
    if (!r) r = JoinObject(b, l + 1);
    if (!r) r = MetadataObject(b, l + 1);
    if (!r) r = ProjectionObject(b, l + 1);
    if (!r) r = ValidationObject(b, l + 1);
    if (!r) r = ClassgroupAttr(b, l + 1);
    if (!r) r = ClassitemAttr(b, l + 1);
    if (!r) r = ConnectionAttr(b, l + 1);
    if (!r) r = ConnectiontypeAttr(b, l + 1);
    if (!r) r = DataAttr(b, l + 1);
    if (!r) r = DebugAttr(b, l + 1);
    if (!r) r = DumpAttr(b, l + 1);
    if (!r) r = EncodingAttr(b, l + 1);
    if (!r) r = ExtentAttr(b, l + 1);
    if (!r) r = FilterAttr(b, l + 1);
    if (!r) r = FooterAttr(b, l + 1);
    if (!r) r = FilteritemAttr(b, l + 1);
    if (!r) r = GeomtransformAttr(b, l + 1);
    if (!r) r = GroupAttr(b, l + 1);
    if (!r) r = HeaderAttr(b, l + 1);
    if (!r) r = LabelcacheAttr(b, l + 1);
    if (!r) r = LabelitemAttr(b, l + 1);
    if (!r) r = LabelmaxscaledenomAttr(b, l + 1);
    if (!r) r = LabelminscaledenomAttr(b, l + 1);
    if (!r) r = LabelrequiresAttr(b, l + 1);
    if (!r) r = MaskAttr(b, l + 1);
    if (!r) r = MaxfeaturesAttr(b, l + 1);
    if (!r) r = MaxgeowidthAttr(b, l + 1);
    if (!r) r = MaxscaledenomAttr(b, l + 1);
    if (!r) r = MingeowidthAttr(b, l + 1);
    if (!r) r = MinscaledenomAttr(b, l + 1);
    if (!r) r = NameAttr(b, l + 1);
    if (!r) r = PluginAttr(b, l + 1);
    if (!r) r = PostlabelcacheAttr(b, l + 1);
    if (!r) r = ProcessingAttr(b, l + 1);
    if (!r) r = OffsiteAttr(b, l + 1);
    if (!r) r = SizeunitsAttr(b, l + 1);
    if (!r) r = RequiresAttr(b, l + 1);
    if (!r) r = StatusAttr(b, l + 1);
    if (!r) r = StyleitemAttr(b, l + 1);
    if (!r) r = SymbolscaledenomAttr(b, l + 1);
    if (!r) r = TemplateAttr(b, l + 1);
    if (!r) r = TileindexAttr(b, l + 1);
    if (!r) r = TileitemAttr(b, l + 1);
    if (!r) r = TilesrsAttr(b, l + 1);
    if (!r) r = TitleAttr(b, l + 1);
    if (!r) r = ToleranceunitsAttr(b, l + 1);
    if (!r) r = ToleranceAttr(b, l + 1);
    if (!r) r = TransformAttr(b, l + 1);
    if (!r) r = TypeAttr(b, l + 1);
    if (!r) r = UnitsAttr(b, l + 1);
    if (!r) r = UtfdataAttr(b, l + 1);
    if (!r) r = UtfitemAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LayerAttributes*
  private static boolean LayerAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerAttributes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LayerAttributes(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LayerAttributes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LAYER LayerAttributes END
  static boolean LayerObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerObject")) return false;
    if (!nextTokenIs(b, LAYER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LAYER);
    r = r && LayerAttributes(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEGEND END
  static boolean LegendObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LegendObject")) return false;
    if (!nextTokenIs(b, LEGEND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEGEND, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEGENDFORMAT string
  static boolean LegendformatAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LegendformatAttr")) return false;
    if (!nextTokenIs(b, LEGENDFORMAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEGENDFORMAT, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         LayerObject | LegendObject | ProjectionObject | QuerymapObject | ReferenceObject | ScalebarObject
  //         | SymbolObject | WebObject
  //         | AngleAttr | ConfigAttr | DatapatternAttr | DebugAttr | DefresolutionAttr | ExtentAttr | FontsetAttr
  //         | ImagecolorAttr | ImagetypeAttr | InterlaceAttr | MaxsizeAttr | NameAttr | ResolutionAttr
  //         | ScaledenomAttr | ShapepathAttr | SizeAttr | StatusAttr | SymbolsetAttr | TemplatepatternAttr | UnitsAttr
  //     ) MapAttributes*
  static boolean MapAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapAttributes_0(b, l + 1);
    r = r && MapAttributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LayerObject | LegendObject | ProjectionObject | QuerymapObject | ReferenceObject | ScalebarObject
  //         | SymbolObject | WebObject
  //         | AngleAttr | ConfigAttr | DatapatternAttr | DebugAttr | DefresolutionAttr | ExtentAttr | FontsetAttr
  //         | ImagecolorAttr | ImagetypeAttr | InterlaceAttr | MaxsizeAttr | NameAttr | ResolutionAttr
  //         | ScaledenomAttr | ShapepathAttr | SizeAttr | StatusAttr | SymbolsetAttr | TemplatepatternAttr | UnitsAttr
  private static boolean MapAttributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapAttributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LayerObject(b, l + 1);
    if (!r) r = LegendObject(b, l + 1);
    if (!r) r = ProjectionObject(b, l + 1);
    if (!r) r = QuerymapObject(b, l + 1);
    if (!r) r = ReferenceObject(b, l + 1);
    if (!r) r = ScalebarObject(b, l + 1);
    if (!r) r = SymbolObject(b, l + 1);
    if (!r) r = WebObject(b, l + 1);
    if (!r) r = AngleAttr(b, l + 1);
    if (!r) r = ConfigAttr(b, l + 1);
    if (!r) r = DatapatternAttr(b, l + 1);
    if (!r) r = DebugAttr(b, l + 1);
    if (!r) r = DefresolutionAttr(b, l + 1);
    if (!r) r = ExtentAttr(b, l + 1);
    if (!r) r = FontsetAttr(b, l + 1);
    if (!r) r = ImagecolorAttr(b, l + 1);
    if (!r) r = ImagetypeAttr(b, l + 1);
    if (!r) r = InterlaceAttr(b, l + 1);
    if (!r) r = MaxsizeAttr(b, l + 1);
    if (!r) r = NameAttr(b, l + 1);
    if (!r) r = ResolutionAttr(b, l + 1);
    if (!r) r = ScaledenomAttr(b, l + 1);
    if (!r) r = ShapepathAttr(b, l + 1);
    if (!r) r = SizeAttr(b, l + 1);
    if (!r) r = StatusAttr(b, l + 1);
    if (!r) r = SymbolsetAttr(b, l + 1);
    if (!r) r = TemplatepatternAttr(b, l + 1);
    if (!r) r = UnitsAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MapAttributes*
  private static boolean MapAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapAttributes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MapAttributes(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapAttributes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // MAP MapAttributes END
  static boolean MapObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObject")) return false;
    if (!nextTokenIs(b, MAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAP);
    r = r && MapAttributes(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MASK string
  static boolean MaskAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaskAttr")) return false;
    if (!nextTokenIs(b, MASK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MASK, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXDISTANCE number
  static boolean MaxdistanceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxdistanceAttr")) return false;
    if (!nextTokenIs(b, MAXDISTANCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAXDISTANCE, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXFEATURES number
  static boolean MaxfeaturesAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxfeaturesAttr")) return false;
    if (!nextTokenIs(b, MAXFEATURES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAXFEATURES, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXGEOWIDTH number
  static boolean MaxgeowidthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxgeowidthAttr")) return false;
    if (!nextTokenIs(b, MAXGEOWIDTH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAXGEOWIDTH, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXSCALEDENOM number
  static boolean MaxscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxscaledenomAttr")) return false;
    if (!nextTokenIs(b, MAXSCALEDENOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAXSCALEDENOM, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXSIZE number
  static boolean MaxsizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxsizeAttr")) return false;
    if (!nextTokenIs(b, MAXSIZE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAXSIZE, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXTEMPLATE string
  static boolean MaxtemplateAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxtemplateAttr")) return false;
    if (!nextTokenIs(b, MAXTEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAXTEMPLATE, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // METADATA END
  static boolean MetadataObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetadataObject")) return false;
    if (!nextTokenIs(b, METADATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, METADATA, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINGEOWIDTH number
  static boolean MingeowidthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MingeowidthAttr")) return false;
    if (!nextTokenIs(b, MINGEOWIDTH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MINGEOWIDTH, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINSCALEDENOM number
  static boolean MinscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinscaledenomAttr")) return false;
    if (!nextTokenIs(b, MINSCALEDENOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MINSCALEDENOM, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINTEMPLATE string
  static boolean MintemplateAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MintemplateAttr")) return false;
    if (!nextTokenIs(b, MINTEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MINTEMPLATE, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME string
  static boolean NameAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameAttr")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAME, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OFFSITE ( string | (number number number) )
  static boolean OffsiteAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsiteAttr")) return false;
    if (!nextTokenIs(b, OFFSITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OFFSITE);
    r = r && OffsiteAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string | (number number number)
  private static boolean OffsiteAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsiteAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = OffsiteAttr_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // number number number
  private static boolean OffsiteAttr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsiteAttr_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, NUMBER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPACITY
  static boolean OpacityAttr(PsiBuilder b, int l) {
    return consumeToken(b, OPACITY);
  }

  /* ********************************************************** */
  // PLUGIN string
  static boolean PluginAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PluginAttr")) return false;
    if (!nextTokenIs(b, PLUGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PLUGIN, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // POINTS (number number)* END
  static boolean PointsObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PointsObject")) return false;
    if (!nextTokenIs(b, POINTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, POINTS);
    r = r && PointsObject_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // (number number)*
  private static boolean PointsObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PointsObject_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PointsObject_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PointsObject_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // number number
  private static boolean PointsObject_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PointsObject_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // POSTLABELCACHE booleanValues
  static boolean PostlabelcacheAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostlabelcacheAttr")) return false;
    if (!nextTokenIs(b, POSTLABELCACHE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, POSTLABELCACHE);
    r = r && booleanValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PROCESSING string
  static boolean ProcessingAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcessingAttr")) return false;
    if (!nextTokenIs(b, PROCESSING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROCESSING, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PROJECTION END
  static boolean ProjectionObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProjectionObject")) return false;
    if (!nextTokenIs(b, PROJECTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROJECTION, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QUERYFORMAT string
  static boolean QueryformatAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryformatAttr")) return false;
    if (!nextTokenIs(b, QUERYFORMAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, QUERYFORMAT, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QUERYMAP END
  static boolean QuerymapObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuerymapObject")) return false;
    if (!nextTokenIs(b, QUERYMAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, QUERYMAP, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REFERENCE END
  static boolean ReferenceObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceObject")) return false;
    if (!nextTokenIs(b, REFERENCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, REFERENCE, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REGION string
  static boolean RegionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegionAttr")) return false;
    if (!nextTokenIs(b, REGION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, REGION, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REQUIRES string
  static boolean RequiresAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequiresAttr")) return false;
    if (!nextTokenIs(b, REQUIRES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, REQUIRES, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RESOLUTION number
  static boolean ResolutionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResolutionAttr")) return false;
    if (!nextTokenIs(b, RESOLUTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RESOLUTION, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SCALEBAR END
  static boolean ScalebarObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScalebarObject")) return false;
    if (!nextTokenIs(b, SCALEBAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SCALEBAR, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SCALEDENOM number
  static boolean ScaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScaledenomAttr")) return false;
    if (!nextTokenIs(b, SCALEDENOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SCALEDENOM, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SHAPEPATH string
  static boolean ShapepathAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapepathAttr")) return false;
    if (!nextTokenIs(b, SHAPEPATH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SHAPEPATH, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SIZE number number
  static boolean SizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeAttr")) return false;
    if (!nextTokenIs(b, SIZE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SIZE, NUMBER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SIZEUNITS sizeUnitValues
  static boolean SizeunitsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeunitsAttr")) return false;
    if (!nextTokenIs(b, SIZEUNITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIZEUNITS);
    r = r && sizeUnitValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STATUS statusValues
  static boolean StatusAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatusAttr")) return false;
    if (!nextTokenIs(b, STATUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STATUS);
    r = r && statusValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STYLEITEM string
  static boolean StyleitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleitemAttr")) return false;
    if (!nextTokenIs(b, STYLEITEM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STYLEITEM, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL END
  static boolean SymbolObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolObject")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOLSCALEDENOM number
  static boolean SymbolscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolscaledenomAttr")) return false;
    if (!nextTokenIs(b, SYMBOLSCALEDENOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOLSCALEDENOM, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOLSET string
  static boolean SymbolsetAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolsetAttr")) return false;
    if (!nextTokenIs(b, SYMBOLSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOLSET, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TEMPLATE string
  static boolean TemplateAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAttr")) return false;
    if (!nextTokenIs(b, TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEMPLATE, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TEMPLATEPATTERN string
  static boolean TemplatepatternAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplatepatternAttr")) return false;
    if (!nextTokenIs(b, TEMPLATEPATTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEMPLATEPATTERN, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TEMPPATH string
  static boolean TemppathAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemppathAttr")) return false;
    if (!nextTokenIs(b, TEMPPATH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEMPPATH, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TEXT string
  static boolean TextAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextAttr")) return false;
    if (!nextTokenIs(b, TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEXT, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILEINDEX string
  static boolean TileindexAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TileindexAttr")) return false;
    if (!nextTokenIs(b, TILEINDEX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILEINDEX, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILEITEM string
  static boolean TileitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TileitemAttr")) return false;
    if (!nextTokenIs(b, TILEITEM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILEITEM, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILESRS string
  static boolean TilesrsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TilesrsAttr")) return false;
    if (!nextTokenIs(b, TILESRS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILESRS, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TITLE string
  static boolean TitleAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TitleAttr")) return false;
    if (!nextTokenIs(b, TITLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TITLE, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TOLERANCE number
  static boolean ToleranceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToleranceAttr")) return false;
    if (!nextTokenIs(b, TOLERANCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TOLERANCE, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TOLERANCEUNITS toleranceUnitValues
  static boolean ToleranceunitsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToleranceunitsAttr")) return false;
    if (!nextTokenIs(b, TOLERANCEUNITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TOLERANCEUNITS);
    r = r && toleranceUnitValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TRANSFORM transformValues
  static boolean TransformAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformAttr")) return false;
    if (!nextTokenIs(b, TRANSFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRANSFORM);
    r = r && transformValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE typeValues
  static boolean TypeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAttr")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && typeValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UNITS unitsValues
  static boolean UnitsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitsAttr")) return false;
    if (!nextTokenIs(b, UNITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNITS);
    r = r && unitsValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UTFDATA string
  static boolean UtfdataAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UtfdataAttr")) return false;
    if (!nextTokenIs(b, UTFDATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UTFDATA, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UTFITEM string
  static boolean UtfitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UtfitemAttr")) return false;
    if (!nextTokenIs(b, UTFITEM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UTFITEM, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VALIDATION END
  static boolean ValidationObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValidationObject")) return false;
    if (!nextTokenIs(b, VALIDATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VALIDATION, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         MetadataObject | ValidationObject
  //         | BrowseformatAttr | EmptyAttr | ErrorAttr | FooterAttr | HeaderAttr | ImagepathAttr | ImageurlAttr
  //         | LegendformatAttr | MaxscaledenomAttr | MaxtemplateAttr | MinscaledenomAttr | MintemplateAttr
  //         | QueryformatAttr | TemplateAttr | TemppathAttr
  //     ) WebAttributes*
  static boolean WebAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WebAttributes_0(b, l + 1);
    r = r && WebAttributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MetadataObject | ValidationObject
  //         | BrowseformatAttr | EmptyAttr | ErrorAttr | FooterAttr | HeaderAttr | ImagepathAttr | ImageurlAttr
  //         | LegendformatAttr | MaxscaledenomAttr | MaxtemplateAttr | MinscaledenomAttr | MintemplateAttr
  //         | QueryformatAttr | TemplateAttr | TemppathAttr
  private static boolean WebAttributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebAttributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MetadataObject(b, l + 1);
    if (!r) r = ValidationObject(b, l + 1);
    if (!r) r = BrowseformatAttr(b, l + 1);
    if (!r) r = EmptyAttr(b, l + 1);
    if (!r) r = ErrorAttr(b, l + 1);
    if (!r) r = FooterAttr(b, l + 1);
    if (!r) r = HeaderAttr(b, l + 1);
    if (!r) r = ImagepathAttr(b, l + 1);
    if (!r) r = ImageurlAttr(b, l + 1);
    if (!r) r = LegendformatAttr(b, l + 1);
    if (!r) r = MaxscaledenomAttr(b, l + 1);
    if (!r) r = MaxtemplateAttr(b, l + 1);
    if (!r) r = MinscaledenomAttr(b, l + 1);
    if (!r) r = MintemplateAttr(b, l + 1);
    if (!r) r = QueryformatAttr(b, l + 1);
    if (!r) r = TemplateAttr(b, l + 1);
    if (!r) r = TemppathAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WebAttributes*
  private static boolean WebAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebAttributes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!WebAttributes(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WebAttributes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // WEB WebAttributes END
  static boolean WebObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebObject")) return false;
    if (!nextTokenIs(b, WEB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WEB);
    r = r && WebAttributes(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WKT string
  static boolean WktAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WktAttr")) return false;
    if (!nextTokenIs(b, WKT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WKT, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // true|false
  static boolean booleanValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanValues")) return false;
    if (!nextTokenIs(b, "", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // contour|kerneldensity|local|ogr|oraclespatial|plugin|postgis|sde|union|uvraster|wfs|wms
  static boolean connectionTypeValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connectionTypeValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTOUR);
    if (!r) r = consumeToken(b, KERNELDENSITY);
    if (!r) r = consumeToken(b, LOCAL);
    if (!r) r = consumeToken(b, OGR);
    if (!r) r = consumeToken(b, ORACLESPATIAL);
    if (!r) r = consumeToken(b, PLUGIN);
    if (!r) r = consumeToken(b, POSTGIS);
    if (!r) r = consumeToken(b, SDE);
    if (!r) r = consumeToken(b, UNION);
    if (!r) r = consumeToken(b, UVRASTER);
    if (!r) r = consumeToken(b, WFS);
    if (!r) r = consumeToken(b, WMS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // onOffValues|0|1|2|3|4|5
  static boolean debugValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debugValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onOffValues(b, l + 1);
    if (!r) r = consumeToken(b, "0");
    if (!r) r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // png|gif|png8|jpeg|svg|pdf|GTiff|kml|kmz|cairopng|string
  static boolean imagetypeValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imagetypeValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PNG);
    if (!r) r = consumeToken(b, GIF);
    if (!r) r = consumeToken(b, PNG8);
    if (!r) r = consumeToken(b, JPEG);
    if (!r) r = consumeToken(b, SVG);
    if (!r) r = consumeToken(b, PDF);
    if (!r) r = consumeToken(b, GTIFF);
    if (!r) r = consumeToken(b, KML);
    if (!r) r = consumeToken(b, KMZ);
    if (!r) r = consumeToken(b, CAIROPNG);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MapObject | LayerObject
  static boolean mapfile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapfile")) return false;
    if (!nextTokenIs(b, "", LAYER, MAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapObject(b, l + 1);
    if (!r) r = LayerObject(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // fail|log|ignore
  static boolean onMissingDataValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "onMissingDataValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FAIL);
    if (!r) r = consumeToken(b, LOG);
    if (!r) r = consumeToken(b, IGNORE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // on|off
  static boolean onOffValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "onOffValues")) return false;
    if (!nextTokenIs(b, "", OFF, ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    if (!r) r = consumeToken(b, OFF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // feet|inches|kilometers|meters|miles|nauticalmiles|pixels
  static boolean sizeUnitValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sizeUnitValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FEET);
    if (!r) r = consumeToken(b, INCHES);
    if (!r) r = consumeToken(b, KILOMETERS);
    if (!r) r = consumeToken(b, METERS);
    if (!r) r = consumeToken(b, MILES);
    if (!r) r = consumeToken(b, NAUTICALMILES);
    if (!r) r = consumeToken(b, PIXELS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // onOffValues|default
  static boolean statusValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statusValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onOffValues(b, l + 1);
    if (!r) r = consumeToken(b, DEFAULT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // sizeUnitValues|dd
  static boolean toleranceUnitValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "toleranceUnitValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sizeUnitValues(b, l + 1);
    if (!r) r = consumeToken(b, DD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // booleanValues|ul|uc|ur|cl|cc|cr|ll|lc|lr
  static boolean transformValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "transformValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = booleanValues(b, l + 1);
    if (!r) r = consumeToken(b, UL);
    if (!r) r = consumeToken(b, UC);
    if (!r) r = consumeToken(b, UR);
    if (!r) r = consumeToken(b, CL);
    if (!r) r = consumeToken(b, CC);
    if (!r) r = consumeToken(b, CR);
    if (!r) r = consumeToken(b, LL);
    if (!r) r = consumeToken(b, LC);
    if (!r) r = consumeToken(b, LR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // chart|circle|line|point|polygon|raster|query
  static boolean typeValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHART);
    if (!r) r = consumeToken(b, CIRCLE);
    if (!r) r = consumeToken(b, LINE);
    if (!r) r = consumeToken(b, POINT);
    if (!r) r = consumeToken(b, POLYGON);
    if (!r) r = consumeToken(b, RASTER);
    if (!r) r = consumeToken(b, QUERY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // toleranceUnitValues|percentages
  static boolean unitsValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unitsValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = toleranceUnitValues(b, l + 1);
    if (!r) r = consumeToken(b, PERCENTAGES);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // yes|no
  static boolean yesNoValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yesNoValues")) return false;
    if (!nextTokenIs(b, "", NO, YES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YES);
    if (!r) r = consumeToken(b, NO);
    exit_section_(b, m, null, r);
    return r;
  }

}

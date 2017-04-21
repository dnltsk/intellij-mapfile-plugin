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
    if (t == LAYER_OBJECT) {
      r = LayerObject(b, 0);
    }
    else if (t == MAP_OBJECT) {
      r = MapObject(b, 0);
    }
    else if (t == NAME_ATTR) {
      r = NameAttr(b, 0);
    }
    else if (t == STATUS_ATTR) {
      r = StatusAttr(b, 0);
    }
    else if (t == WEB_OBJECT) {
      r = WebObject(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return mapfile(b, l + 1);
  }

  /* ********************************************************** */
  // ALIGN AlignEnum
  static boolean AlignAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlignAttr")) return false;
    if (!nextTokenIs(b, ALIGN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ALIGN);
    p = r; // pin = 1
    r = r && AlignEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // left|center|right
  static boolean AlignEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlignEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT);
    if (!r) r = consumeToken(b, CENTER);
    if (!r) r = consumeToken(b, RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ANCHORPOINT double double
  static boolean AnchorpointAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnchorpointAttr")) return false;
    if (!nextTokenIs(b, ANCHORPOINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, ANCHORPOINT, DOUBLE, DOUBLE);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ANGLE ( integer | double )
  static boolean AngleAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AngleAttr")) return false;
    if (!nextTokenIs(b, ANGLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ANGLE);
    p = r; // pin = 1
    r = r && AngleAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean AngleAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AngleAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ANGLE AngleClassEnum
  static boolean AngleClassAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AngleClassAttr")) return false;
    if (!nextTokenIs(b, ANGLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ANGLE);
    p = r; // pin = 1
    r = r && AngleClassEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // integer|double|attributeToken|auto
  static boolean AngleClassEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AngleClassEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    if (!r) r = consumeToken(b, AUTO);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ANGLE AngleLabelEnum
  static boolean AngleLabelAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AngleLabelAttr")) return false;
    if (!nextTokenIs(b, ANGLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ANGLE);
    p = r; // pin = 1
    r = r && AngleLabelEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AngleClassEnum|auto2|follow
  static boolean AngleLabelEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AngleLabelEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AngleClassEnum(b, l + 1);
    if (!r) r = consumeToken(b, AUTO2);
    if (!r) r = consumeToken(b, FOLLOW);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ANTIALIAS BooleanEnum
  static boolean AntialiasAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AntialiasAttr")) return false;
    if (!nextTokenIs(b, ANTIALIAS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ANTIALIAS);
    p = r; // pin = 1
    r = r && BooleanEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BACKGROUNDCOLOR ColorEnum
  static boolean BackgroundcolorAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BackgroundcolorAttr")) return false;
    if (!nextTokenIs(b, BACKGROUNDCOLOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, BACKGROUNDCOLOR);
    p = r; // pin = 1
    r = r && ColorEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // true|false
  static boolean BooleanEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanEnum")) return false;
    if (!nextTokenIs(b, "", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BROWSEFORMAT string
  static boolean BrowseformatAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BrowseformatAttr")) return false;
    if (!nextTokenIs(b, BROWSEFORMAT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, BROWSEFORMAT, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BUFFER ( integer | double )
  static boolean BufferAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BufferAttr")) return false;
    if (!nextTokenIs(b, BUFFER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, BUFFER);
    p = r; // pin = 1
    r = r && BufferAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean BufferAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BufferAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CHARACTER string
  static boolean CharacterAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CharacterAttr")) return false;
    if (!nextTokenIs(b, CHARACTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, CHARACTER, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CLASS ClassObjectChildren END
  static boolean ClassObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassObject")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    r = r && ClassObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         LabelObject | LeaderObject | StyleObject | ValidationObject
  //         | DebugClassAttr | ExpressionAttr | GroupAttr | KeyimageAttr
  //         | MaxscaledenomAttr | MinscaledenomAttr | NameAttr | StatusAttr | TemplateAttr | TextAttr
  //     )*
  static boolean ClassObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ClassObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LabelObject | LeaderObject | StyleObject | ValidationObject
  //         | DebugClassAttr | ExpressionAttr | GroupAttr | KeyimageAttr
  //         | MaxscaledenomAttr | MinscaledenomAttr | NameAttr | StatusAttr | TemplateAttr | TextAttr
  private static boolean ClassObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelObject(b, l + 1);
    if (!r) r = LeaderObject(b, l + 1);
    if (!r) r = StyleObject(b, l + 1);
    if (!r) r = ValidationObject(b, l + 1);
    if (!r) r = DebugClassAttr(b, l + 1);
    if (!r) r = ExpressionAttr(b, l + 1);
    if (!r) r = GroupAttr(b, l + 1);
    if (!r) r = KeyimageAttr(b, l + 1);
    if (!r) r = MaxscaledenomAttr(b, l + 1);
    if (!r) r = MinscaledenomAttr(b, l + 1);
    if (!r) r = NameAttr(b, l + 1);
    if (!r) r = StatusAttr(b, l + 1);
    if (!r) r = TemplateAttr(b, l + 1);
    if (!r) r = TextAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASSGROUP string
  static boolean ClassgroupAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassgroupAttr")) return false;
    if (!nextTokenIs(b, CLASSGROUP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, CLASSGROUP, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CLASSITEM string
  static boolean ClassitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassitemAttr")) return false;
    if (!nextTokenIs(b, CLASSITEM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, CLASSITEM, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CLUSTER ClusterObjectChildren END
  static boolean ClusterObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClusterObject")) return false;
    if (!nextTokenIs(b, CLUSTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLUSTER);
    r = r && ClusterObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         MaxdistanceAttr | RegionAttr | BufferAttr | GroupAttr | FilterAttr | ProcessingAttr
  //     )*
  static boolean ClusterObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClusterObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ClusterObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClusterObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // MaxdistanceAttr | RegionAttr | BufferAttr | GroupAttr | FilterAttr | ProcessingAttr
  private static boolean ClusterObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClusterObjectChildren_0")) return false;
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

  /* ********************************************************** */
  // COLOR ColorEnum
  static boolean ColorAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ColorAttr")) return false;
    if (!nextTokenIs(b, COLOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COLOR);
    p = r; // pin = 1
    r = r && ColorEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // COLOR ColorClassEnum
  static boolean ColorClassAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ColorClassAttr")) return false;
    if (!nextTokenIs(b, COLOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COLOR);
    p = r; // pin = 1
    r = r && ColorClassEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ColorEnum|attributeToken
  static boolean ColorClassEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ColorClassEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ColorEnum(b, l + 1);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string | ( integer integer integer )
  static boolean ColorEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ColorEnum")) return false;
    if (!nextTokenIs(b, "", INTEGER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = ColorEnum_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer integer integer
  private static boolean ColorEnum_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ColorEnum_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INTEGER, INTEGER, INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMPOP string
  static boolean CompopAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompopAttr")) return false;
    if (!nextTokenIs(b, COMPOP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, COMPOP, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // COMPOSITE CompositeObjectChildren END
  static boolean CompositeObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompositeObject")) return false;
    if (!nextTokenIs(b, COMPOSITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPOSITE);
    r = r && CompositeObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         OpacityAttr | CompopAttr
  //     )*
  static boolean CompositeObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompositeObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CompositeObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompositeObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OpacityAttr | CompopAttr
  private static boolean CompositeObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompositeObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpacityAttr(b, l + 1);
    if (!r) r = CompopAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONFIG (
  //     ( CGI_CONTEXT_URL string )
  //     | ( MS_ENCRYPTION_KEY string )
  //     | ( MS_ERRORFILE string )
  //     | ( MS_NONSQUARE YesNoEnum )
  //     | ( ON_MISSING_DATA OnMissingDataEnum )
  //     | ( PROJ_LIB string ) )
  static boolean ConfigAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr")) return false;
    if (!nextTokenIs(b, CONFIG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, CONFIG);
    p = r; // pin = 1
    r = r && ConfigAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( CGI_CONTEXT_URL string )
  //     | ( MS_ENCRYPTION_KEY string )
  //     | ( MS_ERRORFILE string )
  //     | ( MS_NONSQUARE YesNoEnum )
  //     | ( ON_MISSING_DATA OnMissingDataEnum )
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

  // MS_NONSQUARE YesNoEnum
  private static boolean ConfigAttr_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MS_NONSQUARE);
    r = r && YesNoEnum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON_MISSING_DATA OnMissingDataEnum
  private static boolean ConfigAttr_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigAttr_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON_MISSING_DATA);
    r = r && OnMissingDataEnum(b, l + 1);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, CONNECTION, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CONNECTIONTYPE ConnectiontypeEnum
  static boolean ConnectiontypeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectiontypeAttr")) return false;
    if (!nextTokenIs(b, CONNECTIONTYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, CONNECTIONTYPE);
    p = r; // pin = 1
    r = r && ConnectiontypeEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // contour|kerneldensity|local|ogr|oraclespatial|plugin|postgis|sde|union|uvraster|wfs|wms
  static boolean ConnectiontypeEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectiontypeEnum")) return false;
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
  // CONNECTIONTYPE ConnectiontypeJoinEnum
  static boolean ConnectiontypeJoinAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectiontypeJoinAttr")) return false;
    if (!nextTokenIs(b, CONNECTIONTYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, CONNECTIONTYPE);
    p = r; // pin = 1
    r = r && ConnectiontypeJoinEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // csv|mysql|postgresql
  static boolean ConnectiontypeJoinEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectiontypeJoinEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CSV);
    if (!r) r = consumeToken(b, MYSQL);
    if (!r) r = consumeToken(b, POSTGRESQL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DATA string
  static boolean DataAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataAttr")) return false;
    if (!nextTokenIs(b, DATA)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, DATA, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DATAPATTERN string
  static boolean DatapatternAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatapatternAttr")) return false;
    if (!nextTokenIs(b, DATAPATTERN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, DATAPATTERN, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DEBUG DebugEnum
  static boolean DebugAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugAttr")) return false;
    if (!nextTokenIs(b, DEBUG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DEBUG);
    p = r; // pin = 1
    r = r && DebugEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DEBUG BooleanEnum
  static boolean DebugClassAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugClassAttr")) return false;
    if (!nextTokenIs(b, DEBUG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DEBUG);
    p = r; // pin = 1
    r = r && BooleanEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OnOffEnum|0|1|2|3|4|5
  static boolean DebugEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OnOffEnum(b, l + 1);
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
  // DEFRESOLUTION integer
  static boolean DefresolutionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefresolutionAttr")) return false;
    if (!nextTokenIs(b, DEFRESOLUTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, DEFRESOLUTION, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DUMP BooleanEnum
  static boolean DumpAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DumpAttr")) return false;
    if (!nextTokenIs(b, DUMP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DUMP);
    p = r; // pin = 1
    r = r && BooleanEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // EMPTY string
  static boolean EmptyAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmptyAttr")) return false;
    if (!nextTokenIs(b, EMPTY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, EMPTY, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ENCODING string
  static boolean EncodingAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncodingAttr")) return false;
    if (!nextTokenIs(b, ENCODING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, ENCODING, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ERROR string
  static boolean ErrorAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ErrorAttr")) return false;
    if (!nextTokenIs(b, ERROR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, ERROR, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // EXPRESSION ExpressionEnum
  static boolean ExpressionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionAttr")) return false;
    if (!nextTokenIs(b, EXPRESSION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EXPRESSION);
    p = r; // pin = 1
    r = r && ExpressionEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // string | logicalExpressionToken | regexToken | listExpressionToken
  static boolean ExpressionEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, LOGICALEXPRESSIONTOKEN);
    if (!r) r = consumeToken(b, REGEXTOKEN);
    if (!r) r = consumeToken(b, LISTEXPRESSIONTOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXTENT ( integer | double ) ( integer | double ) ( integer | double ) ( integer | double )
  static boolean ExtentAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtentAttr")) return false;
    if (!nextTokenIs(b, EXTENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EXTENT);
    p = r; // pin = 1
    r = r && report_error_(b, ExtentAttr_1(b, l + 1));
    r = p && report_error_(b, ExtentAttr_2(b, l + 1)) && r;
    r = p && report_error_(b, ExtentAttr_3(b, l + 1)) && r;
    r = p && ExtentAttr_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean ExtentAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtentAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer | double
  private static boolean ExtentAttr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtentAttr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer | double
  private static boolean ExtentAttr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtentAttr_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer | double
  private static boolean ExtentAttr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtentAttr_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FEATURE FeatureObjectChildren END
  static boolean FeatureObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FeatureObject")) return false;
    if (!nextTokenIs(b, FEATURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FEATURE);
    r = r && FeatureObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         PointsObject
  //         | ItemsAttr | TextAttr | WktAttr
  //     )*
  static boolean FeatureObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FeatureObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FeatureObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FeatureObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // PointsObject
  //         | ItemsAttr | TextAttr | WktAttr
  private static boolean FeatureObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FeatureObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PointsObject(b, l + 1);
    if (!r) r = ItemsAttr(b, l + 1);
    if (!r) r = TextAttr(b, l + 1);
    if (!r) r = WktAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FILLED BooleanEnum
  static boolean FilledAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilledAttr")) return false;
    if (!nextTokenIs(b, FILLED)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, FILLED);
    p = r; // pin = 1
    r = r && BooleanEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FILTER ExpressionEnum
  static boolean FilterAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilterAttr")) return false;
    if (!nextTokenIs(b, FILTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, FILTER);
    p = r; // pin = 1
    r = r && ExpressionEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FILTERITEM string
  static boolean FilteritemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilteritemAttr")) return false;
    if (!nextTokenIs(b, FILTERITEM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, FILTERITEM, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FONT string
  static boolean FontAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FontAttr")) return false;
    if (!nextTokenIs(b, FONT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, FONT, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FONT ( string | attributeToken )
  static boolean FontLabelAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FontLabelAttr")) return false;
    if (!nextTokenIs(b, FONT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, FONT);
    p = r; // pin = 1
    r = r && FontLabelAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // string | attributeToken
  private static boolean FontLabelAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FontLabelAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FONTSET string
  static boolean FontsetAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FontsetAttr")) return false;
    if (!nextTokenIs(b, FONTSET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, FONTSET, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FOOTER string
  static boolean FooterAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FooterAttr")) return false;
    if (!nextTokenIs(b, FOOTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, FOOTER, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FORCE BooleanEnum
  static boolean ForceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForceAttr")) return false;
    if (!nextTokenIs(b, FORCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, FORCE);
    p = r; // pin = 1
    r = r && BooleanEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FROM string
  static boolean FromAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromAttr")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, FROM, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GAP double
  static boolean GapAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GapAttr")) return false;
    if (!nextTokenIs(b, GAP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, GAP, DOUBLE);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GEOMTRANSFORM string
  static boolean GeomtransformAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GeomtransformAttr")) return false;
    if (!nextTokenIs(b, GEOMTRANSFORM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, GEOMTRANSFORM, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GEOMTRANSFORM GeomtransformClassEnum
  static boolean GeomtransformClassAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GeomtransformClassAttr")) return false;
    if (!nextTokenIs(b, GEOMTRANSFORM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, GEOMTRANSFORM);
    p = r; // pin = 1
    r = r && GeomtransformClassEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // bbox|centroid|end|labelpnt|labelpoly|start|vertices|string
  static boolean GeomtransformClassEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GeomtransformClassEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BBOX);
    if (!r) r = consumeToken(b, CENTROID);
    if (!r) r = consumeToken(b, END);
    if (!r) r = consumeToken(b, LABELPNT);
    if (!r) r = consumeToken(b, LABELPOLY);
    if (!r) r = consumeToken(b, START);
    if (!r) r = consumeToken(b, VERTICES);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GRID GridObjectChildren END
  static boolean GridObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GridObject")) return false;
    if (!nextTokenIs(b, GRID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GRID);
    r = r && GridObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         LabelformatAttr | MinarcsAttr | MaxarcsAttr | MinintervalAttr | MaxintervalAttr | MinsubdivideAttr
  //         | MaxsubdivideAttr
  //     )*
  static boolean GridObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GridObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!GridObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GridObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LabelformatAttr | MinarcsAttr | MaxarcsAttr | MinintervalAttr | MaxintervalAttr | MinsubdivideAttr
  //         | MaxsubdivideAttr
  private static boolean GridObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GridObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelformatAttr(b, l + 1);
    if (!r) r = MinarcsAttr(b, l + 1);
    if (!r) r = MaxarcsAttr(b, l + 1);
    if (!r) r = MinintervalAttr(b, l + 1);
    if (!r) r = MaxintervalAttr(b, l + 1);
    if (!r) r = MinsubdivideAttr(b, l + 1);
    if (!r) r = MaxsubdivideAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GRIDSTEP integer
  static boolean GridstepAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GridstepAttr")) return false;
    if (!nextTokenIs(b, GRIDSTEP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, GRIDSTEP, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GROUP string
  static boolean GroupAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupAttr")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, GROUP, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // HEADER string
  static boolean HeaderAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeaderAttr")) return false;
    if (!nextTokenIs(b, HEADER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, HEADER, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IMAGE string
  static boolean ImageAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImageAttr")) return false;
    if (!nextTokenIs(b, IMAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, IMAGE, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IMAGECOLOR ColorEnum
  static boolean ImagecolorAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImagecolorAttr")) return false;
    if (!nextTokenIs(b, IMAGECOLOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, IMAGECOLOR);
    p = r; // pin = 1
    r = r && ColorEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IMAGEPATH string
  static boolean ImagepathAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImagepathAttr")) return false;
    if (!nextTokenIs(b, IMAGEPATH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, IMAGEPATH, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IMAGETYPE ImagetypeEnum
  static boolean ImagetypeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImagetypeAttr")) return false;
    if (!nextTokenIs(b, IMAGETYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, IMAGETYPE);
    p = r; // pin = 1
    r = r && ImagetypeEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // png|gif|png8|jpeg|svg|pdf|gtiff|kml|kmz|cairopng|string
  static boolean ImagetypeEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImagetypeEnum")) return false;
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
  // IMAGEURL string
  static boolean ImageurlAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImageurlAttr")) return false;
    if (!nextTokenIs(b, IMAGEURL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, IMAGEURL, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // INITIALGAP integer
  static boolean InitialgapAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitialgapAttr")) return false;
    if (!nextTokenIs(b, INITIALGAP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, INITIALGAP, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // INTERLACE OnOffEnum
  static boolean InterlaceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterlaceAttr")) return false;
    if (!nextTokenIs(b, INTERLACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, INTERLACE);
    p = r; // pin = 1
    r = r && OnOffEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ITEMS string
  static boolean ItemsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ItemsAttr")) return false;
    if (!nextTokenIs(b, ITEMS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, ITEMS, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // JOIN JoinObjectChildren END
  static boolean JoinObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinObject")) return false;
    if (!nextTokenIs(b, JOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, JOIN);
    r = r && JoinObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         ConnectionAttr | ConnectiontypeJoinAttr | FooterAttr |  FromAttr | HeaderAttr | NameAttr | TableAttr
  //         | TemplateAttr | ToAttr | TypeJoinAttr
  //     )*
  static boolean JoinObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!JoinObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JoinObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ConnectionAttr | ConnectiontypeJoinAttr | FooterAttr |  FromAttr | HeaderAttr | NameAttr | TableAttr
  //         | TemplateAttr | ToAttr | TypeJoinAttr
  private static boolean JoinObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConnectionAttr(b, l + 1);
    if (!r) r = ConnectiontypeJoinAttr(b, l + 1);
    if (!r) r = FooterAttr(b, l + 1);
    if (!r) r = FromAttr(b, l + 1);
    if (!r) r = HeaderAttr(b, l + 1);
    if (!r) r = NameAttr(b, l + 1);
    if (!r) r = TableAttr(b, l + 1);
    if (!r) r = TemplateAttr(b, l + 1);
    if (!r) r = ToAttr(b, l + 1);
    if (!r) r = TypeJoinAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYIMAGE string
  static boolean KeyimageAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyimageAttr")) return false;
    if (!nextTokenIs(b, KEYIMAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, KEYIMAGE, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // KEYSIZE integer integer
  static boolean KeysizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeysizeAttr")) return false;
    if (!nextTokenIs(b, KEYSIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, KEYSIZE, INTEGER, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // KEYSPACING integer integer
  static boolean KeyspacingAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyspacingAttr")) return false;
    if (!nextTokenIs(b, KEYSPACING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, KEYSPACING, INTEGER, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // dd|ddmm|ddmmss|string
  static boolean LabelFormatEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelFormatEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DD);
    if (!r) r = consumeToken(b, DDMM);
    if (!r) r = consumeToken(b, DDMMSS);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABEL LabelObjectChildren END
  static boolean LabelObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelObject")) return false;
    if (!nextTokenIs(b, LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LABEL);
    r = r && LabelObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         StyleObject
  //         | AlignAttr | AngleLabelAttr | AntialiasAttr | BufferAttr | ColorClassEnum | ExpressionAttr | FontLabelAttr
  //         | ForceAttr | MaxlengthAttr | MaxoverlapangleAttr | MaxscaledenomAttr | MaxsizeAttr | MindistanceAttr
  //         | MinfeaturesizeAttr | MinscaledenomAttr | MinsizeAttr | OffsetAttr | OutlinecolorClassAttr | OutlinewidthAttr
  //         | PartialsAttr | PositionAttr | PriorityAttr | RepeatdistanceAttr | ShadowcolorAttr | ShadowsizeAttr
  //         | SizeLabelAttr | TextAttr | TypeLabelAttr | WrapAttr
  //     )*
  static boolean LabelObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LabelObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LabelObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // StyleObject
  //         | AlignAttr | AngleLabelAttr | AntialiasAttr | BufferAttr | ColorClassEnum | ExpressionAttr | FontLabelAttr
  //         | ForceAttr | MaxlengthAttr | MaxoverlapangleAttr | MaxscaledenomAttr | MaxsizeAttr | MindistanceAttr
  //         | MinfeaturesizeAttr | MinscaledenomAttr | MinsizeAttr | OffsetAttr | OutlinecolorClassAttr | OutlinewidthAttr
  //         | PartialsAttr | PositionAttr | PriorityAttr | RepeatdistanceAttr | ShadowcolorAttr | ShadowsizeAttr
  //         | SizeLabelAttr | TextAttr | TypeLabelAttr | WrapAttr
  private static boolean LabelObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StyleObject(b, l + 1);
    if (!r) r = AlignAttr(b, l + 1);
    if (!r) r = AngleLabelAttr(b, l + 1);
    if (!r) r = AntialiasAttr(b, l + 1);
    if (!r) r = BufferAttr(b, l + 1);
    if (!r) r = ColorClassEnum(b, l + 1);
    if (!r) r = ExpressionAttr(b, l + 1);
    if (!r) r = FontLabelAttr(b, l + 1);
    if (!r) r = ForceAttr(b, l + 1);
    if (!r) r = MaxlengthAttr(b, l + 1);
    if (!r) r = MaxoverlapangleAttr(b, l + 1);
    if (!r) r = MaxscaledenomAttr(b, l + 1);
    if (!r) r = MaxsizeAttr(b, l + 1);
    if (!r) r = MindistanceAttr(b, l + 1);
    if (!r) r = MinfeaturesizeAttr(b, l + 1);
    if (!r) r = MinscaledenomAttr(b, l + 1);
    if (!r) r = MinsizeAttr(b, l + 1);
    if (!r) r = OffsetAttr(b, l + 1);
    if (!r) r = OutlinecolorClassAttr(b, l + 1);
    if (!r) r = OutlinewidthAttr(b, l + 1);
    if (!r) r = PartialsAttr(b, l + 1);
    if (!r) r = PositionAttr(b, l + 1);
    if (!r) r = PriorityAttr(b, l + 1);
    if (!r) r = RepeatdistanceAttr(b, l + 1);
    if (!r) r = ShadowcolorAttr(b, l + 1);
    if (!r) r = ShadowsizeAttr(b, l + 1);
    if (!r) r = SizeLabelAttr(b, l + 1);
    if (!r) r = TextAttr(b, l + 1);
    if (!r) r = TypeLabelAttr(b, l + 1);
    if (!r) r = WrapAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABELCACHE OnOffEnum
  static boolean LabelcacheAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelcacheAttr")) return false;
    if (!nextTokenIs(b, LABELCACHE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LABELCACHE);
    p = r; // pin = 1
    r = r && OnOffEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LABELFORMAT LabelFormatEnum
  static boolean LabelformatAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelformatAttr")) return false;
    if (!nextTokenIs(b, LABELFORMAT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LABELFORMAT);
    p = r; // pin = 1
    r = r && LabelFormatEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LABELITEM string
  static boolean LabelitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelitemAttr")) return false;
    if (!nextTokenIs(b, LABELITEM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, LABELITEM, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LABELMAXSCALEDENOM ( integer | double )
  static boolean LabelmaxscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelmaxscaledenomAttr")) return false;
    if (!nextTokenIs(b, LABELMAXSCALEDENOM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LABELMAXSCALEDENOM);
    p = r; // pin = 1
    r = r && LabelmaxscaledenomAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean LabelmaxscaledenomAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelmaxscaledenomAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABELMINSCALEDENOM ( integer | double )
  static boolean LabelminscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelminscaledenomAttr")) return false;
    if (!nextTokenIs(b, LABELMINSCALEDENOM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LABELMINSCALEDENOM);
    p = r; // pin = 1
    r = r && LabelminscaledenomAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean LabelminscaledenomAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelminscaledenomAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABELREQUIRES string
  static boolean LabelrequiresAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelrequiresAttr")) return false;
    if (!nextTokenIs(b, LABELREQUIRES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, LABELREQUIRES, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LAYER LayerObjectChildren END
  public static boolean LayerObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerObject")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LAYER_OBJECT, "<layer object>");
    r = consumeToken(b, LAYER);
    p = r; // pin = 1
    r = r && report_error_(b, LayerObjectChildren(b, l + 1));
    r = p && consumeToken(b, END) && r;
    exit_section_(b, l, m, r, p, LayerObjectChildren_recover_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // !END (
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
  //     )*
  static boolean LayerObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerObjectChildren")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = LayerObjectChildren_0(b, l + 1);
    p = r; // pin = 1
    r = r && LayerObjectChildren_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !END
  private static boolean LayerObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

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
  //     )*
  private static boolean LayerObjectChildren_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerObjectChildren_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LayerObjectChildren_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LayerObjectChildren_1", c)) break;
      c = current_position_(b);
    }
    return true;
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
  private static boolean LayerObjectChildren_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerObjectChildren_1_0")) return false;
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

  /* ********************************************************** */
  // !(
  //         CLASS | CLUSTER | COMPOSITE | FEATURE | GRID | JOIN | METADATA
  //         | PROJECTION | VALIDATION
  //         | CLASSGROUP | CLASSITEM | CONNECTION | CONNECTIONTYPE | DATA | DEBUG | DUMP
  //         | ENCODING | EXTENT | FILTER | FOOTER | FILTERITEM | GEOMTRANSFORM | GROUP
  //         | HEADER | LABELCACHE | LABELITEM | LABELMAXSCALEDENOM | LABELMINSCALEDENOM
  //         | LABELREQUIRES | MASK | MAXFEATURES | MAXGEOWIDTH | MAXSCALEDENOM | MINGEOWIDTH
  //         | MINSCALEDENOM | NAME | PLUGIN | POSTLABELCACHE | PROCESSING | OFFSITE | SIZEUNITS
  //         | REQUIRES | STATUS | STYLEITEM | SYMBOLSCALEDENOM | TEMPLATE | TILEINDEX
  //         | TILEITEM | TILESRS | TITLE | TOLERANCEUNITS | TOLERANCE | TRANSFORM | TYPE
  //         | UNITS | UTFDATA | UTFITEM
  //         | END
  //     )
  static boolean LayerObjectChildren_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerObjectChildren_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !LayerObjectChildren_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CLASS | CLUSTER | COMPOSITE | FEATURE | GRID | JOIN | METADATA
  //         | PROJECTION | VALIDATION
  //         | CLASSGROUP | CLASSITEM | CONNECTION | CONNECTIONTYPE | DATA | DEBUG | DUMP
  //         | ENCODING | EXTENT | FILTER | FOOTER | FILTERITEM | GEOMTRANSFORM | GROUP
  //         | HEADER | LABELCACHE | LABELITEM | LABELMAXSCALEDENOM | LABELMINSCALEDENOM
  //         | LABELREQUIRES | MASK | MAXFEATURES | MAXGEOWIDTH | MAXSCALEDENOM | MINGEOWIDTH
  //         | MINSCALEDENOM | NAME | PLUGIN | POSTLABELCACHE | PROCESSING | OFFSITE | SIZEUNITS
  //         | REQUIRES | STATUS | STYLEITEM | SYMBOLSCALEDENOM | TEMPLATE | TILEINDEX
  //         | TILEITEM | TILESRS | TITLE | TOLERANCEUNITS | TOLERANCE | TRANSFORM | TYPE
  //         | UNITS | UTFDATA | UTFITEM
  //         | END
  private static boolean LayerObjectChildren_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LayerObjectChildren_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, CLUSTER);
    if (!r) r = consumeToken(b, COMPOSITE);
    if (!r) r = consumeToken(b, FEATURE);
    if (!r) r = consumeToken(b, GRID);
    if (!r) r = consumeToken(b, JOIN);
    if (!r) r = consumeToken(b, METADATA);
    if (!r) r = consumeToken(b, PROJECTION);
    if (!r) r = consumeToken(b, VALIDATION);
    if (!r) r = consumeToken(b, CLASSGROUP);
    if (!r) r = consumeToken(b, CLASSITEM);
    if (!r) r = consumeToken(b, CONNECTION);
    if (!r) r = consumeToken(b, CONNECTIONTYPE);
    if (!r) r = consumeToken(b, DATA);
    if (!r) r = consumeToken(b, DEBUG);
    if (!r) r = consumeToken(b, DUMP);
    if (!r) r = consumeToken(b, ENCODING);
    if (!r) r = consumeToken(b, EXTENT);
    if (!r) r = consumeToken(b, FILTER);
    if (!r) r = consumeToken(b, FOOTER);
    if (!r) r = consumeToken(b, FILTERITEM);
    if (!r) r = consumeToken(b, GEOMTRANSFORM);
    if (!r) r = consumeToken(b, GROUP);
    if (!r) r = consumeToken(b, HEADER);
    if (!r) r = consumeToken(b, LABELCACHE);
    if (!r) r = consumeToken(b, LABELITEM);
    if (!r) r = consumeToken(b, LABELMAXSCALEDENOM);
    if (!r) r = consumeToken(b, LABELMINSCALEDENOM);
    if (!r) r = consumeToken(b, LABELREQUIRES);
    if (!r) r = consumeToken(b, MASK);
    if (!r) r = consumeToken(b, MAXFEATURES);
    if (!r) r = consumeToken(b, MAXGEOWIDTH);
    if (!r) r = consumeToken(b, MAXSCALEDENOM);
    if (!r) r = consumeToken(b, MINGEOWIDTH);
    if (!r) r = consumeToken(b, MINSCALEDENOM);
    if (!r) r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, PLUGIN);
    if (!r) r = consumeToken(b, POSTLABELCACHE);
    if (!r) r = consumeToken(b, PROCESSING);
    if (!r) r = consumeToken(b, OFFSITE);
    if (!r) r = consumeToken(b, SIZEUNITS);
    if (!r) r = consumeToken(b, REQUIRES);
    if (!r) r = consumeToken(b, STATUS);
    if (!r) r = consumeToken(b, STYLEITEM);
    if (!r) r = consumeToken(b, SYMBOLSCALEDENOM);
    if (!r) r = consumeToken(b, TEMPLATE);
    if (!r) r = consumeToken(b, TILEINDEX);
    if (!r) r = consumeToken(b, TILEITEM);
    if (!r) r = consumeToken(b, TILESRS);
    if (!r) r = consumeToken(b, TITLE);
    if (!r) r = consumeToken(b, TOLERANCEUNITS);
    if (!r) r = consumeToken(b, TOLERANCE);
    if (!r) r = consumeToken(b, TRANSFORM);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, UNITS);
    if (!r) r = consumeToken(b, UTFDATA);
    if (!r) r = consumeToken(b, UTFITEM);
    if (!r) r = consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEADER LeaderObjectChildren END
  static boolean LeaderObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeaderObject")) return false;
    if (!nextTokenIs(b, LEADER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEADER);
    r = r && LeaderObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         StyleObject
  //         | GridstepAttr | MaxdistanceAttr
  //     )*
  static boolean LeaderObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeaderObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LeaderObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LeaderObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // StyleObject
  //         | GridstepAttr | MaxdistanceAttr
  private static boolean LeaderObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeaderObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StyleObject(b, l + 1);
    if (!r) r = GridstepAttr(b, l + 1);
    if (!r) r = MaxdistanceAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEGEND LegendObjectChildren END
  static boolean LegendObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LegendObject")) return false;
    if (!nextTokenIs(b, LEGEND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEGEND);
    r = r && LegendObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         LabelObject
  //         | ImagecolorAttr | InterlaceAttr | KeysizeAttr | KeyspacingAttr | OutlinecolorAttr | PositionAttr
  //         | PostlabelcacheAttr | StatusAttr | TemplateAttr
  //     )*
  static boolean LegendObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LegendObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LegendObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LegendObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LabelObject
  //         | ImagecolorAttr | InterlaceAttr | KeysizeAttr | KeyspacingAttr | OutlinecolorAttr | PositionAttr
  //         | PostlabelcacheAttr | StatusAttr | TemplateAttr
  private static boolean LegendObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LegendObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelObject(b, l + 1);
    if (!r) r = ImagecolorAttr(b, l + 1);
    if (!r) r = InterlaceAttr(b, l + 1);
    if (!r) r = KeysizeAttr(b, l + 1);
    if (!r) r = KeyspacingAttr(b, l + 1);
    if (!r) r = OutlinecolorAttr(b, l + 1);
    if (!r) r = PositionAttr(b, l + 1);
    if (!r) r = PostlabelcacheAttr(b, l + 1);
    if (!r) r = StatusAttr(b, l + 1);
    if (!r) r = TemplateAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEGENDFORMAT string
  static boolean LegendformatAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LegendformatAttr")) return false;
    if (!nextTokenIs(b, LEGENDFORMAT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, LEGENDFORMAT, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LINECAP LinecapEnum
  static boolean LinecapAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinecapAttr")) return false;
    if (!nextTokenIs(b, LINECAP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LINECAP);
    p = r; // pin = 1
    r = r && LinecapEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // butt|round|square
  static boolean LinecapEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinecapEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BUTT);
    if (!r) r = consumeToken(b, ROUND);
    if (!r) r = consumeToken(b, SQUARE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LINEJOIN LinejoinEnum
  static boolean LinejoinAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinejoinAttr")) return false;
    if (!nextTokenIs(b, LINEJOIN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LINEJOIN);
    p = r; // pin = 1
    r = r && LinejoinEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // round|miter|bevel|none
  static boolean LinejoinEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinejoinEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ROUND);
    if (!r) r = consumeToken(b, MITER);
    if (!r) r = consumeToken(b, BEVEL);
    if (!r) r = consumeToken(b, NONE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LINEJOINMAXSIZE integer
  static boolean LinejoinmaxsizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinejoinmaxsizeAttr")) return false;
    if (!nextTokenIs(b, LINEJOINMAXSIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, LINEJOINMAXSIZE, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MAP MapObjectChildren END
  public static boolean MapObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObject")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAP_OBJECT, "<map object>");
    r = consumeToken(b, MAP);
    p = r; // pin = 1
    r = r && report_error_(b, MapObjectChildren(b, l + 1));
    r = p && consumeToken(b, END) && r;
    exit_section_(b, l, m, r, p, MapObjectChildren_recover_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // !END (
  //         LayerObject | LegendObject | ProjectionObject | QuerymapObject | ReferenceObject | ScalebarObject
  //         | SymbolObject | WebObject
  //         | AngleAttr | ConfigAttr | DatapatternAttr | DebugAttr | DefresolutionAttr | ExtentAttr | FontsetAttr
  //         | ImagecolorAttr | ImagetypeAttr | InterlaceAttr | MaxsizeAttr | NameAttr | ResolutionAttr
  //         | ScaledenomAttr | ShapepathAttr | SizeAttr | StatusAttr | SymbolsetAttr | TemplatepatternAttr | UnitsAttr
  //     )*
  static boolean MapObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObjectChildren")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = MapObjectChildren_0(b, l + 1);
    p = r; // pin = 1
    r = r && MapObjectChildren_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !END
  private static boolean MapObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //         LayerObject | LegendObject | ProjectionObject | QuerymapObject | ReferenceObject | ScalebarObject
  //         | SymbolObject | WebObject
  //         | AngleAttr | ConfigAttr | DatapatternAttr | DebugAttr | DefresolutionAttr | ExtentAttr | FontsetAttr
  //         | ImagecolorAttr | ImagetypeAttr | InterlaceAttr | MaxsizeAttr | NameAttr | ResolutionAttr
  //         | ScaledenomAttr | ShapepathAttr | SizeAttr | StatusAttr | SymbolsetAttr | TemplatepatternAttr | UnitsAttr
  //     )*
  private static boolean MapObjectChildren_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObjectChildren_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MapObjectChildren_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapObjectChildren_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LayerObject | LegendObject | ProjectionObject | QuerymapObject | ReferenceObject | ScalebarObject
  //         | SymbolObject | WebObject
  //         | AngleAttr | ConfigAttr | DatapatternAttr | DebugAttr | DefresolutionAttr | ExtentAttr | FontsetAttr
  //         | ImagecolorAttr | ImagetypeAttr | InterlaceAttr | MaxsizeAttr | NameAttr | ResolutionAttr
  //         | ScaledenomAttr | ShapepathAttr | SizeAttr | StatusAttr | SymbolsetAttr | TemplatepatternAttr | UnitsAttr
  private static boolean MapObjectChildren_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObjectChildren_1_0")) return false;
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

  /* ********************************************************** */
  // !(
  //         LAYER | LEGEND | PROJECTION | QUERYMAP | REFERENCE | SCALEBAR
  //         | SYMBOL | WEB
  //         | ANGLE | CONFIG | DATAPATTERN | DEBUG | DEFRESOLUTION | EXTENT | FONTSET
  //         | IMAGECOLOR | IMAGETYPE | INTERLACE | MAXSIZE | NAME | RESOLUTION
  //         | SCALEDENOM | SHAPEPATH | SIZE | STATUS | SYMBOLSET | TEMPLATEPATTERN | UNITS
  //         | END
  //     )
  static boolean MapObjectChildren_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObjectChildren_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !MapObjectChildren_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LAYER | LEGEND | PROJECTION | QUERYMAP | REFERENCE | SCALEBAR
  //         | SYMBOL | WEB
  //         | ANGLE | CONFIG | DATAPATTERN | DEBUG | DEFRESOLUTION | EXTENT | FONTSET
  //         | IMAGECOLOR | IMAGETYPE | INTERLACE | MAXSIZE | NAME | RESOLUTION
  //         | SCALEDENOM | SHAPEPATH | SIZE | STATUS | SYMBOLSET | TEMPLATEPATTERN | UNITS
  //         | END
  private static boolean MapObjectChildren_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapObjectChildren_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LAYER);
    if (!r) r = consumeToken(b, LEGEND);
    if (!r) r = consumeToken(b, PROJECTION);
    if (!r) r = consumeToken(b, QUERYMAP);
    if (!r) r = consumeToken(b, REFERENCE);
    if (!r) r = consumeToken(b, SCALEBAR);
    if (!r) r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, WEB);
    if (!r) r = consumeToken(b, ANGLE);
    if (!r) r = consumeToken(b, CONFIG);
    if (!r) r = consumeToken(b, DATAPATTERN);
    if (!r) r = consumeToken(b, DEBUG);
    if (!r) r = consumeToken(b, DEFRESOLUTION);
    if (!r) r = consumeToken(b, EXTENT);
    if (!r) r = consumeToken(b, FONTSET);
    if (!r) r = consumeToken(b, IMAGECOLOR);
    if (!r) r = consumeToken(b, IMAGETYPE);
    if (!r) r = consumeToken(b, INTERLACE);
    if (!r) r = consumeToken(b, MAXSIZE);
    if (!r) r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, RESOLUTION);
    if (!r) r = consumeToken(b, SCALEDENOM);
    if (!r) r = consumeToken(b, SHAPEPATH);
    if (!r) r = consumeToken(b, SIZE);
    if (!r) r = consumeToken(b, STATUS);
    if (!r) r = consumeToken(b, SYMBOLSET);
    if (!r) r = consumeToken(b, TEMPLATEPATTERN);
    if (!r) r = consumeToken(b, UNITS);
    if (!r) r = consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MARKER ( integer | string)
  static boolean MarkerAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MarkerAttr")) return false;
    if (!nextTokenIs(b, MARKER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MARKER);
    p = r; // pin = 1
    r = r && MarkerAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | string
  private static boolean MarkerAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MarkerAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MARKERSIZE integer
  static boolean MarkersizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MarkersizeAttr")) return false;
    if (!nextTokenIs(b, MARKERSIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MARKERSIZE, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MASK string
  static boolean MaskAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaskAttr")) return false;
    if (!nextTokenIs(b, MASK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MASK, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MAXARCS double
  static boolean MaxarcsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxarcsAttr")) return false;
    if (!nextTokenIs(b, MAXARCS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MAXARCS, DOUBLE);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MAXBOXSIZE integer
  static boolean MaxboxsizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxboxsizeAttr")) return false;
    if (!nextTokenIs(b, MAXBOXSIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MAXBOXSIZE, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MAXDISTANCE ( integer | double )
  static boolean MaxdistanceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxdistanceAttr")) return false;
    if (!nextTokenIs(b, MAXDISTANCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MAXDISTANCE);
    p = r; // pin = 1
    r = r && MaxdistanceAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MaxdistanceAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxdistanceAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXFEATURES integer
  static boolean MaxfeaturesAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxfeaturesAttr")) return false;
    if (!nextTokenIs(b, MAXFEATURES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MAXFEATURES, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MAXGEOWIDTH ( integer | double )
  static boolean MaxgeowidthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxgeowidthAttr")) return false;
    if (!nextTokenIs(b, MAXGEOWIDTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MAXGEOWIDTH);
    p = r; // pin = 1
    r = r && MaxgeowidthAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MaxgeowidthAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxgeowidthAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXINTERVAL ( integer | double )
  static boolean MaxintervalAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxintervalAttr")) return false;
    if (!nextTokenIs(b, MAXINTERVAL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MAXINTERVAL);
    p = r; // pin = 1
    r = r && MaxintervalAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MaxintervalAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxintervalAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXLENGTH integer
  static boolean MaxlengthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxlengthAttr")) return false;
    if (!nextTokenIs(b, MAXLENGTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MAXLENGTH, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MAXOVERLAPANGLE ( integer | double )
  static boolean MaxoverlapangleAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxoverlapangleAttr")) return false;
    if (!nextTokenIs(b, MAXOVERLAPANGLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MAXOVERLAPANGLE);
    p = r; // pin = 1
    r = r && MaxoverlapangleAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MaxoverlapangleAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxoverlapangleAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXSCALEDENOM ( integer | double )
  static boolean MaxscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxscaledenomAttr")) return false;
    if (!nextTokenIs(b, MAXSCALEDENOM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MAXSCALEDENOM);
    p = r; // pin = 1
    r = r && MaxscaledenomAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MaxscaledenomAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxscaledenomAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXSIZE integer
  static boolean MaxsizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxsizeAttr")) return false;
    if (!nextTokenIs(b, MAXSIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MAXSIZE, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MAXSUBDIVIDE ( integer | double )
  static boolean MaxsubdivideAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxsubdivideAttr")) return false;
    if (!nextTokenIs(b, MAXSUBDIVIDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MAXSUBDIVIDE);
    p = r; // pin = 1
    r = r && MaxsubdivideAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MaxsubdivideAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxsubdivideAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXTEMPLATE string
  static boolean MaxtemplateAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxtemplateAttr")) return false;
    if (!nextTokenIs(b, MAXTEMPLATE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MAXTEMPLATE, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MAXWIDTH ( integer | double )
  static boolean MaxwidthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxwidthAttr")) return false;
    if (!nextTokenIs(b, MAXWIDTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MAXWIDTH);
    p = r; // pin = 1
    r = r && MaxwidthAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MaxwidthAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxwidthAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // METADATA ( string string )* END
  static boolean MetadataObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetadataObject")) return false;
    if (!nextTokenIs(b, METADATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METADATA);
    r = r && MetadataObject_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( string string )*
  private static boolean MetadataObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetadataObject_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MetadataObject_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MetadataObject_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // string string
  private static boolean MetadataObject_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetadataObject_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINARCS ( integer | double )
  static boolean MinarcsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinarcsAttr")) return false;
    if (!nextTokenIs(b, MINARCS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MINARCS);
    p = r; // pin = 1
    r = r && MinarcsAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MinarcsAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinarcsAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINBOXSIZE integer
  static boolean MinboxsizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinboxsizeAttr")) return false;
    if (!nextTokenIs(b, MINBOXSIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MINBOXSIZE, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MINDISTANCE ( integer | double )
  static boolean MindistanceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MindistanceAttr")) return false;
    if (!nextTokenIs(b, MINDISTANCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MINDISTANCE);
    p = r; // pin = 1
    r = r && MindistanceAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MindistanceAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MindistanceAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINFEATURESIZE MinfeaturesizeEnum
  static boolean MinfeaturesizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinfeaturesizeAttr")) return false;
    if (!nextTokenIs(b, MINFEATURESIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MINFEATURESIZE);
    p = r; // pin = 1
    r = r && MinfeaturesizeEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // integer|auto
  static boolean MinfeaturesizeEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinfeaturesizeEnum")) return false;
    if (!nextTokenIs(b, "", AUTO, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, AUTO);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINGEOWIDTH ( integer | double )
  static boolean MingeowidthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MingeowidthAttr")) return false;
    if (!nextTokenIs(b, MINGEOWIDTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MINGEOWIDTH);
    p = r; // pin = 1
    r = r && MingeowidthAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MingeowidthAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MingeowidthAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MININTERVAL ( integer | double )
  static boolean MinintervalAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinintervalAttr")) return false;
    if (!nextTokenIs(b, MININTERVAL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MININTERVAL);
    p = r; // pin = 1
    r = r && MinintervalAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MinintervalAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinintervalAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINSCALEDENOM ( integer | double )
  static boolean MinscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinscaledenomAttr")) return false;
    if (!nextTokenIs(b, MINSCALEDENOM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MINSCALEDENOM);
    p = r; // pin = 1
    r = r && MinscaledenomAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MinscaledenomAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinscaledenomAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINSIZE integer
  static boolean MinsizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinsizeAttr")) return false;
    if (!nextTokenIs(b, MINSIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MINSIZE, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MINSUBDIVIDE ( integer | double )
  static boolean MinsubdivideAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinsubdivideAttr")) return false;
    if (!nextTokenIs(b, MINSUBDIVIDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MINSUBDIVIDE);
    p = r; // pin = 1
    r = r && MinsubdivideAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MinsubdivideAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinsubdivideAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINTEMPLATE string
  static boolean MintemplateAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MintemplateAttr")) return false;
    if (!nextTokenIs(b, MINTEMPLATE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, MINTEMPLATE, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MINWIDTH ( integer | double )
  static boolean MinwidthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinwidthAttr")) return false;
    if (!nextTokenIs(b, MINWIDTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MINWIDTH);
    p = r; // pin = 1
    r = r && MinwidthAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean MinwidthAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinwidthAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME string
  public static boolean NameAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameAttr")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NAME_ATTR, null);
    r = consumeTokens(b, 1, NAME, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OFFSET ( integer | double ) ( integer | double )
  static boolean OffsetAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsetAttr")) return false;
    if (!nextTokenIs(b, OFFSET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OFFSET);
    p = r; // pin = 1
    r = r && report_error_(b, OffsetAttr_1(b, l + 1));
    r = p && OffsetAttr_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean OffsetAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsetAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer | double
  private static boolean OffsetAttr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsetAttr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OFFSITE ColorEnum
  static boolean OffsiteAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsiteAttr")) return false;
    if (!nextTokenIs(b, OFFSITE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OFFSITE);
    p = r; // pin = 1
    r = r && ColorEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // fail|log|ignore
  static boolean OnMissingDataEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OnMissingDataEnum")) return false;
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
  static boolean OnOffEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OnOffEnum")) return false;
    if (!nextTokenIs(b, "", OFF, ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    if (!r) r = consumeToken(b, OFF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPACITY integer
  static boolean OpacityAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpacityAttr")) return false;
    if (!nextTokenIs(b, OPACITY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, OPACITY, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OPACITY ( integer | attributeToken )
  static boolean OpacityClassAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpacityClassAttr")) return false;
    if (!nextTokenIs(b, OPACITY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OPACITY);
    p = r; // pin = 1
    r = r && OpacityClassAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | attributeToken
  private static boolean OpacityClassAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpacityClassAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OUTLINECOLOR ColorEnum
  static boolean OutlinecolorAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutlinecolorAttr")) return false;
    if (!nextTokenIs(b, OUTLINECOLOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OUTLINECOLOR);
    p = r; // pin = 1
    r = r && ColorEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OUTLINECOLOR ColorClassEnum
  static boolean OutlinecolorClassAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutlinecolorClassAttr")) return false;
    if (!nextTokenIs(b, OUTLINECOLOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OUTLINECOLOR);
    p = r; // pin = 1
    r = r && ColorClassEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OUTLINEWIDTH ( double | attributeToken )
  static boolean OutlinewidthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutlinewidthAttr")) return false;
    if (!nextTokenIs(b, OUTLINEWIDTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OUTLINEWIDTH);
    p = r; // pin = 1
    r = r && OutlinewidthAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // double | attributeToken
  private static boolean OutlinewidthAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutlinewidthAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PARTIALS BooleanEnum
  static boolean PartialsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PartialsAttr")) return false;
    if (!nextTokenIs(b, PARTIALS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, PARTIALS);
    p = r; // pin = 1
    r = r && BooleanEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PATTERN ( integer integer )* END
  static boolean PatternObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternObject")) return false;
    if (!nextTokenIs(b, PATTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PATTERN);
    r = r && PatternObject_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( integer integer )*
  private static boolean PatternObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternObject_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PatternObject_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PatternObject_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // integer integer
  private static boolean PatternObject_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternObject_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INTEGER, INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PLUGIN string
  static boolean PluginAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PluginAttr")) return false;
    if (!nextTokenIs(b, PLUGIN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, PLUGIN, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // POINTS ( double double )* END
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

  // ( double double )*
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

  // double double
  private static boolean PointsObject_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PointsObject_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOUBLE, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // POLAROFFSET ( ( double | attributeToken ) ( double | attributeToken ) )
  static boolean PolaroffsetAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PolaroffsetAttr")) return false;
    if (!nextTokenIs(b, POLAROFFSET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, POLAROFFSET);
    p = r; // pin = 1
    r = r && PolaroffsetAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( double | attributeToken ) ( double | attributeToken )
  private static boolean PolaroffsetAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PolaroffsetAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PolaroffsetAttr_1_0(b, l + 1);
    r = r && PolaroffsetAttr_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // double | attributeToken
  private static boolean PolaroffsetAttr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PolaroffsetAttr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // double | attributeToken
  private static boolean PolaroffsetAttr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PolaroffsetAttr_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // POSITION PositionEnum
  static boolean PositionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PositionAttr")) return false;
    if (!nextTokenIs(b, POSITION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, POSITION);
    p = r; // pin = 1
    r = r && PositionEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ul|uc|ur|cl|cc|cr|ll|lc|lr
  static boolean PositionEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PositionEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UL);
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
  // POSTLABELCACHE BooleanEnum
  static boolean PostlabelcacheAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostlabelcacheAttr")) return false;
    if (!nextTokenIs(b, POSTLABELCACHE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, POSTLABELCACHE);
    p = r; // pin = 1
    r = r && BooleanEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PRIORITY ( integer | string | attributeToken )
  static boolean PriorityAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PriorityAttr")) return false;
    if (!nextTokenIs(b, PRIORITY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, PRIORITY);
    p = r; // pin = 1
    r = r && PriorityAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | string | attributeToken
  private static boolean PriorityAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PriorityAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PROCESSING string
  static boolean ProcessingAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcessingAttr")) return false;
    if (!nextTokenIs(b, PROCESSING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, PROCESSING, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PROJECTION string* END
  static boolean ProjectionObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProjectionObject")) return false;
    if (!nextTokenIs(b, PROJECTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROJECTION);
    r = r && ProjectionObject_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // string*
  private static boolean ProjectionObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProjectionObject_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STRING)) break;
      if (!empty_element_parsed_guard_(b, "ProjectionObject_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // QUERYFORMAT string
  static boolean QueryformatAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryformatAttr")) return false;
    if (!nextTokenIs(b, QUERYFORMAT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, QUERYFORMAT, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // QUERYMAP QuerymapObjectChildren END
  static boolean QuerymapObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuerymapObject")) return false;
    if (!nextTokenIs(b, QUERYMAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUERYMAP);
    r = r && QuerymapObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         ColorAttr | SizeAttr | StatusAttr | StyleQuerymapAttr
  //     )*
  static boolean QuerymapObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuerymapObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!QuerymapObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QuerymapObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ColorAttr | SizeAttr | StatusAttr | StyleQuerymapAttr
  private static boolean QuerymapObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuerymapObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ColorAttr(b, l + 1);
    if (!r) r = SizeAttr(b, l + 1);
    if (!r) r = StatusAttr(b, l + 1);
    if (!r) r = StyleQuerymapAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REFERENCE ReferenceObjectChildren END
  static boolean ReferenceObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceObject")) return false;
    if (!nextTokenIs(b, REFERENCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REFERENCE);
    r = r && ReferenceObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         ColorAttr | ExtentAttr | ImageAttr | MarkerAttr | MarkersizeAttr | MinboxsizeAttr | MaxboxsizeAttr
  //         | OutlinecolorAttr | SizeAttr | StatusAttr
  //     )*
  static boolean ReferenceObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ReferenceObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReferenceObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ColorAttr | ExtentAttr | ImageAttr | MarkerAttr | MarkersizeAttr | MinboxsizeAttr | MaxboxsizeAttr
  //         | OutlinecolorAttr | SizeAttr | StatusAttr
  private static boolean ReferenceObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ColorAttr(b, l + 1);
    if (!r) r = ExtentAttr(b, l + 1);
    if (!r) r = ImageAttr(b, l + 1);
    if (!r) r = MarkerAttr(b, l + 1);
    if (!r) r = MarkersizeAttr(b, l + 1);
    if (!r) r = MinboxsizeAttr(b, l + 1);
    if (!r) r = MaxboxsizeAttr(b, l + 1);
    if (!r) r = OutlinecolorAttr(b, l + 1);
    if (!r) r = SizeAttr(b, l + 1);
    if (!r) r = StatusAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REGION string
  static boolean RegionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegionAttr")) return false;
    if (!nextTokenIs(b, REGION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, REGION, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // REPEATDISTANCE integer
  static boolean RepeatdistanceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RepeatdistanceAttr")) return false;
    if (!nextTokenIs(b, REPEATDISTANCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, REPEATDISTANCE, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // REQUIRES string
  static boolean RequiresAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequiresAttr")) return false;
    if (!nextTokenIs(b, REQUIRES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, REQUIRES, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // RESOLUTION integer
  static boolean ResolutionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResolutionAttr")) return false;
    if (!nextTokenIs(b, RESOLUTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, RESOLUTION, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // SCALEBAR ScalebarObjectChildren END
  static boolean ScalebarObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScalebarObject")) return false;
    if (!nextTokenIs(b, SCALEBAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCALEBAR);
    r = r && ScalebarObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         LabelObject
  //         | AlignAttr | BackgroundcolorAttr | ColorAttr | ImagecolorAttr | InterlaceAttr | OutlinecolorAttr | PositionAttr
  //         | PostlabelcacheAttr | SizeAttr | StatusAttr | StyleScalebarAttr | UnitsAttr
  //     )*
  static boolean ScalebarObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScalebarObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ScalebarObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ScalebarObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LabelObject
  //         | AlignAttr | BackgroundcolorAttr | ColorAttr | ImagecolorAttr | InterlaceAttr | OutlinecolorAttr | PositionAttr
  //         | PostlabelcacheAttr | SizeAttr | StatusAttr | StyleScalebarAttr | UnitsAttr
  private static boolean ScalebarObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScalebarObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelObject(b, l + 1);
    if (!r) r = AlignAttr(b, l + 1);
    if (!r) r = BackgroundcolorAttr(b, l + 1);
    if (!r) r = ColorAttr(b, l + 1);
    if (!r) r = ImagecolorAttr(b, l + 1);
    if (!r) r = InterlaceAttr(b, l + 1);
    if (!r) r = OutlinecolorAttr(b, l + 1);
    if (!r) r = PositionAttr(b, l + 1);
    if (!r) r = PostlabelcacheAttr(b, l + 1);
    if (!r) r = SizeAttr(b, l + 1);
    if (!r) r = StatusAttr(b, l + 1);
    if (!r) r = StyleScalebarAttr(b, l + 1);
    if (!r) r = UnitsAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SCALEDENOM ( integer | double )
  static boolean ScaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScaledenomAttr")) return false;
    if (!nextTokenIs(b, SCALEDENOM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, SCALEDENOM);
    p = r; // pin = 1
    r = r && ScaledenomAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean ScaledenomAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScaledenomAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SHADOWCOLOR ColorEnum
  static boolean ShadowcolorAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShadowcolorAttr")) return false;
    if (!nextTokenIs(b, SHADOWCOLOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, SHADOWCOLOR);
    p = r; // pin = 1
    r = r && ColorEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // SHADOWSIZE ( ( integer | attributeToken ) ( integer | attributeToken ) )
  static boolean ShadowsizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShadowsizeAttr")) return false;
    if (!nextTokenIs(b, SHADOWSIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, SHADOWSIZE);
    p = r; // pin = 1
    r = r && ShadowsizeAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( integer | attributeToken ) ( integer | attributeToken )
  private static boolean ShadowsizeAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShadowsizeAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShadowsizeAttr_1_0(b, l + 1);
    r = r && ShadowsizeAttr_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer | attributeToken
  private static boolean ShadowsizeAttr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShadowsizeAttr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer | attributeToken
  private static boolean ShadowsizeAttr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShadowsizeAttr_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SHAPEPATH string
  static boolean ShapepathAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapepathAttr")) return false;
    if (!nextTokenIs(b, SHAPEPATH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, SHAPEPATH, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // SIZE integer integer
  static boolean SizeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeAttr")) return false;
    if (!nextTokenIs(b, SIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, SIZE, INTEGER, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // SIZE ( double | attributeToken )
  static boolean SizeClassAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeClassAttr")) return false;
    if (!nextTokenIs(b, SIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, SIZE);
    p = r; // pin = 1
    r = r && SizeClassAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // double | attributeToken
  private static boolean SizeClassAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeClassAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SIZE SizeLabelEnum
  static boolean SizeLabelAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeLabelAttr")) return false;
    if (!nextTokenIs(b, SIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, SIZE);
    p = r; // pin = 1
    r = r && SizeLabelEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // integer|tiny|small|medium|large|giant|attributeToken
  static boolean SizeLabelEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeLabelEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, TINY);
    if (!r) r = consumeToken(b, SMALL);
    if (!r) r = consumeToken(b, MEDIUM);
    if (!r) r = consumeToken(b, LARGE);
    if (!r) r = consumeToken(b, GIANT);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // feet|inches|kilometers|meters|miles|nauticalmiles|pixels
  static boolean SizeUnitEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeUnitEnum")) return false;
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
  // SIZEUNITS SizeUnitEnum
  static boolean SizeunitsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeunitsAttr")) return false;
    if (!nextTokenIs(b, SIZEUNITS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, SIZEUNITS);
    p = r; // pin = 1
    r = r && SizeUnitEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // STATUS StatusEnum
  public static boolean StatusAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatusAttr")) return false;
    if (!nextTokenIs(b, STATUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATUS_ATTR, null);
    r = consumeToken(b, STATUS);
    p = r; // pin = 1
    r = r && StatusEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OnOffEnum|default
  static boolean StatusEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatusEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OnOffEnum(b, l + 1);
    if (!r) r = consumeToken(b, DEFAULT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STYLE StyleObjectChildren END
  static boolean StyleObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleObject")) return false;
    if (!nextTokenIs(b, STYLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STYLE);
    r = r && StyleObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         PatternObject
  //         | AngleClassAttr | AntialiasAttr | ColorClassAttr | GapAttr | GeomtransformClassAttr | InitialgapAttr
  //         | LinecapAttr | LinejoinAttr | LinejoinmaxsizeAttr | MaxscaledenomAttr | MaxsizeAttr | MaxwidthAttr
  //         | MinscaledenomAttr | MinsizeAttr | MinwidthAttr | OffsetAttr | OpacityClassAttr | OutlinecolorClassAttr
  //         | OutlinewidthAttr | PolaroffsetAttr | SizeClassAttr | SymbolClassAttr | WidthClassAttr
  //     )*
  static boolean StyleObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StyleObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StyleObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // PatternObject
  //         | AngleClassAttr | AntialiasAttr | ColorClassAttr | GapAttr | GeomtransformClassAttr | InitialgapAttr
  //         | LinecapAttr | LinejoinAttr | LinejoinmaxsizeAttr | MaxscaledenomAttr | MaxsizeAttr | MaxwidthAttr
  //         | MinscaledenomAttr | MinsizeAttr | MinwidthAttr | OffsetAttr | OpacityClassAttr | OutlinecolorClassAttr
  //         | OutlinewidthAttr | PolaroffsetAttr | SizeClassAttr | SymbolClassAttr | WidthClassAttr
  private static boolean StyleObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatternObject(b, l + 1);
    if (!r) r = AngleClassAttr(b, l + 1);
    if (!r) r = AntialiasAttr(b, l + 1);
    if (!r) r = ColorClassAttr(b, l + 1);
    if (!r) r = GapAttr(b, l + 1);
    if (!r) r = GeomtransformClassAttr(b, l + 1);
    if (!r) r = InitialgapAttr(b, l + 1);
    if (!r) r = LinecapAttr(b, l + 1);
    if (!r) r = LinejoinAttr(b, l + 1);
    if (!r) r = LinejoinmaxsizeAttr(b, l + 1);
    if (!r) r = MaxscaledenomAttr(b, l + 1);
    if (!r) r = MaxsizeAttr(b, l + 1);
    if (!r) r = MaxwidthAttr(b, l + 1);
    if (!r) r = MinscaledenomAttr(b, l + 1);
    if (!r) r = MinsizeAttr(b, l + 1);
    if (!r) r = MinwidthAttr(b, l + 1);
    if (!r) r = OffsetAttr(b, l + 1);
    if (!r) r = OpacityClassAttr(b, l + 1);
    if (!r) r = OutlinecolorClassAttr(b, l + 1);
    if (!r) r = OutlinewidthAttr(b, l + 1);
    if (!r) r = PolaroffsetAttr(b, l + 1);
    if (!r) r = SizeClassAttr(b, l + 1);
    if (!r) r = SymbolClassAttr(b, l + 1);
    if (!r) r = WidthClassAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STYLE StyleQuerymapEnum
  static boolean StyleQuerymapAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleQuerymapAttr")) return false;
    if (!nextTokenIs(b, STYLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, STYLE);
    p = r; // pin = 1
    r = r && StyleQuerymapEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // normal|hilite|selected
  static boolean StyleQuerymapEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleQuerymapEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NORMAL);
    if (!r) r = consumeToken(b, HILITE);
    if (!r) r = consumeToken(b, SELECTED);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STYLE ( 0 | 1)
  static boolean StyleScalebarAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleScalebarAttr")) return false;
    if (!nextTokenIs(b, STYLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, STYLE);
    p = r; // pin = 1
    r = r && StyleScalebarAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 0 | 1
  private static boolean StyleScalebarAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleScalebarAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "0");
    if (!r) r = consumeToken(b, "1");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STYLEITEM string
  static boolean StyleitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleitemAttr")) return false;
    if (!nextTokenIs(b, STYLEITEM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, STYLEITEM, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // SYMBOL (integer | string | attributeToken)
  static boolean SymbolClassAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolClassAttr")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, SYMBOL);
    p = r; // pin = 1
    r = r && SymbolClassAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | string | attributeToken
  private static boolean SymbolClassAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolClassAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL SymbolObjectChildren END
  static boolean SymbolObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolObject")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && SymbolObjectChildren(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //         PointsObject
  //         | AnchorpointAttr | AntialiasAttr | CharacterAttr | FilledAttr | FontAttr | ImageAttr | NameAttr
  //         | TransparentAttr | TypeSymbolAttr
  //     )*
  static boolean SymbolObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolObjectChildren")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SymbolObjectChildren_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SymbolObjectChildren", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // PointsObject
  //         | AnchorpointAttr | AntialiasAttr | CharacterAttr | FilledAttr | FontAttr | ImageAttr | NameAttr
  //         | TransparentAttr | TypeSymbolAttr
  private static boolean SymbolObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PointsObject(b, l + 1);
    if (!r) r = AnchorpointAttr(b, l + 1);
    if (!r) r = AntialiasAttr(b, l + 1);
    if (!r) r = CharacterAttr(b, l + 1);
    if (!r) r = FilledAttr(b, l + 1);
    if (!r) r = FontAttr(b, l + 1);
    if (!r) r = ImageAttr(b, l + 1);
    if (!r) r = NameAttr(b, l + 1);
    if (!r) r = TransparentAttr(b, l + 1);
    if (!r) r = TypeSymbolAttr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOLSCALEDENOM double
  static boolean SymbolscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolscaledenomAttr")) return false;
    if (!nextTokenIs(b, SYMBOLSCALEDENOM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, SYMBOLSCALEDENOM, DOUBLE);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // SYMBOLSET string
  static boolean SymbolsetAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolsetAttr")) return false;
    if (!nextTokenIs(b, SYMBOLSET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, SYMBOLSET, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TABLE string
  static boolean TableAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableAttr")) return false;
    if (!nextTokenIs(b, TABLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TABLE, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATE string
  static boolean TemplateAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAttr")) return false;
    if (!nextTokenIs(b, TEMPLATE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TEMPLATE, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATEPATTERN string
  static boolean TemplatepatternAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplatepatternAttr")) return false;
    if (!nextTokenIs(b, TEMPLATEPATTERN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TEMPLATEPATTERN, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPPATH string
  static boolean TemppathAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemppathAttr")) return false;
    if (!nextTokenIs(b, TEMPPATH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TEMPPATH, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEXT string
  static boolean TextAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TextAttr")) return false;
    if (!nextTokenIs(b, TEXT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TEXT, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TILEINDEX string
  static boolean TileindexAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TileindexAttr")) return false;
    if (!nextTokenIs(b, TILEINDEX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TILEINDEX, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TILEITEM string
  static boolean TileitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TileitemAttr")) return false;
    if (!nextTokenIs(b, TILEITEM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TILEITEM, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TILESRS string
  static boolean TilesrsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TilesrsAttr")) return false;
    if (!nextTokenIs(b, TILESRS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TILESRS, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TITLE string
  static boolean TitleAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TitleAttr")) return false;
    if (!nextTokenIs(b, TITLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TITLE, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TO string
  static boolean ToAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToAttr")) return false;
    if (!nextTokenIs(b, TO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TO, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TOLERANCE ( integer | double )
  static boolean ToleranceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToleranceAttr")) return false;
    if (!nextTokenIs(b, TOLERANCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, TOLERANCE);
    p = r; // pin = 1
    r = r && ToleranceAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // integer | double
  private static boolean ToleranceAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToleranceAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SizeUnitEnum|dd
  static boolean ToleranceUnitEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToleranceUnitEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SizeUnitEnum(b, l + 1);
    if (!r) r = consumeToken(b, DD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TOLERANCEUNITS ToleranceUnitEnum
  static boolean ToleranceunitsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToleranceunitsAttr")) return false;
    if (!nextTokenIs(b, TOLERANCEUNITS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, TOLERANCEUNITS);
    p = r; // pin = 1
    r = r && ToleranceUnitEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TRANSFORM TransformEnum
  static boolean TransformAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformAttr")) return false;
    if (!nextTokenIs(b, TRANSFORM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, TRANSFORM);
    p = r; // pin = 1
    r = r && TransformEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BooleanEnum|ul|uc|ur|cl|cc|cr|ll|lc|lr
  static boolean TransformEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BooleanEnum(b, l + 1);
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
  // TRANSPARENT integer
  static boolean TransparentAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransparentAttr")) return false;
    if (!nextTokenIs(b, TRANSPARENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, TRANSPARENT, INTEGER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TYPE TypeEnum
  static boolean TypeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAttr")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, TYPE);
    p = r; // pin = 1
    r = r && TypeEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // chart|circle|line|point|polygon|raster|query
  static boolean TypeEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeEnum")) return false;
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
  // TYPE TypeJoinEnum
  static boolean TypeJoinAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeJoinAttr")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, TYPE);
    p = r; // pin = 1
    r = r && TypeJoinEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ONE-TO-ONE|ONE-TO-MANY
  static boolean TypeJoinEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeJoinEnum")) return false;
    if (!nextTokenIs(b, "", ONE_TO_MANY, ONE_TO_ONE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ONE_TO_ONE);
    if (!r) r = consumeToken(b, ONE_TO_MANY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE TypeLabelEnum
  static boolean TypeLabelAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeLabelAttr")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, TYPE);
    p = r; // pin = 1
    r = r && TypeLabelEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // bitmap|truetype
  static boolean TypeLabelEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeLabelEnum")) return false;
    if (!nextTokenIs(b, "", BITMAP, TRUETYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITMAP);
    if (!r) r = consumeToken(b, TRUETYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE TypeSymbolEnum
  static boolean TypeSymbolAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSymbolAttr")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, TYPE);
    p = r; // pin = 1
    r = r && TypeSymbolEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ellipse|hatch|pixmap|svg|truetype|vector
  static boolean TypeSymbolEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSymbolEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSE);
    if (!r) r = consumeToken(b, HATCH);
    if (!r) r = consumeToken(b, PIXMAP);
    if (!r) r = consumeToken(b, SVG);
    if (!r) r = consumeToken(b, TRUETYPE);
    if (!r) r = consumeToken(b, VECTOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UNITS UnitsEnum
  static boolean UnitsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitsAttr")) return false;
    if (!nextTokenIs(b, UNITS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, UNITS);
    p = r; // pin = 1
    r = r && UnitsEnum(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ToleranceUnitEnum|percentages
  static boolean UnitsEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitsEnum")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ToleranceUnitEnum(b, l + 1);
    if (!r) r = consumeToken(b, PERCENTAGES);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UTFDATA string
  static boolean UtfdataAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UtfdataAttr")) return false;
    if (!nextTokenIs(b, UTFDATA)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, UTFDATA, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // UTFITEM string
  static boolean UtfitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UtfitemAttr")) return false;
    if (!nextTokenIs(b, UTFITEM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, UTFITEM, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // VALIDATION ( string string )* END
  static boolean ValidationObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValidationObject")) return false;
    if (!nextTokenIs(b, VALIDATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALIDATION);
    r = r && ValidationObject_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( string string )*
  private static boolean ValidationObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValidationObject_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ValidationObject_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ValidationObject_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // string string
  private static boolean ValidationObject_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValidationObject_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WEB WebObjectChildren END
  public static boolean WebObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebObject")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WEB_OBJECT, "<web object>");
    r = consumeToken(b, WEB);
    p = r; // pin = 1
    r = r && report_error_(b, WebObjectChildren(b, l + 1));
    r = p && consumeToken(b, END) && r;
    exit_section_(b, l, m, r, p, WebObjectChildren_recover_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // !END (
  //         MetadataObject | ValidationObject
  //         | BrowseformatAttr | EmptyAttr | ErrorAttr | FooterAttr | HeaderAttr | ImagepathAttr | ImageurlAttr
  //         | LegendformatAttr | MaxscaledenomAttr | MaxtemplateAttr | MinscaledenomAttr | MintemplateAttr
  //         | QueryformatAttr | TemplateAttr | TemppathAttr
  //     )*
  static boolean WebObjectChildren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebObjectChildren")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = WebObjectChildren_0(b, l + 1);
    p = r; // pin = 1
    r = r && WebObjectChildren_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !END
  private static boolean WebObjectChildren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebObjectChildren_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //         MetadataObject | ValidationObject
  //         | BrowseformatAttr | EmptyAttr | ErrorAttr | FooterAttr | HeaderAttr | ImagepathAttr | ImageurlAttr
  //         | LegendformatAttr | MaxscaledenomAttr | MaxtemplateAttr | MinscaledenomAttr | MintemplateAttr
  //         | QueryformatAttr | TemplateAttr | TemppathAttr
  //     )*
  private static boolean WebObjectChildren_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebObjectChildren_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!WebObjectChildren_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WebObjectChildren_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // MetadataObject | ValidationObject
  //         | BrowseformatAttr | EmptyAttr | ErrorAttr | FooterAttr | HeaderAttr | ImagepathAttr | ImageurlAttr
  //         | LegendformatAttr | MaxscaledenomAttr | MaxtemplateAttr | MinscaledenomAttr | MintemplateAttr
  //         | QueryformatAttr | TemplateAttr | TemppathAttr
  private static boolean WebObjectChildren_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebObjectChildren_1_0")) return false;
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

  /* ********************************************************** */
  // !(
  //         METADATA | VALIDATION
  //         | BROWSEFORMAT | EMPTY | ERROR | FOOTER | HEADER | IMAGEPATH | IMAGEURL
  //         | LEGENDFORMAT | MAXSCALEDENOM | MAXTEMPLATE | MINSCALEDENOM | MINTEMPLATE
  //         | QUERYFORMAT | TEMPLATE | TEMPPATH
  //         | END
  //     )
  static boolean WebObjectChildren_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebObjectChildren_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !WebObjectChildren_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // METADATA | VALIDATION
  //         | BROWSEFORMAT | EMPTY | ERROR | FOOTER | HEADER | IMAGEPATH | IMAGEURL
  //         | LEGENDFORMAT | MAXSCALEDENOM | MAXTEMPLATE | MINSCALEDENOM | MINTEMPLATE
  //         | QUERYFORMAT | TEMPLATE | TEMPPATH
  //         | END
  private static boolean WebObjectChildren_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WebObjectChildren_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METADATA);
    if (!r) r = consumeToken(b, VALIDATION);
    if (!r) r = consumeToken(b, BROWSEFORMAT);
    if (!r) r = consumeToken(b, EMPTY);
    if (!r) r = consumeToken(b, ERROR);
    if (!r) r = consumeToken(b, FOOTER);
    if (!r) r = consumeToken(b, HEADER);
    if (!r) r = consumeToken(b, IMAGEPATH);
    if (!r) r = consumeToken(b, IMAGEURL);
    if (!r) r = consumeToken(b, LEGENDFORMAT);
    if (!r) r = consumeToken(b, MAXSCALEDENOM);
    if (!r) r = consumeToken(b, MAXTEMPLATE);
    if (!r) r = consumeToken(b, MINSCALEDENOM);
    if (!r) r = consumeToken(b, MINTEMPLATE);
    if (!r) r = consumeToken(b, QUERYFORMAT);
    if (!r) r = consumeToken(b, TEMPLATE);
    if (!r) r = consumeToken(b, TEMPPATH);
    if (!r) r = consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WIDTH ( ( integer | double ) | attributeToken )
  static boolean WidthClassAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidthClassAttr")) return false;
    if (!nextTokenIs(b, WIDTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, WIDTH);
    p = r; // pin = 1
    r = r && WidthClassAttr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( integer | double ) | attributeToken
  private static boolean WidthClassAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidthClassAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WidthClassAttr_1_0(b, l + 1);
    if (!r) r = consumeToken(b, ATTRIBUTETOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer | double
  private static boolean WidthClassAttr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidthClassAttr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WKT string
  static boolean WktAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WktAttr")) return false;
    if (!nextTokenIs(b, WKT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, WKT, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // WRAP string
  static boolean WrapAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WrapAttr")) return false;
    if (!nextTokenIs(b, WRAP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, WRAP, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // yes|no
  static boolean YesNoEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YesNoEnum")) return false;
    if (!nextTokenIs(b, "", NO, YES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YES);
    if (!r) r = consumeToken(b, NO);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MapObject | WebObject | LayerObject | ClassObject | SymbolObject | LabelObject | StyleObject
  //              | LeaderObject | LegendObject | FeatureObject | ClusterObject | CompositeObject | GridObject
  //              | JoinObject | QuerymapObject | ReferenceObject | ScalebarObject | PatternObject ValidationObject
  //              | MetadataObject | PointsObject | ProjectionObject
  static boolean mapfile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapfile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapObject(b, l + 1);
    if (!r) r = WebObject(b, l + 1);
    if (!r) r = LayerObject(b, l + 1);
    if (!r) r = ClassObject(b, l + 1);
    if (!r) r = SymbolObject(b, l + 1);
    if (!r) r = LabelObject(b, l + 1);
    if (!r) r = StyleObject(b, l + 1);
    if (!r) r = LeaderObject(b, l + 1);
    if (!r) r = LegendObject(b, l + 1);
    if (!r) r = FeatureObject(b, l + 1);
    if (!r) r = ClusterObject(b, l + 1);
    if (!r) r = CompositeObject(b, l + 1);
    if (!r) r = GridObject(b, l + 1);
    if (!r) r = JoinObject(b, l + 1);
    if (!r) r = QuerymapObject(b, l + 1);
    if (!r) r = ReferenceObject(b, l + 1);
    if (!r) r = ScalebarObject(b, l + 1);
    if (!r) r = mapfile_17(b, l + 1);
    if (!r) r = MetadataObject(b, l + 1);
    if (!r) r = PointsObject(b, l + 1);
    if (!r) r = ProjectionObject(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PatternObject ValidationObject
  private static boolean mapfile_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapfile_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatternObject(b, l + 1);
    r = r && ValidationObject(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser LayerObjectChildren_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return LayerObjectChildren_recover(b, l + 1);
    }
  };
  final static Parser MapObjectChildren_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return MapObjectChildren_recover(b, l + 1);
    }
  };
  final static Parser WebObjectChildren_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return WebObjectChildren_recover(b, l + 1);
    }
  };
}

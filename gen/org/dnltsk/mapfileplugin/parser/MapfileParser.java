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
  // 'CLASSGROUP' string
  static boolean ClassgroupAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassgroupAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CLASSGROUP");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'CLASSITEM' string
  static boolean ClassitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassitemAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CLASSITEM");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLUSTER END
  static boolean ClusterObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClusterObject")) return false;
    if (!nextTokenIs(b, CLUSTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLUSTER, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMPOSITE END
  static boolean CompositeObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompositeObject")) return false;
    if (!nextTokenIs(b, COMPOSITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMPOSITE, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'CONNECTION' string
  static boolean ConnectionAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectionAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CONNECTION");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'CONNECTIONTYPE' ('contour'|'kerneldensity'|'local'|'ogr'|'oraclespatial'|'plugin'|'postgis'|'sde'|'union'|'uvraster'|'wfs'|'wms')
  static boolean ConnectiontypeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectiontypeAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CONNECTIONTYPE");
    r = r && ConnectiontypeAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'contour'|'kerneldensity'|'local'|'ogr'|'oraclespatial'|'plugin'|'postgis'|'sde'|'union'|'uvraster'|'wfs'|'wms'
  private static boolean ConnectiontypeAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectiontypeAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "contour");
    if (!r) r = consumeToken(b, "kerneldensity");
    if (!r) r = consumeToken(b, "local");
    if (!r) r = consumeToken(b, "ogr");
    if (!r) r = consumeToken(b, "oraclespatial");
    if (!r) r = consumeToken(b, "plugin");
    if (!r) r = consumeToken(b, "postgis");
    if (!r) r = consumeToken(b, "sde");
    if (!r) r = consumeToken(b, "union");
    if (!r) r = consumeToken(b, "uvraster");
    if (!r) r = consumeToken(b, "wfs");
    if (!r) r = consumeToken(b, "wms");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'DATA' string
  static boolean DataAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DATA");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'DEBUG' ('off'|'on'|0|1|2|3|4|5)
  static boolean DebugAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DEBUG");
    r = r && DebugAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'off'|'on'|0|1|2|3|4|5
  private static boolean DebugAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "off");
    if (!r) r = consumeToken(b, "on");
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
  // 'DUMP' (true|false)
  static boolean DumpAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DumpAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DUMP");
    r = r && DumpAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // true|false
  private static boolean DumpAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DumpAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'ENCODING' string
  static boolean EncodingAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncodingAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ENCODING");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'EXTENT' number number number number
  static boolean ExtentAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtentAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXTENT");
    r = r && consumeTokens(b, 0, NUMBER, NUMBER, NUMBER, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FEATURE END
  static boolean FeatureObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FeatureObject")) return false;
    if (!nextTokenIs(b, FEATURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FEATURE, END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'FILTER' string
  static boolean FilterAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilterAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FILTER");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'FILTERITEM' string
  static boolean FilteritemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilteritemAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FILTERITEM");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'FOOTER' string
  static boolean FooterAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FooterAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FOOTER");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'GEOMTRANSFORM' string
  static boolean GeomtransformAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GeomtransformAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "GEOMTRANSFORM");
    r = r && consumeToken(b, STRING);
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
  // 'GROUP' string
  static boolean GroupAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "GROUP");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'HEADER' string
  static boolean HeaderAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeaderAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "HEADER");
    r = r && consumeToken(b, STRING);
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
  // 'LABELCACHE' ('on'|'off')
  static boolean LabelcacheAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelcacheAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LABELCACHE");
    r = r && LabelcacheAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'on'|'off'
  private static boolean LabelcacheAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelcacheAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "on");
    if (!r) r = consumeToken(b, "off");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'LABELITEM' string
  static boolean LabelitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelitemAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LABELITEM");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'LABELMAXSCALEDENOM' number
  static boolean LabelmaxscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelmaxscaledenomAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LABELMAXSCALEDENOM");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'LABELMINSCALEDENOM' number
  static boolean LabelminscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelminscaledenomAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LABELMINSCALEDENOM");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'LABELREQUIRES' string
  static boolean LabelrequiresAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelrequiresAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LABELREQUIRES");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //       ClassObject | ClusterObject | CompositeObject | FeatureObject | GridObject | JoinObject | MetadataObject
  //       | ProjectionObject | ValidationObject
  //       | ClassgroupAttr | ClassitemAttr | ConnectionAttr | ConnectiontypeAttr | DataAttr | DebugAttr | DumpAttr
  //       | EncodingAttr | ExtentAttr | FilterAttr | FooterAttr | FilteritemAttr | GeomtransformAttr | GroupAttr
  //       | HeaderAttr | LabelcacheAttr | LabelitemAttr | LabelmaxscaledenomAttr | LabelminscaledenomAttr
  //       | LabelrequiresAttr | MaskAttr | MaxfeaturesAttr | MaxgeowidthAttr | MaxscaledenomAttr | MingeowidthAttr
  //       | Minscaledenom | NameAttr | PluginAttr | PostlabelcacheAttr | ProcessingAttr | OffsiteAttr | SizeunitsAttr
  //       | RequiresAttr | StatusAttr | StyleitemAttr | SymbolscaledenomAttr | TemplateAttr | TileindexAttr
  //       | TileitemAttr | TilesrsAttr | TitleAttr | ToleranceunitsAttr | ToleranceAttr | TransformAttr | TypeAttr
  //       | UnitsAttr | UtfdataAttr | UtfitemAttr
  //     ) LayerAttributes *
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
  //       | ProjectionObject | ValidationObject
  //       | ClassgroupAttr | ClassitemAttr | ConnectionAttr | ConnectiontypeAttr | DataAttr | DebugAttr | DumpAttr
  //       | EncodingAttr | ExtentAttr | FilterAttr | FooterAttr | FilteritemAttr | GeomtransformAttr | GroupAttr
  //       | HeaderAttr | LabelcacheAttr | LabelitemAttr | LabelmaxscaledenomAttr | LabelminscaledenomAttr
  //       | LabelrequiresAttr | MaskAttr | MaxfeaturesAttr | MaxgeowidthAttr | MaxscaledenomAttr | MingeowidthAttr
  //       | Minscaledenom | NameAttr | PluginAttr | PostlabelcacheAttr | ProcessingAttr | OffsiteAttr | SizeunitsAttr
  //       | RequiresAttr | StatusAttr | StyleitemAttr | SymbolscaledenomAttr | TemplateAttr | TileindexAttr
  //       | TileitemAttr | TilesrsAttr | TitleAttr | ToleranceunitsAttr | ToleranceAttr | TransformAttr | TypeAttr
  //       | UnitsAttr | UtfdataAttr | UtfitemAttr
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
    if (!r) r = Minscaledenom(b, l + 1);
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

  // LayerAttributes *
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
  // ( NameAttr | TitleAttr | LayerObject ) MapAttributes *
  static boolean MapAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapAttributes_0(b, l + 1);
    r = r && MapAttributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NameAttr | TitleAttr | LayerObject
  private static boolean MapAttributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapAttributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameAttr(b, l + 1);
    if (!r) r = TitleAttr(b, l + 1);
    if (!r) r = LayerObject(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MapAttributes *
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
  // 'MASK' string
  static boolean MaskAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaskAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MASK");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'MAXFEATURES' number
  static boolean MaxfeaturesAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxfeaturesAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MAXFEATURES");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'MAXGEOWIDTH' number
  static boolean MaxgeowidthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxgeowidthAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MAXGEOWIDTH");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'MAXSCALEDENOM' number
  static boolean MaxscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxscaledenomAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MAXSCALEDENOM");
    r = r && consumeToken(b, NUMBER);
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
  // 'MINGEOWIDTH' number
  static boolean MingeowidthAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MingeowidthAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MINGEOWIDTH");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'MINSCALEDENOM' number
  static boolean Minscaledenom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Minscaledenom")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MINSCALEDENOM");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'NAME' string
  static boolean NameAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "NAME");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'OFFSITE' ( string | (number number number) )
  static boolean OffsiteAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsiteAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "OFFSITE");
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
  // 'PLUGIN' string
  static boolean PluginAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PluginAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "PLUGIN");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'POSTLABELCACHE' (true|false)
  static boolean PostlabelcacheAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostlabelcacheAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "POSTLABELCACHE");
    r = r && PostlabelcacheAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // true|false
  private static boolean PostlabelcacheAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostlabelcacheAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'PROCESSING' string
  static boolean ProcessingAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcessingAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "PROCESSING");
    r = r && consumeToken(b, STRING);
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
  // 'REQUIRES' string
  static boolean RequiresAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequiresAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "REQUIRES");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'SIZEUNITS' ('feet'|'inches'|'kilometers'|'meters'|'miles'|'nauticalmiles'|'pixels')
  static boolean SizeunitsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeunitsAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SIZEUNITS");
    r = r && SizeunitsAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'feet'|'inches'|'kilometers'|'meters'|'miles'|'nauticalmiles'|'pixels'
  private static boolean SizeunitsAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SizeunitsAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "feet");
    if (!r) r = consumeToken(b, "inches");
    if (!r) r = consumeToken(b, "kilometers");
    if (!r) r = consumeToken(b, "meters");
    if (!r) r = consumeToken(b, "miles");
    if (!r) r = consumeToken(b, "nauticalmiles");
    if (!r) r = consumeToken(b, "pixels");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'STATUS' ('on'|'off'|'default')
  static boolean StatusAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatusAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "STATUS");
    r = r && StatusAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'on'|'off'|'default'
  private static boolean StatusAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatusAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "on");
    if (!r) r = consumeToken(b, "off");
    if (!r) r = consumeToken(b, "default");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'STYLEITEM' string
  static boolean StyleitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleitemAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "STYLEITEM");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'SYMBOLSCALEDENOM' number
  static boolean SymbolscaledenomAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolscaledenomAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SYMBOLSCALEDENOM");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'TEMPLATE' string
  static boolean TemplateAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TEMPLATE");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'TILEINDEX' string
  static boolean TileindexAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TileindexAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TILEINDEX");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'TILEITEM' string
  static boolean TileitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TileitemAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TILEITEM");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'TILESRS' string
  static boolean TilesrsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TilesrsAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TILESRS");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'TITLE' string
  static boolean TitleAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TitleAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TITLE");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'TOLERANCE' number
  static boolean ToleranceAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToleranceAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TOLERANCE");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'TOLERANCEUNITS' ('pixels'|'feet'|'inches'|'kilometers'|'meters'|'miles'|'nauticalmiles'|'dd')
  static boolean ToleranceunitsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToleranceunitsAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TOLERANCEUNITS");
    r = r && ToleranceunitsAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'pixels'|'feet'|'inches'|'kilometers'|'meters'|'miles'|'nauticalmiles'|'dd'
  private static boolean ToleranceunitsAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToleranceunitsAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "pixels");
    if (!r) r = consumeToken(b, "feet");
    if (!r) r = consumeToken(b, "inches");
    if (!r) r = consumeToken(b, "kilometers");
    if (!r) r = consumeToken(b, "meters");
    if (!r) r = consumeToken(b, "miles");
    if (!r) r = consumeToken(b, "nauticalmiles");
    if (!r) r = consumeToken(b, "dd");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'TRANSFORM' (true|false|'ul'|'uc'|'ur'|'cl'|'cc'|'cr'|'ll'|'lc'|'lr')
  static boolean TransformAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TRANSFORM");
    r = r && TransformAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // true|false|'ul'|'uc'|'ur'|'cl'|'cc'|'cr'|'ll'|'lc'|'lr'
  private static boolean TransformAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, "ul");
    if (!r) r = consumeToken(b, "uc");
    if (!r) r = consumeToken(b, "ur");
    if (!r) r = consumeToken(b, "cl");
    if (!r) r = consumeToken(b, "cc");
    if (!r) r = consumeToken(b, "cr");
    if (!r) r = consumeToken(b, "ll");
    if (!r) r = consumeToken(b, "lc");
    if (!r) r = consumeToken(b, "lr");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'TYPE' ('chart'|'circle'|'line'|'point'|'polygon'|'raster'|'query')
  static boolean TypeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TYPE");
    r = r && TypeAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'chart'|'circle'|'line'|'point'|'polygon'|'raster'|'query'
  private static boolean TypeAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "chart");
    if (!r) r = consumeToken(b, "circle");
    if (!r) r = consumeToken(b, "line");
    if (!r) r = consumeToken(b, "point");
    if (!r) r = consumeToken(b, "polygon");
    if (!r) r = consumeToken(b, "raster");
    if (!r) r = consumeToken(b, "query");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'UNIT' ('dd'|'feet'|'inches'|'kilometers'|'meters'|'miles'|'nauticalmiles'|'percentages'|'pixels')
  static boolean UnitsAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitsAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "UNIT");
    r = r && UnitsAttr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'dd'|'feet'|'inches'|'kilometers'|'meters'|'miles'|'nauticalmiles'|'percentages'|'pixels'
  private static boolean UnitsAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitsAttr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "dd");
    if (!r) r = consumeToken(b, "feet");
    if (!r) r = consumeToken(b, "inches");
    if (!r) r = consumeToken(b, "kilometers");
    if (!r) r = consumeToken(b, "meters");
    if (!r) r = consumeToken(b, "miles");
    if (!r) r = consumeToken(b, "nauticalmiles");
    if (!r) r = consumeToken(b, "percentages");
    if (!r) r = consumeToken(b, "pixels");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'UTFDATA' string
  static boolean UtfdataAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UtfdataAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "UTFDATA");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'UTFITEM' string
  static boolean UtfitemAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UtfitemAttr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "UTFITEM");
    r = r && consumeToken(b, STRING);
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

}

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

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
COMMENT=#.*
NUMBER=[+-]{0,1}[0-9]+(\.[0-9]*)?
ID=[:letter:][a-zA-Z_0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  ";"                { return SEMI; }
  "="                { return EQ; }
  "("                { return LP; }
  ")"                { return RP; }
  "+"                { return OP_1; }
  "-"                { return OP_2; }
  "*"                { return OP_3; }
  "/"                { return OP_4; }
  "!"                { return OP_5; }
  "MAP"              { return MAP; }
  "END"              { return END; }
  "LAYER"            { return LAYER; }
  "CLASS"            { return CLASS; }
  "CLUSTER"          { return CLUSTER; }
  "COMPOSITE"        { return COMPOSITE; }
  "FEATURE"          { return FEATURE; }
  "GRID"             { return GRID; }
  "JOIN"             { return JOIN; }
  "METADATA"         { return METADATA; }
  "PROJECTION"       { return PROJECTION; }
  "VALIDATION"       { return VALIDATION; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }

  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {NUMBER}           { return NUMBER; }
  {ID}               { return ID; }
  {STRING}           { return STRING; }

}

[^] { return BAD_CHARACTER; }

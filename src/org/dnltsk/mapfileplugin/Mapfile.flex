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
ID=[a-zA-Z_0-9]+
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
NUMBER=[0-9]+
LINE_COMMENT=#.*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "="                  { return OP_EQ; }
  "::="                { return OP_IS; }
  "|"                  { return OP_OR; }
  "?"                  { return OP_OPT; }
  "+"                  { return OP_ONEMORE; }
  "*"                  { return OP_ZEROMORE; }
  "&"                  { return OP_AND; }
  "!"                  { return OP_NOT; }
  ";"                  { return SEMICOLON; }
  "{"                  { return LEFT_BRACE; }
  "}"                  { return RIGHT_BRACE; }
  "["                  { return LEFT_BRACKET; }
  "]"                  { return RIGHT_BRACKET; }
  "("                  { return LEFT_PAREN; }
  ")"                  { return RIGHT_PAREN; }
  "<<"                 { return EXTERNAL_START; }
  ">>"                 { return EXTERNAL_END; }
  "MAP"                { return MAP; }
  "END"                { return END; }
  "LAYER"              { return LAYER; }
  "CLASS"              { return CLASS; }
  "CLUSTER"            { return CLUSTER; }
  "COMPOSITE"          { return COMPOSITE; }
  "FEATURE"            { return FEATURE; }
  "GRID"               { return GRID; }
  "JOIN"               { return JOIN; }
  "METADATA"           { return METADATA; }
  "PROJECTION"         { return PROJECTION; }
  "VALIDATION"         { return VALIDATION; }
  "true"               { return TRUE; }
  "false"              { return FALSE; }

  {SPACE}              { return SPACE; }
  {ID}                 { return ID; }
  {STRING}             { return STRING; }
  {NUMBER}             { return NUMBER; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }

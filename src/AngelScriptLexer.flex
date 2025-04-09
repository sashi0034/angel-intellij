package com.github.sashi0034.angelintellij.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.github.sashi0034.angelintellij.psi.AngelScriptTokenTypes.*;

%%
%public
%class _AngelScriptLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL = \r|\n|\r\n
WHITE_SPACE = [ \t\f]+
LINE_COMMENT = "//"[^\r\n]*

%%

{LINE_COMMENT}           { return LINE_COMMENT; }
"/**"                    { return DOC_COMMENT_START; }
"/*"                     { return BLOCK_COMMENT_START; }
"*/"                     { return BLOCK_COMMENT_END; }

"{"                      { return LBRACE; }
"}"                      { return RBRACE; }
"\\["                    { return LBRACKET; }
"\\]"                    { return RBRACKET; }
"\\("                    { return LPAREN; }
"\\)"                    { return RPAREN; }

"\"\"\""                 { return TRIPLE_QUOTE; }
"\""                    { return DOUBLE_QUOTE; }
"'"                     { return SINGLE_QUOTE; }

{WHITE_SPACE}            { return WHITESPACE; }
{EOL}                    { return WHITESPACE; }

.                        { return BAD_CHARACTER; }

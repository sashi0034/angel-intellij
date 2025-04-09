package com.github.sashi0034.angelintellij.language;

import com.github.sashi0034.angelintellij.psi.AngelScriptTokenTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

%%

%class AngelScriptLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

// ─────────────── regex macros ───────────────
CRLF=\R
WHITE_SPACE = [ \t\r\n]+
LINE_COMMENT = "//"[^\n\r]*
BLOCK_COMMENT = "/\\*"([^*]|\\*+[^*/])*"\\*/"
COMMENT = {LINE_COMMENT}|{BLOCK_COMMENT}
IDENTIFIER = [A-Za-z_][A-Za-z0-9_]*
NUMBER = (0[xX][0-9a-fA-F]+)
       | (0[bB][01]+)
       | (0[oO][0-7]+)
       | ([0-9]+(\.[0-9]*)?|\.[0-9]+)([eE][+-]?[0-9]+)?
DQ_STRING  = \"([^\"\\\r\n]|\\.)*\"
SQ_STRING = \'([^\'\\\r\n]|\\.)*\'
TRIPLE_QUOTE_STRING= \"\"\"([\\s\\S]*?)\"\"\"
STRING = {DQ_STRING}|{SQ_STRING}|{TRIPLE_QUOTE_STRING}

%%

// ─────────────── rules ──────────────────────
<YYINITIAL> {CRLF} { return TokenType.WHITE_SPACE; }
<YYINITIAL> {WHITE_SPACE} { return TokenType.WHITE_SPACE; }
<YYINITIAL> {COMMENT} { return AngelScriptTokenTypes.COMMENT; }

<YYINITIAL> "+" { return AngelScriptTokenTypes.PLUS; }
<YYINITIAL> "+=" { return AngelScriptTokenTypes.ADD_ASSIGN; }
<YYINITIAL> "++" { return AngelScriptTokenTypes.INC; }
<YYINITIAL> "-" { return AngelScriptTokenTypes.MINUS; }
<YYINITIAL> "-=" { return AngelScriptTokenTypes.SUB_ASSIGN; }
<YYINITIAL> "--" { return AngelScriptTokenTypes.DEC; }
<YYINITIAL> "*" { return AngelScriptTokenTypes.STAR; }
<YYINITIAL> "*=" { return AngelScriptTokenTypes.MUL_ASSIGN; }
<YYINITIAL> "/" { return AngelScriptTokenTypes.SLASH; }
<YYINITIAL> "/=" { return AngelScriptTokenTypes.DIV_ASSIGN; }
<YYINITIAL> "%" { return AngelScriptTokenTypes.PERCENT; }
<YYINITIAL> "%=" { return AngelScriptTokenTypes.MOD_ASSIGN; }
<YYINITIAL> "**" { return AngelScriptTokenTypes.STAR_STAR; }
<YYINITIAL> "**=" { return AngelScriptTokenTypes.POW_ASSIGN; }
<YYINITIAL> "=" { return AngelScriptTokenTypes.ASSIGNMENT; }
<YYINITIAL> "==" { return AngelScriptTokenTypes.EQUAL; }
<YYINITIAL> "." { return AngelScriptTokenTypes.DOT; }
<YYINITIAL> "..." { return AngelScriptTokenTypes.VARIADIC; }
<YYINITIAL> "|" { return AngelScriptTokenTypes.BIT_OR; }
<YYINITIAL> "|=" { return AngelScriptTokenTypes.OR_ASSIGN; }
<YYINITIAL> "||" { return AngelScriptTokenTypes.OR; }
<YYINITIAL> "&" { return AngelScriptTokenTypes.AMP; }
<YYINITIAL> "&=" { return AngelScriptTokenTypes.AND_ASSIGN; }
<YYINITIAL> "&&" { return AngelScriptTokenTypes.AND; }
<YYINITIAL> "^" { return AngelScriptTokenTypes.BIT_XOR; }
<YYINITIAL> "^=" { return AngelScriptTokenTypes.XOR_ASSIGN; }
<YYINITIAL> "^^" { return AngelScriptTokenTypes.XOR; }
<YYINITIAL> "<" { return AngelScriptTokenTypes.LESS_THAN; }
<YYINITIAL> "<=" { return AngelScriptTokenTypes.LESS_THAN_OR_EQUAL; }
<YYINITIAL> "<<" { return AngelScriptTokenTypes.BIT_SHIFT_LEFT; }
<YYINITIAL> "<<=" { return AngelScriptTokenTypes.SHIFT_LEFT_ASSIGN; }
<YYINITIAL> ">" { return AngelScriptTokenTypes.GREATER_THAN; }
<YYINITIAL> ">=" { return AngelScriptTokenTypes.GREATER_THAN_OR_EQUAL; }
<YYINITIAL> ">>" { return AngelScriptTokenTypes.BIT_SHIFT_RIGHT; }
<YYINITIAL> ">>=" { return AngelScriptTokenTypes.SHIFT_RIGHT_L_ASSIGN; }
<YYINITIAL> ">>>" { return AngelScriptTokenTypes.BIT_SHIFT_RIGHT_ARITH; }
<YYINITIAL> ">>>=" { return AngelScriptTokenTypes.SHIFT_RIGHT_A_ASSIGN; }
<YYINITIAL> "~" { return AngelScriptTokenTypes.BIT_NOT; }
<YYINITIAL> ";" { return AngelScriptTokenTypes.END_STATEMENT; }
<YYINITIAL> "," { return AngelScriptTokenTypes.LIST_SEPARATOR; }
<YYINITIAL> "{" { return AngelScriptTokenTypes.START_STATEMENT_BLOCK; }
<YYINITIAL> "}" { return AngelScriptTokenTypes.END_STATEMENT_BLOCK; }
<YYINITIAL> "(" { return AngelScriptTokenTypes.OPEN_PARENTHESIS; }
<YYINITIAL> ")" { return AngelScriptTokenTypes.CLOSE_PARENTHESIS; }
<YYINITIAL> "[" { return AngelScriptTokenTypes.OPEN_BRACKET; }
<YYINITIAL> "]" { return AngelScriptTokenTypes.CLOSE_BRACKET; }
<YYINITIAL> "?" { return AngelScriptTokenTypes.QUESTION; }
<YYINITIAL> ":" { return AngelScriptTokenTypes.COLON; }
<YYINITIAL> "::" { return AngelScriptTokenTypes.SCOPE; }
<YYINITIAL> "!" { return AngelScriptTokenTypes.NOT; }
<YYINITIAL> "!=" { return AngelScriptTokenTypes.NOT_EQUAL; }
<YYINITIAL> "!is" { return AngelScriptTokenTypes.NOT_IS; }

<YYINITIAL>
    "and"|"auto"|"bool"|"break"|"case"|"cast"|"catch"|"class"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"false"|"float"|"for"|"funcdef"|"if"|"import"|"in"|"inout"|"int"|"interface"|"int8"|"int16"|"int32"|"int64"|"is"|"mixin"|"namespace"|"not"|"null"|"or"|"out"|"override"|"private"|"protected"|"return"|"switch"|"true"|"try"|"typedef"|"uint"|"uint8"|"uint16"|"uint32"|"uint64"|"void"|"while"|"xor"
    { return AngelScriptTokenTypes.KEYWORD; }

<YYINITIAL> {IDENTIFIER} { return AngelScriptTokenTypes.IDENTIFIER; }
<YYINITIAL> {NUMBER} { return AngelScriptTokenTypes.NUMBER; }
<YYINITIAL> {STRING} { return AngelScriptTokenTypes.STRING; }
<YYINITIAL> . { return AngelScriptTokenTypes.UNKNOWN; }

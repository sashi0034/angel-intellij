package com.github.sashi0034.angelintellij.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.github.sashi0034.angelintellij.psi.AngelScriptTypes;

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
<YYINITIAL> {COMMENT} { return AngelScriptTypes.COMMENT; }

<YYINITIAL>
    "*"|"**"|"/"|"%"|"+"|"-"|"<="|"<"|">="|">"|"("|")"|"=="|"!="|"?"|":"|"="|"+="|"-="|"*="|"/="|"%="|"**="|"++"|"--"|"&"|","|"{"|"}"|";"|"|"|"^"|"~"|"<<"|">>"|">>>"|"&="|"|="|"^="|"<<="|">>="|">>>="|"."|"..."|"&&"|"||"|"!"|"["|"]"|"^^"|"@"|"!is"|"::"
    { return AngelScriptTypes.MARK; }

<YYINITIAL>
    "and"|"auto"|"bool"|"break"|"case"|"cast"|"catch"|"class"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"false"|"float"|"for"|"funcdef"|"if"|"import"|"in"|"inout"|"int"|"interface"|"int8"|"int16"|"int32"|"int64"|"is"|"mixin"|"namespace"|"not"|"null"|"or"|"out"|"override"|"private"|"protected"|"return"|"switch"|"true"|"try"|"typedef"|"uint"|"uint8"|"uint16"|"uint32"|"uint64"|"void"|"while"|"xor"
    { return AngelScriptTypes.KEYWORD; }

<YYINITIAL> {IDENTIFIER} { return AngelScriptTypes.IDENTIFIER; }
<YYINITIAL> {NUMBER} { return AngelScriptTypes.NUMBER; }
<YYINITIAL> {STRING} { return AngelScriptTypes.STRING; }
<YYINITIAL> . { return TokenType.BAD_CHARACTER; }

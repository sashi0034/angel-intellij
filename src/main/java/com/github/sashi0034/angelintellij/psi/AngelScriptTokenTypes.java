package com.github.sashi0034.angelintellij.psi;


import com.github.sashi0034.angelintellij.language.AngelScriptLanguage;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.Language;

public interface AngelScriptTokenTypes {
    Language LANGUAGE = AngelScriptLanguage.INSTANCE;

    IElementType LBRACE = new AngelScriptTokenType("LBRACE");
    IElementType RBRACE = new AngelScriptTokenType("RBRACE");
    IElementType LBRACKET = new AngelScriptTokenType("LBRACKET");
    IElementType RBRACKET = new AngelScriptTokenType("RBRACKET");
    IElementType LPAREN = new AngelScriptTokenType("LPAREN");
    IElementType RPAREN = new AngelScriptTokenType("RPAREN");

    IElementType SINGLE_QUOTE = new AngelScriptTokenType("SINGLE_QUOTE");
    IElementType DOUBLE_QUOTE = new AngelScriptTokenType("DOUBLE_QUOTE");
    IElementType TRIPLE_QUOTE = new AngelScriptTokenType("TRIPLE_QUOTE");

    IElementType BLOCK_COMMENT_START = new AngelScriptTokenType("BLOCK_COMMENT_START");
    IElementType BLOCK_COMMENT_END = new AngelScriptTokenType("BLOCK_COMMENT_END");
    IElementType DOC_COMMENT_START = new AngelScriptTokenType("DOC_COMMENT_START");
    IElementType LINE_COMMENT = new AngelScriptTokenType("LINE_COMMENT");

    IElementType WHITESPACE = new AngelScriptTokenType("WHITESPACE");
    IElementType BAD_CHARACTER = new AngelScriptTokenType("BAD_CHARACTER");
}
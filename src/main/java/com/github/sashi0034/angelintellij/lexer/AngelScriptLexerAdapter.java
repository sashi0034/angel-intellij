package com.github.sashi0034.angelintellij.lexer;

import com.intellij.lexer.FlexAdapter;

public class AngelScriptLexerAdapter extends FlexAdapter {
    public AngelScriptLexerAdapter() {
        super(new _AngelScriptLexer(null));
    }
}

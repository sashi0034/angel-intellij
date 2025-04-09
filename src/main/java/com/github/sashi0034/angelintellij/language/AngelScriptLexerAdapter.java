package com.github.sashi0034.angelintellij.language;

import com.intellij.lexer.FlexAdapter;

public class AngelScriptLexerAdapter extends FlexAdapter {
    public AngelScriptLexerAdapter() {
        super(new AngelScriptLexer(null));
    }
}

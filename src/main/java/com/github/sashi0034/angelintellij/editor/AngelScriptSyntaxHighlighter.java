package com.github.sashi0034.angelintellij.editor;

import com.github.sashi0034.angelintellij.language.AngelScriptLexerAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class AngelScriptSyntaxHighlighter implements SyntaxHighlighter {

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new AngelScriptLexerAdapter();
    }

    @Override
    public @NotNull TextAttributesKey[] getTokenHighlights(IElementType type) {
        return TextAttributesKey.EMPTY_ARRAY;
    }
}

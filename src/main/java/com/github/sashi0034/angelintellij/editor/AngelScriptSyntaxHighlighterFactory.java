package com.github.sashi0034.angelintellij.editor;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import org.jetbrains.annotations.NotNull;

public class AngelScriptSyntaxHighlighterFactory
        extends SingleLazyInstanceSyntaxHighlighterFactory {

    @Override
    protected @NotNull SyntaxHighlighter createHighlighter() {
        return new AngelScriptSyntaxHighlighter();
    }
}

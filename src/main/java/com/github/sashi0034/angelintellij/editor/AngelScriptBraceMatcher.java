package com.github.sashi0034.angelintellij.editor;

import com.github.sashi0034.angelintellij.psi.AngelScriptTokenTypes;
import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;

public class AngelScriptBraceMatcher implements PairedBraceMatcher {

    private static final BracePair[] PAIRS = new BracePair[]{
            new BracePair(AngelScriptTokenTypes.OPEN_PARENTHESIS, AngelScriptTokenTypes.CLOSE_PARENTHESIS, false),
            new BracePair(AngelScriptTokenTypes.START_STATEMENT_BLOCK, AngelScriptTokenTypes.END_STATEMENT_BLOCK, true),
            new BracePair(AngelScriptTokenTypes.OPEN_BRACKET, AngelScriptTokenTypes.CLOSE_BRACKET, false)
    };

    @Override
    public BracePair[] getPairs() {
        return PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(IElementType lbraceType, IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return openingBraceOffset;
    }
}

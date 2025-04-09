package com.github.sashi0034.angelintellij.editor;

import com.github.sashi0034.angelintellij.psi.AngelScriptTokenTypes;
import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;

public class AngelScriptBraceMatcher implements PairedBraceMatcher {

    private static final BracePair[] PAIRS = new BracePair[]{
            new BracePair(AngelScriptTokenTypes.LPAREN, AngelScriptTokenTypes.RPAREN, false),
            new BracePair(AngelScriptTokenTypes.LBRACE, AngelScriptTokenTypes.RBRACE, true),
            new BracePair(AngelScriptTokenTypes.LBRACKET, AngelScriptTokenTypes.RBRACKET, false)
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

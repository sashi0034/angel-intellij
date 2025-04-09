package com.github.sashi0034.angelintellij.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class AngelScriptPsiLeafNode extends ASTWrapperPsiElement {
    public AngelScriptPsiLeafNode(@NotNull ASTNode node) {
        super(node);
    }
}

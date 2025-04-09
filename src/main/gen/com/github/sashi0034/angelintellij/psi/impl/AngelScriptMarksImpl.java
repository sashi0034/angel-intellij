// This is a generated file. Not intended for manual editing.
package com.github.sashi0034.angelintellij.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.sashi0034.angelintellij.psi.AngelScriptTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.sashi0034.angelintellij.psi.*;

public class AngelScriptMarksImpl extends ASTWrapperPsiElement implements AngelScriptMarks {

  public AngelScriptMarksImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AngelScriptVisitor visitor) {
    visitor.visitMarks(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AngelScriptVisitor) accept((AngelScriptVisitor)visitor);
    else super.accept(visitor);
  }

}

// This is a generated file. Not intended for manual editing.
package com.github.sashi0034.angelintellij.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.sashi0034.angelintellij.psi.AngelScriptTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AngelScriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return script(b, l + 1);
  }

  /* ********************************************************** */
  // script_item_*
  static boolean script(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script")) return false;
    while (true) {
      int c = current_position_(b);
      if (!script_item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "script", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MARK
  //       | KEYWORD
  //       | IDENTIFIER
  //       | NUMBER
  //       | STRING
  //       | COMMENT
  //       | ';'
  static boolean script_item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_item_")) return false;
    boolean r;
    r = consumeToken(b, MARK);
    if (!r) r = consumeToken(b, KEYWORD);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, ";");
    return r;
  }

}

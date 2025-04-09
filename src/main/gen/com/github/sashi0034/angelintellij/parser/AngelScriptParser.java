// This is a generated file. Not intended for manual editing.
package com.github.sashi0034.angelintellij.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.sashi0034.angelintellij.psi.AngelScriptTokenTypes.*;
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
  // PLUS
  //       | ADD_ASSIGN
  //       | INC
  //       | MINUS
  //       | SUB_ASSIGN
  //       | DEC
  //       | STAR
  //       | MUL_ASSIGN
  //       | SLASH
  //       | DIV_ASSIGN
  //       | PERCENT
  //       | MOD_ASSIGN
  //       | STAR_STAR
  //       | POW_ASSIGN
  //       | ASSIGNMENT
  //       | EQUAL
  //       | DOT
  //       | VARIADIC
  //       | BIT_OR
  //       | OR_ASSIGN
  //       | OR
  //       | AMP
  //       | AND_ASSIGN
  //       | AND
  //       | BIT_XOR
  //       | XOR_ASSIGN
  //       | XOR
  //       | LESS_THAN
  //       | LESS_THAN_OR_EQUAL
  //       | BIT_SHIFT_LEFT
  //       | SHIFT_LEFT_ASSIGN
  //       | GREATER_THAN
  //       | GREATER_THAN_OR_EQUAL
  //       | BIT_SHIFT_RIGHT
  //       | SHIFT_RIGHT_L_ASSIGN
  //       | BIT_SHIFT_RIGHT_ARITH
  //       | SHIFT_RIGHT_A_ASSIGN
  //       | BIT_NOT
  //       | END_STATEMENT
  //       | LIST_SEPARATOR
  //       | START_STATEMENT_BLOCK
  //       | END_STATEMENT_BLOCK
  //       | OPEN_PARENTHESIS
  //       | CLOSE_PARENTHESIS
  //       | OPEN_BRACKET
  //       | CLOSE_BRACKET
  //       | QUESTION
  //       | COLON
  //       | SCOPE
  //       | NOT
  //       | NOT_EQUAL
  //       | NOT_IS
  public static boolean marks(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "marks")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MARKS, "<marks>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, ADD_ASSIGN);
    if (!r) r = consumeToken(b, INC);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, SUB_ASSIGN);
    if (!r) r = consumeToken(b, DEC);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, MUL_ASSIGN);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, DIV_ASSIGN);
    if (!r) r = consumeToken(b, PERCENT);
    if (!r) r = consumeToken(b, MOD_ASSIGN);
    if (!r) r = consumeToken(b, STAR_STAR);
    if (!r) r = consumeToken(b, POW_ASSIGN);
    if (!r) r = consumeToken(b, ASSIGNMENT);
    if (!r) r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, VARIADIC);
    if (!r) r = consumeToken(b, BIT_OR);
    if (!r) r = consumeToken(b, OR_ASSIGN);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, AMP);
    if (!r) r = consumeToken(b, AND_ASSIGN);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, BIT_XOR);
    if (!r) r = consumeToken(b, XOR_ASSIGN);
    if (!r) r = consumeToken(b, XOR);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, LESS_THAN_OR_EQUAL);
    if (!r) r = consumeToken(b, BIT_SHIFT_LEFT);
    if (!r) r = consumeToken(b, SHIFT_LEFT_ASSIGN);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, GREATER_THAN_OR_EQUAL);
    if (!r) r = consumeToken(b, BIT_SHIFT_RIGHT);
    if (!r) r = consumeToken(b, SHIFT_RIGHT_L_ASSIGN);
    if (!r) r = consumeToken(b, BIT_SHIFT_RIGHT_ARITH);
    if (!r) r = consumeToken(b, SHIFT_RIGHT_A_ASSIGN);
    if (!r) r = consumeToken(b, BIT_NOT);
    if (!r) r = consumeToken(b, END_STATEMENT);
    if (!r) r = consumeToken(b, LIST_SEPARATOR);
    if (!r) r = consumeToken(b, START_STATEMENT_BLOCK);
    if (!r) r = consumeToken(b, END_STATEMENT_BLOCK);
    if (!r) r = consumeToken(b, OPEN_PARENTHESIS);
    if (!r) r = consumeToken(b, CLOSE_PARENTHESIS);
    if (!r) r = consumeToken(b, OPEN_BRACKET);
    if (!r) r = consumeToken(b, CLOSE_BRACKET);
    if (!r) r = consumeToken(b, QUESTION);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, SCOPE);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, NOT_EQUAL);
    if (!r) r = consumeToken(b, NOT_IS);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // marks
  //       | KEYWORD
  //       | IDENTIFIER
  //       | NUMBER
  //       | STRING
  //       | COMMENT
  //       | ';'
  //       | UNKNOWN
  static boolean script_item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_item_")) return false;
    boolean r;
    r = marks(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORD);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, ";");
    if (!r) r = consumeToken(b, UNKNOWN);
    return r;
  }

}

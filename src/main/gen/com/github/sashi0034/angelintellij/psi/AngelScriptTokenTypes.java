// This is a generated file. Not intended for manual editing.
package com.github.sashi0034.angelintellij.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.sashi0034.angelintellij.psi.impl.*;

public interface AngelScriptTokenTypes {

  IElementType MARKS = new AngelScriptElementType("MARKS");

  IElementType ADD_ASSIGN = new AngelScriptTokenType("ADD_ASSIGN");
  IElementType AMP = new AngelScriptTokenType("AMP");
  IElementType AND = new AngelScriptTokenType("AND");
  IElementType AND_ASSIGN = new AngelScriptTokenType("AND_ASSIGN");
  IElementType ASSIGNMENT = new AngelScriptTokenType("ASSIGNMENT");
  IElementType BIT_NOT = new AngelScriptTokenType("BIT_NOT");
  IElementType BIT_OR = new AngelScriptTokenType("BIT_OR");
  IElementType BIT_SHIFT_LEFT = new AngelScriptTokenType("BIT_SHIFT_LEFT");
  IElementType BIT_SHIFT_RIGHT = new AngelScriptTokenType("BIT_SHIFT_RIGHT");
  IElementType BIT_SHIFT_RIGHT_ARITH = new AngelScriptTokenType("BIT_SHIFT_RIGHT_ARITH");
  IElementType BIT_XOR = new AngelScriptTokenType("BIT_XOR");
  IElementType CLOSE_BRACKET = new AngelScriptTokenType("CLOSE_BRACKET");
  IElementType CLOSE_PARENTHESIS = new AngelScriptTokenType("CLOSE_PARENTHESIS");
  IElementType COLON = new AngelScriptTokenType("COLON");
  IElementType COMMENT = new AngelScriptTokenType("COMMENT");
  IElementType DEC = new AngelScriptTokenType("DEC");
  IElementType DIV_ASSIGN = new AngelScriptTokenType("DIV_ASSIGN");
  IElementType DOT = new AngelScriptTokenType("DOT");
  IElementType END_STATEMENT = new AngelScriptTokenType("END_STATEMENT");
  IElementType END_STATEMENT_BLOCK = new AngelScriptTokenType("END_STATEMENT_BLOCK");
  IElementType EQUAL = new AngelScriptTokenType("EQUAL");
  IElementType GREATER_THAN = new AngelScriptTokenType("GREATER_THAN");
  IElementType GREATER_THAN_OR_EQUAL = new AngelScriptTokenType("GREATER_THAN_OR_EQUAL");
  IElementType IDENTIFIER = new AngelScriptTokenType("IDENTIFIER");
  IElementType INC = new AngelScriptTokenType("INC");
  IElementType KEYWORD = new AngelScriptTokenType("KEYWORD");
  IElementType LESS_THAN = new AngelScriptTokenType("LESS_THAN");
  IElementType LESS_THAN_OR_EQUAL = new AngelScriptTokenType("LESS_THAN_OR_EQUAL");
  IElementType LIST_SEPARATOR = new AngelScriptTokenType("LIST_SEPARATOR");
  IElementType MINUS = new AngelScriptTokenType("MINUS");
  IElementType MOD_ASSIGN = new AngelScriptTokenType("MOD_ASSIGN");
  IElementType MUL_ASSIGN = new AngelScriptTokenType("MUL_ASSIGN");
  IElementType NOT = new AngelScriptTokenType("NOT");
  IElementType NOT_EQUAL = new AngelScriptTokenType("NOT_EQUAL");
  IElementType NOT_IS = new AngelScriptTokenType("NOT_IS");
  IElementType NUMBER = new AngelScriptTokenType("NUMBER");
  IElementType OPEN_BRACKET = new AngelScriptTokenType("OPEN_BRACKET");
  IElementType OPEN_PARENTHESIS = new AngelScriptTokenType("OPEN_PARENTHESIS");
  IElementType OR = new AngelScriptTokenType("OR");
  IElementType OR_ASSIGN = new AngelScriptTokenType("OR_ASSIGN");
  IElementType PERCENT = new AngelScriptTokenType("PERCENT");
  IElementType PLUS = new AngelScriptTokenType("PLUS");
  IElementType POW_ASSIGN = new AngelScriptTokenType("POW_ASSIGN");
  IElementType QUESTION = new AngelScriptTokenType("QUESTION");
  IElementType SCOPE = new AngelScriptTokenType("SCOPE");
  IElementType SHIFT_LEFT_ASSIGN = new AngelScriptTokenType("SHIFT_LEFT_ASSIGN");
  IElementType SHIFT_RIGHT_A_ASSIGN = new AngelScriptTokenType("SHIFT_RIGHT_A_ASSIGN");
  IElementType SHIFT_RIGHT_L_ASSIGN = new AngelScriptTokenType("SHIFT_RIGHT_L_ASSIGN");
  IElementType SLASH = new AngelScriptTokenType("SLASH");
  IElementType STAR = new AngelScriptTokenType("STAR");
  IElementType START_STATEMENT_BLOCK = new AngelScriptTokenType("START_STATEMENT_BLOCK");
  IElementType STAR_STAR = new AngelScriptTokenType("STAR_STAR");
  IElementType STRING = new AngelScriptTokenType("STRING");
  IElementType SUB_ASSIGN = new AngelScriptTokenType("SUB_ASSIGN");
  IElementType UNKNOWN = new AngelScriptTokenType("UNKNOWN");
  IElementType VARIADIC = new AngelScriptTokenType("VARIADIC");
  IElementType XOR = new AngelScriptTokenType("XOR");
  IElementType XOR_ASSIGN = new AngelScriptTokenType("XOR_ASSIGN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == MARKS) {
        return new AngelScriptMarksImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

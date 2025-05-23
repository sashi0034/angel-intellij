// Generated by JFlex 1.9.2 http://jflex.de/  (tweaked for IntelliJ platform)
// source: AngelScript.flex

package com.github.sashi0034.angelintellij.language;

import com.github.sashi0034.angelintellij.psi.AngelScriptTokenTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;


class AngelScriptLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\4"+
    "\1\5\2\0\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\26\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\0\1\40\1\41"+
    "\2\40\1\42\1\40\10\43\1\44\3\43\1\45\4\43"+
    "\1\46\2\43\1\47\1\50\1\51\1\52\1\43\1\0"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\43\1\61"+
    "\1\62\1\43\1\63\1\64\1\65\1\66\1\67\1\70"+
    "\1\43\1\71\1\72\1\73\1\74\1\75\1\76\1\77"+
    "\1\100\1\43\1\101\1\102\1\103\1\104\6\0\1\3"+
    "\u01a2\0\2\3\326\0\u0100\105";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\1\1\4\1\5\1\1"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\2\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\22\25\1\31\1\32\1\33\1\34"+
    "\1\35\2\0\1\36\1\0\1\37\1\40\1\41\1\0"+
    "\1\36\1\0\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\0\1\16\1\50\1\51\5\0\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\10\25\1\62\6\25"+
    "\1\62\1\25\1\62\15\25\1\63\1\64\1\65\1\0"+
    "\1\66\1\67\1\0\1\16\1\0\3\16\1\70\1\71"+
    "\1\72\17\25\1\62\12\25\2\0\1\73\21\25\1\62"+
    "\2\0\10\25\1\50\7\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\106\0\214\0\106\0\322\0\u0118\0\u015e\0\u01a4"+
    "\0\u01ea\0\106\0\106\0\u0230\0\u0276\0\106\0\u02bc\0\u0302"+
    "\0\u0348\0\u038e\0\u03d4\0\u041a\0\106\0\u0460\0\u04a6\0\u04ec"+
    "\0\106\0\u0532\0\106\0\106\0\u0578\0\u05be\0\u0604\0\u064a"+
    "\0\u0690\0\u06d6\0\u071c\0\u0762\0\u07a8\0\u07ee\0\u0834\0\u087a"+
    "\0\u08c0\0\u0906\0\u094c\0\u0992\0\u09d8\0\u0a1e\0\u0a64\0\106"+
    "\0\u0aaa\0\106\0\106\0\106\0\u0af0\0\u0b36\0\u0b7c\0\u0bc2"+
    "\0\106\0\106\0\106\0\u01ea\0\106\0\u0c08\0\u0c4e\0\106"+
    "\0\106\0\106\0\106\0\106\0\u0c94\0\u0cda\0\u0d20\0\106"+
    "\0\u0d66\0\u0dac\0\u0df2\0\u0e38\0\u0e7e\0\106\0\u0ec4\0\106"+
    "\0\106\0\106\0\u0f0a\0\106\0\106\0\u0f50\0\u0f96\0\u0fdc"+
    "\0\u1022\0\u1068\0\u10ae\0\u10f4\0\u113a\0\u1180\0\u11c6\0\u120c"+
    "\0\u1252\0\u1298\0\u12de\0\u1324\0\u0532\0\u136a\0\u13b0\0\u13f6"+
    "\0\u143c\0\u1482\0\u14c8\0\u150e\0\u1554\0\u159a\0\u15e0\0\u1626"+
    "\0\u166c\0\u16b2\0\u16f8\0\u173e\0\106\0\106\0\106\0\u1784"+
    "\0\106\0\106\0\u17ca\0\u0dac\0\u1810\0\u1810\0\u0e38\0\u0e7e"+
    "\0\106\0\106\0\u1856\0\u189c\0\u18e2\0\u1928\0\u196e\0\u19b4"+
    "\0\u19fa\0\u1a40\0\u1a86\0\u1acc\0\u1b12\0\u1b58\0\u1b9e\0\u1be4"+
    "\0\u1c2a\0\u1c70\0\u1cb6\0\u1cfc\0\u1d42\0\u1d88\0\u1dce\0\u1e14"+
    "\0\u1e5a\0\u1ea0\0\u1ee6\0\u1f2c\0\u1f72\0\u1fb8\0\u1ffe\0\106"+
    "\0\u2044\0\u208a\0\u20d0\0\u2116\0\u215c\0\u21a2\0\u21e8\0\u222e"+
    "\0\u2274\0\u22ba\0\u2300\0\u2346\0\u238c\0\u23d2\0\u2418\0\u245e"+
    "\0\u24a4\0\u24ea\0\u2530\0\u2576\0\u25bc\0\u2602\0\u2648\0\u268e"+
    "\0\u26d4\0\u271a\0\u2760\0\u27a6\0\106\0\u27ec\0\u2832\0\u2878"+
    "\0\u28be\0\u2904\0\u294a\0\u2990";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\10\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\7\32\1\33\1\2\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\32\1\44\2\32\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\32\1\60\1\61\1\62\1\63\110\0\2\3"+
    "\140\0\1\64\24\0\1\65\23\0\2\66\1\0\2\66"+
    "\1\67\42\66\1\70\35\66\35\0\1\71\57\0\1\72"+
    "\25\0\1\73\50\0\2\74\1\0\5\74\1\75\37\74"+
    "\1\76\35\74\13\0\1\77\21\0\1\100\64\0\1\101"+
    "\20\0\1\102\66\0\1\103\16\0\1\104\67\0\1\105"+
    "\1\0\11\106\74\0\1\107\14\0\1\110\12\0\1\111"+
    "\54\0\1\106\1\0\11\23\7\0\1\112\1\113\1\0"+
    "\1\114\1\0\1\115\5\0\1\112\2\0\1\113\7\0"+
    "\1\114\7\0\1\115\25\0\1\106\1\0\11\23\10\0"+
    "\1\113\14\0\1\113\60\0\1\116\107\0\1\117\1\120"+
    "\105\0\1\121\105\0\1\122\1\123\70\0\11\32\6\0"+
    "\7\32\4\0\26\32\42\0\1\124\14\0\1\125\54\0"+
    "\11\32\6\0\7\32\4\0\13\32\1\126\5\32\1\127"+
    "\4\32\26\0\11\32\6\0\7\32\4\0\14\32\1\130"+
    "\1\32\1\131\7\32\26\0\11\32\6\0\7\32\4\0"+
    "\1\132\10\32\1\133\2\32\1\134\11\32\26\0\11\32"+
    "\6\0\7\32\4\0\4\32\1\135\7\32\1\136\11\32"+
    "\26\0\11\32\6\0\7\32\4\0\11\32\1\137\1\32"+
    "\1\140\12\32\26\0\11\32\6\0\7\32\4\0\1\141"+
    "\10\32\1\142\2\32\1\143\4\32\1\144\4\32\26\0"+
    "\11\32\6\0\7\32\4\0\5\32\1\145\4\32\1\146"+
    "\1\147\3\32\1\145\6\32\26\0\11\32\6\0\7\32"+
    "\4\0\7\32\1\150\16\32\26\0\11\32\6\0\7\32"+
    "\4\0\1\151\13\32\1\152\4\32\1\153\4\32\26\0"+
    "\11\32\6\0\7\32\4\0\16\32\1\145\2\32\1\152"+
    "\1\154\3\32\26\0\11\32\6\0\7\32\4\0\16\32"+
    "\1\155\7\32\26\0\11\32\6\0\7\32\4\0\4\32"+
    "\1\156\21\32\26\0\11\32\6\0\7\32\4\0\23\32"+
    "\1\157\2\32\26\0\11\32\6\0\7\32\4\0\16\32"+
    "\1\160\6\32\1\161\26\0\11\32\6\0\7\32\4\0"+
    "\7\32\1\162\16\32\26\0\11\32\6\0\7\32\4\0"+
    "\14\32\1\163\11\32\26\0\11\32\6\0\7\32\4\0"+
    "\6\32\1\164\17\32\26\0\11\32\6\0\7\32\4\0"+
    "\14\32\1\143\11\32\42\0\1\165\44\0\1\166\75\0"+
    "\1\167\13\0\2\66\1\0\2\66\1\75\42\66\1\70"+
    "\35\66\5\0\1\170\100\0\2\66\2\0\101\66\1\0"+
    "\2\74\2\0\101\74\36\0\1\171\67\0\1\172\107\0"+
    "\11\106\10\0\1\113\14\0\1\113\26\0\2\107\1\0"+
    "\103\107\13\0\1\173\113\0\2\174\77\0\1\175\1\0"+
    "\1\175\2\0\11\176\75\0\7\177\77\0\11\200\6\0"+
    "\3\200\10\0\6\200\62\0\1\201\105\0\1\202\1\203"+
    "\70\0\11\32\6\0\7\32\4\0\3\32\1\145\22\32"+
    "\26\0\11\32\6\0\7\32\4\0\20\32\1\204\5\32"+
    "\26\0\11\32\6\0\7\32\4\0\14\32\1\205\11\32"+
    "\26\0\11\32\6\0\7\32\4\0\4\32\1\206\21\32"+
    "\26\0\11\32\6\0\7\32\4\0\17\32\1\207\1\210"+
    "\5\32\26\0\11\32\6\0\7\32\4\0\1\211\25\32"+
    "\26\0\11\32\6\0\7\32\4\0\13\32\1\212\12\32"+
    "\26\0\11\32\6\0\7\32\4\0\5\32\1\213\20\32"+
    "\26\0\11\32\6\0\7\32\4\0\21\32\1\214\4\32"+
    "\26\0\11\32\6\0\7\32\4\0\17\32\1\215\6\32"+
    "\26\0\11\32\6\0\7\32\4\0\21\32\1\216\4\32"+
    "\26\0\11\32\6\0\7\32\4\0\11\32\1\137\14\32"+
    "\26\0\11\32\6\0\7\32\4\0\14\32\1\217\11\32"+
    "\26\0\11\32\6\0\7\32\4\0\16\32\1\145\7\32"+
    "\26\0\11\32\6\0\7\32\4\0\13\32\1\220\12\32"+
    "\26\0\11\32\6\0\7\32\4\0\15\32\1\221\10\32"+
    "\26\0\11\32\6\0\7\32\4\0\14\32\1\222\3\32"+
    "\1\223\5\32\26\0\11\32\6\0\7\32\4\0\24\32"+
    "\1\224\1\32\26\0\11\32\6\0\7\32\4\0\12\32"+
    "\1\225\13\32\26\0\11\32\6\0\7\32\4\0\20\32"+
    "\1\145\5\32\26\0\11\32\6\0\7\32\4\0\11\32"+
    "\1\205\14\32\26\0\11\32\6\0\7\32\4\0\4\32"+
    "\1\226\21\32\26\0\11\32\6\0\7\32\4\0\7\32"+
    "\1\227\4\32\1\230\11\32\26\0\11\32\6\0\7\32"+
    "\4\0\20\32\1\231\5\32\26\0\11\32\6\0\7\32"+
    "\4\0\7\32\1\232\16\32\26\0\11\32\6\0\7\32"+
    "\4\0\21\32\1\215\3\32\1\145\26\0\11\32\6\0"+
    "\7\32\4\0\15\32\1\233\10\32\26\0\11\32\6\0"+
    "\7\32\4\0\13\32\1\234\12\32\26\0\11\32\6\0"+
    "\7\32\4\0\7\32\1\126\16\32\26\0\11\32\6\0"+
    "\7\32\4\0\7\32\1\235\16\32\12\0\1\236\37\0"+
    "\1\170\2\0\1\170\21\0\1\170\13\0\13\173\1\0"+
    "\34\173\1\237\35\173\21\0\11\176\111\0\1\240\71\0"+
    "\11\32\6\0\7\32\4\0\14\32\1\145\11\32\26\0"+
    "\11\32\6\0\7\32\4\0\11\32\1\145\14\32\26\0"+
    "\11\32\6\0\7\32\4\0\1\241\25\32\26\0\11\32"+
    "\6\0\7\32\4\0\4\32\1\145\13\32\1\145\5\32"+
    "\26\0\11\32\6\0\7\32\4\0\2\32\1\242\23\32"+
    "\26\0\11\32\6\0\7\32\4\0\17\32\1\243\6\32"+
    "\26\0\11\32\6\0\7\32\4\0\17\32\1\152\1\244"+
    "\5\32\26\0\11\32\6\0\7\32\4\0\1\245\25\32"+
    "\26\0\11\32\6\0\7\32\4\0\1\32\1\235\24\32"+
    "\26\0\11\32\6\0\7\32\4\0\4\32\1\145\21\32"+
    "\26\0\11\32\6\0\7\32\4\0\12\32\1\145\13\32"+
    "\26\0\11\32\6\0\7\32\4\0\1\152\25\32\26\0"+
    "\11\32\6\0\7\32\4\0\2\32\1\246\23\32\26\0"+
    "\11\32\6\0\7\32\4\0\14\32\1\247\11\32\26\0"+
    "\11\32\6\0\7\32\4\0\21\32\1\152\4\32\26\0"+
    "\1\32\1\250\1\32\1\251\2\32\1\252\1\145\1\32"+
    "\6\0\7\32\4\0\4\32\1\253\21\32\26\0\11\32"+
    "\6\0\7\32\4\0\7\32\1\254\16\32\26\0\11\32"+
    "\6\0\7\32\4\0\4\32\1\255\21\32\26\0\11\32"+
    "\6\0\7\32\4\0\16\32\1\256\7\32\26\0\11\32"+
    "\6\0\7\32\4\0\22\32\1\257\3\32\26\0\11\32"+
    "\6\0\7\32\4\0\20\32\1\260\5\32\26\0\11\32"+
    "\6\0\7\32\4\0\21\32\1\261\4\32\26\0\11\32"+
    "\6\0\7\32\4\0\20\32\1\210\5\32\26\0\11\32"+
    "\6\0\7\32\4\0\4\32\1\246\21\32\26\0\11\32"+
    "\6\0\7\32\4\0\20\32\1\262\5\32\26\0\11\32"+
    "\6\0\7\32\4\0\11\32\1\215\14\32\12\0\1\263"+
    "\100\0\13\173\1\264\34\173\1\237\35\173\21\0\11\32"+
    "\6\0\7\32\4\0\10\32\1\145\15\32\26\0\11\32"+
    "\6\0\7\32\4\0\6\32\1\145\17\32\26\0\11\32"+
    "\6\0\7\32\4\0\17\32\1\145\6\32\26\0\11\32"+
    "\6\0\7\32\4\0\7\32\1\265\16\32\26\0\11\32"+
    "\6\0\7\32\4\0\21\32\1\266\4\32\26\0\11\32"+
    "\6\0\7\32\4\0\3\32\1\267\22\32\26\0\11\32"+
    "\6\0\7\32\4\0\16\32\1\152\7\32\26\0\6\32"+
    "\1\145\2\32\6\0\7\32\4\0\26\32\26\0\2\32"+
    "\1\145\6\32\6\0\7\32\4\0\26\32\26\0\4\32"+
    "\1\145\4\32\6\0\7\32\4\0\26\32\26\0\11\32"+
    "\6\0\7\32\4\0\16\32\1\270\7\32\26\0\11\32"+
    "\6\0\7\32\4\0\13\32\1\145\12\32\26\0\11\32"+
    "\6\0\7\32\4\0\17\32\1\271\6\32\26\0\11\32"+
    "\6\0\7\32\4\0\16\32\1\272\7\32\26\0\11\32"+
    "\6\0\7\32\4\0\1\273\25\32\26\0\11\32\6\0"+
    "\7\32\4\0\4\32\1\274\21\32\26\0\11\32\6\0"+
    "\7\32\4\0\16\32\1\254\7\32\26\0\1\32\1\250"+
    "\1\32\1\251\2\32\1\252\1\145\1\32\6\0\7\32"+
    "\4\0\26\32\12\0\1\75\120\0\1\275\106\0\11\32"+
    "\6\0\7\32\4\0\13\32\1\276\12\32\26\0\11\32"+
    "\6\0\7\32\4\0\11\32\1\152\14\32\26\0\11\32"+
    "\6\0\7\32\4\0\4\32\1\277\21\32\26\0\11\32"+
    "\6\0\7\32\4\0\5\32\1\300\20\32\26\0\11\32"+
    "\6\0\7\32\4\0\15\32\1\300\10\32\26\0\11\32"+
    "\6\0\7\32\4\0\7\32\1\301\16\32\26\0\11\32"+
    "\6\0\7\32\4\0\20\32\1\215\5\32\26\0\11\32"+
    "\6\0\7\32\4\0\2\32\1\302\23\32\26\0\11\32"+
    "\6\0\7\32\4\0\21\32\1\215\4\32\26\0\11\32"+
    "\6\0\7\32\4\0\5\32\1\145\20\32\26\0\11\32"+
    "\6\0\7\32\4\0\1\303\25\32\26\0\11\32\6\0"+
    "\7\32\4\0\3\32\1\215\22\32\26\0\11\32\6\0"+
    "\7\32\4\0\20\32\1\304\5\32\26\0\11\32\6\0"+
    "\7\32\4\0\2\32\1\215\23\32\26\0\11\32\6\0"+
    "\7\32\4\0\4\32\1\126\21\32\5\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[10710];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\5\1\2\11\2\1\1\11"+
    "\6\1\1\11\3\1\1\11\1\1\2\11\23\1\1\11"+
    "\1\1\3\11\2\0\1\1\1\0\3\11\1\0\1\11"+
    "\1\0\1\1\5\11\1\0\2\1\1\11\5\0\1\11"+
    "\1\1\3\11\1\1\2\11\37\1\3\11\1\0\2\11"+
    "\1\0\1\1\1\0\3\1\2\11\33\1\2\0\1\11"+
    "\22\1\2\0\10\1\1\11\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AngelScriptLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return AngelScriptTokenTypes.UNKNOWN;
            }
          // fall through
          case 60: break;
          case 2:
            { return TokenType.WHITE_SPACE;
            }
          // fall through
          case 61: break;
          case 3:
            { return AngelScriptTokenTypes.NOT;
            }
          // fall through
          case 62: break;
          case 4:
            { return AngelScriptTokenTypes.PERCENT;
            }
          // fall through
          case 63: break;
          case 5:
            { return AngelScriptTokenTypes.AMP;
            }
          // fall through
          case 64: break;
          case 6:
            { return AngelScriptTokenTypes.OPEN_PARENTHESIS;
            }
          // fall through
          case 65: break;
          case 7:
            { return AngelScriptTokenTypes.CLOSE_PARENTHESIS;
            }
          // fall through
          case 66: break;
          case 8:
            { return AngelScriptTokenTypes.STAR;
            }
          // fall through
          case 67: break;
          case 9:
            { return AngelScriptTokenTypes.PLUS;
            }
          // fall through
          case 68: break;
          case 10:
            { return AngelScriptTokenTypes.LIST_SEPARATOR;
            }
          // fall through
          case 69: break;
          case 11:
            { return AngelScriptTokenTypes.MINUS;
            }
          // fall through
          case 70: break;
          case 12:
            { return AngelScriptTokenTypes.DOT;
            }
          // fall through
          case 71: break;
          case 13:
            { return AngelScriptTokenTypes.SLASH;
            }
          // fall through
          case 72: break;
          case 14:
            { return AngelScriptTokenTypes.NUMBER;
            }
          // fall through
          case 73: break;
          case 15:
            { return AngelScriptTokenTypes.COLON;
            }
          // fall through
          case 74: break;
          case 16:
            { return AngelScriptTokenTypes.END_STATEMENT;
            }
          // fall through
          case 75: break;
          case 17:
            { return AngelScriptTokenTypes.LESS_THAN;
            }
          // fall through
          case 76: break;
          case 18:
            { return AngelScriptTokenTypes.ASSIGNMENT;
            }
          // fall through
          case 77: break;
          case 19:
            { return AngelScriptTokenTypes.GREATER_THAN;
            }
          // fall through
          case 78: break;
          case 20:
            { return AngelScriptTokenTypes.QUESTION;
            }
          // fall through
          case 79: break;
          case 21:
            { return AngelScriptTokenTypes.IDENTIFIER;
            }
          // fall through
          case 80: break;
          case 22:
            { return AngelScriptTokenTypes.OPEN_BRACKET;
            }
          // fall through
          case 81: break;
          case 23:
            { return AngelScriptTokenTypes.CLOSE_BRACKET;
            }
          // fall through
          case 82: break;
          case 24:
            { return AngelScriptTokenTypes.BIT_XOR;
            }
          // fall through
          case 83: break;
          case 25:
            { return AngelScriptTokenTypes.START_STATEMENT_BLOCK;
            }
          // fall through
          case 84: break;
          case 26:
            { return AngelScriptTokenTypes.BIT_OR;
            }
          // fall through
          case 85: break;
          case 27:
            { return AngelScriptTokenTypes.END_STATEMENT_BLOCK;
            }
          // fall through
          case 86: break;
          case 28:
            { return AngelScriptTokenTypes.BIT_NOT;
            }
          // fall through
          case 87: break;
          case 29:
            { return AngelScriptTokenTypes.NOT_EQUAL;
            }
          // fall through
          case 88: break;
          case 30:
            { return AngelScriptTokenTypes.STRING;
            }
          // fall through
          case 89: break;
          case 31:
            { return AngelScriptTokenTypes.MOD_ASSIGN;
            }
          // fall through
          case 90: break;
          case 32:
            { return AngelScriptTokenTypes.AND;
            }
          // fall through
          case 91: break;
          case 33:
            { return AngelScriptTokenTypes.AND_ASSIGN;
            }
          // fall through
          case 92: break;
          case 34:
            { return AngelScriptTokenTypes.STAR_STAR;
            }
          // fall through
          case 93: break;
          case 35:
            { return AngelScriptTokenTypes.MUL_ASSIGN;
            }
          // fall through
          case 94: break;
          case 36:
            { return AngelScriptTokenTypes.INC;
            }
          // fall through
          case 95: break;
          case 37:
            { return AngelScriptTokenTypes.ADD_ASSIGN;
            }
          // fall through
          case 96: break;
          case 38:
            { return AngelScriptTokenTypes.DEC;
            }
          // fall through
          case 97: break;
          case 39:
            { return AngelScriptTokenTypes.SUB_ASSIGN;
            }
          // fall through
          case 98: break;
          case 40:
            { return AngelScriptTokenTypes.COMMENT;
            }
          // fall through
          case 99: break;
          case 41:
            { return AngelScriptTokenTypes.DIV_ASSIGN;
            }
          // fall through
          case 100: break;
          case 42:
            { return AngelScriptTokenTypes.SCOPE;
            }
          // fall through
          case 101: break;
          case 43:
            { return AngelScriptTokenTypes.BIT_SHIFT_LEFT;
            }
          // fall through
          case 102: break;
          case 44:
            { return AngelScriptTokenTypes.LESS_THAN_OR_EQUAL;
            }
          // fall through
          case 103: break;
          case 45:
            { return AngelScriptTokenTypes.EQUAL;
            }
          // fall through
          case 104: break;
          case 46:
            { return AngelScriptTokenTypes.GREATER_THAN_OR_EQUAL;
            }
          // fall through
          case 105: break;
          case 47:
            { return AngelScriptTokenTypes.BIT_SHIFT_RIGHT;
            }
          // fall through
          case 106: break;
          case 48:
            { return AngelScriptTokenTypes.XOR_ASSIGN;
            }
          // fall through
          case 107: break;
          case 49:
            { return AngelScriptTokenTypes.XOR;
            }
          // fall through
          case 108: break;
          case 50:
            { return AngelScriptTokenTypes.KEYWORD;
            }
          // fall through
          case 109: break;
          case 51:
            { return AngelScriptTokenTypes.OR_ASSIGN;
            }
          // fall through
          case 110: break;
          case 52:
            { return AngelScriptTokenTypes.OR;
            }
          // fall through
          case 111: break;
          case 53:
            { return AngelScriptTokenTypes.NOT_IS;
            }
          // fall through
          case 112: break;
          case 54:
            { return AngelScriptTokenTypes.POW_ASSIGN;
            }
          // fall through
          case 113: break;
          case 55:
            { return AngelScriptTokenTypes.VARIADIC;
            }
          // fall through
          case 114: break;
          case 56:
            { return AngelScriptTokenTypes.SHIFT_LEFT_ASSIGN;
            }
          // fall through
          case 115: break;
          case 57:
            { return AngelScriptTokenTypes.SHIFT_RIGHT_L_ASSIGN;
            }
          // fall through
          case 116: break;
          case 58:
            { return AngelScriptTokenTypes.BIT_SHIFT_RIGHT_ARITH;
            }
          // fall through
          case 117: break;
          case 59:
            { return AngelScriptTokenTypes.SHIFT_RIGHT_A_ASSIGN;
            }
          // fall through
          case 118: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

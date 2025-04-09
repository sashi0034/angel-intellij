package com.github.sashi0034.angelintellij.language;

import com.github.sashi0034.angelintellij.lexer.AngelScriptLexerAdapter;
import com.github.sashi0034.angelintellij.psi.AngelScriptFile;
import com.github.sashi0034.angelintellij.psi.AngelScriptPsiLeafNode;
import com.github.sashi0034.angelintellij.psi.AngelScriptTokenTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;

import org.jetbrains.annotations.NotNull;

public class AngelScriptParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(AngelScriptLanguage.INSTANCE);

    private static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);

    private static final TokenSet COMMENTS = TokenSet.create(AngelScriptTokenTypes.LINE_COMMENT,
            AngelScriptTokenTypes.DOC_COMMENT_START,
            AngelScriptTokenTypes.BLOCK_COMMENT_START,
            AngelScriptTokenTypes.BLOCK_COMMENT_END);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new AngelScriptLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return (root, builder) -> {
            builder.mark().done(root);
            return builder.getTreeBuilt();
        };
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return null;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return new AngelScriptPsiLeafNode(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new AngelScriptFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
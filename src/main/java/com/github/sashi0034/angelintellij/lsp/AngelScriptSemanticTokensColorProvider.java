package com.github.sashi0034.angelintellij.lsp;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiFile;
import com.redhat.devtools.lsp4ij.features.semanticTokens.SemanticTokensColorsProvider;
import com.redhat.devtools.lsp4ij.features.semanticTokens.SemanticTokensHighlightingColors;
import org.eclipse.lsp4j.SemanticTokenModifiers;
import org.eclipse.lsp4j.SemanticTokenTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

// Reference: https://github.com/redhat-developer/lsp4ij/blob/main/src/main/java/com/redhat/devtools/lsp4ij/features/semanticTokens/DefaultSemanticTokensColorsProvider.java

public class AngelScriptSemanticTokensColorProvider implements SemanticTokensColorsProvider {


    @Override
    public @Nullable TextAttributesKey getTextAttributesKey(@NotNull String tokenType,
                                                            @NotNull List<String> tokenModifiers,
                                                            @NotNull PsiFile file) {
        switch (tokenType) {

            // namespace: for identifiers that declare or reference a namespace, module, or package.
            case SemanticTokenTypes.Namespace:
                if (hasTokenModifiers(tokenModifiers,
                        SemanticTokenModifiers.Declaration,
                        SemanticTokenModifiers.Definition)) {
                    // with declaration, definition modifiers
                    return SemanticTokensHighlightingColors.NAMESPACE_DECLARATION;
                }
                // with other modifiers
                return SemanticTokensHighlightingColors.NAMESPACE;

            // class: for identifiers that declare or reference a class type.
            case SemanticTokenTypes.Class:
                if (hasTokenModifiers(tokenModifiers,
                        SemanticTokenModifiers.Declaration,
                        SemanticTokenModifiers.Definition)) {
                    // with declaration, definition modifiers
                    return SemanticTokensHighlightingColors.CLASS_DECLARATION;
                }
                // with other modifiers
                return SemanticTokensHighlightingColors.CLASS;

            // enum: for identifiers that declare or reference an enumeration type.
            case SemanticTokenTypes.Enum:
                return SemanticTokensHighlightingColors.ENUM;

            // interface: for identifiers that declare or reference an interface type.
            case SemanticTokenTypes.Interface:
                return SemanticTokensHighlightingColors.INTERFACE;

            // struct: for identifiers that declare or reference a struct type.
            case SemanticTokenTypes.Struct:
                return SemanticTokensHighlightingColors.STRUCT;

            // typeParameter: for identifiers that declare or reference a type parameter.
            case SemanticTokenTypes.TypeParameter:
                return SemanticTokensHighlightingColors.TYPE_PARAMETER;

            // type: for identifiers that declare or reference a type that is not covered above.
            case SemanticTokenTypes.Type:
                return SemanticTokensHighlightingColors.TYPE;

            // parameter: for identifiers that declare or reference a function or method parameters.
            case SemanticTokenTypes.Parameter:
                return SemanticTokensHighlightingColors.PARAMETER;

            // variable: for identifiers that declare or reference a local or global variable.
            case SemanticTokenTypes.Variable:
                if (hasTokenModifiers(tokenModifiers, SemanticTokenModifiers.Static)) {
                    if (hasTokenModifiers(tokenModifiers, SemanticTokenModifiers.Readonly)) {
                        // with static, readonly modifiers
                        return SemanticTokensHighlightingColors.STATIC_READONLY_VARIABLE;
                    }
                    // with static readonly modifiers
                    return SemanticTokensHighlightingColors.STATIC_VARIABLE;
                }
                if (hasTokenModifiers(tokenModifiers, SemanticTokenModifiers.Readonly)) {
                    // with readonly modifiers
                    return SemanticTokensHighlightingColors.READONLY_VARIABLE;
                }
                // with other modifiers
                return SemanticTokensHighlightingColors.VARIABLE;

            // property: for identifiers that declare or reference a member property, member field, or member variable.
            case SemanticTokenTypes.Property:
                if (hasTokenModifiers(tokenModifiers, SemanticTokenModifiers.Static)) {
                    if (hasTokenModifiers(tokenModifiers, SemanticTokenModifiers.Readonly)) {
                        // with static, readonly modifiers
                        return SemanticTokensHighlightingColors.STATIC_READONLY_PROPERTY;
                    }
                    // with static readonly modifiers
                    return SemanticTokensHighlightingColors.STATIC_PROPERTY;
                }
                if (hasTokenModifiers(tokenModifiers, SemanticTokenModifiers.Readonly)) {
                    // with readonly modifiers
                    return SemanticTokensHighlightingColors.READONLY_PROPERTY;
                }
                // with other modifiers
                return SemanticTokensHighlightingColors.PROPERTY;

            // enum member: for identifiers that declare or reference an enumeration property, constant, or member.
            case SemanticTokenTypes.EnumMember:
                return SemanticTokensHighlightingColors.ENUM_MEMBER;

            // decorator: for identifiers that declare or reference decorators and annotations.
            case SemanticTokenTypes.Decorator:
                return SemanticTokensHighlightingColors.DECORATOR;

            // event: for identifiers that declare an event property.
            case SemanticTokenTypes.Event:
                return SemanticTokensHighlightingColors.EVENT;

            // function: for identifiers that declare a function.
            case SemanticTokenTypes.Function:
                if (hasTokenModifiers(tokenModifiers,
                        SemanticTokenModifiers.DefaultLibrary)) {
                    // with defaultLibrary modifiers
                    return SemanticTokensHighlightingColors.DEFAULT_LIBRARY_FUNCTION;
                }
                if (hasTokenModifiers(tokenModifiers,
                        SemanticTokenModifiers.Declaration,
                        SemanticTokenModifiers.Definition)) {
                    // with declaration, definition modifiers
                    return SemanticTokensHighlightingColors.FUNCTION_DECLARATION;
                }
                // with other modifiers
                return SemanticTokensHighlightingColors.FUNCTION;

            // method: for identifiers that declare a member function or method.
            case SemanticTokenTypes.Method: {
                if (hasTokenModifiers(tokenModifiers,
                        SemanticTokenModifiers.Declaration,
                        SemanticTokenModifiers.Definition)) {
                    // with declaration, definition modifiers
                    return SemanticTokensHighlightingColors.METHOD_DECLARATION;
                }
                if (hasTokenModifiers(tokenModifiers,
                        SemanticTokenModifiers.Static)) {
                    // with static modifiers
                    return SemanticTokensHighlightingColors.STATIC_METHOD;
                }
                // with other modifiers
                return SemanticTokensHighlightingColors.METHOD;
            }

            // macro: for identifiers that declare a macro.
            case SemanticTokenTypes.Macro:
            case "directive": // unique to angel-lsp
                return SemanticTokensHighlightingColors.MACRO;

            // label: for identifiers that declare a label.
            case "label":
                // LSP doesn't define "label", but vscode defines it
                // See https://code.visualstudio.com/api/language-extensions/semantic-highlight-guide#standard-token-types-and-modifiers
                return SemanticTokensHighlightingColors.LABEL;

            // comment: for tokens that represent a comment.
            case SemanticTokenTypes.Comment:
                return SemanticTokensHighlightingColors.COMMENT;

            // string: for tokens that represent a string literal.
            case SemanticTokenTypes.String:
                return SemanticTokensHighlightingColors.STRING;

            // keyword: for tokens that represent a language keyword.
            case SemanticTokenTypes.Keyword:
            case "builtin": // unique to angel-lsp
                return SemanticTokensHighlightingColors.KEYWORD;

            // number: for tokens that represent a number literal.
            case SemanticTokenTypes.Number:
                return SemanticTokensHighlightingColors.NUMBER;

            // regexp: for tokens that represent a regular expression literal.
            case SemanticTokenTypes.Regexp:
                return SemanticTokensHighlightingColors.REGEXP;

            // modifier
            case SemanticTokenTypes.Modifier:
                return SemanticTokensHighlightingColors.MODIFIER;

            // operator
            case SemanticTokenTypes.Operator:
                return SemanticTokensHighlightingColors.OPERATOR;

        }
        return null;
    }

    protected boolean hasTokenModifiers(List<String> tokenModifiers, String... checkedTokenModifiers) {
        if (tokenModifiers.isEmpty()) {
            return false;
        }
        for (var modifier : checkedTokenModifiers) {
            if (tokenModifiers.contains(modifier)) {
                return true;
            }
        }
        return false;
    }

}
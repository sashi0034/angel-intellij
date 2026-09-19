package com.github.sashi0034.angelintellij.lsp;

import com.redhat.devtools.lsp4ij.settings.contributors.LanguageServerSettingsContributorBase;
import com.redhat.devtools.lsp4ij.settings.contributors.ServerConfigurationContributor;

public class AngelScriptLanguageServerSettingsContributor extends LanguageServerSettingsContributorBase {
    public AngelScriptLanguageServerSettingsContributor() {
        super.setServerConfigurationContributor(new AngelScriptServerConfigurationContributor());
    }

    private static class AngelScriptServerConfigurationContributor implements ServerConfigurationContributor {

        @Override
        public String getDefaultConfigurationContent() {
            // language=json
            return """
                  {
                    "angelScript.suppressAnalyzerErrors": false,
                    "angelScript.includePath": [],
                    "angelScript.forceIncludePredefined": [],
                    "angelScript.implicitMutualInclusion": false,
                    "angelScript.hoistEnumParentScope": false,
                    "angelScript.explicitPropertyAccessor": false,
                    "angelScript.allowUnicodeIdentifiers": false,
                    "angelScript.supportsForEach": true,
                    "angelScript.characterLiterals": false,
                    "angelScript.suppodtsDigitSeparators": false,
                    "angelScript.builtinStringType": "string",
                    "angelScript.builtinArrayType": "array",
                    "angelScript.definedSymbols": [],
                    "angelScript.completion.builtinKeywords": true,
                    "angelScript.completion.snippets": true,
                    "angelScript.files.angelScript": ["*.as"],
                    "angelScript.formatter.maxBlankLines": 1,
                    "angelScript.formatter.indentSpaces": 4,
                    "angelScript.formatter.useTabIndent": false,
                    "angelScript.trace.server": false
                  }""";
        }

        @Override
        public String getDefaultConfigurationSchemaContent() {
            // schema generate by hand from `server/src/core/settings.js` in the language server
            // language=json
            return """                  
                  {
                    "$schema": "http://json-schema.org/draft-07/schema#",
                    "$id": "LSP4IJ/angelscript/settings.schema.json",
                    "title": "LSP4IJ angelscript server settings JSON schema",
                    "description": "JSON schema for angelscript server settings.",
                    "type": "object",
                    "additionalProperties": false,
                    "properties": {
                        "angelScript.suppressAnalyzerErrors": {
                            "type": "boolean",
                            "title": "AngelScript: Suppress analyzer errors"
                        },
                        "angelScript.includePath": {
                            "type": "array",
                            "title": "AngelScript: additional include paths",
                            "description": "places to search for files to include"
                        },
                        "angelScript.forceIncludePredefined": {
                            "type": "array",
                            "title": "AngelScript: files to force-include",
                            "description": "list of files to be included before compiling any other file"
                        },
                        "angelScript.implicitMutualInclusion": {
                            "type": "boolean",
                            "description": "Tells the language server to combine all your files into one big file before compiling"
                        },
                        "angelScript.hoistEnumParentScope": {
                            "type": "boolean"
                        },
                        "angelScript.explicitPropertyAccessor": {
                            "type": "boolean"
                        },
                        "angelScript.allowUnicodeIdentifiers": {
                            "type": "boolean"
                        },
                        "angelScript.supportsForEach": {
                            "type": "boolean"
                        },
                        "angelScript.characterLiterals": {
                            "type": "boolean"
                        },
                        "angelScript.supportsTypedEnumerations": {
                            "type": "boolean"
                        },
                        "angelScript.supportsDigitSeparators": {
                            "type": "boolean"
                        },
                        "angelScript.builtinStringType": {
                            "type": "string",
                            "description": "the AngelScript type name for the default string type"
                        },
                        "angelScript.builtinArrayType": {
                            "type": "string"
                          },
                        "angelScript.definedSymbols": {
                            "type": "array"
                        },
                        "angelScript.completion.builtinKeywords": {
                            "type": "boolean",
                            "default": true
                        },
                        "angelScript.completion.snippets": {
                            "type": "boolean",
                            "default": true
                        },
                        "angelScript.files.angelScript": {
                            "type": "array",
                            "description": "file extensions of your AngelScript files"
                        },
                        "angelScript.files.exclude": {
                            "type": "array"
                        },
                        "angelScript.formatter.maxBlankLines": {
                            "type": "integer",
                            "minimum": 0
                        },
                        "angelScript.formatter.indentSpaces": {
                            "type": "integer",
                            "minimum": 0
                        },
                        "angelScript.formatter.useTabIndent": {
                            "type": "boolean"
                        },
                        "angelScript.trace.server": {
                            "type": "string",
                            "enum": [
                              "off",
                              "messages",
                              "verbose"
                            ]
                        }
                    }
                  }""";
        }
    }
}

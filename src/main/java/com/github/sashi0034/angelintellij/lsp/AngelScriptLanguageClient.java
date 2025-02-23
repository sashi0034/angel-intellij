package com.github.sashi0034.angelintellij.lsp;

import com.intellij.openapi.project.Project;
import com.redhat.devtools.lsp4ij.client.LanguageClientImpl;

public class AngelScriptLanguageClient extends LanguageClientImpl {
    public AngelScriptLanguageClient(Project project) {
        super(project);
    }
}
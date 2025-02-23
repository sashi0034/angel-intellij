package com.github.sashi0034.angelintellij.lsp;

import com.intellij.openapi.project.Project;
import com.redhat.devtools.lsp4ij.LanguageServerFactory;
import com.redhat.devtools.lsp4ij.client.LanguageClientImpl;
import com.redhat.devtools.lsp4ij.server.StreamConnectionProvider;
import org.jetbrains.annotations.NotNull;

public class AngelScriptLanguageServerFactory implements LanguageServerFactory {
    @Override
    public @NotNull StreamConnectionProvider createConnectionProvider(@NotNull Project project) {
        return new AngelScriptConnectionProvider();
    }

    @Override // If you need to provide client specific features
    public @NotNull LanguageClientImpl createLanguageClient(@NotNull Project project) {
        return new AngelScriptLanguageClient(project);
    }

//    @Override // If you need to expose a custom server API
//    public @NotNull Class<? extends LanguageServer> getServerInterface() {
//        return AngelScriptCustomServer.class;
//    }
}


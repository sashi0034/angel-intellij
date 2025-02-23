package com.github.sashi0034.angelintellij.lsp;

import com.intellij.execution.configurations.GeneralCommandLine;
import com.redhat.devtools.lsp4ij.server.OSProcessStreamConnectionProvider;

public class AngelScriptConnectionProvider extends OSProcessStreamConnectionProvider {

    public AngelScriptConnectionProvider() {
        GeneralCommandLine commandLine = new GeneralCommandLine(
                "node",
                "C:\\dev\\lang\\angel-lsp\\server\\out\\server.js",
                "--stdio"); // FIXME
        super.setCommandLine(commandLine);
    }
}
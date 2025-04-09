package com.github.sashi0034.angelintellij.lsp;

import com.intellij.execution.configurations.GeneralCommandLine;
import com.redhat.devtools.lsp4ij.server.OSProcessStreamConnectionProvider;
import org.apache.commons.compress.utils.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class AngelScriptConnectionProvider extends OSProcessStreamConnectionProvider {
    public AngelScriptConnectionProvider() {
        InputStream input = getClass().getResourceAsStream("/js/angelscript-language-server.js");
        if (input == null) {
            throw new IllegalStateException("Can't find js/angelscript-language-serve.js");
        }

        try {
            // Create a temporary file for the js/angelscript-language-serve.js
            File tempJsFile = File.createTempFile("angelscript-language-serve", ".js");
            try (FileOutputStream fos = new FileOutputStream(tempJsFile)) {
                input.transferTo(fos); // IOUtils.copy(input, fos);
            } catch (IOException e) {
                throw new IllegalStateException("Can't create a temporary file for js/angelscript-language-serve.js", e);
            }

            // Build the command line
            GeneralCommandLine commandLine = new GeneralCommandLine(
                    "node",
                    tempJsFile.getAbsolutePath(),
                    "--stdio");

            super.setCommandLine(commandLine);
        } catch (IOException e) {
            throw new IllegalStateException("Can't create a temporary file for js/angelscript-language-serve.js", e);
        }
    }
}
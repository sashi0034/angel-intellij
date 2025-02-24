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
        // TODO: npx esbuild src/server.ts --bundle --outfile=server-bundle.js --minify --platform=node のスクリプトを書く

        InputStream input = getClass().getResourceAsStream("/js/server-bundle.js");
        if (input == null) {
            throw new IllegalStateException("Can't find js/server-bundle.js");
        }

        try {
            // Create a temporary file for the js/server-bundle.js
            File tempJsFile = File.createTempFile("as-server-bundle", ".js");
            try (FileOutputStream fos = new FileOutputStream(tempJsFile)) {
                IOUtils.copy(input, fos);
            } catch (IOException e) {
                throw new IllegalStateException("Can't create a temporary file for js/server-bundle.js", e);
            }

            // Build the command line
            GeneralCommandLine commandLine = new GeneralCommandLine(
                    "node",
                    tempJsFile.getAbsolutePath(),
                    "--stdio");

            super.setCommandLine(commandLine);
        } catch (IOException e) {
            throw new IllegalStateException("Can't create a temporary file for js/server-bundle.js", e);
        }
    }
}
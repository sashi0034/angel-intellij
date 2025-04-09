package com.github.sashi0034.angelintellij.psi;

import com.github.sashi0034.angelintellij.language.AngelScriptFileType;
import com.github.sashi0034.angelintellij.language.AngelScriptLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class AngelScriptFile extends PsiFileBase {
    public AngelScriptFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, AngelScriptLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return AngelScriptFileType.INSTANCE;
    }
}
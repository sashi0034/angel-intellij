package com.github.sashi0034.angelintellij.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class AngelScriptFileType extends LanguageFileType {

    public static final AngelScriptFileType INSTANCE = new AngelScriptFileType();

    private AngelScriptFileType() {
        super(AngelScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "AngelScript";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "AngelScript source file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "as";
    }

    @Override
    public Icon getIcon() {
        return AngelScriptIcon.AS;
    }
}
package com.github.sashi0034.angelintellij.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class AngelScriptPredefinedFileType extends LanguageFileType {

    public static final AngelScriptPredefinedFileType INSTANCE = new AngelScriptPredefinedFileType();

    private AngelScriptPredefinedFileType() {
        super(AngelScriptPredefinedLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "AngelScript Predefined";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "AngelScript predefined file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "predefined";
    } // FIXME: as.predefined?

    @Override
    public Icon getIcon() {
        return AngelScriptIcon.AS_PREDEFINED;
    }
}
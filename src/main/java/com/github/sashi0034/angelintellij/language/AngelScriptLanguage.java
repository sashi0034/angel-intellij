package com.github.sashi0034.angelintellij.language;

import com.intellij.lang.Language;

public class AngelScriptLanguage extends Language {
    public static final AngelScriptLanguage INSTANCE = new AngelScriptLanguage();

    private AngelScriptLanguage() {
        super("AngelScript");
    }
}

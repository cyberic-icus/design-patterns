package org.example.facade.Translator;

import org.example.facade.Language;

public interface TranslatorFactory {
    static Translator getTranslator(Language language) {
        return switch (language) {
            case C -> new TranslatorC();
            case Cpp -> new TranslatorCpp();
        };
    }
}

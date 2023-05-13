package org.example.facade.preprocessor;

import org.example.facade.Language;

public interface PreprocessorFactory {
    static Preprocessor getPreprocessor(Language language) {
        return switch (language) {
            case C -> new PreprocessorC();
            case Cpp -> new PreprocessorCpp();
        };
    }
}

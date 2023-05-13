package org.example.facade;

import org.example.facade.Translator.Translator;
import org.example.facade.Translator.TranslatorFactory;
import org.example.facade.assebler.Assembler;
import org.example.facade.assebler.AssemblerFactory;
import org.example.facade.preprocessor.Preprocessor;
import org.example.facade.preprocessor.PreprocessorFactory;

import java.io.File;

public class CppCompilerFacade {

    public File compile(File source, Language language) {
        Preprocessor preprocessor = PreprocessorFactory.getPreprocessor(language);
        Translator translator = TranslatorFactory.getTranslator(language);
        Assembler assembler = AssemblerFactory.getAssembler(language);
        Linker linker = new Linker();
        return linker.link(assembler.assemble(translator.translate(preprocessor.preprosess(source))));
    }
}

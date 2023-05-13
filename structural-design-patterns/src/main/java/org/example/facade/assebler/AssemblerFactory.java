package org.example.facade.assebler;

import org.example.facade.Language;

public interface AssemblerFactory {

    static Assembler getAssembler(Language language) {
        return switch (language) {
            case C -> new AssemblerC();
            case Cpp -> new AssemblerCpp();
        };
    }
}

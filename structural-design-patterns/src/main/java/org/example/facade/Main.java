package org.example.facade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        CppCompilerFacade compilerFacade = new CppCompilerFacade();
        compilerFacade.compile(new File("as.cpp"), Language.Cpp);
    }
}

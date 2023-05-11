package org.example.proxy;

import java.io.IOException;

public class WolframAlphaService {
    WolframAlphaInterface wolframAlphaInterface;

    public WolframAlphaService(WolframAlphaInterface wolframAlphaInterface) {
        this.wolframAlphaInterface = wolframAlphaInterface;
    }

    public String calculateComplexExpression(String expression) throws IOException {
        return wolframAlphaInterface.calculateExpression(expression);
    }
}

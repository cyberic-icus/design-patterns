package org.example.proxy;

import java.io.IOException;

public interface WolframAlphaInterface {

    String calculateExpression(String expression) throws IOException;

}

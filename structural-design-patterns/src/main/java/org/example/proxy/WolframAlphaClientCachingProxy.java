package org.example.proxy;

import java.io.IOException;
import java.util.HashMap;

public class WolframAlphaClientCachingProxy implements WolframAlphaInterface {
    private final HashMap<String, String> cache = new HashMap();
    private final WolframAlphaClient wolframAlphaClient;

    public WolframAlphaClientCachingProxy() {
        this.wolframAlphaClient = new WolframAlphaClient();
    }

    @Override
    public String calculateExpression(String expression) throws IOException {
        String result = cache.get(expression);
        if (result == null) {
            return wolframAlphaClient.calculateExpression(expression);
        } else {
            return result;
        }
    }
}

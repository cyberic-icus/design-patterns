package org.example.proxy;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WolframAlphaInterface client = new WolframAlphaClient();
        WolframAlphaInterface proxy = new WolframAlphaClientCachingProxy();

        System.out.println(
                new WolframAlphaService(client).calculateComplexExpression("log10 2e^4")
        );

        System.out.println(
                new WolframAlphaService(proxy).calculateComplexExpression("log10 2e^4")
        );
    }
}

package org.example.proxy;

import org.example.adapter.JsonRequest;
import org.example.adapter.JsonRequestAdapter;
import org.example.adapter.LibraryHttpClient;

import java.io.IOException;

public class WolframAlphaClient implements WolframAlphaInterface {
    public static final String URL = "http://api.wolframalpha.org/calculate";

    @Override
    public String calculateExpression(String expression) throws IOException {
        var client2 = new LibraryHttpClient(URL);
        var jsonData = new JsonRequest("{}");
        var adapter = new JsonRequestAdapter(jsonData);
        return client2.sendXmlString(adapter);

    }
}

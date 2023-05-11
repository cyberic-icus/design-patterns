package org.example.adapter;

import java.net.URLConnection;

public class JsonRequest {
    private final String jsonBody;

    public JsonRequest(String jsonBody) {
        this.jsonBody = jsonBody;
    }

    public void setJsonConnectionProperties(URLConnection urlCon, boolean setCaches) {
        urlCon.setDoOutput(true);
        urlCon.setDoInput(true);
        urlCon.setUseCaches(setCaches);

        urlCon.setRequestProperty("Content-Type", "text/json");
        urlCon.setRequestProperty("Content-length", String.valueOf(jsonBody.getBytes().length));

    }

    public String getJsonBody() {
        return jsonBody;
    }
}

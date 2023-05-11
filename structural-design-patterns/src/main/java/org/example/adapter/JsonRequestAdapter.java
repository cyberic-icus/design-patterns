package org.example.adapter;

import java.net.URLConnection;

public class JsonRequestAdapter extends XMLRequest {

    private final JsonRequest jsonRequest;

    public JsonRequestAdapter(JsonRequest jsonRequest) {
        super(jsonRequest.getJsonBody());
        this.jsonRequest = jsonRequest;
    }

    @Override
    public void configureXmlConnection(URLConnection urlCon) {
        jsonRequest.setJsonConnectionProperties(urlCon, true);
    }

    @Override
    public String getXmlBody() {
        return jsonRequest.getJsonBody();
    }
}

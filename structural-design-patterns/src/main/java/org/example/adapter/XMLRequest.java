package org.example.adapter;

import java.net.URLConnection;

public class XMLRequest {
    private final String xmlBody;

    public XMLRequest(String xmlBody) {
        this.xmlBody = xmlBody;
    }

    public void configureXmlConnection(URLConnection urlCon) {
        urlCon.setDoOutput(true);
        urlCon.setDoInput(true);
        urlCon.setUseCaches(false);

        urlCon.setRequestProperty("Content-Type", "text/xml");
        urlCon.setRequestProperty("Content-length", String.valueOf(xmlBody.getBytes().length));

    }

    public String getXmlBody() {
        return xmlBody;
    }
}

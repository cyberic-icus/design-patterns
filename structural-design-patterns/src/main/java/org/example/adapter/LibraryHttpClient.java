package org.example.adapter;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class LibraryHttpClient {
    public final String url;

    public LibraryHttpClient(String url) {
        this.url = url;
    }

    public String sendXmlString(XMLRequest xmlString) throws IOException {
        String resp = null;

        try {
            URL url = new URL(this.url);
            URLConnection urlCon = url.openConnection();

            xmlString.configureXmlConnection(urlCon);

            try (var input = new DataInputStream(urlCon.getInputStream());
                 var out = new java.io.ByteArrayOutputStream()
            ) {
                byte[] bufferByte = xmlString.getXmlBody().getBytes();
                int l;

                while ((l = input.read(bufferByte)) > -1) {
                    out.write(bufferByte, 0, l);
                    out.flush();
                }
                l = -1;
                var response = new StringBuilder();
                while ((l = input.read(bufferByte)) > -1) {
                    response.append(input.readLine());
                }
                resp = response.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }
}

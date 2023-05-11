package org.example.adapter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var client1 = new LibraryHttpClient("http://127.0.0.1:8081");
        var xmlData = new XMLRequest("\"<?xml version='1.0' encoding='gb2312'?>\"\n" +
                "                + \"<Req>\"\n" +
                "                + \"<EventContentReq>\"\n" +
                "                + \"<EventID>101</EventID >\"\n" +
                "                + \"</EventContentReq>\"\n" +
                "                + \"</Req>\"");
        client1.sendXmlString(xmlData);

        var client2 = new LibraryHttpClient("http://127.0.0.1:8080");
        var jsonData = new JsonRequest("{}");
        var adapter = new JsonRequestAdapter(jsonData);
        client2.sendXmlString(adapter);
    }
}

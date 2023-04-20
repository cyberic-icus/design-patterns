package org.example.factorymethod;

public class Safari extends Browser {
    @Override
    public String renderHTML() {
        return "<html><body>Hello, Safari!</body></html>";
    }
}

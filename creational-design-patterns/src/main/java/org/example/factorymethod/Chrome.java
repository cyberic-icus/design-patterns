package org.example.factorymethod;

public class Chrome extends Browser {
    @Override
    public String renderHTML() {
        return "<html><body>Hello, Chrome!</body></html>";
    }
}

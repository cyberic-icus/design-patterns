package org.example.factorymethod;

public class Safari extends Browser {
    @Override
    public boolean isOpenSource() {
        return true;
    }

    @Override
    public boolean hasPlugins() {
        return false;
    }

    @Override
    public String renderHTML() {
        return "<html><body>Hello, Safari!</body></html>";
    }
}

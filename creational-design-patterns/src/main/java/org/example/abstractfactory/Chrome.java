package org.example.abstractfactory;

public class Chrome extends Browser {
    @Override
    public boolean isOpenSource() {
        return false;
    }

    @Override
    public boolean hasPlugins() {
        return true;
    }

    @Override
    public String renderHTML() {
        return "<html><body>Hello, Chrome!</body></html>";
    }
}

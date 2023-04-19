package org.example.abstractfactory;

public class MacOS extends OperatingSystem {
    @Override
    public Browser getBrowser() {
        return new Safari();
    }
}

package org.example.abstractfactory;

public abstract class OperatingSystem {
    public String launchBrowser() {
        Browser browser = getBrowser();
        return browser.renderHTML();
    }

    public abstract Browser getBrowser();
}

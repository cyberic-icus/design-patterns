package org.example.abstractfactory;

public abstract class OperatingSystem {
    public String launchBrowser() {
        Browser browser = getBrowser();
        return browser.renderHTML();
    }
    
    public void execute() {
        Arch arch = getArch();
        arch.execute();
    }

    public abstract Browser getBrowser();
    public abstract Arch getArch();
}

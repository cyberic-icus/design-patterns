package org.example.factorymethod;

public abstract class Browser {
    public void openSite() {
        executeJS();
        renderHTML();
    }

    private void executeJS();

    public abstract String renderHTML();
}

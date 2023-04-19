package org.example.factorymethod;

public class Main {

    public static void main(String[] args) {
        Browser browser = getBrowser(args[0]);
        System.out.println(browser.renderHTML());
    }

    public static Browser getBrowser(String os) {
        return os.equals("MacOS") ? new Safari() : new Chrome();
    }
}

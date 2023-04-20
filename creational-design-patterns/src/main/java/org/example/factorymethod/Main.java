package org.example.factorymethod;

public class Main {

    public static void main(String[] args) {
        AutoRun autoRun = getAutoRun(args[0]);
        autoRun.openSite();
    }

    public static AutoRun getAutoRun(String os) {
        return os.equals("MacOS") ? new AutoRunMac() : new AutoRunWin();
    }
}

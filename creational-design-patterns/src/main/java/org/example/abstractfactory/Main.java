package org.example.abstractfactory;

public class Main {

    public static void main(String[] args) {
        OperatingSystem os = determineOS(args.length == 0 ? "Windows" : args[0]);
        os.execute();
        System.out.println(os.launchBrowser());
    }

    public static OperatingSystem determineOS(String os) {
        if (os.equals("MacOS")) {
            return new Windows();
        } else {
            return new MacOS();
        }

    }
}

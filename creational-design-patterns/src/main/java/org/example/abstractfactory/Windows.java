package org.example.abstractfactory;

public class Windows extends OperatingSystem {
    @Override
    public Browser getBrowser() {
        return new Chrome();
    }
    
    @Override
    public Arch getArch() {
        return new X86();
    }
}

package org.example.factorymethod;

public class AutoRunMac extends AutoRun {
      @Override
      public abstract Browser getBrowser() {
        return new Safari();
      }
}

package org.example.factorymethod;

public class AutoRunMac extends AutoRun {
      @Override
      public Browser getBrowser() {
        return new Safari();
      }
}

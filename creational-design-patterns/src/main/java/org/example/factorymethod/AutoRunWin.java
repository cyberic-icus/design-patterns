package org.example.factorymethod;

public class AutoRunWin extends AutoRun {
      @Override
      public abstract Browser getBrowser() {
        return new Chrome();
      }
    
}

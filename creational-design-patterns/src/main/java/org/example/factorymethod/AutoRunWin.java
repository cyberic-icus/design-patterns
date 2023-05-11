package org.example.factorymethod;

public class AutoRunWin extends AutoRun {
      @Override
      public Browser getBrowser() {
        return new Chrome();
      }
    
}

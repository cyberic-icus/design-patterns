public abstract class AutoRun {

      public void openSite() {
        Browser browser = getBrowser();
        browser.executeJS();
        browser.renderHTML();
      }
      
      public abstract Browser getBrowser();
    
}

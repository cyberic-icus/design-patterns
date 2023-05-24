package observer;

import observer.listener.EmailNotificationListener;
import observer.listener.JiraWatchersListener;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JiraPage jiraPage = new JiraPage();
        var watcher = new ArrayList<String>();
        var mods = new ArrayList<String>();
        jiraPage.events.subscribe("updated", new JiraWatchersListener(watcher));
        jiraPage.events.subscribe("deleted", new EmailNotificationListener(mods));

        try {
            jiraPage.change("sampleUrl", "adlsa;ld;askl;dka;kld;alskldl;as;ll;");
            jiraPage.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
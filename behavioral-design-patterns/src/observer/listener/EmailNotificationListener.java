package observer.listener;

import java.io.File;
import java.util.List;

public class EmailNotificationListener implements EventListener {
    private List<String> emails;

    public EmailNotificationListener(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void update(String eventType, File file) {
        sendEmail("JiraPage was " + eventType + " : " + file.getName());
    }

    private void sendEmail(String s) {

    }
}
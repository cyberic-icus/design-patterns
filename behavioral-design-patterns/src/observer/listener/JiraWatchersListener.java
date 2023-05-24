package observer.listener;

import java.io.File;
import java.util.List;

public class JiraWatchersListener implements EventListener {
    private List<String> watchers;

    public JiraWatchersListener(List<String> watchers) {
        this.watchers = watchers;
    }

    @Override
    public void update(String eventType, File file) {
        createJiraNotification();
    }

    private void createJiraNotification() {

    }
}
package observer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class JiraPage {
    public EventManager events;
    private File file;

    public JiraPage() {
        this.events = new EventManager("updated", "deleted");
    }

    public void change(String filePath, String text) throws IOException {
        this.file = new File(filePath);
        Files.writeString(file.toPath(), text);
        events.notify("updated", file);
    }

    public void delete() throws Exception {
        if (this.file != null) {
            Files.delete(file.toPath());
            events.notify("deleted", file);
        } else {
            throw new Exception("Already deleted.");
        }
    }
}
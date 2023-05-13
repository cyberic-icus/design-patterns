package org.example.comsite;

import org.example.comsite.imagetask.Task;

import java.util.ArrayList;
import java.util.List;

public class ImageTaskComposite implements Task {
    private List<Task> tasks = new ArrayList<>();

    @Override
    public void process() {
        for(Task task : tasks) {
            task.process();
        }
    }

    public void remove(Task task) {
        tasks.remove(task);
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public void clear() {
        tasks.clear();
    }
}

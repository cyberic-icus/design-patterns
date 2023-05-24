package command.imagetask;

import java.util.Stack;

public class CommandHistory {
    private final Stack<TaskCommand> history = new Stack<>();

    public void push(TaskCommand c) {
        history.push(c);
    }

    public TaskCommand pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
package command;


import command.imagetask.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final CommandHistory history = new CommandHistory();

    public static void main(String[] args) throws IOException {
        var data = new FileInputStream("test.jpg").readAllBytes();
        var photo = new Photo(data);
        var scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        while (!nextLine.equals("exit")) {
            if (nextLine.equals("undoLast")) {
                undo();
            } else {
                var command = switch (nextLine) {
                    case "Filtration" -> new Filtration(photo);
                    case "Diagnosis" -> new Diagnosis(photo);
                    case "PreProsess" -> new PreProsess(photo);
                    default -> null;
                };
                if (command != null) {
                    executeCommand(command);
                }
            }

            nextLine = scanner.nextLine();
        }
    }

    private static void executeCommand(TaskCommand command) {
        if (command.process()) {
            history.push(command);
        }
    }

    private static void undo() {
        if (history.isEmpty()) return;
        TaskCommand command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}

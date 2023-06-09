package org.example.bridge.player;

import java.io.IOException;
import java.nio.file.Path;

public interface Player {
    void play(Path file) throws IOException;
}

package org.example.bridge;

import javax.swing.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;

public class VideoPlayer extends JFrame implements Player {

    private final Codec codec;

    public VideoPlayer(Codec codec) {
        this.codec = codec;
    }

    @Override
    public void play(Path file) throws IOException {
        codec.decompress(String.valueOf(file));
        JFileChooser fileChooser = new JFileChooser(file.toFile());

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            URL mediaURL = null;

            try {
                mediaURL = fileChooser.getSelectedFile().toURL();
            } catch (MalformedURLException malformedURLException) {
                System.err.println("Could not create URL for the file");
            }

            if (mediaURL != null) {
                JFrame mediaTest = new JFrame("Media Tester");

                mediaTest.setSize(300, 300);
                mediaTest.setVisible(true);
            }
        }
        codec.compress(String.valueOf(file));
    }
}
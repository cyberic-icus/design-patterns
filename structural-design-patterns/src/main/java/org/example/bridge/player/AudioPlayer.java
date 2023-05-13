package org.example.bridge.player;

import org.example.bridge.codec.Codec;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class AudioPlayer extends JFrame implements Player {
    private final Codec codec;

    public AudioPlayer(Codec codec) {
        this.codec = codec;
    }

    @Override
    public void play(Path file) throws IOException {
        codec.decompress(String.valueOf(file));
        try {
            InputStream inputStream = getClass().getClassLoader()
                    .getResourceAsStream(String.valueOf(file));
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(inputStream);

            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.addLineListener((LineListener) this);
            audioClip.open(audioStream);
            audioClip.start();

            audioClip.close();
            audioStream.close();

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
            System.out.println("Error occured during playback process:" + ex.getMessage());
        }
        codec.compress(String.valueOf(file));
    }
}

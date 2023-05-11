package org.example.bridge;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        var codec1 = new H264Codec();
        var codec2 = new GenericVideoImageCodec();

        var audioPlayerH264C = new AudioPlayer(codec1);
        var audioPlayerGeneric = new AudioPlayer(codec2);

        var videoPlayer1 = new VideoPlayer(codec1);
        var videoPlayer2 = new AudioPlayer(codec2);

        audioPlayerH264C.play(Path.of("/opt/a.mp3"));
        audioPlayerGeneric.play(Path.of("/opt/a.mp3"));

        videoPlayer1.play(Path.of("/opt/b.mp4"));
        videoPlayer2.play(Path.of("/opt/b.mp4"));
    }
}

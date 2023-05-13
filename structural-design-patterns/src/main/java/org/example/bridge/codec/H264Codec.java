package org.example.bridge.codec;

import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFmpegExecutor;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.builder.FFmpegBuilder;

import java.io.IOException;

public class H264Codec implements Codec {
    @Override
    public void compress(String path) throws IOException {
        FFmpeg ffmpeg = new FFmpeg("/path/to/ffmpeg");
        FFprobe ffprobe = new FFprobe("/path/to/ffprobe");

        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(path)
                .overrideOutputFiles(true)
                .addOutput(path)
                .setFormat("mp4")
                .setTargetSize(250_000)
                .disableSubtitle()
                .setAudioChannels(1)
                .setAudioCodec("aac")
                .setAudioSampleRate(48_000)
                .setAudioBitRate(32768)
                .setVideoCodec("libx264")
                .setVideoFrameRate(24, 1)
                .setVideoResolution(640, 480)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL).done();

        FFmpegExecutor executor = new FFmpegExecutor(ffmpeg, ffprobe);
        executor.createJob(builder).run();
        executor.createTwoPassJob(builder).run();
    }

    @Override
    public void decompress(String path) {
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(path)
                .addExtraArgs("-f", "concat")
                .addExtraArgs("-i", path + "test.txt")
                .addOutput("outjava.mp4")
                .addExtraArgs("-c", "copy")
                .done();
        builder.build();
    }
}

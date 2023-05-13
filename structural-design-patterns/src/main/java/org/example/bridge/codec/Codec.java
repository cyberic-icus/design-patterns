package org.example.bridge.codec;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Codec {
    void compress(String path) throws IOException;

    void decompress(String path) throws FileNotFoundException;
}

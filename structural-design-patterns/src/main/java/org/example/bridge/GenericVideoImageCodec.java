package org.example.bridge;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Iterator;

public class GenericVideoImageCodec implements Codec {

    @Override
    public void compress(String path) throws IOException {
        File imageFile = new File(path);
        File compressedImageFile = new File(path);
        InputStream is = new FileInputStream(imageFile);
        OutputStream os = new FileOutputStream(compressedImageFile);

        float quality = 0.5f;
        BufferedImage image = ImageIO.read(is);

        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName(path.split(".")[1]);
        if (!writers.hasNext())
            throw new IllegalStateException("No writers found");

        ImageWriter writer = writers.next();
        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
        writer.setOutput(ios);

        ImageWriteParam param = writer.getDefaultWriteParam();
        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(quality);
        writer.write(null, new IIOImage(image, null, null), param);

        is.close();
        os.close();
        ios.close();
        writer.dispose();
    }

    @Override
    public void decompress(String path) {
        try {
            File compressedImageFile = new File(path);
            File imageFile = new File(path);
            InputStream is = new FileInputStream(compressedImageFile);
            OutputStream os = new FileOutputStream(imageFile);

            BufferedImage image = ImageIO.read(is);
            Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName(path.split(".")[1]);

            if (!writers.hasNext()) {
                throw new IllegalStateException("No writers found");
            }

            ImageWriter writer = writers.next();
            ImageOutputStream ios = ImageIO.createImageOutputStream(os);
            writer.setOutput(ios);
            ImageWriteParam param = writer.getDefaultWriteParam();
            writer.write(null, new IIOImage(image, null, null), param);

            is.close();
            os.close();
            ios.close();
            writer.dispose();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

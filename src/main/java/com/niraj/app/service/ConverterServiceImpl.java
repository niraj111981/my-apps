package com.niraj.app.service;

import com.aspose.xps.XpsDocument;
import com.niraj.app.utility.Constants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ConverterServiceImpl implements ConverterService{
    public boolean convertFile(String files, String fromFormat, String toFormat){
        System.out.println("Inside convertFile() " + files);
        // For complete examples and data files, please go to https://github.com/aspose-page/Aspose.Page-for-Java
        // The path to the documents directory.
            //String dataDir = Utils.getDataDir();
        // Initialize XPS input stream

        // Load XPS document form the stream
        //XpsDocument document = new XpsDocument(dataDir + "input.xps");
        XpsDocument document = null;
        try {
            document = new XpsDocument(Constants.FOLDER_PATH + Constants.INBOUND_PATH + files);


            // Initialize options object with necessary parameters.
            com.aspose.xps.rendering.JpegSaveOptions options = new com.aspose.xps.rendering.JpegSaveOptions();
            options.setSmoothingMode(com.aspose.xps.rendering.SmoothingMode.HighQuality);
            //options.setSmoothingMode(com.aspose.xps.rendering.SmoothingMode.HighQuality);
            options.setResolution(150); //300 was default
            options.setPageNumbers(new int[] { 1, 2, 6 });

            // Create rendering device for PDF format
            com.aspose.xps.rendering.ImageDevice device = new com.aspose.xps.rendering.ImageDevice();

            document.save(device, options);

            // Iterate through document partitions (fixed documents, in XPS terms)
            for (int i = 0; i < device.getResult().length; i++) {
                // Iterate through partition pages
                for (int j = 0; j < device.getResult()[i].length; j++) {
                    // Initialize image output stream
                    FileOutputStream imageStream = null;
                    try {
                        imageStream = new FileOutputStream(Constants.FOLDER_PATH
                                + Constants.CONVERTER_PATH + files + "_XPStoJPEG" +System.currentTimeMillis()
                                + "_" + (i + 1) + "_" + (j + 1) + ".jpeg");

                        // Write image
                        imageStream.write(device.getResult()[i][j], 0, device.getResult()[i][j].length);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Document converted success!!!");
            return true;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void removeBackgroundFromImage(String files) throws IOException {
        System.out.println("removeBackgroundFromImage()");
        final Color backColor = new Color(255,255,255);
        final int THRESHOLD = 35;
        final int TRANSPARENT = 0;  // 0x00000000;

        File base  = new File(Constants.FOLDER_PATH + Constants.INBOUND_PATH + files);
        //File base2 = new File("f://outtrans.png");
        //for (File file : base.listFiles())
        //{
            BufferedImage initImage = ImageIO.read(base);
            int width = initImage.getWidth(null),
                    height = initImage.getHeight(null);

            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics g = image.getGraphics();
            g.drawImage(initImage, 0, 0, null);

            System.out.println("before: " + image.getRGB(0, 0));
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel = image.getRGB(x, y);
                    Color color = new Color(pixel);

                    int dr = Math.abs(color.getRed()   - backColor.getRed()),
                            dg = Math.abs(color.getGreen() - backColor.getGreen()),
                            db = Math.abs(color.getBlue()  - backColor.getBlue());

                    if (dr < THRESHOLD && dg < THRESHOLD && db < THRESHOLD) {
                        image.setRGB(x, y, TRANSPARENT);
                    }
                }
            }
            System.out.println("   after: " + image.getRGB(0, 0));

            File file1 = new File(Constants.FOLDER_PATH + Constants.CONVERTER_PATH + files + "removedBackground");
            ImageIO.write(image, "png", file1);
        //}
    }
}



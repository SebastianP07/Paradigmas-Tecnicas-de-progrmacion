package pytp;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class SaltandPepper {

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("/home/jrudascas/Desktop/lenna_gris.png"));

        double random;
        
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                random = Math.random();
                
                double umbral = 5;

                if (random <= umbral / 100) {
                    image.setRGB(i, j, Color.BLACK.hashCode());
                } else if (random >= 1 - (umbral / 100)) {
                    image.setRGB(i, j, Color.WHITE.hashCode());
                }
            }
        }

        ImageIO.write(image, "BMP", new File("/home/jrudascas/Desktop/lenna2.bmp"));

        BufferedImage newImage = image;
        
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight()-1; j++) {
                if ((image.getRGB(i,j) == Color.WHITE.hashCode()) || (image.getRGB(i,j) == Color.BLACK.hashCode())){                  
                    newImage.setRGB(i, j, image.getRGB(i,j+1));
                }                
            }
        }
        
        ImageIO.write(newImage, "BMP", new File("/home/jrudascas/Desktop/lenna3.bmp"));
    }
}

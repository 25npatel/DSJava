package animate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {

    private BufferedImage img;

    private static final int B_WIDTH = 350;
    private static final int B_HEIGHT = 350;

    public Board() {

        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        try {

            File imgFile = new File("media/SR-71.jpg");
            img = ImageIO.read(imgFile);
            setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));

        } catch (Exception e) {

            System.err.println("Unable to open image file");      
            System.err.println(e.getMessage());   
                    
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform affineTransform = new AffineTransform();
        int x_t = 0, y_t = 0;
        int x_scaled = 0, y_scaled = 0;
        double scale = 0.5;
        if (img != null) {
            x_t = this.getWidth() / 2;
            x_scaled = (int) ((img.getWidth() * scale) * 2);
            y_t = this.getHeight() / 2;
            y_scaled = (int) ((img.getHeight() * scale) * 2);
            affineTransform.translate(x_t, y_t);
            affineTransform.scale(scale, scale);
            g2d.drawImage(img, affineTransform, null);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }
    }
}

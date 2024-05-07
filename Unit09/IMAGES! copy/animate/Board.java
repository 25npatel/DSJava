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
import javax.swing.Timer;

public class Board extends JPanel {
    private BufferedImage img;
    private static final int B_WIDTH = 720;
    private static final int B_HEIGHT = 720;
    private int x, y; // Position of the image
    private double rotationAngle; // Rotation angle of the image
    private Timer timer;
    private static final int DELAY = 25; // Delay for timer in milliseconds

    public Board() {


        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // Load the image
        try {

            File imgFile = new File("media/Andy.png");
            img = ImageIO.read(imgFile);
            setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        } catch (Exception e) {
            System.err.println("Unable to open image file");
            System.err.println(e.getMessage());
        }

        // Initialize position and rotation angle
        double x = 0;
        double y = 0;
        rotationAngle = 0;

        // Create and start the timer
        timer = new Timer(DELAY, e -> {
            updatePosition();
            rotateImage();
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            AffineTransform oldTransform = g2d.getTransform();

            // Translate and rotate the image
            g2d.translate(x, y);
            g2d.rotate(rotationAngle, img.getWidth() / 2, img.getHeight() / 2);

            // Draw the image
            g2d.drawImage(img, 0, 0, null);

            // Restore the original transform
            g2d.setTransform(oldTransform);
            g2d.dispose();
        }
    }

    private void updatePosition() {
        // Move the image by 1 pixel in both x and y directions
        x = (x + 1) % B_WIDTH;
        y = (y + 1) % B_HEIGHT;
    }

    private void rotateImage() {
        // Rotate the image by 5 degrees clockwise
        rotationAngle += Math.toRadians(5);
    }
}

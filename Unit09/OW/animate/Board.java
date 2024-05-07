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
    private int imgX, imgY;
    private int dx, dy; //Horizontal and vertical velocities
    private static final int B_WIDTH = 720;
    private static final int B_HEIGHT = 720;

    public Board() {

        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        try {

            setBackground(Color.CYAN);
            setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

            File imgFile = new File("media/Andy.png");
            img = ImageIO.read(imgFile);
            setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        } catch (Exception e) {

            setBackground(Color.CYAN);
            setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

            System.err.println("Unable to open image file");
            System.err.println(e.getMessage());

        }

        imgX = 0; // Start image at the center of the screen
        imgY = 0;
        dx = getRandomVelocity();
        dy = getRandomVelocity();

        // Start timer to update animation
        Timer timer = new Timer(25, e -> {
            update();
            repaint();
        });
        timer.start();
    }

    private void update() {
        // Update image position
        imgX += dx;
        imgY += dy;

        // Check for collision with walls
        if (imgX <= 0 || imgX + img.getWidth() >= B_WIDTH) {
            dx = -dx; // Reverse horizontal velocity on wall collision
            playOwSound(); // Play ow sound on collision
        }
        if (imgY <= 0 || imgY + img.getHeight() >= B_HEIGHT) {
            dy = -dy; // Reverse vertical velocity on wall collision
            playOwSound(); // Play ow sound on collision
        }
    }

    private void playOwSound() {
        SoundClip owClip = new SoundClip("media/Ow.wav");
        owClip.open();
        owClip.play();
    }

    private int getRandomVelocity() {

        return (int) (Math.random() * 5) + 1; // Random velocity from 1 to 5
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        if (img != null) {
            g2d.drawImage(img, imgX, imgY, null);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }

        g2d.dispose();
    }
}

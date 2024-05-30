package animate;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Board extends JPanel implements MouseListener {
    private static final int B_WIDTH = 720;
    private static final int B_HEIGHT = 720;
    private int circleX, circleY; // Position of the circle
    private final int circleDiameter = 20; // Diameter of the circle
    private Clip blipClip, blopClip;

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        //Load sound clips
        loadSoundClips();

        //Place the circle in the center of the board
        circleX = (B_WIDTH - circleDiameter) / 2;
        circleY = (B_HEIGHT - circleDiameter) / 2;

        // Add mouse listener to detect mouse press
        addMouseListener(this);
        // Add key listener to detect SPACE key press
        addKeyListener(new MyKeyListener());
        setFocusable(true); // Ensure that this panel receives key events
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        // Draw the circle
        g2d.setColor(Color.MAGENTA);
        g2d.fillOval(circleX, circleY, circleDiameter, circleDiameter);
        g2d.dispose();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Not needed, but required by MouseListener interface
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Move the circle to the mouse press location
        circleX = e.getX() - circleDiameter / 2;
        circleY = e.getY() - circleDiameter / 2;
        playSound(blipClip);
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Not needed, but required by MouseListener interface
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Not needed, but required by MouseListener interface
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Not needed, but required by MouseListener interface
    }

    private void loadSoundClips() {
        try {
            blipClip = AudioSystem.getClip();
            AudioInputStream blipStream = AudioSystem.getAudioInputStream(new File("media/blip.wav"));
            blipClip.open(blipStream);

            blopClip = AudioSystem.getClip();
            AudioInputStream blopStream = AudioSystem.getAudioInputStream(new File("media/blop.wav"));
            blopClip.open(blopStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private void playSound(Clip clip) {
        if (clip != null) {
            clip.stop(); // Stop the clip if it's already playing
            clip.setFramePosition(0); // Rewind to the beginning
            clip.start();
        }
    }

    private class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                // Move the circle back to the center of the board
                circleX = (B_WIDTH - circleDiameter) / 2;
                circleY = (B_HEIGHT - circleDiameter) / 2;
                playSound(blopClip);
                repaint();
            }
        }
    }
}

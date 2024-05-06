package animate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Board extends JPanel implements KeyListener{

    private static final int B_WIDTH = 1550;
    private static final int B_HEIGHT = 850;
    private static final int SIDE_LEN = 150;
    private static final int FLOOR = B_HEIGHT - 25;

    public Board() {

        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        this.setFocusable(true);
        this.addKeyListener(this);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setBackground(Color.CYAN);

        //AffineTransform at = new AffineTransform();

        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, FLOOR, B_WIDTH, FLOOR);

        g2d.setColor(Color.GREEN);
        g2d.fillRect(0, FLOOR + 1, B_WIDTH, B_HEIGHT - FLOOR - 1);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {

        System.out.println("A key was pressed!");

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {

            System.out.println("SPACEBAR was pressed!");
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {

            System.out.println("UP arrow was pressed!");
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {

            System.out.println("LEFT arrow was pressed!");
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {

            System.out.println("DOWN arrow was pressed!");
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

            System.out.println("RIGHT arrow was pressed!");
        }
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}
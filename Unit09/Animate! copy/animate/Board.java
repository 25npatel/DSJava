package animate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class Board extends JPanel {

    private static final int B_WIDTH = 350;
    private static final int B_HEIGHT = 350;
    private static final int SIDE_LEN = 150;

    public Board() {

        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.MAGENTA);
        int x_t = B_WIDTH / 2;
        x_t -= SIDE_LEN / 2 ;
        int y_t = B_HEIGHT / 2;
        y_t -= SIDE_LEN / 2;

        AffineTransform at = new AffineTransform();

        at.translate(x_t, y_t);

        at.rotate(Math.toRadians(22.5), SIDE_LEN / 2, SIDE_LEN / 2);

        g2d.setColor(Color.BLUE);

        g2d.drawString("Hello, World!", 30, 30);
        
        g2d.setColor(Color.MAGENTA);

        Rectangle rect = new Rectangle(new Dimension(SIDE_LEN, SIDE_LEN));
        
        Shape modifiedShape = at.createTransformedShape(rect);

        g2d.fill(modifiedShape);

    }
}

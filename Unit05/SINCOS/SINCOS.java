//Nabh Patel
//December 1, 2023

//Importing packages that support this program.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class SINCOS {
    /*
     * Change the following method to customize
     * what is drawn in the JFrame.
     */
    public static void draw(Graphics graph) {
        // by default, this method draws a blue square.
        
        //Setting the lines to the color black. 
        graph.setColor(Color.BLACK);

        //Number of steps so that the resolution is darker. 
        int steps = 10000000;

        //Scale value is 150 instead of 1 so that 
        //the graph can be seen by the user. 
        int scaleValue = 150;

        //double delta is equal to 2pi / the number of steps. 
        double delta = (2.0 * Math.PI)/steps;

        //double theta is set to start at 0.
        double theta = 0;

        //For loop.
        for (int i = 0; i < steps; i++) {

            //Theta is equal to delta times int i. 
            theta = delta * i;

            //'r' or the radius is defined by multiplying the 
            //scaleValue times the cosine of 2 times theta.
            double r = scaleValue * Math.cos(2 * theta);

            //how 'x' will be calculated. 
            double x = r * Math.cos(theta);

            //how 'y' will be calculated.
            double y = r * Math.sin(theta);

            //Where 'x' will be ploted in the graph.
            int plotX = (int)x + 199;

            //Where 'y' will be ploted in the graph.
            int plotY = (int)y + 199;

            //graph that fills the pedal shape with the number of steps. 
            graph.fillRect(plotX, plotY, 1, 1);
        }
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }
    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }
        return val;
    }
    // Do not modify the code in the main method.
    // Your code will go into the draw method above.
    public static void main(String[] args) {
        // this is the desired dimensions of the content area
        // of our JFrame window.
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;
        // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }
        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };
        frame.add(component);
        frame.setVisible(true);
        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }
}
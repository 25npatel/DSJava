package animate;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Cannon {

    private double x, y; 
    private double angle; 
    private double muzzleVelocity; 
    private Image cannonImage; 
    private Clip wheelClip; 
    private Clip cannonClip; 

    //Constructor
    public Cannon() {

        try {

            //Load the cannon image!
            cannonImage = ImageIO.read(new File("media/sm_cannon.png"));
            
            //Load sound clips!
            wheelClip = loadAudioClip("media/wheel.wav");
            cannonClip = loadAudioClip("media/cannon.wav");

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException ex) {

            ex.printStackTrace();
        }

        //Set initial position and angle


        //60 pixels to the right of the leftmost boundary of the board.
        x = 60;

        //60 pixels above the bottommost boundary of the board.
        y = 1550;

        //45 degrees above horizontal.
        angle = Math.toRadians(-45);
    }

    //Getters and setters
    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }

    public double getAngle() {

        return angle;
    }

    public void setAngle(double angle) {

        this.angle = angle;
    }

    public double getMuzzleVelocity() {

        return muzzleVelocity;
    }

    public void setMuzzleVelocity(double muzzleVelocity) {

        this.muzzleVelocity = muzzleVelocity;
    }

    //Method to rotate cannon counterclockwise
    public void rotateCannonCounterclockwise() {

        if (angle <= Math.toRadians(-85)) {

            if (wheelClip != null) {

                //Stop previous clip if it's playing
                wheelClip.stop();

                //Rewind to the beginning
                wheelClip.setFramePosition(0);

                //Start the sound effect
                wheelClip.start();
            }

        } else {

            angle -= Math.toRadians(5);

            if (wheelClip != null) {

                //Stop previous clip if it's playing
                wheelClip.stop();

                //Rewind to the beginning
                wheelClip.setFramePosition(0);

                //Start the sound effect
                wheelClip.start();
            }
        }
    }

    //Method to rotate cannon clockwise.
    public void rotateCannonClockwise() {

        if (angle >= Math.toRadians(0)) {

            if (wheelClip != null) {

                //Stop previous clip if it's playing
                wheelClip.stop();

                //Rewind to the beginning
                wheelClip.setFramePosition(0);
                
                //Start the sound effect
                wheelClip.start(); 
            }
            
        } else {

            angle += Math.toRadians(5);

            if (wheelClip != null) {

                //Stop previous clip if it's playing
                wheelClip.stop();

                //Rewind to the beginning
                wheelClip.setFramePosition(0);

                //Start the sound effect
                wheelClip.start();
            }
        }
    }


    //Method to fire the cannon...
    public void fireCannon() {

        if (cannonClip != null) {

            //Stop previous clip if it's playing
            cannonClip.stop();

            //Rewind to the beginning
            cannonClip.setFramePosition(0);
            
            //Start the sound effect
            cannonClip.start();
        }
    }

    //Method to draw the cannon on the board
    public void draw(Graphics2D g2d) {

        //Draw cannon image
        AffineTransform oldTransform = g2d.getTransform();
        AffineTransform transform = new AffineTransform();
        transform.translate(x - 15, y); 

        //Translate to position
        transform.rotate(angle, 15, 25); 
        
        //Rotate around pivot point
        g2d.setTransform(transform);
        g2d.drawImage(cannonImage, 0, 0, null);
        g2d.setTransform(oldTransform); // Restore original transform

        //Calculate the coordinates of the triangle vertices relative to the pivot point.

        //Over here, I used stack overflow and learned how to use
        //arrays to plot a triange. 

        //Basically the first, second, and third indeces of triangleX match with triangleY.

        //X coordinates of vertices.
        int[] triangleX = {10, 50, 30};

        //Y coordinates of vertices.
        int[] triangleY = {825, 825, 787};

        //Draw the filled triangle.
        g2d.setColor(Color.PINK);
        g2d.fillPolygon(triangleX, triangleY, 3);

        //Draw pivot point.
        g2d.setColor(Color.BLUE);
        g2d.fillOval(25, 783, 10, 10);
    }

    //Method to load audio clip from file.
    private Clip loadAudioClip(String filename) throws IOException, UnsupportedAudioFileException, LineUnavailableException {

        Clip clip = null;
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filename));
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        return clip;
    }
}
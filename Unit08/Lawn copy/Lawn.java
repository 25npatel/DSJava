//Nabh Patel
//March 7th, 2024

//Importing Scanner class to allow the user to input
//the height and the width.
import java.util.Scanner;

//Importing time to allow the program to clear the screen
//for half a second.
import java.util.concurrent.TimeUnit;

//Importing the Mower and Yard classes.
import mow.*;

public class Lawn {

    public static void main(String[] args) {
        //Creating a new Scanner class called "in".
        Scanner in = new Scanner(System.in);

        //Asking the user for the height.
        System.out.println("Please enter the height below:");
        int height = in.nextInt();

        //Asking the user for the width.
        System.out.println("Please enter the width below:");
        int width = in.nextInt();

        //Declaring a new Yard called "yard".
        Yard yard = new Yard(height, width);

        //Create a mower and place it on the top left side of the yard.
        Mower mower = new Mower(1, 1, '>');

        //Clear the screen for the animation.
        clearScreen();

        //Animate the mower's movement across the top of the Yard!
        while (mower.getCol() < yard.getLawnWidth()) {

            yard.printYard(mower);

            //Wait for half a second.
            delay(500);

            //Moving the mower right.
            mower.moveForward();

            //Clearing the screen each time it moves to the right.
            clearScreen();
        }

        //Display the final state of the yard
        yard.printYard(mower);

        //Close Scanner "in".
        in.close();
    }

    //The clearScreen and delay methods are provided. 
    public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();
    }

    public static void delay(long milliseconds) {

        try {

            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}

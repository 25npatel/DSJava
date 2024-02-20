//Nabh Patel
//19 February 2024. 

//Importing Scanner class to allow the user to input.
import java.util.Scanner;

//Importing a package called "mow" with the Yard class.
import mow.*;

public class Lawn {

    //A void method that clears the screen.
    public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();
    }

    public static void main(String[] args) {
        
        //Clears the screen first.
        clearScreen();

        //Creating a new Scanner class called "in".
        Scanner in = new Scanner(System.in);

        //Asking the user for the height.
        System.out.println("Please enter the height below:");
        int height = in.nextInt();

        //Asking the user for the width.
        System.out.println("Please enter the width below:");
        int width = in.nextInt();

        //These new variables will be used in the Yard class and are +2 
        //so we can correctly display the height and the width for the array.
        int yardHeight = height + 2;
        int yardWidth = width + 2;

        //Declare a new Yard called "yard" with the yardHeight and yardWidth. 
        Yard yard = new Yard(yardHeight, yardWidth);

        //Prints the yard's dimensions.
        yard.printYard();

        //Closes Scanner "in".
        in.close();
    }
}
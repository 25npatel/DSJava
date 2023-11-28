//Nabh Patel
//November 21, 2023

//Importing Scanner class to allow the user to input a value for x, y, and z.
import java.util.Scanner;

public class Smallest {

    //Method is called "smallest" which checks which variable is the least in value.
    public static double smallest (double x, double y, double z) {

        //If "x" is less than "y" and "z", return "x".
        if (x < y && y < z) {
            return x;
        } 
        
        //If "y" is less than "x" and "z", return "y". 
        else if (y < x && y < z) {
            return y;
        } 
        
        //Else, return "z" as the smallest value.
        else {
            return z; 
        }
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        //Asking the user for their "x" value.
        System.out.print("Please enter an integer for your \"x\" value here: ");

        //Declared "double x" for the input from the user for the "x" value.
        double x = in.nextDouble();

        //Asking the user for their "y" value.
        System.out.print("Please enter an integer for your \"y\" value here: ");

        //Declared "double y" for the input from the user for the "y" value.
        double y = in.nextDouble();

        //Asking the user for their "z" value.
        System.out.print("Please enter an integer for your \"z\" value here: ");

        //Declared "double z" for the input from the user for the "z" value.
        double z = in.nextDouble();

        //Prints the smallest of the three values.
        System.out.println("The smallest of your three values is " + smallest(x,y, z));
    }
}
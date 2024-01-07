//Nabh Patel
//January 6, 2024

//Importing Scanner class so that the user can input
//integer values.
import java.util.Scanner;

//Importing ArrayList class so that the programer can
//declare and initialize a new list. 
import java.util.ArrayList;

public class HW18PartD {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //Declared and initialized a new list. 
    ArrayList<Integer> values = new ArrayList<Integer>();

    //Extra line of code for the user to know what to do. 
    System.out.println("Enter an integer below:");

    //While Loop.
    while (true) {

        //If the user inputs, 'q' or 'Q', that means to break
        //from the code. 
        if (in.hasNext("q") || in.hasNext("Q")) {

            //Breaks.
            break;
        }

        //Asks the user to input an integer value. 
        System.out.println("Enter an integer below:");
        Integer integer = in.nextInt();

        //Whatever the user inputs, it will also add that input
        //into the list.
        values.add(integer);
        

        //For loop that checks whether an integer is odd and if 
        //an integer is odd, it will be removed.
        for (Integer i = 0; i < values.size(); i++) {
        if ((double) integer % 2 != 0) {

            //Removes all the odd integers. 
            values.remove(integer);
            }
        }
    }

        //Extra line of code for spacing. 
        System.out.println();

        //User-friendly code that tells the user where the new list
        //of even only numbers are. 
        System.out.println("Here are all the even numbers below:");

        //Enhanced loop that prints out all the even numbers. This time
        //I'm using the wrapper class.
        for (Integer element : values) {

            //Extra line of code for spacing. 
            System.out.println();

            //Prints out all the even numbers that are left in the
            //list.
            System.out.println(element);
        }

        //Extra line of code for spacing.
        System.out.println();

        //Closes the scanner class.
        in.close();
    }
}
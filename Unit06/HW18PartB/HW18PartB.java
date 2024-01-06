//Nabh Patel
//January 5, 2024

//Scanner class to allow the user to input double values
//and importing ArrayList class to allow the programer
//to declare and initialize a list. 
import java.util.Scanner;
import java.util.ArrayList;

public class HW18PartB {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //Declared and initialized a list.
    ArrayList<Double> values = new ArrayList<Double>();

    //Extra line of code to allow the user to know what they are supposed to do. 
    System.out.println("Please enter a double value below or enter 'q' or 'Q' to quit: ");

    //While loop.
    while (true) {

        //If the user inputs 'q' or 'Q', then the program will break. 
        if (in.hasNext("q") || in.hasNext("Q")) {

            //breaks from the program.
            break;
        }

        //Asks the user for a double value.
        System.out.println("Please enter a double value below or enter 'q' or 'Q' to quit: ");

        //Whatever the user inputs, then it will be declared as a double "value".
        double value = in.nextDouble();

        //Whatever the user inputs, that value will be added to the list.
        values.add(value);
    }

    //Extra line of code for spacing. 
    System.out.println();

    //Tells the user where the list of values is displayed and printed.
    System.out.println("Here are the values that you've inputed below: ");

    //Extra line of code for spacing.
    System.out.println();

    //Enhanced Loop to print out all the values from the "values" list.
    for (double element : values) {

        //Printed the average.
        System.out.println(element);
        }
    
    //Extra line of code for spacing.
    System.out.println();


    //Adding all the values in the list. 
    //declaring and initializing double sum to 0.
    double sum = 0;

    //For loop.
    for (int i = 0; i < values.size(); i++) {

        //Sum is equal to sum plus all the values in the list.
        sum += values.get(i); 
        }

    //Tells the user where the average is displayed and printed.
    System.out.println("Here is the average below: ");

    //Extra line of code for spacing.
    System.out.println();

    //Calculates the average.
    double average = sum / values.size();

        //Formatting the average to only 2 decimal places.
        System.out.printf("%.2f", average);

        //Extra line of code for spacing.
        System.out.println();

        //Closes the scanner class.
        in.close();
    }
}
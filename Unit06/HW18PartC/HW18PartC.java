//Nabh Patel
//January 5, 2024


//Importing scanner class to allow the user to input. 
import java.util.Scanner;

//Importing ArrayList to allow the programer to declare
//and intitialize a list.
import java.util.ArrayList;

//Importing Collections class to allow the programmer to 
//sort a list. 
import java.util.Collections;

public class HW18PartC {
    public static void main(String[] args) {

    //Created a new Scanner class. 
    Scanner in = new Scanner(System.in);

    //Declared and initialized a new list.
    ArrayList<Double> temperatures = new ArrayList<Double>();

    //Extra line of code to guide the user on what to do first. 
    System.out.println("Please enter your temperature here or to quit, press 'q' below:");

    //While loop.
    while (true) {

        //If the user inputs 'q' or 'Q', that means to quit. 
        if (in.hasNext("q") || in.hasNext("Q")) {

            //Breaks.
            break;
        }

        //Asks the user to input and temperature as a double, or 'q' or 'Q' to quit. 
        System.out.println("Please enter your temperature here or to quit, press 'q' below:");

        //Declared whatever the user inputs as "double temperature".
        double temperature = in.nextDouble();

        //Whatever the user inputs, it will add to the list.
        temperatures.add(temperature);
    }

    //Extra line of code for spacing. 
    System.out.println();

<<<<<<< HEAD
=======
    //Sorts the list from least to greatest. 
>>>>>>> 521ae6ce39fc68b2182a6bc003e1ea74c96c295e
    Collections.sort(temperatures);

    //Prints "<= lowest" to the first value. 
    System.out.println(temperatures.get(0) + " <= lowest");

    //Removes the first value.
    temperatures.remove(0);

    //Enhanced Loop to print the list.
    for (double element : temperatures) {

        //Prints.
        System.out.println(element);
    }

    //Closes the scanner class.
    in.close();   
    }
}

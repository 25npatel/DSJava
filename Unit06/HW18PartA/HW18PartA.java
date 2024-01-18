//Nabh Patel
//January 4, 2024

//Importing scanner class to allow the user to input. 
import java.util.Scanner;

//Importing the ArrayList class to allow the programer
//to declare and initialize a list.
import java.util.ArrayList;

public class HW18PartA {
    public static void main(String[] args) {

    //Made a new Scanner class. 
    Scanner in = new Scanner(System.in);

    //Declared and initialized a new list.
    ArrayList<String> names = new ArrayList<String>(0);

    //Extra line of code to guide the user on what to do first.
    System.out.println("Please enter a name below or enter '#' to quit:");

    //While loop.
    while (true) {

        //If the user inputs '#', then quit.
        if (in.hasNext("#")) {

            //Breaks. 
            break;
        }

        //Asks the user to input a name, or '#' to quit.
        System.out.println("Please enter a name below or enter '#' to quit:");

        //Declared whatever the user inputs as "String name".
        String name = in.nextLine();

        //Whatever the user inputs, it will add to the list.
        names.add(name);
    }

    //User-friendly code that helps the user navigate where the list is printed.
    System.out.println("Here is your list, Mr. Eng: ");

    //Enhanced Loop that prints all the String values in the list. 
    for (String element : names) {

        //Extra line of code for spacing. 
        System.out.println();

        //Prints the whole list. 
        System.out.println(element);
        }

        //Extra line of code for spacing. 
        System.out.println();

        //Closes the scanner class.
        in.close();
    }
}

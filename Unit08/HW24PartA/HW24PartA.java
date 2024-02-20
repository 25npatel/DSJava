//Nabh Patel
//19 February 2024

//Importing Scanner class to allow the user to input.
import java.util.Scanner;

public class HW24PartA {
    public static void main(String[] args) {
        //Declare the reference variable, called "in", to the Scanner object.
        Scanner in;

        //Initialize the input variable with System.in.
        in = new Scanner(System.in);

        //Getting the name of the user.
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        //Print the user's name.
        System.out.println("Hello, " + name + "!");

        //Getting the age of the user.
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        //Print the user's age.
        System.out.println(name + " is " + age + " years old.");

        //Closing Scanner class.
        in.close();
    }
}

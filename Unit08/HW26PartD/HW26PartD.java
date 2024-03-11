//Nabh Patel
//March 11, 2024

//Importing Scanner class so that the user can input a index.
import java.util.Scanner;

//Importing ArrayList so that we can initialize a list of
//pre-determined numbers. 
import java.util.ArrayList;

//Importing Arrays class so that set the numbers in the 
//pre-determined list.
import java.util.Arrays;

public class HW26PartD {

    //Method called "Swap".
    public static void Swap(ArrayList<Integer> numbers, int i, int j) {

        //Check if the indices are valid.
        if (i >= 0 && i < numbers.size() && j >= 0 && j < numbers.size()) {

            //Swap elements at indices "i" and "j".
            int temp = numbers.get(i);

            numbers.set(i, numbers.get(j));

            numbers.set(j, temp);

            System.out.println("After swapping:");

            //Prints the new arraylist with swapped indices.
            System.out.println(numbers);
        } else {

            //Prints if the user input is not valid. For example, 0 and 0. 
            //Since, indices start at 0, the program would substract 1 from the
            //user's input (which is the index) so that the program swaps the 
            //correct indices. For example, if the user wants to swap the first number
            //and the second number--assuming they do not know what indices are--the 
            //index for the first number would be 1 and the second would be 2. This would
            //incorrectly switch the second and third numbers and this is why I made the 
            //program to substract the indices by 1 to swap the correct numbers.
            System.out.println("Invalid indices. Please enter valid indices.");
        }
    }

    public static void main(String[] args) {

        //Declared and initialized Scanner class called "in".
        Scanner in = new Scanner(System.in);

        //Declared and initialized a new list.
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //Prints the pre-determined list.
        System.out.println(numbers);

        //Asks the user for the first number to switch.
        System.out.println("Enter first index below:");
        int i = in.nextInt();

        //Asks the user for the second number to switch.
        System.out.println("Enter second index below:");
        int j = in.nextInt();

        //Using the Swap method to swap the numbers selected by the user and printing them.
        Swap(numbers, i - 1, j - 1);

        //Closes Scanner class called "in".
        in.close();
    }
}
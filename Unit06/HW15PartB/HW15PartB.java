//Nabh Patel
//20 December 2023

import java.util.Scanner;
import java.util.Arrays;

public class HW15PartB {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Setting maximum arrays value equal to 20.
        int[] numbers = new int[20];

        int currentSize = 0;

        while (true) {

            //Asking user to input values.
            System.out.print("Enter integer values or 'q' to quit below: ");

            //if input has a "q" or a "Q", than the program quits and breaks. 
            if (input.hasNext("q") || input.hasNext("Q")) {

                input.next();

                //Prints out string when user wants to quit. 
                System.out.println("Done entering input.");

                break;

            } else {

                //if current value is less than the length of the array, then keep on
                //adding 1 to the currentSize. 
                if (currentSize < numbers.length - 1) {
                    numbers[currentSize] = input.nextInt();
                    
                    currentSize = currentSize + 1;
                } else {

                    numbers[currentSize] = input.nextInt();
                    //If the amount of inputs given by the user reaches 20, 
                    //print "Array is full!"
                    System.out.println("Array is full!");

                    //Then break.
                    break;
                }
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <= currentSize; i++) {
            if (i == currentSize) {
                System.out.print(numbers[i]); 
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
            
        System.out.println();
        System.out.println();

        System.out.print("Enter a target value here: ");
        int target_Val = input.nextInt();

        int countVal = 0;

        for (int i = 0; i <= currentSize; i++) {
            if (numbers[i] == target_Val) {
                countVal++;
            }
        }
        System.out.println(countVal);

        System.out.println();
        System.out.println();

        if (countVal > 0) {
            System.out.println("The target value " + target_Val + " appears " + countVal + " time(s).");
        } else {
            System.out.println("The target value " + target_Val + " does not appear in the array.");
        }
    }
}



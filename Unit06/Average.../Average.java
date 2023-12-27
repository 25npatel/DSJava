//Nabh Patel
//26 December 2023

//Importing packages in order for the user to input 
//values and to enhance the code in this program. 
import java.util.Scanner;
import java.util.Arrays;

public class Average {

    public static double average(double... values) {

        //Set sum equal to 0;
        double sum = 0;

        //For Loop that iterates through the array and adds all the values.
        //The sum is equal to all the values added. 
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        //Average is equal to the sum divided by the number of values added.
        double average = sum / values.length;

        //Returning average.
        return average;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Setting array "values" to having only one availiable option.
        double[] values = new double[0];

        //SIZE is equal to the length of the values plus 1. 
        double SIZE = values.length;

        //While Loop.
        while (true) {

            System.out.println();

            //Asking the user to input a value in the "values" array in the While Loop.  
            System.out.print("Welcome to FindingAverageOfValues.com! Please enter a value here: ");

            //If the user inputs a "q" or "Q", break from the While Loop and the 
            //code will automatically turn the array into a string and print it 
            //for the user to observe. 
            if (in.hasNext("q")|| in.hasNext("Q")) {

                System.out.println();

                System.out.println("Done entering input.");

                System.out.println();

                //break code below.
                break;

                //if the user does not want to quit, the While Loop will keep on iterating. 
                } else {

                    //Each time you input a value another space for another value 
                    //is added to the array. 
                    if (SIZE >= values.length) {
                        //More in depth: values is equal to the new values but there is always
                        //one more option in case the user adds another value.  
                        values = Arrays.copyOf(values, values.length + 1);
                }
                //Since we would want another space for another value, we don't want 
                //to have an extra unfilled value. This would cause an error because 
                //we would go on forever. So we would have to subtract 1 space for
                //the next value to keep everything filled. 
                values[values.length - 1] = in.nextDouble();
                SIZE++;
            }
        }

        //The "values" array will turn into a string and will print out for the user to observe.
        System.out.print(Arrays.toString(values));
        System.out.println();
        System.out.println();

        System.out.println("Here is the average of all the values you've inputed below: ");

        System.out.println();

        //The average is also printed out for the user to see. 
        System.out.println(average(values));

        in.close();
    }
}
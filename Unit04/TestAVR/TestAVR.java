//Nabh Patel 
//30 October 2023

//importing Scanner class to allow user to input.
import java.util.Scanner;

public class TestAVR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //declared TestScores.
        double TestScores;

        //declared amt.
        double amt = 0.00;

        //declared avr.
        double avr;

        //Do Loop.
        do {

            //Asking the user to input a test score. 
            System.out.print("Please enter your test score here (to break, you must enter a negative number) here: ");

            //Declaring TestScores as a double. 
            TestScores = in.nextDouble();

            //If TestScores is more than 0, keep on adding the amounts.
            if (TestScores >= 0) {

                //adds the testscores.
                amt += TestScores;
            } 
            //if TestScores is less than 0, break.
            else {
                break;
            }
        }

        //While Loop.
        while (TestScores >= 0);

            //Asks the user for the amount of test scores entered.
            System.out.print("How many test scores did you enter? (Do not include the negative number) Please enter here: ");

            //Declared numTestScores as an integer. 
            int numTestScores = in.nextInt();

            //Average is the total amount divided by the number of test scores entered. 
            avr = amt / numTestScores;

            //Prints the average test score.
            System.out.println("Your average is " + avr);
        }
    }
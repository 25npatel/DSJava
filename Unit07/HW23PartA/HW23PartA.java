//Nabh Patel 
//February 15, 2024

//Importing java.util.Scanner;
import java.util.Scanner;

public class HW23PartA {
    public static void main(String[] args) {

        //Declaring a new Scanner class called "in".
        Scanner in = new Scanner(System.in);

        //Try-Catch.
        try {

            //Integer called quizScore is equal to the score that is going to be returned. 
            int quizScore = getQuizScore(in);

            //quizScore will be printed here. 
            System.out.println("Entered Quiz Score: " + quizScore);

        //If the quizScore is not between 0 - 100, then print the error message.
        //The message is seen below. 
        } catch (ArithmeticException e) {

            //Prints the error message. 
            System.out.println("Error: " + e.getMessage());

        //Finally clause, so the Scanner "in" will not leak. 
        } finally {

            //Closes Scanner "in".
            in.close();
        }
    }

    //Method.
    public static int getQuizScore(Scanner in) {

        //Asks the user for a quizScore between 0 - 100.
        System.out.print("Enter quiz score (0 - 100): ");

        //Int score is whatever the user inputs. 
        int score = in.nextInt();

        //If the input is not between 0 - 100, throw a ArithmeticException error and print an error message.
        if (score < 0 || score > 100) {

            //Throws a new exception.
            throw new ArithmeticException("Sorry, score must only be between 0 and 100...");
        }

        //returns score. 
        return score;
    }
}


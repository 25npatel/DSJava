//Nabh Patel
//October 20, 2023

//Importing Scanner class in order for the user to input.
import java.util.Scanner;

public class APR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asks the user for the interest rate.
        System.out.print("Welcome to Annual Profit.com! Please enter the interest rate (in %) here (i.e. 5.5): ");

        //Declared user's input as double interestRate.
        double APR = input.nextDouble();

        //Asks the user for their balance.
        System.out.print("Now, please enter your balance here (in $): ");

        //Declared user's input as double balance.
        double balance = input.nextDouble();

        //interest rate or interestRate = APR / 100.0. This literally means, for example, 6.5 --> 0.065.
        double interestRate = APR / 100.0;

        //Declared int year because the for loop below will start at year 1 and end at year 5.
        int year;

        System.out.println("________________________________________________________________________");

        //For Loop.
        for (year = 1; year < 6; year++) {

            //interest is equal to the balance given by the user times (for example, $1000), for example, 0.065, which is %65.00.
            double interest = balance * interestRate;

            //Balance is equals to balance ($1000) + $65.00 or $1065.00.
            balance = balance + interest;
            
            //Prints years 1 - 6 and (for each year) the earned interest and the balance each year.
            System.out.println("________________________________________________________________________");
            System.out.println("");
            System.out.printf("Year %1d:   Interest Earned ($): %8.2f     Balance ($): %8.2f%n", year, interest, balance);
            System.out.println("________________________________________________________________________");
        }
        System.out.println("________________________________________________________________________");
    }
}

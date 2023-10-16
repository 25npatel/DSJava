//Nabh Patel
//Monday October 16, 2023

//importing Scanner class to allow user to input.
import java.util.Scanner;

public class CougarBakingDays {

//Making an enumeration of DayOfWeek to allow the user to tell what day it is.
public enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //Asks the user for their age.
        System.out.print("Welcome to CougarCafe! Give me your age here: ");
        //Sets int age as the input of the user.
        int age = in.nextInt();

        //Asks the user for the day of the week.
        System.out.print("I forgot what day it is today...can you tell me? (0 = SUN, ..., 6 = SAT) here: ");
        //Sets int val as the input of the user.
        int val = in.nextInt();

        //Monday Specials below.
        if (val == 1 && age < 13) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 1 && age < 50 && age >= 13) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!"); 
        }
        if (val == 1 && age >= 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 15% discount!");
        }

        //Every other days below for ages younger than 13.
        if (val == 2 && age < 13) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 3 && age < 13) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 4 && age < 13) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 5 && age < 13) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 6 && age < 13) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        //Every other days below for ages older than 50.
        if (val == 2 && age >= 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 3 && age >= 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 4 && age >= 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 5 && age >= 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 6 && age >= 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        //Every other days for everybody else.
        if (val == 2 && age > 13 && age < 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 3 && age > 13 && age < 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 4 && age > 13 && age < 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 5 && age > 13 && age < 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 6 && age > 13 && age < 50) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
    }
}

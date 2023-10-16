//Nabh Patel
//Monday October 16, 2023

//importing Scanner class to allow user to input.
import java.util.Scanner;

public class CougarBakingDays {

//Making an enumeration of DayOfWeek to allow the user to tell what day it is.
public enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
//Making an enumeration of AgeGroup to allwo the user to tell what age groups that they resonate with.
public enum AgeGroup {CHILD, ADULT, SENIOR}
    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //Asks the user for their age.
        System.out.print("Welcome to CougarCafe! Give me your age group (Enter 1 for CHILD, Enter 2 for ADULT, or Enter 3 for SENIOR) here: ");
        //Sets int age as the input of the user.
        int ageGroup = in.nextInt();

        //Asks the user for the day of the week.
        System.out.print("I forgot what day it is today...can you tell me? (0 = SUN, ..., 6 = SAT) here: ");
        //Sets int val as the input of the user.
        int val = in.nextInt();

        //Monday Specials below for all age groups.
        if (val == 1 && ageGroup == 1) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 1 && ageGroup == 2) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!"); 
        }
        if (val == 1 && ageGroup == 3) {
            System.out.println("Whatever food that you'd buy, you'd get a 15% discount!");
        }

        //Every other days below for the age groups that resonate with CHILD.
        if (val == 2 && ageGroup == 1) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 3 && ageGroup == 1) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 4 && ageGroup == 1) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 5 && ageGroup == 1) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 6 && ageGroup == 1) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        //Every other days below for age groups that resonate with SENIOR.
        if (val == 2 && ageGroup == 3) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 3 && ageGroup == 3) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 4 && ageGroup == 3) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 5 && ageGroup == 3) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        if (val == 6 && ageGroup == 3) {
            System.out.println("Whatever food that you'd buy, you'd get a 7.5% discount!");
        }
        //Every other days for age groups that resonate with ADULT.
        if (val == 2 && ageGroup == 2) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 3 && ageGroup == 2) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 4 && ageGroup == 2) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 5 && ageGroup == 2) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
        if (val == 6 && ageGroup == 2) {
            System.out.println("Whatever food that you'd buy, you'd get a 5% discount!");
        }
    }
}

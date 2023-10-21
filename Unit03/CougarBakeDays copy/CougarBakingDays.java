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
        int AgeGroup = in.nextInt();

        System.out.print("What is the cost of your meal? Please enter here: ");
        double costMeal = in.nextDouble();

        //Asks the user for the day of the week.
        System.out.print("I forgot what day it is today...can you tell me? (0 = SUN, ..., 6 = SAT) here: ");
        //Sets int val as the input of the user.
        int DayOfWeek = in.nextInt();

        //Monday Specials below for all age groups.
        if (DayOfWeek == 1 && AgeGroup == 1) {
            costMeal = costMeal - (costMeal * 0.075);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 1 && AgeGroup == 2) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal); 
        }
        if (DayOfWeek == 1 && AgeGroup == 3) {
            costMeal = costMeal - (costMeal * 0.15);
            System.out.println("Your total cost is $" + costMeal);
        }

        //Every other days below for the age groups that resonate with CHILD.
        if (DayOfWeek == 2 && AgeGroup == 1) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 3 && AgeGroup == 1) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 4 && AgeGroup == 1) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 5 && AgeGroup == 1) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 6 && AgeGroup == 1) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
        //Every other days below for age groups that resonate with SENIOR.
        if (DayOfWeek == 2 && AgeGroup == 3) {
            costMeal = costMeal - (costMeal * 0.075);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 3 && AgeGroup == 3) {
            costMeal = costMeal - (costMeal * 0.075);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 4 && AgeGroup == 3) {
            costMeal = costMeal - (costMeal * 0.075);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 5 && AgeGroup == 3) {
            costMeal = costMeal - (costMeal * 0.075);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 6 && AgeGroup == 3) {
            costMeal = costMeal - (costMeal * 0.075);
            System.out.println("Your total cost is $" + costMeal);
        }
        //Every other days for age groups that resonate with ADULT.
        if (DayOfWeek == 2 && AgeGroup == 2) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 3 && AgeGroup == 2) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 4 && AgeGroup == 2) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 5 && AgeGroup == 2) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
        if (DayOfWeek == 6 && AgeGroup == 2) {
            costMeal = costMeal - (costMeal * 0.05);
            System.out.println("Your total cost is $" + costMeal);
        }
    }
}
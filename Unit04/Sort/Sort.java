//Nabh Patel
//November 10 2023

//Importing Scanner class for input below.
import java.util.Scanner;

public class Sort {
    public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    //Asking user for all three one-digit numbers and they're also declared as int a, b, and c below. 
    System.out.println("HI! Welcome to Sort.com! Please enter your first one-digit integer below: ");
    int a = in.nextInt();

    System.out.println("HI! Welcome to Sort.com! Please enter your second one-digit integer below: ");
    int b = in.nextInt(); 

    System.out.println("HI! Welcome to Sort.com! Please enter your third one-digit integer below: ");
    int c = in.nextInt();

    //Main code and sorting process using conditionals below.

    //The normal variables. There are a total of 6 combinations of a, b, and c. 
    if (a < b && b < c && a < c) {
        System.out.println();
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.println();
        System.out.println();
        System.out.println("That's too easy Mr. Eng! Give me something harder to sort...");
    }
    if (a < c && c < b && a < b) {
        System.out.println();
        System.out.print(a + " ");
        System.out.print(c + " ");
        System.out.print(b + " "); 
        System.out.println();
    }
    if (b < a && a < c && b < c) {
        System.out.println();
        System.out.print(b + " ");
        System.out.print(a + " ");
        System.out.print(c + " ");
        System.out.println();
    }
    if (b < c && c < a && b < a) {
        System.out.println();
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(a + " ");
        System.out.println();
    }
    if (c < a && a < b && c < b) {
        System.out.println();
        System.out.print(c + " ");
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.println();
    }
    if (c < b && b <= a & c < a) {
        System.out.println();
        System.out.print(c + " ");
        System.out.print(b + " ");
        System.out.print(a + " ");
        System.out.println();
        }

    //The irregular variables.
    if (a == b && a < c) {
        System.out.println();
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.println();
    }
    if (a > b && b == c) {
        System.out.println();
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(a + " ");
        System.out.println();
    }
    if (a > b && a == c) {
        System.out.println();
        System.out.print(b + " ");
        System.out.print(a + " ");
        System.out.print(c + " ");
        System.out.println();
    }
    if (a < b && a == c) {
        System.out.println();
        System.out.print(a + " ");
        System.out.print(c + " ");
        System.out.print(b + " ");
        System.out.println();
    }
    if (a == b && b == c) {
        System.out.println();
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.println();    
        }
    }
}
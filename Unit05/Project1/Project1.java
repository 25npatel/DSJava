//Nabh Patel 
//12 December 2023

//Importing Scanner class to allow the user to input.
import java.util.Scanner;

public class Project1 {

    String section1;

    String section2;

    public static String leadingNumber (String section) {

        char i = (char) section.indexOf('.');

        String chopped = section.substring(0,i);

        String num = String.valueOf(chopped);

        return num;

    }
    public static double truncateSection(String section) {

        char i = (char) section.indexOf('.');

        String chopped = section.substring(i, section.length());

        String num1 = String.valueOf(chopped);

        return Double.parseDouble(num1);           ///////////////////////////////////////////////////

    }
    public static String whoIsFirst (String section1, String section2) {

        if (Integer.parseInt(leadingNumber(((section1)))) > Integer.parseInt(leadingNumber((section2)))) {
            if ((double) (truncateSection((section1))) > (double)(truncateSection((section2)))) {
            return section1;
        } else { 
            return section2;
        }
    }
    if (Integer.parseInt(leadingNumber(((section1)))) == Integer.parseInt(leadingNumber((section2)))) {
            if ((double)(truncateSection((section1))) == (double)(truncateSection((section2)))) {/////////////////////
                return section1;
        }
    }
    return section2; 
}
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a section number here: ");
    String section1 = input.nextLine();

    System.out.print("Please enter another section number to compare with the other section number you've inputed here: ");
    String section2 = input.nextLine();

    System.out.println(whoIsFirst(section1, section2)); /////////////////////////
    }
}
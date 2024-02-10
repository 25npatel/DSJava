//Nabh Patel 
//(Redone) February 9th, 2024

//Importing Scanner class to allow the user to input sections.
import java.util.Scanner;

public class Project1 {

    //How to find section1's leading number:
    public static double leadingNumber1(String section1) {

        //index equals the first period.
        int i1 = section1.indexOf('.');

        //Specifying the leading number by using subscripts. 
        String chopped1 = section1.substring(0, i1);

        //returning the double form of chopped1.
        return Double.parseDouble(chopped1);
    }

    //How to find section2's leading number:
    public static double leadingNumber2(String section2) {

        //index equals the first period.
        int i2 = section2.indexOf('.');

        //Specifying the leading number by using subscripts. 
        String chopped2 = section2.substring(0, i2);

        //returning the double form of chopped2.
        return Double.parseDouble(chopped2);
    }

    //How to find section1's other half:
    public static double truncateSection1(String section1) {

        
        int i1 = section1.indexOf('.');

        String chopped1 = section1.substring(i1 + 1);

        return Double.parseDouble(chopped1);
    }

    //How to find section2's other half:
    public static double truncateSection2(String section2) {

        int i2 = section2.indexOf('.');

        String chopped2 = section2.substring(i2 + 1); 
        return Double.parseDouble(chopped2);
    }

    //Main method that finds which section is less than the other using the previous methods above.
    public static String whoIsFirst(String section1, String section2) {

        double leadingNumber1 = leadingNumber1(section1);

        double leadingNumber2 = leadingNumber2(section2);

        if (leadingNumber1 < leadingNumber2) {

            return "Section 1 comes first.";
        } else if (leadingNumber1 > leadingNumber2) {

            return "Section 2 comes first.";
        } else {

            double truncateSection1 = truncateSection1(section1);

            double truncateSection2 = truncateSection2(section2);

            if (truncateSection1 < truncateSection2) {

                return "Section 1 comes first.";
            } else if (truncateSection1 > truncateSection2) {

                return "Section 2 comes first.";
            } else {

                return "Both sections are equal.";
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a section number here: ");
        String section1 = in.nextLine();

        System.out.print("Please enter another section number to compare with the other section number you've inputted here: ");
        String section2 = in.nextLine();

        System.out.println(whoIsFirst(section1, section2));
    }
}

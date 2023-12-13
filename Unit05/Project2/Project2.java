//Nabh Patel
//12 December 2023

//Importing Scanner class so the user can input values.
import java.util.Scanner;

public class Project2 {

    //public static String getEncodedDigit(int d) {

    //}
    //public static int getCheckDigit(String zipCode) {


   //}
    public static String getBarCode(String zipCode) {

        /* 
            if (zipCode.charAt(0) == '1' || zipCode.charAt(1) == '1' || zipCode.charAt(2) == '1' || zipCode.charAt(3) == '1' || zipCode.charAt(4) == '1') {
                System.out.print(":::||");
            }
            if (zipCode.charAt(0) == '2' || zipCode.charAt(1) == '2' || zipCode.charAt(2) == '2' || zipCode.charAt(3) == '2' || zipCode.charAt(4) == '2') {
                System.out.print("::|:|");
            }
            if (zipCode.charAt(0) == '3' || zipCode.charAt(1) == '3' || zipCode.charAt(2) == '3' || zipCode.charAt(3) == '3' || zipCode.charAt(4) == '3') {
                System.out.print("::||:");
            }
            if (zipCode.charAt(0) == '4' || zipCode.charAt(1) == '4' || zipCode.charAt(2) == '4' || zipCode.charAt(3) == '4' || zipCode.charAt(4) == '4') {
                System.out.print(":|::|");
            }
            if (zipCode.charAt(0) == '5' || zipCode.charAt(1) == '5' || zipCode.charAt(2) == '5' || zipCode.charAt(3) == '5' || zipCode.charAt(4) == '5') {
                System.out.print(":|:|:");
            }
            if (zipCode.charAt(0) == '6' || zipCode.charAt(1) == '6' || zipCode.charAt(2) == '6' || zipCode.charAt(3) == '6' || zipCode.charAt(4) == '6') {
                System.out.print(":||::");
            }
            if (zipCode.charAt(0) == '7' || zipCode.charAt(1) == '7' || zipCode.charAt(2) == '7' || zipCode.charAt(3) == '7' || zipCode.charAt(4) == '7') {
                System.out.print("|:::|");
            }
            if (zipCode.charAt(0) == '8' || zipCode.charAt(1) == '8' || zipCode.charAt(2) == '8' || zipCode.charAt(3) == '8' || zipCode.charAt(4) == '8') {
                System.out.print("|::|:");
            }
            if (zipCode.charAt(0) == '9' || zipCode.charAt(1) == '9' || zipCode.charAt(2) == '9' || zipCode.charAt(3) == '9' || zipCode.charAt(4) == '9') {
                System.out.print("|:|::");
            }
            if (zipCode.charAt(0) == '0' || zipCode.charAt(1) == '0' || zipCode.charAt(2) == '0' || zipCode.charAt(3) == '0' || zipCode.charAt(4) == '0') {
                System.out.println("||:::");
            }
            */
            if (zipCode.charAt(0) == '0' || zipCode.charAt(1) == '0' || zipCode.charAt(2) == '0' || zipCode.charAt(3) == '0' || zipCode.charAt(4) == '0') {
                System.out.print("||:::");
            }
            if (zipCode.charAt(0) == '9' || zipCode.charAt(1) == '9' || zipCode.charAt(2) == '9' || zipCode.charAt(3) == '9' || zipCode.charAt(4) == '9') {
                System.out.print("|:|::");
            }
            if (zipCode.charAt(0) == '8' || zipCode.charAt(1) == '8' || zipCode.charAt(2) == '8' || zipCode.charAt(3) == '8' || zipCode.charAt(4) == '8') {
                System.out.print("|::|:");
            }
            if (zipCode.charAt(0) == '7' || zipCode.charAt(1) == '7' || zipCode.charAt(2) == '7' || zipCode.charAt(3) == '7' || zipCode.charAt(4) == '7') {
                System.out.print("|:::|");
            }
            if (zipCode.charAt(0) == '6' || zipCode.charAt(1) == '6' || zipCode.charAt(2) == '6' || zipCode.charAt(3) == '6' || zipCode.charAt(4) == '6') {
                System.out.print(":||::");
            }
            if (zipCode.charAt(0) == '5' || zipCode.charAt(1) == '5' || zipCode.charAt(2) == '5' || zipCode.charAt(3) == '5' || zipCode.charAt(4) == '5') {
                System.out.print(":|:|:");
            }
            if (zipCode.charAt(0) == '4' || zipCode.charAt(1) == '4' || zipCode.charAt(2) == '4' || zipCode.charAt(3) == '4' || zipCode.charAt(4) == '4') {
                System.out.print(":|::|");
            }
            if (zipCode.charAt(0) == '3' || zipCode.charAt(1) == '3' || zipCode.charAt(2) == '3' || zipCode.charAt(3) == '3' || zipCode.charAt(4) == '3') {
                System.out.print("::||:");
            }
            if (zipCode.charAt(0) == '2' || zipCode.charAt(1) == '2' || zipCode.charAt(2) == '2' || zipCode.charAt(3) == '2' || zipCode.charAt(4) == '2') {
                System.out.print("::|:|");
            }
            if (zipCode.charAt(0) == '1' || zipCode.charAt(1) == '1' || zipCode.charAt(2) == '1' || zipCode.charAt(3) == '1' || zipCode.charAt(4) == '1') {
                System.out.println(":::||");
            }

        return zipCode;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hi! Please enter your encoded digit here: ");
        String zipCode = in.nextLine();

        System.out.println(getBarCode(zipCode));


    }
}
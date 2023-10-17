//Nabh Patel
// 16 October 2023

//Importing Scanner class so the user can give an input.
import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Asks the user for a number to convert into a roman numeral.
        System.out.print("Hi, please enter a number to convert to Roman Numerals here: ");

        //Declaring user's input as int num.
        int num = in.nextInt();

        //Thousands.
        int romanThousands = (num % 10000 - num % 1000) / 1000;
        if (romanThousands == 1) {
            System.out.print("M");
        }
        if (romanThousands == 2) {
            System.out.print("MM");
        }
        if (romanThousands == 3) {
            System.out.print("MMM");
        }

        //Hundreds.
        int romanHundreds = (num % 1000 - num % 100) / 100;
        if (romanHundreds == 1) {
            System.out.print("C");
        }
        if (romanHundreds == 2) {
            System.out.print("CC");
        }
        if (romanHundreds == 3) {
            System.out.print("CCC");
        }
        if (romanHundreds == 4) {
            System.out.print("CD");
        }
        if (romanHundreds == 5) {
            System.out.print("D");
        }
        if (romanHundreds == 6) {
            System.out.print("DC");
        }
        if (romanHundreds == 7) {
            System.out.print("DCC");
        }
        if (romanHundreds == 8) {
            System.out.print("DCCC");
        }
        if (romanHundreds == 9) {
            System.out.print("CM");
        }

        //Tens.
        int romanTens = (num % 100 - num % 10) / 10;
        if (romanTens == 1) {
            System.out.print("X");
        }
        if (romanTens == 2) {
            System.out.print("XX");
        }
        if (romanTens == 3) {
            System.out.print("XXX");
        }
        if (romanTens == 4) {
            System.out.print("XL");
        }
        if (romanTens == 5) {
            System.out.print("L");
        }
        if (romanTens == 6) {
            System.out.print("LX");
        }
        if (romanTens == 7) {
            System.out.print("LXX");
        }
        if (romanTens == 8) {
            System.out.print("LXXX");
        }
        if (romanTens == 9) {
            System.out.print("XC");
        }

        //Ones.
        int romanOnes = num % 10;
        if (romanOnes == 1) {
            System.out.print("I");
        }
        if (romanOnes == 2) {
            System.out.print("II");
        }
        if (romanOnes == 3) {
            System.out.print("III");
        }
        if (romanOnes == 4) {
            System.out.print("IV");
        }
        if (romanOnes == 5) {
            System.out.print("V");
        }
        if (romanOnes == 6) {
            System.out.print("VI");
        }
        if (romanOnes == 7) {
            System.out.print("VII");
        }
        if (romanOnes == 8) {
            System.out.print("VIII");
        }
        if (romanOnes == 9) {
            System.out.print("IX");
        }
    }
}

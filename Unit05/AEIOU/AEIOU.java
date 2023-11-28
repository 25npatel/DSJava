//Nabh Patel
//November 22, 2023

//Importing Scanner class to allow user to input a phrase.
import java.util.Scanner;

//class is named "AEIOU".
public class AEIOU {

    //Created a helper vowel.
    public static boolean isVowel(char c) {

        //If char "c" equals "aeiou" or "AEIOU", then return true. Else, return false.
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' 
            || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                return true;
        } else {
            return false;
        }
    }

    // Method is called "countVowels".
    public static int countVowels(String phrase) {

        // "int countVowels" starts at 0 or the starting value of a phrase.
        int countVowels = 0;

        // "int i" is initialized.
        int i;

        // For loop that counts the number of characters in a sentence.
        for (i = 0; i <= phrase.length() - 1; i++) {

            //If isVowel() of any character is true, count all the vowels. 
            if (isVowel(phrase.charAt(i))) {
                countVowels++;
            }
        }

        // Return the method "countVowels".
        return countVowels;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Asks the user for a phrase.
        System.out.print("Please enter your phrase here: ");

        // The user inputs a phrase.
        String phrase = in.nextLine();

        // The "phrase" is inserted into the method "countVowels" to find the number of
        // vowels in the phrase given by the user.
        System.out.println("You have " + countVowels(phrase) + " vowel(s) in your phrase!");
    }
}

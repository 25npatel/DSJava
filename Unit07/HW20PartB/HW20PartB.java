import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HW20PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("characters.txt");
        Scanner in = new Scanner(inputFile);

        in.useDelimiter("[,.\\s\\t\\n]+");

        int numbers = (int) Math.random() * 100;

        int count = 0;
        int letters = 0;
        int digits = 0;

        while (in.hasNext()) {

            String word = in.next();

            count++;

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);

                if (Character.isDigit(currentChar)) {
                    digits++;
                } 
                if (Character.isLetter(currentChar)) {
                    letters++;
                }
            }   
        }

        System.out.println("There are " + count + " words.");

        System.out.println("There are " + digits + " numbers.");

        System.out.println("There are " + letters + " letters.");
       
        in.close();
    }
}
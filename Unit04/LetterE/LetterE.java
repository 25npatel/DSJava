import java.util.Scanner;

public class LetterE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a sentence or more here: ");

        String sentence = in.nextLine();

        int numE = 0;

        int i;
        
        for (i = 0; i<=sentence.length() - 1; i++) {
            if (sentence.charAt(i) == 'e') {
                numE++;
            }
        }
        System.out.println("The number of \'e\'s is/are " + numE);
    }
}

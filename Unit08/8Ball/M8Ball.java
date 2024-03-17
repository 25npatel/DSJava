import java.util.Scanner;
import org.derryfield.toys.Magic8Ball;

public class M8Ball {
    public static void main(String[] args) {

        Magic8Ball magic8Ball = new Magic8Ball();
        
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.print("Please enter your question here: ");

            String question = in.nextLine();

            if (question.equalsIgnoreCase("q") || question.equalsIgnoreCase("Q")) {
                break;
            }

            String answer = magic8Ball.getRandomResponse();

            System.out.println(answer);
        }

        in.close();
    }
}

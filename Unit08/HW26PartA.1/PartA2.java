import java.util.Scanner;

public class PartA2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Please give a number here: ");
        double number = in.nextDouble();

        System.out.println("Here is the square root of " + number + ": " + Math.sqrt(number));

        System.out.println("And here is " + number + " multiplied by pi: " + number*Math.PI);
    }
}
import java.util.Scanner;
import java.util.ArrayList;

public class P2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> integers = new ArrayList<Integer>();

        System.out.println("Please enter a number below: ");

        while (true) {

            if (in.hasNext("q") || in.hasNext("Q")) {

                break;
            }

            System.out.println("Please enter a number below: ");
            int number = in.nextInt();

            integers.add(number);
        }

        int lastTotal = integers.get(0);

        for (int i = 1; i < integers.size(); i++) {

            if (i % 2 == 1) {
                lastTotal = lastTotal - integers.get(i);
            } else {
                lastTotal = lastTotal + integers.get(i);
            }
            
        }

        System.out.println();

        System.out.println("Here is the total below, Mr. Eng:");

        System.out.println(lastTotal);
    }
}
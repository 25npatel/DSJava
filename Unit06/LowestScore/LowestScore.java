//Nabh Patel
//December 25, 2023

//Importing integral packages in order to
//allow the user to input and enhances the 
//code itself to function properly. 


import java.util.Scanner;
import java.util.Arrays;

public class LowestScore {

    public static int[] removeSmallest(int[] scores) {

        Arrays.sort(scores);

        int[] copy = Arrays.copyOf(scores, scores.length);

        copy[0] = 0;

        System.out.println(Arrays.toString(copy));

        return copy;
    }

    public static void main(String[] args ) {

        Scanner in = new Scanner(System.in);

        int[] scores = new int[0];

        int SIZE = scores.length + 1;

        while (true) {

            System.out.print("Enter integer values or 'q' to quit: ");

            if (in.hasNext("q")|| in.hasNext("Q")) {

                System.out.println("Done entering input.");

                break;

                } else {
                    if (SIZE >= scores.length) {
                        scores = Arrays.copyOf(scores, scores.length + 1);
                }
                scores[scores.length - 1] = in.nextInt();
                SIZE++;
            }
        }

        Arrays.toString(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println();

        System.out.print("Do you want to remove the lowest score? Please enter ('y' for 'yes' or if not, input 'n' for 'no') here: ");

        in.next();

        if (in.hasNext("y")) {
            System.out.print(removeSmallest(scores));
            } else {
                Arrays.toString(scores);
                System.out.println(Arrays.toString(scores));
        }
        System.out.println();
    }
}

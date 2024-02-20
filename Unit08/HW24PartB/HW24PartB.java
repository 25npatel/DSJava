import java.util.Scanner;

class Counter {

    int cakeCount;
    int pieCount;

    public int getCakeCount() {
        return cakeCount;
    }

    public int getPieCount() {
        return pieCount;
    }
}

public class HW24PartB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Counter myCounter = new Counter();

        while (true) {

            System.out.println("Press 'c' for cake, 'p' for pie, or 'q' to quit:");

            String input = in.nextLine();

            if (input.equalsIgnoreCase("q")) {

                break;
            } else if (input.equalsIgnoreCase("c")) {

                myCounter.cakeCount++;
            } else if (input.equalsIgnoreCase("p")) {
                
                myCounter.pieCount++;
            } else {
                System.out.println("Invalid input. Please enter 'c', 'p', or 'q'.");
            }
        }

        System.out.println("Final Cake count: " + myCounter.getCakeCount());

        System.out.println("Final Pie count: " + myCounter.getPieCount());

        in.close();
    }
}

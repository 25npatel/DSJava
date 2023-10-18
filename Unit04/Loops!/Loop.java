import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.println("Enter a number or 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                break;
            }
            else {
                if(in.hasNextDouble()) {
                    total = total + in.nextDouble();
                }
            }
        }
        System.out.println("total = " + total);
    }
}
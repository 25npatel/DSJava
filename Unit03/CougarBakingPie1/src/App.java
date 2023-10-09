import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("How many pies would you like? Please enter number of pies here: ");
        int num_Pies = in.nextInt();
        final double pie_Val = 10.00;

        if (num_Pies >= 3) {
            System.out.println("Your total cost with 10% discount: $" + ((num_Pies * pie_Val) - (num_Pies * pie_Val)*0.1));
        } else {
            System.out.println("Your total cost: $" + num_Pies * pie_Val);
        }
    }
}

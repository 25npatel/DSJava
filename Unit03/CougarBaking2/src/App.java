//Nabh Patel
//9 October 2023

//importing Scanner class so user can input a number of cookies.
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //Asks the user how many cookies they'd like to buy.
        System.out.print("Please enter how many cookies you'd like to buy here: ");
        //The user's input is declared as a int variable called "num_Cookies".
        int num_Cookies = in.nextInt();

        //Cookie price is $0.99
        final double cookie_Price = 0.99;

        //If user inputs more than 6 cookies, than the user will get a %2.5 discount off the cookie price.
        if (num_Cookies > 6) {
            System.out.println("Your total cost is $" + (num_Cookies * cookie_Price - ((num_Cookies * cookie_Price) * 0.025)));
        //If user inputs more than 12 cookies, than the user will get a %5 discount off the cookie price.
        } if (num_Cookies > 12) {
            System.out.println("Your total cost is $" + (num_Cookies * cookie_Price - ((num_Cookies * cookie_Price) * 0.05)));
        //If user inputs more than 24 cookies, than the user will get a %15 discount off the cookie price.
        } if (num_Cookies > 24) {
            System.out.println("Your total cost is $" + (num_Cookies * cookie_Price - ((num_Cookies * cookie_Price) * 0.15))); 
        }
    }
}

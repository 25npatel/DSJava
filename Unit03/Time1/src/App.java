//Nabh Patel 
//September 23, 2023

//Imports Scanner class, which gives the user the ability to give an input to the program.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //Asks the user for an input in seconds.
        System.out.println("Welcome to TIME! Please give me a time value (in seconds) so I can convert it to hours, minutes, and seconds here: ");
        //The integer variable, T_Val equals the input given by the user.
        int T_Val = in.nextInt();
        //Hours is calculated by dividing the input by 3600.
        int H_V = (T_Val / 3600);
        //Finds the modula of T_Val divided by 60 which equals S_V or the amount of seconds.
        int S_V = (T_Val%60);
        //Finds the modula of T_Val divided by 3600 which equals the new T_Val.
        T_Val = T_Val%3600;
        //Finds the minutes value by divided T_Val by 60.
        int M_V = T_Val/60;
        //Prints the hours, minutes, and seconds in HH:MM:SS format.
        System.out.println(H_V + ":" + M_V + ":" + S_V);
    }
}

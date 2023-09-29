//Nabh Patel
//September 23, 2023

//imports Dialog Box class, which allows Dialog boxes to appear.
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    
    //Asks the user for their names.
    String name = JOptionPane.showInputDialog("What is your name?");

    //Asks the user for a number.
    String X = JOptionPane.showInputDialog("Hello " + name + ", please enter a number (not to big).");

    //Asks the user for another number.
    String Y = JOptionPane.showInputDialog("Alright " + name + ", please enter another number (not to big). We're going to add both of these numbers!");

    //Adds the parsed strings (that are now integers).
    int sum = Integer.parseInt(X) + Integer.parseInt(Y);

    //Prints the sum of the two integers given by the user.
    System.out.println(sum);
    }
}


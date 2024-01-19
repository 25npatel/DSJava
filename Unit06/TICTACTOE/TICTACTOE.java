//Nabh Patel
//January 17, 2024

//Importing Scanner class to allow the user to input.
import java.util.Scanner;

public class TICTACTOE {

    //Method that prints the TICTACTOE board.
    public static char[][] printBoard(char [][] chart) {

        //Traverses the 2D array.
        for (int row = 0; row < chart.length; row++) {

            for (int col = 0; col < chart[0].length; col++) {

                System.out.print(chart[row][col]);

                if (col < chart[0].length - 1) {

                    System.out.print(" ");
                }
            }

            //Extra line of code for spacing.
            System.out.println();
        }

        //Returns the chart. 
        return chart;
    }

    //Method that clears the screen.
    public static char[][] clearScreen(char [][] chart) {

        System.out.print("\033[H\033[2J");

        //Clears or flushes out the board from the terminal.
        System.out.flush();

        //Returns the chart.
        return chart;
    }

    public static void main(String[] args) {

        //Declared the Scanner class.
        Scanner in = new Scanner(System.in);

        //Welcomes both the players to the game.
        System.out.println("LETS PLAY TICTACTOE!");

        //Extra line of code for spacing. 
        System.out.println();

        //Creating a new 2D array
        char [][] chart = { 

            {'*', '*', '*'}, 
            {'*', '*', '*'}, 
            {'*', '*', '*'}

        };

        //Declaring and initializing 'i' to 0, for While Loop.
        int i = 0;

        //While Loop.
        while (i < 9) {

            //Prints the board.
            printBoard(chart);

            //If the first turn or index modula 2 equals 0, then have the first player to input the 'x' value.
            if ((double) i % 2 == 0) {

                //Asks the player for an input. 
                System.out.print("Player #1, please enter the ROW in where you want to place 'x': ");
                int x = in.nextInt();

                //Extra line of code for spacing.
                System.out.println();

                //Asks the player for an input. 
                System.out.print("Player #1, please enter the COLUMN in where you want to place 'x': ");
                int y = in.nextInt();

                //Extra line of code for spacing.
                System.out.println();

                chart[x][y] = 'x';
            }
            else {

                //Asks the player for an input. 
                System.out.print("Player #2, please enter the ROW in where you want to place 'o': ");
                int x = in.nextInt();

                System.out.println();

                //Asks the player for an input. 
                System.out.print("Player #2, please enter the COLUMN in where you want to place 'o': ");
                int y = in.nextInt();

                //Extra line of code for spacing.  
                System.out.println();

                chart[x][y] = 'o';
            }

            //Clears the screen for each iteration. 
            clearScreen(chart);

            //Goes to the next index. 
            i++;

        //Checks which player has won below:

        //Horizontal.
        if (chart[0][0] == 'x' && chart[0][1] == 'x' && chart[0][2] == 'x') {
            System.out.println("Player #1 Wins!");
        } 
        if (chart[0][0] == 'o' && chart[0][1] == 'o' && chart[0][2] == 'o') {
            System.out.println("Player #2 Wins!"); 
        }

        if (chart[1][0] == 'x' && chart[1][1] == 'x' && chart[1][2] == 'x') {
            System.out.println("Player #1 Wins!");
        } 
        if (chart[1][0] == 'o' && chart[1][1] == 'o' && chart[1][2] == 'o') {
            System.out.println("Player #2 Wins!"); 
        }

        if (chart[2][0] == 'x' && chart[2][1] == 'x' && chart[2][2] == 'x') {
            System.out.println("Player #1 Wins!");
        } 
        if (chart[2][0] == 'o' && chart[2][1] == 'o' && chart[2][2] == 'o') {
            System.out.println("Player #2 Wins!");
        } 

        //Vertical.
        if (chart[0][0] == 'x' && chart[1][0] == 'x' && chart[2][0] == 'x') {
            System.out.println("Player #1 Wins!");
        } 
        if (chart[0][0] == 'o' && chart[1][0] == 'o' && chart[2][0] == 'o') {
            System.out.println("Player #2 Wins!");
        } 

        if (chart[0][1] == 'x' && chart[1][1] == 'x' && chart[2][1] == 'x') {
            System.out.println("Player #1 Wins!");
        } 
        if (chart[0][1] == 'o' && chart[1][1] == 'o' && chart[2][1] == 'o') {
            System.out.println("Player #2 Wins!");
        }

        if (chart[0][2] == 'x' && chart[1][2] == 'x' && chart[2][2] == 'x') {
            System.out.println("Player #1 Wins!");
        } 
        if (chart[0][2] == 'o' && chart[1][2] == 'o' && chart[2][2] == 'o') {
            System.out.println("Player #2 Wins!");
        }

        //Diagonal. 
        if (chart[0][0] == 'x' && chart[1][1] == 'x' && chart[2][2] == 'x') {
            System.out.println("Player #1 Wins!");
        } 
        if (chart[0][0] == 'o' && chart[1][1] == 'o' && chart[2][2] == 'o') {
            System.out.println("Player #2 Wins!");
        } 

        if (chart[0][2] == 'x' && chart[1][1] == 'x' && chart[2][0] == 'x') {
            System.out.println("Player #1 Wins!");
        }
        if (chart[0][2] == 'o' && chart[1][1] == 'o' && chart[2][0] == 'o') {
            System.out.println("Player #2 Wins!");
            }
        }

        //Closes the Scanner class.
        in.close();
    }
}
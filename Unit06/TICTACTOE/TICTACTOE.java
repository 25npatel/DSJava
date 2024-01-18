import java.util.Scanner;

public class TICTACTOE {

    public static char[][] printBoard(char [][] chart) {

        for (int row = 0; row < chart.length; row++) {

            for (int col = 0; col < chart[0].length; col++) {

                System.out.print(chart[row][col]);

                if (col < chart[0].length - 1) {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        return chart;
    }

    public static char[][] clearScreen(char [][] chart) {

        System.out.print("\033[H\033[2J");

        System.out.flush();

        return chart;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("LETS PLAY TICTACTOE!");

        System.out.println();

        char [][] chart = { 

            {'*', '*', '*'}, 
            {'*', '*', '*'}, 
            {'*', '*', '*'}

        };

        int i = 0;

        while (i < 9) {
            printBoard(chart);

            if ((double) i % 2 == 0) {

                System.out.print("Player #1, please enter the ROW in where you want to place 'x': ");
                int x = in.nextInt();

                System.out.println();

                System.out.print("Player #1, please enter the COLUMN in where you want to place 'x': ");
                int y = in.nextInt();

                System.out.println();

                chart[x][y] = 'x';
            }
            else {

                System.out.print("Player #2, please enter the ROW in where you want to place 'o': ");
                int x = in.nextInt();

                System.out.println();

                System.out.print("Player #2, please enter the COLUMN in where you want to place 'o': ");
                int y = in.nextInt();

                System.out.println();

                chart[x][y] = 'o';
            }

            clearScreen(chart);

            i++;

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

        break;
    }

        in.close();
    }
}
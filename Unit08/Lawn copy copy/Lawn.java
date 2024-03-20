//Nabh Patel
//March 7th, 2024

//Importing Scanner class to allow the user to input
//the height and the width.
import java.util.Scanner;

import java.util.Random;

//Importing time to allow the program to clear the screen
//for half a second.
import java.util.concurrent.TimeUnit;

//Importing the Mower and Yard classes.
import mow.*;

public class Lawn {
    public static void main(String[] args) {

        //Declaring Scanner class called "in".
        Scanner in = new Scanner(System.in);

        //Asking the user for height and width.
        System.out.println("Please enter the height below:");
        int height = in.nextInt() + 2;

        System.out.println("Please enter the width below:");
        int width = in.nextInt() + 2;

        //Closing Scanner "in".
        in.close();

        //Declaring new Yard class called "yard".
        Yard yard = new Yard(height, width);

        //Declaring a "rand" from Random class.
        Random rand = new Random();

        //Randomly pick a number from 0 to 3. 
        int randomType = rand.nextInt(4);

        //If randomType is 0, mow the lawn from the top-left. The direction of the mower is predetermined.
        if (randomType == 0) {

            Mower mower = new Mower(1, 1, 'v');

            clearScreen();

            //While the yard is not empty, keep on cutting the grass.
            while (!yard.isEmpty()) {

                //Cannot input a yard with a height of 1 or width of 1.
                if (yard.getLawnHeight() == 1 || yard.getLawnWidth() == 1 || yard.getLawnHeight() == 1 && yard.getLawnWidth() == 1) {

                    System.out.println("That's not a yard, but a path.");
                    break;
                }
 
                //If the next row or col is not 'R', then keep on mowing. 
                if (yard.getCell(mower.getNextRow(), mower.getCol()) != 'R') {

                    clearScreen();
                    yard.printYard(mower);
                    mower.moveForward();
                    delay(500);
                    
                //Else, turn left.
                } else if (mower.getRow() == yard.getLawnHeight() && mower.getCol() != yard.getLawnWidth()) {

                    turnManuveurLeft(mower, yard);

                //Else, turn right.
                } else if (mower.getCol() != yard.getLawnWidth()) {

                    turnManuveurRight(mower, yard);
                }

                clearScreen();
                yard.printYard(mower);

                System.out.println("Finished Mowing!");
            }
        }

        //If randomType is 1, mow the lawn from the top-right. The direction of the mower is predetermined.
        if (randomType == 1) {

            Mower mower = new Mower(1, yard.getLawnWidth(), 'v');

            clearScreen();

            //Cannot input a yard with a height of 1 or width of 1.
            while (!yard.isEmpty()) {

                //Cannot input a yard with a height of 1 or width of 1.
                if (yard.getLawnHeight() == 1 || yard.getLawnWidth() == 1 || yard.getLawnHeight() == 1 && yard.getLawnWidth() == 1) {

                    System.out.println("That's not a yard, but a path.");
                    break;
                }
 
                //If the next row or col is not 'R', then keep on mowing. 
                if (yard.getCell(mower.getNextRow(), mower.getCol()) != 'R') {

                    clearScreen();
                    yard.printYard(mower);
                    mower.moveForward();
                    delay(500);
                    
                //Else, turn right.
                } else if (mower.getRow() == yard.getLawnHeight() && mower.getCol() != 1) {

                    turnManuveurRight(mower, yard);

                //Else, turn left.
                } else if (mower.getCol() != 1) {

                    turnManuveurLeft(mower, yard);
                }

                clearScreen();
                yard.printYard(mower);

                System.out.println("Finished Mowing!");
            }
        }

        //If randomType is 2, mow the lawn from the bottom-left. The direction of the mower is predetermined.
        if (randomType == 2) {

            Mower mower = new Mower(yard.getLawnHeight(), 1, '^');

            clearScreen();

            //Cannot input a yard with a height of 1 or width of 1.
            while (!yard.isEmpty()) {

                //Cannot input a yard with a height of 1 or width of 1.
                if (yard.getLawnHeight() == 1 || yard.getLawnWidth() == 1 || yard.getLawnHeight() == 1 && yard.getLawnWidth() == 1) {

                    System.out.println("That's not a yard, but a path.");
                    break;
                }
 
                //If the next row or col is not 'R', then keep on mowing. 
                if (yard.getCell(mower.getNextRow(), mower.getCol()) != 'R') {

                    clearScreen();
                    yard.printYard(mower);
                    mower.moveForward();
                    delay(500);
                    
                //Else, turn left.
                } else if (mower.getRow() == yard.getLawnHeight() && mower.getCol() != yard.getLawnWidth()) {

                    turnManuveurLeft(mower, yard);

                //Else, turn right.
                } else if (mower.getCol() != yard.getLawnHeight()) {

                    turnManuveurRight(mower, yard);
                }

                clearScreen();
                yard.printYard(mower);

                System.out.println("Finished Mowing!");
            }
        }

        //If randomType is 3, mow the lawn from the bottom-right. The direction of the mower is predetermined.
        if (randomType == 3) {

            Mower mower = new Mower(yard.getLawnHeight(), yard.getLawnWidth(), '^');

            clearScreen();

            //Cannot input a yard with a height of 1 or width of 1.
            while (!yard.isEmpty()) {

                //Cannot input a yard with a height of 1 or width of 1.
                if (yard.getLawnHeight() == 1 || yard.getLawnWidth() == 1 || yard.getLawnHeight() == 1 && yard.getLawnWidth() == 1) {

                    System.out.println("That's not a yard, but a path.");
                    break;
                }
 
                //If the next row or col is not 'R', then keep on mowing. 
                if (yard.getCell(mower.getNextRow(), mower.getCol()) != 'R') {

                    clearScreen();
                    yard.printYard(mower);
                    mower.moveForward();
                    delay(500);
                    
                //Else, turn right.
                } else if (mower.getRow() == yard.getLawnHeight() && mower.getCol() != 1) {

                    turnManuveurRight(mower, yard);

                //Else, turn left.
                } else if (mower.getCol() != 1) {

                    turnManuveurLeft(mower, yard);
                }

                clearScreen();
                yard.printYard(mower);

                System.out.println("Finished Mowing!");
            }
        }
    }
        
    public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();
    }

    //The following two methods turns the mower make a "U"-turn in the right direction or left direction.

    public static void turnManuveurRight(Mower mower, Yard yard) {

        clearScreen();
        yard.printYard(mower);
        mower.turnRight();
        delay(500);

        clearScreen();
        yard.printYard(mower);
        mower.moveForward();
        delay(500);

        clearScreen();
        yard.printYard(mower);
        mower.turnRight();
        delay(500);

        clearScreen();
        yard.printYard(mower);
    }

    public static void turnManuveurLeft(Mower mower, Yard yard) {

        clearScreen();
        yard.printYard(mower);
        mower.turnLeft();
        delay(500);

        clearScreen();
        yard.printYard(mower);
        mower.moveForward();
        delay(500);

        clearScreen();
        yard.printYard(mower);
        mower.turnLeft();
        delay(500);

        clearScreen();
        yard.printYard(mower);
    }

    public static void delay(long milliseconds) {

        try {

            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
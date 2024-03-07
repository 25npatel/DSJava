//The name of this package is called "mow".
package mow;

public class Yard {

    //Create a new 2D array called "yard".
    private char[][] yard;

    public Yard(int height, int width) {

        //Within the 2D array, the rows and columns will be equal to the height and the width.
        yard = new char[height][width];

        //The edges and corners will be R or red bricks. 
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                  
                    yard[i][j] = 'R';

                //Else, the rest are * or crops.
                } else {
                    
                    yard[i][j] = '*';
                }
            }
        }
    }

    //Below are the methods that will be used in Lawn.java or the main code. 

    //Getter: It will return the 2D array.
    public char getCell(int row, int col) {

        return yard[row][col];
    }

    //Setter: It will set the 2D array equal to value. 
    public void setCell(int row, int col, char value) {

        yard[row][col] = value;
    }

    //Getting the height.
    public int getLawnHeight() {

        return yard.length - 2; 
    }

    //Getting the width.
    public int getLawnWidth() {

        return yard[0].length - 2; 
    }

    public void printYard(Mower mower) {

        //Update the previous mower position to ' ' before printing the yard.
        if (mower.getPrevRow() >= 0 && mower.getPrevCol() >= 0) {

            yard[mower.getPrevRow()][mower.getPrevCol()] = ' ';
        }

        //Print the yard with the current mower position.
        for (int i = 0; i < yard.length; i++) {

            for (int j = 0; j < yard[0].length; j++) {

                if (i == mower.getRow() && j == mower.getCol()) {

                    System.out.print(mower.getDirection());
                } else {

                    System.out.print(yard[i][j]);
                }
            }

            System.out.println();
        }

        //Update the mower's previous position for the next iteration.
        mower.updatePrevPosition();
    }
}

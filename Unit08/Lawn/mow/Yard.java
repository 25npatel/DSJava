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

                //Else, the rest are + or crops.
                } else {
                    
                    yard[i][j] = '+';
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

    public int getLawnHeight() {

        return yard.length - 2; 
    }

    //public int getLawnWidth() {

        //return yard[0].length - 2; 
    //}

    //Printing the yard by traversing through the 2D array.
    public void printYard() {

        for (int i = 0; i < yard.length; i++) {

            for (int j = 0; j < yard[0].length; j++) {

                System.out.print(yard[i][j]);
            }

            System.out.println();
        }
    }
}



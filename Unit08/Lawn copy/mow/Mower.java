package mow;

public class Mower {

    //Variables being used in this Mower class.

    private int row;

    private int col;

    private int prevRow;

    private int prevCol;

    private char direction;

    //Variables will set where the mower can start, and where it is heading. 
    public Mower(int row, int col, char direction) {

        this.row = row;

        this.col = col;

        this.prevRow = row;

        this.prevCol = col;

        this.direction = direction;
    }

    //Getting the previous row.
    public int getPrevRow() {

        return prevRow;
    }

    //Getting the previous column.
    public int getPrevCol() {

        return prevCol;
    }

    //updating the previous column and row to the next one.
    public void updatePrevPosition() {

        this.prevRow = row;

        this.prevCol = col;
    }

    //Getting the row.
    public int getRow() {

        return row;
    }

    //Getting the column.
    public int getCol() {

        return col;
    }

    //Getting the direction (which way the mower is heading).
    public char getDirection() {

        return direction;
    }

    //Moving forward in the same row and moving column after column.
    public void moveForward() {

        if (direction == '>') {

            col++;
        }
    }

    //Turning left.
    public void turnLeft() {

        if (direction == '>') {

            direction = '^';
        } else if (direction == '^') {

            direction = '<';
        } else if (direction == '<') {

            direction = 'v';
        } else if (direction == 'v') {

            direction = '>';
        }
    }

    //Turning right.
    public void turnRight() {

        if (direction == '>') {

            direction = 'v';
        } else if (direction == 'v') {

            direction = '<';
        } else if (direction == '<') {

            direction = '^';
        } else if (direction == '^') {

            direction = '>';
        }
    }

    //Check whether the next column has grass or not.
    public boolean sense(Yard yard) {

        int nextRow = row;

        int nextCol = col;

        if (direction == '>') {

            nextCol++;
        }

        //Assuming '*' represents grass.
        return yard.getCell(nextRow, nextCol) == '*'; 
    }

    //Cut grass in the trail of the mower.
    public void cutGrass(Yard yard) {

        if (yard.getCell(row, col) == '*') {

            //Assuming ' ' represents cut grass.
            yard.setCell(row, col, ' '); 
        }
    }
}

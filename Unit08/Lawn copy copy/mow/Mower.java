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

    public int getNextRow() {

        if (direction == '>') {
            return row;
        }
        else if (direction == '<') {
            return row;
        }
        else if (direction == 'v') {

            return row + 1;
        }
        else if (direction == '^') {

            return row - 1;
        }
        return row;
    }
    public int getNextCol() {

        if (direction == '>') {
            return col + 1;
        }
        else if (direction == '<') {
            return col - 1;
        }
        else if (direction == 'v') {

            return col;
        }
        else if (direction == '^') {

            return col;
        }
        return col;
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
        if (direction == '<') {

            col--;
        }
        if (direction == 'v') {

            row++;
        }
        if (direction == '^') {

            row--;
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
}
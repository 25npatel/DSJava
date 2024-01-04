//Nabh Patel
//January 3, 2024


public class HW17PartB {

    public static void print(int[][] values, int[][] values1) {

        //Prints user friendly code.
        System.out.println("First array: ");

        //For loops that traverses "values". 
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[0].length; col++) {
                System.out.print(values[row][col]);
                if (col < values[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        //Adds a space to make a user friendly approach. 
        System.out.println();

        //Prints user friendly code.
        System.out.println("Second array: ");

        //For loops that traverses "values1". 
        for (int row = 0; row < values1.length; row++) {
            for (int col = 0; col < values1[0].length; col++) {
                System.out.print(values1[row][col]);
                if (col < values1[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //values
        int[][] values = {
            {8, 6, 7},
            {5, 3, 0}
        };

        //values1
        int[][] values1 = {
            {0, 7, 6, 5},
            {2, 2, 0, 1},
            {8, 4, 5, 7}
        };

        //Prints "values" and "values1".
        print(values, values1);

    }
}



//Nabh Patel
//February 2, 2024

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW21PartB {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("sales_by_cat.txt");
        Scanner in = new Scanner(inputFile);

        //While Loop.
        while (in.hasNextLine()) {
            //A line is defined every time there is a new line formed.
            String line = in.nextLine();

            //Make a new Scanner class called lineScanner
            Scanner lineScanner = new Scanner(line);

            //lineScanner will use a delimeter when it reads the file.
            lineScanner.useDelimiter(",\\s*");

            //If lineScanner reads anything before "|", the 
            //String variable, category, will be assigned to that line of string.
            if (lineScanner.hasNext()) {
                String category = lineScanner.next();

            //If lineScanner reads anything before another "|", the 
            //String variable, employee, will be assigned to that line of string.
            if (lineScanner.hasNext()) {
                String employee = lineScanner.next();

            //If lineScanner reads anything before another "|", and there are only digits
            //and numbers, then this will be assigned to the double variable called salesAmount.
            if (lineScanner.hasNextDouble()) {
                double salesAmount = lineScanner.nextDouble();

                //Prints the category, employee, and the salesAmount (formatted).
                System.out.printf("%-18s | %-10s | $%9.2f%n", category, employee, salesAmount);
            }
        }
    }

    //lineScanner scanner class closes.
    lineScanner.close();
}

    //Scanner class closes.
    in.close();
    }
}

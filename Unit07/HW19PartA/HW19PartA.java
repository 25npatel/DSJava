//Nabh Patel
//January 23, 2024

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class HW19PartA {
    public static void main(String[] args) throws FileNotFoundException { 

        ArrayList<Integer> Temp = new ArrayList<Integer>();

        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);

        System.out.println();

        while (in.hasNext()) {

            int temps = in.nextInt();

            Temp.add((int) temps);
        }

        int lowest = Temp.get(0);
            
        for (int i = 1; i < Temp.size(); i++) {

            if (Temp.get(i) < lowest) {

                lowest = Temp.get(i);
            }
        }

        System.out.println("Lowest value: " + lowest);

        for (int printTemp : Temp) {
            System.out.println(printTemp + (printTemp == lowest ? " <= Lowest" : ""));
        }


        in.close();
    }  
}
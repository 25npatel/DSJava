//Nabh Patel
//January 27, 2024

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HW20PartA {
   public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("customerData.txt");
        Scanner in = new Scanner(inputFile);

        in.useDelimiter("[,\\s\\n]+");

        System.out.println("---------------------------------------");
        System.out.println("   ID  |    Name     |     Balance");
        System.out.println("---------------------------------------");
     
        while (in.hasNext()) {

            String ID = in.next();
            System.out.print("000" + ID.substring(0, 3) + " |");

            String Name = in.next();
            
            if (Name.length() == 1) {
                System.out.print(Name.substring(0) + "            | ");
            } 
            if (Name.length() == 2) {
                System.out.print(Name.substring(0) + "           | ");
            }
            if (Name.length() == 3) {
                System.out.print(Name.substring(0) + "          | ");
            }
            if (Name.length() == 4) {
                System.out.print(Name.substring(0) + "         | ");
            }
            if (Name.length() == 5) {
                System.out.print(Name.substring(0) + "        | ");
            }
            if (Name.length() == 6) {
                System.out.print(Name.substring(0) + "       | ");
            }
            if (Name.length() == 7) {
                System.out.print(Name.substring(0) + "      | ");
            }
            if (Name.length() == 8) {
                System.out.print(Name.substring(0) + "     | ");
            }
            if (Name.length() == 9) {
                System.out.print(Name.substring(0) + "    | ");
            }
            if (Name.length() == 10) {
                System.out.print(Name.substring(0) + "   | ");
            }

            String Money = in.next();
            System.out.println(Money.substring(0) + "       |");
        }

        in.close();
   }
}

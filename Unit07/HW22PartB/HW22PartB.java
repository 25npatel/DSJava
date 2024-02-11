import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HW22PartB {
    public static void main(String[] args) {

        boolean loopflag = false;

        // While loop.
        while (!loopflag) {

            //Try-Catch.
            try {

                //The Program will try to open "birthyears.txt".
                File file = new File("birthyears.txt");

                //A new Scanner class will be used by the program to read "birthyears.txt".
                Scanner fileScanner = new Scanner(file);

                //While Loop.
                while (fileScanner.hasNextLine()) {

                    //Updated delimiter to handle both commas and spaces.
                    fileScanner.useDelimiter("[,\\n]+"); 

                    //String name is anything that is a string. 
                    String name = fileScanner.next();

                    //String birthYearStr is also anything that is a string at first.
                    String birthYearStr = fileScanner.next();

                    //Check if the birth year is available and convert it to an integer.
                    if (!birthYearStr.equals("n/a")) {

                        //Try-Catch inside of a Try-Catch. 
                        try {

                            int birthYear = Integer.parseInt(birthYearStr);

                            System.out.println(name + " was born in " + birthYear + ".");

                        } 
                        
                        //Using NumberFormatException in case the program reads "n/a"
                        catch (NumberFormatException e) {

                            // Handle the NumberFormatException if the birth year is not a valid integer.
                            System.out.println("Error parsing birth year for " + name + ".");
                        }  
                    } 

                    //Else, print the name of the line with no birth year and say that the program does not know. 
                    else {

                        System.out.println("I do not know what year " + name + " was born.");
                    }
                }
        
                loopflag = true;

                // "FileScanner" closes.
                fileScanner.close();
            
            } 
            
            //If the file, is entirely not found, then print that the program cannot find it.  
            catch (FileNotFoundException e) {

                System.out.println("Sorry, unfortunately the file is not found...");
            }
        }
    }
}


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HW22PartA {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the file name or '#' to quit: ");
            String fileName = in.next();

            if (fileName.equals("#")) {
                System.out.println("Exiting the program.");
                break;
            }

            try {
                File file = new File(fileName);
                Scanner fileScanner = new Scanner(file);

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }

                fileScanner.close();
                System.out.println("File read successfully.");

            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found - \"" + fileName + "\"");
            }
        }

        in.close();
    }
}


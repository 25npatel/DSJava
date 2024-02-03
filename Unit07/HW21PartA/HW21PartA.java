import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW21PartA {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("Top5Unemployment.txt");
        Scanner in = new Scanner(inputFile);

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates                    ");
        System.out.println("---------------------------------------------------------------");

        int rank = 1; 

        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",\\s*");

            if (lineScanner.hasNext()) {
                String country = lineScanner.next();

                if (lineScanner.hasNextDouble()) {
                    double percentage = lineScanner.nextDouble();
                    int regionRank = lineScanner.nextInt();
                    String region = lineScanner.next();

                    System.out.printf("Ranked #%d : %-18s | %-5.2f%% | %s%n", rank, country, percentage, region);
                    rank++;
                }
            }

            lineScanner.close();
        }

        System.out.println("---------------------------------------------------------------");

        in.close(); 
    }
}
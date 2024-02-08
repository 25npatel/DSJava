import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PracticeProblem {
    public static void main(String[] args) throws FileNotFoundException {
        
        File inputFile = new File("RichBros.txt");
        Scanner in = new Scanner(inputFile);

        in.useDelimiter("[;\\n]+");

        while (in.hasNext()) {

            String name = in.next();

            String accountVal = in.next().trim();

            accountVal = accountVal.replaceAll(",", "");

            accountVal = accountVal.replaceAll("\\$", "");

            double balance = Double.parseDouble(accountVal);

            double tax = (balance * 0.03);
            
            String country = in.next();

            System.out.printf(": %s | $ %14.2f | $ %14.2f | %s", name, accountVal, tax, country);
        }

        in.close();
    }
}
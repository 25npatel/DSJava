import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW19PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("quizzesMod.txt");
        PrintWriter out = new PrintWriter(outputFile);

        int i = 0;

        while (in.hasNext()) {
            i++;
            double score = in.nextDouble();
            out.println("Quiz " + i + " " + score);
        }

        out.println("---------------");

        in.close();

        in = new Scanner(inputFile);

        double sum = 0;
        i = 0; 

        while (in.hasNext()) {
        
            i++;
            sum += in.nextDouble();
            double avg = sum / i; 
            out.println("Here is the average at this iteration: " + avg);
        }

        out.println("---------------");

        in.close();
        out.close();
    }
}

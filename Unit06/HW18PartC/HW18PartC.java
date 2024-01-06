import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class HW18PartC {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    ArrayList<Double> temperatures = new ArrayList<Double>();

    System.out.println("Please enter your temperature here or to quit, press 'q' below:");

    while (true) {

        if (in.hasNext("q") || in.hasNext("Q")) {
            break;
        }

        System.out.println("Please enter your temperature here or to quit, press 'q' below:");
        double temperature = in.nextDouble();

        temperatures.add(temperature);
    }

    System.out.println();

    double smallest = temperatures.get(0);
        for (int i = 1; i < temperatures.size(); i++) {
            if (temperatures.get(i) < smallest) {
                smallest = temperatures.get(i);
            }
        }

    Collections.sort(temperatures);

    System.out.println(temperatures.get(0) + " <= lowest");

    temperatures.remove(0);
    
    for (double element : temperatures) {

        System.out.println(element);
    }

    in.close();
        
    }
}

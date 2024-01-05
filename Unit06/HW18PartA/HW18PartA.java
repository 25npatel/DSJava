import java.util.Scanner;
import java.util.ArrayList;

public class HW18PartA {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    ArrayList<String> names = new ArrayList<String>(0);

    System.out.println("Please enter a name below:");

    while (true) {

        if (in.hasNext("#")) {
            break;
        }

        System.out.println("Please enter a name below:");
        String name = in.nextLine();

        names.add(name);
    }

    System.out.println("Here is your list, Mr. Eng: ");

    for (String element : names) {
        System.out.println();
        System.out.println(element);
        }

        System.out.println();

    }
}
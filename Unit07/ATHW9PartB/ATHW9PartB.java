import org.derryfield.math.Geometry;
import java.util.Scanner;

public class ATHW9PartB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please input a radius to get a sphere's volume and surface area below:");
        double r = in.nextDouble();

        System.out.println("Volume of sphere: " + Geometry.calcVolSphere(r));
        System.out.println("Surface Area of sphere: " + Geometry.calcSurfSphere(r));
        
    }
}
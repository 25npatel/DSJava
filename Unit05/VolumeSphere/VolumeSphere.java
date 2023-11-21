import java.util.Scanner;

public class VolumeSphere {
    public static double SphereVolume (double r) {
        double SphereVolume = ((4*Math.PI)/3)*(r*r*r);
        return SphereVolume;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to World of Spheres.com! Please enter your radius here: ");
        double r = in.nextDouble();

        System.out.printf("Here is the volume of your sphere: %.2f%n", SphereVolume(r));
    }
}
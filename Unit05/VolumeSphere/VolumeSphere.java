//Nabh Patel
//November 21, 2023

//Importing Scanner class to allow the user's input.
import java.util.Scanner;

public class VolumeSphere {

    //Method named Sphere Volume and the input is "r".
    public static double SphereVolume (double r) {

        //SphereVolume is basically the formula that finds the volume of a sphere with the inputed "r".
        double SphereVolume = ((4*Math.PI)/3)*(r*r*r);

        //Returned SphereVolume.
        return SphereVolume;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Asks the user for a radius of a sphere.
        System.out.print("Welcome to World of Spheres.com! Please enter your radius here: ");

        //Again, this is declared as double "r".
        double r = in.nextDouble();

        //The input of the user will be inserted into the volume of a sphere formula and it will print the volume of a sphere to the user.
        System.out.printf("Here is the volume of your sphere: %.2f%n", SphereVolume(r));
    }
}

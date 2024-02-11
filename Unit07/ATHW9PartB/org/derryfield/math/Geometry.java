package org.derryfield.math;

public class Geometry {

    public static double calcVolSphere(double r) {

        double volume = ((4 *(Math.PI) * (r * r * r))/3);

        return volume;
    }

    public static double calcSurfSphere(double r) {

        double surfaceArea = 4 * Math.PI * (r * r);

        return surfaceArea;
    }
}

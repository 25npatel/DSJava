package org.derryfield.math;

public class Geometry {

    public static double calcVolSphere(double r) {

        double volume = 4/3 * Math.PI * (r * r * r);

        return volume;
    }

    public static double calcSurfSphere(double r) {

        double surfaceArea = 4 * Math.PI * (r * r);

        return surfaceArea;
    }
}

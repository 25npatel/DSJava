//Nabh Patel
//20 December 2023

import java.util.Scanner;
import java.util.Arrays;

public class HW15C {

    public static int linearSearch (int[] array, int tgtVal) {

        int searchedValue = 10000;
        int pos = 0;
        boolean found = false;
        while (pos < array.length && !found) {
            if (array[pos] == searchedValue) {
                found = true;
            } else {
                pos++;
            }
        }
        if (found) {
            System.out.println("Found at position: " + pos);
        } else {
            System.out.println("Not found");
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to NUMERAL FINDER.com! Please enter a target value below: ");
        int tgtVal = in.nextInt();

        int[] array = new int[10000];

        Arrays.sort(array);

        Arrays.binarySearch(array, tgtVal);

        for (int i = 1; i < array.length; i++) {

            double r = (int) 10 * Math.random();

            array[i] = (int) r;

        }

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.binarySearch(array, tgtVal));

        System.out.println(System.currentTimeMillis());


        //When I had the array at 10 values, it takes 
        //1703132383703 milliseconds. 

        //When I had the array have 10,000 values, it takes
        //1703132300436 milliseconds.

        //When I increase the size of the array to 10,000,000 values, it takes
        //1703132183108 milliseconds.


    }
}

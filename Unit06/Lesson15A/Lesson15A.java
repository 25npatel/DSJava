//Nabh Patel
//20 December 2023

import java.util.Arrays;
import java.util.Scanner;

public class Lesson15A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter integer values or 'q' to quit below: ");
    
        int currentSize = 0;

        while (true) {
            if (in.hasNext("q") || in.hasNext("Q")) {
                System.out.println("Done entering input.");
                break;
            } else {
                if (currentSize < numbers.length) {
                numbers[currentSize] = in.nextInt();
                currentSize = currentSize + 1;
            } else {
                System.out.println("Array is full!");
                break;
                }
            }
        }

        for (int element : numbers) {
            System.out.print("*");
            System.out.print(element);
        }
        System.out.print("*");

        System.out.println();

        Arrays.sort(numbers);

        if (currentSize == 0) {
            System.out.print("");
        }
        if (currentSize == 1) {
            System.out.print(numbers[9]);
            System.out.print(",");
        }
        if (currentSize == 2) {
            System.out.print(numbers[9]);
            System.out.print(",");
            System.out.print(numbers[8]);
        }
        if (currentSize == 3) {
            System.out.print(numbers[9]);
            System.out.print(",");
            System.out.print(numbers[8]);
            System.out.print(",");
            System.out.print(numbers[7]);
        }
        if (currentSize == 4) {
            System.out.print(numbers[9]);
            System.out.print(",");
            System.out.print(numbers[8]);
            System.out.print(",");
            System.out.print(numbers[7]);
            System.out.print(",");
            System.out.print(numbers[6]);
        }
        if (currentSize == 5) {
            System.out.print(numbers[9]);
            System.out.print(",");
            System.out.print(numbers[8]);
            System.out.print(",");
            System.out.print(numbers[7]);
            System.out.print(",");
            System.out.print(numbers[6]);
            System.out.print(",");
            System.out.print(numbers[5]);
        }
        if (currentSize == 6) {
            System.out.print(numbers[9]);
            System.out.print(",");
            System.out.print(numbers[8]);
            System.out.print(",");
            System.out.print(numbers[7]);
            System.out.print(",");
            System.out.print(numbers[6]);
            System.out.print(",");
            System.out.print(numbers[5]);
            System.out.print(",");
            System.out.print(numbers[4]);
        }
        if (currentSize == 7) {
            System.out.print(numbers[9]);
            System.out.print(",");
            System.out.print(numbers[8]);
            System.out.print(",");
            System.out.print(numbers[7]);
            System.out.print(",");
            System.out.print(numbers[6]);
            System.out.print(",");
            System.out.print(numbers[5]);
            System.out.print(",");
            System.out.print(numbers[4]);
            System.out.print(",");
            System.out.print(numbers[3]);
        }
        if (currentSize == 8) {
            System.out.print(numbers[9]);
            System.out.print(",");
            System.out.print(numbers[8]);
            System.out.print(",");
            System.out.print(numbers[7]);
            System.out.print(",");
            System.out.print(numbers[6]);
            System.out.print(",");
            System.out.print(numbers[5]);
            System.out.print(",");
            System.out.print(numbers[4]);
            System.out.print(",");
            System.out.print(numbers[3]);
            System.out.print(",");
            System.out.print(numbers[2]);
        }
        if (currentSize == 9) {
            System.out.print(numbers[9]);
            System.out.print(",");
            System.out.print(numbers[8]);
            System.out.print(",");
            System.out.print(numbers[7]);
            System.out.print(",");
            System.out.print(numbers[6]);
            System.out.print(",");
            System.out.print(numbers[5]);
            System.out.print(",");
            System.out.print(numbers[4]);
            System.out.print(",");
            System.out.print(numbers[3]);
            System.out.print(",");
            System.out.print(numbers[2]);
            System.out.print(",");
            System.out.print(numbers[1]);
        }
        if (currentSize == 10) {
            System.out.print(numbers[9]);
            System.out.print(",");
            System.out.print(numbers[8]);
            System.out.print(",");
            System.out.print(numbers[7]);
            System.out.print(",");
            System.out.print(numbers[6]);
            System.out.print(",");
            System.out.print(numbers[5]);
            System.out.print(",");
            System.out.print(numbers[4]);
            System.out.print(",");
            System.out.print(numbers[3]);
            System.out.print(",");
            System.out.print(numbers[2]);
            System.out.print(",");
            System.out.print(numbers[1]);
            System.out.print(",");
            System.out.print(numbers[0]);
        }
    }
}

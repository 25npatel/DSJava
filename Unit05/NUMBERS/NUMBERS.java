//Nabh Patel
//December 10, 2023

public class NUMBERS {
    public static void main(String[] args) {

        int[] a = { 0, 1, 2, 3, 4 };
        int[] b = { 0, 1, 4, 9 };
        a = b;
        b = a;

        for (int element : b) {
            System.out.println(element);
        }
    }
}
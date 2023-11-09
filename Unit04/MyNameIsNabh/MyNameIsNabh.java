public class MyNameIsNabh {
    public static void main(String[] args) {
        int totalAmount = 0;

        System.out.println("The last number is the sum of all the even numbers: ");

        for (int i = 2; i <= 100; i = i + 2) {

            totalAmount = totalAmount + i;

            System.out.println(totalAmount);
        }
    }
}

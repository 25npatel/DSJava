public class Random {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            double r = Math.random();
            
            System.out.println((int) (r * 10));
        }
    }
}
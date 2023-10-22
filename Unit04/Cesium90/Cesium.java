public class Cesium {
    public static void main(String[] args) {

        int totalYears;

        double n = 100.0;

        while (n >= 0.01) {
            n = n / 2.0;
            totalYears = (14*30);
            if (n == 0.006103515625) {
            System.out.println("It takes " + totalYears + " years and it leaves us " + n + "% left of Cesium-90!");
            }
        }
    }
}
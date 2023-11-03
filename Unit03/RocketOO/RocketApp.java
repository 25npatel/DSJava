class Rocket {
    final int MAX_POWER = 10;
    int power = 1;
    double speed = 0.0;

    public int getPower() {
        return power; 
    }
    public double getSpeed() {
        return speed;
    }
    public void shiftUp() {
        if (power < MAX_POWER) {
            power = power + 1;
        }
    }
    public void shiftDown() {
        if (power > 1) {
            power = power - 1;
        }
    }
    public void MoreFUEL() {
        speed = speed + power * 1;
    }
    public void LessFUEL() {
        if (speed > 1.0) {
            speed = speed - 1;
        }
    }
}
public class RocketApp {
    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        System.out.printf("power = %d, speed = %.2f%n", rocket.getPower(), rocket.getSpeed());
        for(int i = 0; i < 3; i++) {
            System.out.println("MoreFUEL and shifting");
            rocket.MoreFUEL();
            System.out.printf("power = %d, speed = %.2f%n", rocket.getPower(), rocket.getSpeed());
            rocket.shiftUp();
        }
    }
}
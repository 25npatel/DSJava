interface RocketInter {
    public int getPower();
    public double getSpeed();

    public void shiftUp();
    public void shiftDown();

    public void MoreFUEL();
    public void LessFUEL();
}

class FixedPowerRocket implements RocketInter {
    int power = 1;
    double speed = 0.0;

    public int getPower() {
        return power;
    }

    public double getSpeed() {
        return speed;
    }

    public void shiftUp() {
    }

    public void shiftDown() {
    }

    public void MoreFUEL() {
        speed = speed + 1;
    }

    public void LessFUEL() {
        if (speed > 1.0) {
            speed = speed - 1;
        }
    }
}

public class RocketInterApp {
    public static void main(String[] args) {
        RocketInterApp Rocket = new RocketInterApp();

        System.out.printf("power = %d, speed = %.2f%n", ((RocketInter) Rocket).getPower(), ((RocketInter) Rocket).getSpeed());

        for (int i = 0; i < 3; i++) {
            System.out.println("MoreFUEL and shifting");
            ((RocketInter) Rocket).MoreFUEL();

            System.out.printf("power = %d, speed = %.2f%n", ((RocketInter) Rocket).getPower(), ((RocketInter) Rocket).getSpeed());
            ((RocketInter) Rocket).shiftUp();
        }
    }
}


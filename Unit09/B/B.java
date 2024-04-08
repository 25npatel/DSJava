public class B {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();

        System.out.println("Regular Bicycle (without gears)...");

        System.out.println();

        System.out.println("Initial Speed before pedaling: " + b.getSpeed() + "MPH.");

        b.pedal();

        b.pedal();

        System.out.println();

        System.out.println("New Speed after pedaling: " + b.getSpeed() + "MPH.");

        b.brake();

        System.out.println();

        System.out.println("New Speed after braking: " + b.getSpeed() + "MPH.");

        System.out.println();

        System.out.println("Regular Bicycle (with gears)...");

        System.out.println();

        GearedBicycle gb = new GearedBicycle();

        gb.shiftUp();

        gb.pedal();

        gb.pedal();

        System.out.println("Current Speed after using gears: " + gb.getSpeed() + "MPH.");

        System.out.println();

        gb.display();

    }
}

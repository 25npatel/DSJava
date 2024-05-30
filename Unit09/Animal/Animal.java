import java.util.ArrayList;
import java.util.Collections;

public class Animal implements Measurable, Comparable<Animal> {

    private String name;
    private double weight;

    public Animal(String name, double weight) {

        this.name = name;
        this.weight = weight;
    }

    //Getters and Setters.
    public String getName() {

        return name;
    }

    public double getWeight() {

        return weight;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    @Override
    public String toString() {

        //According to Stack Overflow, String.format is just like printf, but only String.format can be returned.
        return String.format("%s [name = %s,  weight (lbs) = %.2f]", this.getClass().getSimpleName(), name, weight);
    }

    @Override
    public double getMeasure() {

        return this.weight;
    }

    @Override
    public int compareTo(Animal other) {

        return Double.compare(this.weight, other.weight);
    }
    public static void main(String[] args) {

        System.out.println();

        //Create two Animal objects

        Animal elephant = new Animal("Elephant", 1200.5);
        Animal tiger = new Animal("Tiger", 400.3);

        //Compare the weights of the Tiger and the Elephant.
        if (elephant.compareTo(tiger) > 0) {

            System.out.println(elephant.getName() + " is heavier than " + tiger.getName());

        } else if (elephant.compareTo(tiger) < 0) {

            System.out.println(elephant.getName() + " is lighter than " + tiger.getName());

        } else {

            System.out.println(elephant.getName() + " and " + tiger.getName() + " have the same weight");

        }

        System.out.println();

        //Create a list of Animal objects
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(elephant);
        animals.add(tiger);
        //animals.add(new Animal("Kangaroo", 200.0));

        //Calculate the average weight using the Measurable interface's static method
        double avgWeight = Measurable.calcAvg(new ArrayList<Measurable>(animals));
        System.out.println("Average weight: " + avgWeight);

        System.out.println();

        //Sort the animals by weight using Comparable
        Collections.sort(animals);
        System.out.println("Animals sorted by weight: " + animals);

        System.out.println();
    }
}

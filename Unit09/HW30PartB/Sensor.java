//Public Abstract class called Sensor.

public abstract class Sensor {

    //Private member variables.
    private String name;
    private int modelNumber;

    //Public method that gets/returns the name.
    public String getName() {

        return name;
    }

    //Public method that sets the name.
    public void setName(String name) {

        this.name = name;
    }

    //Public method that gets/returns the modelNumber.
    public int getModelNumber() {

        return modelNumber;
    }

    //Public method that sets the modelNumber.
    public void setModelNumber(int modelNumber) {

        this.modelNumber = modelNumber;
    }

    //Abstract method called recordMeasurement that does not return anything.
    public abstract void recordMeasurement();
}

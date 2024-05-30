import java.util.ArrayList;

public interface Measurable {

    //Abstract method
    double getMeasure();

    //Static method to calculate average
    public static double calcAvg(ArrayList<Measurable> list) {

        if (list.size() == 0) {

            return 0;

        }

        double sum = 0;

        for (Measurable item : list) {

            sum += item.getMeasure();

        }

        return sum / list.size();
    }
}

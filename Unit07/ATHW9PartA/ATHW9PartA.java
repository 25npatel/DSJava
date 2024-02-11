import java.time.LocalDate;
import java.time.LocalTime;

public class ATHW9PartA {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println("Today's date is " + localDate);

        LocalTime localTime = LocalTime.now();

        System.out.println("The time is " + localTime);
    }
}
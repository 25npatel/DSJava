//Nabh Patel
//28 October 2023

//importing local date of this area.
import java.time.LocalDate;
import java.time.MonthDay;
//importing local day of the week in this area.
import java.time.DayOfWeek;

public class Calender {

public static void main(String[] args) {

        //All the classes and their instances that will be used in this program.
        LocalDate rightNow = LocalDate.now();
        int today = rightNow.getDayOfMonth();
        LocalDate date = rightNow.minusDays(today - 1);

        //This is another one that will use the next month's calender format.
        LocalDate endDate = date.plusMonths(1);
        LocalDate startDate = date.minusMonths(1);

    //Prints the days on top of the calender.
    System.out.println(" MON  TUE  WED  THU  FRI  SAT  SUN ");

    //Prints a whole line just for spacing.
    System.out.println("");

    //While the date is before the 30th of November, get the day of the week and add one day to it and keep on doing it. 
    while (date.isBefore(endDate)) { 
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        date = date.plusDays(1);
    }

    //Substract a day.
    date = rightNow.minusDays(today - 1);

    //While the date is before the end date, get the day of the week and if the day is equal to right now, print an * , else, print a space or " ". 

    while (date.isBefore(endDate)) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfMonth = date.getDayOfMonth();

        System.out.printf("%4d", dayOfMonth);

        if (date.equals(rightNow)) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

        if (startDate.equals("1 ")) {
            System.out.print("  ");
        }


        //if the day of the week is sunday make a whole new line for the next week.
        if (dayOfWeek == DayOfWeek.SUNDAY) {
        
        System.out.println();
        System.out.println();
        }
        date = date.plusDays(1);
        }
    }
}





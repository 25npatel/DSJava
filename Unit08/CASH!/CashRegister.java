//Nabh Patel
//March 6th, 2024

//Importing ArrayList to store sales and transactions.
import java.util.ArrayList;
import java.util.Scanner;

//Class called cashRegister.
class CashRegister {

    //Declared a new ArrayList called "items"
    private ArrayList<Double> items = new ArrayList<>();

    //total sales.
    private double totalPrice;

    //total items.
    private int itemCount;

    //Set the variables to zero.
    public CashRegister() {

        totalPrice = 0;

        itemCount = 0;
    }

    //Adding items from the user.
    public void addItem(double price) {

        totalPrice += price;

        items.add(price);

        itemCount++;
    }

    //Removing an item.
    public void removeItem() {

        if (itemCount > 0) {

            double removedItem = items.remove(itemCount - 1);

            totalPrice -= removedItem;

            itemCount--;
        } else {

            System.out.println("No items to remove.");
        }
    }

    //Getting the total.
    public double getTotal() {

        return totalPrice;
    }

    //Getting the count.
    public int getCount() {

        return itemCount;
    }

    //Reseting all the sales and counts.
    public void clear() {

        totalPrice = 0;

        itemCount = 0;

        System.out.println("Total Sales: $" + getTotal());

        System.out.println("Total Count: " + getCount());

        items.clear();

        System.out.println("Cleared. No sales and transactions.");
    }
}

public class CashRegisterExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CashRegister cr = new CashRegister();

        System.out.println("Enter 't' to display the sales total and item count.");

        System.out.println("Enter 'd' to delete the most recent sale.");

        System.out.println("Enter 'c' to clear the current sales total and item count.");

        System.out.println("Enter 'q' to quit.");

        while (true) {

            System.out.println("Please add the cost of your item or enter 'q' to quit:");

            if (in.hasNextDouble()) {

                double price = in.nextDouble();

                cr.addItem(price);
            } else {

                String command = in.next();

                if (command.equals("t")) {

                    System.out.println("Total Sales: $" + cr.getTotal());

                    System.out.println("Total Count: " + cr.getCount());

                } else if (command.equals("d")) {

                    cr.removeItem();
                } else if (command.equals("c")) {

                    cr.clear();
                } else if (command.equals("q")) {

                    System.out.println("Good Night!");

                    break;
                }
            }
        }

        in.close();
    }
}

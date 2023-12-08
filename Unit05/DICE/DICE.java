//Nabh Patel
//November 1, 2023.

class Die {

    //member variables.
    static int value;

    int newValue;

    //Constructors.
    public Die() {
        //Initializing Die value to 1. 
        value = 1;
    }

    public Die (int newValue) {
        value = newValue;
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int newValue) {
        if (newValue > 0 && newValue < 7) {
            value = newValue;     
        } else {
            System.out.println("ERROR: Value must be set between 1 to 6!");
        }
    }

    public void roll() {
        double x = 6 * Math.random();
        value = (int) x + 1;
    }

    public void display() {
        if (value == 1) {
            System.out.println("+-------+");
            System.out.println("|       |");
            System.out.println("|   0   |");
            System.out.println("|       |");
            System.out.println("+-------+");
            }
        else if (value == 2) {
            System.out.println("+-------+");
            System.out.println("|     0 |");
            System.out.println("|       |");
            System.out.println("| 0     |");
            System.out.println("+-------+");  
            }
        else if (value == 3) {
            System.out.println("+-------+");
            System.out.println("|     0 |");
            System.out.println("|   0   |");
            System.out.println("| 0     |");
            System.out.println("+-------+");
            }
        else if (value == 4) {
            System.out.println("+-------+");
            System.out.println("| 0   0 |");
            System.out.println("|       |");
            System.out.println("| 0   0 |");
            System.out.println("+-------+");
            }
        else if (value == 5) {
            System.out.println("+-------+");
            System.out.println("| 0   0 |");
            System.out.println("|   0   |");
            System.out.println("| 0   0 |");
            System.out.println("+-------+");
            }
        else if (value == 6) {
            System.out.println("+-------+");
            System.out.println("| 0   0 |");
            System.out.println("| 0   0 |");
            System.out.println("| 0   0 |");
            System.out.println("+-------+");
            }
}

public class DICE {
    
    public static void main(String[] args) {

        //create a new die object.
        Die die = new Die();
        
    for (int i = 0; i < 3; i++) {
        die.roll();
        if (value == 1) {
            System.out.println("Dice value is 1");
        }
        if (value == 2) {
            System.out.println("Dice value is 2");
        }
        if (value == 3) {
            System.out.println("Dice value is 3");
        }
        if (value == 4) {
            System.out.println("Dice value is 4");
        }
        if (value == 5) {
            System.out.println("Dice value is 5");
        }
        if (value == 6) {
            System.out.println("Dice value is 6");
        }
        die.display();
            }
        }
    }
}

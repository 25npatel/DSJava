//Nabh Patel
//November 1, 2023.

class Die {

    int value = 1;
    
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
            Die die = new Die();
            die.roll();
            die.display();

            die.roll();
            die.display();

            die.roll();
            die.display();
        }
    }
}
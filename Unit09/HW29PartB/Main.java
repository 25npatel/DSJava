//Nabh Patel
//April 8th, 2024

public class Main {
    public static void main(String[] args) {

        //Adding a blank line for readability.
        System.out.println();

        //Creating a new Employee called "employee".
        Employee employee = new Employee("John Doe", 50000, 2000);

        //Printing the Employee's name.
        System.out.println("Employee: " + employee.getName());

        //Printing the Employee's annual income (without the bonus).
        System.out.println("Annual Income: $" + employee.getAnnualIncome());

        //Adding a blank line for readability.
        System.out.println(); 

        //Creating a new Manager called "manager".
        Manager manager = new Manager("Jane Smith", 50000, 2000);

        //Printing the Manager's name.
        System.out.println("Manager: " + manager.getName());

        //Printing the Manger's annual income (with the bonus).
        System.out.println("Annual Income: $" + manager.getAnnualIncome());
    }
}

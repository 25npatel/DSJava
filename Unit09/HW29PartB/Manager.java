//Manager Class.

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {

        super(name, salary, bonus);
        this.bonus = bonus;
    }

    //Getting the Bonus.
    public double getBonus() {

        return bonus;
    }

    //Setting the Bonus.
    public void setBonus(double newBonus) {

        bonus = newBonus;
    }

    @Override
    public double getAnnualIncome() {

        //Managers get both salary and bonus as annual income.
        return super.getSalary() + bonus;
    }
}


    



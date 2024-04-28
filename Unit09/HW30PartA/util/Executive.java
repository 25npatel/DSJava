//Executive Class.

package util;

public class Executive extends Manager {

    //Shares.
    private double shares;

    //Executive benifits.
    public Executive(String name, double salary, double bonus, double shares) {

        //Same thing of what a manager has.
        super(name, salary, bonus);

        //The only new thing are shares that the executive owns.
        this.shares = shares;
    }

    
    public double getShares() {

        return shares;
    }

    public void setShares(double shares) {

        this.shares = shares;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();
        System.out.printf("  Shares = %.2f%n", shares);
    }
}


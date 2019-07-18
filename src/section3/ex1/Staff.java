package section3.ex1;

public class Staff extends Employee implements IEmployee {

    private double basicSalary;
    private double payRate;

    public Staff(boolean gender, double basicSalary, double payRate) {
        super(gender);
        this.basicSalary = basicSalary;
        this.payRate = payRate;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public void calculateSalary() {
        double salary = this.basicSalary * this.payRate;
        this.setSalary(salary);
    }
}

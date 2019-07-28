package oop.section3.ex1;

public class Leader extends Employee implements IEmployee {

    private double basicSalary;
    private double benifit;
    private double payRate;

    public Leader(boolean gender, double basicSalary, double payRate, double benifit) {
        super(gender);
        this.basicSalary = basicSalary;
        this.benifit = benifit;
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

    public double getBenifit() {
        return benifit;
    }

    public void setBenifit(double benifit) {
        this.benifit = benifit;
    }

    @Override
    public void calculateSalary() {
        double salary = this.basicSalary * this.payRate + this.benifit;
        this.setSalary(salary);
    }
}

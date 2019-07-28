package oop.section3.ex1;

public class Manager extends Employee implements IEmployee {

    private double revenue;

    public Manager(boolean gender, double revenue){
        super(gender);
        this.revenue = revenue;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public void calculateSalary() {
        double salary = this.revenue * 10 / 100 + this.getGenderBonus();
        this.setSalary(salary);
    }
}

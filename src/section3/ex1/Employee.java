package section3.ex1;

public abstract class Employee
{
    private boolean gender;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(boolean gender) {
        this.gender = gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean getGender() {
        return this.gender;
    }

    public double getGenderBonus() {
        if(this.gender == true) {
            return 50;
        }
        return 0;
    }
}

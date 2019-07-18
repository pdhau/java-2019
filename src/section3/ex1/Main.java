package section3.ex1;
public class Main {

    public static void main(String[] args) {
        IEmployee manager = new Manager(false, 1000000);
        manager.calculateSalary();
        IEmployee leader = new Leader(false, 100, 20, 2000);
        leader.calculateSalary();
        IEmployee staff = new Staff(false, 100, 20);
        staff.calculateSalary();
        System.out.println("Manager: "+manager.getSalary());
        System.out.println("Manager: "+leader.getSalary());
        System.out.println("Manager: "+staff.getSalary());
    }
}

package workshop3;

import java.util.ArrayList;

/**
 *
 * @author giasutinhoc.vn
 */
public class PersonModel<T> {

    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T o : al) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student> studentList = new PersonModel<>();
        Student st1 = new Student(1, "pdhau", 2);
        Student st2 = new Student(2, "ntathu", 1);
        studentList.add(st1);
        studentList.add(st2);
        studentList.display();

        PersonModel<Employee> employeeList = new PersonModel<>();
        Employee em1 = new Employee(1, "pdhau", 2000);
        Employee em2 = new Employee(2, "ntathu", 1000);
        employeeList.add(em1);
        employeeList.add(em2);
        employeeList.display();

        PersonModel<String> stringList = new PersonModel<>();
        stringList.add("pdhau");
        stringList.add("ntathu");
        stringList.display();
    }
}

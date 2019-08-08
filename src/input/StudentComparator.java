package input;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.gpa() > s2.gpa()) {
            return 1;
        }
        if(s1.gpa() == s2.gpa()) {
            return 0;
        }
        return -1;
    }
}

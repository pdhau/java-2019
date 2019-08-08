package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {

    private final String COMMA = ",";
    public static String collect;
    private int id;
    private String name;
    private float point1;
    private float point2;
    private float point3;
    private String status;

    private Scanner in;

    public Student() {
        this.in = new Scanner(System.in);
    }

    public Student(int id, String name, float point1, float point2, float point3, String status) {
        this.id = id;
        this.name = name;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.status = status;
        this.in = new Scanner(System.in);
    }

    public void setId(int id) {
        while (isExistId(id)) {
            System.out.print("Id is exist, pls input other id: ");
            id = Integer.parseInt(in.nextLine());
        }
        this.id = id;
        in.close();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint1(float point1) {
        while (validatePoint(point1)) {
            System.out.print("Pls, input point1 again: ");
            point1 = Integer.parseInt(in.nextLine());
        }
        this.point1 = point1;
        in.close();
    }

    public void setPoint2(float point2) {
        while (validatePoint(point2)) {
            System.out.print("Pls, input point2 again: ");
            point2 = Integer.parseInt(in.nextLine());
        }
        this.point2 = point2;
        in.close();
    }

    public void setPoint3(float point3) {
        while (validatePoint(point3)) {
            System.out.print("Pls, input point3 again: ");
            point3 = Integer.parseInt(in.nextLine());
        }
        this.point3 = point3;
        in.close();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return String.format("%d"+COMMA+"%s"+COMMA+"%.2f"+COMMA+"%.2f"+COMMA+"%.2f"+COMMA+"%s\n", id, name, point1, point2, point3, status);
    }

    private boolean validatePoint(float point) {
        return point < 0 || point > 10;
    }

    private boolean isExistId(int id) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("./file.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] studentData = line.split(",", 6);
                if(id == Integer.parseInt(studentData[0])) {
                    reader.close();
                    return true;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public float gpa() {
        return (point1 + point2 + point3)/3;
    }

    public void setStatus() {
        if (5 <= gpa()) {
            this.status = "PASS";
        } else {
            this.status = "FAILED";
        }
    }

    public static void displayStudentList() {
        BufferedReader reader;
        List<Student> students = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader("./file.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] studentData = line.split(",", 6);
                Student student = new Student(Integer.parseInt(studentData[0]), studentData[1], Float.parseFloat(studentData[2]), Float.parseFloat(studentData[3]), Float.parseFloat(studentData[4]), studentData[5]);
                students.add(student);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(students, new StudentComparator());
        students.forEach(student -> System.out.println(student));
    }

    public static void getBestGpaStudent() {
        BufferedReader reader;
        List<Student> students = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader("./file.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] studentData = line.split(",", 6);
                Student student = new Student(Integer.parseInt(studentData[0]), studentData[1], Float.parseFloat(studentData[2]), Float.parseFloat(studentData[3]), Float.parseFloat(studentData[4]), studentData[5]);
                students.add(student);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(students, new StudentComparator());
        System.out.println(students.get(students.size() - 1));
    }
}

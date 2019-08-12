package input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in;
        String option;
        boolean isQuit = false;
        int id;
        String name;
        float point1, point2, point3;
        String status;
        while (!isQuit) {
            System.out.println("1. Create Student class");
            System.out.println("2. Create student object and output to console");
            System.out.println("3. Input student from console and write to file");
            System.out.println("4. Implement function to validate ID and point");
            System.out.println("5. Implement function to calculate the GPA of Score1, Score2 and Score3");
            System.out.println("6. Implement function to update status");
            System.out.println("7. Print student list");
            System.out.println("8. Print best GPA student");
            System.out.println("0. Quit");
            System.out.print("What do you want? ");
            in = new Scanner(System.in);
            option = in.nextLine();
            switch (option) {
                case "0":
                    System.out.println("Program is closing...");
                    isQuit = true;
                    break;
                case "1":
                    System.out.println("Please, check Student class");
                    break;

                case "2":
                    System.out.print("Input id: ");
                    id = Integer.parseInt(in.nextLine());
                    System.out.print("Input name: ");
                    name = in.nextLine();
                    System.out.print("Input point1: ");
                    point1 = Float.parseFloat(in.nextLine());
                    System.out.print("Input point2: ");
                    point2 = Float.parseFloat(in.nextLine());
                    System.out.print("Input point3: ");
                    point3 = Float.parseFloat(in.nextLine());
                    System.out.print("Input status: ");
                    status = in.nextLine();
                    Student st = new Student(id, name, point1, point2, point3, status);
                    System.out.println(st);
                    break;

                case "3":
                    System.out.print("Input id: ");
                    id = Integer.parseInt(in.nextLine());
                    System.out.print("Input name: ");
                    name = in.nextLine();
                    System.out.print("Input point1: ");
                    point1 = Float.parseFloat(in.nextLine());
                    System.out.print("Input point2: ");
                    point2 = Float.parseFloat(in.nextLine());
                    System.out.print("Input point3: ");
                    point3 = Float.parseFloat(in.nextLine());
                    System.out.print("Input status: ");
                    status = in.nextLine();
                    st = new Student(id, name, point1, point2, point3, status);
                    st.save("./file.txt");
                    break;

                case "4":
                    st = new Student();
                    System.out.print("Input id: ");
                    id = Integer.parseInt(in.nextLine());
                    st.setId(id);
                    System.out.print("Input name: ");
                    name = in.nextLine();
                    st.setName(name);
                    System.out.print("Input point1: ");
                    point1 = Float.parseFloat(in.nextLine());
                    st.setPoint1(point1);
                    System.out.print("Input point2: ");
                    point2 = Float.parseFloat(in.nextLine());
                    st.setPoint2(point2);
                    System.out.print("Input point3: ");
                    point3 = Float.parseFloat(in.nextLine());
                    st.setPoint3(point3);
                    System.out.print("Input status: ");
                    status = in.nextLine();
                    st.setStatus(status);
                    break;

                case "5":
                    st = new Student();
                    System.out.print("Input id: ");
                    id = Integer.parseInt(in.nextLine());
                    st.setId(id);
                    System.out.print("Input name: ");
                    name = in.nextLine();
                    st.setName(name);
                    System.out.print("Input point1: ");
                    point1 = Float.parseFloat(in.nextLine());
                    st.setPoint1(point1);
                    System.out.print("Input point2: ");
                    point2 = Float.parseFloat(in.nextLine());
                    st.setPoint2(point2);
                    System.out.print("Input point3: ");
                    point3 = Float.parseFloat(in.nextLine());
                    st.setPoint3(point3);
                    System.out.print("Input status: ");
                    status = in.nextLine();
                    st.setStatus(status);
                    System.out.println("GPA is: "+st.gpa());
                    break;

                case "6":
                    st = new Student();
                    System.out.print("Input id: ");
                    id = Integer.parseInt(in.nextLine());
                    st.setId(id);
                    System.out.print("Input name: ");
                    name = in.nextLine();
                    st.setName(name);
                    System.out.print("Input point1: ");
                    point1 = Float.parseFloat(in.nextLine());
                    st.setPoint1(point1);
                    System.out.print("Input point2: ");
                    point2 = Float.parseFloat(in.nextLine());
                    st.setPoint2(point2);
                    System.out.print("Input point3: ");
                    point3 = Float.parseFloat(in.nextLine());
                    st.setPoint3(point3);
                    System.out.print("Input status: ");
                    status = in.nextLine();
                    st.setStatus(status);
                    st.updateStatus();
                    System.out.println("Current status is: "+ st.getStatus());
                    break;

                case "7":
                    Student.displayStudentList();
                    break;

                case "8":
                    Student.getBestGpaStudent();
                    break;

                default:
                    System.out.println("Your option do NOT support!");
                    break;
            }
        }
    }
}

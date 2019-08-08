package input;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student st = new Student();
        Scanner in = new Scanner(System.in);
        System.out.print("Input id: ");
        int id = Integer.parseInt(in.nextLine());
        st.setId(id);
        System.out.print("Input name: ");
        String name = in.nextLine();
        st.setName(name);
        System.out.print("Input point1: ");
        float point1 = Float.parseFloat(in.nextLine());
        st.setPoint1(point1);
        System.out.print("Input point2: ");
        float point2 = Float.parseFloat(in.nextLine());
        st.setPoint1(point2);
        System.out.print("Input point3: ");
        float point3 = Float.parseFloat(in.nextLine());
        st.setPoint1(point3);
        st.setStatus();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./file.txt", true));
            writer.append(st.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        in.close();
    }
}

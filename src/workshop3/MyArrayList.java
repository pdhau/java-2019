package workshop3;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    private List myList;

    public MyArrayList() {
        myList = new ArrayList<>();
    }

    public boolean add(Object item) {
        return myList.add(item);
    }

    public void print() {
        myList.forEach(item -> System.out.println(item));
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(1F);
        myArrayList.add(true);
        myArrayList.add("one");
        myArrayList.print();
    }
}

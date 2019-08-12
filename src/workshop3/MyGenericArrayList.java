package workshop3;

import java.util.ArrayList;
import java.util.List;

public class MyGenericArrayList {

    private List<Integer> myList;

    public MyGenericArrayList() {
        myList = new ArrayList<>();
    }

    public boolean add(int item) {
        return myList.add(item);
    }

    public void print() {
        myList.forEach(item -> System.out.println(item));
    }

    public static void main(String[] args) {
        MyGenericArrayList myGenericArrayList = new MyGenericArrayList();
        for (int i = 0; i < 10; i++) {
            myGenericArrayList.add(i);
        }
        myGenericArrayList.print();
    }
}

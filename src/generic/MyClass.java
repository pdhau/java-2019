package generic;

import java.util.ArrayList;
import java.util.List;

public class MyClass<T> {

    private List<T> myList;
    private T item;

    public MyClass(T item) {
        myList = new ArrayList<>();
        // this.item = new T();
        this.item = item;
    }

    public void add(T item) {
        myList.add(item);
    }

    public void show() {
        myList.forEach((item) -> {
            System.out.println(item);
        });
    }

    // @Override
    // public String toString() {
    //     return ((com.sun.javadoc.ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0].toString();
    // }

    public static <T> void print(T item) {
        System.out.println(item);
    }
}

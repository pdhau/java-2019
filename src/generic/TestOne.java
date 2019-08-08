package generic;

import java.util.List;

public class TestOne {

    public TestOne(List<? extends IShape> list) {
        list.get(0).doSomething();
    }
}

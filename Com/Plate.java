package Model.Com;

import java.util.ArrayList;
import java.util.List;

public class Plate {
    private List<MyElement> list = new ArrayList<>();

    public void eat() {
        for (MyElement element : list) {
            element.eat();
        }
    }

    public void add(MyElement element) {
        list.add(element);
    }

    public void remove(MyElement element) {
        list.remove(element);
    }
}

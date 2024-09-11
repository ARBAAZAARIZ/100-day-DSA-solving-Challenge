package waste;

import java.util.ArrayList;
import java.util.List;

public class Waste1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add(0, "B");
        System.out.println(list);
    }
}

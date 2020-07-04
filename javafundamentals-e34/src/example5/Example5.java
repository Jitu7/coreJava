package example5;

import java.util.ArrayList;
import java.util.List;

public class Example5 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(34);
        list.add(1);
        list.add(20);
        list.add(20);

        for (Integer x : list) {
            System.out.println(x);
//            list.add(30); // java.util.ConcurrentModificationException
        }

    }

}

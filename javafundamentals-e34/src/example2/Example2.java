package example2;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println(list.size()); // 0

        list.add(10); // 0
        list.add(20); // 1

        System.out.println(list.size()); // 2

        list.add(30); // 2
        list.add(1); // 3

        System.out.println(list.size()); // 4

        list.add(20); // 4
        list.add(20); // 5

        System.out.println(list); // [10, 20, 30, 1, 20, 20]

    }

}

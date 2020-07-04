package example6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example6 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(34);
        list.add(1);
        list.add(20);
        list.add(20);

        // old way
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer x = iterator.next(); // moves the iterator to the next value
            System.out.println(x);
        }

    }

}

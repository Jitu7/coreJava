package example5;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example5 {

    /*
    Less faster than HashSet in terms of finding elements
     */
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>(); // ordered
        set1.add(10);
        set1.add(1000);
        set1.add(23);
        set1.add(1000);
        set1.add(300);
        set1.add(256);

        set1.forEach(System.out::println);
    }

}

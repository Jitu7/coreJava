package example4;

import java.util.HashSet;
import java.util.Set;

public class Example4 {

    public static void main(String[] args) {
        /*
        If two elements have same hashCode not necessarily equal
        but if two elements are equal they always have the same hashcode

        HashSet uses the hashcode() n equals() to find whether the element exists or not
        its the fastest collection wrt find o/p
         */
        Set<Integer> set1 = new HashSet<>(); // will not get exception if duplicates added
        set1.add(10); // 10, 1000, 23, 300, 256
        set1.add(1000);
        set1.add(23);
        set1.add(1000);
        set1.add(300);
        set1.add(256);

        set1.forEach(System.out::println);

    }

}

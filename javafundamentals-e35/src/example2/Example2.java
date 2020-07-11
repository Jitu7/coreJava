package example2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {

    public static void main(String[] args) {

        Set<Integer> set1 =  Set.of(10, 20, 50); // SE 9
        Set<Integer> set2 = new HashSet<>(); // most used, not ordered and not sorted
        Set<Integer> set3 = new LinkedHashSet<>(); // ordered
        Set<Integer> set4 = new TreeSet<>(); // most used, sorted

        /* List(I)             vs          Set(I) / SortedSet(I) / NavigableSet(I)
        ---------------------------------------------------------------------------
        ordered                                 not (always) ordered
        indexed                                 not indexed
        do allow duplicates                     doesn't allow duplicate
         */
    }

}

package example7;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
Liskov principle:
it says not to use something more than the contract offers you
 */
public class Example8 {

    public static void main(String[] args) {
        Set<Integer> set = getSomeSet();
        // here you can consider that they are always sorted
    }

    /*
    assume this is in the other class
     */
    private static SortedSet<Integer> getSomeSet() {
        return new TreeSet<>(); // sorted
    }

}

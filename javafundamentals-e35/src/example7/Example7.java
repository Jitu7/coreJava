package example7;

import java.util.Set;
import java.util.TreeSet;

/*
Liskov principle:
it says not to use something more than the contract offers you

Never do like this, it violates LISKOV principle
 */
public class Example7 {

    public static void main(String[] args) {
        Set<Integer> set = getSomeSet();
        // here you can not consider that they are always sorted
        // someone may change the code instead of TreeSet, for ex: they may provide HashSet
    }

    /*
    assume this is in the other class
     */
    private static Set<Integer> getSomeSet() {
        return new TreeSet<>(); // sorted
    }

}

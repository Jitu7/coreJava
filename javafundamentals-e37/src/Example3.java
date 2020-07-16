import java.util.*;

public class Example3 {

    public static void main(String[] args) {
        // Map -> collection of associations(pairs)
        // (key, value)

        Map<Integer, String> m1 = new HashMap<>(); // (k,v) doesn't guarantee an order
        Map<Integer, String> m2 = new LinkedHashMap<>(); // (k,v) keeps the element in the order in which you've added
        Map<Integer, String> m3 = new TreeMap<>(); // (k,v) are sorted by their keys

        Set<Integer> s1 = new HashSet<>(); // doesn't guarantee an order
        Set<Integer> s2 = new LinkedHashSet<>(); // keeps the element in the order in which you've added
        Set<Integer> s3 = new TreeSet<>(); // sorts the elements by a given rule (Comparable / Comparator)
    }

}

import java.util.Collections;
import java.util.TreeMap;

public class Example5 {

    public static void main(String[] args) {
        TreeMap<Integer, String> m1 = new TreeMap<>(
                Collections.reverseOrder()); // reverse of natural order

        // keys are unique
        m1.put(40, "ABC");
        m1.put(5, "QWE");
        m1.put(50, "WWW");
        m1.put(10, "ABC");

//        m1.forEach((k,v) -> System.out.println(k + " " + v));
        System.out.println(m1);
    }

}

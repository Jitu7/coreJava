package example6;

import java.util.Set;
import java.util.TreeSet;

public class Example6 {

    /*
    TreeSet --> example of SOLID (Interface Segregation)
    In TreeSet sorting happens bashed either on Comparator that we provide
                            or
    by natural sorting defined by the object
     */
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>(); // ordered n sorted
        set1.add(10);
        set1.add(1000);
        set1.add(23);
        set1.add(300);
        set1.add(256);

        set1.forEach(System.out::println);
    }

}
